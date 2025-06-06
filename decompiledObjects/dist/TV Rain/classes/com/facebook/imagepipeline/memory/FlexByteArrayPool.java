package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import java.util.Map;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class FlexByteArrayPool
{
  @VisibleForTesting
  public final SoftRefByteArrayPool mDelegatePool;
  private final ResourceReleaser<byte[]> mResourceReleaser;
  
  public FlexByteArrayPool(MemoryTrimmableRegistry paramMemoryTrimmableRegistry, PoolParams paramPoolParams)
  {
    boolean bool;
    if (maxNumThreads > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    mDelegatePool = new SoftRefByteArrayPool(paramMemoryTrimmableRegistry, paramPoolParams, NoOpPoolStatsTracker.getInstance());
    mResourceReleaser = new ResourceReleaser()
    {
      public void release(byte[] paramAnonymousArrayOfByte)
      {
        FlexByteArrayPool.this.release(paramAnonymousArrayOfByte);
      }
    };
  }
  
  public CloseableReference<byte[]> get(int paramInt)
  {
    return CloseableReference.of(mDelegatePool.get(paramInt), mResourceReleaser);
  }
  
  public int getMinBufferSize()
  {
    return mDelegatePool.getMinBufferSize();
  }
  
  public Map<String, Integer> getStats()
  {
    return mDelegatePool.getStats();
  }
  
  public void release(byte[] paramArrayOfByte)
  {
    mDelegatePool.release(paramArrayOfByte);
  }
  
  @VisibleForTesting
  public static class SoftRefByteArrayPool
    extends GenericByteArrayPool
  {
    public SoftRefByteArrayPool(MemoryTrimmableRegistry paramMemoryTrimmableRegistry, PoolParams paramPoolParams, PoolStatsTracker paramPoolStatsTracker)
    {
      super(paramPoolParams, paramPoolStatsTracker);
    }
    
    public Bucket<byte[]> newBucket(int paramInt)
    {
      return new OOMSoftReferenceBucket(getSizeInBytes(paramInt), mPoolParams.maxNumThreads, 0);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.FlexByteArrayPool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */