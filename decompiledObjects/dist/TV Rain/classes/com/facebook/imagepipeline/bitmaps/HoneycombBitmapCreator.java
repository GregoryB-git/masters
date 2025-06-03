package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import com.facebook.common.webp.BitmapCreator;
import com.facebook.imagepipeline.memory.FlexByteArrayPool;
import com.facebook.imagepipeline.memory.PoolFactory;

public class HoneycombBitmapCreator
  implements BitmapCreator
{
  private final FlexByteArrayPool mFlexByteArrayPool;
  private final EmptyJpegGenerator mJpegGenerator;
  
  public HoneycombBitmapCreator(PoolFactory paramPoolFactory)
  {
    mFlexByteArrayPool = paramPoolFactory.getFlexByteArrayPool();
    mJpegGenerator = new EmptyJpegGenerator(paramPoolFactory.getPooledByteBufferFactory());
  }
  
  private static BitmapFactory.Options getBitmapFactoryOptions(int paramInt, Bitmap.Config paramConfig)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    inDither = true;
    inPreferredConfig = paramConfig;
    inPurgeable = true;
    inInputShareable = true;
    inSampleSize = paramInt;
    inMutable = true;
    return localOptions;
  }
  
  /* Error */
  @android.annotation.TargetApi(12)
  public android.graphics.Bitmap createNakedBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/facebook/imagepipeline/bitmaps/HoneycombBitmapCreator:mJpegGenerator	Lcom/facebook/imagepipeline/bitmaps/EmptyJpegGenerator;
    //   4: iload_1
    //   5: i2s
    //   6: iload_2
    //   7: i2s
    //   8: invokevirtual 70	com/facebook/imagepipeline/bitmaps/EmptyJpegGenerator:generate	(SS)Lcom/facebook/common/references/CloseableReference;
    //   11: astore 4
    //   13: aconst_null
    //   14: astore 5
    //   16: aconst_null
    //   17: astore 6
    //   19: new 72	com/facebook/imagepipeline/image/EncodedImage
    //   22: astore 7
    //   24: aload 7
    //   26: aload 4
    //   28: invokespecial 75	com/facebook/imagepipeline/image/EncodedImage:<init>	(Lcom/facebook/common/references/CloseableReference;)V
    //   31: aload 6
    //   33: astore 5
    //   35: aload 7
    //   37: getstatic 81	com/facebook/imageformat/DefaultImageFormats:JPEG	Lcom/facebook/imageformat/ImageFormat;
    //   40: invokevirtual 85	com/facebook/imagepipeline/image/EncodedImage:setImageFormat	(Lcom/facebook/imageformat/ImageFormat;)V
    //   43: aload 6
    //   45: astore 5
    //   47: aload 7
    //   49: invokevirtual 89	com/facebook/imagepipeline/image/EncodedImage:getSampleSize	()I
    //   52: aload_3
    //   53: invokestatic 91	com/facebook/imagepipeline/bitmaps/HoneycombBitmapCreator:getBitmapFactoryOptions	(ILandroid/graphics/Bitmap$Config;)Landroid/graphics/BitmapFactory$Options;
    //   56: astore 8
    //   58: aload 6
    //   60: astore 5
    //   62: aload 4
    //   64: invokevirtual 97	com/facebook/common/references/CloseableReference:get	()Ljava/lang/Object;
    //   67: checkcast 99	com/facebook/common/memory/PooledByteBuffer
    //   70: invokeinterface 102 1 0
    //   75: istore_1
    //   76: aload 6
    //   78: astore 5
    //   80: aload 4
    //   82: invokevirtual 97	com/facebook/common/references/CloseableReference:get	()Ljava/lang/Object;
    //   85: checkcast 99	com/facebook/common/memory/PooledByteBuffer
    //   88: astore 9
    //   90: aload 6
    //   92: astore 5
    //   94: aload_0
    //   95: getfield 23	com/facebook/imagepipeline/bitmaps/HoneycombBitmapCreator:mFlexByteArrayPool	Lcom/facebook/imagepipeline/memory/FlexByteArrayPool;
    //   98: iload_1
    //   99: iconst_2
    //   100: iadd
    //   101: invokevirtual 107	com/facebook/imagepipeline/memory/FlexByteArrayPool:get	(I)Lcom/facebook/common/references/CloseableReference;
    //   104: astore_3
    //   105: aload_3
    //   106: astore 5
    //   108: aload_3
    //   109: invokevirtual 97	com/facebook/common/references/CloseableReference:get	()Ljava/lang/Object;
    //   112: checkcast 109	[B
    //   115: astore 6
    //   117: aload_3
    //   118: astore 5
    //   120: aload 9
    //   122: iconst_0
    //   123: aload 6
    //   125: iconst_0
    //   126: iload_1
    //   127: invokeinterface 113 5 0
    //   132: aload_3
    //   133: astore 5
    //   135: aload 6
    //   137: iconst_0
    //   138: iload_1
    //   139: aload 8
    //   141: invokestatic 119	android/graphics/BitmapFactory:decodeByteArray	([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   144: astore 6
    //   146: aload_3
    //   147: astore 5
    //   149: aload 6
    //   151: iconst_1
    //   152: invokevirtual 125	android/graphics/Bitmap:setHasAlpha	(Z)V
    //   155: aload_3
    //   156: astore 5
    //   158: aload 6
    //   160: iconst_0
    //   161: invokevirtual 129	android/graphics/Bitmap:eraseColor	(I)V
    //   164: aload_3
    //   165: invokestatic 132	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   168: aload 7
    //   170: invokestatic 135	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
    //   173: aload 4
    //   175: invokestatic 132	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   178: aload 6
    //   180: areturn
    //   181: astore 6
    //   183: aload 7
    //   185: astore_3
    //   186: goto +7 -> 193
    //   189: astore 6
    //   191: aconst_null
    //   192: astore_3
    //   193: aload 5
    //   195: invokestatic 132	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   198: aload_3
    //   199: invokestatic 135	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
    //   202: aload 4
    //   204: invokestatic 132	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   207: aload 6
    //   209: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	210	0	this	HoneycombBitmapCreator
    //   0	210	1	paramInt1	int
    //   0	210	2	paramInt2	int
    //   0	210	3	paramConfig	Bitmap.Config
    //   11	192	4	localCloseableReference	com.facebook.common.references.CloseableReference
    //   14	180	5	localObject1	Object
    //   17	162	6	localObject2	Object
    //   181	1	6	localObject3	Object
    //   189	19	6	localObject4	Object
    //   22	162	7	localEncodedImage	com.facebook.imagepipeline.image.EncodedImage
    //   56	84	8	localOptions	BitmapFactory.Options
    //   88	33	9	localPooledByteBuffer	com.facebook.common.memory.PooledByteBuffer
    // Exception table:
    //   from	to	target	type
    //   35	43	181	finally
    //   47	58	181	finally
    //   62	76	181	finally
    //   80	90	181	finally
    //   94	105	181	finally
    //   108	117	181	finally
    //   120	132	181	finally
    //   135	146	181	finally
    //   149	155	181	finally
    //   158	164	181	finally
    //   19	31	189	finally
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.bitmaps.HoneycombBitmapCreator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */