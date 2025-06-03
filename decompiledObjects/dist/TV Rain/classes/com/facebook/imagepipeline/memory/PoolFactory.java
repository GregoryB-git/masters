package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteStreams;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class PoolFactory
{
  private BitmapPool mBitmapPool;
  private final PoolConfig mConfig;
  private FlexByteArrayPool mFlexByteArrayPool;
  private NativeMemoryChunkPool mNativeMemoryChunkPool;
  private PooledByteBufferFactory mPooledByteBufferFactory;
  private PooledByteStreams mPooledByteStreams;
  private SharedByteArray mSharedByteArray;
  private ByteArrayPool mSmallByteArrayPool;
  
  public PoolFactory(PoolConfig paramPoolConfig)
  {
    mConfig = ((PoolConfig)Preconditions.checkNotNull(paramPoolConfig));
  }
  
  public BitmapPool getBitmapPool()
  {
    if (mBitmapPool == null) {
      mBitmapPool = new BitmapPool(mConfig.getMemoryTrimmableRegistry(), mConfig.getBitmapPoolParams(), mConfig.getBitmapPoolStatsTracker());
    }
    return mBitmapPool;
  }
  
  public FlexByteArrayPool getFlexByteArrayPool()
  {
    if (mFlexByteArrayPool == null) {
      mFlexByteArrayPool = new FlexByteArrayPool(mConfig.getMemoryTrimmableRegistry(), mConfig.getFlexByteArrayPoolParams());
    }
    return mFlexByteArrayPool;
  }
  
  public int getFlexByteArrayPoolMaxNumThreads()
  {
    return mConfig.getFlexByteArrayPoolParams().maxNumThreads;
  }
  
  public NativeMemoryChunkPool getNativeMemoryChunkPool()
  {
    if (mNativeMemoryChunkPool == null) {
      mNativeMemoryChunkPool = new NativeMemoryChunkPool(mConfig.getMemoryTrimmableRegistry(), mConfig.getNativeMemoryChunkPoolParams(), mConfig.getNativeMemoryChunkPoolStatsTracker());
    }
    return mNativeMemoryChunkPool;
  }
  
  public PooledByteBufferFactory getPooledByteBufferFactory()
  {
    if (mPooledByteBufferFactory == null) {
      mPooledByteBufferFactory = new NativePooledByteBufferFactory(getNativeMemoryChunkPool(), getPooledByteStreams());
    }
    return mPooledByteBufferFactory;
  }
  
  public PooledByteStreams getPooledByteStreams()
  {
    if (mPooledByteStreams == null) {
      mPooledByteStreams = new PooledByteStreams(getSmallByteArrayPool());
    }
    return mPooledByteStreams;
  }
  
  public SharedByteArray getSharedByteArray()
  {
    if (mSharedByteArray == null) {
      mSharedByteArray = new SharedByteArray(mConfig.getMemoryTrimmableRegistry(), mConfig.getFlexByteArrayPoolParams());
    }
    return mSharedByteArray;
  }
  
  public ByteArrayPool getSmallByteArrayPool()
  {
    if (mSmallByteArrayPool == null) {
      mSmallByteArrayPool = new GenericByteArrayPool(mConfig.getMemoryTrimmableRegistry(), mConfig.getSmallByteArrayPoolParams(), mConfig.getSmallByteArrayPoolStatsTracker());
    }
    return mSmallByteArrayPool;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.PoolFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */