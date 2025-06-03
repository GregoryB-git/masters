package com.facebook.imagepipeline.postprocessors;

import android.graphics.Bitmap;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.common.internal.Preconditions;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.request.BasePostprocessor;
import javax.annotation.Nullable;

public class IterativeBoxBlurPostProcessor
  extends BasePostprocessor
{
  private static final int DEFAULT_ITERATIONS = 3;
  private final int mBlurRadius;
  private CacheKey mCacheKey;
  private final int mIterations;
  
  public IterativeBoxBlurPostProcessor(int paramInt)
  {
    this(3, paramInt);
  }
  
  public IterativeBoxBlurPostProcessor(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt1 > 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt2 > 0) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    mIterations = paramInt1;
    mBlurRadius = paramInt2;
  }
  
  @Nullable
  public CacheKey getPostprocessorCacheKey()
  {
    if (mCacheKey == null) {
      mCacheKey = new SimpleCacheKey(String.format(null, "i%dr%d", new Object[] { Integer.valueOf(mIterations), Integer.valueOf(mBlurRadius) }));
    }
    return mCacheKey;
  }
  
  public void process(Bitmap paramBitmap)
  {
    NativeBlurFilter.iterativeBoxBlur(paramBitmap, mIterations, mBlurRadius);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.postprocessors.IterativeBoxBlurPostProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */