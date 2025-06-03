package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import javax.annotation.Nullable;

public class ScalingUtils$InterpolatingScaleType
  implements ScalingUtils.ScaleType, ScalingUtils.StatefulScaleType
{
  @Nullable
  private final Rect mBoundsFrom;
  @Nullable
  private final Rect mBoundsTo;
  @Nullable
  private final PointF mFocusPointFrom;
  @Nullable
  private final PointF mFocusPointTo;
  private float mInterpolatingValue;
  private final float[] mMatrixValuesFrom = new float[9];
  private final float[] mMatrixValuesInterpolated = new float[9];
  private final float[] mMatrixValuesTo = new float[9];
  private final ScalingUtils.ScaleType mScaleTypeFrom;
  private final ScalingUtils.ScaleType mScaleTypeTo;
  
  public ScalingUtils$InterpolatingScaleType(ScalingUtils.ScaleType paramScaleType1, ScalingUtils.ScaleType paramScaleType2)
  {
    this(paramScaleType1, paramScaleType2, null, null);
  }
  
  public ScalingUtils$InterpolatingScaleType(ScalingUtils.ScaleType paramScaleType1, ScalingUtils.ScaleType paramScaleType2, @Nullable Rect paramRect1, @Nullable Rect paramRect2)
  {
    this(paramScaleType1, paramScaleType2, paramRect1, paramRect2, null, null);
  }
  
  public ScalingUtils$InterpolatingScaleType(ScalingUtils.ScaleType paramScaleType1, ScalingUtils.ScaleType paramScaleType2, @Nullable Rect paramRect1, @Nullable Rect paramRect2, @Nullable PointF paramPointF1, @Nullable PointF paramPointF2)
  {
    mScaleTypeFrom = paramScaleType1;
    mScaleTypeTo = paramScaleType2;
    mBoundsFrom = paramRect1;
    mBoundsTo = paramRect2;
    mFocusPointFrom = paramPointF1;
    mFocusPointTo = paramPointF2;
  }
  
  @Nullable
  public Rect getBoundsFrom()
  {
    return mBoundsFrom;
  }
  
  @Nullable
  public Rect getBoundsTo()
  {
    return mBoundsTo;
  }
  
  @Nullable
  public PointF getFocusPointFrom()
  {
    return mFocusPointFrom;
  }
  
  @Nullable
  public PointF getFocusPointTo()
  {
    return mFocusPointTo;
  }
  
  public ScalingUtils.ScaleType getScaleTypeFrom()
  {
    return mScaleTypeFrom;
  }
  
  public ScalingUtils.ScaleType getScaleTypeTo()
  {
    return mScaleTypeTo;
  }
  
  public Object getState()
  {
    return Float.valueOf(mInterpolatingValue);
  }
  
  public Matrix getTransform(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    Object localObject1 = mBoundsFrom;
    if (localObject1 == null) {
      localObject1 = paramRect;
    }
    Object localObject2 = mBoundsTo;
    if (localObject2 != null) {
      paramRect = (Rect)localObject2;
    }
    ScalingUtils.ScaleType localScaleType = mScaleTypeFrom;
    localObject2 = mFocusPointFrom;
    float f1;
    if (localObject2 == null) {
      f1 = paramFloat1;
    } else {
      f1 = x;
    }
    float f2;
    if (localObject2 == null) {
      f2 = paramFloat2;
    } else {
      f2 = y;
    }
    localScaleType.getTransform(paramMatrix, (Rect)localObject1, paramInt1, paramInt2, f1, f2);
    paramMatrix.getValues(mMatrixValuesFrom);
    localObject1 = mScaleTypeTo;
    localObject2 = mFocusPointTo;
    if (localObject2 != null) {
      paramFloat1 = x;
    }
    if (localObject2 != null) {
      paramFloat2 = y;
    }
    ((ScalingUtils.ScaleType)localObject1).getTransform(paramMatrix, paramRect, paramInt1, paramInt2, paramFloat1, paramFloat2);
    paramMatrix.getValues(mMatrixValuesTo);
    for (paramInt1 = 0; paramInt1 < 9; paramInt1++)
    {
      paramRect = mMatrixValuesInterpolated;
      paramFloat2 = mMatrixValuesFrom[paramInt1];
      paramFloat1 = mInterpolatingValue;
      paramRect[paramInt1] = (mMatrixValuesTo[paramInt1] * paramFloat1 + (1.0F - paramFloat1) * paramFloat2);
    }
    paramMatrix.setValues(mMatrixValuesInterpolated);
    return paramMatrix;
  }
  
  public float getValue()
  {
    return mInterpolatingValue;
  }
  
  public void setValue(float paramFloat)
  {
    mInterpolatingValue = paramFloat;
  }
  
  public String toString()
  {
    return String.format("InterpolatingScaleType(%s (%s) -> %s (%s))", new Object[] { String.valueOf(mScaleTypeFrom), String.valueOf(mFocusPointFrom), String.valueOf(mScaleTypeTo), String.valueOf(mFocusPointTo) });
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils.InterpolatingScaleType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */