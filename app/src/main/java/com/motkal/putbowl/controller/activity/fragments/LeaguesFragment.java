package com.motkal.putbowl.controller.activity.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.motkal.putbowl.R;
import com.motkal.putbowl.adapter.LeaguesAdapter;
import com.motkal.putbowl.controller.DataController;
import com.motkal.putbowl.model.LeagueModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LeaguesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LeaguesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LeaguesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LeaguesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LeaguesFragment newInstance(String param1, String param2) {
        LeaguesFragment fragment = new LeaguesFragment();
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
    EditText search;
    LeaguesAdapter adapter;
    List<LeagueModel.League> leagues;
    ImageView closeSearch;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_leagues, container, false);
        dataController = new DataController(getContext());
        recyclerView = view.findViewById(R.id.leagues_recycler);
        closeSearch = view.findViewById(R.id.close_search);
        closeSearch.setVisibility(View.GONE);
        search = view.findViewById(R.id.search_leagues);
        GridLayoutManager grid = new GridLayoutManager(getContext(),1, GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(grid);

        leagues = dataController.retrieveLeagues();
        adapter = new LeaguesAdapter(getContext(), leagues);
        recyclerView.setAdapter(adapter);

        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                search(s.toString());
                 if(s.length() > 0){
                     closeSearch.setVisibility(View.VISIBLE);
                 }else{
                     closeSearch.setVisibility(View.GONE);
                 }
            }
        });

        closeSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeSearch.setVisibility(View.GONE);
                search("");
                search.setText("");
            }
        });


        return view;
    }

    public void search(String query){
        ArrayList<LeagueModel.League> searchLeagues = new ArrayList<>();
        for(LeagueModel.League result : leagues){
            if (result.getStrLeague().toLowerCase().contains(query.toLowerCase())){
                searchLeagues.add(result);
            }
        }
        adapter.updateList(searchLeagues);
    }
}