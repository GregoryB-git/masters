/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.net.Uri
 *  androidx.annotation.FloatRange
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.drm.MediaDrmCallback
 *  com.google.android.exoplayer2.metadata.Metadata
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.TrackGroupArray
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Map
 */
package com.devbrackets.android.exomedia.core.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.api.AudioPlayerApi;
import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

@TargetApi(value=16)
public class ExoAudioPlayer
implements AudioPlayerApi {
    @NonNull
    public final Context context;
    @NonNull
    public final ExoMediaPlayer exoMediaPlayer;
    @NonNull
    public InternalListeners internalListeners = new InternalListeners(this);
    public ListenerMux listenerMux;
    public boolean playRequested = false;

    public ExoAudioPlayer(@NonNull Context object) {
        this.context = object;
        object = new ExoMediaPlayer((Context)object);
        this.exoMediaPlayer = object;
        ((ExoMediaPlayer)((Object)object)).setMetadataListener(this.internalListeners);
        ((ExoMediaPlayer)((Object)object)).setBufferUpdateListener(this.internalListeners);
    }

    @Override
    public int getAudioSessionId() {
        return this.exoMediaPlayer.getAudioSessionId();
    }

    @Override
    @Nullable
    public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks() {
        return this.exoMediaPlayer.getAvailableTracks();
    }

    @Override
    public int getBufferedPercent() {
        return this.exoMediaPlayer.getBufferedPercentage();
    }

    @Override
    public long getCurrentPosition() {
        if (!this.listenerMux.isPrepared()) {
            return 0L;
        }
        return this.exoMediaPlayer.getCurrentPosition();
    }

    @Override
    public long getDuration() {
        if (!this.listenerMux.isPrepared()) {
            return 0L;
        }
        return this.exoMediaPlayer.getDuration();
    }

    @Override
    public float getPlaybackSpeed() {
        return this.exoMediaPlayer.getPlaybackSpeed();
    }

    @Override
    public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType rendererType, int n) {
        return this.exoMediaPlayer.getSelectedTrackIndex(rendererType, n);
    }

    @Override
    public float getVolumeLeft() {
        return this.exoMediaPlayer.getVolume();
    }

    @Override
    public float getVolumeRight() {
        return this.exoMediaPlayer.getVolume();
    }

    @Override
    @Nullable
    public WindowInfo getWindowInfo() {
        return this.exoMediaPlayer.getWindowInfo();
    }

    @Override
    public boolean isPlaying() {
        return this.exoMediaPlayer.getPlayWhenReady();
    }

    @Override
    public void onMediaPrepared() {
    }

    @Override
    public void pause() {
        this.exoMediaPlayer.setPlayWhenReady(false);
        this.playRequested = false;
    }

    @Override
    public void prepareAsync() {
        this.exoMediaPlayer.prepare();
    }

    @Override
    public void release() {
        this.exoMediaPlayer.release();
    }

    @Override
    public void reset() {
    }

    @Override
    public boolean restart() {
        if (!this.exoMediaPlayer.restart()) {
            return false;
        }
        this.listenerMux.setNotifiedCompleted(false);
        this.listenerMux.setNotifiedPrepared(false);
        return true;
    }

    @Override
    public void seekTo(@IntRange(from=0L) long l) {
        this.exoMediaPlayer.seekTo(l);
    }

    @Override
    public void setAudioStreamType(int n) {
        this.exoMediaPlayer.setAudioStreamType(n);
    }

    @Override
    public void setDataSource(@Nullable Uri uri) {
        this.setDataSource(uri, null);
    }

    @Override
    public void setDataSource(@Nullable Uri uri, @Nullable MediaSource mediaSource) {
        this.listenerMux.setNotifiedPrepared(false);
        this.exoMediaPlayer.seekTo(0L);
        if (mediaSource != null) {
            this.exoMediaPlayer.setMediaSource(mediaSource);
            this.listenerMux.setNotifiedCompleted(false);
        } else if (uri != null) {
            this.exoMediaPlayer.setUri(uri);
            this.listenerMux.setNotifiedCompleted(false);
        } else {
            this.exoMediaPlayer.setMediaSource(null);
        }
    }

    @Override
    public void setDrmCallback(@Nullable MediaDrmCallback mediaDrmCallback) {
        this.exoMediaPlayer.setDrmCallback(mediaDrmCallback);
    }

    @Override
    public void setListenerMux(ListenerMux listenerMux) {
        ListenerMux listenerMux2 = this.listenerMux;
        if (listenerMux2 != null) {
            this.exoMediaPlayer.removeListener(listenerMux2);
            this.exoMediaPlayer.removeAnalyticsListener(this.listenerMux);
        }
        this.listenerMux = listenerMux;
        this.exoMediaPlayer.addListener(listenerMux);
        this.exoMediaPlayer.addAnalyticsListener(listenerMux);
    }

    @Override
    public boolean setPlaybackSpeed(float f2) {
        return this.exoMediaPlayer.setPlaybackSpeed(f2);
    }

    @Override
    public void setRepeatMode(int n) {
        this.exoMediaPlayer.setRepeatMode(n);
    }

    @Override
    public void setTrack(@NonNull ExoMedia.RendererType rendererType, int n) {
        this.exoMediaPlayer.setSelectedTrack(rendererType, n);
    }

    @Override
    public void setTrack(@NonNull ExoMedia.RendererType rendererType, int n, int n2) {
        this.exoMediaPlayer.setSelectedTrack(rendererType, n, n2);
    }

    @Override
    public void setVolume(@FloatRange(from=0.0, to=1.0) float f2, @FloatRange(from=0.0, to=1.0) float f4) {
        this.exoMediaPlayer.setVolume((f2 + f4) / 2.0f);
    }

    @Override
    public void setWakeMode(@NonNull Context context, int n) {
        this.exoMediaPlayer.setWakeMode(context, n);
    }

    @Override
    public void start() {
        this.exoMediaPlayer.setPlayWhenReady(true);
        this.listenerMux.setNotifiedCompleted(false);
        this.playRequested = true;
    }

    @Override
    public void stopPlayback() {
        this.exoMediaPlayer.stop();
        this.playRequested = false;
    }

    @Override
    public boolean trackSelectionAvailable() {
        return true;
    }

    public class InternalListeners
    implements MetadataListener,
    OnBufferUpdateListener {
        public final ExoAudioPlayer this$0;

        public InternalListeners(ExoAudioPlayer exoAudioPlayer) {
            this.this$0 = exoAudioPlayer;
        }

        @Override
        public void onBufferingUpdate(@IntRange(from=0L, to=100L) int n) {
            this.this$0.listenerMux.onBufferingUpdate(n);
        }

        @Override
        public void onMetadata(Metadata metadata) {
            this.this$0.listenerMux.onMetadata(metadata);
        }
    }
}

