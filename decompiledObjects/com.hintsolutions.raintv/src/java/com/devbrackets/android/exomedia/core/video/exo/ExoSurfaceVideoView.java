/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  androidx.annotation.FloatRange
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.drm.MediaDrmCallback
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.TrackGroupArray
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Map
 */
package com.devbrackets.android.exomedia.core.video.exo;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.api.VideoViewApi;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.CaptionListener;
import com.devbrackets.android.exomedia.core.video.ResizingSurfaceView;
import com.devbrackets.android.exomedia.core.video.exo.ExoVideoDelegate;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

@TargetApi(value=16)
public class ExoSurfaceVideoView
extends ResizingSurfaceView
implements VideoViewApi {
    public ExoVideoDelegate delegate;

    public ExoSurfaceVideoView(Context context) {
        super(context);
        this.setup();
    }

    public ExoSurfaceVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setup();
    }

    public ExoSurfaceVideoView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.setup();
    }

    public ExoSurfaceVideoView(Context context, AttributeSet attributeSet, int n, int n2) {
        super(context, attributeSet, n, n2);
        this.setup();
    }

    @Override
    public void clearSelectedTracks(@NonNull ExoMedia.RendererType rendererType) {
        this.delegate.clearSelectedTracks(rendererType);
    }

    @Override
    @Nullable
    public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks() {
        return this.delegate.getAvailableTracks();
    }

    @Override
    public int getBufferedPercent() {
        return this.delegate.getBufferedPercent();
    }

    @Override
    public long getCurrentPosition() {
        return this.delegate.getCurrentPosition();
    }

    @Override
    public long getDuration() {
        return this.delegate.getDuration();
    }

    @Override
    public float getPlaybackSpeed() {
        return this.delegate.getPlaybackSpeed();
    }

    @Override
    public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType rendererType, int n) {
        return this.delegate.getSelectedTrackIndex(rendererType, n);
    }

    @Override
    public float getVolume() {
        return this.delegate.getVolume();
    }

    @Override
    @Nullable
    public WindowInfo getWindowInfo() {
        return this.delegate.getWindowInfo();
    }

    @Override
    public boolean isPlaying() {
        return this.delegate.isPlaying();
    }

    @Override
    public boolean isRendererEnabled(@NonNull ExoMedia.RendererType rendererType) {
        return this.delegate.isRendererEnabled(rendererType);
    }

    @Override
    public void onVideoSizeChanged(int n, int n2, float f2) {
        if (this.updateVideoSize((int)((float)n * f2), n2)) {
            this.requestLayout();
        }
    }

    @Override
    public void pause() {
        this.delegate.pause();
    }

    @Override
    public void release() {
        this.delegate.release();
    }

    @Override
    public boolean restart() {
        return this.delegate.restart();
    }

    @Override
    public void seekTo(@IntRange(from=0L) long l) {
        this.delegate.seekTo(l);
    }

    @Override
    public void setCaptionListener(@Nullable CaptionListener captionListener) {
        this.delegate.setCaptionListener(captionListener);
    }

    @Override
    public void setDrmCallback(@Nullable MediaDrmCallback mediaDrmCallback) {
        this.delegate.setDrmCallback(mediaDrmCallback);
    }

    @Override
    public void setListenerMux(ListenerMux listenerMux) {
        this.delegate.setListenerMux(listenerMux);
    }

    @Override
    public boolean setPlaybackSpeed(float f2) {
        return this.delegate.setPlaybackSpeed(f2);
    }

    @Override
    public void setRendererEnabled(@NonNull ExoMedia.RendererType rendererType, boolean bl) {
        this.delegate.setRendererEnabled(rendererType, bl);
    }

    @Override
    public void setRepeatMode(int n) {
        this.delegate.setRepeatMode(n);
    }

    @Override
    public void setTrack(@NonNull ExoMedia.RendererType rendererType, int n) {
        this.delegate.setTrack(rendererType, n);
    }

    @Override
    public void setTrack(@NonNull ExoMedia.RendererType rendererType, int n, int n2) {
        this.delegate.setTrack(rendererType, n, n2);
    }

    @Override
    public void setVideoUri(@Nullable Uri uri) {
        this.delegate.setVideoUri(uri);
    }

    @Override
    public void setVideoUri(@Nullable Uri uri, @Nullable MediaSource mediaSource) {
        this.delegate.setVideoUri(uri, mediaSource);
    }

    @Override
    public boolean setVolume(@FloatRange(from=0.0, to=1.0) float f2) {
        return this.delegate.setVolume(f2);
    }

    public void setup() {
        this.delegate = new ExoVideoDelegate(this.getContext(), this);
        this.getHolder().addCallback((SurfaceHolder.Callback)new HolderCallback(this));
        this.updateVideoSize(0, 0);
    }

    @Override
    public void start() {
        this.delegate.start();
    }

    @Override
    public void stopPlayback(boolean bl) {
        this.delegate.stopPlayback(bl);
    }

    @Override
    public void suspend() {
        this.delegate.suspend();
    }

    @Override
    public boolean trackSelectionAvailable() {
        return this.delegate.trackSelectionAvailable();
    }

    public class HolderCallback
    implements SurfaceHolder.Callback {
        public final ExoSurfaceVideoView this$0;

        public HolderCallback(ExoSurfaceVideoView exoSurfaceVideoView) {
            this.this$0 = exoSurfaceVideoView;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int n, int n2, int n3) {
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.this$0.delegate.onSurfaceReady(surfaceHolder.getSurface());
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.this$0.delegate.onSurfaceDestroyed();
            surfaceHolder.getSurface().release();
        }
    }
}

