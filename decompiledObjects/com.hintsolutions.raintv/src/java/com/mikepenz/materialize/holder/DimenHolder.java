/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.DimenRes
 *  java.lang.Integer
 *  java.lang.Object
 */
package com.mikepenz.materialize.holder;

import android.content.Context;
import androidx.annotation.DimenRes;
import com.mikepenz.materialize.util.UIUtils;

public class DimenHolder {
    private int mDp;
    private int mPixel = Integer.MIN_VALUE;
    private int mResource;

    public DimenHolder() {
        this.mDp = Integer.MIN_VALUE;
        this.mResource = Integer.MIN_VALUE;
    }

    public static DimenHolder fromDp(int n) {
        DimenHolder dimenHolder = new DimenHolder();
        dimenHolder.mDp = n;
        return dimenHolder;
    }

    public static DimenHolder fromPixel(int n) {
        DimenHolder dimenHolder = new DimenHolder();
        dimenHolder.mPixel = n;
        return dimenHolder;
    }

    public static DimenHolder fromResource(@DimenRes int n) {
        DimenHolder dimenHolder = new DimenHolder();
        dimenHolder.mResource = n;
        return dimenHolder;
    }

    public int asPixel(Context context) {
        int n = this.mPixel;
        if (n != Integer.MIN_VALUE) {
            return n;
        }
        n = this.mDp;
        if (n != Integer.MIN_VALUE) {
            return (int)UIUtils.convertDpToPixel(n, context);
        }
        if (this.mResource != Integer.MIN_VALUE) {
            return context.getResources().getDimensionPixelSize(this.mResource);
        }
        return 0;
    }

    public int getDp() {
        return this.mDp;
    }

    public int getPixel() {
        return this.mPixel;
    }

    public int getResource() {
        return this.mResource;
    }

    public void setDp(int n) {
        this.mDp = n;
    }

    public void setPixel(int n) {
        this.mPixel = n;
    }

    public void setResource(int n) {
        this.mResource = n;
    }
}

