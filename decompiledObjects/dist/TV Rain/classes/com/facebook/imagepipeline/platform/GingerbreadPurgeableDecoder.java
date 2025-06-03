package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.MemoryFile;
import com.facebook.common.internal.Throwables;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import java.io.FileDescriptor;
import java.lang.reflect.Method;

public class GingerbreadPurgeableDecoder
  extends DalvikPurgeableDecoder
{
  private static Method sGetFileDescriptorMethod;
  
  /* Error */
  private static MemoryFile copyToMemoryFile(CloseableReference<PooledByteBuffer> paramCloseableReference, int paramInt, @javax.annotation.Nullable byte[] paramArrayOfByte)
    throws java.io.IOException
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +8 -> 9
    //   4: iconst_0
    //   5: istore_3
    //   6: goto +6 -> 12
    //   9: aload_2
    //   10: arraylength
    //   11: istore_3
    //   12: aconst_null
    //   13: astore 4
    //   15: aconst_null
    //   16: astore 5
    //   18: new 18	android/os/MemoryFile
    //   21: dup
    //   22: aconst_null
    //   23: iload_3
    //   24: iload_1
    //   25: iadd
    //   26: invokespecial 21	android/os/MemoryFile:<init>	(Ljava/lang/String;I)V
    //   29: astore 6
    //   31: aload 6
    //   33: iconst_0
    //   34: invokevirtual 25	android/os/MemoryFile:allowPurging	(Z)Z
    //   37: pop
    //   38: new 27	com/facebook/common/memory/PooledByteBufferInputStream
    //   41: astore 7
    //   43: aload 7
    //   45: aload_0
    //   46: invokevirtual 33	com/facebook/common/references/CloseableReference:get	()Ljava/lang/Object;
    //   49: checkcast 35	com/facebook/common/memory/PooledByteBuffer
    //   52: invokespecial 38	com/facebook/common/memory/PooledByteBufferInputStream:<init>	(Lcom/facebook/common/memory/PooledByteBuffer;)V
    //   55: new 40	com/facebook/common/streams/LimitedInputStream
    //   58: astore 8
    //   60: aload 8
    //   62: aload 7
    //   64: iload_1
    //   65: invokespecial 43	com/facebook/common/streams/LimitedInputStream:<init>	(Ljava/io/InputStream;I)V
    //   68: aload 6
    //   70: invokevirtual 47	android/os/MemoryFile:getOutputStream	()Ljava/io/OutputStream;
    //   73: astore 4
    //   75: aload 4
    //   77: astore 5
    //   79: aload 8
    //   81: aload 4
    //   83: invokestatic 53	com/facebook/common/internal/ByteStreams:copy	(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    //   86: pop2
    //   87: aload_2
    //   88: ifnull +17 -> 105
    //   91: aload 4
    //   93: astore 5
    //   95: aload 6
    //   97: aload_2
    //   98: iconst_0
    //   99: iload_1
    //   100: aload_2
    //   101: arraylength
    //   102: invokevirtual 57	android/os/MemoryFile:writeBytes	([BIII)V
    //   105: aload_0
    //   106: invokestatic 61	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   109: aload 7
    //   111: invokestatic 67	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   114: aload 8
    //   116: invokestatic 67	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   119: aload 4
    //   121: iconst_1
    //   122: invokestatic 71	com/facebook/common/internal/Closeables:close	(Ljava/io/Closeable;Z)V
    //   125: aload 6
    //   127: areturn
    //   128: astore 4
    //   130: aload 5
    //   132: astore_2
    //   133: aload 4
    //   135: astore 5
    //   137: goto +10 -> 147
    //   140: astore 5
    //   142: aconst_null
    //   143: astore_2
    //   144: aload_2
    //   145: astore 8
    //   147: aload 7
    //   149: astore 4
    //   151: goto +10 -> 161
    //   154: astore 5
    //   156: aconst_null
    //   157: astore_2
    //   158: aload_2
    //   159: astore 8
    //   161: aload_0
    //   162: invokestatic 61	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   165: aload 4
    //   167: invokestatic 67	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   170: aload 8
    //   172: invokestatic 67	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   175: aload_2
    //   176: iconst_1
    //   177: invokestatic 71	com/facebook/common/internal/Closeables:close	(Ljava/io/Closeable;Z)V
    //   180: aload 5
    //   182: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	183	0	paramCloseableReference	CloseableReference<PooledByteBuffer>
    //   0	183	1	paramInt	int
    //   0	183	2	paramArrayOfByte	byte[]
    //   5	21	3	i	int
    //   13	107	4	localOutputStream	java.io.OutputStream
    //   128	6	4	localObject1	Object
    //   149	17	4	localObject2	Object
    //   16	120	5	localObject3	Object
    //   140	1	5	localObject4	Object
    //   154	27	5	localObject5	Object
    //   29	97	6	localMemoryFile	MemoryFile
    //   41	107	7	localPooledByteBufferInputStream	com.facebook.common.memory.PooledByteBufferInputStream
    //   58	113	8	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   68	75	128	finally
    //   79	87	128	finally
    //   95	105	128	finally
    //   55	68	140	finally
    //   38	55	154	finally
  }
  
  private Method getFileDescriptorMethod()
  {
    try
    {
      Method localMethod1 = sGetFileDescriptorMethod;
      if (localMethod1 == null) {
        try
        {
          sGetFileDescriptorMethod = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
        }
        catch (Exception localException)
        {
          throw Throwables.propagate(localException);
        }
      }
      Method localMethod2 = sGetFileDescriptorMethod;
      return localMethod2;
    }
    finally {}
  }
  
  private FileDescriptor getMemoryFileDescriptor(MemoryFile paramMemoryFile)
  {
    try
    {
      paramMemoryFile = (FileDescriptor)getFileDescriptorMethod().invoke(paramMemoryFile, new Object[0]);
      return paramMemoryFile;
    }
    catch (Exception paramMemoryFile)
    {
      throw Throwables.propagate(paramMemoryFile);
    }
  }
  
  public Bitmap decodeByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> paramCloseableReference, BitmapFactory.Options paramOptions)
  {
    return decodeFileDescriptorAsPurgeable(paramCloseableReference, ((PooledByteBuffer)paramCloseableReference.get()).size(), null, paramOptions);
  }
  
  /* Error */
  public Bitmap decodeFileDescriptorAsPurgeable(CloseableReference<PooledByteBuffer> paramCloseableReference, int paramInt, byte[] paramArrayOfByte, BitmapFactory.Options paramOptions)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aconst_null
    //   4: astore 6
    //   6: aload_1
    //   7: iload_2
    //   8: aload_3
    //   9: invokestatic 122	com/facebook/imagepipeline/platform/GingerbreadPurgeableDecoder:copyToMemoryFile	(Lcom/facebook/common/references/CloseableReference;I[B)Landroid/os/MemoryFile;
    //   12: astore_1
    //   13: aload_0
    //   14: aload_1
    //   15: invokespecial 124	com/facebook/imagepipeline/platform/GingerbreadPurgeableDecoder:getMemoryFileDescriptor	(Landroid/os/MemoryFile;)Ljava/io/FileDescriptor;
    //   18: astore_3
    //   19: getstatic 130	com/facebook/common/webp/WebpSupportStatus:sWebpBitmapFactory	Lcom/facebook/common/webp/WebpBitmapFactory;
    //   22: aload_3
    //   23: aconst_null
    //   24: aload 4
    //   26: invokeinterface 136 4 0
    //   31: ldc -118
    //   33: invokestatic 144	com/facebook/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast 146	android/graphics/Bitmap
    //   39: astore_3
    //   40: aload_1
    //   41: ifnull +7 -> 48
    //   44: aload_1
    //   45: invokevirtual 148	android/os/MemoryFile:close	()V
    //   48: aload_3
    //   49: areturn
    //   50: astore_3
    //   51: aload_1
    //   52: astore 6
    //   54: aload_3
    //   55: astore_1
    //   56: goto +26 -> 82
    //   59: astore_3
    //   60: aload_1
    //   61: astore 6
    //   63: aload_3
    //   64: astore_1
    //   65: goto +12 -> 77
    //   68: astore_1
    //   69: goto +13 -> 82
    //   72: astore_1
    //   73: aload 5
    //   75: astore 6
    //   77: aload_1
    //   78: invokestatic 95	com/facebook/common/internal/Throwables:propagate	(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    //   81: athrow
    //   82: aload 6
    //   84: ifnull +8 -> 92
    //   87: aload 6
    //   89: invokevirtual 148	android/os/MemoryFile:close	()V
    //   92: aload_1
    //   93: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	this	GingerbreadPurgeableDecoder
    //   0	94	1	paramCloseableReference	CloseableReference<PooledByteBuffer>
    //   0	94	2	paramInt	int
    //   0	94	3	paramArrayOfByte	byte[]
    //   0	94	4	paramOptions	BitmapFactory.Options
    //   1	73	5	localObject1	Object
    //   4	84	6	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   13	40	50	finally
    //   13	40	59	java/io/IOException
    //   6	13	68	finally
    //   77	82	68	finally
    //   6	13	72	java/io/IOException
  }
  
  public Bitmap decodeJPEGByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> paramCloseableReference, int paramInt, BitmapFactory.Options paramOptions)
  {
    byte[] arrayOfByte;
    if (DalvikPurgeableDecoder.endsWithEOI(paramCloseableReference, paramInt)) {
      arrayOfByte = null;
    } else {
      arrayOfByte = DalvikPurgeableDecoder.EOI;
    }
    return decodeFileDescriptorAsPurgeable(paramCloseableReference, paramInt, arrayOfByte, paramOptions);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */