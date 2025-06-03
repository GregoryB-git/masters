package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

class ScalingUtils$ScaleTypeFitCenter
  extends ScalingUtils.AbstractScaleType
{
  public static final ScalingUtils.ScaleType INSTANCE = new ScaleTypeFitCenter();
  
  public void getTransformImpl(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = Math.min(paramFloat3, paramFloat4);
    paramFloat1 = left;
    float f2 = paramRect.width();
    float f3 = paramInt1;
    paramFloat4 = top;
    paramFloat3 = paramRect.height();
    paramFloat2 = paramInt2;
    paramMatrix.setScale(f1, f1);
    paramMatrix.postTranslate((int)((f2 - f3 * f1) * 0.5F + paramFloat1 + 0.5F), (int)((paramFloat3 - paramFloat2 * f1) * 0.5F + paramFloat4 + 0.5F));
  }
  
  public String toString()
  {
    return "fit_center";
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils.ScaleTypeFitCenter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */