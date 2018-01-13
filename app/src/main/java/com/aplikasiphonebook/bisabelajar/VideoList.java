package com.aplikasiphonebook.bisabelajar;

/**
 * Created by Muchamat on 06/12/2017.
 */

public class VideoList {

    private String Title, Detail;
    private int Image, ImageVideo;

    public VideoList(String title, String detail, int image, int imageVideo) {
        Title = title;
        Detail = detail;
        Image = image;
        ImageVideo = imageVideo;
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

    public int getImageVideo() {
        return ImageVideo;
    }
}
