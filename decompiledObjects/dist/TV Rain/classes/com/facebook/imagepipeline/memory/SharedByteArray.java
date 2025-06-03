package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.OOMSoftReference;
import com.facebook.common.references.ResourceReleaser;
import java.util.concurrent.Semaphore;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class SharedByteArray
  implements MemoryTrimmable
{
  @VisibleForTesting
  public final OOMSoftReference<byte[]> mByteArraySoftRef;
  @VisibleForTesting
  public final int mMaxByteArraySize;
  @VisibleForTesting
  public final int mMinByteArraySize;
  private final ResourceReleaser<byte[]> mResourceReleaser;
  @VisibleForTesting
  public final Semaphore mSemaphore;
  
  public SharedByteArray(MemoryTrimmableRegistry paramMemoryTrimmableRegistry, PoolParams paramPoolParams)
  {
    Preconditions.checkNotNull(paramMemoryTrimmableRegistry);
    int i = minBucketSize;
    boolean bool1 = false;
    if (i > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    boolean bool2 = bool1;
    if (maxBucketSize >= minBucketSize) {
      bool2 = true;
    }
    Preconditions.checkArgument(bool2);
    mMaxByteArraySize = maxBucketSize;
    mMinByteArraySize = minBucketSize;
    mByteArraySoftRef = new OOMSoftReference();
    mSemaphore = new Semaphore(1);
    mResourceReleaser = new ResourceReleaser()
    {
      public void release(byte[] paramAnonymousArrayOfByte)
      {
        mSemaphore.release();
      }
    };
    paramMemoryTrimmableRegistry.registerMemoryTrimmable(this);
  }
  
  private byte[] allocateByteArray(int paramInt)
  {
    try
    {
      mByteArraySoftRef.clear();
      byte[] arrayOfByte = new byte[paramInt];
      mByteArraySoftRef.set(arrayOfByte);
      return arrayOfByte;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private byte[] getByteArray(int paramInt)
  {
    paramInt = getBucketedSize(paramInt);
    byte[] arrayOfByte1 = (byte[])mByteArraySoftRef.get();
    byte[] arrayOfByte2;
    if (arrayOfByte1 != null)
    {
      arrayOfByte2 = arrayOfByte1;
      if (arrayOfByte1.length >= paramInt) {}
    }
    else
    {
      arrayOfByte2 = allocateByteArray(paramInt);
    }
    return arrayOfByte2;
  }
  
  public CloseableReference<byte[]> get(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2, "Size must be greater than zero");
    if (paramInt <= mMaxByteArraySize) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2, "Requested size is too big");
    mSemaphore.acquireUninterruptibly();
    try
    {
      CloseableReference localCloseableReference = CloseableReference.of(getByteArray(paramInt), mResourceReleaser);
      return localCloseableReference;
    }
    finally
    {
      mSemaphore.release();
    }
  }
  
  @VisibleForTesting
  public int getBucketedSize(int paramInt)
  {
    return Integer.highestOneBit(Math.max(paramInt, mMinByteArraySize) - 1) * 2;
  }
  
  public void trim(MemoryTrimType paramMemoryTrimType)
  {
    if (!mSemaphore.tryAcquire()) {
      return;
    }
    try
    {
      mByteArraySoftRef.clear();
      return;
    }
    finally
    {
      mSemaphore.release();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.SharedByteArray
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */