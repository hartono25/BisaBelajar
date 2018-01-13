package com.aplikasiphonebook.bisabelajar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayer extends AppCompatActivity {

    VideoView videoV;
    MediaController mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);


        videoV = (VideoView)findViewById(R.id.videoView);
        mc     = new MediaController(this);

        Intent intent = getIntent();
        String title = intent.getStringExtra("posisi");

        switch (title){
            case "Rukun-Rukun Wudhu":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.rukun_wudhu));

                break;
            case "1. Niat Wudhu":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.niat_wudhu));

                break;
            case "2. Membasuh Kedua Telapak Tangan":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.basuh_telapak_tangan));

                break;
            case "3. Berkumur":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.berkumur_));

                break;
            case "4. Memasukkan Air ke Dalam Hidung":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.memasukan_air_kehidung));

                break;
            case "5. Membasuh Wajah":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.membasuh_wajah));

                break;
            case "6. Membasuh Kedua Tangan Hingga Siku":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.membasuh_kedua_tangan));

                break;
            case "7. Mengusap Sebagian Kepala":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.mengusap_kepala));

                break;
            case "8. Membasuh Kedua Telinga":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.membasuh_telinga));

                break;
            case "9. Membasuh Kedua Telapak Kaki":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.membasuh_kaki));

                break;
            case "10. Tertib Membaca Sesudah Berwudhu":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.tertib_));

                break;
            case "Rukun-Rukun Sholat":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.rukun_sholat));

                break;
            case "1. Niat Sholat":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.niat_sholat1));

                break;
            case "2. Takbiratul Ihram":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.takbir2));

                break;
            case "3. Membaca Iftitah":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.iftitah3));

                break;
            case "4. Membaca Surat Al-Fatihah":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.al_fatihah4));

                break;
            case "5. Membaca Surat AL-Quran":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.baca_surat5));

                break;
            case "6. Ruku'":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.ruku6));

                break;
            case "7. I'tidal":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.itidal7));

                break;
            case "8. Sujud Pertama":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.sujud8));

                break;
            case "9. Duduk Di Antara Dua Sujud":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.duduk_antara_dua_sujud9));

                break;
            case "10. Sujud Kedua":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.sujud_kedua10));

                break;
            case "Kisah Nabi Adam AS":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.nabi_adam_as));

                break;
            case "1. Do'a Sebelum Makan":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.sebelum_makan));

                break;
            case "2. Do'a Sesudah Makan":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.sesudah_makan));

                break;
            case "3. Do'a Sebelum Tidur":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.sebelum_tidur));

                break;
            case "4. Do'a Bangun Tidur":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.bangun_tidur));

                break;
            case "5. Do'a Sebelum Belajar":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.sebelum_belajar));

                break;
            case "6. Do'a Sesudah Belajar":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.sesudah_belajar));

                break;
            case "7. Do'a Untuk Orang Tua":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.untuk_orang_tua));

                break;
            case "Upin & Ipin Mengaji":
                videoV.setVideoURI(Uri.parse("android.resource://com.aplikasiphonebook.bisabelajar/"+R.raw.upin_ipin));

                break;
            default:
                break;
        }
        videoV.setMediaController(mc);
        mc.setAnchorView(videoV);
        videoV.start();

        videoV.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                VideoPlayer.this.finish();
            }
        });
    }
}
