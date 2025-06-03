package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class GenericByteArrayPool
  extends BasePool<byte[]>
  implements ByteArrayPool
{
  private final int[] mBucketSizes;
  
  public GenericByteArrayPool(MemoryTrimmableRegistry paramMemoryTrimmableRegistry, PoolParams paramPoolParams, PoolStatsTracker paramPoolStatsTracker)
  {
    super(paramMemoryTrimmableRegistry, paramPoolParams, paramPoolStatsTracker);
    paramMemoryTrimmableRegistry = bucketSizes;
    mBucketSizes = new int[paramMemoryTrimmableRegistry.size()];
    for (int i = 0; i < paramMemoryTrimmableRegistry.size(); i++) {
      mBucketSizes[i] = paramMemoryTrimmableRegistry.keyAt(i);
    }
    initialize();
  }
  
  public byte[] alloc(int paramInt)
  {
    return new byte[paramInt];
  }
  
  public void free(byte[] paramArrayOfByte)
  {
    Preconditions.checkNotNull(paramArrayOfByte);
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
  
  public int getBucketedSizeForValue(byte[] paramArrayOfByte)
  {
    Preconditions.checkNotNull(paramArrayOfByte);
    return paramArrayOfByte.length;
  }
  
  public int getMinBufferSize()
  {
    return mBucketSizes[0];
  }
  
  public int getSizeInBytes(int paramInt)
  {
    return paramInt;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.GenericByteArrayPool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */