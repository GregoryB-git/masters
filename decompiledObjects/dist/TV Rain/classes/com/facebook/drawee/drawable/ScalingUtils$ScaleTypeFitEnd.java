package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

class ScalingUtils$ScaleTypeFitEnd
  extends ScalingUtils.AbstractScaleType
{
  public static final ScalingUtils.ScaleType INSTANCE = new ScaleTypeFitEnd();
  
  public void getTransformImpl(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat4 = Math.min(paramFloat3, paramFloat4);
    paramFloat2 = left;
    float f1 = paramRect.width();
    float f2 = paramInt1;
    paramFloat3 = top;
    paramFloat1 = paramRect.height();
    float f3 = paramInt2;
    paramMatrix.setScale(paramFloat4, paramFloat4);
    paramMatrix.postTranslate((int)(f1 - f2 * paramFloat4 + paramFloat2 + 0.5F), (int)(paramFloat1 - f3 * paramFloat4 + paramFloat3 + 0.5F));
  }
  
  public String toString()
  {
    return "fit_end";
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils.ScaleTypeFitEnd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */