package com.aplikasiphonebook.bisabelajar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class hijaiyah extends AppCompatActivity {

    RecyclerView recyclerView;
    HijaiyahViewAdapter adapter;
    List<VideoList> vList;
    private StaggeredGridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setSubtitle("Belajar Bisa");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        vList        =   new ArrayList<>();

        recyclerView    =   (RecyclerView) findViewById(R.id.reView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        vList.add(
                new VideoList("Upin & Ipin Mengaji", "Play", R.drawable.play, R.drawable.upin_ipin));

        adapter = new HijaiyahViewAdapter(this,vList);
        recyclerView.setAdapter(adapter);
    }
}
