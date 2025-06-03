package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

class ScalingUtils$ScaleTypeFitBottomStart
  extends ScalingUtils.AbstractScaleType
{
  public static final ScalingUtils.ScaleType INSTANCE = new ScaleTypeFitBottomStart();
  
  public void getTransformImpl(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat4 = Math.min(paramFloat3, paramFloat4);
    float f = left;
    paramFloat1 = top;
    paramFloat2 = paramRect.height();
    paramFloat3 = paramInt2;
    paramMatrix.setScale(paramFloat4, paramFloat4);
    paramMatrix.postTranslate((int)(f + 0.5F), (int)(paramFloat2 - paramFloat3 * paramFloat4 + paramFloat1 + 0.5F));
  }
  
  public String toString()
  {
    return "fit_bottom_start";
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils.ScaleTypeFitBottomStart
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */