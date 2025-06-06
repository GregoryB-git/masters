package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import javax.annotation.Nullable;

public abstract class BasePostprocessor
  implements Postprocessor
{
  public static final Bitmap.Config FALLBACK_BITMAP_CONFIGURATION = Bitmap.Config.ARGB_8888;
  
  private static void internalCopyBitmap(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    if (paramBitmap1.getConfig() == paramBitmap2.getConfig()) {
      Bitmaps.copyBitmap(paramBitmap1, paramBitmap2);
    } else {
      new Canvas(paramBitmap1).drawBitmap(paramBitmap2, 0.0F, 0.0F, null);
    }
  }
  
  public String getName()
  {
    return "Unknown postprocessor";
  }
  
  @Nullable
  public CacheKey getPostprocessorCacheKey()
  {
    return null;
  }
  
  public CloseableReference<Bitmap> process(Bitmap paramBitmap, PlatformBitmapFactory paramPlatformBitmapFactory)
  {
    Bitmap.Config localConfig = paramBitmap.getConfig();
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    if (localConfig == null) {
      localConfig = FALLBACK_BITMAP_CONFIGURATION;
    }
    paramPlatformBitmapFactory = paramPlatformBitmapFactory.createBitmapInternal(i, j, localConfig);
    try
    {
      process((Bitmap)paramPlatformBitmapFactory.get(), paramBitmap);
      paramBitmap = CloseableReference.cloneOrNull(paramPlatformBitmapFactory);
      return paramBitmap;
    }
    finally
    {
      CloseableReference.closeSafely(paramPlatformBitmapFactory);
    }
  }
  
  public void process(Bitmap paramBitmap) {}
  
  public void process(Bitmap paramBitmap1, Bitmap paramBitmap2)
  {
    internalCopyBitmap(paramBitmap1, paramBitmap2);
    process(paramBitmap1);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.request.BasePostprocessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */