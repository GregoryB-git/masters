/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.media.MediaPlayer$OnBufferingUpdateListener
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnInfoListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.media.MediaPlayer$OnSeekCompleteListener
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.Surface
 *  android.view.TextureView$SurfaceTextureListener
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  androidx.annotation.FloatRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.drm.MediaDrmCallback
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.TrackGroupArray
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Map
 */
package com.devbrackets.android.exomedia.core.video.mp;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.api.VideoViewApi;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.CaptionListener;
import com.devbrackets.android.exomedia.core.video.ResizingTextureView;
import com.devbrackets.android.exomedia.core.video.mp.NativeVideoDelegate;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public class NativeTextureVideoView
extends ResizingTextureView
implements NativeVideoDelegate.Callback,
VideoViewApi {
    public NativeVideoDelegate delegate;
    public View.OnTouchListener touchListener;

    public NativeTextureVideoView(Context context) {
        super(context);
        this.setup(context, null);
    }

    public NativeTextureVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setup(context, attributeSet);
    }

    public NativeTextureVideoView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.setup(context, attributeSet);
    }

    @TargetApi(value=21)
    public NativeTextureVideoView(Context context, AttributeSet attributeSet, int n, int n2) {
        super(context, attributeSet, n, n2);
        this.setup(context, attributeSet);
    }

    @Override
    public void clearSelectedTracks(@NonNull ExoMedia.RendererType rendererType) {
    }

    @Override
    @Nullable
    public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks() {
        return null;
    }

    @Override
    public int getBufferedPercent() {
        return this.delegate.getBufferPercentage();
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
        return -1;
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
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl;
        block3: {
            block2: {
                View.OnTouchListener onTouchListener = this.touchListener;
                boolean bl2 = false;
                bl = onTouchListener != null ? onTouchListener.onTouch((View)this, motionEvent) : false;
                if (bl) break block2;
                bl = bl2;
                if (!super.onTouchEvent(motionEvent)) break block3;
            }
            bl = true;
        }
        return bl;
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
    }

    @Override
    public boolean restart() {
        return this.delegate.restart();
    }

    @Override
    public void seekTo(long l) {
        this.delegate.seekTo(l);
    }

    @Override
    public void setCaptionListener(@Nullable CaptionListener captionListener) {
    }

    @Override
    public void setDrmCallback(@Nullable MediaDrmCallback mediaDrmCallback) {
    }

    @Override
    public void setListenerMux(ListenerMux listenerMux) {
        this.delegate.setListenerMux(listenerMux);
    }

    public void setOnBufferingUpdateListener(@Nullable MediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.delegate.setOnBufferingUpdateListener(onBufferingUpdateListener);
    }

    public void setOnCompletionListener(@Nullable MediaPlayer.OnCompletionListener onCompletionListener) {
        this.delegate.setOnCompletionListener(onCompletionListener);
    }

    public void setOnErrorListener(@Nullable MediaPlayer.OnErrorListener onErrorListener) {
        this.delegate.setOnErrorListener(onErrorListener);
    }

    public void setOnInfoListener(@Nullable MediaPlayer.OnInfoListener onInfoListener) {
        this.delegate.setOnInfoListener(onInfoListener);
    }

    public void setOnPreparedListener(@Nullable MediaPlayer.OnPreparedListener onPreparedListener) {
        this.delegate.setOnPreparedListener(onPreparedListener);
    }

    public void setOnSeekCompleteListener(@Nullable MediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.delegate.setOnSeekCompleteListener(onSeekCompleteListener);
    }

    @Override
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.touchListener = onTouchListener;
        super.setOnTouchListener(onTouchListener);
    }

    @Override
    public boolean setPlaybackSpeed(float f2) {
        return this.delegate.setPlaybackSpeed(f2);
    }

    @Override
    public void setRendererEnabled(@NonNull ExoMedia.RendererType rendererType, boolean bl) {
    }

    @Override
    public void setRepeatMode(int n) {
    }

    @Override
    public void setTrack(@NonNull ExoMedia.RendererType rendererType, int n) {
    }

    @Override
    public void setTrack(@NonNull ExoMedia.RendererType rendererType, int n, int n2) {
    }

    public void setVideoURI(Uri uri) {
        this.setVideoURI(uri, null);
    }

    public void setVideoURI(Uri uri, @Nullable Map<String, String> map) {
        this.delegate.setVideoURI(uri, map);
        this.requestLayout();
        this.invalidate();
    }

    @Override
    public void setVideoUri(@Nullable Uri uri) {
        this.setVideoUri(uri, null);
    }

    @Override
    public void setVideoUri(@Nullable Uri uri, @Nullable MediaSource mediaSource) {
        this.setVideoURI(uri);
    }

    @Override
    public boolean setVolume(@FloatRange(from=0.0, to=1.0) float f2) {
        return this.delegate.setVolume(f2);
    }

    public void setup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this.delegate = new NativeVideoDelegate(context, this, this);
        this.setSurfaceTextureListener(new TextureVideoViewSurfaceListener(this));
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
        this.requestFocus();
        this.updateVideoSize(0, 0);
    }

    @Override
    public void start() {
        this.delegate.start();
        this.requestFocus();
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
        return false;
    }

    @Override
    public void videoSizeChanged(int n, int n2) {
        if (this.updateVideoSize(n, n2)) {
            this.requestLayout();
        }
    }

    public class TextureVideoViewSurfaceListener
    implements TextureView.SurfaceTextureListener {
        public final NativeTextureVideoView this$0;

        public TextureVideoViewSurfaceListener(NativeTextureVideoView nativeTextureVideoView) {
            this.this$0 = nativeTextureVideoView;
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n, int n2) {
            this.this$0.delegate.onSurfaceReady(new Surface(surfaceTexture));
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            surfaceTexture.release();
            this.this$0.suspend();
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n, int n2) {
            this.this$0.delegate.onSurfaceSizeChanged(n, n2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}

