package com.facebook.imagepipeline.drawable;

import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.image.CloseableImage;
import javax.annotation.Nullable;

public abstract interface DrawableFactory
{
  @Nullable
  public abstract Drawable createDrawable(CloseableImage paramCloseableImage);
  
  public abstract boolean supportsImageType(CloseableImage paramCloseableImage);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.drawable.DrawableFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */