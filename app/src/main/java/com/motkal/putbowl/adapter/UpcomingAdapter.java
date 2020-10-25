package com.motkal.putbowl.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.motkal.putbowl.R;
import com.motkal.putbowl.model.UpcomingModel;

import java.util.List;

public class UpcomingAdapter extends RecyclerView.Adapter<UpcomingAdapter.UpcomingViewHolder> {
    Context context;
    List<UpcomingModel.Event> events;
    UpcomingModel.Event event;
    public static class UpcomingViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView description;
        TextView date;
        @SuppressLint("SetJavaScriptEnabled")
        public UpcomingViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.upcoming_title);
            description = itemView.findViewById(R.id.upcoming_description);
            date = itemView.findViewById(R.id.upcoming_date);
        }
    }

    public UpcomingAdapter(Context context, List<UpcomingModel.Event> events){
        this.context = context;
        this.events = events;
    }
    @NonNull
    @Override
    public UpcomingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.upcoming_list,parent,false);
        return new UpcomingViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull UpcomingViewHolder holder, int position) {
        event = events.get(position);
        holder.title.setText(event.getStrEvent());
        holder.description.setText("League:\t" + event.getStrLeague() + "\nVenue:\t" + event.getStrVenue());
        holder.date.setText(event.getDateEvent() + " " + converted(event.getStrTime()));
//        String embeded = event.getStrVideo().replace("watch?v=", "embed/");
//        holder.vids.loadUrl(embeded);
    }

    @Override
    public int getItemCount() {
        return events.size();
    }

    public String converted(String time){
        String cleanTime = time.substring(0,time.length()-3);
        String spliceTime = cleanTime.substring(2);
        int hour = Integer.parseInt(time.substring(0,2));
        String newTime = "";
        if(hour > 12){
            hour -= 12;
            newTime = Integer.toString(hour) + spliceTime + "PM";
        }else if(hour == 12){
            newTime = cleanTime + "NN";
        }else if(hour == 0){
            newTime = cleanTime + "MN";
        }else{
            newTime = cleanTime + "AM";
        }
        return newTime ;
    }


}
