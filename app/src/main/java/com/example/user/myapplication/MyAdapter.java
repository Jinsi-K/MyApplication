package com.example.user.myapplication;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Jinsi K on 12/22/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private ArrayList<ItemData> itemDataArrayList;
    private Context context;
    private int selectedPos = 0;
    private LinearLayoutManager layoutManager;

    public MyAdapter(Context context, ArrayList<ItemData> itemDataArrayList, LinearLayoutManager layoutManager) {
        this.context = context;
        this.itemDataArrayList = itemDataArrayList;
        this.layoutManager = layoutManager;

    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        // to set the values from list to display UI
        viewHolder.imgPic.setImageResource(itemDataArrayList.get(i).getImage());
        viewHolder.tvImageTitle.setText(itemDataArrayList.get(i).getTitle());
        viewHolder.tvImageSubTitle.setText(itemDataArrayList.get(i).getSubTitle());
        viewHolder.tvHoursCount.setText(itemDataArrayList.get(i).getTime());
        viewHolder.itemView.setSelected(selectedPos == i);
        int firstVisiblePosition = layoutManager.findFirstVisibleItemPosition();
        Log.i("", "firstVisiblePosition==" + firstVisiblePosition);
        /*if(firstVisiblePosition == i){
            viewHolder.rlImage.setVisibility(View.VISIBLE);
            viewHolder.flFav.setVisibility(View.VISIBLE);
        }
        else{
            viewHolder.rlImage.setVisibility(View.GONE);
            viewHolder.flFav.setVisibility(View.GONE);

        }*/
    }

    @Override
    public int getItemCount() {
        return itemDataArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPic;
        TextView tvImageTitle;
        TextView tvImageSubTitle;
        TextView tvHoursCount;
        RelativeLayout rlImage;
        FrameLayout flFav;

        public ViewHolder(View view) {
            super(view);

            imgPic = (ImageView) view.findViewById(R.id.ivImage);
            tvImageTitle = (TextView) view.findViewById(R.id.tvImageTitle);
            tvImageSubTitle = (TextView) view.findViewById(R.id.tvImageSubTitle);
            tvHoursCount = (TextView) view.findViewById(R.id.tvHoursCount);
            rlImage = (RelativeLayout) view.findViewById(R.id.rlImage);
            flFav = (FrameLayout) view.findViewById(R.id.flFav);

        }
    }


}
