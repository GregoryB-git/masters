package com.facebook.drawee.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import com.facebook.common.internal.Preconditions;
import javax.annotation.Nullable;

public class ArrayDrawable
  extends Drawable
  implements Drawable.Callback, TransformCallback, TransformAwareDrawable
{
  private final DrawableParent[] mDrawableParents;
  private final DrawableProperties mDrawableProperties = new DrawableProperties();
  private boolean mIsMutated;
  private boolean mIsStateful;
  private boolean mIsStatefulCalculated;
  private final Drawable[] mLayers;
  private final Rect mTmpRect = new Rect();
  private TransformCallback mTransformCallback;
  
  public ArrayDrawable(Drawable[] paramArrayOfDrawable)
  {
    int i = 0;
    mIsStateful = false;
    mIsStatefulCalculated = false;
    mIsMutated = false;
    Preconditions.checkNotNull(paramArrayOfDrawable);
    mLayers = paramArrayOfDrawable;
    for (;;)
    {
      paramArrayOfDrawable = mLayers;
      if (i >= paramArrayOfDrawable.length) {
        break;
      }
      DrawableUtils.setCallbacks(paramArrayOfDrawable[i], this, this);
      i++;
    }
    mDrawableParents = new DrawableParent[paramArrayOfDrawable.length];
  }
  
  private DrawableParent createDrawableParentForIndex(final int paramInt)
  {
    new DrawableParent()
    {
      public Drawable getDrawable()
      {
        return getDrawable(paramInt);
      }
      
      public Drawable setDrawable(Drawable paramAnonymousDrawable)
      {
        return setDrawable(paramInt, paramAnonymousDrawable);
      }
    };
  }
  
  public void draw(Canvas paramCanvas)
  {
    for (int i = 0;; i++)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        ((Drawable)localObject).draw(paramCanvas);
      }
    }
  }
  
  @Nullable
  public Drawable getDrawable(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt < mLayers.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    return mLayers[paramInt];
  }
  
  public DrawableParent getDrawableParentForIndex(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt < mDrawableParents.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    DrawableParent[] arrayOfDrawableParent = mDrawableParents;
    if (arrayOfDrawableParent[paramInt] == null) {
      arrayOfDrawableParent[paramInt] = createDrawableParentForIndex(paramInt);
    }
    return mDrawableParents[paramInt];
  }
  
  public int getIntrinsicHeight()
  {
    int i = -1;
    int j = 0;
    int m;
    for (int k = -1;; k = m)
    {
      Object localObject = mLayers;
      if (j >= localObject.length) {
        break;
      }
      localObject = localObject[j];
      m = k;
      if (localObject != null) {
        m = Math.max(k, ((Drawable)localObject).getIntrinsicHeight());
      }
      j++;
    }
    j = i;
    if (k > 0) {
      j = k;
    }
    return j;
  }
  
  public int getIntrinsicWidth()
  {
    int i = -1;
    int j = 0;
    int m;
    for (int k = -1;; k = m)
    {
      Object localObject = mLayers;
      if (j >= localObject.length) {
        break;
      }
      localObject = localObject[j];
      m = k;
      if (localObject != null) {
        m = Math.max(k, ((Drawable)localObject).getIntrinsicWidth());
      }
      j++;
    }
    j = i;
    if (k > 0) {
      j = k;
    }
    return j;
  }
  
  public int getNumberOfLayers()
  {
    return mLayers.length;
  }
  
  public int getOpacity()
  {
    if (mLayers.length == 0) {
      return -2;
    }
    int i = -1;
    int j = 1;
    for (;;)
    {
      Object localObject = mLayers;
      if (j >= localObject.length) {
        break;
      }
      localObject = localObject[j];
      int k = i;
      if (localObject != null) {
        k = Drawable.resolveOpacity(i, ((Drawable)localObject).getOpacity());
      }
      j++;
      i = k;
    }
    return i;
  }
  
  public boolean getPadding(Rect paramRect)
  {
    int i = 0;
    left = 0;
    top = 0;
    right = 0;
    bottom = 0;
    Rect localRect = mTmpRect;
    for (;;)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null)
      {
        ((Drawable)localObject).getPadding(localRect);
        left = Math.max(left, left);
        top = Math.max(top, top);
        right = Math.max(right, right);
        bottom = Math.max(bottom, bottom);
      }
      i++;
    }
    return true;
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
    TransformCallback localTransformCallback = mTransformCallback;
    if (localTransformCallback != null) {
      localTransformCallback.getTransform(paramMatrix);
    } else {
      paramMatrix.reset();
    }
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isStateful()
  {
    if (!mIsStatefulCalculated)
    {
      mIsStateful = false;
      for (int i = 0;; i++)
      {
        Object localObject = mLayers;
        int j = localObject.length;
        boolean bool1 = true;
        if (i >= j) {
          break;
        }
        localObject = localObject[i];
        boolean bool2 = mIsStateful;
        if ((localObject == null) || (!((Drawable)localObject).isStateful())) {
          bool1 = false;
        }
        mIsStateful = (bool2 | bool1);
      }
      mIsStatefulCalculated = true;
    }
    return mIsStateful;
  }
  
  public Drawable mutate()
  {
    for (int i = 0;; i++)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        ((Drawable)localObject).mutate();
      }
    }
    mIsMutated = true;
    return this;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    for (int i = 0;; i++)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        ((Drawable)localObject).setBounds(paramRect);
      }
    }
  }
  
  public boolean onLevelChange(int paramInt)
  {
    int i = 0;
    boolean bool2;
    for (boolean bool1 = false;; bool1 = bool2)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      bool2 = bool1;
      if (localObject != null)
      {
        bool2 = bool1;
        if (((Drawable)localObject).setLevel(paramInt)) {
          bool2 = true;
        }
      }
      i++;
    }
    return bool1;
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    int i = 0;
    boolean bool2;
    for (boolean bool1 = false;; bool1 = bool2)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      bool2 = bool1;
      if (localObject != null)
      {
        bool2 = bool1;
        if (((Drawable)localObject).setState(paramArrayOfInt)) {
          bool2 = true;
        }
      }
      i++;
    }
    return bool1;
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    mDrawableProperties.setAlpha(paramInt);
    for (int i = 0;; i++)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        ((Drawable)localObject).setAlpha(paramInt);
      }
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    mDrawableProperties.setColorFilter(paramColorFilter);
    for (int i = 0;; i++)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        ((Drawable)localObject).setColorFilter(paramColorFilter);
      }
    }
  }
  
  public void setDither(boolean paramBoolean)
  {
    mDrawableProperties.setDither(paramBoolean);
    for (int i = 0;; i++)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        ((Drawable)localObject).setDither(paramBoolean);
      }
    }
  }
  
  @Nullable
  public Drawable setDrawable(int paramInt, @Nullable Drawable paramDrawable)
  {
    boolean bool1 = true;
    boolean bool2;
    if (paramInt >= 0) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    if (paramInt < mLayers.length) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Preconditions.checkArgument(bool2);
    Drawable localDrawable = mLayers[paramInt];
    if (paramDrawable != localDrawable)
    {
      if ((paramDrawable != null) && (mIsMutated)) {
        paramDrawable.mutate();
      }
      DrawableUtils.setCallbacks(mLayers[paramInt], null, null);
      DrawableUtils.setCallbacks(paramDrawable, null, null);
      DrawableUtils.setDrawableProperties(paramDrawable, mDrawableProperties);
      DrawableUtils.copyProperties(paramDrawable, this);
      DrawableUtils.setCallbacks(paramDrawable, this, this);
      mIsStatefulCalculated = false;
      mLayers[paramInt] = paramDrawable;
      invalidateSelf();
    }
    return localDrawable;
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    mDrawableProperties.setFilterBitmap(paramBoolean);
    for (int i = 0;; i++)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        ((Drawable)localObject).setFilterBitmap(paramBoolean);
      }
    }
  }
  
  @TargetApi(21)
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    for (int i = 0;; i++)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        ((Drawable)localObject).setHotspot(paramFloat1, paramFloat2);
      }
    }
  }
  
  public void setTransformCallback(TransformCallback paramTransformCallback)
  {
    mTransformCallback = paramTransformCallback;
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    for (int i = 0;; i++)
    {
      Object localObject = mLayers;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if (localObject != null) {
        ((Drawable)localObject).setVisible(paramBoolean1, paramBoolean2);
      }
    }
    return bool;
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.drawable.ArrayDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */