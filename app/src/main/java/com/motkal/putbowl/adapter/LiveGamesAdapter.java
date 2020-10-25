package com.motkal.putbowl.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.motkal.putbowl.R;
import com.motkal.putbowl.model.LiveScoreModel;

import java.util.List;

public class LiveGamesAdapter extends RecyclerView.Adapter<LiveGamesAdapter.LiveGamesViewHolder> {
    Context context;
    List<LiveScoreModel> events;
    LiveScoreModel event;
    public static class LiveGamesViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;
        TextView date;
        WebView vids;
        @SuppressLint("SetJavaScriptEnabled")
        public LiveGamesViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.live_games_title);
            description = itemView.findViewById(R.id.live_games_competition_name);
            date = itemView.findViewById(R.id.live_games_date);
            vids = itemView.findViewById(R.id.live_games_vids);
            vids.getSettings().setJavaScriptEnabled(true);
        }
    }

    public LiveGamesAdapter(Context context, List<LiveScoreModel>  events){
        this.context = context;
        this.events = events;
    }
    @NonNull
    @Override
    public LiveGamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.live_game_list,parent,false);
        return new LiveGamesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LiveGamesViewHolder holder, int position) {
        event = events.get(position);
        holder.title.setText(event.getTitle());
        holder.description.setText(event.getCompetition().getName());
        holder.date.setText(event.getDate());
        String embeded = event.getEmbed();
        holder.vids.loadData(embeded, "text/html", "UTF-8");
    }

    @Override
    public int getItemCount() {
        return events.size();
    }


}
