package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import androidx.core.util.Pools.SynchronizedPool;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.streams.LimitedInputStream;
import com.facebook.common.streams.TailAppendingInputStream;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.BitmapPool;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(21)
@ThreadSafe
public class ArtDecoder
  implements PlatformDecoder
{
  private static final int DECODE_BUFFER_SIZE = 16384;
  private static final byte[] EOI_TAIL = { -1, -39 };
  private static final Class<?> TAG = ArtDecoder.class;
  private final BitmapPool mBitmapPool;
  @VisibleForTesting
  public final Pools.SynchronizedPool<ByteBuffer> mDecodeBuffers;
  
  public ArtDecoder(BitmapPool paramBitmapPool, int paramInt, Pools.SynchronizedPool paramSynchronizedPool)
  {
    mBitmapPool = paramBitmapPool;
    mDecodeBuffers = paramSynchronizedPool;
    for (int i = 0; i < paramInt; i++) {
      mDecodeBuffers.release(ByteBuffer.allocate(16384));
    }
  }
  
  private static BitmapFactory.Options getDecodeOptionsForStream(EncodedImage paramEncodedImage, Bitmap.Config paramConfig)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    inSampleSize = paramEncodedImage.getSampleSize();
    inJustDecodeBounds = true;
    BitmapFactory.decodeStream(paramEncodedImage.getInputStream(), null, localOptions);
    if ((outWidth != -1) && (outHeight != -1))
    {
      inJustDecodeBounds = false;
      inDither = true;
      inPreferredConfig = paramConfig;
      inMutable = true;
      return localOptions;
    }
    throw new IllegalArgumentException();
  }
  
  public CloseableReference<Bitmap> decodeFromEncodedImage(EncodedImage paramEncodedImage, Bitmap.Config paramConfig, @Nullable Rect paramRect)
  {
    paramConfig = getDecodeOptionsForStream(paramEncodedImage, paramConfig);
    int i;
    if (inPreferredConfig != Bitmap.Config.ARGB_8888) {
      i = 1;
    } else {
      i = 0;
    }
    try
    {
      paramConfig = decodeStaticImageFromStream(paramEncodedImage.getInputStream(), paramConfig, paramRect);
      return paramConfig;
    }
    catch (RuntimeException paramConfig)
    {
      if (i != 0) {
        return decodeFromEncodedImage(paramEncodedImage, Bitmap.Config.ARGB_8888, paramRect);
      }
      throw paramConfig;
    }
  }
  
  public CloseableReference<Bitmap> decodeJPEGFromEncodedImage(EncodedImage paramEncodedImage, Bitmap.Config paramConfig, @Nullable Rect paramRect, int paramInt)
  {
    boolean bool = paramEncodedImage.isCompleteAt(paramInt);
    BitmapFactory.Options localOptions = getDecodeOptionsForStream(paramEncodedImage, paramConfig);
    Object localObject = paramEncodedImage.getInputStream();
    Preconditions.checkNotNull(localObject);
    paramConfig = (Bitmap.Config)localObject;
    if (paramEncodedImage.getSize() > paramInt) {
      paramConfig = new LimitedInputStream((InputStream)localObject, paramInt);
    }
    localObject = paramConfig;
    if (!bool) {
      localObject = new TailAppendingInputStream(paramConfig, EOI_TAIL);
    }
    if (inPreferredConfig != Bitmap.Config.ARGB_8888) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    try
    {
      paramConfig = decodeStaticImageFromStream((InputStream)localObject, localOptions, paramRect);
      return paramConfig;
    }
    catch (RuntimeException paramConfig)
    {
      if (paramInt != 0) {
        return decodeFromEncodedImage(paramEncodedImage, Bitmap.Config.ARGB_8888, paramRect);
      }
      throw paramConfig;
    }
  }
  
  /* Error */
  public CloseableReference<Bitmap> decodeStaticImageFromStream(InputStream paramInputStream, BitmapFactory.Options paramOptions, @Nullable Rect paramRect)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 133	com/facebook/common/internal/Preconditions:checkNotNull	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_2
    //   6: getfield 84	android/graphics/BitmapFactory$Options:outWidth	I
    //   9: istore 4
    //   11: aload_2
    //   12: getfield 87	android/graphics/BitmapFactory$Options:outHeight	I
    //   15: istore 5
    //   17: aload_3
    //   18: ifnull +15 -> 33
    //   21: aload_3
    //   22: invokevirtual 154	android/graphics/Rect:width	()I
    //   25: istore 4
    //   27: aload_3
    //   28: invokevirtual 157	android/graphics/Rect:height	()I
    //   31: istore 5
    //   33: iload 4
    //   35: iload 5
    //   37: aload_2
    //   38: getfield 94	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   41: invokestatic 163	com/facebook/imageutils/BitmapUtil:getSizeInByteForBitmap	(IILandroid/graphics/Bitmap$Config;)I
    //   44: istore 6
    //   46: aload_0
    //   47: getfield 39	com/facebook/imagepipeline/platform/ArtDecoder:mBitmapPool	Lcom/facebook/imagepipeline/memory/BitmapPool;
    //   50: iload 6
    //   52: invokevirtual 169	com/facebook/imagepipeline/memory/BasePool:get	(I)Ljava/lang/Object;
    //   55: checkcast 171	android/graphics/Bitmap
    //   58: astore 7
    //   60: aload 7
    //   62: ifnull +295 -> 357
    //   65: aload_2
    //   66: aload 7
    //   68: putfield 175	android/graphics/BitmapFactory$Options:inBitmap	Landroid/graphics/Bitmap;
    //   71: aload_0
    //   72: getfield 41	com/facebook/imagepipeline/platform/ArtDecoder:mDecodeBuffers	Landroidx/core/util/Pools$SynchronizedPool;
    //   75: invokevirtual 179	androidx/core/util/Pools$SynchronizedPool:acquire	()Ljava/lang/Object;
    //   78: checkcast 43	java/nio/ByteBuffer
    //   81: astore 8
    //   83: aload 8
    //   85: astore 9
    //   87: aload 8
    //   89: ifnonnull +11 -> 100
    //   92: sipush 16384
    //   95: invokestatic 47	java/nio/ByteBuffer:allocate	(I)Ljava/nio/ByteBuffer;
    //   98: astore 9
    //   100: aload_2
    //   101: aload 9
    //   103: invokevirtual 183	java/nio/ByteBuffer:array	()[B
    //   106: putfield 186	android/graphics/BitmapFactory$Options:inTempStorage	[B
    //   109: aconst_null
    //   110: astore 8
    //   112: aload_3
    //   113: ifnull +102 -> 215
    //   116: aload 7
    //   118: iload 4
    //   120: iload 5
    //   122: aload_2
    //   123: getfield 94	android/graphics/BitmapFactory$Options:inPreferredConfig	Landroid/graphics/Bitmap$Config;
    //   126: invokevirtual 190	android/graphics/Bitmap:reconfigure	(IILandroid/graphics/Bitmap$Config;)V
    //   129: aload_1
    //   130: iconst_1
    //   131: invokestatic 196	android/graphics/BitmapRegionDecoder:newInstance	(Ljava/io/InputStream;Z)Landroid/graphics/BitmapRegionDecoder;
    //   134: astore 10
    //   136: aload 10
    //   138: astore 8
    //   140: aload 10
    //   142: aload_3
    //   143: aload_2
    //   144: invokevirtual 200	android/graphics/BitmapRegionDecoder:decodeRegion	(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   147: astore 11
    //   149: aload 10
    //   151: invokevirtual 203	android/graphics/BitmapRegionDecoder:recycle	()V
    //   154: aload 11
    //   156: astore_3
    //   157: goto +60 -> 217
    //   160: astore_2
    //   161: goto +42 -> 203
    //   164: astore 8
    //   166: aconst_null
    //   167: astore 10
    //   169: aload 10
    //   171: astore 8
    //   173: getstatic 28	com/facebook/imagepipeline/platform/ArtDecoder:TAG	Ljava/lang/Class;
    //   176: ldc -51
    //   178: iconst_1
    //   179: anewarray 4	java/lang/Object
    //   182: dup
    //   183: iconst_0
    //   184: aload_3
    //   185: aastore
    //   186: invokestatic 211	com/facebook/common/logging/FLog:e	(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    //   189: aload 10
    //   191: ifnull +24 -> 215
    //   194: aload 10
    //   196: invokevirtual 203	android/graphics/BitmapRegionDecoder:recycle	()V
    //   199: goto +16 -> 215
    //   202: astore_2
    //   203: aload 8
    //   205: ifnull +8 -> 213
    //   208: aload 8
    //   210: invokevirtual 203	android/graphics/BitmapRegionDecoder:recycle	()V
    //   213: aload_2
    //   214: athrow
    //   215: aconst_null
    //   216: astore_3
    //   217: aload_3
    //   218: astore 8
    //   220: aload_3
    //   221: ifnonnull +11 -> 232
    //   224: aload_1
    //   225: aconst_null
    //   226: aload_2
    //   227: invokestatic 81	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    //   230: astore 8
    //   232: aload_0
    //   233: getfield 41	com/facebook/imagepipeline/platform/ArtDecoder:mDecodeBuffers	Landroidx/core/util/Pools$SynchronizedPool;
    //   236: aload 9
    //   238: invokevirtual 53	androidx/core/util/Pools$SynchronizedPool:release	(Ljava/lang/Object;)Z
    //   241: pop
    //   242: aload 7
    //   244: aload 8
    //   246: if_acmpne +13 -> 259
    //   249: aload 8
    //   251: aload_0
    //   252: getfield 39	com/facebook/imagepipeline/platform/ArtDecoder:mBitmapPool	Lcom/facebook/imagepipeline/memory/BitmapPool;
    //   255: invokestatic 217	com/facebook/common/references/CloseableReference:of	(Ljava/lang/Object;Lcom/facebook/common/references/ResourceReleaser;)Lcom/facebook/common/references/CloseableReference;
    //   258: areturn
    //   259: aload_0
    //   260: getfield 39	com/facebook/imagepipeline/platform/ArtDecoder:mBitmapPool	Lcom/facebook/imagepipeline/memory/BitmapPool;
    //   263: aload 7
    //   265: invokevirtual 220	com/facebook/imagepipeline/memory/BasePool:release	(Ljava/lang/Object;)V
    //   268: aload 8
    //   270: invokevirtual 221	android/graphics/Bitmap:recycle	()V
    //   273: new 223	java/lang/IllegalStateException
    //   276: dup
    //   277: invokespecial 224	java/lang/IllegalStateException:<init>	()V
    //   280: athrow
    //   281: astore_1
    //   282: goto +63 -> 345
    //   285: astore_1
    //   286: aload_0
    //   287: getfield 39	com/facebook/imagepipeline/platform/ArtDecoder:mBitmapPool	Lcom/facebook/imagepipeline/memory/BitmapPool;
    //   290: aload 7
    //   292: invokevirtual 220	com/facebook/imagepipeline/memory/BasePool:release	(Ljava/lang/Object;)V
    //   295: aload_1
    //   296: athrow
    //   297: astore_2
    //   298: aload_0
    //   299: getfield 39	com/facebook/imagepipeline/platform/ArtDecoder:mBitmapPool	Lcom/facebook/imagepipeline/memory/BitmapPool;
    //   302: aload 7
    //   304: invokevirtual 220	com/facebook/imagepipeline/memory/BasePool:release	(Ljava/lang/Object;)V
    //   307: aload_1
    //   308: invokevirtual 229	java/io/InputStream:reset	()V
    //   311: aload_1
    //   312: invokestatic 232	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   315: astore_1
    //   316: aload_1
    //   317: ifnull +23 -> 340
    //   320: aload_1
    //   321: invokestatic 238	com/facebook/imagepipeline/bitmaps/SimpleBitmapReleaser:getInstance	()Lcom/facebook/imagepipeline/bitmaps/SimpleBitmapReleaser;
    //   324: invokestatic 217	com/facebook/common/references/CloseableReference:of	(Ljava/lang/Object;Lcom/facebook/common/references/ResourceReleaser;)Lcom/facebook/common/references/CloseableReference;
    //   327: astore_1
    //   328: aload_0
    //   329: getfield 41	com/facebook/imagepipeline/platform/ArtDecoder:mDecodeBuffers	Landroidx/core/util/Pools$SynchronizedPool;
    //   332: aload 9
    //   334: invokevirtual 53	androidx/core/util/Pools$SynchronizedPool:release	(Ljava/lang/Object;)Z
    //   337: pop
    //   338: aload_1
    //   339: areturn
    //   340: aload_2
    //   341: athrow
    //   342: astore_1
    //   343: aload_2
    //   344: athrow
    //   345: aload_0
    //   346: getfield 41	com/facebook/imagepipeline/platform/ArtDecoder:mDecodeBuffers	Landroidx/core/util/Pools$SynchronizedPool;
    //   349: aload 9
    //   351: invokevirtual 53	androidx/core/util/Pools$SynchronizedPool:release	(Ljava/lang/Object;)Z
    //   354: pop
    //   355: aload_1
    //   356: athrow
    //   357: new 240	java/lang/NullPointerException
    //   360: dup
    //   361: ldc -14
    //   363: invokespecial 245	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   366: athrow
    //   367: astore 8
    //   369: goto -200 -> 169
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	372	0	this	ArtDecoder
    //   0	372	1	paramInputStream	InputStream
    //   0	372	2	paramOptions	BitmapFactory.Options
    //   0	372	3	paramRect	Rect
    //   9	110	4	i	int
    //   15	106	5	j	int
    //   44	7	6	k	int
    //   58	245	7	localBitmap1	Bitmap
    //   81	58	8	localObject1	Object
    //   164	1	8	localIOException1	java.io.IOException
    //   171	98	8	localObject2	Object
    //   367	1	8	localIOException2	java.io.IOException
    //   85	265	9	localObject3	Object
    //   134	61	10	localBitmapRegionDecoder	android.graphics.BitmapRegionDecoder
    //   147	8	11	localBitmap2	Bitmap
    // Exception table:
    //   from	to	target	type
    //   116	136	160	finally
    //   116	136	164	java/io/IOException
    //   140	149	202	finally
    //   173	189	202	finally
    //   100	109	281	finally
    //   149	154	281	finally
    //   194	199	281	finally
    //   208	213	281	finally
    //   213	215	281	finally
    //   224	232	281	finally
    //   286	297	281	finally
    //   298	307	281	finally
    //   307	316	281	finally
    //   320	328	281	finally
    //   340	342	281	finally
    //   343	345	281	finally
    //   100	109	285	java/lang/RuntimeException
    //   149	154	285	java/lang/RuntimeException
    //   194	199	285	java/lang/RuntimeException
    //   208	213	285	java/lang/RuntimeException
    //   213	215	285	java/lang/RuntimeException
    //   224	232	285	java/lang/RuntimeException
    //   100	109	297	java/lang/IllegalArgumentException
    //   149	154	297	java/lang/IllegalArgumentException
    //   194	199	297	java/lang/IllegalArgumentException
    //   208	213	297	java/lang/IllegalArgumentException
    //   213	215	297	java/lang/IllegalArgumentException
    //   224	232	297	java/lang/IllegalArgumentException
    //   307	316	342	java/io/IOException
    //   320	328	342	java/io/IOException
    //   340	342	342	java/io/IOException
    //   140	149	367	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.platform.ArtDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */