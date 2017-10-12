package com.application.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.application.R;

/**
 * Created by NaRan on 10/11/17 at 07:28.
 */

public class DownloadAdapter extends RecyclerView.Adapter<DownloadAdapter.ViewHolders> {

    @Override
    public DownloadAdapter.ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.download_list_row, parent, false);

        return new ViewHolders(itemView);
    }

    @Override
    public void onBindViewHolder(DownloadAdapter.ViewHolders holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolders extends RecyclerView.ViewHolder {
        public ViewHolders(View itemView) {
            super(itemView);
        }
    }
}
