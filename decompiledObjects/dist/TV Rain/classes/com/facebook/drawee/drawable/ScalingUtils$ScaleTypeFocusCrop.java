package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

class ScalingUtils$ScaleTypeFocusCrop
  extends ScalingUtils.AbstractScaleType
{
  public static final ScalingUtils.ScaleType INSTANCE = new ScaleTypeFocusCrop();
  
  public void getTransformImpl(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1;
    if (paramFloat4 > paramFloat3)
    {
      f1 = paramRect.width();
      paramFloat2 = paramInt1 * paramFloat4;
      paramFloat3 = left;
      paramFloat1 = Math.max(Math.min(f1 * 0.5F - paramFloat1 * paramFloat2, 0.0F), paramRect.width() - paramFloat2) + paramFloat3;
      paramFloat2 = top;
      paramFloat3 = paramFloat4;
    }
    else
    {
      paramFloat1 = left;
      f1 = paramRect.height();
      paramFloat4 = paramInt2 * paramFloat3;
      float f2 = top;
      paramFloat2 = Math.max(Math.min(f1 * 0.5F - paramFloat2 * paramFloat4, 0.0F), paramRect.height() - paramFloat4) + f2;
    }
    paramMatrix.setScale(paramFloat3, paramFloat3);
    paramMatrix.postTranslate((int)(paramFloat1 + 0.5F), (int)(paramFloat2 + 0.5F));
  }
  
  public String toString()
  {
    return "focus_crop";
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils.ScaleTypeFocusCrop
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */