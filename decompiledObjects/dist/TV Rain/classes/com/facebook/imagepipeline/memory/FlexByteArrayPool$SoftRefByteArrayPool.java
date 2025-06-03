package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimmableRegistry;

@VisibleForTesting
class FlexByteArrayPool$SoftRefByteArrayPool
  extends GenericByteArrayPool
{
  public FlexByteArrayPool$SoftRefByteArrayPool(MemoryTrimmableRegistry paramMemoryTrimmableRegistry, PoolParams paramPoolParams, PoolStatsTracker paramPoolStatsTracker)
  {
    super(paramMemoryTrimmableRegistry, paramPoolParams, paramPoolStatsTracker);
  }
  
  public Bucket<byte[]> newBucket(int paramInt)
  {
    return new OOMSoftReferenceBucket(getSizeInBytes(paramInt), mPoolParams.maxNumThreads, 0);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.FlexByteArrayPool.SoftRefByteArrayPool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */