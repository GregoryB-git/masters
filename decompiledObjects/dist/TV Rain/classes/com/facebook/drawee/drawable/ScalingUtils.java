package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import javax.annotation.Nullable;

public class ScalingUtils
{
  @Nullable
  public static ScaleTypeDrawable getActiveScaleTypeDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == null) {
      return null;
    }
    if ((paramDrawable instanceof ScaleTypeDrawable)) {
      return (ScaleTypeDrawable)paramDrawable;
    }
    if ((paramDrawable instanceof DrawableParent)) {
      return getActiveScaleTypeDrawable(((DrawableParent)paramDrawable).getDrawable());
    }
    if ((paramDrawable instanceof ArrayDrawable))
    {
      ArrayDrawable localArrayDrawable = (ArrayDrawable)paramDrawable;
      int i = localArrayDrawable.getNumberOfLayers();
      for (int j = 0; j < i; j++)
      {
        paramDrawable = getActiveScaleTypeDrawable(localArrayDrawable.getDrawable(j));
        if (paramDrawable != null) {
          return paramDrawable;
        }
      }
    }
    return null;
  }
  
  public static abstract class AbstractScaleType
    implements ScalingUtils.ScaleType
  {
    public Matrix getTransform(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
    {
      getTransformImpl(paramMatrix, paramRect, paramInt1, paramInt2, paramFloat1, paramFloat2, paramRect.width() / paramInt1, paramRect.height() / paramInt2);
      return paramMatrix;
    }
    
    public abstract void getTransformImpl(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
  }
  
  public static class InterpolatingScaleType
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
    
    public InterpolatingScaleType(ScalingUtils.ScaleType paramScaleType1, ScalingUtils.ScaleType paramScaleType2)
    {
      this(paramScaleType1, paramScaleType2, null, null);
    }
    
    public InterpolatingScaleType(ScalingUtils.ScaleType paramScaleType1, ScalingUtils.ScaleType paramScaleType2, @Nullable Rect paramRect1, @Nullable Rect paramRect2)
    {
      this(paramScaleType1, paramScaleType2, paramRect1, paramRect2, null, null);
    }
    
    public InterpolatingScaleType(ScalingUtils.ScaleType paramScaleType1, ScalingUtils.ScaleType paramScaleType2, @Nullable Rect paramRect1, @Nullable Rect paramRect2, @Nullable PointF paramPointF1, @Nullable PointF paramPointF2)
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
  
  public static abstract interface ScaleType
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
  
  public static class ScaleTypeCenter
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
  
  public static class ScaleTypeCenterCrop
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
  
  public static class ScaleTypeCenterInside
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
  
  public static class ScaleTypeFitBottomStart
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
  
  public static class ScaleTypeFitCenter
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
  
  public static class ScaleTypeFitEnd
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
  
  public static class ScaleTypeFitStart
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
  
  public static class ScaleTypeFitXY
    extends ScalingUtils.AbstractScaleType
  {
    public static final ScalingUtils.ScaleType INSTANCE = new ScaleTypeFitXY();
    
    public void getTransformImpl(Matrix paramMatrix, Rect paramRect, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      paramFloat1 = left;
      paramFloat2 = top;
      paramMatrix.setScale(paramFloat3, paramFloat4);
      paramMatrix.postTranslate((int)(paramFloat1 + 0.5F), (int)(paramFloat2 + 0.5F));
    }
    
    public String toString()
    {
      return "fit_xy";
    }
  }
  
  public static class ScaleTypeFocusCrop
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
  
  public static abstract interface StatefulScaleType
  {
    public abstract Object getState();
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScalingUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */