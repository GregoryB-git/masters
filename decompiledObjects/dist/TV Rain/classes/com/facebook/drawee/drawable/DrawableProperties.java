package com.facebook.drawee.drawable;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public class DrawableProperties
{
  private static final int UNSET = -1;
  private int mAlpha = -1;
  private ColorFilter mColorFilter = null;
  private int mDither = -1;
  private int mFilterBitmap = -1;
  private boolean mIsSetColorFilter = false;
  
  @SuppressLint({"Range"})
  public void applyTo(Drawable paramDrawable)
  {
    if (paramDrawable == null) {
      return;
    }
    int i = mAlpha;
    if (i != -1) {
      paramDrawable.setAlpha(i);
    }
    if (mIsSetColorFilter) {
      paramDrawable.setColorFilter(mColorFilter);
    }
    i = mDither;
    boolean bool1 = true;
    boolean bool2;
    if (i != -1)
    {
      if (i != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      paramDrawable.setDither(bool2);
    }
    i = mFilterBitmap;
    if (i != -1)
    {
      if (i != 0) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      paramDrawable.setFilterBitmap(bool2);
    }
  }
  
  public void setAlpha(int paramInt)
  {
    mAlpha = paramInt;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    mColorFilter = paramColorFilter;
    mIsSetColorFilter = true;
  }
  
  public void setDither(boolean paramBoolean)
  {
    mDither = paramBoolean;
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    mFilterBitmap = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.DrawableProperties
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */