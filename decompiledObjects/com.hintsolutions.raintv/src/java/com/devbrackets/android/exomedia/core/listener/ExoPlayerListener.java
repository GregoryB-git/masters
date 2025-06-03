/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 */
package com.devbrackets.android.exomedia.core.listener;

import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.listener.OnSeekCompletionListener;

public interface ExoPlayerListener
extends OnSeekCompletionListener {
    public void onError(ExoMediaPlayer var1, Exception var2);

    public void onStateChanged(boolean var1, int var2);

    public void onVideoSizeChanged(int var1, int var2, int var3, float var4);
}

