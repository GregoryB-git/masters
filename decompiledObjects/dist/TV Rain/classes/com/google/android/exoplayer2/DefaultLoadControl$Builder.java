package com.google.android.exoplayer2;

import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.util.PriorityTaskManager;

public final class DefaultLoadControl$Builder
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.DefaultLoadControl.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */