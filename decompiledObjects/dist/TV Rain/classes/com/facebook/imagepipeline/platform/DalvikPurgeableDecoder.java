package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.memory.BitmapCounter;
import com.facebook.imagepipeline.memory.BitmapCounterProvider;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import com.facebook.imageutils.BitmapUtil;
import java.util.Locale;
import javax.annotation.Nullable;

abstract class DalvikPurgeableDecoder
  implements PlatformDecoder
{
  public static final byte[] EOI = { -1, -39 };
  private final BitmapCounter mUnpooledBitmapsCounter = BitmapCounterProvider.get();
  
  public static boolean endsWithEOI(CloseableReference<PooledByteBuffer> paramCloseableReference, int paramInt)
  {
    paramCloseableReference = (PooledByteBuffer)paramCloseableReference.get();
    boolean bool = true;
    if ((paramInt < 2) || (paramCloseableReference.read(paramInt - 2) != -1) || (paramCloseableReference.read(paramInt - 1) != -39)) {
      bool = false;
    }
    return bool;
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
  
  public abstract Bitmap decodeByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> paramCloseableReference, BitmapFactory.Options paramOptions);
  
  public CloseableReference<Bitmap> decodeFromEncodedImage(EncodedImage paramEncodedImage, Bitmap.Config paramConfig, @Nullable Rect paramRect)
  {
    paramConfig = getBitmapFactoryOptions(paramEncodedImage.getSampleSize(), paramConfig);
    paramEncodedImage = paramEncodedImage.getByteBufferRef();
    Preconditions.checkNotNull(paramEncodedImage);
    try
    {
      paramConfig = pinBitmap(decodeByteArrayAsPurgeable(paramEncodedImage, paramConfig));
      return paramConfig;
    }
    finally
    {
      CloseableReference.closeSafely(paramEncodedImage);
    }
  }
  
  public abstract Bitmap decodeJPEGByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> paramCloseableReference, int paramInt, BitmapFactory.Options paramOptions);
  
  public CloseableReference<Bitmap> decodeJPEGFromEncodedImage(EncodedImage paramEncodedImage, Bitmap.Config paramConfig, @Nullable Rect paramRect, int paramInt)
  {
    paramConfig = getBitmapFactoryOptions(paramEncodedImage.getSampleSize(), paramConfig);
    paramEncodedImage = paramEncodedImage.getByteBufferRef();
    Preconditions.checkNotNull(paramEncodedImage);
    try
    {
      paramConfig = pinBitmap(decodeJPEGByteArrayAsPurgeable(paramEncodedImage, paramInt, paramConfig));
      return paramConfig;
    }
    finally
    {
      CloseableReference.closeSafely(paramEncodedImage);
    }
  }
  
  public CloseableReference<Bitmap> pinBitmap(Bitmap paramBitmap)
  {
    try
    {
      Bitmaps.pinBitmap(paramBitmap);
      if (mUnpooledBitmapsCounter.increase(paramBitmap)) {
        return CloseableReference.of(paramBitmap, mUnpooledBitmapsCounter.getReleaser());
      }
      int i = BitmapUtil.getSizeInBytes(paramBitmap);
      paramBitmap.recycle();
      throw new TooManyBitmapsException(String.format(Locale.US, "Attempted to pin a bitmap of size %d bytes. The current pool count is %d, the current pool size is %d bytes. The current pool max count is %d, the current pool max size is %d bytes.", new Object[] { Integer.valueOf(i), Integer.valueOf(mUnpooledBitmapsCounter.getCount()), Long.valueOf(mUnpooledBitmapsCounter.getSize()), Integer.valueOf(mUnpooledBitmapsCounter.getMaxCount()), Integer.valueOf(mUnpooledBitmapsCounter.getMaxSize()) }));
    }
    catch (Exception localException)
    {
      paramBitmap.recycle();
      throw Throwables.propagate(localException);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.platform.DalvikPurgeableDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */