package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;

public class DefaultLoadControl
  implements LoadControl
{
  public static final int DEFAULT_BACK_BUFFER_DURATION_MS = 0;
  public static final int DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = 5000;
  public static final int DEFAULT_BUFFER_FOR_PLAYBACK_MS = 2500;
  public static final int DEFAULT_MAX_BUFFER_MS = 50000;
  public static final int DEFAULT_MIN_BUFFER_MS = 15000;
  public static final boolean DEFAULT_PRIORITIZE_TIME_OVER_SIZE_THRESHOLDS = true;
  public static final boolean DEFAULT_RETAIN_BACK_BUFFER_FROM_KEYFRAME = false;
  public static final int DEFAULT_TARGET_BUFFER_BYTES = -1;
  private final DefaultAllocator allocator;
  private final long backBufferDurationUs;
  private final long bufferForPlaybackAfterRebufferUs;
  private final long bufferForPlaybackUs;
  private boolean isBuffering;
  private final long maxBufferUs;
  private final long minBufferUs;
  private final boolean prioritizeTimeOverSizeThresholds;
  private final PriorityTaskManager priorityTaskManager;
  private final boolean retainBackBufferFromKeyframe;
  private final int targetBufferBytesOverwrite;
  private int targetBufferSize;
  
  public DefaultLoadControl()
  {
    this(new DefaultAllocator(true, 65536));
  }
  
  @Deprecated
  public DefaultLoadControl(DefaultAllocator paramDefaultAllocator)
  {
    this(paramDefaultAllocator, 15000, 50000, 2500, 5000, -1, true);
  }
  
  @Deprecated
  public DefaultLoadControl(DefaultAllocator paramDefaultAllocator, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    this(paramDefaultAllocator, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramBoolean, null);
  }
  
  @Deprecated
  public DefaultLoadControl(DefaultAllocator paramDefaultAllocator, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, PriorityTaskManager paramPriorityTaskManager)
  {
    this(paramDefaultAllocator, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramBoolean, paramPriorityTaskManager, 0, false);
  }
  
  public DefaultLoadControl(DefaultAllocator paramDefaultAllocator, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, PriorityTaskManager paramPriorityTaskManager, int paramInt6, boolean paramBoolean2)
  {
    assertGreaterOrEqual(paramInt3, 0, "bufferForPlaybackMs", "0");
    assertGreaterOrEqual(paramInt4, 0, "bufferForPlaybackAfterRebufferMs", "0");
    assertGreaterOrEqual(paramInt1, paramInt3, "minBufferMs", "bufferForPlaybackMs");
    assertGreaterOrEqual(paramInt1, paramInt4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
    assertGreaterOrEqual(paramInt2, paramInt1, "maxBufferMs", "minBufferMs");
    assertGreaterOrEqual(paramInt6, 0, "backBufferDurationMs", "0");
    allocator = paramDefaultAllocator;
    minBufferUs = C.msToUs(paramInt1);
    maxBufferUs = C.msToUs(paramInt2);
    bufferForPlaybackUs = C.msToUs(paramInt3);
    bufferForPlaybackAfterRebufferUs = C.msToUs(paramInt4);
    targetBufferBytesOverwrite = paramInt5;
    prioritizeTimeOverSizeThresholds = paramBoolean1;
    priorityTaskManager = paramPriorityTaskManager;
    backBufferDurationUs = C.msToUs(paramInt6);
    retainBackBufferFromKeyframe = paramBoolean2;
  }
  
  private static void assertGreaterOrEqual(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    boolean bool;
    if (paramInt1 >= paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(" cannot be less than ");
    localStringBuilder.append(paramString2);
    Assertions.checkArgument(bool, localStringBuilder.toString());
  }
  
  private void reset(boolean paramBoolean)
  {
    targetBufferSize = 0;
    PriorityTaskManager localPriorityTaskManager = priorityTaskManager;
    if ((localPriorityTaskManager != null) && (isBuffering)) {
      localPriorityTaskManager.remove(0);
    }
    isBuffering = false;
    if (paramBoolean) {
      allocator.reset();
    }
  }
  
  public int calculateTargetBufferSize(Renderer[] paramArrayOfRenderer, TrackSelectionArray paramTrackSelectionArray)
  {
    int i = 0;
    int k;
    for (int j = 0; i < paramArrayOfRenderer.length; j = k)
    {
      k = j;
      if (paramTrackSelectionArray.get(i) != null) {
        k = Util.getDefaultBufferSize(paramArrayOfRenderer[i].getTrackType()) + j;
      }
      i++;
    }
    return j;
  }
  
  public Allocator getAllocator()
  {
    return allocator;
  }
  
  public long getBackBufferDurationUs()
  {
    return backBufferDurationUs;
  }
  
  public void onPrepared()
  {
    reset(false);
  }
  
  public void onReleased()
  {
    reset(true);
  }
  
  public void onStopped()
  {
    reset(true);
  }
  
  public void onTracksSelected(Renderer[] paramArrayOfRenderer, TrackGroupArray paramTrackGroupArray, TrackSelectionArray paramTrackSelectionArray)
  {
    int i = targetBufferBytesOverwrite;
    int j = i;
    if (i == -1) {
      j = calculateTargetBufferSize(paramArrayOfRenderer, paramTrackSelectionArray);
    }
    targetBufferSize = j;
    allocator.setTargetBufferSize(j);
  }
  
  public boolean retainBackBufferFromKeyframe()
  {
    return retainBackBufferFromKeyframe;
  }
  
  public boolean shouldContinueLoading(long paramLong, float paramFloat)
  {
    int i = allocator.getTotalBytesAllocated();
    int j = targetBufferSize;
    boolean bool1 = true;
    if (i >= j) {
      j = 1;
    } else {
      j = 0;
    }
    boolean bool2 = isBuffering;
    long l1 = minBufferUs;
    long l2 = l1;
    if (paramFloat > 1.0F) {
      l2 = Math.min(Util.getMediaDurationForPlayoutDuration(l1, paramFloat), maxBufferUs);
    }
    boolean bool3;
    if (paramLong < l2)
    {
      bool3 = bool1;
      if (!prioritizeTimeOverSizeThresholds) {
        if (j == 0) {
          bool3 = bool1;
        } else {
          bool3 = false;
        }
      }
      isBuffering = bool3;
    }
    else if ((paramLong > maxBufferUs) || (j != 0))
    {
      isBuffering = false;
    }
    PriorityTaskManager localPriorityTaskManager = priorityTaskManager;
    if (localPriorityTaskManager != null)
    {
      bool3 = isBuffering;
      if (bool3 != bool2) {
        if (bool3) {
          localPriorityTaskManager.add(0);
        } else {
          localPriorityTaskManager.remove(0);
        }
      }
    }
    return isBuffering;
  }
  
  public boolean shouldStartPlayback(long paramLong, float paramFloat, boolean paramBoolean)
  {
    long l = Util.getPlayoutDurationForMediaDuration(paramLong, paramFloat);
    if (paramBoolean) {
      paramLong = bufferForPlaybackAfterRebufferUs;
    } else {
      paramLong = bufferForPlaybackUs;
    }
    if ((paramLong > 0L) && (l < paramLong) && ((prioritizeTimeOverSizeThresholds) || (allocator.getTotalBytesAllocated() < targetBufferSize))) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public static final class Builder
  {
    private DefaultAllocator allocator = null;
    private int backBufferDurationMs = 0;
    private int bufferForPlaybackAfterRebufferMs = 5000;
    private int bufferForPlaybackMs = 2500;
    private int maxBufferMs = 50000;
    private int minBufferMs = 15000;
    private boolean prioritizeTimeOverSizeThresholds = true;
    private PriorityTaskManager priorityTaskManager = null;
    private boolean retainBackBufferFromKeyframe = false;
    private int targetBufferBytes = -1;
    
    public DefaultLoadControl createDefaultLoadControl()
    {
      if (allocator == null) {
        allocator = new DefaultAllocator(true, 65536);
      }
      return new DefaultLoadControl(allocator, minBufferMs, maxBufferMs, bufferForPlaybackMs, bufferForPlaybackAfterRebufferMs, targetBufferBytes, prioritizeTimeOverSizeThresholds, priorityTaskManager, backBufferDurationMs, retainBackBufferFromKeyframe);
    }
    
    public Builder setAllocator(DefaultAllocator paramDefaultAllocator)
    {
      allocator = paramDefaultAllocator;
      return this;
    }
    
    public Builder setBackBuffer(int paramInt, boolean paramBoolean)
    {
      backBufferDurationMs = paramInt;
      retainBackBufferFromKeyframe = paramBoolean;
      return this;
    }
    
    public Builder setBufferDurationsMs(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      minBufferMs = paramInt1;
      maxBufferMs = paramInt2;
      bufferForPlaybackMs = paramInt3;
      bufferForPlaybackAfterRebufferMs = paramInt4;
      return this;
    }
    
    public Builder setPrioritizeTimeOverSizeThresholds(boolean paramBoolean)
    {
      prioritizeTimeOverSizeThresholds = paramBoolean;
      return this;
    }
    
    public Builder setPriorityTaskManager(PriorityTaskManager paramPriorityTaskManager)
    {
      priorityTaskManager = paramPriorityTaskManager;
      return this;
    }
    
    public Builder setTargetBufferBytes(int paramInt)
    {
      targetBufferBytes = paramInt;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.DefaultLoadControl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */