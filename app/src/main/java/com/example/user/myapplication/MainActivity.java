package com.example.user.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.fab)
    FloatingActionButton fab;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ArrayList<ItemData> imagesList = new ArrayList<ItemData>();
        imagesList.add(new ItemData(R.drawable.image1, getResources().getString(R.string.label_title),
                getResources().getString(R.string.label_sub_title), getResources().getString(R.string.label_hrs)));
        imagesList.add(new ItemData(R.drawable.image2, "Summer surprise offer", "Rose petals", getResources().getString(R.string.label_hrs)));
        imagesList.add(new ItemData(R.drawable.image3, "Enjoy vaccations", "Boat House", getResources().getString(R.string.label_hrs)));
        imagesList.add(new ItemData(R.drawable.image4, "Coolest place visits", "Trecking camp", getResources().getString(R.string.label_hrs)));
        imagesList.add(new ItemData(R.drawable.image2, "Summer surprise offer", "Rose petals", getResources().getString(R.string.label_hrs)));
        imagesList.add(new ItemData(R.drawable.image3, "Enjoy vaccations", "Boat House", getResources().getString(R.string.label_hrs)));
        imagesList.add(new ItemData(R.drawable.image4, "Coolest place visits", "Trecking camp", getResources().getString(R.string.label_hrs)));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        mAdapter = new MyAdapter(getApplicationContext(), imagesList, (LinearLayoutManager)layoutManager);
        recyclerView.setAdapter(mAdapter);

    }


        @Override
        protected void onStart () {
        super.onStart();

    }

    }
