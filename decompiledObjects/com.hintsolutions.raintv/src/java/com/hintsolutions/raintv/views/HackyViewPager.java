/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  androidx.viewpager.widget.ViewPager
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 */
package com.hintsolutions.raintv.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class HackyViewPager
extends ViewPager {
    private boolean isLocked = false;

    public HackyViewPager(Context context) {
        super(context);
    }

    public HackyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean isLocked() {
        return this.isLocked;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.isLocked) return false;
        try {
            return super.onInterceptTouchEvent(motionEvent);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl = !this.isLocked && super.onTouchEvent(motionEvent);
        return bl;
    }

    public void setLocked(boolean bl) {
        this.isLocked = bl;
    }

    public void toggleLock() {
        this.isLocked ^= true;
    }
}

