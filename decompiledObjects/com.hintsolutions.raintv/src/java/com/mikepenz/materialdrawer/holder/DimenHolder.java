/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.DimenRes
 *  androidx.annotation.Dimension
 *  java.lang.Object
 */
package com.mikepenz.materialdrawer.holder;

import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;

public class DimenHolder
extends com.mikepenz.materialize.holder.DimenHolder {
    public static DimenHolder fromDp(@Dimension(unit=0) int n) {
        DimenHolder dimenHolder = new DimenHolder();
        dimenHolder.setDp(n);
        return dimenHolder;
    }

    public static DimenHolder fromPixel(@Dimension(unit=1) int n) {
        DimenHolder dimenHolder = new DimenHolder();
        dimenHolder.setPixel(n);
        return dimenHolder;
    }

    public static DimenHolder fromResource(@DimenRes int n) {
        DimenHolder dimenHolder = new DimenHolder();
        dimenHolder.setResource(n);
        return dimenHolder;
    }
}

