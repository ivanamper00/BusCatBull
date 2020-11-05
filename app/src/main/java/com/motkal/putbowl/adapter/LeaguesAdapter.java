package com.motkal.putbowl.adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;


import com.motkal.putbowl.R;
import com.motkal.putbowl.controller.DataController;
import com.motkal.putbowl.controller.activity.MainActivity;
import com.motkal.putbowl.model.LeagueModel;

import java.util.ArrayList;
import java.util.List;

public class LeaguesAdapter extends RecyclerView.Adapter<LeaguesAdapter.LeagueViewHolder> {
    CountDownTimer countDownTimer;
    DataController dataController;
    Context context;
    List<LeagueModel.League> LeagueList;
    LeagueModel.League league;
    public class LeagueViewHolder extends RecyclerView.ViewHolder {
        TextView leagueName;
        TextView leagueId;
        public LeagueViewHolder(@NonNull View itemView) {
            super(itemView);
            leagueName = itemView.findViewById(R.id.leagues);
            leagueId = itemView.findViewById(R.id.leagues_id);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    changeSeries(leagueId.getText().toString());
                }
            });
        }
    }

    public LeaguesAdapter (Context context, List<LeagueModel.League> LeagueList){
        this.LeagueList = LeagueList;
        this.context = context;
        dataController = new DataController(this.context);
    }

    @NonNull
    @Override
    public LeagueViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.league_list,parent,false);
        return new LeagueViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LeagueViewHolder holder, int position) {
        league = LeagueList.get(position);
        holder.leagueName.setText(league.getStrLeague());
        holder.leagueId.setText(league.getIdLeague());
    }

    @Override
    public int getItemCount() {
        return LeagueList.size();
    }

    public void updateList(ArrayList<LeagueModel.League> leagues){
        LeagueList = leagues;
        notifyDataSetChanged();
    }

    public void changeSeries(final String id){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this.context);
        alertDialog.setCancelable(false);
        alertDialog.setMessage("Do you want to change the series ?");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dataController.startLoading();
                dataController.setDefaultLeague(id);
                dataController.saveAllQueries();
                dataController.loop();
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alert = alertDialog.create();
        alert.show();
    }

}
