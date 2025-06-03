/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
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

import android.content.Context;
import android.net.Uri;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public interface AudioPlayerApi {
    public int getAudioSessionId();

    @Nullable
    public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks();

    @IntRange(from=0L, to=100L)
    public int getBufferedPercent();

    @IntRange(from=0L)
    public long getCurrentPosition();

    @IntRange(from=0L)
    public long getDuration();

    public float getPlaybackSpeed();

    public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType var1, int var2);

    @FloatRange(from=0.0, to=1.0)
    public float getVolumeLeft();

    @FloatRange(from=0.0, to=1.0)
    public float getVolumeRight();

    @Nullable
    public WindowInfo getWindowInfo();

    public boolean isPlaying();

    public void onMediaPrepared();

    public void pause();

    public void prepareAsync();

    public void release();

    public void reset();

    public boolean restart();

    public void seekTo(@IntRange(from=0L) long var1);

    public void setAudioStreamType(int var1);

    public void setDataSource(@Nullable Uri var1);

    public void setDataSource(@Nullable Uri var1, @Nullable MediaSource var2);

    public void setDrmCallback(@Nullable MediaDrmCallback var1);

    public void setListenerMux(ListenerMux var1);

    public boolean setPlaybackSpeed(float var1);

    public void setRepeatMode(int var1);

    @Deprecated
    public void setTrack(@NonNull ExoMedia.RendererType var1, int var2);

    public void setTrack(@NonNull ExoMedia.RendererType var1, int var2, int var3);

    public void setVolume(@FloatRange(from=0.0, to=1.0) float var1, @FloatRange(from=0.0, to=1.0) float var2);

    public void setWakeMode(@NonNull Context var1, int var2);

    public void start();

    public void stopPlayback();

    public boolean trackSelectionAvailable();
}

