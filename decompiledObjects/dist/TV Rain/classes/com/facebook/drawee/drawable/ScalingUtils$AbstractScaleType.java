package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

public abstract class ScalingUtils$AbstractScaleType
  implements ScalingUtils.ScaleType
{
  public Matrix getTransform(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    getTransformImpl(paramMatrix, paramRect, paramInt1, paramInt2, paramFloat1, paramFloat2, paramRect.width() / paramInt1, paramRect.height() / paramInt2);
    return paramMatrix;
  }
  
  public abstract void getTransformImpl(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils.AbstractScaleType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */