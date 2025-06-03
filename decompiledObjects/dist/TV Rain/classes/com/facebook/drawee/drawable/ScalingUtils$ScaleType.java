package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;

public abstract interface ScalingUtils$ScaleType
{
  public static final ScaleType CENTER;
  public static final ScaleType CENTER_CROP;
  public static final ScaleType CENTER_INSIDE;
  public static final ScaleType FIT_BOTTOM_START = ScalingUtils.ScaleTypeFitBottomStart.INSTANCE;
  public static final ScaleType FIT_CENTER;
  public static final ScaleType FIT_END;
  public static final ScaleType FIT_START;
  public static final ScaleType FIT_XY = ScalingUtils.ScaleTypeFitXY.INSTANCE;
  public static final ScaleType FOCUS_CROP;
  
  static
  {
    FIT_START = ScalingUtils.ScaleTypeFitStart.INSTANCE;
    FIT_CENTER = ScalingUtils.ScaleTypeFitCenter.INSTANCE;
    FIT_END = ScalingUtils.ScaleTypeFitEnd.INSTANCE;
    CENTER = ScalingUtils.ScaleTypeCenter.INSTANCE;
    CENTER_INSIDE = ScalingUtils.ScaleTypeCenterInside.INSTANCE;
    CENTER_CROP = ScalingUtils.ScaleTypeCenterCrop.INSTANCE;
    FOCUS_CROP = ScalingUtils.ScaleTypeFocusCrop.INSTANCE;
  }
  
  public abstract Matrix getTransform(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2);
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils.ScaleType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */