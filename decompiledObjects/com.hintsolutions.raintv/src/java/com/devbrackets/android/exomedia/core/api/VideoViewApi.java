/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.view.View$OnTouchListener
 *  androidx.annotation.FloatRange
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.drm.MediaDrmCallback
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.TrackGroupArray
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.util.Map
 */
package com.devbrackets.android.exomedia.core.api;

import android.net.Uri;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.CaptionListener;
import com.devbrackets.android.exomedia.core.video.scale.ScaleType;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public interface VideoViewApi {
    public void clearSelectedTracks(@NonNull ExoMedia.RendererType var1);

    @Nullable
    public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks();

    @IntRange(from=0L, to=100L)
    public int getBufferedPercent();

    @IntRange(from=0L)
    public long getCurrentPosition();

    @IntRange(from=0L)
    public long getDuration();

    public int getHeight();

    public float getPlaybackSpeed();

    @NonNull
    public ScaleType getScaleType();

    public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType var1, int var2);

    @FloatRange(from=0.0, to=1.0)
    public float getVolume();

    public int getWidth();

    @Nullable
    public WindowInfo getWindowInfo();

    public boolean isPlaying();

    public boolean isRendererEnabled(@NonNull ExoMedia.RendererType var1);

    public void onVideoSizeChanged(int var1, int var2, float var3);

    public void pause();

    public void release();

    public boolean restart();

    public void seekTo(@IntRange(from=0L) long var1);

    public void setCaptionListener(@Nullable CaptionListener var1);

    public void setDrmCallback(@Nullable MediaDrmCallback var1);

    public void setListenerMux(ListenerMux var1);

    public void setMeasureBasedOnAspectRatioEnabled(boolean var1);

    public void setOnTouchListener(View.OnTouchListener var1);

    public boolean setPlaybackSpeed(float var1);

    public void setRendererEnabled(@NonNull ExoMedia.RendererType var1, boolean var2);

    public void setRepeatMode(int var1);

    public void setScaleType(@NonNull ScaleType var1);

    @Deprecated
    public void setTrack(@NonNull ExoMedia.RendererType var1, int var2);

    public void setTrack(@NonNull ExoMedia.RendererType var1, int var2, int var3);

    public void setVideoRotation(@IntRange(from=0L, to=359L) int var1, boolean var2);

    public void setVideoUri(@Nullable Uri var1);

    public void setVideoUri(@Nullable Uri var1, @Nullable MediaSource var2);

    public boolean setVolume(@FloatRange(from=0.0, to=1.0) float var1);

    public void start();

    public void stopPlayback(boolean var1);

    public void suspend();

    public boolean trackSelectionAvailable();

    public static interface OnSurfaceSizeChanged {
        public void onSurfaceSizeChanged(int var1, int var2);
    }
}

