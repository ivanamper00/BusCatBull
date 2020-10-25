package com.motkal.putbowl.controller.activity.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.github.islamkhsh.CardSliderViewPager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.motkal.putbowl.R;
import com.motkal.putbowl.adapter.HighlightsAdapter;
import com.motkal.putbowl.adapter.UpcomingAdapter;
import com.motkal.putbowl.controller.DataController;
import com.motkal.putbowl.model.EventsModel;
import com.motkal.putbowl.model.UpcomingModel;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MatchesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MatchesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MatchesFragment() {

        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MatchesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MatchesFragment newInstance(String param1, String param2) {
        MatchesFragment fragment = new MatchesFragment();
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
    CardSliderViewPager recyclerViewHighlights;
    RecyclerView recyclerViewUpcoming;
    LinearLayout noData;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_matches, container, false);
        dataController = new DataController(getContext());
        recyclerViewHighlights = view.findViewById(R.id.highlights_card_slider);
        recyclerViewUpcoming = view.findViewById(R.id.upcoming_recycler);
        noData = view.findViewById(R.id.no_data);
        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        recyclerViewUpcoming.setLayoutManager(llm);

        List<EventsModel.Event> events = dataController.retrieveHighlights();

        if(events.size() != 0){
            noData.setVisibility(LinearLayout.GONE);
            HighlightsAdapter hAdapter = new HighlightsAdapter(getContext(),events);
            recyclerViewHighlights.setAdapter(hAdapter);
        }else{
            noData.setVisibility(LinearLayout.VISIBLE);
        }

        List<UpcomingModel.Event> upcoming = dataController.retrieveUpcoming();
        if(upcoming.size() != 0){
            UpcomingAdapter uAdapter = new UpcomingAdapter(getContext(), upcoming);
            recyclerViewUpcoming.setAdapter(uAdapter);
        }

        return view;
    }
}