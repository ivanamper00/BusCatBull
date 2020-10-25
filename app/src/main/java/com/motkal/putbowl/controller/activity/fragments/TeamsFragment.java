package com.motkal.putbowl.controller.activity.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.github.islamkhsh.CardSliderViewPager;
import com.motkal.putbowl.R;
import com.motkal.putbowl.adapter.TeamsAdapter;
import com.motkal.putbowl.controller.DataController;
import com.motkal.putbowl.model.TeamsModel;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TeamsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TeamsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TeamsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TeamsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TeamsFragment newInstance(String param1, String param2) {
        TeamsFragment fragment = new TeamsFragment();
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
    public static RecyclerView recyclerView;
    public static LinearLayoutManager llm;
    LinearLayout noData;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_teams, container, false);
        dataController = new DataController(getContext());
        recyclerView = view.findViewById(R.id.teams_recycler);
        noData = view.findViewById(R.id.no_data);
         llm = new LinearLayoutManager(getContext());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        List<TeamsModel.Teams> teamModel = dataController.retrieveTeams();
        if(teamModel.size() != 0){
            noData.setVisibility(LinearLayout.GONE);
            TeamsAdapter adapter = new TeamsAdapter(getContext(),teamModel);
            recyclerView.setAdapter(adapter);
        }else{
            noData.setVisibility(LinearLayout.VISIBLE);
        }

        return view;
    }
}