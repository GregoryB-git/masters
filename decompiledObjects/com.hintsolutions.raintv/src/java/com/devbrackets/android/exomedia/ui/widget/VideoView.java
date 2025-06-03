/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.TextureView
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewStub
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  androidx.annotation.DrawableRes
 *  androidx.annotation.FloatRange
 *  androidx.annotation.IntRange
 *  androidx.annotation.LayoutRes
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.google.android.exoplayer2.analytics.AnalyticsListener
 *  com.google.android.exoplayer2.drm.MediaDrmCallback
 *  com.google.android.exoplayer2.source.MediaSource
 *  com.google.android.exoplayer2.source.TrackGroupArray
 *  java.lang.Boolean
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Map
 */
package com.devbrackets.android.exomedia.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia;
import com.devbrackets.android.exomedia.R;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.api.VideoViewApi;
import com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer;
import com.devbrackets.android.exomedia.core.exoplayer.WindowInfo;
import com.devbrackets.android.exomedia.core.listener.CaptionListener;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.core.video.scale.ScaleType;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.devbrackets.android.exomedia.listener.OnCompletionListener;
import com.devbrackets.android.exomedia.listener.OnErrorListener;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.devbrackets.android.exomedia.listener.OnSeekCompletionListener;
import com.devbrackets.android.exomedia.listener.OnVideoSizeChangedListener;
import com.devbrackets.android.exomedia.ui.widget.VideoControls;
import com.devbrackets.android.exomedia.ui.widget.VideoControlsCore;
import com.devbrackets.android.exomedia.ui.widget.VideoControlsLeanback;
import com.devbrackets.android.exomedia.ui.widget.VideoControlsMobile;
import com.devbrackets.android.exomedia.util.DeviceUtil;
import com.devbrackets.android.exomedia.util.StopWatch;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public class VideoView
extends RelativeLayout {
    private static final String TAG = "VideoView";
    @NonNull
    public AudioFocusHelper audioFocusHelper;
    public AudioManager audioManager;
    public DeviceUtil deviceUtil = new DeviceUtil();
    public boolean handleAudioFocus = true;
    public ListenerMux listenerMux;
    public boolean matchOverridePositionSpeed = true;
    public MuxNotifier muxNotifier;
    public long overriddenDuration = -1L;
    public StopWatch overriddenPositionStopWatch;
    public boolean overridePosition = false;
    public long positionOffset = 0L;
    public ImageView previewImageView;
    public boolean releaseOnDetachFromWindow = true;
    @Nullable
    public VideoControlsCore videoControls;
    public Uri videoUri;
    public VideoViewApi videoViewImpl;

    public VideoView(Context context) {
        super(context);
        this.audioFocusHelper = new AudioFocusHelper(this);
        this.overriddenPositionStopWatch = new StopWatch();
        this.muxNotifier = new MuxNotifier(this);
        this.setup(context, null);
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.audioFocusHelper = new AudioFocusHelper(this);
        this.overriddenPositionStopWatch = new StopWatch();
        this.muxNotifier = new MuxNotifier(this);
        this.setup(context, attributeSet);
    }

    @TargetApi(value=11)
    public VideoView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.audioFocusHelper = new AudioFocusHelper(this);
        this.overriddenPositionStopWatch = new StopWatch();
        this.muxNotifier = new MuxNotifier(this);
        this.setup(context, attributeSet);
    }

    @TargetApi(value=21)
    public VideoView(Context context, AttributeSet attributeSet, int n, int n2) {
        super(context, attributeSet, n, n2);
        this.audioFocusHelper = new AudioFocusHelper(this);
        this.overriddenPositionStopWatch = new StopWatch();
        this.muxNotifier = new MuxNotifier(this);
        this.setup(context, attributeSet);
    }

    public void clearSelectedTracks(@NonNull ExoMedia.RendererType rendererType) {
        this.videoViewImpl.clearSelectedTracks(rendererType);
    }

    @Nullable
    public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks() {
        return this.videoViewImpl.getAvailableTracks();
    }

    @Nullable
    public Bitmap getBitmap() {
        VideoViewApi videoViewApi = this.videoViewImpl;
        if (videoViewApi instanceof TextureView) {
            return ((TextureView)videoViewApi).getBitmap();
        }
        return null;
    }

    public int getBufferPercentage() {
        return this.videoViewImpl.getBufferedPercent();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long getCurrentPosition() {
        long l;
        long l2;
        if (this.overridePosition) {
            l2 = this.positionOffset;
            l = this.overriddenPositionStopWatch.getTime();
            return l + l2;
        }
        l2 = this.positionOffset;
        l = this.videoViewImpl.getCurrentPosition();
        return l + l2;
    }

    public long getDuration() {
        long l = this.overriddenDuration;
        if (l >= 0L) {
            return l;
        }
        return this.videoViewImpl.getDuration();
    }

    public float getPlaybackSpeed() {
        return this.videoViewImpl.getPlaybackSpeed();
    }

    public ImageView getPreviewImageView() {
        return this.previewImageView;
    }

    public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType rendererType, int n) {
        return this.videoViewImpl.getSelectedTrackIndex(rendererType, n);
    }

    @Deprecated
    @Nullable
    public VideoControls getVideoControls() {
        VideoControlsCore videoControlsCore = this.videoControls;
        if (videoControlsCore != null && videoControlsCore instanceof VideoControls) {
            return (VideoControls)videoControlsCore;
        }
        return null;
    }

    @Nullable
    public VideoControlsCore getVideoControlsCore() {
        return this.videoControls;
    }

    @Nullable
    public Uri getVideoUri() {
        return this.videoUri;
    }

    @LayoutRes
    public int getVideoViewApiImplementation(@NonNull Context context, @NonNull AttributeContainer attributeContainer) {
        int n = this.deviceUtil.supportsExoPlayer(context) ^ true ? attributeContainer.apiImplLegacyResourceId : attributeContainer.apiImplResourceId;
        return n;
    }

    public float getVolume() {
        return this.videoViewImpl.getVolume();
    }

    @Nullable
    public WindowInfo getWindowInfo() {
        return this.videoViewImpl.getWindowInfo();
    }

    public void inflateVideoView(@NonNull Context context, @NonNull AttributeContainer attributeContainer) {
        View.inflate((Context)context, (int)R.layout.exomedia_video_view_layout, (ViewGroup)this);
        ViewStub viewStub = (ViewStub)this.findViewById(R.id.video_view_api_impl_stub);
        viewStub.setLayoutResource(this.getVideoViewApiImplementation(context, attributeContainer));
        viewStub.inflate();
    }

    public void initView(Context object, @NonNull AttributeContainer attributeContainer) {
        this.inflateVideoView((Context)object, attributeContainer);
        this.previewImageView = (ImageView)this.findViewById(R.id.exomedia_video_preview_image);
        this.videoViewImpl = (VideoViewApi)this.findViewById(R.id.exomedia_video_view);
        object = new MuxNotifier(this);
        this.muxNotifier = object;
        object = new ListenerMux((ListenerMux.Notifier)object);
        this.listenerMux = object;
        this.videoViewImpl.setListenerMux((ListenerMux)object);
    }

    public boolean isPlaying() {
        return this.videoViewImpl.isPlaying();
    }

    public boolean isRendererEnabled(@NonNull ExoMedia.RendererType rendererType) {
        return this.videoViewImpl.isRendererEnabled(rendererType);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.isInEditMode() && this.releaseOnDetachFromWindow) {
            this.release();
        }
    }

    public void onPlaybackEnded() {
        this.stopPlayback(false);
    }

    public void overrideDuration(long l) {
        this.overriddenDuration = l;
    }

    public void overridePosition(boolean bl) {
        if (bl) {
            this.overriddenPositionStopWatch.start();
        } else {
            this.overriddenPositionStopWatch.stop();
        }
        this.overridePosition = bl;
    }

    public void pause() {
        this.pause(false);
    }

    public void pause(boolean bl) {
        if (!bl) {
            this.audioFocusHelper.abandonFocus();
        }
        this.videoViewImpl.pause();
        this.setKeepScreenOn(false);
        VideoControlsCore videoControlsCore = this.videoControls;
        if (videoControlsCore != null) {
            videoControlsCore.updatePlaybackState(false);
        }
    }

    public void postInit(@NonNull AttributeContainer attributeContainer) {
        Object object;
        if (attributeContainer.useDefaultControls) {
            object = this.deviceUtil.isDeviceTV(this.getContext()) ? new VideoControlsLeanback(this.getContext()) : new VideoControlsMobile(this.getContext());
            this.setControls((VideoControls)object);
        }
        if ((object = attributeContainer.scaleType) != null) {
            this.setScaleType((ScaleType)((Object)object));
        }
        if ((attributeContainer = attributeContainer.measureBasedOnAspectRatio) != null) {
            this.setMeasureBasedOnAspectRatioEnabled(attributeContainer.booleanValue());
        }
    }

    public void release() {
        VideoControlsCore videoControlsCore = this.videoControls;
        if (videoControlsCore != null) {
            videoControlsCore.onDetachedFromView(this);
            this.videoControls = null;
        }
        this.stopPlayback();
        this.overriddenPositionStopWatch.stop();
        this.videoViewImpl.release();
    }

    public void reset() {
        this.stopPlayback();
        this.setVideoURI(null);
    }

    public boolean restart() {
        Object object = this.videoUri;
        boolean bl = false;
        if (object == null) {
            return false;
        }
        if (this.videoViewImpl.restart()) {
            boolean bl2;
            object = this.videoControls;
            bl = bl2 = true;
            if (object != null) {
                object.showLoading(true);
                bl = bl2;
            }
        }
        return bl;
    }

    public void restartOverridePosition() {
        this.overriddenPositionStopWatch.reset();
    }

    public void seekTo(long l) {
        VideoControlsCore videoControlsCore = this.videoControls;
        if (videoControlsCore != null) {
            videoControlsCore.showLoading(false);
        }
        this.videoViewImpl.seekTo(l);
    }

    public void setAnalyticsListener(@Nullable AnalyticsListener analyticsListener) {
        this.listenerMux.setAnalyticsListener(analyticsListener);
    }

    public void setCaptionListener(@Nullable CaptionListener captionListener) {
        this.videoViewImpl.setCaptionListener(captionListener);
    }

    @Deprecated
    public void setControls(@Nullable VideoControls videoControls) {
        this.setControls((VideoControlsCore)videoControls);
    }

    public void setControls(@Nullable VideoControlsCore object) {
        VideoControlsCore videoControlsCore = this.videoControls;
        if (videoControlsCore != null && videoControlsCore != object) {
            videoControlsCore.onDetachedFromView(this);
        }
        this.videoControls = object;
        if (object != null) {
            object.onAttachedToView(this);
        }
        object = new TouchListener(this, this.getContext());
        if (this.videoControls == null) {
            object = null;
        }
        this.setOnTouchListener((View.OnTouchListener)object);
    }

    public void setDrmCallback(@Nullable MediaDrmCallback mediaDrmCallback) {
        this.videoViewImpl.setDrmCallback(mediaDrmCallback);
    }

    public void setHandleAudioFocus(boolean bl) {
        this.audioFocusHelper.abandonFocus();
        this.handleAudioFocus = bl;
    }

    public void setId3MetadataListener(@Nullable MetadataListener metadataListener) {
        this.listenerMux.setMetadataListener(metadataListener);
    }

    public void setMeasureBasedOnAspectRatioEnabled(boolean bl) {
        this.videoViewImpl.setMeasureBasedOnAspectRatioEnabled(bl);
    }

    public void setOnBufferUpdateListener(@Nullable OnBufferUpdateListener onBufferUpdateListener) {
        this.listenerMux.setOnBufferUpdateListener(onBufferUpdateListener);
    }

    public void setOnCompletionListener(@Nullable OnCompletionListener onCompletionListener) {
        this.listenerMux.setOnCompletionListener(onCompletionListener);
    }

    public void setOnErrorListener(@Nullable OnErrorListener onErrorListener) {
        this.listenerMux.setOnErrorListener(onErrorListener);
    }

    public void setOnPreparedListener(@Nullable OnPreparedListener onPreparedListener) {
        this.listenerMux.setOnPreparedListener(onPreparedListener);
    }

    public void setOnSeekCompletionListener(@Nullable OnSeekCompletionListener onSeekCompletionListener) {
        this.listenerMux.setOnSeekCompletionListener(onSeekCompletionListener);
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.videoViewImpl.setOnTouchListener(onTouchListener);
        super.setOnTouchListener(onTouchListener);
    }

    public void setOnVideoSizedChangedListener(@Nullable OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.muxNotifier.videoSizeChangedListener = onVideoSizeChangedListener;
    }

    public void setOverridePositionMatchesPlaybackSpeed(boolean bl) {
        if (bl != this.matchOverridePositionSpeed) {
            this.matchOverridePositionSpeed = bl;
            if (bl) {
                this.overriddenPositionStopWatch.setSpeedMultiplier(this.getPlaybackSpeed());
            } else {
                this.overriddenPositionStopWatch.setSpeedMultiplier(1.0f);
            }
        }
    }

    public boolean setPlaybackSpeed(float f2) {
        boolean bl = this.videoViewImpl.setPlaybackSpeed(f2);
        if (bl && this.matchOverridePositionSpeed) {
            this.overriddenPositionStopWatch.setSpeedMultiplier(f2);
        }
        return bl;
    }

    public void setPositionOffset(long l) {
        this.positionOffset = l;
    }

    public void setPreviewImage(@DrawableRes int n) {
        ImageView imageView = this.previewImageView;
        if (imageView != null) {
            imageView.setImageResource(n);
        }
    }

    public void setPreviewImage(@Nullable Bitmap bitmap) {
        ImageView imageView = this.previewImageView;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void setPreviewImage(@Nullable Drawable drawable2) {
        ImageView imageView = this.previewImageView;
        if (imageView != null) {
            imageView.setImageDrawable(drawable2);
        }
    }

    public void setPreviewImage(@Nullable Uri uri) {
        ImageView imageView = this.previewImageView;
        if (imageView != null) {
            imageView.setImageURI(uri);
        }
    }

    public void setReleaseOnDetachFromWindow(boolean bl) {
        this.releaseOnDetachFromWindow = bl;
    }

    public void setRendererEnabled(@NonNull ExoMedia.RendererType rendererType, boolean bl) {
        this.videoViewImpl.setRendererEnabled(rendererType, bl);
    }

    public void setRepeatMode(int n) {
        this.videoViewImpl.setRepeatMode(n);
    }

    public void setScaleType(@NonNull ScaleType scaleType) {
        this.videoViewImpl.setScaleType(scaleType);
    }

    @Deprecated
    public void setTrack(ExoMedia.RendererType rendererType, int n) {
        this.videoViewImpl.setTrack(rendererType, n);
    }

    public void setTrack(ExoMedia.RendererType rendererType, int n, int n2) {
        this.videoViewImpl.setTrack(rendererType, n, n2);
    }

    public void setVideoPath(String string2) {
        this.setVideoURI(Uri.parse((String)string2));
    }

    public void setVideoRotation(@IntRange(from=0L, to=359L) int n) {
        this.videoViewImpl.setVideoRotation(n, true);
    }

    public void setVideoURI(@Nullable Uri object) {
        this.videoUri = object;
        this.videoViewImpl.setVideoUri((Uri)object);
        object = this.videoControls;
        if (object != null) {
            object.showLoading(true);
        }
    }

    public void setVideoURI(@Nullable Uri object, @Nullable MediaSource mediaSource) {
        this.videoUri = object;
        this.videoViewImpl.setVideoUri((Uri)object, mediaSource);
        object = this.videoControls;
        if (object != null) {
            object.showLoading(true);
        }
    }

    public boolean setVolume(@FloatRange(from=0.0, to=1.0) float f2) {
        return this.videoViewImpl.setVolume(f2);
    }

    public void setup(Context context, @Nullable AttributeSet object) {
        if (this.isInEditMode()) {
            return;
        }
        this.audioManager = (AudioManager)context.getApplicationContext().getSystemService("audio");
        object = new AttributeContainer(this, context, (AttributeSet)object);
        this.initView(context, (AttributeContainer)object);
        this.postInit((AttributeContainer)object);
    }

    public void showControls() {
        VideoControlsCore videoControlsCore = this.videoControls;
        if (videoControlsCore != null) {
            videoControlsCore.show();
            if (this.isPlaying()) {
                this.videoControls.hide(true);
            }
        }
    }

    public void start() {
        if (!this.audioFocusHelper.requestFocus()) {
            return;
        }
        this.videoViewImpl.start();
        this.setKeepScreenOn(true);
        VideoControlsCore videoControlsCore = this.videoControls;
        if (videoControlsCore != null) {
            videoControlsCore.updatePlaybackState(true);
        }
    }

    public void stopPlayback() {
        this.stopPlayback(true);
    }

    public void stopPlayback(boolean bl) {
        this.audioFocusHelper.abandonFocus();
        this.videoViewImpl.stopPlayback(bl);
        this.setKeepScreenOn(false);
        VideoControlsCore videoControlsCore = this.videoControls;
        if (videoControlsCore != null) {
            videoControlsCore.updatePlaybackState(false);
        }
    }

    public void suspend() {
        this.audioFocusHelper.abandonFocus();
        this.videoViewImpl.suspend();
        this.setKeepScreenOn(false);
        VideoControlsCore videoControlsCore = this.videoControls;
        if (videoControlsCore != null) {
            videoControlsCore.updatePlaybackState(false);
        }
    }

    public boolean trackSelectionAvailable() {
        return this.videoViewImpl.trackSelectionAvailable();
    }

    public class AttributeContainer {
        public int apiImplLegacyResourceId;
        public int apiImplResourceId;
        @Nullable
        public Boolean measureBasedOnAspectRatio;
        @Nullable
        public ScaleType scaleType;
        public final VideoView this$0;
        public boolean useDefaultControls;
        public boolean useTextureViewBacking;

        public AttributeContainer(@NonNull VideoView videoView, @Nullable Context context, AttributeSet attributeSet) {
            boolean bl;
            int n;
            int n2;
            this.this$0 = videoView;
            this.useDefaultControls = false;
            this.useTextureViewBacking = false;
            this.apiImplResourceId = n2 = R.layout.exomedia_default_exo_texture_video_view;
            this.apiImplLegacyResourceId = n = R.layout.exomedia_default_native_texture_video_view;
            if (attributeSet == null) {
                return;
            }
            videoView = context.obtainStyledAttributes(attributeSet, R.styleable.VideoView);
            if (videoView == null) {
                return;
            }
            this.useDefaultControls = videoView.getBoolean(R.styleable.VideoView_useDefaultControls, this.useDefaultControls);
            this.useTextureViewBacking = videoView.getBoolean(R.styleable.VideoView_useTextureViewBacking, this.useTextureViewBacking);
            int n3 = R.styleable.VideoView_videoScale;
            if (videoView.hasValue(n3)) {
                this.scaleType = ScaleType.fromOrdinal(videoView.getInt(n3, -1));
            }
            if (videoView.hasValue(n3 = R.styleable.VideoView_measureBasedOnAspectRatio)) {
                this.measureBasedOnAspectRatio = videoView.getBoolean(n3, false);
            }
            if (!(bl = this.useTextureViewBacking)) {
                n2 = R.layout.exomedia_default_exo_surface_video_view;
            }
            this.apiImplResourceId = n2;
            if (!bl) {
                n = R.layout.exomedia_default_native_surface_video_view;
            }
            this.apiImplLegacyResourceId = n;
            this.apiImplResourceId = videoView.getResourceId(R.styleable.VideoView_videoViewApiImpl, n2);
            this.apiImplLegacyResourceId = videoView.getResourceId(R.styleable.VideoView_videoViewApiImplLegacy, this.apiImplLegacyResourceId);
            videoView.recycle();
        }
    }

    public class AudioFocusHelper
    implements AudioManager.OnAudioFocusChangeListener {
        public int currentFocus;
        public boolean pausedForLoss;
        public boolean startRequested;
        public final VideoView this$0;

        public AudioFocusHelper(VideoView videoView) {
            this.this$0 = videoView;
            this.startRequested = false;
            this.pausedForLoss = false;
            this.currentFocus = 0;
        }

        public boolean abandonFocus() {
            VideoView videoView = this.this$0;
            boolean bl = videoView.handleAudioFocus;
            boolean bl2 = true;
            if (!bl) {
                return true;
            }
            videoView = videoView.audioManager;
            if (videoView == null) {
                return false;
            }
            this.startRequested = false;
            if (1 != videoView.abandonAudioFocus(this)) {
                bl2 = false;
            }
            return bl2;
        }

        public void onAudioFocusChange(int n) {
            VideoView videoView = this.this$0;
            if (videoView.handleAudioFocus && this.currentFocus != n) {
                this.currentFocus = n;
                if (n != -3 && n != -2) {
                    if (n != -1) {
                        if ((n == 1 || n == 2) && (this.startRequested || this.pausedForLoss)) {
                            videoView.start();
                            this.startRequested = false;
                            this.pausedForLoss = false;
                        }
                    } else if (videoView.isPlaying()) {
                        this.pausedForLoss = true;
                        this.this$0.pause();
                    }
                } else if (videoView.isPlaying()) {
                    this.pausedForLoss = true;
                    this.this$0.pause(true);
                }
            }
        }

        public boolean requestFocus() {
            VideoView videoView = this.this$0;
            if (videoView.handleAudioFocus && this.currentFocus != 1) {
                videoView = videoView.audioManager;
                if (videoView == null) {
                    return false;
                }
                if (1 == videoView.requestAudioFocus(this, 3, 1)) {
                    this.currentFocus = 1;
                    return true;
                }
                this.startRequested = true;
                return false;
            }
            return true;
        }
    }

    public class MuxNotifier
    extends ListenerMux.Notifier {
        public final VideoView this$0;
        @Nullable
        public OnVideoSizeChangedListener videoSizeChangedListener;

        public MuxNotifier(VideoView videoView) {
            this.this$0 = videoView;
        }

        @Override
        public void onExoPlayerError(ExoMediaPlayer exoMediaPlayer, Exception exception) {
            this.this$0.stopPlayback();
            if (exoMediaPlayer != null) {
                exoMediaPlayer.forcePrepare();
            }
        }

        @Override
        public void onMediaPlaybackEnded() {
            this.this$0.setKeepScreenOn(false);
            this.this$0.onPlaybackEnded();
        }

        @Override
        public void onPrepared() {
            VideoView videoView = this.this$0;
            VideoControlsCore videoControlsCore = videoView.videoControls;
            if (videoControlsCore != null) {
                videoControlsCore.setDuration(videoView.getDuration());
                this.this$0.videoControls.finishLoading();
            }
        }

        @Override
        public void onPreviewImageStateChanged(boolean bl) {
            ImageView imageView = this.this$0.previewImageView;
            if (imageView != null) {
                int n = bl ? 0 : 8;
                imageView.setVisibility(n);
            }
        }

        @Override
        public void onSeekComplete() {
            VideoControlsCore videoControlsCore = this.this$0.videoControls;
            if (videoControlsCore != null) {
                videoControlsCore.finishLoading();
            }
        }

        @Override
        public void onVideoSizeChanged(int n, int n2, int n3, float f2) {
            this.this$0.videoViewImpl.setVideoRotation(n3, false);
            this.this$0.videoViewImpl.onVideoSizeChanged(n, n2, f2);
            OnVideoSizeChangedListener onVideoSizeChangedListener = this.videoSizeChangedListener;
            if (onVideoSizeChangedListener != null) {
                onVideoSizeChangedListener.onVideoSizeChanged(n, n2, f2);
            }
        }

        @Override
        public boolean shouldNotifyCompletion(long l) {
            long l2 = this.this$0.getCurrentPosition();
            long l3 = this.this$0.getDuration();
            boolean bl = l2 > 0L && l3 > 0L && l2 + l >= l3;
            return bl;
        }
    }

    public class TouchListener
    extends GestureDetector.SimpleOnGestureListener
    implements View.OnTouchListener {
        public GestureDetector gestureDetector;
        public final VideoView this$0;

        public TouchListener(VideoView videoView, Context context) {
            this.this$0 = videoView;
            this.gestureDetector = new GestureDetector(context, (GestureDetector.OnGestureListener)this);
        }

        public boolean onSingleTapConfirmed(MotionEvent object) {
            object = this.this$0.videoControls;
            if (object != null && object.isVisible()) {
                this.this$0.videoControls.hide(false);
            } else {
                this.this$0.showControls();
            }
            return true;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            this.gestureDetector.onTouchEvent(motionEvent);
            return true;
        }
    }
}

