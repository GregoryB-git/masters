/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  java.lang.Object
 */
package com.devbrackets.android.exomedia.ui.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.devbrackets.android.exomedia.ui.widget.VideoView;

public interface VideoControlsCore {
    public void finishLoading();

    public void hide(boolean var1);

    public boolean isVisible();

    public void onAttachedToView(@NonNull VideoView var1);

    public void onDetachedFromView(@NonNull VideoView var1);

    public void setDuration(@IntRange(from=0L) long var1);

    public void show();

    public void showLoading(boolean var1);

    public void updatePlaybackState(boolean var1);
}

