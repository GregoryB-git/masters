/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  androidx.recyclerview.widget.RecyclerView
 *  java.lang.Object
 */
package com.hintsolutions.raintv.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class InterceptingRecyclerView
extends RecyclerView {
    public InterceptingRecyclerView(Context context) {
        super(context);
    }

    public InterceptingRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterceptingRecyclerView(Context context, AttributeSet attributeSet, int n4) {
        super(context, attributeSet, n4);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}

