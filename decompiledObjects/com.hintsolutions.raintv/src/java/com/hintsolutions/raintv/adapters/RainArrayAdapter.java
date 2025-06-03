/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.widget.ArrayAdapter
 *  java.lang.Math
 *  java.lang.Object
 */
package com.hintsolutions.raintv.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

public class RainArrayAdapter<T>
extends ArrayAdapter<T> {
    private static final int PAGE_ITEMS = 7;
    private int mPages = 1;

    public RainArrayAdapter(Context context, int n) {
        super(context, n);
    }

    public int getCount() {
        return Math.min((int)super.getCount(), (int)(this.mPages * 7));
    }

    public boolean showMore() {
        int n = this.mPages;
        boolean bl = true;
        this.mPages = n + 1;
        this.notifyDataSetChanged();
        if (this.mPages * 7 <= this.getCount()) {
            bl = false;
        }
        return bl;
    }
}

