package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import java.io.OutputStream;
import javax.annotation.concurrent.NotThreadSafe;
import z2;

@NotThreadSafe
public class NativePooledByteBufferOutputStream
  extends PooledByteBufferOutputStream
{
  private CloseableReference<NativeMemoryChunk> mBufRef;
  private int mCount;
  private final NativeMemoryChunkPool mPool;
  
  public NativePooledByteBufferOutputStream(NativeMemoryChunkPool paramNativeMemoryChunkPool)
  {
    this(paramNativeMemoryChunkPool, paramNativeMemoryChunkPool.getMinBufferSize());
  }
  
  public NativePooledByteBufferOutputStream(NativeMemoryChunkPool paramNativeMemoryChunkPool, int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    paramNativeMemoryChunkPool = (NativeMemoryChunkPool)Preconditions.checkNotNull(paramNativeMemoryChunkPool);
    mPool = paramNativeMemoryChunkPool;
    mCount = 0;
    mBufRef = CloseableReference.of(paramNativeMemoryChunkPool.get(paramInt), paramNativeMemoryChunkPool);
  }
  
  private void ensureValid()
  {
    if (CloseableReference.isValid(mBufRef)) {
      return;
    }
    throw new InvalidStreamException();
  }
  
  public void close()
  {
    CloseableReference.closeSafely(mBufRef);
    mBufRef = null;
    mCount = -1;
    super.close();
  }
  
  @VisibleForTesting
  public void realloc(int paramInt)
  {
    ensureValid();
    if (paramInt <= ((NativeMemoryChunk)mBufRef.get()).getSize()) {
      return;
    }
    NativeMemoryChunk localNativeMemoryChunk = (NativeMemoryChunk)mPool.get(paramInt);
    ((NativeMemoryChunk)mBufRef.get()).copy(0, localNativeMemoryChunk, 0, mCount);
    mBufRef.close();
    mBufRef = CloseableReference.of(localNativeMemoryChunk, mPool);
  }
  
  public int size()
  {
    return mCount;
  }
  
  public NativePooledByteBuffer toByteBuffer()
  {
    ensureValid();
    return new NativePooledByteBuffer(mBufRef, mCount);
  }
  
  public void write(int paramInt)
    throws IOException
  {
    write(new byte[] { (byte)paramInt });
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    if ((paramInt1 >= 0) && (paramInt2 >= 0) && (paramInt1 + paramInt2 <= paramArrayOfByte.length))
    {
      ensureValid();
      realloc(mCount + paramInt2);
      ((NativeMemoryChunk)mBufRef.get()).write(mCount, paramArrayOfByte, paramInt1, paramInt2);
      mCount += paramInt2;
      return;
    }
    StringBuilder localStringBuilder = z2.t("length=");
    localStringBuilder.append(paramArrayOfByte.length);
    localStringBuilder.append("; regionStart=");
    localStringBuilder.append(paramInt1);
    localStringBuilder.append("; regionLength=");
    localStringBuilder.append(paramInt2);
    throw new ArrayIndexOutOfBoundsException(localStringBuilder.toString());
  }
  
  public static class InvalidStreamException
    extends RuntimeException
  {
    public InvalidStreamException()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.NativePooledByteBufferOutputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */