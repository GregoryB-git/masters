package com.google.android.exoplayer2.source;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

final class ConcatenatingMediaSource$MediaSourceHolder
  implements Comparable<MediaSourceHolder>
{
  public List<DeferredMediaPeriod> activeMediaPeriods;
  public int childIndex;
  public int firstPeriodIndexInChild;
  public int firstWindowIndexInChild;
  public boolean hasStartedPreparing;
  public boolean isPrepared;
  public boolean isRemoved;
  public final MediaSource mediaSource;
  public ConcatenatingMediaSource.DeferredTimeline timeline;
  public final Object uid;
  
  public ConcatenatingMediaSource$MediaSourceHolder(MediaSource paramMediaSource)
  {
    mediaSource = paramMediaSource;
    timeline = new ConcatenatingMediaSource.DeferredTimeline();
    activeMediaPeriods = new ArrayList();
    uid = new Object();
  }
  
  public int compareTo(@NonNull MediaSourceHolder paramMediaSourceHolder)
  {
    return firstPeriodIndexInChild - firstPeriodIndexInChild;
  }
  
  public void reset(int paramInt1, int paramInt2, int paramInt3)
  {
    childIndex = paramInt1;
    firstWindowIndexInChild = paramInt2;
    firstPeriodIndexInChild = paramInt3;
    hasStartedPreparing = false;
    isPrepared = false;
    isRemoved = false;
    activeMediaPeriods.clear();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ConcatenatingMediaSource.MediaSourceHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */