package com.facebook.imagepipeline.memory;

import android.util.Log;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.nativecode.ImagePipelineNativeLoader;
import java.io.Closeable;
import z2;

@DoNotStrip
public class NativeMemoryChunk
  implements Closeable
{
  private static final String TAG = "NativeMemoryChunk";
  private boolean mClosed;
  private final long mNativePtr;
  private final int mSize;
  
  static {}
  
  @VisibleForTesting
  public NativeMemoryChunk()
  {
    mSize = 0;
    mNativePtr = 0L;
    mClosed = true;
  }
  
  public NativeMemoryChunk(int paramInt)
  {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    mSize = paramInt;
    mNativePtr = nativeAllocate(paramInt);
    mClosed = false;
  }
  
  private int adjustByteCount(int paramInt1, int paramInt2)
  {
    return Math.min(Math.max(0, mSize - paramInt1), paramInt2);
  }
  
  private void checkBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt4 >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt1 >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt3 >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt1 + paramInt4 <= mSize) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt3 + paramInt4 <= paramInt2) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
  }
  
  private void doCopy(int paramInt1, NativeMemoryChunk paramNativeMemoryChunk, int paramInt2, int paramInt3)
  {
    Preconditions.checkState(isClosed() ^ true);
    Preconditions.checkState(paramNativeMemoryChunk.isClosed() ^ true);
    checkBounds(paramInt1, mSize, paramInt2, paramInt3);
    nativeMemcpy(mNativePtr + paramInt2, mNativePtr + paramInt1, paramInt3);
  }
  
  @DoNotStrip
  private static native long nativeAllocate(int paramInt);
  
  @DoNotStrip
  private static native void nativeCopyFromByteArray(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  @DoNotStrip
  private static native void nativeCopyToByteArray(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  @DoNotStrip
  private static native void nativeFree(long paramLong);
  
  @DoNotStrip
  private static native void nativeMemcpy(long paramLong1, long paramLong2, int paramInt);
  
  @DoNotStrip
  private static native byte nativeReadByte(long paramLong);
  
  public void close()
  {
    try
    {
      if (!mClosed)
      {
        mClosed = true;
        nativeFree(mNativePtr);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public void copy(int paramInt1, NativeMemoryChunk paramNativeMemoryChunk, int paramInt2, int paramInt3)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 89	com/facebook/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_2
    //   6: getfield 33	com/facebook/imagepipeline/memory/NativeMemoryChunk:mNativePtr	J
    //   9: aload_0
    //   10: getfield 33	com/facebook/imagepipeline/memory/NativeMemoryChunk:mNativePtr	J
    //   13: lcmp
    //   14: ifne +80 -> 94
    //   17: ldc 91
    //   19: invokestatic 97	z2:t	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   22: astore 5
    //   24: aload 5
    //   26: aload_0
    //   27: invokestatic 103	java/lang/System:identityHashCode	(Ljava/lang/Object;)I
    //   30: invokestatic 109	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   33: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: pop
    //   37: aload 5
    //   39: ldc 116
    //   41: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: aload 5
    //   47: aload_2
    //   48: invokestatic 103	java/lang/System:identityHashCode	(Ljava/lang/Object;)I
    //   51: invokestatic 109	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   54: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: pop
    //   58: aload 5
    //   60: ldc 118
    //   62: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: aload 5
    //   68: aload_0
    //   69: getfield 33	com/facebook/imagepipeline/memory/NativeMemoryChunk:mNativePtr	J
    //   72: invokestatic 123	java/lang/Long:toHexString	(J)Ljava/lang/String;
    //   75: invokevirtual 114	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   78: pop
    //   79: ldc 11
    //   81: aload 5
    //   83: invokevirtual 127	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   86: invokestatic 133	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   89: pop
    //   90: iconst_0
    //   91: invokestatic 43	com/facebook/common/internal/Preconditions:checkArgument	(Z)V
    //   94: aload_2
    //   95: getfield 33	com/facebook/imagepipeline/memory/NativeMemoryChunk:mNativePtr	J
    //   98: aload_0
    //   99: getfield 33	com/facebook/imagepipeline/memory/NativeMemoryChunk:mNativePtr	J
    //   102: lcmp
    //   103: ifge +35 -> 138
    //   106: aload_2
    //   107: monitorenter
    //   108: aload_0
    //   109: monitorenter
    //   110: aload_0
    //   111: iload_1
    //   112: aload_2
    //   113: iload_3
    //   114: iload 4
    //   116: invokespecial 135	com/facebook/imagepipeline/memory/NativeMemoryChunk:doCopy	(ILcom/facebook/imagepipeline/memory/NativeMemoryChunk;II)V
    //   119: aload_0
    //   120: monitorexit
    //   121: aload_2
    //   122: monitorexit
    //   123: return
    //   124: astore 5
    //   126: aload_0
    //   127: monitorexit
    //   128: aload 5
    //   130: athrow
    //   131: astore 5
    //   133: aload_2
    //   134: monitorexit
    //   135: aload 5
    //   137: athrow
    //   138: aload_0
    //   139: monitorenter
    //   140: aload_2
    //   141: monitorenter
    //   142: aload_0
    //   143: iload_1
    //   144: aload_2
    //   145: iload_3
    //   146: iload 4
    //   148: invokespecial 135	com/facebook/imagepipeline/memory/NativeMemoryChunk:doCopy	(ILcom/facebook/imagepipeline/memory/NativeMemoryChunk;II)V
    //   151: aload_2
    //   152: monitorexit
    //   153: aload_0
    //   154: monitorexit
    //   155: return
    //   156: astore 5
    //   158: aload_2
    //   159: monitorexit
    //   160: aload 5
    //   162: athrow
    //   163: astore_2
    //   164: aload_0
    //   165: monitorexit
    //   166: aload_2
    //   167: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	168	0	this	NativeMemoryChunk
    //   0	168	1	paramInt1	int
    //   0	168	2	paramNativeMemoryChunk	NativeMemoryChunk
    //   0	168	3	paramInt2	int
    //   0	168	4	paramInt3	int
    //   22	60	5	localStringBuilder	StringBuilder
    //   124	5	5	localObject1	Object
    //   131	5	5	localObject2	Object
    //   156	5	5	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   110	121	124	finally
    //   126	128	124	finally
    //   108	110	131	finally
    //   121	123	131	finally
    //   128	131	131	finally
    //   133	135	131	finally
    //   142	153	156	finally
    //   158	160	156	finally
    //   140	142	163	finally
    //   153	155	163	finally
    //   160	163	163	finally
    //   164	166	163	finally
  }
  
  public void finalize()
    throws Throwable
  {
    if (isClosed()) {
      return;
    }
    StringBuilder localStringBuilder = z2.t("finalize: Chunk ");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" still active. Underlying address = ");
    localStringBuilder.append(Long.toHexString(mNativePtr));
    Log.w("NativeMemoryChunk", localStringBuilder.toString());
    try
    {
      close();
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public long getNativePtr()
  {
    return mNativePtr;
  }
  
  public int getSize()
  {
    return mSize;
  }
  
  public boolean isClosed()
  {
    try
    {
      boolean bool = mClosed;
      return bool;
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
      boolean bool1 = isClosed();
      boolean bool2 = true;
      if (!bool1) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkState(bool1);
      if (paramInt >= 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Preconditions.checkArgument(bool1);
      if (paramInt < mSize) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      Preconditions.checkArgument(bool1);
      byte b = nativeReadByte(mNativePtr + paramInt);
      return b;
    }
    finally {}
  }
  
  public int read(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    try
    {
      Preconditions.checkNotNull(paramArrayOfByte);
      boolean bool;
      if (!isClosed()) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      paramInt3 = adjustByteCount(paramInt1, paramInt3);
      checkBounds(paramInt1, paramArrayOfByte.length, paramInt2, paramInt3);
      nativeCopyToByteArray(mNativePtr + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
      return paramInt3;
    }
    finally {}
  }
  
  public int write(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    try
    {
      Preconditions.checkNotNull(paramArrayOfByte);
      boolean bool;
      if (!isClosed()) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      paramInt3 = adjustByteCount(paramInt1, paramInt3);
      checkBounds(paramInt1, paramArrayOfByte.length, paramInt2, paramInt3);
      nativeCopyFromByteArray(mNativePtr + paramInt1, paramArrayOfByte, paramInt2, paramInt3);
      return paramInt3;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.NativeMemoryChunk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */