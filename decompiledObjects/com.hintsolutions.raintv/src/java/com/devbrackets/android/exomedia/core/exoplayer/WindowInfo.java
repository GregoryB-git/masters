/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.android.exoplayer2.Timeline$Window
 *  java.lang.Object
 */
package com.devbrackets.android.exomedia.core.exoplayer;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Timeline;

public class WindowInfo {
    @NonNull
    public final Timeline.Window currentWindow;
    public final int currentWindowIndex;
    public final int nextWindowIndex;
    public final int previousWindowIndex;

    public WindowInfo(int n, int n2, int n3, @NonNull Timeline.Window window) {
        this.previousWindowIndex = n;
        this.currentWindowIndex = n2;
        this.nextWindowIndex = n3;
        this.currentWindow = window;
    }
}

