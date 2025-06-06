package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.util.HashMap;
import java.util.Map;

public final class LoopingMediaSource
  extends CompositeMediaSource<Void>
{
  private final Map<MediaSource.MediaPeriodId, MediaSource.MediaPeriodId> childMediaPeriodIdToMediaPeriodId;
  private final MediaSource childSource;
  private final int loopCount;
  private final Map<MediaPeriod, MediaSource.MediaPeriodId> mediaPeriodToChildMediaPeriodId;
  
  public LoopingMediaSource(MediaSource paramMediaSource)
  {
    this(paramMediaSource, Integer.MAX_VALUE);
  }
  
  public LoopingMediaSource(MediaSource paramMediaSource, int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    childSource = paramMediaSource;
    loopCount = paramInt;
    childMediaPeriodIdToMediaPeriodId = new HashMap();
    mediaPeriodToChildMediaPeriodId = new HashMap();
  }
  
  public MediaPeriod createPeriod(MediaSource.MediaPeriodId paramMediaPeriodId, Allocator paramAllocator)
  {
    if (loopCount == Integer.MAX_VALUE) {
      return childSource.createPeriod(paramMediaPeriodId, paramAllocator);
    }
    MediaSource.MediaPeriodId localMediaPeriodId = paramMediaPeriodId.copyWithPeriodUid(AbstractConcatenatedTimeline.getChildPeriodUidFromConcatenatedUid(periodUid));
    childMediaPeriodIdToMediaPeriodId.put(localMediaPeriodId, paramMediaPeriodId);
    paramMediaPeriodId = childSource.createPeriod(localMediaPeriodId, paramAllocator);
    mediaPeriodToChildMediaPeriodId.put(paramMediaPeriodId, localMediaPeriodId);
    return paramMediaPeriodId;
  }
  
  @Nullable
  public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Void paramVoid, MediaSource.MediaPeriodId paramMediaPeriodId)
  {
    paramVoid = paramMediaPeriodId;
    if (loopCount != Integer.MAX_VALUE) {
      paramVoid = (MediaSource.MediaPeriodId)childMediaPeriodIdToMediaPeriodId.get(paramMediaPeriodId);
    }
    return paramVoid;
  }
  
  public void onChildSourceInfoRefreshed(Void paramVoid, MediaSource paramMediaSource, Timeline paramTimeline, @Nullable Object paramObject)
  {
    if (loopCount != Integer.MAX_VALUE) {
      paramVoid = new LoopingTimeline(paramTimeline, loopCount);
    } else {
      paramVoid = new InfinitelyLoopingTimeline(paramTimeline);
    }
    refreshSourceInfo(paramVoid, paramObject);
  }
  
  public void prepareSourceInternal(ExoPlayer paramExoPlayer, boolean paramBoolean, @Nullable TransferListener paramTransferListener)
  {
    super.prepareSourceInternal(paramExoPlayer, paramBoolean, paramTransferListener);
    prepareChildSource(null, childSource);
  }
  
  public void releasePeriod(MediaPeriod paramMediaPeriod)
  {
    childSource.releasePeriod(paramMediaPeriod);
    paramMediaPeriod = (MediaSource.MediaPeriodId)mediaPeriodToChildMediaPeriodId.remove(paramMediaPeriod);
    if (paramMediaPeriod != null) {
      childMediaPeriodIdToMediaPeriodId.remove(paramMediaPeriod);
    }
  }
  
  public static final class InfinitelyLoopingTimeline
    extends ForwardingTimeline
  {
    public InfinitelyLoopingTimeline(Timeline paramTimeline)
    {
      super();
    }
    
    public int getNextWindowIndex(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      paramInt2 = timeline.getNextWindowIndex(paramInt1, paramInt2, paramBoolean);
      paramInt1 = paramInt2;
      if (paramInt2 == -1) {
        paramInt1 = getFirstWindowIndex(paramBoolean);
      }
      return paramInt1;
    }
    
    public int getPreviousWindowIndex(int paramInt1, int paramInt2, boolean paramBoolean)
    {
      paramInt2 = timeline.getPreviousWindowIndex(paramInt1, paramInt2, paramBoolean);
      paramInt1 = paramInt2;
      if (paramInt2 == -1) {
        paramInt1 = getLastWindowIndex(paramBoolean);
      }
      return paramInt1;
    }
  }
  
  public static final class LoopingTimeline
    extends AbstractConcatenatedTimeline
  {
    private final int childPeriodCount;
    private final Timeline childTimeline;
    private final int childWindowCount;
    private final int loopCount;
    
    public LoopingTimeline(Timeline paramTimeline, int paramInt)
    {
      super(localUnshuffledShuffleOrder);
      childTimeline = paramTimeline;
      int i = paramTimeline.getPeriodCount();
      childPeriodCount = i;
      childWindowCount = paramTimeline.getWindowCount();
      loopCount = paramInt;
      if (i > 0)
      {
        if (paramInt <= Integer.MAX_VALUE / i) {
          bool = true;
        }
        Assertions.checkState(bool, "LoopingMediaSource contains too many periods");
      }
    }
    
    public int getChildIndexByChildUid(Object paramObject)
    {
      if (!(paramObject instanceof Integer)) {
        return -1;
      }
      return ((Integer)paramObject).intValue();
    }
    
    public int getChildIndexByPeriodIndex(int paramInt)
    {
      return paramInt / childPeriodCount;
    }
    
    public int getChildIndexByWindowIndex(int paramInt)
    {
      return paramInt / childWindowCount;
    }
    
    public Object getChildUidByChildIndex(int paramInt)
    {
      return Integer.valueOf(paramInt);
    }
    
    public int getFirstPeriodIndexByChildIndex(int paramInt)
    {
      return paramInt * childPeriodCount;
    }
    
    public int getFirstWindowIndexByChildIndex(int paramInt)
    {
      return paramInt * childWindowCount;
    }
    
    public int getPeriodCount()
    {
      return childPeriodCount * loopCount;
    }
    
    public Timeline getTimelineByChildIndex(int paramInt)
    {
      return childTimeline;
    }
    
    public int getWindowCount()
    {
      return childWindowCount * loopCount;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.LoopingMediaSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */