package com.aplikasiphonebook.bisabelajar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    List<listData> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataList        =   new ArrayList<>();

        recyclerView    =   (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataList.add(
                new listData("Belajar Mengenal Huruf Hija'iyah", "Klik Saya", R.drawable.hija_iyah_up));

        dataList.add(
                new listData("Belajar Cara Berwudhu", "Klik Saya", R.drawable.wudhu_up));

        dataList.add(
                new listData("Belajar Cara Sholat", "Klik Saya", R.drawable.sholat_pressed));

        dataList.add(
                new listData("Do'a Sehari-hari", "Klik Saya", R.drawable.berdoa_pressed));

        dataList.add(
                new listData("Kisah-Kisah Nabi", "Klik Saya", R.drawable.nabi_pressed));

        adapter =  new RecyclerViewAdapter(this, dataList);
        recyclerView.setAdapter(adapter);


    }
    public void gambar(View v){
        Intent it = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(it);
    }
}
