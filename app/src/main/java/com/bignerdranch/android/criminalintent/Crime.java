package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by Sarah on 2/1/2016.
 * Mobile Ubiquitous Computing - Tutorial UI Fragment
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime(){
        //Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
