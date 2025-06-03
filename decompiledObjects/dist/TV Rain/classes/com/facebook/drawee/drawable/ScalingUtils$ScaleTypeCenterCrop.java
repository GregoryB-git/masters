package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

class ScalingUtils$ScaleTypeCenterCrop
  extends ScalingUtils.AbstractScaleType
{
  public static final ScalingUtils.ScaleType INSTANCE = new ScaleTypeCenterCrop();
  
  public void getTransformImpl(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if (paramFloat4 > paramFloat3)
    {
      paramFloat1 = left;
      paramFloat2 = (paramRect.width() - paramInt1 * paramFloat4) * 0.5F + paramFloat1;
      paramFloat1 = top;
      paramFloat3 = paramFloat4;
    }
    else
    {
      paramFloat2 = left;
      paramFloat1 = top;
      paramFloat1 = (paramRect.height() - paramInt2 * paramFloat3) * 0.5F + paramFloat1;
    }
    paramMatrix.setScale(paramFloat3, paramFloat3);
    paramMatrix.postTranslate((int)(paramFloat2 + 0.5F), (int)(paramFloat1 + 0.5F));
  }
  
  public String toString()
  {
    return "center_crop";
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils.ScaleTypeCenterCrop
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */