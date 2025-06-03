/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  androidx.annotation.NonNull
 *  androidx.viewpager.widget.ViewPager
 *  androidx.viewpager.widget.ViewPager$OnPageChangeListener
 *  com.stfalcon.frescoimageviewer.MultiTouchViewPager$1
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 */
package com.stfalcon.frescoimageviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.stfalcon.frescoimageviewer.MultiTouchViewPager;

public class MultiTouchViewPager
extends ViewPager {
    private boolean isDisallowIntercept;
    private boolean isScrolled = true;

    public MultiTouchViewPager(Context context) {
        super(context);
        this.setScrollStateListener();
    }

    public MultiTouchViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setScrollStateListener();
    }

    public static /* synthetic */ boolean access$002(MultiTouchViewPager multiTouchViewPager, boolean bl) {
        multiTouchViewPager.isScrolled = bl;
        return bl;
    }

    private void setScrollStateListener() {
        this.addOnPageChangeListener((ViewPager.OnPageChangeListener)new 1(this));
    }

    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1 && this.isDisallowIntercept) {
            this.requestDisallowInterceptTouchEvent(false);
            boolean bl = super.dispatchTouchEvent(motionEvent);
            this.requestDisallowInterceptTouchEvent(true);
            return bl;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean isScrolled() {
        return this.isScrolled;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        try {
            boolean bl = super.onInterceptTouchEvent(motionEvent);
            return bl;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            boolean bl = super.onTouchEvent(motionEvent);
            return bl;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean bl) {
        this.isDisallowIntercept = bl;
        super.requestDisallowInterceptTouchEvent(bl);
    }
}

