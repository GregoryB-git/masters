package com.google.android.exoplayer2;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsCollector.Factory;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioAttributes.Builder;
import com.google.android.exoplayer2.audio.AudioFocusManager;
import com.google.android.exoplayer2.audio.AudioFocusManager.PlayerControl;
import com.google.android.exoplayer2.audio.AudioListener;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

@TargetApi(16)
public class SimpleExoPlayer
  extends BasePlayer
  implements ExoPlayer, Player.AudioComponent, Player.VideoComponent, Player.TextComponent
{
  private static final String TAG = "SimpleExoPlayer";
  private final AnalyticsCollector analyticsCollector;
  private AudioAttributes audioAttributes;
  private final CopyOnWriteArraySet<AudioRendererEventListener> audioDebugListeners;
  private DecoderCounters audioDecoderCounters;
  private final AudioFocusManager audioFocusManager;
  private Format audioFormat;
  private final CopyOnWriteArraySet<AudioListener> audioListeners;
  private int audioSessionId;
  private float audioVolume;
  private final BandwidthMeter bandwidthMeter;
  private CameraMotionListener cameraMotionListener;
  private final ComponentListener componentListener;
  private List<Cue> currentCues;
  private final Handler eventHandler;
  private boolean hasNotifiedFullWrongThreadWarning;
  private MediaSource mediaSource;
  private final CopyOnWriteArraySet<MetadataOutput> metadataOutputs;
  private boolean ownsSurface;
  private final ExoPlayerImpl player;
  public final Renderer[] renderers;
  private Surface surface;
  private int surfaceHeight;
  private SurfaceHolder surfaceHolder;
  private int surfaceWidth;
  private final CopyOnWriteArraySet<TextOutput> textOutputs;
  private TextureView textureView;
  private final CopyOnWriteArraySet<VideoRendererEventListener> videoDebugListeners;
  private DecoderCounters videoDecoderCounters;
  private Format videoFormat;
  private VideoFrameMetadataListener videoFrameMetadataListener;
  private final CopyOnWriteArraySet<VideoListener> videoListeners;
  private int videoScalingMode;
  
  public SimpleExoPlayer(Context paramContext, RenderersFactory paramRenderersFactory, TrackSelector paramTrackSelector, LoadControl paramLoadControl, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, BandwidthMeter paramBandwidthMeter, AnalyticsCollector.Factory paramFactory, Looper paramLooper)
  {
    this(paramContext, paramRenderersFactory, paramTrackSelector, paramLoadControl, paramDrmSessionManager, paramBandwidthMeter, paramFactory, Clock.DEFAULT, paramLooper);
  }
  
  public SimpleExoPlayer(Context paramContext, RenderersFactory paramRenderersFactory, TrackSelector paramTrackSelector, LoadControl paramLoadControl, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, BandwidthMeter paramBandwidthMeter, AnalyticsCollector.Factory paramFactory, Clock paramClock, Looper paramLooper)
  {
    bandwidthMeter = paramBandwidthMeter;
    ComponentListener localComponentListener = new ComponentListener(null);
    componentListener = localComponentListener;
    CopyOnWriteArraySet localCopyOnWriteArraySet1 = new CopyOnWriteArraySet();
    videoListeners = localCopyOnWriteArraySet1;
    CopyOnWriteArraySet localCopyOnWriteArraySet2 = new CopyOnWriteArraySet();
    audioListeners = localCopyOnWriteArraySet2;
    textOutputs = new CopyOnWriteArraySet();
    metadataOutputs = new CopyOnWriteArraySet();
    CopyOnWriteArraySet localCopyOnWriteArraySet3 = new CopyOnWriteArraySet();
    videoDebugListeners = localCopyOnWriteArraySet3;
    CopyOnWriteArraySet localCopyOnWriteArraySet4 = new CopyOnWriteArraySet();
    audioDebugListeners = localCopyOnWriteArraySet4;
    Handler localHandler = new Handler(paramLooper);
    eventHandler = localHandler;
    paramRenderersFactory = paramRenderersFactory.createRenderers(localHandler, localComponentListener, localComponentListener, localComponentListener, localComponentListener, paramDrmSessionManager);
    renderers = paramRenderersFactory;
    audioVolume = 1.0F;
    audioSessionId = 0;
    audioAttributes = AudioAttributes.DEFAULT;
    videoScalingMode = 1;
    currentCues = Collections.emptyList();
    paramRenderersFactory = new ExoPlayerImpl(paramRenderersFactory, paramTrackSelector, paramLoadControl, paramBandwidthMeter, paramClock, paramLooper);
    player = paramRenderersFactory;
    paramRenderersFactory = paramFactory.createAnalyticsCollector(paramRenderersFactory, paramClock);
    analyticsCollector = paramRenderersFactory;
    addListener(paramRenderersFactory);
    localCopyOnWriteArraySet3.add(paramRenderersFactory);
    localCopyOnWriteArraySet1.add(paramRenderersFactory);
    localCopyOnWriteArraySet4.add(paramRenderersFactory);
    localCopyOnWriteArraySet2.add(paramRenderersFactory);
    addMetadataOutput(paramRenderersFactory);
    paramBandwidthMeter.addEventListener(localHandler, paramRenderersFactory);
    if ((paramDrmSessionManager instanceof DefaultDrmSessionManager)) {
      ((DefaultDrmSessionManager)paramDrmSessionManager).addListener(localHandler, paramRenderersFactory);
    }
    audioFocusManager = new AudioFocusManager(paramContext, localComponentListener);
  }
  
  public SimpleExoPlayer(Context paramContext, RenderersFactory paramRenderersFactory, TrackSelector paramTrackSelector, LoadControl paramLoadControl, BandwidthMeter paramBandwidthMeter, @Nullable DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager, Looper paramLooper)
  {
    this(paramContext, paramRenderersFactory, paramTrackSelector, paramLoadControl, paramDrmSessionManager, paramBandwidthMeter, new AnalyticsCollector.Factory(), paramLooper);
  }
  
  private void maybeNotifySurfaceSizeChanged(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != surfaceWidth) || (paramInt2 != surfaceHeight))
    {
      surfaceWidth = paramInt1;
      surfaceHeight = paramInt2;
      Iterator localIterator = videoListeners.iterator();
      while (localIterator.hasNext()) {
        ((VideoListener)localIterator.next()).onSurfaceSizeChanged(paramInt1, paramInt2);
      }
    }
  }
  
  private void removeSurfaceCallbacks()
  {
    Object localObject = textureView;
    if (localObject != null)
    {
      if (((TextureView)localObject).getSurfaceTextureListener() != componentListener) {
        Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
      } else {
        textureView.setSurfaceTextureListener(null);
      }
      textureView = null;
    }
    localObject = surfaceHolder;
    if (localObject != null)
    {
      ((SurfaceHolder)localObject).removeCallback(componentListener);
      surfaceHolder = null;
    }
  }
  
  private void sendVolumeToRenderers()
  {
    float f1 = audioVolume;
    float f2 = audioFocusManager.getVolumeMultiplier();
    for (Renderer localRenderer : renderers) {
      if (localRenderer.getTrackType() == 1) {
        player.createMessage(localRenderer).setType(2).setPayload(Float.valueOf(f2 * f1)).send();
      }
    }
  }
  
  private void setVideoSurfaceInternal(@Nullable Surface paramSurface, boolean paramBoolean)
  {
    Object localObject1 = new ArrayList();
    for (localObject2 : renderers) {
      if (((Renderer)localObject2).getTrackType() == 2) {
        ((ArrayList)localObject1).add(player.createMessage((PlayerMessage.Target)localObject2).setType(1).setPayload(paramSurface).send());
      }
    }
    Object localObject2 = surface;
    if ((localObject2 != null) && (localObject2 != paramSurface)) {
      try
      {
        localObject1 = ((ArrayList)localObject1).iterator();
        while (((Iterator)localObject1).hasNext()) {
          ((PlayerMessage)((Iterator)localObject1).next()).blockUntilDelivered();
        }
        surface = paramSurface;
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
        if (ownsSurface) {
          surface.release();
        }
      }
    }
    ownsSurface = paramBoolean;
  }
  
  private void updatePlayWhenReady(boolean paramBoolean, int paramInt)
  {
    ExoPlayerImpl localExoPlayerImpl = player;
    boolean bool = false;
    if ((paramBoolean) && (paramInt != -1)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    if (paramInt != 1) {
      bool = true;
    }
    localExoPlayerImpl.setPlayWhenReady(paramBoolean, bool);
  }
  
  private void verifyApplicationThread()
  {
    if (Looper.myLooper() != getApplicationLooper())
    {
      IllegalStateException localIllegalStateException;
      if (hasNotifiedFullWrongThreadWarning) {
        localIllegalStateException = null;
      } else {
        localIllegalStateException = new IllegalStateException();
      }
      Log.w("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://google.github.io/ExoPlayer/faqs.html#what-do-player-is-accessed-on-the-wrong-thread-warnings-mean", localIllegalStateException);
      hasNotifiedFullWrongThreadWarning = true;
    }
  }
  
  public void addAnalyticsListener(AnalyticsListener paramAnalyticsListener)
  {
    verifyApplicationThread();
    analyticsCollector.addListener(paramAnalyticsListener);
  }
  
  @Deprecated
  public void addAudioDebugListener(AudioRendererEventListener paramAudioRendererEventListener)
  {
    audioDebugListeners.add(paramAudioRendererEventListener);
  }
  
  public void addAudioListener(AudioListener paramAudioListener)
  {
    audioListeners.add(paramAudioListener);
  }
  
  public void addListener(Player.EventListener paramEventListener)
  {
    verifyApplicationThread();
    player.addListener(paramEventListener);
  }
  
  public void addMetadataOutput(MetadataOutput paramMetadataOutput)
  {
    metadataOutputs.add(paramMetadataOutput);
  }
  
  public void addTextOutput(TextOutput paramTextOutput)
  {
    if (!currentCues.isEmpty()) {
      paramTextOutput.onCues(currentCues);
    }
    textOutputs.add(paramTextOutput);
  }
  
  @Deprecated
  public void addVideoDebugListener(VideoRendererEventListener paramVideoRendererEventListener)
  {
    videoDebugListeners.add(paramVideoRendererEventListener);
  }
  
  public void addVideoListener(VideoListener paramVideoListener)
  {
    videoListeners.add(paramVideoListener);
  }
  
  @Deprecated
  public void blockingSendMessages(ExoPlayer.ExoPlayerMessage... paramVarArgs)
  {
    player.blockingSendMessages(paramVarArgs);
  }
  
  public void clearAuxEffectInfo()
  {
    setAuxEffectInfo(new AuxEffectInfo(0, 0.0F));
  }
  
  public void clearCameraMotionListener(CameraMotionListener paramCameraMotionListener)
  {
    verifyApplicationThread();
    if (cameraMotionListener != paramCameraMotionListener) {
      return;
    }
    for (paramCameraMotionListener : renderers) {
      if (paramCameraMotionListener.getTrackType() == 5) {
        player.createMessage(paramCameraMotionListener).setType(7).setPayload(null).send();
      }
    }
  }
  
  @Deprecated
  public void clearMetadataOutput(MetadataOutput paramMetadataOutput)
  {
    removeMetadataOutput(paramMetadataOutput);
  }
  
  @Deprecated
  public void clearTextOutput(TextOutput paramTextOutput)
  {
    removeTextOutput(paramTextOutput);
  }
  
  public void clearVideoFrameMetadataListener(VideoFrameMetadataListener paramVideoFrameMetadataListener)
  {
    verifyApplicationThread();
    if (videoFrameMetadataListener != paramVideoFrameMetadataListener) {
      return;
    }
    for (PlayerMessage.Target localTarget : renderers) {
      if (localTarget.getTrackType() == 2) {
        player.createMessage(localTarget).setType(6).setPayload(null).send();
      }
    }
  }
  
  @Deprecated
  public void clearVideoListener(VideoListener paramVideoListener)
  {
    removeVideoListener(paramVideoListener);
  }
  
  public void clearVideoSurface()
  {
    verifyApplicationThread();
    setVideoSurface(null);
  }
  
  public void clearVideoSurface(Surface paramSurface)
  {
    verifyApplicationThread();
    if ((paramSurface != null) && (paramSurface == surface)) {
      setVideoSurface(null);
    }
  }
  
  public void clearVideoSurfaceHolder(SurfaceHolder paramSurfaceHolder)
  {
    verifyApplicationThread();
    if ((paramSurfaceHolder != null) && (paramSurfaceHolder == surfaceHolder)) {
      setVideoSurfaceHolder(null);
    }
  }
  
  public void clearVideoSurfaceView(SurfaceView paramSurfaceView)
  {
    if (paramSurfaceView == null) {
      paramSurfaceView = null;
    } else {
      paramSurfaceView = paramSurfaceView.getHolder();
    }
    clearVideoSurfaceHolder(paramSurfaceView);
  }
  
  public void clearVideoTextureView(TextureView paramTextureView)
  {
    verifyApplicationThread();
    if ((paramTextureView != null) && (paramTextureView == textureView)) {
      setVideoTextureView(null);
    }
  }
  
  public PlayerMessage createMessage(PlayerMessage.Target paramTarget)
  {
    verifyApplicationThread();
    return player.createMessage(paramTarget);
  }
  
  public AnalyticsCollector getAnalyticsCollector()
  {
    return analyticsCollector;
  }
  
  public Looper getApplicationLooper()
  {
    return player.getApplicationLooper();
  }
  
  public AudioAttributes getAudioAttributes()
  {
    return audioAttributes;
  }
  
  public Player.AudioComponent getAudioComponent()
  {
    return this;
  }
  
  public DecoderCounters getAudioDecoderCounters()
  {
    return audioDecoderCounters;
  }
  
  public Format getAudioFormat()
  {
    return audioFormat;
  }
  
  public int getAudioSessionId()
  {
    return audioSessionId;
  }
  
  @Deprecated
  public int getAudioStreamType()
  {
    return Util.getStreamTypeForAudioUsage(audioAttributes.usage);
  }
  
  public long getBufferedPosition()
  {
    verifyApplicationThread();
    return player.getBufferedPosition();
  }
  
  public long getContentBufferedPosition()
  {
    verifyApplicationThread();
    return player.getContentBufferedPosition();
  }
  
  public long getContentPosition()
  {
    verifyApplicationThread();
    return player.getContentPosition();
  }
  
  public int getCurrentAdGroupIndex()
  {
    verifyApplicationThread();
    return player.getCurrentAdGroupIndex();
  }
  
  public int getCurrentAdIndexInAdGroup()
  {
    verifyApplicationThread();
    return player.getCurrentAdIndexInAdGroup();
  }
  
  @Nullable
  public Object getCurrentManifest()
  {
    verifyApplicationThread();
    return player.getCurrentManifest();
  }
  
  public int getCurrentPeriodIndex()
  {
    verifyApplicationThread();
    return player.getCurrentPeriodIndex();
  }
  
  public long getCurrentPosition()
  {
    verifyApplicationThread();
    return player.getCurrentPosition();
  }
  
  public Timeline getCurrentTimeline()
  {
    verifyApplicationThread();
    return player.getCurrentTimeline();
  }
  
  public TrackGroupArray getCurrentTrackGroups()
  {
    verifyApplicationThread();
    return player.getCurrentTrackGroups();
  }
  
  public TrackSelectionArray getCurrentTrackSelections()
  {
    verifyApplicationThread();
    return player.getCurrentTrackSelections();
  }
  
  public int getCurrentWindowIndex()
  {
    verifyApplicationThread();
    return player.getCurrentWindowIndex();
  }
  
  public long getDuration()
  {
    verifyApplicationThread();
    return player.getDuration();
  }
  
  public boolean getPlayWhenReady()
  {
    verifyApplicationThread();
    return player.getPlayWhenReady();
  }
  
  @Nullable
  public ExoPlaybackException getPlaybackError()
  {
    verifyApplicationThread();
    return player.getPlaybackError();
  }
  
  public Looper getPlaybackLooper()
  {
    return player.getPlaybackLooper();
  }
  
  public PlaybackParameters getPlaybackParameters()
  {
    verifyApplicationThread();
    return player.getPlaybackParameters();
  }
  
  public int getPlaybackState()
  {
    verifyApplicationThread();
    return player.getPlaybackState();
  }
  
  public int getRendererCount()
  {
    verifyApplicationThread();
    return player.getRendererCount();
  }
  
  public int getRendererType(int paramInt)
  {
    verifyApplicationThread();
    return player.getRendererType(paramInt);
  }
  
  public int getRepeatMode()
  {
    verifyApplicationThread();
    return player.getRepeatMode();
  }
  
  public SeekParameters getSeekParameters()
  {
    verifyApplicationThread();
    return player.getSeekParameters();
  }
  
  public boolean getShuffleModeEnabled()
  {
    verifyApplicationThread();
    return player.getShuffleModeEnabled();
  }
  
  public Player.TextComponent getTextComponent()
  {
    return this;
  }
  
  public long getTotalBufferedDuration()
  {
    verifyApplicationThread();
    return player.getTotalBufferedDuration();
  }
  
  public Player.VideoComponent getVideoComponent()
  {
    return this;
  }
  
  public DecoderCounters getVideoDecoderCounters()
  {
    return videoDecoderCounters;
  }
  
  public Format getVideoFormat()
  {
    return videoFormat;
  }
  
  public int getVideoScalingMode()
  {
    return videoScalingMode;
  }
  
  public float getVolume()
  {
    return audioVolume;
  }
  
  public boolean isLoading()
  {
    verifyApplicationThread();
    return player.isLoading();
  }
  
  public boolean isPlayingAd()
  {
    verifyApplicationThread();
    return player.isPlayingAd();
  }
  
  public void prepare(MediaSource paramMediaSource)
  {
    prepare(paramMediaSource, true, true);
  }
  
  public void prepare(MediaSource paramMediaSource, boolean paramBoolean1, boolean paramBoolean2)
  {
    verifyApplicationThread();
    MediaSource localMediaSource = mediaSource;
    if (localMediaSource != null)
    {
      localMediaSource.removeEventListener(analyticsCollector);
      analyticsCollector.resetForNewMediaSource();
    }
    mediaSource = paramMediaSource;
    paramMediaSource.addEventListener(eventHandler, analyticsCollector);
    int i = audioFocusManager.handlePrepare(getPlayWhenReady());
    updatePlayWhenReady(getPlayWhenReady(), i);
    player.prepare(paramMediaSource, paramBoolean1, paramBoolean2);
  }
  
  public void release()
  {
    audioFocusManager.handleStop();
    player.release();
    removeSurfaceCallbacks();
    Object localObject = surface;
    if (localObject != null)
    {
      if (ownsSurface) {
        ((Surface)localObject).release();
      }
      surface = null;
    }
    localObject = mediaSource;
    if (localObject != null)
    {
      ((MediaSource)localObject).removeEventListener(analyticsCollector);
      mediaSource = null;
    }
    bandwidthMeter.removeEventListener(analyticsCollector);
    currentCues = Collections.emptyList();
  }
  
  public void removeAnalyticsListener(AnalyticsListener paramAnalyticsListener)
  {
    verifyApplicationThread();
    analyticsCollector.removeListener(paramAnalyticsListener);
  }
  
  @Deprecated
  public void removeAudioDebugListener(AudioRendererEventListener paramAudioRendererEventListener)
  {
    audioDebugListeners.remove(paramAudioRendererEventListener);
  }
  
  public void removeAudioListener(AudioListener paramAudioListener)
  {
    audioListeners.remove(paramAudioListener);
  }
  
  public void removeListener(Player.EventListener paramEventListener)
  {
    verifyApplicationThread();
    player.removeListener(paramEventListener);
  }
  
  public void removeMetadataOutput(MetadataOutput paramMetadataOutput)
  {
    metadataOutputs.remove(paramMetadataOutput);
  }
  
  public void removeTextOutput(TextOutput paramTextOutput)
  {
    textOutputs.remove(paramTextOutput);
  }
  
  @Deprecated
  public void removeVideoDebugListener(VideoRendererEventListener paramVideoRendererEventListener)
  {
    videoDebugListeners.remove(paramVideoRendererEventListener);
  }
  
  public void removeVideoListener(VideoListener paramVideoListener)
  {
    videoListeners.remove(paramVideoListener);
  }
  
  public void retry()
  {
    verifyApplicationThread();
    if ((mediaSource != null) && ((getPlaybackError() != null) || (getPlaybackState() == 1))) {
      prepare(mediaSource, false, false);
    }
  }
  
  public void seekTo(int paramInt, long paramLong)
  {
    verifyApplicationThread();
    analyticsCollector.notifySeekStarted();
    player.seekTo(paramInt, paramLong);
  }
  
  @Deprecated
  public void sendMessages(ExoPlayer.ExoPlayerMessage... paramVarArgs)
  {
    player.sendMessages(paramVarArgs);
  }
  
  public void setAudioAttributes(AudioAttributes paramAudioAttributes)
  {
    setAudioAttributes(paramAudioAttributes, false);
  }
  
  public void setAudioAttributes(AudioAttributes paramAudioAttributes, boolean paramBoolean)
  {
    verifyApplicationThread();
    if (!Util.areEqual(audioAttributes, paramAudioAttributes))
    {
      audioAttributes = paramAudioAttributes;
      for (PlayerMessage.Target localTarget : renderers) {
        if (localTarget.getTrackType() == 1) {
          player.createMessage(localTarget).setType(3).setPayload(paramAudioAttributes).send();
        }
      }
      ??? = audioListeners.iterator();
      while (((Iterator)???).hasNext()) {
        ((AudioListener)((Iterator)???).next()).onAudioAttributesChanged(paramAudioAttributes);
      }
    }
    ??? = audioFocusManager;
    if (!paramBoolean) {
      paramAudioAttributes = null;
    }
    ??? = ((AudioFocusManager)???).setAudioAttributes(paramAudioAttributes, getPlayWhenReady(), getPlaybackState());
    updatePlayWhenReady(getPlayWhenReady(), ???);
  }
  
  @Deprecated
  public void setAudioDebugListener(AudioRendererEventListener paramAudioRendererEventListener)
  {
    audioDebugListeners.retainAll(Collections.singleton(analyticsCollector));
    if (paramAudioRendererEventListener != null) {
      addAudioDebugListener(paramAudioRendererEventListener);
    }
  }
  
  @Deprecated
  public void setAudioStreamType(int paramInt)
  {
    int i = Util.getAudioUsageForStreamType(paramInt);
    paramInt = Util.getAudioContentTypeForStreamType(paramInt);
    setAudioAttributes(new AudioAttributes.Builder().setUsage(i).setContentType(paramInt).build());
  }
  
  public void setAuxEffectInfo(AuxEffectInfo paramAuxEffectInfo)
  {
    verifyApplicationThread();
    for (Renderer localRenderer : renderers) {
      if (localRenderer.getTrackType() == 1) {
        player.createMessage(localRenderer).setType(5).setPayload(paramAuxEffectInfo).send();
      }
    }
  }
  
  public void setCameraMotionListener(CameraMotionListener paramCameraMotionListener)
  {
    verifyApplicationThread();
    cameraMotionListener = paramCameraMotionListener;
    for (Renderer localRenderer : renderers) {
      if (localRenderer.getTrackType() == 5) {
        player.createMessage(localRenderer).setType(7).setPayload(paramCameraMotionListener).send();
      }
    }
  }
  
  @Deprecated
  public void setMetadataOutput(MetadataOutput paramMetadataOutput)
  {
    metadataOutputs.retainAll(Collections.singleton(analyticsCollector));
    if (paramMetadataOutput != null) {
      addMetadataOutput(paramMetadataOutput);
    }
  }
  
  public void setPlayWhenReady(boolean paramBoolean)
  {
    verifyApplicationThread();
    updatePlayWhenReady(paramBoolean, audioFocusManager.handleSetPlayWhenReady(paramBoolean, getPlaybackState()));
  }
  
  public void setPlaybackParameters(@Nullable PlaybackParameters paramPlaybackParameters)
  {
    verifyApplicationThread();
    player.setPlaybackParameters(paramPlaybackParameters);
  }
  
  @Deprecated
  @TargetApi(23)
  public void setPlaybackParams(@Nullable PlaybackParams paramPlaybackParams)
  {
    if (paramPlaybackParams != null)
    {
      paramPlaybackParams.allowDefaults();
      paramPlaybackParams = new PlaybackParameters(paramPlaybackParams.getSpeed(), paramPlaybackParams.getPitch());
    }
    else
    {
      paramPlaybackParams = null;
    }
    setPlaybackParameters(paramPlaybackParams);
  }
  
  public void setRepeatMode(int paramInt)
  {
    verifyApplicationThread();
    player.setRepeatMode(paramInt);
  }
  
  public void setSeekParameters(@Nullable SeekParameters paramSeekParameters)
  {
    verifyApplicationThread();
    player.setSeekParameters(paramSeekParameters);
  }
  
  public void setShuffleModeEnabled(boolean paramBoolean)
  {
    verifyApplicationThread();
    player.setShuffleModeEnabled(paramBoolean);
  }
  
  @Deprecated
  public void setTextOutput(TextOutput paramTextOutput)
  {
    textOutputs.clear();
    if (paramTextOutput != null) {
      addTextOutput(paramTextOutput);
    }
  }
  
  @Deprecated
  public void setVideoDebugListener(VideoRendererEventListener paramVideoRendererEventListener)
  {
    videoDebugListeners.retainAll(Collections.singleton(analyticsCollector));
    if (paramVideoRendererEventListener != null) {
      addVideoDebugListener(paramVideoRendererEventListener);
    }
  }
  
  public void setVideoFrameMetadataListener(VideoFrameMetadataListener paramVideoFrameMetadataListener)
  {
    verifyApplicationThread();
    videoFrameMetadataListener = paramVideoFrameMetadataListener;
    for (Renderer localRenderer : renderers) {
      if (localRenderer.getTrackType() == 2) {
        player.createMessage(localRenderer).setType(6).setPayload(paramVideoFrameMetadataListener).send();
      }
    }
  }
  
  @Deprecated
  public void setVideoListener(VideoListener paramVideoListener)
  {
    videoListeners.clear();
    if (paramVideoListener != null) {
      addVideoListener(paramVideoListener);
    }
  }
  
  public void setVideoScalingMode(int paramInt)
  {
    verifyApplicationThread();
    videoScalingMode = paramInt;
    for (Renderer localRenderer : renderers) {
      if (localRenderer.getTrackType() == 2) {
        player.createMessage(localRenderer).setType(4).setPayload(Integer.valueOf(paramInt)).send();
      }
    }
  }
  
  public void setVideoSurface(@Nullable Surface paramSurface)
  {
    verifyApplicationThread();
    removeSurfaceCallbacks();
    int i = 0;
    setVideoSurfaceInternal(paramSurface, false);
    if (paramSurface != null) {
      i = -1;
    }
    maybeNotifySurfaceSizeChanged(i, i);
  }
  
  public void setVideoSurfaceHolder(SurfaceHolder paramSurfaceHolder)
  {
    verifyApplicationThread();
    removeSurfaceCallbacks();
    surfaceHolder = paramSurfaceHolder;
    if (paramSurfaceHolder == null)
    {
      setVideoSurfaceInternal(null, false);
      maybeNotifySurfaceSizeChanged(0, 0);
    }
    else
    {
      paramSurfaceHolder.addCallback(componentListener);
      Surface localSurface = paramSurfaceHolder.getSurface();
      if ((localSurface != null) && (localSurface.isValid()))
      {
        setVideoSurfaceInternal(localSurface, false);
        paramSurfaceHolder = paramSurfaceHolder.getSurfaceFrame();
        maybeNotifySurfaceSizeChanged(paramSurfaceHolder.width(), paramSurfaceHolder.height());
      }
      else
      {
        setVideoSurfaceInternal(null, false);
        maybeNotifySurfaceSizeChanged(0, 0);
      }
    }
  }
  
  public void setVideoSurfaceView(SurfaceView paramSurfaceView)
  {
    if (paramSurfaceView == null) {
      paramSurfaceView = null;
    } else {
      paramSurfaceView = paramSurfaceView.getHolder();
    }
    setVideoSurfaceHolder(paramSurfaceView);
  }
  
  public void setVideoTextureView(TextureView paramTextureView)
  {
    verifyApplicationThread();
    removeSurfaceCallbacks();
    textureView = paramTextureView;
    if (paramTextureView == null)
    {
      setVideoSurfaceInternal(null, true);
      maybeNotifySurfaceSizeChanged(0, 0);
    }
    else
    {
      if (paramTextureView.getSurfaceTextureListener() != null) {
        Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
      }
      paramTextureView.setSurfaceTextureListener(componentListener);
      SurfaceTexture localSurfaceTexture;
      if (paramTextureView.isAvailable()) {
        localSurfaceTexture = paramTextureView.getSurfaceTexture();
      } else {
        localSurfaceTexture = null;
      }
      if (localSurfaceTexture == null)
      {
        setVideoSurfaceInternal(null, true);
        maybeNotifySurfaceSizeChanged(0, 0);
      }
      else
      {
        setVideoSurfaceInternal(new Surface(localSurfaceTexture), true);
        maybeNotifySurfaceSizeChanged(paramTextureView.getWidth(), paramTextureView.getHeight());
      }
    }
  }
  
  public void setVolume(float paramFloat)
  {
    verifyApplicationThread();
    paramFloat = Util.constrainValue(paramFloat, 0.0F, 1.0F);
    if (audioVolume == paramFloat) {
      return;
    }
    audioVolume = paramFloat;
    sendVolumeToRenderers();
    Iterator localIterator = audioListeners.iterator();
    while (localIterator.hasNext()) {
      ((AudioListener)localIterator.next()).onVolumeChanged(paramFloat);
    }
  }
  
  public void stop(boolean paramBoolean)
  {
    verifyApplicationThread();
    player.stop(paramBoolean);
    MediaSource localMediaSource = mediaSource;
    if (localMediaSource != null)
    {
      localMediaSource.removeEventListener(analyticsCollector);
      analyticsCollector.resetForNewMediaSource();
      if (paramBoolean) {
        mediaSource = null;
      }
    }
    audioFocusManager.handleStop();
    currentCues = Collections.emptyList();
  }
  
  public final class ComponentListener
    implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, AudioFocusManager.PlayerControl
  {
    private ComponentListener() {}
    
    public void executePlayerCommand(int paramInt)
    {
      SimpleExoPlayer localSimpleExoPlayer = SimpleExoPlayer.this;
      SimpleExoPlayer.access$1700(localSimpleExoPlayer, localSimpleExoPlayer.getPlayWhenReady(), paramInt);
    }
    
    public void onAudioDecoderInitialized(String paramString, long paramLong1, long paramLong2)
    {
      Iterator localIterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((AudioRendererEventListener)localIterator.next()).onAudioDecoderInitialized(paramString, paramLong1, paramLong2);
      }
    }
    
    public void onAudioDisabled(DecoderCounters paramDecoderCounters)
    {
      Iterator localIterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((AudioRendererEventListener)localIterator.next()).onAudioDisabled(paramDecoderCounters);
      }
      SimpleExoPlayer.access$1002(SimpleExoPlayer.this, null);
      SimpleExoPlayer.access$602(SimpleExoPlayer.this, null);
      SimpleExoPlayer.access$802(SimpleExoPlayer.this, 0);
    }
    
    public void onAudioEnabled(DecoderCounters paramDecoderCounters)
    {
      SimpleExoPlayer.access$602(SimpleExoPlayer.this, paramDecoderCounters);
      Iterator localIterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((AudioRendererEventListener)localIterator.next()).onAudioEnabled(paramDecoderCounters);
      }
    }
    
    public void onAudioInputFormatChanged(Format paramFormat)
    {
      SimpleExoPlayer.access$1002(SimpleExoPlayer.this, paramFormat);
      Iterator localIterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((AudioRendererEventListener)localIterator.next()).onAudioInputFormatChanged(paramFormat);
      }
    }
    
    public void onAudioSessionId(int paramInt)
    {
      if (SimpleExoPlayer.access$800(SimpleExoPlayer.this) == paramInt) {
        return;
      }
      SimpleExoPlayer.access$802(SimpleExoPlayer.this, paramInt);
      Iterator localIterator = SimpleExoPlayer.access$900(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext())
      {
        AudioListener localAudioListener = (AudioListener)localIterator.next();
        if (!SimpleExoPlayer.access$700(SimpleExoPlayer.this).contains(localAudioListener)) {
          localAudioListener.onAudioSessionId(paramInt);
        }
      }
      localIterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((AudioRendererEventListener)localIterator.next()).onAudioSessionId(paramInt);
      }
    }
    
    public void onAudioSinkUnderrun(int paramInt, long paramLong1, long paramLong2)
    {
      Iterator localIterator = SimpleExoPlayer.access$700(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((AudioRendererEventListener)localIterator.next()).onAudioSinkUnderrun(paramInt, paramLong1, paramLong2);
      }
    }
    
    public void onCues(List<Cue> paramList)
    {
      SimpleExoPlayer.access$1102(SimpleExoPlayer.this, paramList);
      Iterator localIterator = SimpleExoPlayer.access$1200(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((TextOutput)localIterator.next()).onCues(paramList);
      }
    }
    
    public void onDroppedFrames(int paramInt, long paramLong)
    {
      Iterator localIterator = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((VideoRendererEventListener)localIterator.next()).onDroppedFrames(paramInt, paramLong);
      }
    }
    
    public void onMetadata(Metadata paramMetadata)
    {
      Iterator localIterator = SimpleExoPlayer.access$1300(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((MetadataOutput)localIterator.next()).onMetadata(paramMetadata);
      }
    }
    
    public void onRenderedFirstFrame(Surface paramSurface)
    {
      if (SimpleExoPlayer.access$500(SimpleExoPlayer.this) == paramSurface)
      {
        localIterator = SimpleExoPlayer.access$400(SimpleExoPlayer.this).iterator();
        while (localIterator.hasNext()) {
          ((VideoListener)localIterator.next()).onRenderedFirstFrame();
        }
      }
      Iterator localIterator = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((VideoRendererEventListener)localIterator.next()).onRenderedFirstFrame(paramSurface);
      }
    }
    
    public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      SimpleExoPlayer.access$1400(SimpleExoPlayer.this, new Surface(paramSurfaceTexture), true);
      SimpleExoPlayer.access$1500(SimpleExoPlayer.this, paramInt1, paramInt2);
    }
    
    public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
    {
      SimpleExoPlayer.access$1400(SimpleExoPlayer.this, null, true);
      SimpleExoPlayer.access$1500(SimpleExoPlayer.this, 0, 0);
      return true;
    }
    
    public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
    {
      SimpleExoPlayer.access$1500(SimpleExoPlayer.this, paramInt1, paramInt2);
    }
    
    public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
    
    public void onVideoDecoderInitialized(String paramString, long paramLong1, long paramLong2)
    {
      Iterator localIterator = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((VideoRendererEventListener)localIterator.next()).onVideoDecoderInitialized(paramString, paramLong1, paramLong2);
      }
    }
    
    public void onVideoDisabled(DecoderCounters paramDecoderCounters)
    {
      Iterator localIterator = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((VideoRendererEventListener)localIterator.next()).onVideoDisabled(paramDecoderCounters);
      }
      SimpleExoPlayer.access$302(SimpleExoPlayer.this, null);
      SimpleExoPlayer.access$102(SimpleExoPlayer.this, null);
    }
    
    public void onVideoEnabled(DecoderCounters paramDecoderCounters)
    {
      SimpleExoPlayer.access$102(SimpleExoPlayer.this, paramDecoderCounters);
      Iterator localIterator = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((VideoRendererEventListener)localIterator.next()).onVideoEnabled(paramDecoderCounters);
      }
    }
    
    public void onVideoInputFormatChanged(Format paramFormat)
    {
      SimpleExoPlayer.access$302(SimpleExoPlayer.this, paramFormat);
      Iterator localIterator = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((VideoRendererEventListener)localIterator.next()).onVideoInputFormatChanged(paramFormat);
      }
    }
    
    public void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
    {
      Iterator localIterator = SimpleExoPlayer.access$400(SimpleExoPlayer.this).iterator();
      while (localIterator.hasNext())
      {
        localObject = (VideoListener)localIterator.next();
        if (!SimpleExoPlayer.access$200(SimpleExoPlayer.this).contains(localObject)) {
          ((VideoListener)localObject).onVideoSizeChanged(paramInt1, paramInt2, paramInt3, paramFloat);
        }
      }
      Object localObject = SimpleExoPlayer.access$200(SimpleExoPlayer.this).iterator();
      while (((Iterator)localObject).hasNext()) {
        ((VideoRendererEventListener)((Iterator)localObject).next()).onVideoSizeChanged(paramInt1, paramInt2, paramInt3, paramFloat);
      }
    }
    
    public void setVolumeMultiplier(float paramFloat)
    {
      SimpleExoPlayer.access$1600(SimpleExoPlayer.this);
    }
    
    public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
    {
      SimpleExoPlayer.access$1500(SimpleExoPlayer.this, paramInt2, paramInt3);
    }
    
    public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
    {
      SimpleExoPlayer.access$1400(SimpleExoPlayer.this, paramSurfaceHolder.getSurface(), false);
    }
    
    public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
    {
      SimpleExoPlayer.access$1400(SimpleExoPlayer.this, null, false);
      SimpleExoPlayer.access$1500(SimpleExoPlayer.this, 0, 0);
    }
  }
  
  @Deprecated
  public static abstract interface VideoListener
    extends VideoListener
  {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.SimpleExoPlayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */