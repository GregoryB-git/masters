package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import javax.annotation.Nullable;

public abstract interface Postprocessor
{
  public abstract String getName();
  
  @Nullable
  public abstract CacheKey getPostprocessorCacheKey();
  
  public abstract CloseableReference<Bitmap> process(Bitmap paramBitmap, PlatformBitmapFactory paramPlatformBitmapFactory);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.request.Postprocessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */