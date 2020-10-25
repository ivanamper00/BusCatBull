package com.motkal.putbowl.controller.activity.fragments;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.motkal.putbowl.R;
import com.motkal.putbowl.adapter.LiveGamesAdapter;
import com.motkal.putbowl.controller.DataController;
import com.motkal.putbowl.database.LiveScoreApi;
import com.motkal.putbowl.database.MainApi;
import com.motkal.putbowl.model.LeagueModel;
import com.motkal.putbowl.model.LiveScoreModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LiveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LiveFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LiveFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LiveFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LiveFragment newInstance(String param1, String param2) {
        LiveFragment fragment = new LiveFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    DataController dataController;
    RecyclerView recyclerView;
    RelativeLayout relativeLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_live, container, false);
        dataController = new DataController(getContext());
        recyclerView = view.findViewById(R.id.live_recycler);
        relativeLayout = view.findViewById(R.id.progress_live_loading);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(llm);
        getLive();
        return view;
    }

    public void getLive(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(LiveScoreApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        LiveScoreApi api = retrofit.create(LiveScoreApi.class);
        Call<List<LiveScoreModel>> call = api.getLiveGames();

        call.enqueue(new Callback<List<LiveScoreModel>>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<List<LiveScoreModel>> call, retrofit2.Response<List<LiveScoreModel>> response) {
                List<LiveScoreModel> LiveScoreModel = response.body();

                LiveGamesAdapter adapter = new LiveGamesAdapter(getContext(),LiveScoreModel);
                recyclerView.setAdapter(adapter);
                relativeLayout.setVisibility(RelativeLayout.GONE);
            }
            @Override
            public void onFailure(Call<List<LiveScoreModel>> call, Throwable t) {
                Toast.makeText(getContext(),String.valueOf(t.getMessage()), Toast.LENGTH_SHORT).show();
            }
        });
    }
}