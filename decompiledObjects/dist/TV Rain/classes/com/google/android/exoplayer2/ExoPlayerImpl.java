package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import z2;

final class ExoPlayerImpl
  extends BasePlayer
  implements ExoPlayer
{
  private static final String TAG = "ExoPlayerImpl";
  public final TrackSelectorResult emptyTrackSelectorResult;
  private final Handler eventHandler;
  private boolean hasPendingPrepare;
  private boolean hasPendingSeek;
  private boolean internalPlayWhenReady;
  private final ExoPlayerImplInternal internalPlayer;
  private final Handler internalPlayerHandler;
  private final CopyOnWriteArraySet<Player.EventListener> listeners;
  private int maskingPeriodIndex;
  private int maskingWindowIndex;
  private long maskingWindowPositionMs;
  private MediaSource mediaSource;
  private int pendingOperationAcks;
  private final ArrayDeque<PlaybackInfoUpdate> pendingPlaybackInfoUpdates;
  private final Timeline.Period period;
  private boolean playWhenReady;
  @Nullable
  private ExoPlaybackException playbackError;
  private PlaybackInfo playbackInfo;
  private PlaybackParameters playbackParameters;
  private final Renderer[] renderers;
  private int repeatMode;
  private SeekParameters seekParameters;
  private boolean shuffleModeEnabled;
  private final TrackSelector trackSelector;
  
  @SuppressLint({"HandlerLeak"})
  public ExoPlayerImpl(Renderer[] paramArrayOfRenderer, TrackSelector paramTrackSelector, LoadControl paramLoadControl, BandwidthMeter paramBandwidthMeter, Clock paramClock, Looper paramLooper)
  {
    Object localObject = z2.t("Init ");
    ((StringBuilder)localObject).append(Integer.toHexString(System.identityHashCode(this)));
    ((StringBuilder)localObject).append(" [");
    ((StringBuilder)localObject).append("ExoPlayerLib/2.9.1");
    ((StringBuilder)localObject).append("] [");
    ((StringBuilder)localObject).append(Util.DEVICE_DEBUG_INFO);
    ((StringBuilder)localObject).append("]");
    Log.i("ExoPlayerImpl", ((StringBuilder)localObject).toString());
    boolean bool;
    if (paramArrayOfRenderer.length > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    renderers = ((Renderer[])Assertions.checkNotNull(paramArrayOfRenderer));
    trackSelector = ((TrackSelector)Assertions.checkNotNull(paramTrackSelector));
    playWhenReady = false;
    repeatMode = 0;
    shuffleModeEnabled = false;
    listeners = new CopyOnWriteArraySet();
    localObject = new TrackSelectorResult(new RendererConfiguration[paramArrayOfRenderer.length], new TrackSelection[paramArrayOfRenderer.length], null);
    emptyTrackSelectorResult = ((TrackSelectorResult)localObject);
    period = new Timeline.Period();
    playbackParameters = PlaybackParameters.DEFAULT;
    seekParameters = SeekParameters.DEFAULT;
    paramLooper = new Handler(paramLooper)
    {
      public void handleMessage(Message paramAnonymousMessage)
      {
        handleEvent(paramAnonymousMessage);
      }
    };
    eventHandler = paramLooper;
    playbackInfo = PlaybackInfo.createDummy(0L, (TrackSelectorResult)localObject);
    pendingPlaybackInfoUpdates = new ArrayDeque();
    paramArrayOfRenderer = new ExoPlayerImplInternal(paramArrayOfRenderer, paramTrackSelector, (TrackSelectorResult)localObject, paramLoadControl, paramBandwidthMeter, playWhenReady, repeatMode, shuffleModeEnabled, paramLooper, this, paramClock);
    internalPlayer = paramArrayOfRenderer;
    internalPlayerHandler = new Handler(paramArrayOfRenderer.getPlaybackLooper());
  }
  
  private PlaybackInfo getResetPlaybackInfo(boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    long l1 = 0L;
    if (paramBoolean1)
    {
      maskingWindowIndex = 0;
      maskingPeriodIndex = 0;
      maskingWindowPositionMs = 0L;
    }
    else
    {
      maskingWindowIndex = getCurrentWindowIndex();
      maskingPeriodIndex = getCurrentPeriodIndex();
      maskingWindowPositionMs = getCurrentPosition();
    }
    MediaSource.MediaPeriodId localMediaPeriodId;
    if (paramBoolean1) {
      localMediaPeriodId = playbackInfo.getDummyFirstMediaPeriodId(shuffleModeEnabled, window);
    } else {
      localMediaPeriodId = playbackInfo.periodId;
    }
    if (!paramBoolean1) {
      l1 = playbackInfo.positionUs;
    }
    long l2;
    if (paramBoolean1) {
      l2 = -9223372036854775807L;
    } else {
      l2 = playbackInfo.contentPositionUs;
    }
    Timeline localTimeline;
    if (paramBoolean2) {
      localTimeline = Timeline.EMPTY;
    } else {
      localTimeline = playbackInfo.timeline;
    }
    Object localObject;
    if (paramBoolean2) {
      localObject = null;
    } else {
      localObject = playbackInfo.manifest;
    }
    TrackGroupArray localTrackGroupArray;
    if (paramBoolean2) {
      localTrackGroupArray = TrackGroupArray.EMPTY;
    } else {
      localTrackGroupArray = playbackInfo.trackGroups;
    }
    TrackSelectorResult localTrackSelectorResult;
    if (paramBoolean2) {
      localTrackSelectorResult = emptyTrackSelectorResult;
    } else {
      localTrackSelectorResult = playbackInfo.trackSelectorResult;
    }
    return new PlaybackInfo(localTimeline, localObject, localMediaPeriodId, l1, l2, paramInt, false, localTrackGroupArray, localTrackSelectorResult, localMediaPeriodId, l1, 0L, l1);
  }
  
  private void handlePlaybackInfo(PlaybackInfo paramPlaybackInfo, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    paramInt1 = pendingOperationAcks - paramInt1;
    pendingOperationAcks = paramInt1;
    if (paramInt1 == 0)
    {
      PlaybackInfo localPlaybackInfo = paramPlaybackInfo;
      if (startPositionUs == -9223372036854775807L) {
        localPlaybackInfo = paramPlaybackInfo.resetToNewPosition(periodId, 0L, contentPositionUs);
      }
      if (((!playbackInfo.timeline.isEmpty()) || (hasPendingPrepare)) && (timeline.isEmpty()))
      {
        maskingPeriodIndex = 0;
        maskingWindowIndex = 0;
        maskingWindowPositionMs = 0L;
      }
      if (hasPendingPrepare) {
        paramInt1 = 0;
      } else {
        paramInt1 = 2;
      }
      boolean bool = hasPendingSeek;
      hasPendingPrepare = false;
      hasPendingSeek = false;
      updatePlaybackInfo(localPlaybackInfo, paramBoolean, paramInt2, paramInt1, bool, false);
    }
  }
  
  private long periodPositionUsToWindowPositionMs(MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong)
  {
    paramLong = C.usToMs(paramLong);
    playbackInfo.timeline.getPeriodByUid(periodUid, period);
    return period.getPositionInWindowMs() + paramLong;
  }
  
  private boolean shouldMaskPosition()
  {
    boolean bool;
    if ((!playbackInfo.timeline.isEmpty()) && (pendingOperationAcks <= 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void updatePlaybackInfo(PlaybackInfo paramPlaybackInfo, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3)
  {
    boolean bool = pendingPlaybackInfoUpdates.isEmpty();
    pendingPlaybackInfoUpdates.addLast(new PlaybackInfoUpdate(paramPlaybackInfo, playbackInfo, listeners, trackSelector, paramBoolean1, paramInt1, paramInt2, paramBoolean2, playWhenReady, paramBoolean3));
    playbackInfo = paramPlaybackInfo;
    if ((bool ^ true)) {
      return;
    }
    while (!pendingPlaybackInfoUpdates.isEmpty())
    {
      ((PlaybackInfoUpdate)pendingPlaybackInfoUpdates.peekFirst()).notifyListeners();
      pendingPlaybackInfoUpdates.removeFirst();
    }
  }
  
  public void addListener(Player.EventListener paramEventListener)
  {
    listeners.add(paramEventListener);
  }
  
  @Deprecated
  public void blockingSendMessages(ExoPlayer.ExoPlayerMessage... paramVarArgs)
  {
    Object localObject1 = new ArrayList();
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      localObject2 = paramVarArgs[j];
      ((ArrayList)localObject1).add(createMessage(target).setType(messageType).setPayload(message).send());
    }
    Object localObject2 = ((ArrayList)localObject1).iterator();
    j = 0;
    if (((Iterator)localObject2).hasNext())
    {
      localObject1 = (PlayerMessage)((Iterator)localObject2).next();
      i = 1;
      int k = j;
      for (;;)
      {
        j = k;
        if (i == 0) {
          break;
        }
        try
        {
          ((PlayerMessage)localObject1).blockUntilDelivered();
          i = 0;
        }
        catch (InterruptedException paramVarArgs)
        {
          k = 1;
        }
      }
    }
    if (j != 0) {
      Thread.currentThread().interrupt();
    }
  }
  
  public PlayerMessage createMessage(PlayerMessage.Target paramTarget)
  {
    return new PlayerMessage(internalPlayer, paramTarget, playbackInfo.timeline, getCurrentWindowIndex(), internalPlayerHandler);
  }
  
  public Looper getApplicationLooper()
  {
    return eventHandler.getLooper();
  }
  
  public Player.AudioComponent getAudioComponent()
  {
    return null;
  }
  
  public long getBufferedPosition()
  {
    if (isPlayingAd())
    {
      PlaybackInfo localPlaybackInfo = playbackInfo;
      long l;
      if (loadingMediaPeriodId.equals(periodId)) {
        l = C.usToMs(playbackInfo.bufferedPositionUs);
      } else {
        l = getDuration();
      }
      return l;
    }
    return getContentBufferedPosition();
  }
  
  public long getContentBufferedPosition()
  {
    if (shouldMaskPosition()) {
      return maskingWindowPositionMs;
    }
    Object localObject = playbackInfo;
    if (loadingMediaPeriodId.windowSequenceNumber != periodId.windowSequenceNumber) {
      return timeline.getWindow(getCurrentWindowIndex(), window).getDurationMs();
    }
    long l = bufferedPositionUs;
    if (playbackInfo.loadingMediaPeriodId.isAd())
    {
      localObject = playbackInfo;
      localObject = timeline.getPeriodByUid(loadingMediaPeriodId.periodUid, period);
      l = ((Timeline.Period)localObject).getAdGroupTimeUs(playbackInfo.loadingMediaPeriodId.adGroupIndex);
      if (l == Long.MIN_VALUE) {
        l = durationUs;
      }
    }
    return periodPositionUsToWindowPositionMs(playbackInfo.loadingMediaPeriodId, l);
  }
  
  public long getContentPosition()
  {
    if (isPlayingAd())
    {
      PlaybackInfo localPlaybackInfo = playbackInfo;
      timeline.getPeriodByUid(periodId.periodUid, period);
      long l = period.getPositionInWindowMs();
      return C.usToMs(playbackInfo.contentPositionUs) + l;
    }
    return getCurrentPosition();
  }
  
  public int getCurrentAdGroupIndex()
  {
    int i;
    if (isPlayingAd()) {
      i = playbackInfo.periodId.adGroupIndex;
    } else {
      i = -1;
    }
    return i;
  }
  
  public int getCurrentAdIndexInAdGroup()
  {
    int i;
    if (isPlayingAd()) {
      i = playbackInfo.periodId.adIndexInAdGroup;
    } else {
      i = -1;
    }
    return i;
  }
  
  public Object getCurrentManifest()
  {
    return playbackInfo.manifest;
  }
  
  public int getCurrentPeriodIndex()
  {
    if (shouldMaskPosition()) {
      return maskingPeriodIndex;
    }
    PlaybackInfo localPlaybackInfo = playbackInfo;
    return timeline.getIndexOfPeriod(periodId.periodUid);
  }
  
  public long getCurrentPosition()
  {
    if (shouldMaskPosition()) {
      return maskingWindowPositionMs;
    }
    if (playbackInfo.periodId.isAd()) {
      return C.usToMs(playbackInfo.positionUs);
    }
    PlaybackInfo localPlaybackInfo = playbackInfo;
    return periodPositionUsToWindowPositionMs(periodId, positionUs);
  }
  
  public Timeline getCurrentTimeline()
  {
    return playbackInfo.timeline;
  }
  
  public TrackGroupArray getCurrentTrackGroups()
  {
    return playbackInfo.trackGroups;
  }
  
  public TrackSelectionArray getCurrentTrackSelections()
  {
    return playbackInfo.trackSelectorResult.selections;
  }
  
  public int getCurrentWindowIndex()
  {
    if (shouldMaskPosition()) {
      return maskingWindowIndex;
    }
    PlaybackInfo localPlaybackInfo = playbackInfo;
    return timeline.getPeriodByUid(periodId.periodUid, period).windowIndex;
  }
  
  public long getDuration()
  {
    if (isPlayingAd())
    {
      PlaybackInfo localPlaybackInfo = playbackInfo;
      MediaSource.MediaPeriodId localMediaPeriodId = periodId;
      timeline.getPeriodByUid(periodUid, period);
      return C.usToMs(period.getAdDurationUs(adGroupIndex, adIndexInAdGroup));
    }
    return getContentDuration();
  }
  
  public boolean getPlayWhenReady()
  {
    return playWhenReady;
  }
  
  @Nullable
  public ExoPlaybackException getPlaybackError()
  {
    return playbackError;
  }
  
  public Looper getPlaybackLooper()
  {
    return internalPlayer.getPlaybackLooper();
  }
  
  public PlaybackParameters getPlaybackParameters()
  {
    return playbackParameters;
  }
  
  public int getPlaybackState()
  {
    return playbackInfo.playbackState;
  }
  
  public int getRendererCount()
  {
    return renderers.length;
  }
  
  public int getRendererType(int paramInt)
  {
    return renderers[paramInt].getTrackType();
  }
  
  public int getRepeatMode()
  {
    return repeatMode;
  }
  
  public SeekParameters getSeekParameters()
  {
    return seekParameters;
  }
  
  public boolean getShuffleModeEnabled()
  {
    return shuffleModeEnabled;
  }
  
  public Player.TextComponent getTextComponent()
  {
    return null;
  }
  
  public long getTotalBufferedDuration()
  {
    return Math.max(0L, C.usToMs(playbackInfo.totalBufferedDurationUs));
  }
  
  public Player.VideoComponent getVideoComponent()
  {
    return null;
  }
  
  public void handleEvent(Message paramMessage)
  {
    int i = what;
    boolean bool = true;
    Object localObject;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          localObject = (ExoPlaybackException)obj;
          playbackError = ((ExoPlaybackException)localObject);
          paramMessage = listeners.iterator();
          while (paramMessage.hasNext()) {
            ((Player.EventListener)paramMessage.next()).onPlayerError((ExoPlaybackException)localObject);
          }
        }
        throw new IllegalStateException();
      }
      localObject = (PlaybackParameters)obj;
      if (!playbackParameters.equals(localObject))
      {
        playbackParameters = ((PlaybackParameters)localObject);
        paramMessage = listeners.iterator();
        while (paramMessage.hasNext()) {
          ((Player.EventListener)paramMessage.next()).onPlaybackParametersChanged((PlaybackParameters)localObject);
        }
      }
    }
    else
    {
      localObject = (PlaybackInfo)obj;
      i = arg1;
      int j = arg2;
      if (j == -1) {
        bool = false;
      }
      handlePlaybackInfo((PlaybackInfo)localObject, i, bool, j);
    }
  }
  
  public boolean isLoading()
  {
    return playbackInfo.isLoading;
  }
  
  public boolean isPlayingAd()
  {
    boolean bool;
    if ((!shouldMaskPosition()) && (playbackInfo.periodId.isAd())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void prepare(MediaSource paramMediaSource)
  {
    prepare(paramMediaSource, true, true);
  }
  
  public void prepare(MediaSource paramMediaSource, boolean paramBoolean1, boolean paramBoolean2)
  {
    playbackError = null;
    mediaSource = paramMediaSource;
    PlaybackInfo localPlaybackInfo = getResetPlaybackInfo(paramBoolean1, paramBoolean2, 2);
    hasPendingPrepare = true;
    pendingOperationAcks += 1;
    internalPlayer.prepare(paramMediaSource, paramBoolean1, paramBoolean2);
    updatePlaybackInfo(localPlaybackInfo, false, 4, 1, false, false);
  }
  
  public void release()
  {
    StringBuilder localStringBuilder = z2.t("Release ");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" [");
    localStringBuilder.append("ExoPlayerLib/2.9.1");
    localStringBuilder.append("] [");
    localStringBuilder.append(Util.DEVICE_DEBUG_INFO);
    localStringBuilder.append("] [");
    localStringBuilder.append(ExoPlayerLibraryInfo.registeredModules());
    localStringBuilder.append("]");
    Log.i("ExoPlayerImpl", localStringBuilder.toString());
    mediaSource = null;
    internalPlayer.release();
    eventHandler.removeCallbacksAndMessages(null);
  }
  
  public void removeListener(Player.EventListener paramEventListener)
  {
    listeners.remove(paramEventListener);
  }
  
  public void retry()
  {
    MediaSource localMediaSource = mediaSource;
    if ((localMediaSource != null) && ((playbackError != null) || (playbackInfo.playbackState == 1))) {
      prepare(localMediaSource, false, false);
    }
  }
  
  public void seekTo(int paramInt, long paramLong)
  {
    Object localObject = playbackInfo.timeline;
    if ((paramInt >= 0) && ((((Timeline)localObject).isEmpty()) || (paramInt < ((Timeline)localObject).getWindowCount())))
    {
      hasPendingSeek = true;
      pendingOperationAcks += 1;
      if (isPlayingAd())
      {
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        eventHandler.obtainMessage(0, 1, -1, playbackInfo).sendToTarget();
        return;
      }
      maskingWindowIndex = paramInt;
      long l;
      if (((Timeline)localObject).isEmpty())
      {
        if (paramLong == -9223372036854775807L) {
          l = 0L;
        } else {
          l = paramLong;
        }
        maskingWindowPositionMs = l;
        maskingPeriodIndex = 0;
      }
      else
      {
        if (paramLong == -9223372036854775807L) {
          l = ((Timeline)localObject).getWindow(paramInt, window).getDefaultPositionUs();
        } else {
          l = C.msToUs(paramLong);
        }
        Pair localPair = ((Timeline)localObject).getPeriodPosition(window, period, paramInt, l);
        maskingWindowPositionMs = C.usToMs(l);
        maskingPeriodIndex = ((Timeline)localObject).getIndexOfPeriod(first);
      }
      internalPlayer.seekTo((Timeline)localObject, paramInt, C.msToUs(paramLong));
      localObject = listeners.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((Player.EventListener)((Iterator)localObject).next()).onPositionDiscontinuity(1);
      }
      return;
    }
    throw new IllegalSeekPositionException((Timeline)localObject, paramInt, paramLong);
  }
  
  @Deprecated
  public void sendMessages(ExoPlayer.ExoPlayerMessage... paramVarArgs)
  {
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      ExoPlayer.ExoPlayerMessage localExoPlayerMessage = paramVarArgs[j];
      createMessage(target).setType(messageType).setPayload(message).send();
    }
  }
  
  public void setPlayWhenReady(boolean paramBoolean)
  {
    setPlayWhenReady(paramBoolean, false);
  }
  
  public void setPlayWhenReady(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (!paramBoolean2)) {
      paramBoolean2 = true;
    } else {
      paramBoolean2 = false;
    }
    if (internalPlayWhenReady != paramBoolean2)
    {
      internalPlayWhenReady = paramBoolean2;
      internalPlayer.setPlayWhenReady(paramBoolean2);
    }
    if (playWhenReady != paramBoolean1)
    {
      playWhenReady = paramBoolean1;
      updatePlaybackInfo(playbackInfo, false, 4, 1, false, true);
    }
  }
  
  public void setPlaybackParameters(@Nullable PlaybackParameters paramPlaybackParameters)
  {
    PlaybackParameters localPlaybackParameters = paramPlaybackParameters;
    if (paramPlaybackParameters == null) {
      localPlaybackParameters = PlaybackParameters.DEFAULT;
    }
    internalPlayer.setPlaybackParameters(localPlaybackParameters);
  }
  
  public void setRepeatMode(int paramInt)
  {
    if (repeatMode != paramInt)
    {
      repeatMode = paramInt;
      internalPlayer.setRepeatMode(paramInt);
      Iterator localIterator = listeners.iterator();
      while (localIterator.hasNext()) {
        ((Player.EventListener)localIterator.next()).onRepeatModeChanged(paramInt);
      }
    }
  }
  
  public void setSeekParameters(@Nullable SeekParameters paramSeekParameters)
  {
    SeekParameters localSeekParameters = paramSeekParameters;
    if (paramSeekParameters == null) {
      localSeekParameters = SeekParameters.DEFAULT;
    }
    if (!seekParameters.equals(localSeekParameters))
    {
      seekParameters = localSeekParameters;
      internalPlayer.setSeekParameters(localSeekParameters);
    }
  }
  
  public void setShuffleModeEnabled(boolean paramBoolean)
  {
    if (shuffleModeEnabled != paramBoolean)
    {
      shuffleModeEnabled = paramBoolean;
      internalPlayer.setShuffleModeEnabled(paramBoolean);
      Iterator localIterator = listeners.iterator();
      while (localIterator.hasNext()) {
        ((Player.EventListener)localIterator.next()).onShuffleModeEnabledChanged(paramBoolean);
      }
    }
  }
  
  public void stop(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      playbackError = null;
      mediaSource = null;
    }
    PlaybackInfo localPlaybackInfo = getResetPlaybackInfo(paramBoolean, paramBoolean, 1);
    pendingOperationAcks += 1;
    internalPlayer.stop(paramBoolean);
    updatePlaybackInfo(localPlaybackInfo, false, 4, 1, false, false);
  }
  
  public static final class PlaybackInfoUpdate
  {
    private final boolean isLoadingChanged;
    private final Set<Player.EventListener> listeners;
    private final boolean playWhenReady;
    private final PlaybackInfo playbackInfo;
    private final boolean playbackStateOrPlayWhenReadyChanged;
    private final boolean positionDiscontinuity;
    private final int positionDiscontinuityReason;
    private final boolean seekProcessed;
    private final int timelineChangeReason;
    private final boolean timelineOrManifestChanged;
    private final TrackSelector trackSelector;
    private final boolean trackSelectorResultChanged;
    
    public PlaybackInfoUpdate(PlaybackInfo paramPlaybackInfo1, PlaybackInfo paramPlaybackInfo2, Set<Player.EventListener> paramSet, TrackSelector paramTrackSelector, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
    {
      playbackInfo = paramPlaybackInfo1;
      listeners = paramSet;
      trackSelector = paramTrackSelector;
      positionDiscontinuity = paramBoolean1;
      positionDiscontinuityReason = paramInt1;
      timelineChangeReason = paramInt2;
      seekProcessed = paramBoolean2;
      playWhenReady = paramBoolean3;
      paramBoolean2 = false;
      if ((!paramBoolean4) && (playbackState == playbackState)) {
        paramBoolean1 = false;
      } else {
        paramBoolean1 = true;
      }
      playbackStateOrPlayWhenReadyChanged = paramBoolean1;
      if ((timeline == timeline) && (manifest == manifest)) {
        paramBoolean1 = false;
      } else {
        paramBoolean1 = true;
      }
      timelineOrManifestChanged = paramBoolean1;
      if (isLoading != isLoading) {
        paramBoolean1 = true;
      } else {
        paramBoolean1 = false;
      }
      isLoadingChanged = paramBoolean1;
      paramBoolean1 = paramBoolean2;
      if (trackSelectorResult != trackSelectorResult) {
        paramBoolean1 = true;
      }
      trackSelectorResultChanged = paramBoolean1;
    }
    
    public void notifyListeners()
    {
      Object localObject1;
      Object localObject2;
      Object localObject3;
      if ((timelineOrManifestChanged) || (timelineChangeReason == 0))
      {
        localObject1 = listeners.iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (Player.EventListener)((Iterator)localObject1).next();
          localObject3 = playbackInfo;
          ((Player.EventListener)localObject2).onTimelineChanged(timeline, manifest, timelineChangeReason);
        }
      }
      if (positionDiscontinuity)
      {
        localObject2 = listeners.iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((Player.EventListener)((Iterator)localObject2).next()).onPositionDiscontinuity(positionDiscontinuityReason);
        }
      }
      if (trackSelectorResultChanged)
      {
        trackSelector.onSelectionActivated(playbackInfo.trackSelectorResult.info);
        localObject3 = listeners.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (Player.EventListener)((Iterator)localObject3).next();
          localObject1 = playbackInfo;
          ((Player.EventListener)localObject2).onTracksChanged(trackGroups, trackSelectorResult.selections);
        }
      }
      if (isLoadingChanged)
      {
        localObject2 = listeners.iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((Player.EventListener)((Iterator)localObject2).next()).onLoadingChanged(playbackInfo.isLoading);
        }
      }
      if (playbackStateOrPlayWhenReadyChanged)
      {
        localObject2 = listeners.iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((Player.EventListener)((Iterator)localObject2).next()).onPlayerStateChanged(playWhenReady, playbackInfo.playbackState);
        }
      }
      if (seekProcessed)
      {
        localObject2 = listeners.iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((Player.EventListener)((Iterator)localObject2).next()).onSeekProcessed();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ExoPlayerImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */