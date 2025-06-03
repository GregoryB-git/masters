package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public final class MergingMediaSource
  extends CompositeMediaSource<Integer>
{
  private static final int PERIOD_COUNT_UNSET = -1;
  private final CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory;
  private final MediaSource[] mediaSources;
  private IllegalMergeException mergeError;
  private final ArrayList<MediaSource> pendingTimelineSources;
  private int periodCount;
  private Object primaryManifest;
  private final Timeline[] timelines;
  
  public MergingMediaSource(CompositeSequenceableLoaderFactory paramCompositeSequenceableLoaderFactory, MediaSource... paramVarArgs)
  {
    mediaSources = paramVarArgs;
    compositeSequenceableLoaderFactory = paramCompositeSequenceableLoaderFactory;
    pendingTimelineSources = new ArrayList(Arrays.asList(paramVarArgs));
    periodCount = -1;
    timelines = new Timeline[paramVarArgs.length];
  }
  
  public MergingMediaSource(MediaSource... paramVarArgs)
  {
    this(new DefaultCompositeSequenceableLoaderFactory(), paramVarArgs);
  }
  
  private IllegalMergeException checkTimelineMerges(Timeline paramTimeline)
  {
    if (periodCount == -1) {
      periodCount = paramTimeline.getPeriodCount();
    } else if (paramTimeline.getPeriodCount() != periodCount) {
      return new IllegalMergeException(0);
    }
    return null;
  }
  
  public MediaPeriod createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
  {
    int i = mediaSources.length;
    MediaPeriod[] arrayOfMediaPeriod = new MediaPeriod[i];
    Object localObject = timelines;
    int j = 0;
    int k = localObject[0].getIndexOfPeriod(periodUid);
    while (j < i)
    {
      localObject = paramMediaPeriodId.copyWithPeriodUid(timelines[j].getUidOfPeriod(k));
      arrayOfMediaPeriod[j] = mediaSources[j].createPeriod((MediaSource.MediaPeriodId)localObject, paramAllocator);
      j++;
    }
    return new MergingMediaPeriod(compositeSequenceableLoaderFactory, arrayOfMediaPeriod);
  }
  
  @Nullable
  public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer paramInteger, MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    if (paramInteger.intValue() != 0) {
      paramMediaPeriodId = null;
    }
    return paramMediaPeriodId;
  }
  
  public void maybeThrowSourceInfoRefreshError()
    throws IOException
  {
    IllegalMergeException localIllegalMergeException = mergeError;
    if (localIllegalMergeException == null)
    {
      super.maybeThrowSourceInfoRefreshError();
      return;
    }
    throw localIllegalMergeException;
  }
  
  public void onChildSourceInfoRefreshed(Integer paramInteger, MediaSource paramMediaSource, Timeline paramTimeline, @Nullable Object paramObject)
  {
    if (mergeError == null) {
      mergeError = checkTimelineMerges(paramTimeline);
    }
    if (mergeError != null) {
      return;
    }
    pendingTimelineSources.remove(paramMediaSource);
    timelines[paramInteger.intValue()] = paramTimeline;
    if (paramMediaSource == mediaSources[0]) {
      primaryManifest = paramObject;
    }
    if (pendingTimelineSources.isEmpty()) {
      refreshSourceInfo(timelines[0], primaryManifest);
    }
  }
  
  public void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener)
  {
    super.prepareSourceInternal(paramExoPlayer, paramBoolean, paramTransferListener);
    for (int i = 0; i < mediaSources.length; i++) {
      prepareChildSource(Integer.valueOf(i), mediaSources[i]);
    }
  }
  
  public void releasePeriod(MediaPeriod paramMediaPeriod)
  {
    MergingMediaPeriod localMergingMediaPeriod = (MergingMediaPeriod)paramMediaPeriod;
    for (int i = 0;; i++)
    {
      paramMediaPeriod = mediaSources;
      if (i >= paramMediaPeriod.length) {
        break;
      }
      paramMediaPeriod[i].releasePeriod(periods[i]);
    }
  }
  
  public void releaseSourceInternal()
  {
    super.releaseSourceInternal();
    Arrays.fill(timelines, null);
    primaryManifest = null;
    periodCount = -1;
    mergeError = null;
    pendingTimelineSources.clear();
    Collections.addAll(pendingTimelineSources, mediaSources);
  }
  
  public static final class IllegalMergeException
    extends IOException
  {
    public static final int REASON_PERIOD_COUNT_MISMATCH = 0;
    public final int reason;
    
    public IllegalMergeException(int paramInt)
    {
      reason = paramInt;
    }
    
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public static @interface Reason {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.MergingMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */