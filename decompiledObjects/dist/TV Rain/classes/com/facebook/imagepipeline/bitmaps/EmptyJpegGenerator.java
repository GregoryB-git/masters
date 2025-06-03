package com.facebook.imagepipeline.bitmaps;

import com.facebook.common.memory.PooledByteBufferFactory;

public class EmptyJpegGenerator
{
  private static final byte[] EMPTY_JPEG_PREFIX = { -1, -40, -1, -37, 0, 67, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -64, 0, 17, 8 };
  private static final byte[] EMPTY_JPEG_SUFFIX = { 3, 1, 34, 0, 2, 17, 0, 3, 17, 0, -1, -60, 0, 31, 0, 0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 16, 0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125, 1, 2, 3, 0, 4, 17, 5, 18, 33, 49, 65, 6, 19, 81, 97, 7, 34, 113, 20, 50, -127, -111, -95, 8, 35, 66, -79, -63, 21, 82, -47, -16, 36, 51, 98, 114, -126, 9, 10, 22, 23, 24, 25, 26, 37, 38, 39, 40, 41, 42, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -60, 0, 31, 1, 0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, -60, 0, -75, 17, 0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119, 0, 1, 2, 3, 17, 4, 5, 33, 49, 6, 18, 65, 81, 7, 97, 113, 19, 34, 50, -127, 8, 20, 66, -111, -95, -79, -63, 9, 35, 51, 82, -16, 21, 98, 114, -47, 10, 22, 36, 52, -31, 37, -15, 23, 24, 25, 26, 38, 39, 40, 41, 42, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -126, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, -62, -61, -60, -59, -58, -57, -56, -55, -54, -46, -45, -44, -43, -42, -41, -40, -39, -38, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, -38, 0, 12, 3, 1, 0, 2, 17, 3, 17, 0, 63, 0, -114, -118, 40, -96, 15, -1, -39 };
  private final PooledByteBufferFactory mPooledByteBufferFactory;
  
  public EmptyJpegGenerator(PooledByteBufferFactory paramPooledByteBufferFactory)
  {
    mPooledByteBufferFactory = paramPooledByteBufferFactory;
  }
  
  /* Error */
  public com.facebook.common.references.CloseableReference<com.facebook.common.memory.PooledByteBuffer> generate(short paramShort1, short paramShort2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload 4
    //   7: astore 5
    //   9: aload_3
    //   10: astore 6
    //   12: aload_0
    //   13: getfield 196	com/facebook/imagepipeline/bitmaps/EmptyJpegGenerator:mPooledByteBufferFactory	Lcom/facebook/common/memory/PooledByteBufferFactory;
    //   16: astore 7
    //   18: aload 4
    //   20: astore 5
    //   22: aload_3
    //   23: astore 6
    //   25: getstatic 21	com/facebook/imagepipeline/bitmaps/EmptyJpegGenerator:EMPTY_JPEG_PREFIX	[B
    //   28: astore 8
    //   30: aload 4
    //   32: astore 5
    //   34: aload_3
    //   35: astore 6
    //   37: aload 8
    //   39: arraylength
    //   40: istore 9
    //   42: aload 4
    //   44: astore 5
    //   46: aload_3
    //   47: astore 6
    //   49: getstatic 189	com/facebook/imagepipeline/bitmaps/EmptyJpegGenerator:EMPTY_JPEG_SUFFIX	[B
    //   52: astore 10
    //   54: aload 4
    //   56: astore 5
    //   58: aload_3
    //   59: astore 6
    //   61: aload 7
    //   63: iload 9
    //   65: aload 10
    //   67: arraylength
    //   68: iadd
    //   69: iconst_4
    //   70: iadd
    //   71: invokeinterface 206 2 0
    //   76: astore 4
    //   78: aload 4
    //   80: astore 5
    //   82: aload 4
    //   84: astore 6
    //   86: aload 4
    //   88: aload 8
    //   90: invokevirtual 212	java/io/OutputStream:write	([B)V
    //   93: aload 4
    //   95: astore 5
    //   97: aload 4
    //   99: astore 6
    //   101: aload 4
    //   103: iload_2
    //   104: bipush 8
    //   106: ishr
    //   107: i2b
    //   108: invokevirtual 215	java/io/OutputStream:write	(I)V
    //   111: aload 4
    //   113: astore 5
    //   115: aload 4
    //   117: astore 6
    //   119: aload 4
    //   121: iload_2
    //   122: sipush 255
    //   125: iand
    //   126: i2b
    //   127: invokevirtual 215	java/io/OutputStream:write	(I)V
    //   130: aload 4
    //   132: astore 5
    //   134: aload 4
    //   136: astore 6
    //   138: aload 4
    //   140: iload_1
    //   141: bipush 8
    //   143: ishr
    //   144: i2b
    //   145: invokevirtual 215	java/io/OutputStream:write	(I)V
    //   148: aload 4
    //   150: astore 5
    //   152: aload 4
    //   154: astore 6
    //   156: aload 4
    //   158: iload_1
    //   159: sipush 255
    //   162: iand
    //   163: i2b
    //   164: invokevirtual 215	java/io/OutputStream:write	(I)V
    //   167: aload 4
    //   169: astore 5
    //   171: aload 4
    //   173: astore 6
    //   175: aload 4
    //   177: aload 10
    //   179: invokevirtual 212	java/io/OutputStream:write	([B)V
    //   182: aload 4
    //   184: astore 5
    //   186: aload 4
    //   188: astore 6
    //   190: aload 4
    //   192: invokevirtual 221	com/facebook/common/memory/PooledByteBufferOutputStream:toByteBuffer	()Lcom/facebook/common/memory/PooledByteBuffer;
    //   195: invokestatic 227	com/facebook/common/references/CloseableReference:of	(Ljava/io/Closeable;)Lcom/facebook/common/references/CloseableReference;
    //   198: astore_3
    //   199: aload 4
    //   201: invokevirtual 230	com/facebook/common/memory/PooledByteBufferOutputStream:close	()V
    //   204: aload_3
    //   205: areturn
    //   206: astore 6
    //   208: goto +29 -> 237
    //   211: astore 4
    //   213: aload 6
    //   215: astore 5
    //   217: new 232	java/lang/RuntimeException
    //   220: astore_3
    //   221: aload 6
    //   223: astore 5
    //   225: aload_3
    //   226: aload 4
    //   228: invokespecial 235	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   231: aload 6
    //   233: astore 5
    //   235: aload_3
    //   236: athrow
    //   237: aload 5
    //   239: ifnull +8 -> 247
    //   242: aload 5
    //   244: invokevirtual 230	com/facebook/common/memory/PooledByteBufferOutputStream:close	()V
    //   247: aload 6
    //   249: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	250	0	this	EmptyJpegGenerator
    //   0	250	1	paramShort1	short
    //   0	250	2	paramShort2	short
    //   1	235	3	localObject1	Object
    //   3	197	4	localPooledByteBufferOutputStream	com.facebook.common.memory.PooledByteBufferOutputStream
    //   211	16	4	localIOException	java.io.IOException
    //   7	236	5	localObject2	Object
    //   10	179	6	localObject3	Object
    //   206	42	6	localObject4	Object
    //   16	46	7	localPooledByteBufferFactory	PooledByteBufferFactory
    //   28	61	8	arrayOfByte1	byte[]
    //   40	29	9	i	int
    //   52	126	10	arrayOfByte2	byte[]
    // Exception table:
    //   from	to	target	type
    //   12	18	206	finally
    //   25	30	206	finally
    //   37	42	206	finally
    //   49	54	206	finally
    //   61	78	206	finally
    //   86	93	206	finally
    //   101	111	206	finally
    //   119	130	206	finally
    //   138	148	206	finally
    //   156	167	206	finally
    //   175	182	206	finally
    //   190	199	206	finally
    //   217	221	206	finally
    //   225	231	206	finally
    //   235	237	206	finally
    //   12	18	211	java/io/IOException
    //   25	30	211	java/io/IOException
    //   37	42	211	java/io/IOException
    //   49	54	211	java/io/IOException
    //   61	78	211	java/io/IOException
    //   86	93	211	java/io/IOException
    //   101	111	211	java/io/IOException
    //   119	130	211	java/io/IOException
    //   138	148	211	java/io/IOException
    //   156	167	211	java/io/IOException
    //   175	182	211	java/io/IOException
    //   190	199	211	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.bitmaps.EmptyJpegGenerator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */