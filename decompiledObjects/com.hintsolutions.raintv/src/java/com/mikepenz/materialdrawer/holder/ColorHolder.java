/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  java.lang.Object
 */
package com.mikepenz.materialdrawer.holder;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;

public class ColorHolder
extends com.mikepenz.materialize.holder.ColorHolder {
    public static ColorHolder fromColor(@ColorInt int n) {
        ColorHolder colorHolder = new ColorHolder();
        colorHolder.setColorInt(n);
        return colorHolder;
    }

    public static ColorHolder fromColorRes(@ColorRes int n) {
        ColorHolder colorHolder = new ColorHolder();
        colorHolder.setColorRes(n);
        return colorHolder;
    }
}

