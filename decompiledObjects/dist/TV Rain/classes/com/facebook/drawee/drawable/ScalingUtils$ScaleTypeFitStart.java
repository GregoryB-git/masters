package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

class ScalingUtils$ScaleTypeFitStart
  extends ScalingUtils.AbstractScaleType
{
  public static final ScalingUtils.ScaleType INSTANCE = new ScaleTypeFitStart();
  
  public void getTransformImpl(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat3 = Math.min(paramFloat3, paramFloat4);
    paramFloat1 = left;
    paramFloat2 = top;
    paramMatrix.setScale(paramFloat3, paramFloat3);
    paramMatrix.postTranslate((int)(paramFloat1 + 0.5F), (int)(paramFloat2 + 0.5F));
  }
  
  public String toString()
  {
    return "fit_start";
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils.ScaleTypeFitStart
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */