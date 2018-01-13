package com.aplikasiphonebook.bisabelajar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Doa_Layout extends AppCompatActivity {

    RecyclerView recyclerView;
    DoaViewAdapter adapter;
    List<VideoList> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa__layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setSubtitle("Belajar Bisa");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataList        =   new ArrayList<>();

        recyclerView    =   (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataList.add(
                new VideoList("1. Do'a Sebelum Makan", "Play", R.drawable.play, R.drawable.play_sebelum_makan));
        dataList.add(
                new VideoList("2. Do'a Sesudah Makan", "Play", R.drawable.play, R.drawable.play_sesudah_makan));
        dataList.add(
                new VideoList("3. Do'a Sebelum Tidur", "Play", R.drawable.play, R.drawable.play_sebelum_tidur));
        dataList.add(
                new VideoList("4. Do'a Bangun Tidur", "Play", R.drawable.play, R.drawable.play_bangun_tidur));
        dataList.add(
                new VideoList("5. Do'a Sebelum Belajar", "Play", R.drawable.play, R.drawable.play_sebelum_belajar));
        dataList.add(
                new VideoList("6. Do'a Sesudah Belajar", "Play", R.drawable.play, R.drawable.play_sesudah_belajar));
        dataList.add(
                new VideoList("7. Do'a Untuk Orang Tua", "Play", R.drawable.play, R.drawable.play_orang_tua));

        adapter =   new DoaViewAdapter(this, dataList);
        recyclerView.setAdapter(adapter);

    }
}
