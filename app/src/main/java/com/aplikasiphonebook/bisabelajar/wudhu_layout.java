package com.aplikasiphonebook.bisabelajar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class wudhu_layout extends AppCompatActivity {

    RecyclerView recyclerView;
    WudhuViewAdapter adapter;
    List<VideoList> vList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wudhu_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setSubtitle("Belajar Bisa");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        vList        =   new ArrayList<>();

        recyclerView    =   (RecyclerView) findViewById(R.id.reView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        vList.add(
                new VideoList("Rukun-Rukun Wudhu", "Play", R.drawable.play, R.drawable.play_rukun_wudhu));
        vList.add(
                new VideoList("1. Niat Wudhu", "Play", R.drawable.play, R.drawable.play_niat_wudhu));
        vList.add(
                new VideoList("2. Membasuh Kedua Telapak Tangan", "Play", R.drawable.play, R.drawable.play_telapak_tangan));
        vList.add(
                new VideoList("3. Berkumur", "Play", R.drawable.play, R.drawable.play_berkumur));
        vList.add(
                new VideoList("4. Memasukkan Air ke Dalam Hidung", "Play", R.drawable.play, R.drawable.play_hidung));
        vList.add(
                new VideoList("5. Membasuh Wajah", "Play", R.drawable.play, R.drawable.play_basuh_wajah));
        vList.add(
                new VideoList("6. Membasuh Kedua Tangan Hingga Siku", "Play", R.drawable.play, R.drawable.play_kedua_tangan));
        vList.add(
                new VideoList("7. Mengusap Sebagian Kepala", "Play", R.drawable.play, R.drawable.play_usap_kepala));
        vList.add(
                new VideoList("8. Membasuh Kedua Telinga", "Play", R.drawable.play, R.drawable.play_telinga));
        vList.add(
                new VideoList("9. Membasuh Kedua Telapak Kaki", "Play", R.drawable.play, R.drawable.play_kedua_kaki));
        vList.add(
                new VideoList("10. Tertib Membaca Sesudah Berwudhu", "Play", R.drawable.play, R.drawable.play_tertib));

        adapter =   new WudhuViewAdapter(this, vList);
        recyclerView.setAdapter(adapter);

    }
}
