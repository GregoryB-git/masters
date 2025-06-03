package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.NoOpMemoryTrimmableRegistry;
import javax.annotation.concurrent.Immutable;

@Immutable
public class PoolConfig
{
  private final PoolParams mBitmapPoolParams;
  private final PoolStatsTracker mBitmapPoolStatsTracker;
  private final PoolParams mFlexByteArrayPoolParams;
  private final MemoryTrimmableRegistry mMemoryTrimmableRegistry;
  private final PoolParams mNativeMemoryChunkPoolParams;
  private final PoolStatsTracker mNativeMemoryChunkPoolStatsTracker;
  private final PoolParams mSmallByteArrayPoolParams;
  private final PoolStatsTracker mSmallByteArrayPoolStatsTracker;
  
  private PoolConfig(Builder paramBuilder)
  {
    Object localObject;
    if (Builder.access$000(paramBuilder) == null) {
      localObject = DefaultBitmapPoolParams.get();
    } else {
      localObject = Builder.access$000(paramBuilder);
    }
    mBitmapPoolParams = ((PoolParams)localObject);
    if (Builder.access$100(paramBuilder) == null) {
      localObject = NoOpPoolStatsTracker.getInstance();
    } else {
      localObject = Builder.access$100(paramBuilder);
    }
    mBitmapPoolStatsTracker = ((PoolStatsTracker)localObject);
    if (Builder.access$200(paramBuilder) == null) {
      localObject = DefaultFlexByteArrayPoolParams.get();
    } else {
      localObject = Builder.access$200(paramBuilder);
    }
    mFlexByteArrayPoolParams = ((PoolParams)localObject);
    if (Builder.access$300(paramBuilder) == null) {
      localObject = NoOpMemoryTrimmableRegistry.getInstance();
    } else {
      localObject = Builder.access$300(paramBuilder);
    }
    mMemoryTrimmableRegistry = ((MemoryTrimmableRegistry)localObject);
    if (Builder.access$400(paramBuilder) == null) {
      localObject = DefaultNativeMemoryChunkPoolParams.get();
    } else {
      localObject = Builder.access$400(paramBuilder);
    }
    mNativeMemoryChunkPoolParams = ((PoolParams)localObject);
    if (Builder.access$500(paramBuilder) == null) {
      localObject = NoOpPoolStatsTracker.getInstance();
    } else {
      localObject = Builder.access$500(paramBuilder);
    }
    mNativeMemoryChunkPoolStatsTracker = ((PoolStatsTracker)localObject);
    if (Builder.access$600(paramBuilder) == null) {
      localObject = DefaultByteArrayPoolParams.get();
    } else {
      localObject = Builder.access$600(paramBuilder);
    }
    mSmallByteArrayPoolParams = ((PoolParams)localObject);
    if (Builder.access$700(paramBuilder) == null) {
      paramBuilder = NoOpPoolStatsTracker.getInstance();
    } else {
      paramBuilder = Builder.access$700(paramBuilder);
    }
    mSmallByteArrayPoolStatsTracker = paramBuilder;
  }
  
  public static Builder newBuilder()
  {
    return new Builder(null);
  }
  
  public PoolParams getBitmapPoolParams()
  {
    return mBitmapPoolParams;
  }
  
  public PoolStatsTracker getBitmapPoolStatsTracker()
  {
    return mBitmapPoolStatsTracker;
  }
  
  public PoolParams getFlexByteArrayPoolParams()
  {
    return mFlexByteArrayPoolParams;
  }
  
  public MemoryTrimmableRegistry getMemoryTrimmableRegistry()
  {
    return mMemoryTrimmableRegistry;
  }
  
  public PoolParams getNativeMemoryChunkPoolParams()
  {
    return mNativeMemoryChunkPoolParams;
  }
  
  public PoolStatsTracker getNativeMemoryChunkPoolStatsTracker()
  {
    return mNativeMemoryChunkPoolStatsTracker;
  }
  
  public PoolParams getSmallByteArrayPoolParams()
  {
    return mSmallByteArrayPoolParams;
  }
  
  public PoolStatsTracker getSmallByteArrayPoolStatsTracker()
  {
    return mSmallByteArrayPoolStatsTracker;
  }
  
  public static class Builder
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
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.PoolConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */