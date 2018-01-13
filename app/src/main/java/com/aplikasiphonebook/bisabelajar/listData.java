package com.aplikasiphonebook.bisabelajar;

/**
 * Created by Muchamat on 04/12/2017.
 */

public class listData {

    private String Title, Detail;
    private int Image;

    public listData(String title, String detail, int image) {
        Title = title;
        Detail = detail;
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public String getDetail() {
        return Detail;
    }

    public int getImage() {
        return Image;
    }
}


