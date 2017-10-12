package com.application.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.application.R;
import com.application.adapter.DownloadAdapter;

/**
 * Created by NaRan on 10/9/17 at 08:00.
 */

public class Downloads extends Fragment {

    private RecyclerView recyclerViewDownloads;
    private DownloadAdapter downloadAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_others, container, false);
        initializeViews(view);
        initialiseListeners();
        setUpRecyclerView();


        return view;
    }

    private void initializeViews(View view) {
        recyclerViewDownloads = view.findViewById(R.id.recycler_view_downloads);

    }

    private void initialiseListeners() {
        downloadAdapter = new DownloadAdapter();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),3);
        recyclerViewDownloads.setLayoutManager(gridLayoutManager);
        recyclerViewDownloads.setAdapter(downloadAdapter);

        
    }

    private void setUpRecyclerView() {



        
    }
}
