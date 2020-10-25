package com.motkal.putbowl.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.github.islamkhsh.CardSliderAdapter;
import com.motkal.putbowl.R;
import com.motkal.putbowl.model.EventsModel;

import java.util.List;

public class HighlightsAdapter extends CardSliderAdapter<HighlightsAdapter.HighlightsViewHolder> {
    Context context;
    List<EventsModel.Event> events;
    EventsModel.Event event;

    public class HighlightsViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;
        TextView date;
        TextView source;
        WebView vids;
        WebSettings webSettings;
        @SuppressLint("SetJavaScriptEnabled")
        public HighlightsViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.highlights_event_name);
            description = itemView.findViewById(R.id.highlights_description);
            date = itemView.findViewById(R.id.highlights_date);
            source = itemView.findViewById(R.id.highlights_source);
            vids = itemView.findViewById(R.id.highlights_vids);
            webSettings = vids.getSettings();
            webSettings.setJavaScriptEnabled(true);
            vids.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            vids.getSettings().setLoadWithOverviewMode(true);
            vids.getSettings().setUseWideViewPort(true);
        }
    }

    public HighlightsAdapter(Context context, List<EventsModel.Event> events){
        this.context = context;
        this.events = events;
    }

    @Override
    public void bindVH(HighlightsViewHolder holder, int position) {
        event = events.get(position);
        holder.title.setText(event.getStrEvent());
        holder.description.setText(event.getStrDescriptionEN());
        holder.date.setText(event.getDateEvent());
        if(event.getStrVideo() != null){
            if(event.getStrVideo().contains("youtube")){
                String embeded = event.getStrVideo().replace("watch?v=", "embed/");
                holder.vids.loadUrl(embeded);
                holder.source.setText("Source: youtube.com");
            }
        }else{
            holder.vids.loadUrl(event.getStrThumb());
        }
    }

    @NonNull
    @Override
    public HighlightsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.highlights_list,parent,false);
        return new HighlightsViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

}
