package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.MemoryTrimmableRegistry;

public class PoolConfig$Builder
{
  private PoolParams mBitmapPoolParams;
  private PoolStatsTracker mBitmapPoolStatsTracker;
  private PoolParams mFlexByteArrayPoolParams;
  private MemoryTrimmableRegistry mMemoryTrimmableRegistry;
  private PoolParams mNativeMemoryChunkPoolParams;
  private PoolStatsTracker mNativeMemoryChunkPoolStatsTracker;
  private PoolParams mSmallByteArrayPoolParams;
  private PoolStatsTracker mSmallByteArrayPoolStatsTracker;
  
  public PoolConfig build()
  {
    return new PoolConfig(this, null);
  }
  
  public Builder setBitmapPoolParams(PoolParams paramPoolParams)
  {
    mBitmapPoolParams = ((PoolParams)Preconditions.checkNotNull(paramPoolParams));
    return this;
  }
  
  public Builder setBitmapPoolStatsTracker(PoolStatsTracker paramPoolStatsTracker)
  {
    mBitmapPoolStatsTracker = ((PoolStatsTracker)Preconditions.checkNotNull(paramPoolStatsTracker));
    return this;
  }
  
  public Builder setFlexByteArrayPoolParams(PoolParams paramPoolParams)
  {
    mFlexByteArrayPoolParams = paramPoolParams;
    return this;
  }
  
  public Builder setMemoryTrimmableRegistry(MemoryTrimmableRegistry paramMemoryTrimmableRegistry)
  {
    mMemoryTrimmableRegistry = paramMemoryTrimmableRegistry;
    return this;
  }
  
  public Builder setNativeMemoryChunkPoolParams(PoolParams paramPoolParams)
  {
    mNativeMemoryChunkPoolParams = ((PoolParams)Preconditions.checkNotNull(paramPoolParams));
    return this;
  }
  
  public Builder setNativeMemoryChunkPoolStatsTracker(PoolStatsTracker paramPoolStatsTracker)
  {
    mNativeMemoryChunkPoolStatsTracker = ((PoolStatsTracker)Preconditions.checkNotNull(paramPoolStatsTracker));
    return this;
  }
  
  public Builder setSmallByteArrayPoolParams(PoolParams paramPoolParams)
  {
    mSmallByteArrayPoolParams = ((PoolParams)Preconditions.checkNotNull(paramPoolParams));
    return this;
  }
  
  public Builder setSmallByteArrayPoolStatsTracker(PoolStatsTracker paramPoolStatsTracker)
  {
    mSmallByteArrayPoolStatsTracker = ((PoolStatsTracker)Preconditions.checkNotNull(paramPoolStatsTracker));
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.PoolConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */