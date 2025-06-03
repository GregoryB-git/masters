package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

class ScalingUtils$ScaleTypeCenterInside
  extends ScalingUtils.AbstractScaleType
{
  public static final ScalingUtils.ScaleType INSTANCE = new ScaleTypeCenterInside();
  
  public void getTransformImpl(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat1 = Math.min(Math.min(paramFloat3, paramFloat4), 1.0F);
    float f1 = left;
    float f2 = paramRect.width();
    paramFloat4 = paramInt1;
    float f3 = top;
    paramFloat2 = paramRect.height();
    paramFloat3 = paramInt2;
    paramMatrix.setScale(paramFloat1, paramFloat1);
    paramMatrix.postTranslate((int)((f2 - paramFloat4 * paramFloat1) * 0.5F + f1 + 0.5F), (int)((paramFloat2 - paramFloat3 * paramFloat1) * 0.5F + f3 + 0.5F));
  }
  
  public String toString()
  {
    return "center_inside";
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils.ScaleTypeCenterInside
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */