/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.view.Surface
 *  androidx.annotation.FloatRange
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.drm.MediaDrmCallback
 *  com.google.android.exoplayer2.metadata.Metadata
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.TrackGroupArray
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Map
 */
package com.devbrackets.android.exomedia.core.video.exo;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.CaptionListener;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.core.video.ClearableSurface;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public class ExoVideoDelegate {
    public ClearableSurface clearableSurface;
    public Context context;
    public ExoMediaPlayer exoMediaPlayer;
    @NonNull
    public InternalListeners internalListeners = new InternalListeners(this);
    public ListenerMux listenerMux;
    public boolean playRequested = false;

    public ExoVideoDelegate(@NonNull Context context, @NonNull ClearableSurface clearableSurface) {
        this.context = context.getApplicationContext();
        this.clearableSurface = clearableSurface;
        this.setup();
    }

    public void clearSelectedTracks(@NonNull ExoMedia.RendererType rendererType) {
        this.exoMediaPlayer.clearSelectedTracks(rendererType);
    }

    @Nullable
    public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks() {
        return this.exoMediaPlayer.getAvailableTracks();
    }

    public int getBufferedPercent() {
        return this.exoMediaPlayer.getBufferedPercentage();
    }

    public long getCurrentPosition() {
        if (!this.listenerMux.isPrepared()) {
            return 0L;
        }
        return this.exoMediaPlayer.getCurrentPosition();
    }

    public long getDuration() {
        if (!this.listenerMux.isPrepared()) {
            return 0L;
        }
        return this.exoMediaPlayer.getDuration();
    }

    public float getPlaybackSpeed() {
        return this.exoMediaPlayer.getPlaybackSpeed();
    }

    public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType rendererType, int n) {
        return this.exoMediaPlayer.getSelectedTrackIndex(rendererType, n);
    }

    @FloatRange(from=0.0, to=1.0)
    public float getVolume() {
        return this.exoMediaPlayer.getVolume();
    }

    @Nullable
    public WindowInfo getWindowInfo() {
        return this.exoMediaPlayer.getWindowInfo();
    }

    public void initExoPlayer() {
        ExoMediaPlayer exoMediaPlayer;
        this.exoMediaPlayer = exoMediaPlayer = new ExoMediaPlayer(this.context);
        exoMediaPlayer.setMetadataListener(this.internalListeners);
        this.exoMediaPlayer.setBufferUpdateListener(this.internalListeners);
    }

    public boolean isPlaying() {
        return this.exoMediaPlayer.getPlayWhenReady();
    }

    public boolean isRendererEnabled(@NonNull ExoMedia.RendererType rendererType) {
        return this.exoMediaPlayer.isRendererEnabled(rendererType);
    }

    public void onSurfaceDestroyed() {
        this.exoMediaPlayer.clearSurface();
    }

    public void onSurfaceReady(Surface surface) {
        this.exoMediaPlayer.setSurface(surface);
        if (this.playRequested) {
            this.exoMediaPlayer.setPlayWhenReady(true);
        }
    }

    public void pause() {
        this.exoMediaPlayer.setPlayWhenReady(false);
        this.playRequested = false;
    }

    public void release() {
        this.exoMediaPlayer.release();
    }

    public boolean restart() {
        if (!this.exoMediaPlayer.restart()) {
            return false;
        }
        this.listenerMux.setNotifiedPrepared(false);
        this.listenerMux.setNotifiedCompleted(false);
        return true;
    }

    public void seekTo(@IntRange(from=0L) long l) {
        this.exoMediaPlayer.seekTo(l);
    }

    public void setCaptionListener(@Nullable CaptionListener captionListener) {
        this.exoMediaPlayer.setCaptionListener(captionListener);
    }

    public void setDrmCallback(@Nullable MediaDrmCallback mediaDrmCallback) {
        this.exoMediaPlayer.setDrmCallback(mediaDrmCallback);
    }

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

    public boolean setPlaybackSpeed(float f2) {
        return this.exoMediaPlayer.setPlaybackSpeed(f2);
    }

    public void setRendererEnabled(@NonNull ExoMedia.RendererType rendererType, boolean bl) {
        this.exoMediaPlayer.setRendererEnabled(rendererType, bl);
    }

    public void setRepeatMode(int n) {
        this.exoMediaPlayer.setRepeatMode(n);
    }

    @Deprecated
    public void setTrack(ExoMedia.RendererType rendererType, int n) {
        this.exoMediaPlayer.setSelectedTrack(rendererType, n);
    }

    public void setTrack(@NonNull ExoMedia.RendererType rendererType, int n, int n2) {
        this.exoMediaPlayer.setSelectedTrack(rendererType, n, n2);
    }

    public void setVideoUri(@Nullable Uri uri) {
        this.setVideoUri(uri, null);
    }

    public void setVideoUri(@Nullable Uri uri, @Nullable MediaSource mediaSource) {
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

    public boolean setVolume(@FloatRange(from=0.0, to=1.0) float f2) {
        this.exoMediaPlayer.setVolume(f2);
        return true;
    }

    public void setup() {
        this.initExoPlayer();
    }

    public void start() {
        this.exoMediaPlayer.setPlayWhenReady(true);
        this.listenerMux.setNotifiedCompleted(false);
        this.playRequested = true;
    }

    public void stopPlayback(boolean bl) {
        this.exoMediaPlayer.stop();
        this.playRequested = false;
        if (bl) {
            this.listenerMux.clearSurfaceWhenReady(this.clearableSurface);
        }
    }

    public void suspend() {
        this.exoMediaPlayer.release();
        this.playRequested = false;
    }

    public boolean trackSelectionAvailable() {
        return true;
    }

    public class InternalListeners
    implements MetadataListener,
    OnBufferUpdateListener {
        public final ExoVideoDelegate this$0;

        public InternalListeners(ExoVideoDelegate exoVideoDelegate) {
            this.this$0 = exoVideoDelegate;
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

