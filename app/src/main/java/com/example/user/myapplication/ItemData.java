package com.example.user.myapplication;

/**
 * Created by Jinsi K on 12/22/2017.
 */


public class ItemData {

    private int image;
    private String title;
    private String subTitle;
    private String time;

    public ItemData(int image, String title, String subTitle, String time) {

        this.image = image;
        this.title = title;
        this.subTitle = subTitle;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemData{");
        sb.append("image='").append(image).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", subTitle='").append(subTitle).append('\'');
        sb.append(", time='").append(time).append('\'');
        sb.append('}');
        return sb.toString();
    }
}