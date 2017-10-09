package com.application.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.application.R;
import com.application.adapter.FeedAdapter;

/**
 * Created by NaRan on 10/9/17 at 08:01.
 */

public class PostFeeds extends Fragment {

    private RecyclerView recyclerViewFeeds;
    private FeedAdapter feedAdapter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_feeds, container, false);
        initializeViews(view);
        initialiseListeners();
        setUpRecyclerView();
        return view;
    }

    private void initializeViews(View view) {
        recyclerViewFeeds = view.findViewById(R.id.recycler_view_feeds);


    }

    private void initialiseListeners() {
    }

    private void setUpRecyclerView() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerViewFeeds.setLayoutManager(layoutManager);
        feedAdapter = new FeedAdapter();
        recyclerViewFeeds.setAdapter(feedAdapter);

    }


}
