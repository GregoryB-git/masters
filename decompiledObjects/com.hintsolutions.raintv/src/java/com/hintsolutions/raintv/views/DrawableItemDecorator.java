/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.DrawableRes
 *  androidx.recyclerview.widget.DividerItemDecoration
 *  java.lang.Object
 */
package com.hintsolutions.raintv.views;

import android.content.Context;
import androidx.annotation.DrawableRes;
import androidx.recyclerview.widget.DividerItemDecoration;

public class DrawableItemDecorator
extends DividerItemDecoration {
    public DrawableItemDecorator(Context context, int n4, @DrawableRes int n5) {
        super(context, n4);
        this.setDrawable(context.getResources().getDrawable(n5));
    }
}

