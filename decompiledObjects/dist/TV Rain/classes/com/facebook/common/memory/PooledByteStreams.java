package com.facebook.common.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class PooledByteStreams
{
  private static final int DEFAULT_TEMP_BUF_SIZE = 16384;
  private final ByteArrayPool mByteArrayPool;
  private final int mTempBufSize;
  
  public PooledByteStreams(ByteArrayPool paramByteArrayPool)
  {
    this(paramByteArrayPool, 16384);
  }
  
  @VisibleForTesting
  public PooledByteStreams(ByteArrayPool paramByteArrayPool, int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    mTempBufSize = paramInt;
    mByteArrayPool = paramByteArrayPool;
  }
  
  /* Error */
  public long copy(InputStream paramInputStream, OutputStream paramOutputStream)
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 30	com/facebook/common/memory/PooledByteStreams:mByteArrayPool	Lcom/facebook/common/memory/ByteArrayPool;
    //   4: aload_0
    //   5: getfield 28	com/facebook/common/memory/PooledByteStreams:mTempBufSize	I
    //   8: invokeinterface 41 2 0
    //   13: checkcast 43	[B
    //   16: astore_3
    //   17: lconst_0
    //   18: lstore 4
    //   20: aload_1
    //   21: aload_3
    //   22: iconst_0
    //   23: aload_0
    //   24: getfield 28	com/facebook/common/memory/PooledByteStreams:mTempBufSize	I
    //   27: invokevirtual 49	java/io/InputStream:read	([BII)I
    //   30: istore 6
    //   32: iload 6
    //   34: iconst_m1
    //   35: if_icmpne +16 -> 51
    //   38: aload_0
    //   39: getfield 30	com/facebook/common/memory/PooledByteStreams:mByteArrayPool	Lcom/facebook/common/memory/ByteArrayPool;
    //   42: aload_3
    //   43: invokeinterface 53 2 0
    //   48: lload 4
    //   50: lreturn
    //   51: aload_2
    //   52: aload_3
    //   53: iconst_0
    //   54: iload 6
    //   56: invokevirtual 59	java/io/OutputStream:write	([BII)V
    //   59: lload 4
    //   61: iload 6
    //   63: i2l
    //   64: ladd
    //   65: lstore 4
    //   67: goto -47 -> 20
    //   70: astore_1
    //   71: aload_0
    //   72: getfield 30	com/facebook/common/memory/PooledByteStreams:mByteArrayPool	Lcom/facebook/common/memory/ByteArrayPool;
    //   75: aload_3
    //   76: invokeinterface 53 2 0
    //   81: aload_1
    //   82: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	83	0	this	PooledByteStreams
    //   0	83	1	paramInputStream	InputStream
    //   0	83	2	paramOutputStream	OutputStream
    //   16	60	3	arrayOfByte	byte[]
    //   18	48	4	l	long
    //   30	32	6	i	int
    // Exception table:
    //   from	to	target	type
    //   20	32	70	finally
    //   51	59	70	finally
  }
  
  public long copy(InputStream paramInputStream, OutputStream paramOutputStream, long paramLong)
    throws IOException
  {
    long l = 0L;
    boolean bool;
    if (paramLong > 0L) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkState(bool);
    byte[] arrayOfByte = (byte[])mByteArrayPool.get(mTempBufSize);
    for (;;)
    {
      if (l < paramLong) {}
      try
      {
        int i = paramInputStream.read(arrayOfByte, 0, (int)Math.min(mTempBufSize, paramLong - l));
        if (i == -1) {
          return l;
        }
        paramOutputStream.write(arrayOfByte, 0, i);
        l += i;
      }
      finally
      {
        mByteArrayPool.release(arrayOfByte);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.memory.PooledByteStreams
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */