package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class NativeMemoryChunkPool
  extends BasePool<NativeMemoryChunk>
{
  private final int[] mBucketSizes;
  
  public NativeMemoryChunkPool(MemoryTrimmableRegistry paramMemoryTrimmableRegistry, PoolParams paramPoolParams, PoolStatsTracker paramPoolStatsTracker)
  {
    super(paramMemoryTrimmableRegistry, paramPoolParams, paramPoolStatsTracker);
    paramPoolParams = bucketSizes;
    mBucketSizes = new int[paramPoolParams.size()];
    for (int i = 0;; i++)
    {
      paramMemoryTrimmableRegistry = mBucketSizes;
      if (i >= paramMemoryTrimmableRegistry.length) {
        break;
      }
      paramMemoryTrimmableRegistry[i] = paramPoolParams.keyAt(i);
    }
    initialize();
  }
  
  public NativeMemoryChunk alloc(int paramInt)
  {
    return new NativeMemoryChunk(paramInt);
  }
  
  public void free(NativeMemoryChunk paramNativeMemoryChunk)
  {
    Preconditions.checkNotNull(paramNativeMemoryChunk);
    paramNativeMemoryChunk.close();
  }
  
  public int getBucketedSize(int paramInt)
  {
    if (paramInt > 0)
    {
      for (int k : mBucketSizes) {
        if (k >= paramInt) {
          return k;
        }
      }
      return paramInt;
    }
    throw new BasePool.InvalidSizeException(Integer.valueOf(paramInt));
  }
  
  public int getBucketedSizeForValue(NativeMemoryChunk paramNativeMemoryChunk)
  {
    Preconditions.checkNotNull(paramNativeMemoryChunk);
    return paramNativeMemoryChunk.getSize();
  }
  
  public int getMinBufferSize()
  {
    return mBucketSizes[0];
  }
  
  public int getSizeInBytes(int paramInt)
  {
    return paramInt;
  }
  
  public boolean isReusable(NativeMemoryChunk paramNativeMemoryChunk)
  {
    Preconditions.checkNotNull(paramNativeMemoryChunk);
    return paramNativeMemoryChunk.isClosed() ^ true;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.NativeMemoryChunkPool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */