package com.google.android.exoplayer2;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.Assertions;

final class MediaPeriodQueue
{
  private static final int MAXIMUM_BUFFER_AHEAD_PERIODS = 100;
  private int length;
  @Nullable
  private MediaPeriodHolder loading;
  private long nextWindowSequenceNumber;
  @Nullable
  private Object oldFrontPeriodUid;
  private long oldFrontPeriodWindowSequenceNumber;
  private final Timeline.Period period = new Timeline.Period();
  @Nullable
  private MediaPeriodHolder playing;
  @Nullable
  private MediaPeriodHolder reading;
  private int repeatMode;
  private boolean shuffleModeEnabled;
  private Timeline timeline = Timeline.EMPTY;
  private final Timeline.Window window = new Timeline.Window();
  
  private boolean canKeepMediaPeriodHolder(MediaPeriodHolder paramMediaPeriodHolder, MediaPeriodInfo paramMediaPeriodInfo)
  {
    paramMediaPeriodHolder = info;
    boolean bool;
    if ((startPositionUs == startPositionUs) && (id.equals(id))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private MediaPeriodInfo getFirstMediaPeriodInfo(PlaybackInfo paramPlaybackInfo)
  {
    return getMediaPeriodInfo(periodId, contentPositionUs, startPositionUs);
  }
  
  @Nullable
  private MediaPeriodInfo getFollowingMediaPeriodInfo(MediaPeriodHolder paramMediaPeriodHolder, long paramLong)
  {
    Object localObject1 = info;
    long l1 = paramMediaPeriodHolder.getRendererOffset() + durationUs - paramLong;
    boolean bool = isLastInTimelinePeriod;
    long l2 = 0L;
    Object localObject2 = null;
    Object localObject3 = null;
    if (bool)
    {
      i = timeline.getIndexOfPeriod(id.periodUid);
      j = timeline.getNextPeriodIndex(i, period, window, repeatMode, shuffleModeEnabled);
      if (j == -1) {
        return null;
      }
      i = timeline.getPeriod(j, period, true).windowIndex;
      localObject3 = period.uid;
      paramLong = id.windowSequenceNumber;
      if (timeline.getWindow(i, window).firstPeriodIndex == j)
      {
        localObject2 = timeline.getPeriodPosition(window, period, i, -9223372036854775807L, Math.max(0L, l1));
        if (localObject2 == null) {
          return null;
        }
        localObject3 = first;
        l2 = ((Long)second).longValue();
        localObject2 = next;
        if ((localObject2 != null) && (uid.equals(localObject3)))
        {
          paramLong = next.info.id.windowSequenceNumber;
        }
        else
        {
          paramLong = nextWindowSequenceNumber;
          nextWindowSequenceNumber = (1L + paramLong);
        }
        paramMediaPeriodHolder = (MediaPeriodHolder)localObject3;
      }
      else
      {
        paramMediaPeriodHolder = (MediaPeriodHolder)localObject3;
      }
      return getMediaPeriodInfo(resolveMediaPeriodIdForAds(paramMediaPeriodHolder, l2, paramLong), l2, l2);
    }
    paramMediaPeriodHolder = id;
    timeline.getPeriodByUid(periodUid, period);
    if (paramMediaPeriodHolder.isAd())
    {
      j = adGroupIndex;
      i = period.getAdCountInAdGroup(j);
      if (i == -1) {
        return null;
      }
      int k = period.getNextAdIndexToPlay(j, adIndexInAdGroup);
      if (k < i)
      {
        if (!period.isAdAvailable(j, k)) {
          paramMediaPeriodHolder = (MediaPeriodHolder)localObject3;
        } else {
          paramMediaPeriodHolder = getMediaPeriodInfoForAd(periodUid, j, k, contentPositionUs, windowSequenceNumber);
        }
        return paramMediaPeriodHolder;
      }
      paramLong = contentPositionUs;
      if ((period.getAdGroupCount() == 1) && (period.getAdGroupTimeUs(0) == 0L))
      {
        localObject3 = timeline;
        localObject2 = window;
        localObject1 = period;
        localObject3 = ((Timeline)localObject3).getPeriodPosition((Timeline.Window)localObject2, (Timeline.Period)localObject1, windowIndex, -9223372036854775807L, Math.max(0L, l1));
        if (localObject3 == null) {
          return null;
        }
        paramLong = ((Long)second).longValue();
      }
      return getMediaPeriodInfoForContent(periodUid, paramLong, windowSequenceNumber);
    }
    paramLong = id.endPositionUs;
    if (paramLong != Long.MIN_VALUE)
    {
      j = period.getAdGroupIndexForPositionUs(paramLong);
      if (j == -1) {
        return getMediaPeriodInfoForContent(periodUid, id.endPositionUs, windowSequenceNumber);
      }
      i = period.getFirstAdIndexToPlay(j);
      if (!period.isAdAvailable(j, i)) {
        paramMediaPeriodHolder = (MediaPeriodHolder)localObject2;
      } else {
        paramMediaPeriodHolder = getMediaPeriodInfoForAd(periodUid, j, i, id.endPositionUs, windowSequenceNumber);
      }
      return paramMediaPeriodHolder;
    }
    int i = period.getAdGroupCount();
    if (i == 0) {
      return null;
    }
    int j = i - 1;
    if ((period.getAdGroupTimeUs(j) == Long.MIN_VALUE) && (!period.hasPlayedAdGroup(j)))
    {
      i = period.getFirstAdIndexToPlay(j);
      if (!period.isAdAvailable(j, i)) {
        return null;
      }
      paramLong = period.getDurationUs();
      return getMediaPeriodInfoForAd(periodUid, j, i, paramLong, windowSequenceNumber);
    }
    return null;
  }
  
  private MediaPeriodInfo getMediaPeriodInfo(MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong1, long paramLong2)
  {
    timeline.getPeriodByUid(periodUid, period);
    if (paramMediaPeriodId.isAd())
    {
      if (!period.isAdAvailable(adGroupIndex, adIndexInAdGroup)) {
        return null;
      }
      return getMediaPeriodInfoForAd(periodUid, adGroupIndex, adIndexInAdGroup, paramLong1, windowSequenceNumber);
    }
    return getMediaPeriodInfoForContent(periodUid, paramLong2, windowSequenceNumber);
  }
  
  private MediaPeriodInfo getMediaPeriodInfoForAd(Object paramObject, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    paramObject = new MediaSource.MediaPeriodId(paramObject, paramInt1, paramInt2, paramLong2);
    boolean bool1 = isLastInPeriod((MediaSource.MediaPeriodId)paramObject);
    boolean bool2 = isLastInTimeline((MediaSource.MediaPeriodId)paramObject, bool1);
    long l = timeline.getPeriodByUid(periodUid, period).getAdDurationUs(adGroupIndex, adIndexInAdGroup);
    if (paramInt2 == period.getFirstAdIndexToPlay(paramInt1)) {
      paramLong2 = period.getAdResumePositionUs();
    } else {
      paramLong2 = 0L;
    }
    return new MediaPeriodInfo((MediaSource.MediaPeriodId)paramObject, paramLong2, paramLong1, l, bool1, bool2);
  }
  
  private MediaPeriodInfo getMediaPeriodInfoForContent(Object paramObject, long paramLong1, long paramLong2)
  {
    int i = period.getAdGroupIndexAfterPositionUs(paramLong1);
    long l;
    if (i == -1) {
      l = Long.MIN_VALUE;
    } else {
      l = period.getAdGroupTimeUs(i);
    }
    paramObject = new MediaSource.MediaPeriodId(paramObject, paramLong2, l);
    timeline.getPeriodByUid(periodUid, period);
    boolean bool1 = isLastInPeriod((MediaSource.MediaPeriodId)paramObject);
    boolean bool2 = isLastInTimeline((MediaSource.MediaPeriodId)paramObject, bool1);
    if (l == Long.MIN_VALUE) {
      paramLong2 = period.getDurationUs();
    } else {
      paramLong2 = l;
    }
    return new MediaPeriodInfo((MediaSource.MediaPeriodId)paramObject, paramLong1, -9223372036854775807L, paramLong2, bool1, bool2);
  }
  
  private boolean isLastInPeriod(MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    int i = timeline.getPeriodByUid(periodUid, period).getAdGroupCount();
    boolean bool1 = true;
    boolean bool2 = true;
    if (i == 0) {
      return true;
    }
    int j = i - 1;
    boolean bool3 = paramMediaPeriodId.isAd();
    if (period.getAdGroupTimeUs(j) != Long.MIN_VALUE)
    {
      if ((bool3) || (endPositionUs != Long.MIN_VALUE)) {
        bool2 = false;
      }
      return bool2;
    }
    int k = period.getAdCountInAdGroup(j);
    if (k == -1) {
      return false;
    }
    if ((bool3) && (adGroupIndex == j) && (adIndexInAdGroup == k - 1)) {
      i = 1;
    } else {
      i = 0;
    }
    bool2 = bool1;
    if (i == 0) {
      if ((!bool3) && (period.getFirstAdIndexToPlay(j) == k)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  private boolean isLastInTimeline(MediaSource.MediaPeriodId paramMediaPeriodId, boolean paramBoolean)
  {
    int i = timeline.getIndexOfPeriod(periodUid);
    int j = timeline.getPeriod(i, period).windowIndex;
    if ((!timeline.getWindow(j, window).isDynamic) && (timeline.isLastPeriod(i, period, window, repeatMode, shuffleModeEnabled)) && (paramBoolean)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  private MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Object paramObject, long paramLong1, long paramLong2)
  {
    timeline.getPeriodByUid(paramObject, period);
    int i = period.getAdGroupIndexForPositionUs(paramLong1);
    if (i == -1)
    {
      i = period.getAdGroupIndexAfterPositionUs(paramLong1);
      if (i == -1) {
        paramLong1 = Long.MIN_VALUE;
      } else {
        paramLong1 = period.getAdGroupTimeUs(i);
      }
      return new MediaSource.MediaPeriodId(paramObject, paramLong2, paramLong1);
    }
    return new MediaSource.MediaPeriodId(paramObject, i, period.getFirstAdIndexToPlay(i), paramLong2);
  }
  
  private long resolvePeriodIndexToWindowSequenceNumber(Object paramObject)
  {
    int i = timeline.getPeriodByUid(paramObject, period).windowIndex;
    Object localObject = oldFrontPeriodUid;
    int j;
    if (localObject != null)
    {
      j = timeline.getIndexOfPeriod(localObject);
      if ((j != -1) && (timeline.getPeriod(j, period).windowIndex == i)) {
        return oldFrontPeriodWindowSequenceNumber;
      }
    }
    for (localObject = getFrontPeriod(); localObject != null; localObject = next) {
      if (uid.equals(paramObject)) {
        return info.id.windowSequenceNumber;
      }
    }
    for (paramObject = getFrontPeriod(); paramObject != null; paramObject = next)
    {
      j = timeline.getIndexOfPeriod(uid);
      if ((j != -1) && (timeline.getPeriod(j, period).windowIndex == i)) {
        return info.id.windowSequenceNumber;
      }
    }
    long l = nextWindowSequenceNumber;
    nextWindowSequenceNumber = (1L + l);
    return l;
  }
  
  private boolean updateForPlaybackModeChange()
  {
    Object localObject = getFrontPeriod();
    boolean bool1 = true;
    if (localObject == null) {
      return true;
    }
    int i = timeline.getIndexOfPeriod(uid);
    for (;;)
    {
      i = timeline.getNextPeriodIndex(i, period, window, repeatMode, shuffleModeEnabled);
      MediaPeriodHolder localMediaPeriodHolder;
      for (;;)
      {
        localMediaPeriodHolder = next;
        if ((localMediaPeriodHolder == null) || (info.isLastInTimelinePeriod)) {
          break;
        }
        localObject = localMediaPeriodHolder;
      }
      if ((i == -1) || (localMediaPeriodHolder == null) || (timeline.getIndexOfPeriod(uid) != i)) {
        break;
      }
      localObject = next;
    }
    boolean bool2 = removeAfter((MediaPeriodHolder)localObject);
    info = getUpdatedMediaPeriodInfo(info);
    boolean bool3 = bool1;
    if (bool2) {
      if (!hasPlayingPeriod()) {
        bool3 = bool1;
      } else {
        bool3 = false;
      }
    }
    return bool3;
  }
  
  public MediaPeriodHolder advancePlayingPeriod()
  {
    MediaPeriodHolder localMediaPeriodHolder = playing;
    if (localMediaPeriodHolder != null)
    {
      if (localMediaPeriodHolder == reading) {
        reading = next;
      }
      localMediaPeriodHolder.release();
      int i = length - 1;
      length = i;
      if (i == 0)
      {
        loading = null;
        localMediaPeriodHolder = playing;
        oldFrontPeriodUid = uid;
        oldFrontPeriodWindowSequenceNumber = info.id.windowSequenceNumber;
      }
      playing = playing.next;
    }
    else
    {
      localMediaPeriodHolder = loading;
      playing = localMediaPeriodHolder;
      reading = localMediaPeriodHolder;
    }
    return playing;
  }
  
  public MediaPeriodHolder advanceReadingPeriod()
  {
    MediaPeriodHolder localMediaPeriodHolder = reading;
    boolean bool;
    if ((localMediaPeriodHolder != null) && (next != null)) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    localMediaPeriodHolder = reading.next;
    reading = localMediaPeriodHolder;
    return localMediaPeriodHolder;
  }
  
  public void clear(boolean paramBoolean)
  {
    MediaPeriodHolder localMediaPeriodHolder = getFrontPeriod();
    if (localMediaPeriodHolder != null)
    {
      Object localObject;
      if (paramBoolean) {
        localObject = uid;
      } else {
        localObject = null;
      }
      oldFrontPeriodUid = localObject;
      oldFrontPeriodWindowSequenceNumber = info.id.windowSequenceNumber;
      localMediaPeriodHolder.release();
      removeAfter(localMediaPeriodHolder);
    }
    else if (!paramBoolean)
    {
      oldFrontPeriodUid = null;
    }
    playing = null;
    loading = null;
    reading = null;
    length = 0;
  }
  
  public MediaPeriod enqueueNextMediaPeriod(RendererCapabilities[] paramArrayOfRendererCapabilities, TrackSelector paramTrackSelector, Allocator paramAllocator, MediaSource paramMediaSource, MediaPeriodInfo paramMediaPeriodInfo)
  {
    MediaPeriodHolder localMediaPeriodHolder = loading;
    long l;
    if (localMediaPeriodHolder == null) {
      l = startPositionUs;
    } else {
      l = localMediaPeriodHolder.getRendererOffset() + loading.info.durationUs;
    }
    paramArrayOfRendererCapabilities = new MediaPeriodHolder(paramArrayOfRendererCapabilities, l, paramTrackSelector, paramAllocator, paramMediaSource, paramMediaPeriodInfo);
    if (loading != null)
    {
      Assertions.checkState(hasPlayingPeriod());
      loading.next = paramArrayOfRendererCapabilities;
    }
    oldFrontPeriodUid = null;
    loading = paramArrayOfRendererCapabilities;
    length += 1;
    return mediaPeriod;
  }
  
  public MediaPeriodHolder getFrontPeriod()
  {
    MediaPeriodHolder localMediaPeriodHolder;
    if (hasPlayingPeriod()) {
      localMediaPeriodHolder = playing;
    } else {
      localMediaPeriodHolder = loading;
    }
    return localMediaPeriodHolder;
  }
  
  public MediaPeriodHolder getLoadingPeriod()
  {
    return loading;
  }
  
  @Nullable
  public MediaPeriodInfo getNextMediaPeriodInfo(long paramLong, PlaybackInfo paramPlaybackInfo)
  {
    MediaPeriodHolder localMediaPeriodHolder = loading;
    if (localMediaPeriodHolder == null) {
      paramPlaybackInfo = getFirstMediaPeriodInfo(paramPlaybackInfo);
    } else {
      paramPlaybackInfo = getFollowingMediaPeriodInfo(localMediaPeriodHolder, paramLong);
    }
    return paramPlaybackInfo;
  }
  
  public MediaPeriodHolder getPlayingPeriod()
  {
    return playing;
  }
  
  public MediaPeriodHolder getReadingPeriod()
  {
    return reading;
  }
  
  public MediaPeriodInfo getUpdatedMediaPeriodInfo(MediaPeriodInfo paramMediaPeriodInfo)
  {
    boolean bool1 = isLastInPeriod(id);
    boolean bool2 = isLastInTimeline(id, bool1);
    timeline.getPeriodByUid(id.periodUid, period);
    long l1;
    if (id.isAd())
    {
      Timeline.Period localPeriod = period;
      MediaSource.MediaPeriodId localMediaPeriodId = id;
      l1 = localPeriod.getAdDurationUs(adGroupIndex, adIndexInAdGroup);
    }
    for (;;)
    {
      break;
      long l2 = id.endPositionUs;
      l1 = l2;
      if (l2 == Long.MIN_VALUE) {
        l1 = period.getDurationUs();
      }
    }
    return new MediaPeriodInfo(id, startPositionUs, contentPositionUs, l1, bool1, bool2);
  }
  
  public boolean hasPlayingPeriod()
  {
    boolean bool;
    if (playing != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isLoading(MediaPeriod paramMediaPeriod)
  {
    MediaPeriodHolder localMediaPeriodHolder = loading;
    boolean bool;
    if ((localMediaPeriodHolder != null) && (mediaPeriod == paramMediaPeriod)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void reevaluateBuffer(long paramLong)
  {
    MediaPeriodHolder localMediaPeriodHolder = loading;
    if (localMediaPeriodHolder != null) {
      localMediaPeriodHolder.reevaluateBuffer(paramLong);
    }
  }
  
  public boolean removeAfter(MediaPeriodHolder paramMediaPeriodHolder)
  {
    boolean bool1 = false;
    if (paramMediaPeriodHolder != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkState(bool2);
    loading = paramMediaPeriodHolder;
    boolean bool2 = bool1;
    for (;;)
    {
      paramMediaPeriodHolder = next;
      if (paramMediaPeriodHolder == null) {
        break;
      }
      if (paramMediaPeriodHolder == reading)
      {
        reading = playing;
        bool2 = true;
      }
      paramMediaPeriodHolder.release();
      length -= 1;
    }
    loading.next = null;
    return bool2;
  }
  
  public MediaSource.MediaPeriodId resolveMediaPeriodIdForAds(Object paramObject, long paramLong)
  {
    return resolveMediaPeriodIdForAds(paramObject, paramLong, resolvePeriodIndexToWindowSequenceNumber(paramObject));
  }
  
  public void setTimeline(Timeline paramTimeline)
  {
    timeline = paramTimeline;
  }
  
  public boolean shouldLoadNextMediaPeriod()
  {
    MediaPeriodHolder localMediaPeriodHolder = loading;
    boolean bool;
    if ((localMediaPeriodHolder != null) && ((info.isFinal) || (!localMediaPeriodHolder.isFullyBuffered()) || (loading.info.durationUs == -9223372036854775807L) || (length >= 100))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean updateQueuedPeriods(MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong)
  {
    int i = timeline.getIndexOfPeriod(periodUid);
    paramMediaPeriodId = getFrontPeriod();
    Object localObject1 = null;
    for (;;)
    {
      bool = true;
      if (paramMediaPeriodId == null) {
        break label200;
      }
      if (localObject1 == null)
      {
        info = getUpdatedMediaPeriodInfo(info);
      }
      else
      {
        if ((i == -1) || (!uid.equals(timeline.getUidOfPeriod(i)))) {
          break;
        }
        localObject2 = getFollowingMediaPeriodInfo((MediaPeriodHolder)localObject1, paramLong);
        if (localObject2 == null) {
          return true ^ removeAfter((MediaPeriodHolder)localObject1);
        }
        info = getUpdatedMediaPeriodInfo(info);
        if (!canKeepMediaPeriodHolder(paramMediaPeriodId, (MediaPeriodInfo)localObject2)) {
          return true ^ removeAfter((MediaPeriodHolder)localObject1);
        }
      }
      int j = i;
      if (info.isLastInTimelinePeriod) {
        j = timeline.getNextPeriodIndex(i, period, window, repeatMode, shuffleModeEnabled);
      }
      Object localObject2 = next;
      localObject1 = paramMediaPeriodId;
      paramMediaPeriodId = (MediaSource.MediaPeriodId)localObject2;
      i = j;
    }
    boolean bool = true ^ removeAfter((MediaPeriodHolder)localObject1);
    label200:
    return bool;
  }
  
  public boolean updateRepeatMode(int paramInt)
  {
    repeatMode = paramInt;
    return updateForPlaybackModeChange();
  }
  
  public boolean updateShuffleModeEnabled(boolean paramBoolean)
  {
    shuffleModeEnabled = paramBoolean;
    return updateForPlaybackModeChange();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.MediaPeriodQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */