package com.example.tourguide;

public class Word {

    private String top;
    private String bottom;
    private static int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mMediaPlayerId;

    public Word(String top, String bottom) {
        this.bottom = bottom;
        this.top = top;
    }

    public Word(String top, String bottom, int ImageResourceId) {
        this.top = top;
        this.bottom = bottom;
        mImageResourceId = ImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getBottom() {
        return bottom;
    }

    public String getTop() {
        return top;
    }
}
