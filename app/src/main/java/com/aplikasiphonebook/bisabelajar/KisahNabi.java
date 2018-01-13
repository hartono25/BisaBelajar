package com.aplikasiphonebook.bisabelajar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class KisahNabi extends AppCompatActivity {

    RecyclerView recyclerView;
    NabiViewAdapter adapter;
    List<VideoList> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_nabi);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setSubtitle("Belajar Bisa");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataList        =   new ArrayList<>();

        recyclerView    =   (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataList.add(
                new VideoList("Kisah Nabi Adam AS", "Play", R.drawable.play, R.drawable.play_nabi_adam));

        adapter =   new NabiViewAdapter(this, dataList);
        recyclerView.setAdapter(adapter);

    }
}
