package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

class ScalingUtils$ScaleTypeCenter
  extends ScalingUtils.AbstractScaleType
{
  public static final ScalingUtils.ScaleType INSTANCE = new ScaleTypeCenter();
  
  public void getTransformImpl(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat3 = left;
    paramFloat4 = paramRect.width() - paramInt1;
    paramFloat1 = top;
    paramFloat2 = paramRect.height() - paramInt2;
    paramMatrix.setTranslate((int)(paramFloat4 * 0.5F + paramFloat3 + 0.5F), (int)(paramFloat2 * 0.5F + paramFloat1 + 0.5F));
  }
  
  public String toString()
  {
    return "center";
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils.ScaleTypeCenter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */