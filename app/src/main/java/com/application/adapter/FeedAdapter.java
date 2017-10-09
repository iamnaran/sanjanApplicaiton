package com.application.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.application.R;
import com.application.model.Feed;

import java.util.List;

/**
 * Created by NaRan on 10/9/17 at 08:30.
 */

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.ViewHolders> {

    private Context context;
    private List<Feed> feedList;
    private int lastPosition = -1;


    @Override
    public FeedAdapter.ViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_list_row, parent, false);

        return new ViewHolders(itemView);    }

    @Override
    public void onBindViewHolder(FeedAdapter.ViewHolders holder, int position) {

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
