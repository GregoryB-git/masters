package com.google.android.exoplayer2;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;

final class PlaybackInfo
{
  private static final MediaSource.MediaPeriodId DUMMY_MEDIA_PERIOD_ID = new MediaSource.MediaPeriodId(new Object());
  public volatile long bufferedPositionUs;
  public final long contentPositionUs;
  public final boolean isLoading;
  public final MediaSource.MediaPeriodId loadingMediaPeriodId;
  @Nullable
  public final Object manifest;
  public final MediaSource.MediaPeriodId periodId;
  public final int playbackState;
  public volatile long positionUs;
  public final long startPositionUs;
  public final Timeline timeline;
  public volatile long totalBufferedDurationUs;
  public final TrackGroupArray trackGroups;
  public final TrackSelectorResult trackSelectorResult;
  
  public PlaybackInfo(Timeline paramTimeline, @Nullable Object paramObject, MediaSource.MediaPeriodId paramMediaPeriodId1, long paramLong1, long paramLong2, int paramInt, boolean paramBoolean, TrackGroupArray paramTrackGroupArray, TrackSelectorResult paramTrackSelectorResult, MediaSource.MediaPeriodId paramMediaPeriodId2, long paramLong3, long paramLong4, long paramLong5)
  {
    timeline = paramTimeline;
    manifest = paramObject;
    periodId = paramMediaPeriodId1;
    startPositionUs = paramLong1;
    contentPositionUs = paramLong2;
    playbackState = paramInt;
    isLoading = paramBoolean;
    trackGroups = paramTrackGroupArray;
    trackSelectorResult = paramTrackSelectorResult;
    loadingMediaPeriodId = paramMediaPeriodId2;
    bufferedPositionUs = paramLong3;
    totalBufferedDurationUs = paramLong4;
    positionUs = paramLong5;
  }
  
  public static PlaybackInfo createDummy(long paramLong, TrackSelectorResult paramTrackSelectorResult)
  {
    Timeline localTimeline = Timeline.EMPTY;
    MediaSource.MediaPeriodId localMediaPeriodId = DUMMY_MEDIA_PERIOD_ID;
    return new PlaybackInfo(localTimeline, null, localMediaPeriodId, paramLong, -9223372036854775807L, 1, false, TrackGroupArray.EMPTY, paramTrackSelectorResult, localMediaPeriodId, paramLong, 0L, paramLong);
  }
  
  @CheckResult
  public PlaybackInfo copyWithIsLoading(boolean paramBoolean)
  {
    return new PlaybackInfo(timeline, manifest, periodId, startPositionUs, contentPositionUs, playbackState, paramBoolean, trackGroups, trackSelectorResult, loadingMediaPeriodId, bufferedPositionUs, totalBufferedDurationUs, positionUs);
  }
  
  @CheckResult
  public PlaybackInfo copyWithLoadingMediaPeriodId(MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    return new PlaybackInfo(timeline, manifest, periodId, startPositionUs, contentPositionUs, playbackState, isLoading, trackGroups, trackSelectorResult, paramMediaPeriodId, bufferedPositionUs, totalBufferedDurationUs, positionUs);
  }
  
  @CheckResult
  public PlaybackInfo copyWithNewPosition(MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong1, long paramLong2, long paramLong3)
  {
    Timeline localTimeline = timeline;
    Object localObject = manifest;
    if (!paramMediaPeriodId.isAd()) {
      paramLong2 = -9223372036854775807L;
    }
    return new PlaybackInfo(localTimeline, localObject, paramMediaPeriodId, paramLong1, paramLong2, playbackState, isLoading, trackGroups, trackSelectorResult, loadingMediaPeriodId, bufferedPositionUs, paramLong3, paramLong1);
  }
  
  @CheckResult
  public PlaybackInfo copyWithPlaybackState(int paramInt)
  {
    return new PlaybackInfo(timeline, manifest, periodId, startPositionUs, contentPositionUs, paramInt, isLoading, trackGroups, trackSelectorResult, loadingMediaPeriodId, bufferedPositionUs, totalBufferedDurationUs, positionUs);
  }
  
  @CheckResult
  public PlaybackInfo copyWithTimeline(Timeline paramTimeline, Object paramObject)
  {
    return new PlaybackInfo(paramTimeline, paramObject, periodId, startPositionUs, contentPositionUs, playbackState, isLoading, trackGroups, trackSelectorResult, loadingMediaPeriodId, bufferedPositionUs, totalBufferedDurationUs, positionUs);
  }
  
  @CheckResult
  public PlaybackInfo copyWithTrackInfo(TrackGroupArray paramTrackGroupArray, TrackSelectorResult paramTrackSelectorResult)
  {
    return new PlaybackInfo(timeline, manifest, periodId, startPositionUs, contentPositionUs, playbackState, isLoading, paramTrackGroupArray, paramTrackSelectorResult, loadingMediaPeriodId, bufferedPositionUs, totalBufferedDurationUs, positionUs);
  }
  
  public MediaSource.MediaPeriodId getDummyFirstMediaPeriodId(boolean paramBoolean, Timeline.Window paramWindow)
  {
    if (timeline.isEmpty()) {
      return DUMMY_MEDIA_PERIOD_ID;
    }
    Timeline localTimeline = timeline;
    int i = getWindowgetFirstWindowIndexfirstPeriodIndex;
    return new MediaSource.MediaPeriodId(timeline.getUidOfPeriod(i));
  }
  
  @CheckResult
  public PlaybackInfo resetToNewPosition(MediaSource.MediaPeriodId paramMediaPeriodId, long paramLong1, long paramLong2)
  {
    Timeline localTimeline = timeline;
    Object localObject = manifest;
    if (!paramMediaPeriodId.isAd()) {
      paramLong2 = -9223372036854775807L;
    }
    return new PlaybackInfo(localTimeline, localObject, paramMediaPeriodId, paramLong1, paramLong2, playbackState, isLoading, trackGroups, trackSelectorResult, paramMediaPeriodId, paramLong1, 0L, paramLong1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.PlaybackInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */