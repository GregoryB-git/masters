package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.Objects;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;

public class ScaleTypeDrawable
  extends ForwardingDrawable
{
  @VisibleForTesting
  public Matrix mDrawMatrix;
  @VisibleForTesting
  public PointF mFocusPoint = null;
  @VisibleForTesting
  public ScalingUtils.ScaleType mScaleType;
  @VisibleForTesting
  public Object mScaleTypeState;
  private Matrix mTempMatrix = new Matrix();
  @VisibleForTesting
  public int mUnderlyingHeight = 0;
  @VisibleForTesting
  public int mUnderlyingWidth = 0;
  
  public ScaleTypeDrawable(Drawable paramDrawable, ScalingUtils.ScaleType paramScaleType)
  {
    super((Drawable)Preconditions.checkNotNull(paramDrawable));
    mScaleType = paramScaleType;
  }
  
  private void configureBoundsIfUnderlyingChanged()
  {
    Object localObject = mScaleType;
    boolean bool = localObject instanceof ScalingUtils.StatefulScaleType;
    int i = 1;
    int j;
    if (bool)
    {
      localObject = ((ScalingUtils.StatefulScaleType)localObject).getState();
      if ((localObject != null) && (localObject.equals(mScaleTypeState))) {
        j = 0;
      } else {
        j = 1;
      }
      mScaleTypeState = localObject;
    }
    else
    {
      j = 0;
    }
    int k = i;
    if (mUnderlyingWidth == getCurrent().getIntrinsicWidth()) {
      if (mUnderlyingHeight != getCurrent().getIntrinsicHeight()) {
        k = i;
      } else {
        k = 0;
      }
    }
    if ((k != 0) || (j != 0)) {
      configureBounds();
    }
  }
  
  @VisibleForTesting
  public void configureBounds()
  {
    Object localObject = getCurrent();
    Rect localRect = getBounds();
    int i = localRect.width();
    int j = localRect.height();
    int k = ((Drawable)localObject).getIntrinsicWidth();
    mUnderlyingWidth = k;
    int m = ((Drawable)localObject).getIntrinsicHeight();
    mUnderlyingHeight = m;
    if ((k > 0) && (m > 0))
    {
      if ((k == i) && (m == j))
      {
        ((Drawable)localObject).setBounds(localRect);
        mDrawMatrix = null;
        return;
      }
      if (mScaleType == ScalingUtils.ScaleType.FIT_XY)
      {
        ((Drawable)localObject).setBounds(localRect);
        mDrawMatrix = null;
        return;
      }
      ((Drawable)localObject).setBounds(0, 0, k, m);
      localObject = mScaleType;
      Matrix localMatrix = mTempMatrix;
      PointF localPointF = mFocusPoint;
      float f1;
      if (localPointF != null) {
        f1 = x;
      } else {
        f1 = 0.5F;
      }
      float f2;
      if (localPointF != null) {
        f2 = y;
      } else {
        f2 = 0.5F;
      }
      ((ScalingUtils.ScaleType)localObject).getTransform(localMatrix, localRect, k, m, f1, f2);
      mDrawMatrix = mTempMatrix;
      return;
    }
    ((Drawable)localObject).setBounds(localRect);
    mDrawMatrix = null;
  }
  
  public void draw(Canvas paramCanvas)
  {
    configureBoundsIfUnderlyingChanged();
    if (mDrawMatrix != null)
    {
      int i = paramCanvas.save();
      paramCanvas.clipRect(getBounds());
      paramCanvas.concat(mDrawMatrix);
      super.draw(paramCanvas);
      paramCanvas.restoreToCount(i);
    }
    else
    {
      super.draw(paramCanvas);
    }
  }
  
  public PointF getFocusPoint()
  {
    return mFocusPoint;
  }
  
  public ScalingUtils.ScaleType getScaleType()
  {
    return mScaleType;
  }
  
  public void getTransform(Matrix paramMatrix)
  {
    getParentTransform(paramMatrix);
    configureBoundsIfUnderlyingChanged();
    Matrix localMatrix = mDrawMatrix;
    if (localMatrix != null) {
      paramMatrix.preConcat(localMatrix);
    }
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    configureBounds();
  }
  
  public Drawable setCurrent(Drawable paramDrawable)
  {
    paramDrawable = super.setCurrent(paramDrawable);
    configureBounds();
    return paramDrawable;
  }
  
  public void setFocusPoint(PointF paramPointF)
  {
    if (Objects.equal(mFocusPoint, paramPointF)) {
      return;
    }
    if (mFocusPoint == null) {
      mFocusPoint = new PointF();
    }
    mFocusPoint.set(paramPointF);
    configureBounds();
    invalidateSelf();
  }
  
  public void setScaleType(ScalingUtils.ScaleType paramScaleType)
  {
    if (Objects.equal(mScaleType, paramScaleType)) {
      return;
    }
    mScaleType = paramScaleType;
    mScaleTypeState = null;
    configureBounds();
    invalidateSelf();
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ScaleTypeDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */