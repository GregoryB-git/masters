package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBuffer.ClosedException;
import com.facebook.common.references.CloseableReference;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class NativePooledByteBuffer
  implements PooledByteBuffer
{
  @VisibleForTesting
  @GuardedBy("this")
  public CloseableReference<NativeMemoryChunk> mBufRef;
  private final int mSize;
  
  public NativePooledByteBuffer(CloseableReference<NativeMemoryChunk> paramCloseableReference, int paramInt)
  {
    Preconditions.checkNotNull(paramCloseableReference);
    boolean bool;
    if ((paramInt >= 0) && (paramInt <= ((NativeMemoryChunk)paramCloseableReference.get()).getSize())) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    mBufRef = paramCloseableReference.clone();
    mSize = paramInt;
  }
  
  public void close()
  {
    try
    {
      CloseableReference.closeSafely(mBufRef);
      mBufRef = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void ensureValid()
  {
    try
    {
      boolean bool = isClosed();
      if (!bool) {
        return;
      }
      PooledByteBuffer.ClosedException localClosedException = new com/facebook/common/memory/PooledByteBuffer$ClosedException;
      localClosedException.<init>();
      throw localClosedException;
    }
    finally {}
  }
  
  public long getNativePtr()
  {
    try
    {
      ensureValid();
      long l = ((NativeMemoryChunk)mBufRef.get()).getNativePtr();
      return l;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isClosed()
  {
    try
    {
      boolean bool = CloseableReference.isValid(mBufRef);
      return bool ^ true;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public byte read(int paramInt)
  {
    try
    {
      ensureValid();
      boolean bool1 = true;
      boolean bool2;
      if (paramInt >= 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      Preconditions.checkArgument(bool2);
      if (paramInt < mSize) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      Preconditions.checkArgument(bool2);
      byte b = ((NativeMemoryChunk)mBufRef.get()).read(paramInt);
      return b;
    }
    finally {}
  }
  
  public void read(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    try
    {
      ensureValid();
      boolean bool;
      if (paramInt1 + paramInt3 <= mSize) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool);
      ((NativeMemoryChunk)mBufRef.get()).read(paramInt1, paramArrayOfByte, paramInt2, paramInt3);
      return;
    }
    finally {}
  }
  
  public int size()
  {
    try
    {
      ensureValid();
      int i = mSize;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.NativePooledByteBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */