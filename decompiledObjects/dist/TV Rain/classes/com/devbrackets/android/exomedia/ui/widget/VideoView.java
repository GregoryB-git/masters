package com.devbrackets.android.exomedia.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.ExoMedia.RendererType;
import com.devbrackets.android.exomedia.R.id;
import com.devbrackets.android.exomedia.R.layout;
import com.devbrackets.android.exomedia.R.styleable;
import com.devbrackets.android.exomedia.core.ListenerMux;
import com.devbrackets.android.exomedia.core.ListenerMux.Notifier;
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
import com.devbrackets.android.exomedia.util.DeviceUtil;
import com.devbrackets.android.exomedia.util.StopWatch;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Map;

public class VideoView
  extends RelativeLayout
{
  private static final String TAG = "VideoView";
  @NonNull
  public AudioFocusHelper audioFocusHelper = new AudioFocusHelper();
  public AudioManager audioManager;
  public DeviceUtil deviceUtil = new DeviceUtil();
  public boolean handleAudioFocus = true;
  public ListenerMux listenerMux;
  public boolean matchOverridePositionSpeed = true;
  public MuxNotifier muxNotifier = new MuxNotifier();
  public long overriddenDuration = -1L;
  public StopWatch overriddenPositionStopWatch = new StopWatch();
  public boolean overridePosition = false;
  public long positionOffset = 0L;
  public ImageView previewImageView;
  public boolean releaseOnDetachFromWindow = true;
  @Nullable
  public VideoControlsCore videoControls;
  public Uri videoUri;
  public VideoViewApi videoViewImpl;
  
  public VideoView(Context paramContext)
  {
    super(paramContext);
    setup(paramContext, null);
  }
  
  public VideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setup(paramContext, paramAttributeSet);
  }
  
  @TargetApi(11)
  public VideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setup(paramContext, paramAttributeSet);
  }
  
  @TargetApi(21)
  public VideoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setup(paramContext, paramAttributeSet);
  }
  
  public void clearSelectedTracks(@NonNull ExoMedia.RendererType paramRendererType)
  {
    videoViewImpl.clearSelectedTracks(paramRendererType);
  }
  
  @Nullable
  public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks()
  {
    return videoViewImpl.getAvailableTracks();
  }
  
  @Nullable
  public Bitmap getBitmap()
  {
    VideoViewApi localVideoViewApi = videoViewImpl;
    if ((localVideoViewApi instanceof TextureView)) {
      return ((TextureView)localVideoViewApi).getBitmap();
    }
    return null;
  }
  
  public int getBufferPercentage()
  {
    return videoViewImpl.getBufferedPercent();
  }
  
  public long getCurrentPosition()
  {
    long l1;
    if (overridePosition) {
      l1 = positionOffset;
    }
    for (long l2 = overriddenPositionStopWatch.getTime();; l2 = videoViewImpl.getCurrentPosition())
    {
      return l2 + l1;
      l1 = positionOffset;
    }
  }
  
  public long getDuration()
  {
    long l = overriddenDuration;
    if (l >= 0L) {
      return l;
    }
    return videoViewImpl.getDuration();
  }
  
  public float getPlaybackSpeed()
  {
    return videoViewImpl.getPlaybackSpeed();
  }
  
  public ImageView getPreviewImageView()
  {
    return previewImageView;
  }
  
  public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType paramRendererType, int paramInt)
  {
    return videoViewImpl.getSelectedTrackIndex(paramRendererType, paramInt);
  }
  
  @Deprecated
  @Nullable
  public VideoControls getVideoControls()
  {
    VideoControlsCore localVideoControlsCore = videoControls;
    if ((localVideoControlsCore != null) && ((localVideoControlsCore instanceof VideoControls))) {
      return (VideoControls)localVideoControlsCore;
    }
    return null;
  }
  
  @Nullable
  public VideoControlsCore getVideoControlsCore()
  {
    return videoControls;
  }
  
  @Nullable
  public Uri getVideoUri()
  {
    return videoUri;
  }
  
  @LayoutRes
  public int getVideoViewApiImplementation(@NonNull Context paramContext, @NonNull AttributeContainer paramAttributeContainer)
  {
    int i;
    if ((deviceUtil.supportsExoPlayer(paramContext) ^ true)) {
      i = apiImplLegacyResourceId;
    } else {
      i = apiImplResourceId;
    }
    return i;
  }
  
  public float getVolume()
  {
    return videoViewImpl.getVolume();
  }
  
  @Nullable
  public WindowInfo getWindowInfo()
  {
    return videoViewImpl.getWindowInfo();
  }
  
  public void inflateVideoView(@NonNull Context paramContext, @NonNull AttributeContainer paramAttributeContainer)
  {
    View.inflate(paramContext, R.layout.exomedia_video_view_layout, this);
    ViewStub localViewStub = (ViewStub)findViewById(R.id.video_view_api_impl_stub);
    localViewStub.setLayoutResource(getVideoViewApiImplementation(paramContext, paramAttributeContainer));
    localViewStub.inflate();
  }
  
  public void initView(Context paramContext, @NonNull AttributeContainer paramAttributeContainer)
  {
    inflateVideoView(paramContext, paramAttributeContainer);
    previewImageView = ((ImageView)findViewById(R.id.exomedia_video_preview_image));
    videoViewImpl = ((VideoViewApi)findViewById(R.id.exomedia_video_view));
    paramContext = new MuxNotifier();
    muxNotifier = paramContext;
    paramContext = new ListenerMux(paramContext);
    listenerMux = paramContext;
    videoViewImpl.setListenerMux(paramContext);
  }
  
  public boolean isPlaying()
  {
    return videoViewImpl.isPlaying();
  }
  
  public boolean isRendererEnabled(@NonNull ExoMedia.RendererType paramRendererType)
  {
    return videoViewImpl.isRendererEnabled(paramRendererType);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if ((!isInEditMode()) && (releaseOnDetachFromWindow)) {
      release();
    }
  }
  
  public void onPlaybackEnded()
  {
    stopPlayback(false);
  }
  
  public void overrideDuration(long paramLong)
  {
    overriddenDuration = paramLong;
  }
  
  public void overridePosition(boolean paramBoolean)
  {
    if (paramBoolean) {
      overriddenPositionStopWatch.start();
    } else {
      overriddenPositionStopWatch.stop();
    }
    overridePosition = paramBoolean;
  }
  
  public void pause()
  {
    pause(false);
  }
  
  public void pause(boolean paramBoolean)
  {
    if (!paramBoolean) {
      audioFocusHelper.abandonFocus();
    }
    videoViewImpl.pause();
    setKeepScreenOn(false);
    VideoControlsCore localVideoControlsCore = videoControls;
    if (localVideoControlsCore != null) {
      localVideoControlsCore.updatePlaybackState(false);
    }
  }
  
  public void postInit(@NonNull AttributeContainer paramAttributeContainer)
  {
    if (useDefaultControls)
    {
      if (deviceUtil.isDeviceTV(getContext())) {
        localObject = new VideoControlsLeanback(getContext());
      } else {
        localObject = new VideoControlsMobile(getContext());
      }
      setControls((VideoControls)localObject);
    }
    Object localObject = scaleType;
    if (localObject != null) {
      setScaleType((ScaleType)localObject);
    }
    paramAttributeContainer = measureBasedOnAspectRatio;
    if (paramAttributeContainer != null) {
      setMeasureBasedOnAspectRatioEnabled(paramAttributeContainer.booleanValue());
    }
  }
  
  public void release()
  {
    VideoControlsCore localVideoControlsCore = videoControls;
    if (localVideoControlsCore != null)
    {
      localVideoControlsCore.onDetachedFromView(this);
      videoControls = null;
    }
    stopPlayback();
    overriddenPositionStopWatch.stop();
    videoViewImpl.release();
  }
  
  public void reset()
  {
    stopPlayback();
    setVideoURI(null);
  }
  
  public boolean restart()
  {
    Object localObject = videoUri;
    boolean bool1 = false;
    if (localObject == null) {
      return false;
    }
    if (videoViewImpl.restart())
    {
      localObject = videoControls;
      boolean bool2 = true;
      bool1 = bool2;
      if (localObject != null)
      {
        ((VideoControlsCore)localObject).showLoading(true);
        bool1 = bool2;
      }
    }
    return bool1;
  }
  
  public void restartOverridePosition()
  {
    overriddenPositionStopWatch.reset();
  }
  
  public void seekTo(long paramLong)
  {
    VideoControlsCore localVideoControlsCore = videoControls;
    if (localVideoControlsCore != null) {
      localVideoControlsCore.showLoading(false);
    }
    videoViewImpl.seekTo(paramLong);
  }
  
  public void setAnalyticsListener(@Nullable AnalyticsListener paramAnalyticsListener)
  {
    listenerMux.setAnalyticsListener(paramAnalyticsListener);
  }
  
  public void setCaptionListener(@Nullable CaptionListener paramCaptionListener)
  {
    videoViewImpl.setCaptionListener(paramCaptionListener);
  }
  
  @Deprecated
  public void setControls(@Nullable VideoControls paramVideoControls)
  {
    setControls(paramVideoControls);
  }
  
  public void setControls(@Nullable VideoControlsCore paramVideoControlsCore)
  {
    VideoControlsCore localVideoControlsCore = videoControls;
    if ((localVideoControlsCore != null) && (localVideoControlsCore != paramVideoControlsCore)) {
      localVideoControlsCore.onDetachedFromView(this);
    }
    videoControls = paramVideoControlsCore;
    if (paramVideoControlsCore != null) {
      paramVideoControlsCore.onAttachedToView(this);
    }
    paramVideoControlsCore = new TouchListener(getContext());
    if (videoControls == null) {
      paramVideoControlsCore = null;
    }
    setOnTouchListener(paramVideoControlsCore);
  }
  
  public void setDrmCallback(@Nullable MediaDrmCallback paramMediaDrmCallback)
  {
    videoViewImpl.setDrmCallback(paramMediaDrmCallback);
  }
  
  public void setHandleAudioFocus(boolean paramBoolean)
  {
    audioFocusHelper.abandonFocus();
    handleAudioFocus = paramBoolean;
  }
  
  public void setId3MetadataListener(@Nullable MetadataListener paramMetadataListener)
  {
    listenerMux.setMetadataListener(paramMetadataListener);
  }
  
  public void setMeasureBasedOnAspectRatioEnabled(boolean paramBoolean)
  {
    videoViewImpl.setMeasureBasedOnAspectRatioEnabled(paramBoolean);
  }
  
  public void setOnBufferUpdateListener(@Nullable OnBufferUpdateListener paramOnBufferUpdateListener)
  {
    listenerMux.setOnBufferUpdateListener(paramOnBufferUpdateListener);
  }
  
  public void setOnCompletionListener(@Nullable OnCompletionListener paramOnCompletionListener)
  {
    listenerMux.setOnCompletionListener(paramOnCompletionListener);
  }
  
  public void setOnErrorListener(@Nullable OnErrorListener paramOnErrorListener)
  {
    listenerMux.setOnErrorListener(paramOnErrorListener);
  }
  
  public void setOnPreparedListener(@Nullable OnPreparedListener paramOnPreparedListener)
  {
    listenerMux.setOnPreparedListener(paramOnPreparedListener);
  }
  
  public void setOnSeekCompletionListener(@Nullable OnSeekCompletionListener paramOnSeekCompletionListener)
  {
    listenerMux.setOnSeekCompletionListener(paramOnSeekCompletionListener);
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    videoViewImpl.setOnTouchListener(paramOnTouchListener);
    super.setOnTouchListener(paramOnTouchListener);
  }
  
  public void setOnVideoSizedChangedListener(@Nullable OnVideoSizeChangedListener paramOnVideoSizeChangedListener)
  {
    muxNotifier.videoSizeChangedListener = paramOnVideoSizeChangedListener;
  }
  
  public void setOverridePositionMatchesPlaybackSpeed(boolean paramBoolean)
  {
    if (paramBoolean != matchOverridePositionSpeed)
    {
      matchOverridePositionSpeed = paramBoolean;
      if (paramBoolean) {
        overriddenPositionStopWatch.setSpeedMultiplier(getPlaybackSpeed());
      } else {
        overriddenPositionStopWatch.setSpeedMultiplier(1.0F);
      }
    }
  }
  
  public boolean setPlaybackSpeed(float paramFloat)
  {
    boolean bool = videoViewImpl.setPlaybackSpeed(paramFloat);
    if ((bool) && (matchOverridePositionSpeed)) {
      overriddenPositionStopWatch.setSpeedMultiplier(paramFloat);
    }
    return bool;
  }
  
  public void setPositionOffset(long paramLong)
  {
    positionOffset = paramLong;
  }
  
  public void setPreviewImage(@DrawableRes int paramInt)
  {
    ImageView localImageView = previewImageView;
    if (localImageView != null) {
      localImageView.setImageResource(paramInt);
    }
  }
  
  public void setPreviewImage(@Nullable Bitmap paramBitmap)
  {
    ImageView localImageView = previewImageView;
    if (localImageView != null) {
      localImageView.setImageBitmap(paramBitmap);
    }
  }
  
  public void setPreviewImage(@Nullable Drawable paramDrawable)
  {
    ImageView localImageView = previewImageView;
    if (localImageView != null) {
      localImageView.setImageDrawable(paramDrawable);
    }
  }
  
  public void setPreviewImage(@Nullable Uri paramUri)
  {
    ImageView localImageView = previewImageView;
    if (localImageView != null) {
      localImageView.setImageURI(paramUri);
    }
  }
  
  public void setReleaseOnDetachFromWindow(boolean paramBoolean)
  {
    releaseOnDetachFromWindow = paramBoolean;
  }
  
  public void setRendererEnabled(@NonNull ExoMedia.RendererType paramRendererType, boolean paramBoolean)
  {
    videoViewImpl.setRendererEnabled(paramRendererType, paramBoolean);
  }
  
  public void setRepeatMode(int paramInt)
  {
    videoViewImpl.setRepeatMode(paramInt);
  }
  
  public void setScaleType(@NonNull ScaleType paramScaleType)
  {
    videoViewImpl.setScaleType(paramScaleType);
  }
  
  @Deprecated
  public void setTrack(ExoMedia.RendererType paramRendererType, int paramInt)
  {
    videoViewImpl.setTrack(paramRendererType, paramInt);
  }
  
  public void setTrack(ExoMedia.RendererType paramRendererType, int paramInt1, int paramInt2)
  {
    videoViewImpl.setTrack(paramRendererType, paramInt1, paramInt2);
  }
  
  public void setVideoPath(String paramString)
  {
    setVideoURI(Uri.parse(paramString));
  }
  
  public void setVideoRotation(@IntRange(from=0L, to=359L) int paramInt)
  {
    videoViewImpl.setVideoRotation(paramInt, true);
  }
  
  public void setVideoURI(@Nullable Uri paramUri)
  {
    videoUri = paramUri;
    videoViewImpl.setVideoUri(paramUri);
    paramUri = videoControls;
    if (paramUri != null) {
      paramUri.showLoading(true);
    }
  }
  
  public void setVideoURI(@Nullable Uri paramUri, @Nullable MediaSource paramMediaSource)
  {
    videoUri = paramUri;
    videoViewImpl.setVideoUri(paramUri, paramMediaSource);
    paramUri = videoControls;
    if (paramUri != null) {
      paramUri.showLoading(true);
    }
  }
  
  public boolean setVolume(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    return videoViewImpl.setVolume(paramFloat);
  }
  
  public void setup(Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    if (isInEditMode()) {
      return;
    }
    audioManager = ((AudioManager)paramContext.getApplicationContext().getSystemService("audio"));
    paramAttributeSet = new AttributeContainer(paramContext, paramAttributeSet);
    initView(paramContext, paramAttributeSet);
    postInit(paramAttributeSet);
  }
  
  public void showControls()
  {
    VideoControlsCore localVideoControlsCore = videoControls;
    if (localVideoControlsCore != null)
    {
      localVideoControlsCore.show();
      if (isPlaying()) {
        videoControls.hide(true);
      }
    }
  }
  
  public void start()
  {
    if (!audioFocusHelper.requestFocus()) {
      return;
    }
    videoViewImpl.start();
    setKeepScreenOn(true);
    VideoControlsCore localVideoControlsCore = videoControls;
    if (localVideoControlsCore != null) {
      localVideoControlsCore.updatePlaybackState(true);
    }
  }
  
  public void stopPlayback()
  {
    stopPlayback(true);
  }
  
  public void stopPlayback(boolean paramBoolean)
  {
    audioFocusHelper.abandonFocus();
    videoViewImpl.stopPlayback(paramBoolean);
    setKeepScreenOn(false);
    VideoControlsCore localVideoControlsCore = videoControls;
    if (localVideoControlsCore != null) {
      localVideoControlsCore.updatePlaybackState(false);
    }
  }
  
  public void suspend()
  {
    audioFocusHelper.abandonFocus();
    videoViewImpl.suspend();
    setKeepScreenOn(false);
    VideoControlsCore localVideoControlsCore = videoControls;
    if (localVideoControlsCore != null) {
      localVideoControlsCore.updatePlaybackState(false);
    }
  }
  
  public boolean trackSelectionAvailable()
  {
    return videoViewImpl.trackSelectionAvailable();
  }
  
  public class AttributeContainer
  {
    public int apiImplLegacyResourceId;
    public int apiImplResourceId;
    @Nullable
    public Boolean measureBasedOnAspectRatio;
    @Nullable
    public ScaleType scaleType;
    public boolean useDefaultControls = false;
    public boolean useTextureViewBacking = false;
    
    public AttributeContainer(@Nullable Context paramContext, AttributeSet paramAttributeSet)
    {
      int i = R.layout.exomedia_default_exo_texture_video_view;
      apiImplResourceId = i;
      int j = R.layout.exomedia_default_native_texture_video_view;
      apiImplLegacyResourceId = j;
      if (paramAttributeSet == null) {
        return;
      }
      this$1 = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.VideoView);
      if (VideoView.this == null) {
        return;
      }
      useDefaultControls = getBoolean(R.styleable.VideoView_useDefaultControls, useDefaultControls);
      useTextureViewBacking = getBoolean(R.styleable.VideoView_useTextureViewBacking, useTextureViewBacking);
      int k = R.styleable.VideoView_videoScale;
      if (hasValue(k)) {
        scaleType = ScaleType.fromOrdinal(getInt(k, -1));
      }
      k = R.styleable.VideoView_measureBasedOnAspectRatio;
      if (hasValue(k)) {
        measureBasedOnAspectRatio = Boolean.valueOf(getBoolean(k, false));
      }
      boolean bool = useTextureViewBacking;
      if (!bool) {
        i = R.layout.exomedia_default_exo_surface_video_view;
      }
      apiImplResourceId = i;
      if (!bool) {
        j = R.layout.exomedia_default_native_surface_video_view;
      }
      apiImplLegacyResourceId = j;
      apiImplResourceId = getResourceId(R.styleable.VideoView_videoViewApiImpl, i);
      apiImplLegacyResourceId = getResourceId(R.styleable.VideoView_videoViewApiImplLegacy, apiImplLegacyResourceId);
      recycle();
    }
  }
  
  public class AudioFocusHelper
    implements AudioManager.OnAudioFocusChangeListener
  {
    public int currentFocus = 0;
    public boolean pausedForLoss = false;
    public boolean startRequested = false;
    
    public AudioFocusHelper() {}
    
    public boolean abandonFocus()
    {
      Object localObject = VideoView.this;
      boolean bool1 = handleAudioFocus;
      boolean bool2 = true;
      if (!bool1) {
        return true;
      }
      localObject = audioManager;
      if (localObject == null) {
        return false;
      }
      startRequested = false;
      if (1 != ((AudioManager)localObject).abandonAudioFocus(this)) {
        bool2 = false;
      }
      return bool2;
    }
    
    public void onAudioFocusChange(int paramInt)
    {
      VideoView localVideoView = VideoView.this;
      if ((handleAudioFocus) && (currentFocus != paramInt))
      {
        currentFocus = paramInt;
        if ((paramInt != -3) && (paramInt != -2))
        {
          if (paramInt != -1)
          {
            if (((paramInt == 1) || (paramInt == 2)) && ((startRequested) || (pausedForLoss)))
            {
              localVideoView.start();
              startRequested = false;
              pausedForLoss = false;
            }
          }
          else if (localVideoView.isPlaying())
          {
            pausedForLoss = true;
            pause();
          }
        }
        else if (localVideoView.isPlaying())
        {
          pausedForLoss = true;
          pause(true);
        }
      }
    }
    
    public boolean requestFocus()
    {
      Object localObject = VideoView.this;
      if ((handleAudioFocus) && (currentFocus != 1))
      {
        localObject = audioManager;
        if (localObject == null) {
          return false;
        }
        if (1 == ((AudioManager)localObject).requestAudioFocus(this, 3, 1))
        {
          currentFocus = 1;
          return true;
        }
        startRequested = true;
        return false;
      }
      return true;
    }
  }
  
  public class MuxNotifier
    extends ListenerMux.Notifier
  {
    @Nullable
    public OnVideoSizeChangedListener videoSizeChangedListener;
    
    public MuxNotifier() {}
    
    public void onExoPlayerError(ExoMediaPlayer paramExoMediaPlayer, Exception paramException)
    {
      stopPlayback();
      if (paramExoMediaPlayer != null) {
        paramExoMediaPlayer.forcePrepare();
      }
    }
    
    public void onMediaPlaybackEnded()
    {
      setKeepScreenOn(false);
      onPlaybackEnded();
    }
    
    public void onPrepared()
    {
      VideoView localVideoView = VideoView.this;
      VideoControlsCore localVideoControlsCore = videoControls;
      if (localVideoControlsCore != null)
      {
        localVideoControlsCore.setDuration(localVideoView.getDuration());
        videoControls.finishLoading();
      }
    }
    
    public void onPreviewImageStateChanged(boolean paramBoolean)
    {
      ImageView localImageView = previewImageView;
      if (localImageView != null)
      {
        int i;
        if (paramBoolean) {
          i = 0;
        } else {
          i = 8;
        }
        localImageView.setVisibility(i);
      }
    }
    
    public void onSeekComplete()
    {
      VideoControlsCore localVideoControlsCore = videoControls;
      if (localVideoControlsCore != null) {
        localVideoControlsCore.finishLoading();
      }
    }
    
    public void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
    {
      videoViewImpl.setVideoRotation(paramInt3, false);
      videoViewImpl.onVideoSizeChanged(paramInt1, paramInt2, paramFloat);
      OnVideoSizeChangedListener localOnVideoSizeChangedListener = videoSizeChangedListener;
      if (localOnVideoSizeChangedListener != null) {
        localOnVideoSizeChangedListener.onVideoSizeChanged(paramInt1, paramInt2, paramFloat);
      }
    }
    
    public boolean shouldNotifyCompletion(long paramLong)
    {
      long l1 = getCurrentPosition();
      long l2 = getDuration();
      boolean bool;
      if ((l1 > 0L) && (l2 > 0L) && (l1 + paramLong >= l2)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public class TouchListener
    extends GestureDetector.SimpleOnGestureListener
    implements View.OnTouchListener
  {
    public GestureDetector gestureDetector = new GestureDetector(paramContext, this);
    
    public TouchListener(Context paramContext) {}
    
    public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
    {
      paramMotionEvent = videoControls;
      if ((paramMotionEvent != null) && (paramMotionEvent.isVisible())) {
        videoControls.hide(false);
      } else {
        showControls();
      }
      return true;
    }
    
    public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      gestureDetector.onTouchEvent(paramMotionEvent);
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */