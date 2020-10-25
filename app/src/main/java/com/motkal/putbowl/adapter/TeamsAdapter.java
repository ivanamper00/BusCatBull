package com.motkal.putbowl.adapter;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.motkal.putbowl.R;
import com.motkal.putbowl.controller.DataController;
import com.motkal.putbowl.controller.activity.fragments.TeamsFragment;
import com.motkal.putbowl.model.TeamsModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapter.TeamsViewHolder> {
    DataController dataController;
    Dialog dialog;
    Context context;
    List<TeamsModel.Teams> teamsList;
    TeamsModel.Teams team;
    TeamsModel.Teams teamDialog;
    String item = "";
    public class TeamsViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        TextView teamName;
        TextView teamId;
        ImageView teamImage;

        public TeamsViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayout = itemView.findViewById(R.id.team_show);
            teamId= itemView.findViewById(R.id.team_id);
            teamName = itemView.findViewById(R.id.team_name);
            teamImage = itemView.findViewById(R.id.team_logo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    setItem(teamId.getText().toString());
                    dialog = new Dialog(context);
                    dialog.setContentView(R.layout.team_data_dialog);
                    dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    dialog.show();
                    showData();

//                notifyDataSetChanged();
//                if(!getItem().isEmpty()){
//                    if(getItem().equalsIgnoreCase(teamId.getText().toString())){
//                        setItem("");
//                    }else{
//                        setItem(teamId.getText().toString());
//
//                    }
//                }else{
//                    setItem(teamId.getText().toString());
//                }

                }
            });
        }
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public TeamsAdapter(Context context, List<TeamsModel.Teams> teamsList){
        this.context = context;
        this.dataController = new DataController(context);
        this.teamsList = teamsList;
    }

    @NonNull
    @Override
    public TeamsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.teams_list,parent,false);
        return new TeamsViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final TeamsViewHolder holder, final int position) {

            team = teamsList.get(position);
            holder.teamId.setText(team.getIdTeam());
            holder.teamName.setText(team.getStrTeam() + " / " + team.getStrStadium());
            Picasso.get().load(team.getStrTeamBadge()).into(holder.teamImage);

//        holder.linearLayout.setVisibility(LinearLayout.GONE);
//        if(teamsList.get(position).getIdTeam().equals(getItem())){
//            holder.linearLayout.setVisibility(LinearLayout.VISIBLE);
//            TeamsFragment.recyclerView.smoothScrollToPosition(position);
//        }else{
//            holder.linearLayout.setVisibility(LinearLayout.GONE);
//        }

    }



    @Override
    public int getItemCount() {
        return teamsList.size();
    }

//    @Override
//    public void onViewAttachedToWindow(TeamsAdapter.TeamsViewHolder holder) {
////        Log.e(TAG, "onViewAttachedToWindow position " + holder.getLayoutPosition()+" suppose to be seen "+holder.getLayoutPosition()+" ℃" );
////        viewHolder.degree.setText(holder.getLayoutPosition()+" ℃");
//
//        if(holder.linearLayout.getVisibility() == LinearLayout.VISIBLE){
//            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " + holder.linearLayout.getVisibility() + "==" + LinearLayout.VISIBLE);
//            holder.linearLayout.requestFocus();
//        }
//    }

    public void showData(){
        TextView stadiumName;
        ImageView banner;
        TextView teamDescription;
        TextView teamDescription1;
        ImageView stadium;
        TextView stadiumDescription;
        TextView stadiumDescription1;
        ImageView teamJersey;
        final ProgressBar bannerProgress;
        final ProgressBar jerseyProgress;
        CardView close;

        banner = dialog.findViewById(R.id.team_banner);
        teamDescription = dialog.findViewById(R.id.team_description);
        teamDescription1 = dialog.findViewById(R.id.team_description1);
        stadium = dialog.findViewById(R.id.team_stadium);
        stadiumDescription = dialog.findViewById(R.id.team_stadium_description);
        stadiumDescription1 = dialog.findViewById(R.id.team_stadium_description1);
        teamJersey = dialog.findViewById(R.id.team_jersey);
        stadiumName = dialog.findViewById(R.id.team_stadium_name);
        close = dialog.findViewById(R.id.team_dialog_close);


        bannerProgress = dialog.findViewById(R.id.banner_progress);
        jerseyProgress = dialog.findViewById(R.id.jersey_progress);

        for(int i = 0; i < teamsList.size(); i++){
            if(teamsList.get(i).getIdTeam().equalsIgnoreCase(getItem())){
                teamDialog = teamsList.get(i);
                String strStadium = teamDialog.getStrStadiumDescription();
                String strDescription = teamDialog.getStrDescriptionEN();
                stadiumName.setText(teamDialog.getStrStadium());
                teamDescription.setText(cleanFirst(strDescription));
                teamDescription1.setText(cleanSecond(strDescription));
                stadiumDescription.setText(cleanFirst(strStadium));
                stadiumDescription1.setText(cleanSecond(strStadium));

                Glide.with(context)
                        .load(teamDialog.getStrTeamLogo())
                        .listener(new RequestListener<String, GlideDrawable>() {
                            @Override
                            public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                                bannerProgress.setVisibility(View.VISIBLE);
                                return false;
                            }
                            @Override
                            public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                                bannerProgress.setVisibility(View.GONE);
                                return false;
                            }
                        })
                        .into(banner);

//        Glide.with(context).load(team.getStrStadiumThumb()).into(holder.stadium);
                Picasso.get().load(teamDialog.getStrStadiumThumb()).into(stadium);

                Glide.with(context)
                        .load(teamDialog.getStrTeamJersey())
                        .listener(new RequestListener<String, GlideDrawable>() {
                            @Override
                            public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                                jerseyProgress.setVisibility(View.VISIBLE);
                                return false;
                            }
                            @Override
                            public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                                jerseyProgress.setVisibility(View.GONE);
                                return false;
                            }
                        })
                        .into(teamJersey);


                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }
        }
    }

    public String cleanFirst(String string){
        String newStr = string;
        if(string == null){
            return "No Details Available";
        }else if(string.length() < 300){
            return newStr;
        }else{
                newStr = string.substring(0,300);
        }
        return newStr;
    }

    public String cleanSecond(String string){
        String newStr = string;

        if(string == null){
            return "";
        }else if(newStr.length() < 300){
            return "";
        }else{
            newStr = string.substring(300);
        }
        return newStr;

    }


}
