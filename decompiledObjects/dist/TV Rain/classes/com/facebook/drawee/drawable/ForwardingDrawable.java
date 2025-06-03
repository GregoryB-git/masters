package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

public class ForwardingDrawable
  extends Drawable
  implements Drawable.Callback, TransformCallback, TransformAwareDrawable, DrawableParent
{
  private static final Matrix sTempTransform = new Matrix();
  private Drawable mCurrentDelegate;
  private final DrawableProperties mDrawableProperties = new DrawableProperties();
  public TransformCallback mTransformCallback;
  
  public ForwardingDrawable(Drawable paramDrawable)
  {
    mCurrentDelegate = paramDrawable;
    DrawableUtils.setCallbacks(paramDrawable, this, this);
  }
  
  public void draw(Canvas paramCanvas)
  {
    mCurrentDelegate.draw(paramCanvas);
  }
  
  public Drawable.ConstantState getConstantState()
  {
    return mCurrentDelegate.getConstantState();
  }
  
  public Drawable getCurrent()
  {
    return mCurrentDelegate;
  }
  
  public Drawable getDrawable()
  {
    return getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return mCurrentDelegate.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return mCurrentDelegate.getIntrinsicWidth();
  }
  
  public int getOpacity()
  {
    return mCurrentDelegate.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return mCurrentDelegate.getPadding(paramRect);
  }
  
  public void getParentTransform(Matrix paramMatrix)
  {
    TransformCallback localTransformCallback = mTransformCallback;
    if (localTransformCallback != null) {
      localTransformCallback.getTransform(paramMatrix);
    } else {
      paramMatrix.reset();
    }
  }
  
  public void getRootBounds(RectF paramRectF)
  {
    TransformCallback localTransformCallback = mTransformCallback;
    if (localTransformCallback != null) {
      localTransformCallback.getRootBounds(paramRectF);
    } else {
      paramRectF.set(getBounds());
    }
  }
  
  public void getTransform(Matrix paramMatrix)
  {
    getParentTransform(paramMatrix);
  }
  
  public void getTransformedBounds(RectF paramRectF)
  {
    Matrix localMatrix = sTempTransform;
    getParentTransform(localMatrix);
    paramRectF.set(getBounds());
    localMatrix.mapRect(paramRectF);
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isStateful()
  {
    return mCurrentDelegate.isStateful();
  }
  
  public Drawable mutate()
  {
    mCurrentDelegate.mutate();
    return this;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    mCurrentDelegate.setBounds(paramRect);
  }
  
  public boolean onLevelChange(int paramInt)
  {
    return mCurrentDelegate.setLevel(paramInt);
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    return mCurrentDelegate.setState(paramArrayOfInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    mDrawableProperties.setAlpha(paramInt);
    mCurrentDelegate.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    mDrawableProperties.setColorFilter(paramColorFilter);
    mCurrentDelegate.setColorFilter(paramColorFilter);
  }
  
  public Drawable setCurrent(Drawable paramDrawable)
  {
    paramDrawable = setCurrentWithoutInvalidate(paramDrawable);
    invalidateSelf();
    return paramDrawable;
  }
  
  public Drawable setCurrentWithoutInvalidate(Drawable paramDrawable)
  {
    Drawable localDrawable = mCurrentDelegate;
    DrawableUtils.setCallbacks(localDrawable, null, null);
    DrawableUtils.setCallbacks(paramDrawable, null, null);
    DrawableUtils.setDrawableProperties(paramDrawable, mDrawableProperties);
    DrawableUtils.copyProperties(paramDrawable, this);
    DrawableUtils.setCallbacks(paramDrawable, this, this);
    mCurrentDelegate = paramDrawable;
    return localDrawable;
  }
  
  public void setDither(boolean paramBoolean)
  {
    mDrawableProperties.setDither(paramBoolean);
    mCurrentDelegate.setDither(paramBoolean);
  }
  
  public Drawable setDrawable(Drawable paramDrawable)
  {
    return setCurrent(paramDrawable);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    mDrawableProperties.setFilterBitmap(paramBoolean);
    mCurrentDelegate.setFilterBitmap(paramBoolean);
  }
  
  @TargetApi(21)
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    mCurrentDelegate.setHotspot(paramFloat1, paramFloat2);
  }
  
  public void setTransformCallback(TransformCallback paramTransformCallback)
  {
    mTransformCallback = paramTransformCallback;
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    super.setVisible(paramBoolean1, paramBoolean2);
    return mCurrentDelegate.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ForwardingDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */