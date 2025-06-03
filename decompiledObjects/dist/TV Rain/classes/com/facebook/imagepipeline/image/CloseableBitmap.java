package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;

public abstract class CloseableBitmap
  extends CloseableImage
{
  public abstract Bitmap getUnderlyingBitmap();
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.image.CloseableBitmap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */