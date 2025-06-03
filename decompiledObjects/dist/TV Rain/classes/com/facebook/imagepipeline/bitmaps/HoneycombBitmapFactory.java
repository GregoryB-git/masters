package com.facebook.imagepipeline.bitmaps;

import android.annotation.TargetApi;
import com.facebook.imagepipeline.platform.PlatformDecoder;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(11)
@ThreadSafe
public class HoneycombBitmapFactory
  extends PlatformBitmapFactory
{
  private final EmptyJpegGenerator mJpegGenerator;
  private final PlatformDecoder mPurgeableDecoder;
  
  public HoneycombBitmapFactory(EmptyJpegGenerator paramEmptyJpegGenerator, PlatformDecoder paramPlatformDecoder)
  {
    mJpegGenerator = paramEmptyJpegGenerator;
    mPurgeableDecoder = paramPlatformDecoder;
  }
  
  /* Error */
  @TargetApi(12)
  public com.facebook.common.references.CloseableReference<android.graphics.Bitmap> createBitmapInternal(int paramInt1, int paramInt2, android.graphics.Bitmap.Config paramConfig)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	com/facebook/imagepipeline/bitmaps/HoneycombBitmapFactory:mJpegGenerator	Lcom/facebook/imagepipeline/bitmaps/EmptyJpegGenerator;
    //   4: iload_1
    //   5: i2s
    //   6: iload_2
    //   7: i2s
    //   8: invokevirtual 31	com/facebook/imagepipeline/bitmaps/EmptyJpegGenerator:generate	(SS)Lcom/facebook/common/references/CloseableReference;
    //   11: astore 4
    //   13: new 33	com/facebook/imagepipeline/image/EncodedImage
    //   16: astore 5
    //   18: aload 5
    //   20: aload 4
    //   22: invokespecial 36	com/facebook/imagepipeline/image/EncodedImage:<init>	(Lcom/facebook/common/references/CloseableReference;)V
    //   25: aload 5
    //   27: getstatic 42	com/facebook/imageformat/DefaultImageFormats:JPEG	Lcom/facebook/imageformat/ImageFormat;
    //   30: invokevirtual 46	com/facebook/imagepipeline/image/EncodedImage:setImageFormat	(Lcom/facebook/imageformat/ImageFormat;)V
    //   33: aload_0
    //   34: getfield 21	com/facebook/imagepipeline/bitmaps/HoneycombBitmapFactory:mPurgeableDecoder	Lcom/facebook/imagepipeline/platform/PlatformDecoder;
    //   37: aload 5
    //   39: aload_3
    //   40: aconst_null
    //   41: aload 4
    //   43: invokevirtual 52	com/facebook/common/references/CloseableReference:get	()Ljava/lang/Object;
    //   46: checkcast 54	com/facebook/common/memory/PooledByteBuffer
    //   49: invokeinterface 58 1 0
    //   54: invokeinterface 64 5 0
    //   59: astore_3
    //   60: aload_3
    //   61: invokevirtual 52	com/facebook/common/references/CloseableReference:get	()Ljava/lang/Object;
    //   64: checkcast 66	android/graphics/Bitmap
    //   67: iconst_1
    //   68: invokevirtual 70	android/graphics/Bitmap:setHasAlpha	(Z)V
    //   71: aload_3
    //   72: invokevirtual 52	com/facebook/common/references/CloseableReference:get	()Ljava/lang/Object;
    //   75: checkcast 66	android/graphics/Bitmap
    //   78: iconst_0
    //   79: invokevirtual 74	android/graphics/Bitmap:eraseColor	(I)V
    //   82: aload 5
    //   84: invokestatic 78	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
    //   87: aload 4
    //   89: invokevirtual 81	com/facebook/common/references/CloseableReference:close	()V
    //   92: aload_3
    //   93: areturn
    //   94: astore_3
    //   95: aload 5
    //   97: invokestatic 78	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
    //   100: aload_3
    //   101: athrow
    //   102: astore_3
    //   103: aload 4
    //   105: invokevirtual 81	com/facebook/common/references/CloseableReference:close	()V
    //   108: aload_3
    //   109: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	this	HoneycombBitmapFactory
    //   0	110	1	paramInt1	int
    //   0	110	2	paramInt2	int
    //   0	110	3	paramConfig	android.graphics.Bitmap.Config
    //   11	93	4	localCloseableReference	com.facebook.common.references.CloseableReference
    //   16	80	5	localEncodedImage	com.facebook.imagepipeline.image.EncodedImage
    // Exception table:
    //   from	to	target	type
    //   33	82	94	finally
    //   13	33	102	finally
    //   82	87	102	finally
    //   95	102	102	finally
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.bitmaps.HoneycombBitmapFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */