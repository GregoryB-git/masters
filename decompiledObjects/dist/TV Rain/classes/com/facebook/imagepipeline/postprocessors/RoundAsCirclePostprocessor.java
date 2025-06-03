package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.imagepipeline.nativecode.NativeRoundingFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import javax.annotation.Nullable;

public class RoundAsCirclePostprocessor
  extends BasePostprocessor
{
  @Nullable
  private CacheKey mCacheKey;
  
  @Nullable
  public CacheKey getPostprocessorCacheKey()
  {
    if (mCacheKey == null) {
      mCacheKey = new SimpleCacheKey("RoundAsCirclePostprocessor");
    }
    return mCacheKey;
  }
  
  public void process(Bitmap paramBitmap)
  {
    NativeRoundingFilter.toCircle(paramBitmap);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.postprocessors.RoundAsCirclePostprocessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */