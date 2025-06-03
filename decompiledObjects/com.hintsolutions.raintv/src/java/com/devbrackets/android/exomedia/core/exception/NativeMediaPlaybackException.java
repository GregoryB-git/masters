/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.StringBuilder
 */
package com.devbrackets.android.exomedia.core.exception;

import android.media.MediaPlayer;

public class NativeMediaPlaybackException
extends Exception {
    public final int extra;
    public final int what;

    public NativeMediaPlaybackException(int n, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(MediaPlayer.class.getName());
        stringBuilder.append(" has had the error ");
        stringBuilder.append(n);
        stringBuilder.append(" with extras ");
        stringBuilder.append(n2);
        super(stringBuilder.toString());
        this.what = n;
        this.extra = n2;
    }
}

