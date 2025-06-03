package com.devbrackets.android.exomedia.core.exoplayer;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.collection.ArrayMap;
import com.devbrackets.android.exomedia.ExoMedia.Data;
import com.devbrackets.android.exomedia.ExoMedia.RendererType;
import com.devbrackets.android.exomedia.core.listener.CaptionListener;
import com.devbrackets.android.exomedia.core.listener.ExoPlayerListener;
import com.devbrackets.android.exomedia.core.listener.InternalErrorListener;
import com.devbrackets.android.exomedia.core.listener.MetadataListener;
import com.devbrackets.android.exomedia.core.renderer.RendererProvider;
import com.devbrackets.android.exomedia.core.source.MediaSourceProvider;
import com.devbrackets.android.exomedia.listener.OnBufferUpdateListener;
import com.devbrackets.android.exomedia.listener.OnSeekCompletionListener;
import com.devbrackets.android.exomedia.util.Repeater;
import com.devbrackets.android.exomedia.util.Repeater.RepeatListener;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Player.DefaultEventListener;
import com.google.android.exoplayer2.Player.EventListener;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.Renderer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Timeline.Window;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsCollector.Factory;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes.Builder;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.ExoMediaDrm.KeyRequest;
import com.google.android.exoplayer2.drm.ExoMediaDrm.ProvisionRequest;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.drm.FrameworkMediaDrm;
import com.google.android.exoplayer2.drm.MediaDrmCallback;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection.Factory;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector.ParametersBuilder;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class ExoMediaPlayer
  extends Player.DefaultEventListener
{
  private static final int BUFFER_REPEAT_DELAY = 1000;
  private static final String TAG = "ExoMediaPlayer";
  private static final int WAKE_LOCK_TIMEOUT = 1000;
  @NonNull
  private final AdaptiveTrackSelection.Factory adaptiveTrackSelectionFactory;
  @NonNull
  private AnalyticsCollector analyticsCollector;
  private int audioSessionId = 0;
  @NonNull
  private DefaultBandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
  @NonNull
  private Repeater bufferRepeater = new Repeater();
  @Nullable
  private OnBufferUpdateListener bufferUpdateListener;
  @NonNull
  private CapabilitiesListener capabilitiesListener = new CapabilitiesListener(null);
  @Nullable
  private CaptionListener captionListener;
  @NonNull
  private final Context context;
  @Nullable
  private MediaDrmCallback drmCallback;
  @Nullable
  private InternalErrorListener internalErrorListener;
  @NonNull
  private final CopyOnWriteArrayList<ExoPlayerListener> listeners = new CopyOnWriteArrayList();
  @NonNull
  private final Handler mainHandler;
  @Nullable
  private MediaSource mediaSource;
  @Nullable
  private MetadataListener metadataListener;
  @NonNull
  private final ExoPlayer player;
  private boolean prepared = false;
  @NonNull
  private List<Renderer> renderers;
  @FloatRange(from=0.0D, to=1.0D)
  public float requestedVolume = 1.0F;
  @NonNull
  private StateStore stateStore = new StateStore(null);
  @NonNull
  private final AtomicBoolean stopped = new AtomicBoolean();
  @Nullable
  private Surface surface;
  @NonNull
  private final DefaultTrackSelector trackSelector;
  @Nullable
  private PowerManager.WakeLock wakeLock = null;
  
  public ExoMediaPlayer(@NonNull Context paramContext)
  {
    context = paramContext;
    bufferRepeater.setRepeaterDelay(1000);
    bufferRepeater.setRepeatListener(new BufferRepeatListener(null));
    Object localObject1 = new Handler();
    mainHandler = ((Handler)localObject1);
    Object localObject2 = new ComponentListener(null);
    paramContext = new RendererProvider(paramContext, (Handler)localObject1, (TextOutput)localObject2, (MetadataOutput)localObject2, (AudioRendererEventListener)localObject2, (VideoRendererEventListener)localObject2);
    localObject2 = generateDrmSessionManager();
    paramContext.setDrmSessionManager((DrmSessionManager)localObject2);
    renderers = paramContext.generate();
    paramContext = new AdaptiveTrackSelection.Factory(bandwidthMeter);
    adaptiveTrackSelectionFactory = paramContext;
    localObject1 = new DefaultTrackSelector(paramContext);
    trackSelector = ((DefaultTrackSelector)localObject1);
    if (ExoMedia.Data.loadControl != null) {
      paramContext = ExoMedia.Data.loadControl;
    } else {
      paramContext = new DefaultLoadControl();
    }
    List localList = renderers;
    paramContext = ExoPlayerFactory.newInstance((Renderer[])localList.toArray(new Renderer[localList.size()]), (TrackSelector)localObject1, paramContext);
    player = paramContext;
    paramContext.addListener(this);
    localObject1 = new AnalyticsCollector.Factory().createAnalyticsCollector(paramContext, Clock.DEFAULT);
    analyticsCollector = ((AnalyticsCollector)localObject1);
    paramContext.addListener((Player.EventListener)localObject1);
    setupDamSessionManagerAnalytics((DrmSessionManager)localObject2);
  }
  
  private void reportPlayerState()
  {
    boolean bool1 = player.getPlayWhenReady();
    int i = getPlaybackState();
    int j = stateStore.getState(bool1, i);
    if (j != stateStore.getMostRecentState())
    {
      stateStore.setMostRecentState(bool1, i);
      if (j == 3) {
        setBufferRepeaterStarted(true);
      } else if ((j == 1) || (j == 4)) {
        setBufferRepeaterStarted(false);
      }
      boolean bool2 = stateStore.matchesHistory(new int[] { 100, 2, 3 }, true);
      boolean bool3 = stateStore.matchesHistory(new int[] { 2, 100, 3 }, true);
      boolean bool4 = stateStore.matchesHistory(new int[] { 100, 3, 2, 3 }, true);
      Iterator localIterator = listeners.iterator();
      while (localIterator.hasNext())
      {
        ExoPlayerListener localExoPlayerListener = (ExoPlayerListener)localIterator.next();
        localExoPlayerListener.onStateChanged(bool1, i);
        if ((bool2 | bool3 | bool4)) {
          localExoPlayerListener.onSeekComplete();
        }
      }
    }
  }
  
  private void setBufferRepeaterStarted(boolean paramBoolean)
  {
    if ((paramBoolean) && (bufferUpdateListener != null)) {
      bufferRepeater.start();
    } else {
      bufferRepeater.stop();
    }
  }
  
  public void addAnalyticsListener(AnalyticsListener paramAnalyticsListener)
  {
    analyticsCollector.addListener(paramAnalyticsListener);
  }
  
  public void addListener(ExoPlayerListener paramExoPlayerListener)
  {
    if (paramExoPlayerListener != null) {
      listeners.add(paramExoPlayerListener);
    }
  }
  
  @Deprecated
  public void blockingClearSurface()
  {
    clearSurface();
  }
  
  public void blockingSendMessages(List<PlayerMessage> paramList)
  {
    paramList = paramList.iterator();
    int i = 0;
    if (paramList.hasNext())
    {
      PlayerMessage localPlayerMessage = (PlayerMessage)paramList.next();
      int j = 1;
      int k = i;
      for (;;)
      {
        i = k;
        if (j == 0) {
          break;
        }
        try
        {
          localPlayerMessage.blockUntilDelivered();
          j = 0;
        }
        catch (InterruptedException localInterruptedException)
        {
          k = 1;
        }
      }
    }
    if (i != 0) {
      Thread.currentThread().interrupt();
    }
  }
  
  public void clearSelectedTracks(@NonNull ExoMedia.RendererType paramRendererType)
  {
    Object localObject = getExoPlayerTracksInfo(paramRendererType, 0, trackSelector.getCurrentMappedTrackInfo());
    paramRendererType = trackSelector.buildUponParameters();
    localObject = rendererTrackIndexes.iterator();
    while (((Iterator)localObject).hasNext())
    {
      int i = ((Integer)((Iterator)localObject).next()).intValue();
      paramRendererType.setRendererDisabled(i, false).clearSelectionOverrides(i);
    }
    trackSelector.setParameters(paramRendererType);
  }
  
  public void clearSurface()
  {
    Surface localSurface = surface;
    if (localSurface != null) {
      localSurface.release();
    }
    surface = null;
    sendMessage(2, 1, null, false);
  }
  
  public void forcePrepare()
  {
    prepared = false;
  }
  
  @Nullable
  public DrmSessionManager<FrameworkMediaCrypto> generateDrmSessionManager()
  {
    UUID localUUID = C.WIDEVINE_UUID;
    try
    {
      DefaultDrmSessionManager localDefaultDrmSessionManager = new com/google/android/exoplayer2/drm/DefaultDrmSessionManager;
      FrameworkMediaDrm localFrameworkMediaDrm = FrameworkMediaDrm.newInstance(localUUID);
      DelegatedMediaDrmCallback localDelegatedMediaDrmCallback = new com/devbrackets/android/exomedia/core/exoplayer/ExoMediaPlayer$DelegatedMediaDrmCallback;
      localDelegatedMediaDrmCallback.<init>(this, null);
      localDefaultDrmSessionManager.<init>(localUUID, localFrameworkMediaDrm, localDelegatedMediaDrmCallback, null);
      localDefaultDrmSessionManager.addListener(mainHandler, capabilitiesListener);
      return localDefaultDrmSessionManager;
    }
    catch (Exception localException)
    {
      Log.d("ExoMediaPlayer", "Unable to create a DrmSessionManager due to an exception", localException);
    }
    return null;
  }
  
  @NonNull
  public AnalyticsCollector getAnalyticsCollector()
  {
    return analyticsCollector;
  }
  
  public int getAudioSessionId()
  {
    return audioSessionId;
  }
  
  @Nullable
  public Map<ExoMedia.RendererType, TrackGroupArray> getAvailableTracks()
  {
    if (getPlaybackState() == 1) {
      return null;
    }
    ArrayMap localArrayMap = new ArrayMap();
    MappingTrackSelector.MappedTrackInfo localMappedTrackInfo = trackSelector.getCurrentMappedTrackInfo();
    if (localMappedTrackInfo == null) {
      return localArrayMap;
    }
    ExoMedia.RendererType localRendererType1 = ExoMedia.RendererType.AUDIO;
    ExoMedia.RendererType localRendererType2 = ExoMedia.RendererType.VIDEO;
    ExoMedia.RendererType localRendererType3 = ExoMedia.RendererType.CLOSED_CAPTION;
    ExoMedia.RendererType localRendererType4 = ExoMedia.RendererType.METADATA;
    for (int i = 0; i < 4; i++)
    {
      ExoMedia.RendererType localRendererType5 = new ExoMedia.RendererType[] { localRendererType1, localRendererType2, localRendererType3, localRendererType4 }[i];
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = getExoPlayerTracksInfo0rendererTrackIndexes.iterator();
      while (localIterator.hasNext())
      {
        TrackGroupArray localTrackGroupArray = localMappedTrackInfo.getTrackGroups(((Integer)localIterator.next()).intValue());
        for (int j = 0; j < length; j++) {
          localArrayList.add(localTrackGroupArray.get(j));
        }
      }
      if (!localArrayList.isEmpty()) {
        localArrayMap.put(localRendererType5, new TrackGroupArray((TrackGroup[])localArrayList.toArray(new TrackGroup[localArrayList.size()])));
      }
    }
    return localArrayMap;
  }
  
  @NonNull
  public BandwidthMeter getBandwidthMeter()
  {
    return bandwidthMeter;
  }
  
  public int getBufferedPercentage()
  {
    return player.getBufferedPercentage();
  }
  
  public long getCurrentPosition()
  {
    return getCurrentPosition(false);
  }
  
  public long getCurrentPosition(boolean paramBoolean)
  {
    long l1 = player.getCurrentPosition();
    if (paramBoolean) {
      return l1;
    }
    Timeline localTimeline = player.getCurrentTimeline();
    int i = Math.min(localTimeline.getWindowCount() - 1, player.getCurrentWindowIndex());
    long l2 = 0L;
    Timeline.Window localWindow = new Timeline.Window();
    for (int j = 0; j < i; j++)
    {
      localTimeline.getWindow(j, localWindow);
      l2 += localWindow.getDurationMs();
    }
    return l2 + l1;
  }
  
  public long getDuration()
  {
    return player.getDuration();
  }
  
  public ExoMedia.RendererType getExoMediaRendererType(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4) {
            return null;
          }
          return ExoMedia.RendererType.METADATA;
        }
        return ExoMedia.RendererType.CLOSED_CAPTION;
      }
      return ExoMedia.RendererType.VIDEO;
    }
    return ExoMedia.RendererType.AUDIO;
  }
  
  @NonNull
  public ExoPlayer getExoPlayer()
  {
    return player;
  }
  
  public int getExoPlayerTrackType(@NonNull ExoMedia.RendererType paramRendererType)
  {
    int i = 1.$SwitchMap$com$devbrackets$android$exomedia$ExoMedia$RendererType[paramRendererType.ordinal()];
    int j = 1;
    if (i != 1)
    {
      j = 2;
      if (i != 2)
      {
        j = 3;
        if (i != 3)
        {
          j = 4;
          if (i != 4) {
            return -1;
          }
        }
      }
    }
    return j;
  }
  
  public ExoPlayerRendererTracksInfo getExoPlayerTracksInfo(@NonNull ExoMedia.RendererType paramRendererType, int paramInt, MappingTrackSelector.MappedTrackInfo paramMappedTrackInfo)
  {
    ArrayList localArrayList = new ArrayList();
    int i = -1;
    int k;
    if (paramMappedTrackInfo != null)
    {
      int j = 0;
      i = -1;
      k = i;
      int m = 0;
      while (j < paramMappedTrackInfo.getRendererCount())
      {
        int n = m;
        int i1 = i;
        int i2 = k;
        if (paramRendererType == getExoMediaRendererType(paramMappedTrackInfo.getRendererType(j)))
        {
          localArrayList.add(Integer.valueOf(j));
          n = getTrackGroupslength;
          if (m + n > paramInt)
          {
            n = m;
            i1 = i;
            i2 = k;
            if (i == -1)
            {
              i2 = paramInt - m;
              i1 = j;
              n = m;
            }
          }
          else
          {
            n = m + n;
            i2 = k;
            i1 = i;
          }
        }
        j++;
        m = n;
        i = i1;
        k = i2;
      }
      paramInt = i;
    }
    else
    {
      k = -1;
      paramInt = i;
    }
    return new ExoPlayerRendererTracksInfo(localArrayList, paramInt, k);
  }
  
  public boolean getPlayWhenReady()
  {
    return player.getPlayWhenReady();
  }
  
  public float getPlaybackSpeed()
  {
    return player.getPlaybackParameters().speed;
  }
  
  public int getPlaybackState()
  {
    return player.getPlaybackState();
  }
  
  public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType paramRendererType)
  {
    return getSelectedTrackIndex(paramRendererType, 0);
  }
  
  public int getSelectedTrackIndex(@NonNull ExoMedia.RendererType paramRendererType, int paramInt)
  {
    MappingTrackSelector.MappedTrackInfo localMappedTrackInfo = trackSelector.getCurrentMappedTrackInfo();
    ExoPlayerRendererTracksInfo localExoPlayerRendererTracksInfo = getExoPlayerTracksInfo(paramRendererType, paramInt, localMappedTrackInfo);
    paramInt = rendererTrackIndex;
    if (paramInt == -1) {
      paramRendererType = null;
    } else {
      paramRendererType = localMappedTrackInfo.getTrackGroups(paramInt);
    }
    if ((paramRendererType != null) && (length != 0))
    {
      paramRendererType = trackSelector.getParameters().getSelectionOverride(rendererTrackIndex, paramRendererType);
      if ((paramRendererType != null) && (groupIndex == rendererTrackGroupIndex) && (length > 0)) {
        return tracks[0];
      }
    }
    return -1;
  }
  
  @Nullable
  public Surface getSurface()
  {
    return surface;
  }
  
  @FloatRange(from=0.0D, to=1.0D)
  public float getVolume()
  {
    return requestedVolume;
  }
  
  @Nullable
  public WindowInfo getWindowInfo()
  {
    Object localObject = player.getCurrentTimeline();
    if (((Timeline)localObject).isEmpty()) {
      return null;
    }
    int i = player.getCurrentWindowIndex();
    localObject = ((Timeline)localObject).getWindow(i, new Timeline.Window(), true);
    return new WindowInfo(player.getPreviousWindowIndex(), i, player.getNextWindowIndex(), (Timeline.Window)localObject);
  }
  
  public boolean isRendererEnabled(@NonNull ExoMedia.RendererType paramRendererType)
  {
    Object localObject = getExoPlayerTracksInfo(paramRendererType, 0, trackSelector.getCurrentMappedTrackInfo());
    paramRendererType = trackSelector.getParameters();
    localObject = rendererTrackIndexes.iterator();
    while (((Iterator)localObject).hasNext()) {
      if (!paramRendererType.getRendererDisabled(((Integer)((Iterator)localObject).next()).intValue())) {
        return true;
      }
    }
    return false;
  }
  
  public void onPlayerError(ExoPlaybackException paramExoPlaybackException)
  {
    Iterator localIterator = listeners.iterator();
    while (localIterator.hasNext()) {
      ((ExoPlayerListener)localIterator.next()).onError(this, paramExoPlaybackException);
    }
  }
  
  public void onPlayerStateChanged(boolean paramBoolean, int paramInt)
  {
    reportPlayerState();
  }
  
  public void prepare()
  {
    if ((!prepared) && (mediaSource != null))
    {
      if (!renderers.isEmpty()) {
        player.stop();
      }
      stateStore.reset();
      player.prepare(mediaSource);
      prepared = true;
      stopped.set(false);
    }
  }
  
  public void release()
  {
    setBufferRepeaterStarted(false);
    listeners.clear();
    MediaSource localMediaSource = mediaSource;
    if (localMediaSource != null) {
      localMediaSource.removeEventListener(analyticsCollector);
    }
    surface = null;
    player.release();
    stayAwake(false);
  }
  
  public void removeAnalyticsListener(AnalyticsListener paramAnalyticsListener)
  {
    analyticsCollector.removeListener(paramAnalyticsListener);
  }
  
  public void removeListener(ExoPlayerListener paramExoPlayerListener)
  {
    if (paramExoPlayerListener != null) {
      listeners.remove(paramExoPlayerListener);
    }
  }
  
  public boolean restart()
  {
    int i = getPlaybackState();
    if ((i != 1) && (i != 4)) {
      return false;
    }
    seekTo(0L);
    setPlayWhenReady(true);
    forcePrepare();
    prepare();
    return true;
  }
  
  public void seekTo(long paramLong)
  {
    seekTo(paramLong, false);
  }
  
  public void seekTo(long paramLong, boolean paramBoolean)
  {
    analyticsCollector.notifySeekStarted();
    if (paramBoolean)
    {
      player.seekTo(paramLong);
      localObject = stateStore;
      ((StateStore)localObject).setMostRecentState(((StateStore)localObject).isLastReportedPlayWhenReady(), 100);
      return;
    }
    Object localObject = player.getCurrentTimeline();
    int i = ((Timeline)localObject).getWindowCount();
    long l1 = 0L;
    Timeline.Window localWindow = new Timeline.Window();
    for (int j = 0; j < i; j++)
    {
      ((Timeline)localObject).getWindow(j, localWindow);
      long l2 = localWindow.getDurationMs();
      if ((l1 < paramLong) && (paramLong <= l1 + l2))
      {
        player.seekTo(j, paramLong - l1);
        localObject = stateStore;
        ((StateStore)localObject).setMostRecentState(((StateStore)localObject).isLastReportedPlayWhenReady(), 100);
        return;
      }
      l1 += l2;
    }
    Log.e("ExoMediaPlayer", "Unable to seek across windows, falling back to in-window seeking");
    player.seekTo(paramLong);
    localObject = stateStore;
    ((StateStore)localObject).setMostRecentState(((StateStore)localObject).isLastReportedPlayWhenReady(), 100);
  }
  
  public void sendMessage(int paramInt1, int paramInt2, Object paramObject)
  {
    sendMessage(paramInt1, paramInt2, paramObject, false);
  }
  
  public void sendMessage(int paramInt1, int paramInt2, Object paramObject, boolean paramBoolean)
  {
    if (renderers.isEmpty()) {
      return;
    }
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = renderers.iterator();
    while (localIterator.hasNext())
    {
      Renderer localRenderer = (Renderer)localIterator.next();
      if (localRenderer.getTrackType() == paramInt1) {
        localArrayList.add(player.createMessage(localRenderer).setType(paramInt2).setPayload(paramObject));
      }
    }
    if (paramBoolean)
    {
      blockingSendMessages(localArrayList);
    }
    else
    {
      paramObject = localArrayList.iterator();
      while (((Iterator)paramObject).hasNext()) {
        ((PlayerMessage)((Iterator)paramObject).next()).send();
      }
    }
  }
  
  public void setAudioStreamType(int paramInt)
  {
    int i = Util.getAudioUsageForStreamType(paramInt);
    paramInt = Util.getAudioContentTypeForStreamType(paramInt);
    sendMessage(1, 3, new AudioAttributes.Builder().setUsage(i).setContentType(paramInt).build());
  }
  
  public void setBufferUpdateListener(@Nullable OnBufferUpdateListener paramOnBufferUpdateListener)
  {
    bufferUpdateListener = paramOnBufferUpdateListener;
    boolean bool;
    if (paramOnBufferUpdateListener != null) {
      bool = true;
    } else {
      bool = false;
    }
    setBufferRepeaterStarted(bool);
  }
  
  public void setCaptionListener(@Nullable CaptionListener paramCaptionListener)
  {
    captionListener = paramCaptionListener;
  }
  
  public void setDrmCallback(@Nullable MediaDrmCallback paramMediaDrmCallback)
  {
    drmCallback = paramMediaDrmCallback;
  }
  
  public void setInternalErrorListener(@Nullable InternalErrorListener paramInternalErrorListener)
  {
    internalErrorListener = paramInternalErrorListener;
  }
  
  public void setMediaSource(@Nullable MediaSource paramMediaSource)
  {
    MediaSource localMediaSource = mediaSource;
    if (localMediaSource != null)
    {
      localMediaSource.removeEventListener(analyticsCollector);
      analyticsCollector.resetForNewMediaSource();
    }
    if (paramMediaSource != null) {
      paramMediaSource.addEventListener(mainHandler, analyticsCollector);
    }
    mediaSource = paramMediaSource;
    prepared = false;
    prepare();
  }
  
  public void setMetadataListener(@Nullable MetadataListener paramMetadataListener)
  {
    metadataListener = paramMetadataListener;
  }
  
  public void setPlayWhenReady(boolean paramBoolean)
  {
    player.setPlayWhenReady(paramBoolean);
    stayAwake(paramBoolean);
  }
  
  public boolean setPlaybackSpeed(float paramFloat)
  {
    PlaybackParameters localPlaybackParameters = new PlaybackParameters(paramFloat, 1.0F);
    player.setPlaybackParameters(localPlaybackParameters);
    return true;
  }
  
  public void setRendererEnabled(@NonNull ExoMedia.RendererType paramRendererType, boolean paramBoolean)
  {
    MappingTrackSelector.MappedTrackInfo localMappedTrackInfo = trackSelector.getCurrentMappedTrackInfo();
    paramRendererType = getExoPlayerTracksInfo(paramRendererType, 0, localMappedTrackInfo);
    if (!rendererTrackIndexes.isEmpty())
    {
      DefaultTrackSelector.ParametersBuilder localParametersBuilder = trackSelector.buildUponParameters();
      Iterator localIterator = rendererTrackIndexes.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        int j = ((Integer)localIterator.next()).intValue();
        if (paramBoolean)
        {
          if (trackSelector.getParameters().getSelectionOverride(j, localMappedTrackInfo.getTrackGroups(j)) != null)
          {
            localParametersBuilder.setRendererDisabled(j, false);
            i = 1;
          }
        }
        else {
          localParametersBuilder.setRendererDisabled(j, true);
        }
      }
      if ((paramBoolean) && (i == 0)) {
        localParametersBuilder.setRendererDisabled(((Integer)rendererTrackIndexes.get(0)).intValue(), false);
      }
      trackSelector.setParameters(localParametersBuilder);
    }
  }
  
  public void setRepeatMode(int paramInt)
  {
    player.setRepeatMode(paramInt);
  }
  
  @Deprecated
  public void setSelectedTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt)
  {
    setSelectedTrack(paramRendererType, 0, paramInt);
  }
  
  public void setSelectedTrack(@NonNull ExoMedia.RendererType paramRendererType, int paramInt1, int paramInt2)
  {
    Object localObject = trackSelector.getCurrentMappedTrackInfo();
    ExoPlayerRendererTracksInfo localExoPlayerRendererTracksInfo = getExoPlayerTracksInfo(paramRendererType, paramInt1, (MappingTrackSelector.MappedTrackInfo)localObject);
    paramInt1 = rendererTrackIndex;
    if ((paramInt1 != -1) && (localObject != null)) {
      paramRendererType = ((MappingTrackSelector.MappedTrackInfo)localObject).getTrackGroups(paramInt1);
    } else {
      paramRendererType = null;
    }
    if (paramRendererType != null)
    {
      int i = length;
      if (i != 0)
      {
        paramInt1 = rendererTrackGroupIndex;
        if (i > paramInt1)
        {
          localObject = paramRendererType.get(paramInt1);
          if ((localObject != null) && (length > paramInt2))
          {
            DefaultTrackSelector.ParametersBuilder localParametersBuilder = trackSelector.buildUponParameters();
            localObject = rendererTrackIndexes.iterator();
            while (((Iterator)localObject).hasNext())
            {
              paramInt1 = ((Integer)((Iterator)localObject).next()).intValue();
              localParametersBuilder.clearSelectionOverrides(paramInt1);
              if (rendererTrackIndex == paramInt1)
              {
                localParametersBuilder.setSelectionOverride(paramInt1, paramRendererType, new DefaultTrackSelector.SelectionOverride(rendererTrackGroupIndex, new int[] { paramInt2 }));
                localParametersBuilder.setRendererDisabled(paramInt1, false);
              }
              else
              {
                localParametersBuilder.setRendererDisabled(paramInt1, true);
              }
            }
            trackSelector.setParameters(localParametersBuilder);
          }
        }
      }
    }
  }
  
  public void setSurface(@Nullable Surface paramSurface)
  {
    surface = paramSurface;
    sendMessage(2, 1, paramSurface, false);
  }
  
  public void setUri(@Nullable Uri paramUri)
  {
    if (paramUri != null) {
      paramUri = ExoMedia.Data.mediaSourceProvider.generate(context, mainHandler, paramUri, bandwidthMeter);
    } else {
      paramUri = null;
    }
    setMediaSource(paramUri);
  }
  
  public void setVolume(@FloatRange(from=0.0D, to=1.0D) float paramFloat)
  {
    requestedVolume = paramFloat;
    sendMessage(1, 2, Float.valueOf(paramFloat));
  }
  
  public void setWakeMode(Context paramContext, int paramInt)
  {
    PowerManager.WakeLock localWakeLock = wakeLock;
    boolean bool;
    if (localWakeLock != null)
    {
      if (localWakeLock.isHeld())
      {
        bool = true;
        wakeLock.release();
      }
      else
      {
        bool = false;
      }
      wakeLock = null;
    }
    else
    {
      bool = false;
    }
    if (paramContext.getPackageManager().checkPermission("android.permission.WAKE_LOCK", paramContext.getPackageName()) == 0)
    {
      paramContext = (PowerManager)paramContext.getSystemService("power");
      if (paramContext != null)
      {
        paramContext = paramContext.newWakeLock(paramInt | 0x20000000, ExoMediaPlayer.class.getName());
        wakeLock = paramContext;
        paramContext.setReferenceCounted(false);
      }
      else
      {
        Log.e("ExoMediaPlayer", "Unable to acquire WAKE_LOCK due to a null power manager");
      }
    }
    else
    {
      Log.w("ExoMediaPlayer", "Unable to acquire WAKE_LOCK due to missing manifest permission");
    }
    stayAwake(bool);
  }
  
  public void setupDamSessionManagerAnalytics(DrmSessionManager<FrameworkMediaCrypto> paramDrmSessionManager)
  {
    if ((paramDrmSessionManager instanceof DefaultDrmSessionManager)) {
      ((DefaultDrmSessionManager)paramDrmSessionManager).addListener(mainHandler, analyticsCollector);
    }
  }
  
  public void stayAwake(boolean paramBoolean)
  {
    PowerManager.WakeLock localWakeLock = wakeLock;
    if (localWakeLock == null) {
      return;
    }
    if ((paramBoolean) && (!localWakeLock.isHeld())) {
      wakeLock.acquire(1000L);
    } else if ((!paramBoolean) && (wakeLock.isHeld())) {
      wakeLock.release();
    }
  }
  
  public void stop()
  {
    if (!stopped.getAndSet(true))
    {
      player.setPlayWhenReady(false);
      player.stop();
    }
  }
  
  public class BufferRepeatListener
    implements Repeater.RepeatListener
  {
    private BufferRepeatListener() {}
    
    public void onRepeat()
    {
      if (ExoMediaPlayer.access$500(ExoMediaPlayer.this) != null) {
        ExoMediaPlayer.access$500(ExoMediaPlayer.this).onBufferingUpdate(getBufferedPercentage());
      }
    }
  }
  
  public class CapabilitiesListener
    implements DefaultDrmSessionEventListener
  {
    private CapabilitiesListener() {}
    
    public void onDrmKeysLoaded() {}
    
    public void onDrmKeysRemoved() {}
    
    public void onDrmKeysRestored() {}
    
    public void onDrmSessionManagerError(Exception paramException)
    {
      if (ExoMediaPlayer.access$700(ExoMediaPlayer.this) != null) {
        ExoMediaPlayer.access$700(ExoMediaPlayer.this).onDrmSessionManagerError(paramException);
      }
    }
  }
  
  public class ComponentListener
    implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput
  {
    private ComponentListener() {}
    
    public void onAudioDecoderInitialized(String paramString, long paramLong1, long paramLong2)
    {
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onAudioDecoderInitialized(paramString, paramLong1, paramLong2);
    }
    
    public void onAudioDisabled(DecoderCounters paramDecoderCounters)
    {
      ExoMediaPlayer.access$902(ExoMediaPlayer.this, 0);
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onAudioDisabled(paramDecoderCounters);
    }
    
    public void onAudioEnabled(DecoderCounters paramDecoderCounters)
    {
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onAudioEnabled(paramDecoderCounters);
    }
    
    public void onAudioInputFormatChanged(Format paramFormat)
    {
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onAudioInputFormatChanged(paramFormat);
    }
    
    public void onAudioSessionId(int paramInt)
    {
      ExoMediaPlayer.access$902(ExoMediaPlayer.this, paramInt);
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onAudioSessionId(paramInt);
    }
    
    public void onAudioSinkUnderrun(int paramInt, long paramLong1, long paramLong2)
    {
      if (ExoMediaPlayer.access$700(ExoMediaPlayer.this) != null) {
        ExoMediaPlayer.access$700(ExoMediaPlayer.this).onAudioSinkUnderrun(paramInt, paramLong1, paramLong2);
      }
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onAudioSinkUnderrun(paramInt, paramLong1, paramLong2);
    }
    
    public void onCues(List<Cue> paramList)
    {
      if (ExoMediaPlayer.access$1200(ExoMediaPlayer.this) != null) {
        ExoMediaPlayer.access$1200(ExoMediaPlayer.this).onCues(paramList);
      }
    }
    
    public void onDroppedFrames(int paramInt, long paramLong)
    {
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onDroppedFrames(paramInt, paramLong);
    }
    
    public void onMetadata(Metadata paramMetadata)
    {
      if (ExoMediaPlayer.access$1100(ExoMediaPlayer.this) != null) {
        ExoMediaPlayer.access$1100(ExoMediaPlayer.this).onMetadata(paramMetadata);
      }
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onMetadata(paramMetadata);
    }
    
    public void onRenderedFirstFrame(Surface paramSurface)
    {
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onRenderedFirstFrame(paramSurface);
    }
    
    public void onVideoDecoderInitialized(String paramString, long paramLong1, long paramLong2)
    {
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onVideoDecoderInitialized(paramString, paramLong1, paramLong2);
    }
    
    public void onVideoDisabled(DecoderCounters paramDecoderCounters)
    {
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onVideoDisabled(paramDecoderCounters);
    }
    
    public void onVideoEnabled(DecoderCounters paramDecoderCounters)
    {
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onVideoEnabled(paramDecoderCounters);
    }
    
    public void onVideoInputFormatChanged(Format paramFormat)
    {
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onVideoInputFormatChanged(paramFormat);
    }
    
    public void onVideoSizeChanged(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
    {
      Iterator localIterator = ExoMediaPlayer.access$1000(ExoMediaPlayer.this).iterator();
      while (localIterator.hasNext()) {
        ((ExoPlayerListener)localIterator.next()).onVideoSizeChanged(paramInt1, paramInt2, paramInt3, paramFloat);
      }
      ExoMediaPlayer.access$800(ExoMediaPlayer.this).onVideoSizeChanged(paramInt1, paramInt2, paramInt3, paramFloat);
    }
  }
  
  public class DelegatedMediaDrmCallback
    implements MediaDrmCallback
  {
    private DelegatedMediaDrmCallback() {}
    
    public byte[] executeKeyRequest(UUID paramUUID, ExoMediaDrm.KeyRequest paramKeyRequest)
      throws Exception
    {
      if (ExoMediaPlayer.access$600(ExoMediaPlayer.this) != null) {
        paramUUID = ExoMediaPlayer.access$600(ExoMediaPlayer.this).executeKeyRequest(paramUUID, paramKeyRequest);
      } else {
        paramUUID = new byte[0];
      }
      return paramUUID;
    }
    
    public byte[] executeProvisionRequest(UUID paramUUID, ExoMediaDrm.ProvisionRequest paramProvisionRequest)
      throws Exception
    {
      if (ExoMediaPlayer.access$600(ExoMediaPlayer.this) != null) {
        paramUUID = ExoMediaPlayer.access$600(ExoMediaPlayer.this).executeProvisionRequest(paramUUID, paramProvisionRequest);
      } else {
        paramUUID = new byte[0];
      }
      return paramUUID;
    }
  }
  
  public class ExoPlayerRendererTracksInfo
  {
    public final int rendererTrackGroupIndex;
    public final int rendererTrackIndex;
    public final List<Integer> rendererTrackIndexes;
    
    public ExoPlayerRendererTracksInfo(int paramInt1, int paramInt2)
    {
      rendererTrackIndexes = Collections.unmodifiableList(paramInt1);
      rendererTrackIndex = paramInt2;
      int i;
      rendererTrackGroupIndex = i;
    }
  }
  
  public static class StateStore
  {
    public static final int FLAG_PLAY_WHEN_READY = -268435456;
    public static final int STATE_SEEKING = 100;
    private int[] prevStates = { 1, 1, 1, 1 };
    
    public int getMostRecentState()
    {
      return prevStates[3];
    }
    
    public int getState(boolean paramBoolean, int paramInt)
    {
      int i;
      if (paramBoolean) {
        i = -268435456;
      } else {
        i = 0;
      }
      return i | paramInt;
    }
    
    public boolean isLastReportedPlayWhenReady()
    {
      boolean bool;
      if ((prevStates[3] & 0xF0000000) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean matchesHistory(@Size(max=4L, min=1L) int[] paramArrayOfInt, boolean paramBoolean)
    {
      int i;
      if (paramBoolean) {
        i = 268435455;
      } else {
        i = -1;
      }
      int j = prevStates.length - paramArrayOfInt.length;
      int k = j;
      paramBoolean = true;
      for (;;)
      {
        int[] arrayOfInt = prevStates;
        if (k >= arrayOfInt.length) {
          break;
        }
        boolean bool;
        if ((arrayOfInt[k] & i) == (paramArrayOfInt[(k - j)] & i)) {
          bool = true;
        } else {
          bool = false;
        }
        paramBoolean &= bool;
        k++;
      }
      return paramBoolean;
    }
    
    public void reset()
    {
      for (int i = 0;; i++)
      {
        int[] arrayOfInt = prevStates;
        if (i >= arrayOfInt.length) {
          break;
        }
        arrayOfInt[i] = 1;
      }
    }
    
    public void setMostRecentState(boolean paramBoolean, int paramInt)
    {
      int i = getState(paramBoolean, paramInt);
      int[] arrayOfInt = prevStates;
      int j = arrayOfInt[3];
      if (j == i) {
        return;
      }
      arrayOfInt[0] = arrayOfInt[1];
      arrayOfInt[1] = arrayOfInt[2];
      arrayOfInt[2] = j;
      arrayOfInt[3] = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.exoplayer.ExoMediaPlayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */