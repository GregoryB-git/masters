package com.facebook.imagepipeline.bitmaps;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.references.CloseableReference;

public class GingerbreadBitmapFactory
  extends PlatformBitmapFactory
{
  public CloseableReference<Bitmap> createBitmapInternal(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return CloseableReference.of(Bitmap.createBitmap(paramInt1, paramInt2, paramConfig), SimpleBitmapReleaser.getInstance());
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.bitmaps.GingerbreadBitmapFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */