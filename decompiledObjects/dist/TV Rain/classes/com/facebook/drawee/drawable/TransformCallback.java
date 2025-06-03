package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.RectF;

public abstract interface TransformCallback
{
  public abstract void getRootBounds(RectF paramRectF);
  
  public abstract void getTransform(Matrix paramMatrix);
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.TransformCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */