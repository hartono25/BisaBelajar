package com.aplikasiphonebook.bisabelajar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class sholat_layout extends AppCompatActivity {

    RecyclerView recyclerView;
    SholatViewAdapter adapter;
    List<VideoList> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setSubtitle("Belajar Bisa");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataList        =   new ArrayList<>();

        recyclerView    =   (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataList.add(
                new VideoList("Rukun-Rukun Sholat", "Play", R.drawable.play, R.drawable.play_rukun_sholat));
        dataList.add(
                new VideoList("1. Niat Sholat", "Play", R.drawable.play, R.drawable.play_niat_sholat));
        dataList.add(
                new VideoList("2. Takbiratul Ihram", "Play", R.drawable.play, R.drawable.play_takbir));
        dataList.add(
                new VideoList("3. Membaca Iftitah", "Play", R.drawable.play, R.drawable.play_takbir));
        dataList.add(
                new VideoList("4. Membaca Surat Al-Fatihah", "Play", R.drawable.play, R.drawable.play_al_fatihah));
        dataList.add(
                new VideoList("5. Membaca Surat AL-Quran", "Play", R.drawable.play, R.drawable.play_baca_surat));
        dataList.add(
                new VideoList("6. Ruku'", "Play", R.drawable.play, R.drawable.play_ruku));
        dataList.add(
                new VideoList("7. I'tidal", "Play", R.drawable.play, R.drawable.play_itidal));
        dataList.add(
                new VideoList("8. Sujud Pertama", "Play", R.drawable.play, R.drawable.play_sujud_pertama));
        dataList.add(
                new VideoList("9. Duduk Di Antara Dua Sujud", "Play", R.drawable.play, R.drawable.play_duduk));
        dataList.add(
                new VideoList("10. Sujud Kedua", "Play", R.drawable.play, R.drawable.play_sujud_kedua));

        adapter =   new SholatViewAdapter(this, dataList);
        recyclerView.setAdapter(adapter);

    }
}
