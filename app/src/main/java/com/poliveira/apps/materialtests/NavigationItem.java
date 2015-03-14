package com.poliveira.apps.materialtests;

import android.graphics.drawable.Drawable;

/**
 * Created by poliveira on 24/10/2014.
 */
public class NavigationItem {
    private String mText;
    private Drawable mDrawable;
    private boolean mIsCurrent = false;

    public NavigationItem(String text, Drawable drawable) {
        mText = text;
        mDrawable = drawable;
    }
    public boolean getIsCurrent() {
        return mIsCurrent;
    }

    public void setIsCurrent(boolean isCurrent) {
        mIsCurrent = isCurrent;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Drawable getDrawable() {
        return mDrawable;
    }

    public void setDrawable(Drawable drawable) {
        mDrawable = drawable;
    }
}
