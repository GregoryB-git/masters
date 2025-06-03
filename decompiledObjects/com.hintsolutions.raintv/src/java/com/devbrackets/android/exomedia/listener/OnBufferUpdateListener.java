/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.IntRange
 *  java.lang.Object
 */
package com.devbrackets.android.exomedia.listener;

import androidx.annotation.IntRange;

public interface OnBufferUpdateListener {
    public void onBufferingUpdate(@IntRange(from=0L, to=100L) int var1);
}

