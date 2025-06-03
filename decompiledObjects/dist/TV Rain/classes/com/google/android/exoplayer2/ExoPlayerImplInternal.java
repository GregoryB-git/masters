package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaPeriod.Callback;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSource.SourceInfoRefreshListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

final class ExoPlayerImplInternal
  implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSource.SourceInfoRefreshListener, DefaultMediaClock.PlaybackParameterListener, PlayerMessage.Sender
{
  private static final int IDLE_INTERVAL_MS = 1000;
  private static final int MSG_DO_SOME_WORK = 2;
  public static final int MSG_ERROR = 2;
  private static final int MSG_PERIOD_PREPARED = 9;
  public static final int MSG_PLAYBACK_INFO_CHANGED = 0;
  public static final int MSG_PLAYBACK_PARAMETERS_CHANGED = 1;
  private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
  private static final int MSG_PREPARE = 0;
  private static final int MSG_REFRESH_SOURCE_INFO = 8;
  private static final int MSG_RELEASE = 7;
  private static final int MSG_SEEK_TO = 3;
  private static final int MSG_SEND_MESSAGE = 14;
  private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
  private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
  private static final int MSG_SET_PLAY_WHEN_READY = 1;
  private static final int MSG_SET_REPEAT_MODE = 12;
  private static final int MSG_SET_SEEK_PARAMETERS = 5;
  private static final int MSG_SET_SHUFFLE_ENABLED = 13;
  private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 10;
  private static final int MSG_STOP = 6;
  private static final int MSG_TRACK_SELECTION_INVALIDATED = 11;
  private static final int PREPARING_SOURCE_INTERVAL_MS = 10;
  private static final int RENDERING_INTERVAL_MS = 10;
  private static final String TAG = "ExoPlayerImplInternal";
  private final long backBufferDurationUs;
  private final BandwidthMeter bandwidthMeter;
  private final Clock clock;
  private final TrackSelectorResult emptyTrackSelectorResult;
  private Renderer[] enabledRenderers;
  private final Handler eventHandler;
  private final HandlerWrapper handler;
  private final HandlerThread internalPlaybackThread;
  private final LoadControl loadControl;
  private final DefaultMediaClock mediaClock;
  private MediaSource mediaSource;
  private int nextPendingMessageIndex;
  private SeekPosition pendingInitialSeekPosition;
  private final ArrayList<PendingMessageInfo> pendingMessages;
  private int pendingPrepareCount;
  private final Timeline.Period period;
  private boolean playWhenReady;
  private PlaybackInfo playbackInfo;
  private final PlaybackInfoUpdate playbackInfoUpdate;
  private final ExoPlayer player;
  private final MediaPeriodQueue queue;
  private boolean rebuffering;
  private boolean released;
  private final RendererCapabilities[] rendererCapabilities;
  private long rendererPositionUs;
  private final Renderer[] renderers;
  private int repeatMode;
  private final boolean retainBackBufferFromKeyframe;
  private SeekParameters seekParameters;
  private boolean shuffleModeEnabled;
  private final TrackSelector trackSelector;
  private final Timeline.Window window;
  
  public ExoPlayerImplInternal(Renderer[] paramArrayOfRenderer, TrackSelector paramTrackSelector, TrackSelectorResult paramTrackSelectorResult, LoadControl paramLoadControl, BandwidthMeter paramBandwidthMeter, boolean paramBoolean1, int paramInt, boolean paramBoolean2, Handler paramHandler, ExoPlayer paramExoPlayer, Clock paramClock)
  {
    renderers = paramArrayOfRenderer;
    trackSelector = paramTrackSelector;
    emptyTrackSelectorResult = paramTrackSelectorResult;
    loadControl = paramLoadControl;
    bandwidthMeter = paramBandwidthMeter;
    playWhenReady = paramBoolean1;
    repeatMode = paramInt;
    shuffleModeEnabled = paramBoolean2;
    eventHandler = paramHandler;
    player = paramExoPlayer;
    clock = paramClock;
    queue = new MediaPeriodQueue();
    backBufferDurationUs = paramLoadControl.getBackBufferDurationUs();
    retainBackBufferFromKeyframe = paramLoadControl.retainBackBufferFromKeyframe();
    seekParameters = SeekParameters.DEFAULT;
    playbackInfo = PlaybackInfo.createDummy(-9223372036854775807L, paramTrackSelectorResult);
    playbackInfoUpdate = new PlaybackInfoUpdate(null);
    rendererCapabilities = new RendererCapabilities[paramArrayOfRenderer.length];
    for (paramInt = 0; paramInt < paramArrayOfRenderer.length; paramInt++)
    {
      paramArrayOfRenderer[paramInt].setIndex(paramInt);
      rendererCapabilities[paramInt] = paramArrayOfRenderer[paramInt].getCapabilities();
    }
    mediaClock = new DefaultMediaClock(this, paramClock);
    pendingMessages = new ArrayList();
    enabledRenderers = new Renderer[0];
    window = new Timeline.Window();
    period = new Timeline.Period();
    paramTrackSelector.init(this, paramBandwidthMeter);
    paramArrayOfRenderer = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
    internalPlaybackThread = paramArrayOfRenderer;
    paramArrayOfRenderer.start();
    handler = paramClock.createHandler(paramArrayOfRenderer.getLooper(), this);
  }
  
  private void deliverMessage(PlayerMessage paramPlayerMessage)
    throws ExoPlaybackException
  {
    if (paramPlayerMessage.isCanceled()) {
      return;
    }
    try
    {
      paramPlayerMessage.getTarget().handleMessage(paramPlayerMessage.getType(), paramPlayerMessage.getPayload());
      return;
    }
    finally
    {
      paramPlayerMessage.markAsProcessed(true);
    }
  }
  
  private void disableRenderer(Renderer paramRenderer)
    throws ExoPlaybackException
  {
    mediaClock.onRendererDisabled(paramRenderer);
    ensureStopped(paramRenderer);
    paramRenderer.disable();
  }
  
  private void doSomeWork()
    throws ExoPlaybackException, IOException
  {
    long l1 = clock.uptimeMillis();
    updatePeriods();
    if (!queue.hasPlayingPeriod())
    {
      maybeThrowPeriodPrepareError();
      scheduleNextWork(l1, 10L);
      return;
    }
    MediaPeriodHolder localMediaPeriodHolder = queue.getPlayingPeriod();
    TraceUtil.beginSection("doSomeWork");
    updatePlaybackPositions();
    long l2 = SystemClock.elapsedRealtime();
    mediaPeriod.discardBuffer(playbackInfo.positionUs - backBufferDurationUs, retainBackBufferFromKeyframe);
    Renderer[] arrayOfRenderer = enabledRenderers;
    int i = arrayOfRenderer.length;
    boolean bool1 = true;
    boolean bool2 = bool1;
    Object localObject;
    int k;
    for (int j = 0; j < i; j++)
    {
      localObject = arrayOfRenderer[j];
      ((Renderer)localObject).render(rendererPositionUs, l2 * 1000L);
      if ((bool2) && (((Renderer)localObject).isEnded())) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if ((!((Renderer)localObject).isReady()) && (!((Renderer)localObject).isEnded()) && (!rendererWaitingForNextStream((Renderer)localObject))) {
        k = 0;
      } else {
        k = 1;
      }
      if (k == 0) {
        ((Renderer)localObject).maybeThrowStreamError();
      }
      if ((bool1) && (k != 0)) {
        bool1 = true;
      } else {
        bool1 = false;
      }
    }
    if (!bool1) {
      maybeThrowPeriodPrepareError();
    }
    l2 = info.durationUs;
    if ((bool2) && ((l2 == -9223372036854775807L) || (l2 <= playbackInfo.positionUs)) && (info.isFinal))
    {
      setState(4);
      stopRenderers();
    }
    else if ((playbackInfo.playbackState == 2) && (shouldTransitionToReadyState(bool1)))
    {
      setState(3);
      if (playWhenReady) {
        startRenderers();
      }
    }
    else if ((playbackInfo.playbackState == 3) && (enabledRenderers.length == 0 ? !isTimelineReady() : !bool1))
    {
      rebuffering = playWhenReady;
      setState(2);
      stopRenderers();
    }
    if (playbackInfo.playbackState == 2)
    {
      localObject = enabledRenderers;
      k = localObject.length;
      for (j = 0; j < k; j++) {
        localObject[j].maybeThrowStreamError();
      }
    }
    if ((!playWhenReady) || (playbackInfo.playbackState != 3))
    {
      j = playbackInfo.playbackState;
      if (j != 2) {}
    }
    else
    {
      scheduleNextWork(l1, 10L);
      break label523;
    }
    if ((enabledRenderers.length != 0) && (j != 4)) {
      scheduleNextWork(l1, 1000L);
    } else {
      handler.removeMessages(2);
    }
    label523:
    TraceUtil.endSection();
  }
  
  private void enableRenderer(int paramInt1, boolean paramBoolean, int paramInt2)
    throws ExoPlaybackException
  {
    MediaPeriodHolder localMediaPeriodHolder = queue.getPlayingPeriod();
    Renderer localRenderer = renderers[paramInt1];
    enabledRenderers[paramInt2] = localRenderer;
    if (localRenderer.getState() == 0)
    {
      Object localObject = trackSelectorResult;
      RendererConfiguration localRendererConfiguration = rendererConfigurations[paramInt1];
      localObject = getFormats(selections.get(paramInt1));
      if ((playWhenReady) && (playbackInfo.playbackState == 3)) {
        paramInt2 = 1;
      } else {
        paramInt2 = 0;
      }
      if ((!paramBoolean) && (paramInt2 != 0)) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      localRenderer.enable(localRendererConfiguration, (Format[])localObject, sampleStreams[paramInt1], rendererPositionUs, paramBoolean, localMediaPeriodHolder.getRendererOffset());
      mediaClock.onRendererEnabled(localRenderer);
      if (paramInt2 != 0) {
        localRenderer.start();
      }
    }
  }
  
  private void enableRenderers(boolean[] paramArrayOfBoolean, int paramInt)
    throws ExoPlaybackException
  {
    enabledRenderers = new Renderer[paramInt];
    MediaPeriodHolder localMediaPeriodHolder = queue.getPlayingPeriod();
    paramInt = 0;
    int j;
    for (int i = 0; paramInt < renderers.length; i = j)
    {
      j = i;
      if (trackSelectorResult.isRendererEnabled(paramInt))
      {
        enableRenderer(paramInt, paramArrayOfBoolean[paramInt], i);
        j = i + 1;
      }
      paramInt++;
    }
  }
  
  private void ensureStopped(Renderer paramRenderer)
    throws ExoPlaybackException
  {
    if (paramRenderer.getState() == 2) {
      paramRenderer.stop();
    }
  }
  
  private static Format[] getFormats(TrackSelection paramTrackSelection)
  {
    int i = 0;
    int j;
    if (paramTrackSelection != null) {
      j = paramTrackSelection.length();
    } else {
      j = 0;
    }
    Format[] arrayOfFormat = new Format[j];
    while (i < j)
    {
      arrayOfFormat[i] = paramTrackSelection.getFormat(i);
      i++;
    }
    return arrayOfFormat;
  }
  
  private Pair<Object, Long> getPeriodPosition(Timeline paramTimeline, int paramInt, long paramLong)
  {
    return paramTimeline.getPeriodPosition(window, period, paramInt, paramLong);
  }
  
  private long getTotalBufferedDurationUs()
  {
    return getTotalBufferedDurationUs(playbackInfo.bufferedPositionUs);
  }
  
  private long getTotalBufferedDurationUs(long paramLong)
  {
    MediaPeriodHolder localMediaPeriodHolder = queue.getLoadingPeriod();
    if (localMediaPeriodHolder == null) {
      paramLong = 0L;
    } else {
      paramLong -= localMediaPeriodHolder.toPeriodTime(rendererPositionUs);
    }
    return paramLong;
  }
  
  private void handleContinueLoadingRequested(MediaPeriod paramMediaPeriod)
  {
    if (!queue.isLoading(paramMediaPeriod)) {
      return;
    }
    queue.reevaluateBuffer(rendererPositionUs);
    maybeContinueLoading();
  }
  
  private void handleLoadingMediaPeriodChanged(boolean paramBoolean)
  {
    MediaPeriodHolder localMediaPeriodHolder = queue.getLoadingPeriod();
    if (localMediaPeriodHolder == null) {
      localObject = playbackInfo.periodId;
    } else {
      localObject = info.id;
    }
    boolean bool = playbackInfo.loadingMediaPeriodId.equals(localObject) ^ true;
    if (bool) {
      playbackInfo = playbackInfo.copyWithLoadingMediaPeriodId((MediaSource.MediaPeriodId)localObject);
    }
    Object localObject = playbackInfo;
    long l;
    if (localMediaPeriodHolder == null) {
      l = positionUs;
    } else {
      l = localMediaPeriodHolder.getBufferedPositionUs();
    }
    bufferedPositionUs = l;
    playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
    if (((bool) || (paramBoolean)) && (localMediaPeriodHolder != null) && (prepared)) {
      updateLoadControlTrackSelection(trackGroups, trackSelectorResult);
    }
  }
  
  private void handlePeriodPrepared(MediaPeriod paramMediaPeriod)
    throws ExoPlaybackException
  {
    if (!queue.isLoading(paramMediaPeriod)) {
      return;
    }
    paramMediaPeriod = queue.getLoadingPeriod();
    paramMediaPeriod.handlePrepared(mediaClock.getPlaybackParameters().speed);
    updateLoadControlTrackSelection(trackGroups, trackSelectorResult);
    if (!queue.hasPlayingPeriod())
    {
      resetRendererPosition(queue.advancePlayingPeriod().info.startPositionUs);
      updatePlayingPeriodRenderers(null);
    }
    maybeContinueLoading();
  }
  
  private void handlePlaybackParameters(PlaybackParameters paramPlaybackParameters)
    throws ExoPlaybackException
  {
    eventHandler.obtainMessage(1, paramPlaybackParameters).sendToTarget();
    updateTrackSelectionPlaybackSpeed(speed);
    for (Renderer localRenderer : renderers) {
      if (localRenderer != null) {
        localRenderer.setOperatingRate(speed);
      }
    }
  }
  
  private void handleSourceInfoRefreshEndedPlayback()
  {
    setState(4);
    resetInternal(false, true, false);
  }
  
  private void handleSourceInfoRefreshed(MediaSourceRefreshInfo paramMediaSourceRefreshInfo)
    throws ExoPlaybackException
  {
    if (source != mediaSource) {
      return;
    }
    Timeline localTimeline = playbackInfo.timeline;
    Object localObject1 = timeline;
    paramMediaSourceRefreshInfo = manifest;
    queue.setTimeline((Timeline)localObject1);
    playbackInfo = playbackInfo.copyWithTimeline((Timeline)localObject1, paramMediaSourceRefreshInfo);
    resolvePendingMessagePositions();
    int i = pendingPrepareCount;
    long l1 = 0L;
    if (i > 0)
    {
      playbackInfoUpdate.incrementPendingOperationAcks(i);
      pendingPrepareCount = 0;
      paramMediaSourceRefreshInfo = pendingInitialSeekPosition;
      if (paramMediaSourceRefreshInfo != null) {
        try
        {
          paramMediaSourceRefreshInfo = resolveSeekPosition(paramMediaSourceRefreshInfo, true);
          pendingInitialSeekPosition = null;
          if (paramMediaSourceRefreshInfo == null)
          {
            handleSourceInfoRefreshEndedPlayback();
          }
          else
          {
            localObject2 = first;
            l2 = ((Long)second).longValue();
            localObject2 = queue.resolveMediaPeriodIdForAds(localObject2, l2);
            paramMediaSourceRefreshInfo = playbackInfo;
            if (((MediaSource.MediaPeriodId)localObject2).isAd()) {
              l1 = 0L;
            } else {
              l1 = l2;
            }
            playbackInfo = paramMediaSourceRefreshInfo.resetToNewPosition((MediaSource.MediaPeriodId)localObject2, l1, l2);
          }
        }
        catch (IllegalSeekPositionException paramMediaSourceRefreshInfo)
        {
          localObject2 = playbackInfo.getDummyFirstMediaPeriodId(shuffleModeEnabled, window);
          playbackInfo = playbackInfo.resetToNewPosition((MediaSource.MediaPeriodId)localObject2, -9223372036854775807L, -9223372036854775807L);
          throw paramMediaSourceRefreshInfo;
        }
      }
      if (playbackInfo.startPositionUs == -9223372036854775807L) {
        if (((Timeline)localObject1).isEmpty())
        {
          handleSourceInfoRefreshEndedPlayback();
        }
        else
        {
          paramMediaSourceRefreshInfo = getPeriodPosition((Timeline)localObject1, ((Timeline)localObject1).getFirstWindowIndex(shuffleModeEnabled), -9223372036854775807L);
          localObject2 = first;
          l2 = ((Long)second).longValue();
          paramMediaSourceRefreshInfo = queue.resolveMediaPeriodIdForAds(localObject2, l2);
          localObject2 = playbackInfo;
          if (paramMediaSourceRefreshInfo.isAd()) {
            l1 = 0L;
          } else {
            l1 = l2;
          }
          playbackInfo = ((PlaybackInfo)localObject2).resetToNewPosition(paramMediaSourceRefreshInfo, l1, l2);
        }
      }
      return;
    }
    if (localTimeline.isEmpty())
    {
      if (!((Timeline)localObject1).isEmpty())
      {
        paramMediaSourceRefreshInfo = getPeriodPosition((Timeline)localObject1, ((Timeline)localObject1).getFirstWindowIndex(shuffleModeEnabled), -9223372036854775807L);
        localObject2 = first;
        l2 = ((Long)second).longValue();
        paramMediaSourceRefreshInfo = queue.resolveMediaPeriodIdForAds(localObject2, l2);
        localObject2 = playbackInfo;
        if (paramMediaSourceRefreshInfo.isAd()) {
          l1 = 0L;
        } else {
          l1 = l2;
        }
        playbackInfo = ((PlaybackInfo)localObject2).resetToNewPosition(paramMediaSourceRefreshInfo, l1, l2);
      }
      return;
    }
    Object localObject2 = queue.getFrontPeriod();
    paramMediaSourceRefreshInfo = playbackInfo;
    long l2 = contentPositionUs;
    if (localObject2 == null) {
      paramMediaSourceRefreshInfo = periodId.periodUid;
    } else {
      paramMediaSourceRefreshInfo = uid;
    }
    if (((Timeline)localObject1).getIndexOfPeriod(paramMediaSourceRefreshInfo) == -1)
    {
      paramMediaSourceRefreshInfo = resolveSubsequentPeriod(paramMediaSourceRefreshInfo, localTimeline, (Timeline)localObject1);
      if (paramMediaSourceRefreshInfo == null)
      {
        handleSourceInfoRefreshEndedPlayback();
        return;
      }
      paramMediaSourceRefreshInfo = getPeriodPosition((Timeline)localObject1, getPeriodByUidperiod).windowIndex, -9223372036854775807L);
      localObject1 = first;
      l2 = ((Long)second).longValue();
      localObject1 = queue.resolveMediaPeriodIdForAds(localObject1, l2);
      if (localObject2 != null)
      {
        paramMediaSourceRefreshInfo = (MediaSourceRefreshInfo)localObject2;
        for (;;)
        {
          localObject2 = next;
          if (localObject2 == null) {
            break;
          }
          paramMediaSourceRefreshInfo = (MediaSourceRefreshInfo)localObject2;
          if (info.id.equals(localObject1))
          {
            info = queue.getUpdatedMediaPeriodInfo(info);
            paramMediaSourceRefreshInfo = (MediaSourceRefreshInfo)localObject2;
          }
        }
      }
      if (!((MediaSource.MediaPeriodId)localObject1).isAd()) {
        l1 = l2;
      }
      l1 = seekToPeriodPosition((MediaSource.MediaPeriodId)localObject1, l1);
      playbackInfo = playbackInfo.copyWithNewPosition((MediaSource.MediaPeriodId)localObject1, l1, l2, getTotalBufferedDurationUs());
      return;
    }
    localObject2 = playbackInfo.periodId;
    if (((MediaSource.MediaPeriodId)localObject2).isAd())
    {
      paramMediaSourceRefreshInfo = queue.resolveMediaPeriodIdForAds(paramMediaSourceRefreshInfo, l2);
      if (!paramMediaSourceRefreshInfo.equals(localObject2))
      {
        if (!paramMediaSourceRefreshInfo.isAd()) {
          l1 = l2;
        }
        l1 = seekToPeriodPosition(paramMediaSourceRefreshInfo, l1);
        playbackInfo = playbackInfo.copyWithNewPosition(paramMediaSourceRefreshInfo, l1, l2, getTotalBufferedDurationUs());
        return;
      }
    }
    if (!queue.updateQueuedPeriods((MediaSource.MediaPeriodId)localObject2, rendererPositionUs)) {
      seekToCurrentPosition(false);
    }
    handleLoadingMediaPeriodChanged(false);
  }
  
  private boolean isTimelineReady()
  {
    MediaPeriodHolder localMediaPeriodHolder = queue.getPlayingPeriod();
    long l = info.durationUs;
    if ((l != -9223372036854775807L) && (playbackInfo.positionUs >= l))
    {
      localMediaPeriodHolder = next;
      if ((localMediaPeriodHolder == null) || ((!prepared) && (!info.id.isAd())))
      {
        bool = false;
        break label77;
      }
    }
    boolean bool = true;
    label77:
    return bool;
  }
  
  private void maybeContinueLoading()
  {
    MediaPeriodHolder localMediaPeriodHolder = queue.getLoadingPeriod();
    long l = localMediaPeriodHolder.getNextLoadPositionUs();
    if (l == Long.MIN_VALUE)
    {
      setIsLoading(false);
      return;
    }
    l = getTotalBufferedDurationUs(l);
    boolean bool = loadControl.shouldContinueLoading(l, mediaClock.getPlaybackParameters().speed);
    setIsLoading(bool);
    if (bool) {
      localMediaPeriodHolder.continueLoading(rendererPositionUs);
    }
  }
  
  private void maybeNotifyPlaybackInfoChanged()
  {
    if (playbackInfoUpdate.hasPendingUpdate(playbackInfo))
    {
      Handler localHandler = eventHandler;
      int i = PlaybackInfoUpdate.access$100(playbackInfoUpdate);
      int j;
      if (PlaybackInfoUpdate.access$200(playbackInfoUpdate)) {
        j = PlaybackInfoUpdate.access$300(playbackInfoUpdate);
      } else {
        j = -1;
      }
      localHandler.obtainMessage(0, i, j, playbackInfo).sendToTarget();
      playbackInfoUpdate.reset(playbackInfo);
    }
  }
  
  private void maybeThrowPeriodPrepareError()
    throws IOException
  {
    MediaPeriodHolder localMediaPeriodHolder = queue.getLoadingPeriod();
    Object localObject = queue.getReadingPeriod();
    if ((localMediaPeriodHolder != null) && (!prepared) && ((localObject == null) || (next == localMediaPeriodHolder)))
    {
      localObject = enabledRenderers;
      int i = localObject.length;
      for (int j = 0; j < i; j++) {
        if (!localObject[j].hasReadStreamToEnd()) {
          return;
        }
      }
      mediaPeriod.maybeThrowPrepareError();
    }
  }
  
  private void maybeThrowSourceInfoRefreshError()
    throws IOException
  {
    if (queue.getLoadingPeriod() != null)
    {
      Renderer[] arrayOfRenderer = enabledRenderers;
      int i = arrayOfRenderer.length;
      for (int j = 0; j < i; j++) {
        if (!arrayOfRenderer[j].hasReadStreamToEnd()) {
          return;
        }
      }
    }
    mediaSource.maybeThrowSourceInfoRefreshError();
  }
  
  private void maybeTriggerPendingMessages(long paramLong1, long paramLong2)
    throws ExoPlaybackException
  {
    if ((!pendingMessages.isEmpty()) && (!playbackInfo.periodId.isAd()))
    {
      Object localObject1 = playbackInfo;
      long l1 = paramLong1;
      if (startPositionUs == paramLong1) {
        l1 = paramLong1 - 1L;
      }
      int i = timeline.getIndexOfPeriod(periodId.periodUid);
      int j = nextPendingMessageIndex;
      long l2 = l1;
      if (j > 0)
      {
        localObject1 = (PendingMessageInfo)pendingMessages.get(j - 1);
        paramLong1 = l1;
      }
      else
      {
        localObject1 = null;
        paramLong1 = l2;
      }
      for (;;)
      {
        if (localObject1 == null) {
          break label188;
        }
        j = resolvedPeriodIndex;
        if ((j <= i) && ((j != i) || (resolvedPeriodTimeUs <= paramLong1))) {
          break label188;
        }
        j = nextPendingMessageIndex - 1;
        nextPendingMessageIndex = j;
        l2 = paramLong1;
        if (j <= 0) {
          break;
        }
        localObject1 = (PendingMessageInfo)pendingMessages.get(j - 1);
      }
      label188:
      l1 = paramLong1;
      if (nextPendingMessageIndex < pendingMessages.size())
      {
        localObject1 = (PendingMessageInfo)pendingMessages.get(nextPendingMessageIndex);
      }
      else
      {
        localObject1 = null;
        paramLong1 = l1;
      }
      Object localObject2;
      for (;;)
      {
        localObject2 = localObject1;
        if (localObject1 == null) {
          break label338;
        }
        localObject2 = localObject1;
        if (resolvedPeriodUid == null) {
          break label338;
        }
        j = resolvedPeriodIndex;
        if (j >= i)
        {
          localObject2 = localObject1;
          if (j != i) {
            break label338;
          }
          localObject2 = localObject1;
          if (resolvedPeriodTimeUs > paramLong1) {
            break label338;
          }
        }
        j = nextPendingMessageIndex + 1;
        nextPendingMessageIndex = j;
        l1 = paramLong1;
        if (j >= pendingMessages.size()) {
          break;
        }
        localObject1 = (PendingMessageInfo)pendingMessages.get(nextPendingMessageIndex);
      }
      label338:
      while ((localObject2 != null) && (resolvedPeriodUid != null) && (resolvedPeriodIndex == i))
      {
        l1 = resolvedPeriodTimeUs;
        if ((l1 <= paramLong1) || (l1 > paramLong2)) {
          break;
        }
        sendMessageToTarget(message);
        if ((!message.getDeleteAfterDelivery()) && (!message.isCanceled())) {
          nextPendingMessageIndex += 1;
        } else {
          pendingMessages.remove(nextPendingMessageIndex);
        }
        if (nextPendingMessageIndex < pendingMessages.size()) {
          localObject2 = (PendingMessageInfo)pendingMessages.get(nextPendingMessageIndex);
        } else {
          localObject2 = null;
        }
      }
    }
  }
  
  private void maybeUpdateLoadingPeriod()
    throws IOException
  {
    queue.reevaluateBuffer(rendererPositionUs);
    if (queue.shouldLoadNextMediaPeriod())
    {
      MediaPeriodInfo localMediaPeriodInfo = queue.getNextMediaPeriodInfo(rendererPositionUs, playbackInfo);
      if (localMediaPeriodInfo == null)
      {
        maybeThrowSourceInfoRefreshError();
      }
      else
      {
        queue.enqueueNextMediaPeriod(rendererCapabilities, trackSelector, loadControl.getAllocator(), mediaSource, localMediaPeriodInfo).prepare(this, startPositionUs);
        setIsLoading(true);
        handleLoadingMediaPeriodChanged(false);
      }
    }
  }
  
  private void prepareInternal(MediaSource paramMediaSource, boolean paramBoolean1, boolean paramBoolean2)
  {
    pendingPrepareCount += 1;
    resetInternal(true, paramBoolean1, paramBoolean2);
    loadControl.onPrepared();
    mediaSource = paramMediaSource;
    setState(2);
    paramMediaSource.prepareSource(player, true, this, bandwidthMeter.getTransferListener());
    handler.sendEmptyMessage(2);
  }
  
  private void releaseInternal()
  {
    resetInternal(true, true, true);
    loadControl.onReleased();
    setState(1);
    internalPlaybackThread.quit();
    try
    {
      released = true;
      notifyAll();
      return;
    }
    finally {}
  }
  
  private boolean rendererWaitingForNextStream(Renderer paramRenderer)
  {
    MediaPeriodHolder localMediaPeriodHolder = queue.getReadingPeriod().next;
    boolean bool;
    if ((localMediaPeriodHolder != null) && (prepared) && (paramRenderer.hasReadStreamToEnd())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void reselectTracksInternal()
    throws ExoPlaybackException
  {
    if (!queue.hasPlayingPeriod()) {
      return;
    }
    float f = mediaClock.getPlaybackParameters().speed;
    Object localObject1 = queue.getPlayingPeriod();
    MediaPeriodHolder localMediaPeriodHolder = queue.getReadingPeriod();
    int i = 1;
    while ((localObject1 != null) && (prepared))
    {
      if (((MediaPeriodHolder)localObject1).selectTracks(f))
      {
        if (i != 0)
        {
          localMediaPeriodHolder = queue.getPlayingPeriod();
          boolean bool = queue.removeAfter(localMediaPeriodHolder);
          localObject1 = new boolean[renderers.length];
          long l = localMediaPeriodHolder.applyTrackSelection(playbackInfo.positionUs, bool, (boolean[])localObject1);
          Object localObject2 = playbackInfo;
          if ((playbackState != 4) && (l != positionUs))
          {
            localObject2 = playbackInfo;
            playbackInfo = ((PlaybackInfo)localObject2).copyWithNewPosition(periodId, l, contentPositionUs, getTotalBufferedDurationUs());
            playbackInfoUpdate.setPositionDiscontinuity(4);
            resetRendererPosition(l);
          }
          localObject2 = new boolean[renderers.length];
          i = 0;
          int k;
          for (int j = i;; j = k)
          {
            Object localObject3 = renderers;
            if (i >= localObject3.length) {
              break;
            }
            Renderer localRenderer = localObject3[i];
            if (localRenderer.getState() != 0) {
              bool = true;
            } else {
              bool = false;
            }
            localObject2[i] = bool;
            localObject3 = sampleStreams[i];
            k = j;
            if (localObject3 != null) {
              k = j + 1;
            }
            if (bool) {
              if (localObject3 != localRenderer.getStream()) {
                disableRenderer(localRenderer);
              } else if (localObject1[i] != 0) {
                localRenderer.resetPosition(rendererPositionUs);
              }
            }
            i++;
          }
          playbackInfo = playbackInfo.copyWithTrackInfo(trackGroups, trackSelectorResult);
          enableRenderers((boolean[])localObject2, j);
        }
        else
        {
          queue.removeAfter((MediaPeriodHolder)localObject1);
          if (prepared) {
            ((MediaPeriodHolder)localObject1).applyTrackSelection(Math.max(info.startPositionUs, ((MediaPeriodHolder)localObject1).toPeriodTime(rendererPositionUs)), false);
          }
        }
        handleLoadingMediaPeriodChanged(true);
        if (playbackInfo.playbackState != 4)
        {
          maybeContinueLoading();
          updatePlaybackPositions();
          handler.sendEmptyMessage(2);
        }
        return;
      }
      if (localObject1 == localMediaPeriodHolder) {
        i = 0;
      }
      localObject1 = next;
    }
  }
  
  private void resetInternal(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    handler.removeMessages(2);
    rebuffering = false;
    mediaClock.stop();
    rendererPositionUs = 0L;
    for (Renderer localRenderer : enabledRenderers)
    {
      try
      {
        disableRenderer(localRenderer);
      }
      catch (RuntimeException localRuntimeException) {}catch (ExoPlaybackException localExoPlaybackException) {}
      Log.e("ExoPlayerImplInternal", "Stop failed.", localExoPlaybackException);
    }
    enabledRenderers = new Renderer[0];
    queue.clear(paramBoolean2 ^ true);
    setIsLoading(false);
    if (paramBoolean2) {
      pendingInitialSeekPosition = null;
    }
    Object localObject2;
    if (paramBoolean3)
    {
      queue.setTimeline(Timeline.EMPTY);
      localObject2 = pendingMessages.iterator();
      while (((Iterator)localObject2).hasNext()) {
        nextmessage.markAsProcessed(false);
      }
      pendingMessages.clear();
      nextPendingMessageIndex = 0;
    }
    if (paramBoolean2) {
      localObject2 = playbackInfo.getDummyFirstMediaPeriodId(shuffleModeEnabled, window);
    } else {
      localObject2 = playbackInfo.periodId;
    }
    long l1 = -9223372036854775807L;
    long l2;
    if (paramBoolean2) {
      l2 = -9223372036854775807L;
    } else {
      l2 = playbackInfo.positionUs;
    }
    if (!paramBoolean2) {
      l1 = playbackInfo.contentPositionUs;
    }
    if (paramBoolean3) {
      ??? = Timeline.EMPTY;
    } else {
      ??? = playbackInfo.timeline;
    }
    Object localObject3;
    if (paramBoolean3) {
      localObject3 = null;
    } else {
      localObject3 = playbackInfo.manifest;
    }
    Object localObject4 = playbackInfo;
    ??? = playbackState;
    TrackGroupArray localTrackGroupArray;
    if (paramBoolean3) {
      localTrackGroupArray = TrackGroupArray.EMPTY;
    } else {
      localTrackGroupArray = trackGroups;
    }
    if (paramBoolean3) {
      localObject4 = emptyTrackSelectorResult;
    } else {
      localObject4 = trackSelectorResult;
    }
    playbackInfo = new PlaybackInfo((Timeline)???, localObject3, (MediaSource.MediaPeriodId)localObject2, l2, l1, ???, false, localTrackGroupArray, (TrackSelectorResult)localObject4, (MediaSource.MediaPeriodId)localObject2, l2, 0L, l2);
    if (paramBoolean1)
    {
      localObject2 = mediaSource;
      if (localObject2 != null)
      {
        ((MediaSource)localObject2).releaseSource(this);
        mediaSource = null;
      }
    }
  }
  
  private void resetRendererPosition(long paramLong)
    throws ExoPlaybackException
  {
    if (queue.hasPlayingPeriod()) {
      paramLong = queue.getPlayingPeriod().toRendererTime(paramLong);
    }
    rendererPositionUs = paramLong;
    mediaClock.resetPosition(paramLong);
    Renderer[] arrayOfRenderer = enabledRenderers;
    int i = arrayOfRenderer.length;
    for (int j = 0; j < i; j++) {
      arrayOfRenderer[j].resetPosition(rendererPositionUs);
    }
  }
  
  private boolean resolvePendingMessagePosition(PendingMessageInfo paramPendingMessageInfo)
  {
    Object localObject = resolvedPeriodUid;
    if (localObject == null)
    {
      localObject = resolveSeekPosition(new SeekPosition(message.getTimeline(), message.getWindowIndex(), C.msToUs(message.getPositionMs())), false);
      if (localObject == null) {
        return false;
      }
      paramPendingMessageInfo.setResolvedPosition(playbackInfo.timeline.getIndexOfPeriod(first), ((Long)second).longValue(), first);
    }
    else
    {
      int i = playbackInfo.timeline.getIndexOfPeriod(localObject);
      if (i == -1) {
        return false;
      }
      resolvedPeriodIndex = i;
    }
    return true;
  }
  
  private void resolvePendingMessagePositions()
  {
    for (int i = pendingMessages.size() - 1; i >= 0; i--) {
      if (!resolvePendingMessagePosition((PendingMessageInfo)pendingMessages.get(i)))
      {
        pendingMessages.get(i)).message.markAsProcessed(false);
        pendingMessages.remove(i);
      }
    }
    Collections.sort(pendingMessages);
  }
  
  private Pair<Object, Long> resolveSeekPosition(SeekPosition paramSeekPosition, boolean paramBoolean)
  {
    Timeline localTimeline = playbackInfo.timeline;
    Object localObject1 = timeline;
    if (localTimeline.isEmpty()) {
      return null;
    }
    Object localObject2 = localObject1;
    if (((Timeline)localObject1).isEmpty()) {
      localObject2 = localTimeline;
    }
    try
    {
      localObject1 = ((Timeline)localObject2).getPeriodPosition(window, period, windowIndex, windowPositionUs);
      if (localTimeline == localObject2) {
        return (Pair<Object, Long>)localObject1;
      }
      int i = localTimeline.getIndexOfPeriod(first);
      if (i != -1) {
        return (Pair<Object, Long>)localObject1;
      }
      if ((paramBoolean) && (resolveSubsequentPeriod(first, (Timeline)localObject2, localTimeline) != null)) {
        return getPeriodPosition(localTimeline, getPeriodperiod).windowIndex, -9223372036854775807L);
      }
      return null;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      throw new IllegalSeekPositionException(localTimeline, windowIndex, windowPositionUs);
    }
  }
  
  @Nullable
  private Object resolveSubsequentPeriod(Object paramObject, Timeline paramTimeline1, Timeline paramTimeline2)
  {
    int i = paramTimeline1.getIndexOfPeriod(paramObject);
    int j = paramTimeline1.getPeriodCount();
    int k = 0;
    int m = -1;
    while ((k < j) && (m == -1))
    {
      i = paramTimeline1.getNextPeriodIndex(i, period, window, repeatMode, shuffleModeEnabled);
      if (i == -1) {
        break;
      }
      m = paramTimeline2.getIndexOfPeriod(paramTimeline1.getUidOfPeriod(i));
      k++;
    }
    if (m == -1) {
      paramObject = null;
    } else {
      paramObject = paramTimeline2.getUidOfPeriod(m);
    }
    return paramObject;
  }
  
  private void scheduleNextWork(long paramLong1, long paramLong2)
  {
    handler.removeMessages(2);
    handler.sendEmptyMessageAtTime(2, paramLong1 + paramLong2);
  }
  
  private void seekToCurrentPosition(boolean paramBoolean)
    throws ExoPlaybackException
  {
    MediaSource.MediaPeriodId localMediaPeriodId = queue.getPlayingPeriod().info.id;
    long l = seekToPeriodPosition(localMediaPeriodId, playbackInfo.positionUs, true);
    if (l != playbackInfo.positionUs)
    {
      PlaybackInfo localPlaybackInfo = playbackInfo;
      playbackInfo = localPlaybackInfo.copyWithNewPosition(localMediaPeriodId, l, contentPositionUs, getTotalBufferedDurationUs());
      if (paramBoolean) {
        playbackInfoUpdate.setPositionDiscontinuity(4);
      }
    }
  }
  
  private void seekToInternal(SeekPosition paramSeekPosition)
    throws ExoPlaybackException
  {
    Object localObject = playbackInfoUpdate;
    int i = 1;
    ((PlaybackInfoUpdate)localObject).incrementPendingOperationAcks(1);
    Pair localPair = resolveSeekPosition(paramSeekPosition, true);
    int j;
    long l1;
    long l2;
    if (localPair == null)
    {
      localObject = playbackInfo.getDummyFirstMediaPeriodId(shuffleModeEnabled, window);
      j = 1;
      l1 = -9223372036854775807L;
      l2 = l1;
    }
    else
    {
      localObject = first;
      l2 = ((Long)second).longValue();
      localObject = queue.resolveMediaPeriodIdForAds(localObject, l2);
      if (((MediaSource.MediaPeriodId)localObject).isAd())
      {
        j = 1;
        l1 = 0L;
      }
      for (;;)
      {
        break;
        l1 = ((Long)second).longValue();
        if (windowPositionUs == -9223372036854775807L) {
          j = 1;
        } else {
          j = 0;
        }
      }
    }
    try
    {
      if ((mediaSource != null) && (pendingPrepareCount <= 0))
      {
        if (l1 == -9223372036854775807L)
        {
          setState(4);
          resetInternal(false, true, false);
        }
        else
        {
          long l4;
          if (((MediaSource.MediaPeriodId)localObject).equals(playbackInfo.periodId))
          {
            paramSeekPosition = queue.getPlayingPeriod();
            if ((paramSeekPosition != null) && (l1 != 0L)) {
              l3 = mediaPeriod.getAdjustedSeekPositionUs(l1, seekParameters);
            } else {
              l3 = l1;
            }
            l4 = l3;
            if (C.usToMs(l3) == C.usToMs(playbackInfo.positionUs)) {
              l3 = playbackInfo.positionUs;
            }
          }
          else
          {
            l4 = l1;
          }
          long l3 = seekToPeriodPosition((MediaSource.MediaPeriodId)localObject, l4);
          if (l1 == l3) {
            i = 0;
          }
          j |= i;
          l1 = l3;
        }
      }
      else {
        pendingInitialSeekPosition = paramSeekPosition;
      }
      return;
    }
    finally
    {
      playbackInfo = playbackInfo.copyWithNewPosition((MediaSource.MediaPeriodId)localObject, l1, l2, getTotalBufferedDurationUs());
      if (j != 0) {
        playbackInfoUpdate.setPositionDiscontinuity(2);
      }
    }
  }
  
  private long seekToPeriodPosition(MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong)
    throws ExoPlaybackException
  {
    boolean bool;
    if (queue.getPlayingPeriod() != queue.getReadingPeriod()) {
      bool = true;
    } else {
      bool = false;
    }
    return seekToPeriodPosition(paramMediaPeriodId, paramLong, bool);
  }
  
  private long seekToPeriodPosition(MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong, boolean paramBoolean)
    throws ExoPlaybackException
  {
    stopRenderers();
    rebuffering = false;
    setState(2);
    MediaPeriodHolder localMediaPeriodHolder1 = queue.getPlayingPeriod();
    for (MediaPeriodHolder localMediaPeriodHolder2 = localMediaPeriodHolder1; localMediaPeriodHolder2 != null; localMediaPeriodHolder2 = queue.advancePlayingPeriod()) {
      if ((paramMediaPeriodId.equals(info.id)) && (prepared))
      {
        queue.removeAfter(localMediaPeriodHolder2);
        break;
      }
    }
    if ((localMediaPeriodHolder1 != localMediaPeriodHolder2) || (paramBoolean))
    {
      paramMediaPeriodId = enabledRenderers;
      int i = paramMediaPeriodId.length;
      for (int j = 0; j < i; j++) {
        disableRenderer(paramMediaPeriodId[j]);
      }
      enabledRenderers = new Renderer[0];
      localMediaPeriodHolder1 = null;
    }
    if (localMediaPeriodHolder2 != null)
    {
      updatePlayingPeriodRenderers(localMediaPeriodHolder1);
      long l = paramLong;
      if (hasEnabledTracks)
      {
        l = mediaPeriod.seekToUs(paramLong);
        mediaPeriod.discardBuffer(l - backBufferDurationUs, retainBackBufferFromKeyframe);
      }
      resetRendererPosition(l);
      maybeContinueLoading();
      paramLong = l;
    }
    else
    {
      queue.clear(true);
      playbackInfo = playbackInfo.copyWithTrackInfo(TrackGroupArray.EMPTY, emptyTrackSelectorResult);
      resetRendererPosition(paramLong);
    }
    handleLoadingMediaPeriodChanged(false);
    handler.sendEmptyMessage(2);
    return paramLong;
  }
  
  private void sendMessageInternal(PlayerMessage paramPlayerMessage)
    throws ExoPlaybackException
  {
    if (paramPlayerMessage.getPositionMs() == -9223372036854775807L)
    {
      sendMessageToTarget(paramPlayerMessage);
    }
    else if ((mediaSource != null) && (pendingPrepareCount <= 0))
    {
      PendingMessageInfo localPendingMessageInfo = new PendingMessageInfo(paramPlayerMessage);
      if (resolvePendingMessagePosition(localPendingMessageInfo))
      {
        pendingMessages.add(localPendingMessageInfo);
        Collections.sort(pendingMessages);
      }
      else
      {
        paramPlayerMessage.markAsProcessed(false);
      }
    }
    else
    {
      pendingMessages.add(new PendingMessageInfo(paramPlayerMessage));
    }
  }
  
  private void sendMessageToTarget(PlayerMessage paramPlayerMessage)
    throws ExoPlaybackException
  {
    if (paramPlayerMessage.getHandler().getLooper() == handler.getLooper())
    {
      deliverMessage(paramPlayerMessage);
      int i = playbackInfo.playbackState;
      if ((i == 3) || (i == 2)) {
        handler.sendEmptyMessage(2);
      }
    }
    else
    {
      handler.obtainMessage(15, paramPlayerMessage).sendToTarget();
    }
  }
  
  private void sendMessageToTargetThread(PlayerMessage paramPlayerMessage)
  {
    paramPlayerMessage.getHandler().post(new a(this, paramPlayerMessage));
  }
  
  private void setIsLoading(boolean paramBoolean)
  {
    PlaybackInfo localPlaybackInfo = playbackInfo;
    if (isLoading != paramBoolean) {
      playbackInfo = localPlaybackInfo.copyWithIsLoading(paramBoolean);
    }
  }
  
  private void setPlayWhenReadyInternal(boolean paramBoolean)
    throws ExoPlaybackException
  {
    rebuffering = false;
    playWhenReady = paramBoolean;
    if (!paramBoolean)
    {
      stopRenderers();
      updatePlaybackPositions();
    }
    else
    {
      int i = playbackInfo.playbackState;
      if (i == 3)
      {
        startRenderers();
        handler.sendEmptyMessage(2);
      }
      else if (i == 2)
      {
        handler.sendEmptyMessage(2);
      }
    }
  }
  
  private void setPlaybackParametersInternal(PlaybackParameters paramPlaybackParameters)
  {
    mediaClock.setPlaybackParameters(paramPlaybackParameters);
  }
  
  private void setRepeatModeInternal(int paramInt)
    throws ExoPlaybackException
  {
    repeatMode = paramInt;
    if (!queue.updateRepeatMode(paramInt)) {
      seekToCurrentPosition(true);
    }
    handleLoadingMediaPeriodChanged(false);
  }
  
  private void setSeekParametersInternal(SeekParameters paramSeekParameters)
  {
    seekParameters = paramSeekParameters;
  }
  
  private void setShuffleModeEnabledInternal(boolean paramBoolean)
    throws ExoPlaybackException
  {
    shuffleModeEnabled = paramBoolean;
    if (!queue.updateShuffleModeEnabled(paramBoolean)) {
      seekToCurrentPosition(true);
    }
    handleLoadingMediaPeriodChanged(false);
  }
  
  private void setState(int paramInt)
  {
    PlaybackInfo localPlaybackInfo = playbackInfo;
    if (playbackState != paramInt) {
      playbackInfo = localPlaybackInfo.copyWithPlaybackState(paramInt);
    }
  }
  
  private boolean shouldTransitionToReadyState(boolean paramBoolean)
  {
    if (enabledRenderers.length == 0) {
      return isTimelineReady();
    }
    boolean bool = false;
    if (!paramBoolean) {
      return false;
    }
    if (!playbackInfo.isLoading) {
      return true;
    }
    MediaPeriodHolder localMediaPeriodHolder = queue.getLoadingPeriod();
    int i;
    if ((localMediaPeriodHolder.isFullyBuffered()) && (info.isFinal)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      paramBoolean = bool;
      if (!loadControl.shouldStartPlayback(getTotalBufferedDurationUs(), mediaClock.getPlaybackParameters().speed, rebuffering)) {}
    }
    else
    {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  private void startRenderers()
    throws ExoPlaybackException
  {
    int i = 0;
    rebuffering = false;
    mediaClock.start();
    Renderer[] arrayOfRenderer = enabledRenderers;
    int j = arrayOfRenderer.length;
    while (i < j)
    {
      arrayOfRenderer[i].start();
      i++;
    }
  }
  
  private void stopInternal(boolean paramBoolean1, boolean paramBoolean2)
  {
    resetInternal(true, paramBoolean1, paramBoolean1);
    playbackInfoUpdate.incrementPendingOperationAcks(pendingPrepareCount + paramBoolean2);
    pendingPrepareCount = 0;
    loadControl.onStopped();
    setState(1);
  }
  
  private void stopRenderers()
    throws ExoPlaybackException
  {
    mediaClock.stop();
    Renderer[] arrayOfRenderer = enabledRenderers;
    int i = arrayOfRenderer.length;
    for (int j = 0; j < i; j++) {
      ensureStopped(arrayOfRenderer[j]);
    }
  }
  
  private void updateLoadControlTrackSelection(TrackGroupArray paramTrackGroupArray, TrackSelectorResult paramTrackSelectorResult)
  {
    loadControl.onTracksSelected(renderers, paramTrackGroupArray, selections);
  }
  
  private void updatePeriods()
    throws ExoPlaybackException, IOException
  {
    Object localObject1 = mediaSource;
    if (localObject1 == null) {
      return;
    }
    if (pendingPrepareCount > 0)
    {
      ((MediaSource)localObject1).maybeThrowSourceInfoRefreshError();
      return;
    }
    maybeUpdateLoadingPeriod();
    localObject1 = queue.getLoadingPeriod();
    int i = 0;
    if ((localObject1 != null) && (!((MediaPeriodHolder)localObject1).isFullyBuffered()))
    {
      if (!playbackInfo.isLoading) {
        maybeContinueLoading();
      }
    }
    else {
      setIsLoading(false);
    }
    if (!queue.hasPlayingPeriod()) {
      return;
    }
    localObject1 = queue.getPlayingPeriod();
    MediaPeriodHolder localMediaPeriodHolder = queue.getReadingPeriod();
    int j = 0;
    Object localObject3;
    while ((playWhenReady) && (localObject1 != localMediaPeriodHolder) && (rendererPositionUs >= next.getStartPositionRendererTime()))
    {
      if (j != 0) {
        maybeNotifyPlaybackInfoChanged();
      }
      if (info.isLastInTimelinePeriod) {
        j = 0;
      } else {
        j = 3;
      }
      localObject2 = queue.advancePlayingPeriod();
      updatePlayingPeriodRenderers((MediaPeriodHolder)localObject1);
      localObject3 = playbackInfo;
      localObject1 = info;
      playbackInfo = ((PlaybackInfo)localObject3).copyWithNewPosition(id, startPositionUs, contentPositionUs, getTotalBufferedDurationUs());
      playbackInfoUpdate.setPositionDiscontinuity(j);
      updatePlaybackPositions();
      j = 1;
      localObject1 = localObject2;
    }
    if (info.isFinal)
    {
      for (j = i;; j++)
      {
        localObject1 = renderers;
        if (j >= localObject1.length) {
          break;
        }
        localObject1 = localObject1[j];
        localObject2 = sampleStreams[j];
        if ((localObject2 != null) && (((Renderer)localObject1).getStream() == localObject2) && (((Renderer)localObject1).hasReadStreamToEnd())) {
          ((Renderer)localObject1).setCurrentStreamFinal();
        }
      }
      return;
    }
    if (next == null) {
      return;
    }
    for (j = 0;; j++)
    {
      localObject1 = renderers;
      if (j >= localObject1.length) {
        break label381;
      }
      localObject2 = localObject1[j];
      localObject1 = sampleStreams[j];
      if ((((Renderer)localObject2).getStream() != localObject1) || ((localObject1 != null) && (!((Renderer)localObject2).hasReadStreamToEnd()))) {
        break;
      }
    }
    return;
    label381:
    if (!next.prepared)
    {
      maybeThrowPeriodPrepareError();
      return;
    }
    localObject1 = trackSelectorResult;
    localMediaPeriodHolder = queue.advanceReadingPeriod();
    Object localObject2 = trackSelectorResult;
    if (mediaPeriod.readDiscontinuity() != -9223372036854775807L) {
      j = 1;
    } else {
      j = 0;
    }
    for (i = 0;; i++)
    {
      localObject3 = renderers;
      if (i >= localObject3.length) {
        break;
      }
      Object localObject4 = localObject3[i];
      if (((TrackSelectorResult)localObject1).isRendererEnabled(i)) {
        if (j != 0)
        {
          ((Renderer)localObject4).setCurrentStreamFinal();
        }
        else if (!((Renderer)localObject4).isCurrentStreamFinal())
        {
          TrackSelection localTrackSelection = selections.get(i);
          boolean bool = ((TrackSelectorResult)localObject2).isRendererEnabled(i);
          int k;
          if (rendererCapabilities[i].getTrackType() == 6) {
            k = 1;
          } else {
            k = 0;
          }
          RendererConfiguration localRendererConfiguration = rendererConfigurations[i];
          localObject3 = rendererConfigurations[i];
          if ((bool) && (((RendererConfiguration)localObject3).equals(localRendererConfiguration)) && (k == 0)) {
            ((Renderer)localObject4).replaceStream(getFormats(localTrackSelection), sampleStreams[i], localMediaPeriodHolder.getRendererOffset());
          } else {
            ((Renderer)localObject4).setCurrentStreamFinal();
          }
        }
      }
    }
  }
  
  private void updatePlaybackPositions()
    throws ExoPlaybackException
  {
    if (!queue.hasPlayingPeriod()) {
      return;
    }
    Object localObject = queue.getPlayingPeriod();
    long l = mediaPeriod.readDiscontinuity();
    if (l != -9223372036854775807L)
    {
      resetRendererPosition(l);
      if (l != playbackInfo.positionUs)
      {
        localObject = playbackInfo;
        playbackInfo = ((PlaybackInfo)localObject).copyWithNewPosition(periodId, l, contentPositionUs, getTotalBufferedDurationUs());
        playbackInfoUpdate.setPositionDiscontinuity(4);
      }
    }
    else
    {
      l = mediaClock.syncAndGetPositionUs();
      rendererPositionUs = l;
      l = ((MediaPeriodHolder)localObject).toPeriodTime(l);
      maybeTriggerPendingMessages(playbackInfo.positionUs, l);
      playbackInfo.positionUs = l;
    }
    localObject = queue.getLoadingPeriod();
    playbackInfo.bufferedPositionUs = ((MediaPeriodHolder)localObject).getBufferedPositionUs();
    playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
  }
  
  private void updatePlayingPeriodRenderers(@Nullable MediaPeriodHolder paramMediaPeriodHolder)
    throws ExoPlaybackException
  {
    MediaPeriodHolder localMediaPeriodHolder = queue.getPlayingPeriod();
    if ((localMediaPeriodHolder != null) && (paramMediaPeriodHolder != localMediaPeriodHolder))
    {
      boolean[] arrayOfBoolean = new boolean[renderers.length];
      int i = 0;
      int m;
      for (int j = i;; j = m)
      {
        Object localObject = renderers;
        if (i >= localObject.length) {
          break;
        }
        localObject = localObject[i];
        int k;
        if (((Renderer)localObject).getState() != 0) {
          k = 1;
        } else {
          k = 0;
        }
        arrayOfBoolean[i] = k;
        m = j;
        if (trackSelectorResult.isRendererEnabled(i)) {
          m = j + 1;
        }
        if ((arrayOfBoolean[i] != 0) && ((!trackSelectorResult.isRendererEnabled(i)) || ((((Renderer)localObject).isCurrentStreamFinal()) && (((Renderer)localObject).getStream() == sampleStreams[i])))) {
          disableRenderer((Renderer)localObject);
        }
        i++;
      }
      playbackInfo = playbackInfo.copyWithTrackInfo(trackGroups, trackSelectorResult);
      enableRenderers(arrayOfBoolean, j);
    }
  }
  
  private void updateTrackSelectionPlaybackSpeed(float paramFloat)
  {
    for (MediaPeriodHolder localMediaPeriodHolder = queue.getFrontPeriod(); localMediaPeriodHolder != null; localMediaPeriodHolder = next)
    {
      TrackSelectorResult localTrackSelectorResult = trackSelectorResult;
      if (localTrackSelectorResult != null) {
        for (localTrackSelectorResult : selections.getAll()) {
          if (localTrackSelectorResult != null) {
            localTrackSelectorResult.onPlaybackSpeed(paramFloat);
          }
        }
      }
    }
  }
  
  public Looper getPlaybackLooper()
  {
    return internalPlaybackThread.getLooper();
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    try
    {
      boolean bool1;
      switch (what)
      {
      default: 
        return false;
      case 16: 
        handlePlaybackParameters((PlaybackParameters)obj);
        break;
      case 15: 
        sendMessageToTargetThread((PlayerMessage)obj);
        break;
      case 14: 
        sendMessageInternal((PlayerMessage)obj);
        break;
      case 13: 
        if (arg1 != 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        setShuffleModeEnabledInternal(bool1);
        break;
      case 12: 
        setRepeatModeInternal(arg1);
        break;
      case 11: 
        reselectTracksInternal();
        break;
      case 10: 
        handleContinueLoadingRequested((MediaPeriod)obj);
        break;
      case 9: 
        handlePeriodPrepared((MediaPeriod)obj);
        break;
      case 8: 
        handleSourceInfoRefreshed((MediaSourceRefreshInfo)obj);
        break;
      case 7: 
        releaseInternal();
        return true;
      case 6: 
        if (arg1 != 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        stopInternal(bool1, true);
        break;
      case 5: 
        setSeekParametersInternal((SeekParameters)obj);
        break;
      case 4: 
        setPlaybackParametersInternal((PlaybackParameters)obj);
        break;
      case 3: 
        seekToInternal((SeekPosition)obj);
        break;
      case 2: 
        doSomeWork();
        break;
      case 1: 
        if (arg1 != 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        setPlayWhenReadyInternal(bool1);
        break;
      case 0: 
        MediaSource localMediaSource = (MediaSource)obj;
        if (arg1 != 0) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        boolean bool2;
        if (arg2 != 0) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        prepareInternal(localMediaSource, bool1, bool2);
      }
      maybeNotifyPlaybackInfoChanged();
    }
    catch (RuntimeException paramMessage)
    {
      Log.e("ExoPlayerImplInternal", "Internal runtime error.", paramMessage);
      stopInternal(false, false);
      eventHandler.obtainMessage(2, ExoPlaybackException.createForUnexpected(paramMessage)).sendToTarget();
      maybeNotifyPlaybackInfoChanged();
    }
    catch (IOException paramMessage)
    {
      Log.e("ExoPlayerImplInternal", "Source error.", paramMessage);
      stopInternal(false, false);
      eventHandler.obtainMessage(2, ExoPlaybackException.createForSource(paramMessage)).sendToTarget();
      maybeNotifyPlaybackInfoChanged();
    }
    catch (ExoPlaybackException paramMessage)
    {
      Log.e("ExoPlayerImplInternal", "Playback error.", paramMessage);
      stopInternal(false, false);
      eventHandler.obtainMessage(2, paramMessage).sendToTarget();
      maybeNotifyPlaybackInfoChanged();
    }
    return true;
  }
  
  public void onContinueLoadingRequested(MediaPeriod paramMediaPeriod)
  {
    handler.obtainMessage(10, paramMediaPeriod).sendToTarget();
  }
  
  public void onPlaybackParametersChanged(PlaybackParameters paramPlaybackParameters)
  {
    handler.obtainMessage(16, paramPlaybackParameters).sendToTarget();
  }
  
  public void onPrepared(MediaPeriod paramMediaPeriod)
  {
    handler.obtainMessage(9, paramMediaPeriod).sendToTarget();
  }
  
  public void onSourceInfoRefreshed(MediaSource paramMediaSource, Timeline paramTimeline, Object paramObject)
  {
    handler.obtainMessage(8, new MediaSourceRefreshInfo(paramMediaSource, paramTimeline, paramObject)).sendToTarget();
  }
  
  public void onTrackSelectionsInvalidated()
  {
    handler.sendEmptyMessage(11);
  }
  
  public void prepare(MediaSource paramMediaSource, boolean paramBoolean1, boolean paramBoolean2)
  {
    handler.obtainMessage(0, paramBoolean1, paramBoolean2, paramMediaSource).sendToTarget();
  }
  
  public void release()
  {
    try
    {
      boolean bool = released;
      if (bool) {
        return;
      }
      handler.sendEmptyMessage(7);
      int i = 0;
      for (;;)
      {
        bool = released;
        if (bool) {
          break;
        }
        try
        {
          wait();
        }
        catch (InterruptedException localInterruptedException)
        {
          i = 1;
        }
      }
      if (i != 0) {
        Thread.currentThread().interrupt();
      }
      return;
    }
    finally {}
  }
  
  public void seekTo(Timeline paramTimeline, int paramInt, long paramLong)
  {
    handler.obtainMessage(3, new SeekPosition(paramTimeline, paramInt, paramLong)).sendToTarget();
  }
  
  public void sendMessage(PlayerMessage paramPlayerMessage)
  {
    try
    {
      if (released)
      {
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        paramPlayerMessage.markAsProcessed(false);
        return;
      }
      handler.obtainMessage(14, paramPlayerMessage).sendToTarget();
      return;
    }
    finally {}
  }
  
  public void setPlayWhenReady(boolean paramBoolean)
  {
    handler.obtainMessage(1, paramBoolean, 0).sendToTarget();
  }
  
  public void setPlaybackParameters(PlaybackParameters paramPlaybackParameters)
  {
    handler.obtainMessage(4, paramPlaybackParameters).sendToTarget();
  }
  
  public void setRepeatMode(int paramInt)
  {
    handler.obtainMessage(12, paramInt, 0).sendToTarget();
  }
  
  public void setSeekParameters(SeekParameters paramSeekParameters)
  {
    handler.obtainMessage(5, paramSeekParameters).sendToTarget();
  }
  
  public void setShuffleModeEnabled(boolean paramBoolean)
  {
    handler.obtainMessage(13, paramBoolean, 0).sendToTarget();
  }
  
  public void stop(boolean paramBoolean)
  {
    handler.obtainMessage(6, paramBoolean, 0).sendToTarget();
  }
  
  public static final class MediaSourceRefreshInfo
  {
    public final Object manifest;
    public final MediaSource source;
    public final Timeline timeline;
    
    public MediaSourceRefreshInfo(MediaSource paramMediaSource, Timeline paramTimeline, Object paramObject)
    {
      source = paramMediaSource;
      timeline = paramTimeline;
      manifest = paramObject;
    }
  }
  
  public static final class PendingMessageInfo
    implements Comparable<PendingMessageInfo>
  {
    public final PlayerMessage message;
    public int resolvedPeriodIndex;
    public long resolvedPeriodTimeUs;
    @Nullable
    public Object resolvedPeriodUid;
    
    public PendingMessageInfo(PlayerMessage paramPlayerMessage)
    {
      message = paramPlayerMessage;
    }
    
    public int compareTo(@NonNull PendingMessageInfo paramPendingMessageInfo)
    {
      Object localObject = resolvedPeriodUid;
      int i = 1;
      if (localObject == null) {
        j = 1;
      } else {
        j = 0;
      }
      int k;
      if (resolvedPeriodUid == null) {
        k = 1;
      } else {
        k = 0;
      }
      if (j != k)
      {
        j = i;
        if (localObject != null) {
          j = -1;
        }
        return j;
      }
      if (localObject == null) {
        return 0;
      }
      int j = resolvedPeriodIndex - resolvedPeriodIndex;
      if (j != 0) {
        return j;
      }
      return Util.compareLong(resolvedPeriodTimeUs, resolvedPeriodTimeUs);
    }
    
    public void setResolvedPosition(int paramInt, long paramLong, Object paramObject)
    {
      resolvedPeriodIndex = paramInt;
      resolvedPeriodTimeUs = paramLong;
      resolvedPeriodUid = paramObject;
    }
  }
  
  public static final class PlaybackInfoUpdate
  {
    private int discontinuityReason;
    private PlaybackInfo lastPlaybackInfo;
    private int operationAcks;
    private boolean positionDiscontinuity;
    
    public boolean hasPendingUpdate(PlaybackInfo paramPlaybackInfo)
    {
      boolean bool;
      if ((paramPlaybackInfo == lastPlaybackInfo) && (operationAcks <= 0) && (!positionDiscontinuity)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public void incrementPendingOperationAcks(int paramInt)
    {
      operationAcks += paramInt;
    }
    
    public void reset(PlaybackInfo paramPlaybackInfo)
    {
      lastPlaybackInfo = paramPlaybackInfo;
      operationAcks = 0;
      positionDiscontinuity = false;
    }
    
    public void setPositionDiscontinuity(int paramInt)
    {
      boolean bool1 = positionDiscontinuity;
      boolean bool2 = true;
      if ((bool1) && (discontinuityReason != 4))
      {
        if (paramInt != 4) {
          bool2 = false;
        }
        Assertions.checkArgument(bool2);
        return;
      }
      positionDiscontinuity = true;
      discontinuityReason = paramInt;
    }
  }
  
  public static final class SeekPosition
  {
    public final Timeline timeline;
    public final int windowIndex;
    public final long windowPositionUs;
    
    public SeekPosition(Timeline paramTimeline, int paramInt, long paramLong)
    {
      timeline = paramTimeline;
      windowIndex = paramInt;
      windowPositionUs = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.ExoPlayerImplInternal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */