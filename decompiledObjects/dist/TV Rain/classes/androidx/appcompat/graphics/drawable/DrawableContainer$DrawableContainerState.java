package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.DrawableCompat;

abstract class DrawableContainer$DrawableContainerState
  extends Drawable.ConstantState
{
  public boolean mAutoMirrored;
  public boolean mCanConstantState;
  public int mChangingConfigurations;
  public boolean mCheckedConstantSize;
  public boolean mCheckedConstantState;
  public boolean mCheckedOpacity;
  public boolean mCheckedPadding;
  public boolean mCheckedStateful;
  public int mChildrenChangingConfigurations;
  public ColorFilter mColorFilter;
  public int mConstantHeight;
  public int mConstantMinimumHeight;
  public int mConstantMinimumWidth;
  public Rect mConstantPadding;
  public boolean mConstantSize;
  public int mConstantWidth;
  public int mDensity;
  public boolean mDither;
  public SparseArray<Drawable.ConstantState> mDrawableFutures;
  public Drawable[] mDrawables;
  public int mEnterFadeDuration;
  public int mExitFadeDuration;
  public boolean mHasColorFilter;
  public boolean mHasTintList;
  public boolean mHasTintMode;
  public int mLayoutDirection;
  public boolean mMutated;
  public int mNumChildren;
  public int mOpacity;
  public final DrawableContainer mOwner;
  public Resources mSourceRes;
  public boolean mStateful;
  public ColorStateList mTintList;
  public PorterDuff.Mode mTintMode;
  public boolean mVariablePadding;
  
  public DrawableContainer$DrawableContainerState(DrawableContainerState paramDrawableContainerState, DrawableContainer paramDrawableContainer, Resources paramResources)
  {
    int i = 0;
    mVariablePadding = false;
    mConstantSize = false;
    mDither = true;
    mEnterFadeDuration = 0;
    mExitFadeDuration = 0;
    mOwner = paramDrawableContainer;
    Object localObject = null;
    if (paramResources != null) {
      paramDrawableContainer = paramResources;
    } else if (paramDrawableContainerState != null) {
      paramDrawableContainer = mSourceRes;
    } else {
      paramDrawableContainer = null;
    }
    mSourceRes = paramDrawableContainer;
    if (paramDrawableContainerState != null) {
      j = mDensity;
    } else {
      j = 0;
    }
    int j = DrawableContainer.resolveDensity(paramResources, j);
    mDensity = j;
    if (paramDrawableContainerState != null)
    {
      mChangingConfigurations = mChangingConfigurations;
      mChildrenChangingConfigurations = mChildrenChangingConfigurations;
      mCheckedConstantState = true;
      mCanConstantState = true;
      mVariablePadding = mVariablePadding;
      mConstantSize = mConstantSize;
      mDither = mDither;
      mMutated = mMutated;
      mLayoutDirection = mLayoutDirection;
      mEnterFadeDuration = mEnterFadeDuration;
      mExitFadeDuration = mExitFadeDuration;
      mAutoMirrored = mAutoMirrored;
      mColorFilter = mColorFilter;
      mHasColorFilter = mHasColorFilter;
      mTintList = mTintList;
      mTintMode = mTintMode;
      mHasTintList = mHasTintList;
      mHasTintMode = mHasTintMode;
      if (mDensity == j)
      {
        if (mCheckedPadding)
        {
          paramDrawableContainer = (DrawableContainer)localObject;
          if (mConstantPadding != null) {
            paramDrawableContainer = new Rect(mConstantPadding);
          }
          mConstantPadding = paramDrawableContainer;
          mCheckedPadding = true;
        }
        if (mCheckedConstantSize)
        {
          mConstantWidth = mConstantWidth;
          mConstantHeight = mConstantHeight;
          mConstantMinimumWidth = mConstantMinimumWidth;
          mConstantMinimumHeight = mConstantMinimumHeight;
          mCheckedConstantSize = true;
        }
      }
      if (mCheckedOpacity)
      {
        mOpacity = mOpacity;
        mCheckedOpacity = true;
      }
      if (mCheckedStateful)
      {
        mStateful = mStateful;
        mCheckedStateful = true;
      }
      paramDrawableContainer = mDrawables;
      mDrawables = new Drawable[paramDrawableContainer.length];
      mNumChildren = mNumChildren;
      paramDrawableContainerState = mDrawableFutures;
      if (paramDrawableContainerState != null) {
        mDrawableFutures = paramDrawableContainerState.clone();
      } else {
        mDrawableFutures = new SparseArray(mNumChildren);
      }
      int k = mNumChildren;
      for (j = i; j < k; j++)
      {
        paramDrawableContainerState = paramDrawableContainer[j];
        if (paramDrawableContainerState != null)
        {
          paramDrawableContainerState = paramDrawableContainerState.getConstantState();
          if (paramDrawableContainerState != null) {
            mDrawableFutures.put(j, paramDrawableContainerState);
          } else {
            mDrawables[j] = paramDrawableContainer[j];
          }
        }
      }
    }
    mDrawables = new Drawable[10];
    mNumChildren = 0;
  }
  
  private void createAllFutures()
  {
    Object localObject = mDrawableFutures;
    if (localObject != null)
    {
      int i = ((SparseArray)localObject).size();
      for (int j = 0; j < i; j++)
      {
        int k = mDrawableFutures.keyAt(j);
        localObject = (Drawable.ConstantState)mDrawableFutures.valueAt(j);
        mDrawables[k] = prepareDrawable(((Drawable.ConstantState)localObject).newDrawable(mSourceRes));
      }
      mDrawableFutures = null;
    }
  }
  
  private Drawable prepareDrawable(Drawable paramDrawable)
  {
    DrawableCompat.setLayoutDirection(paramDrawable, mLayoutDirection);
    paramDrawable = paramDrawable.mutate();
    paramDrawable.setCallback(mOwner);
    return paramDrawable;
  }
  
  public final int addChild(Drawable paramDrawable)
  {
    int i = mNumChildren;
    if (i >= mDrawables.length) {
      growArray(i, i + 10);
    }
    paramDrawable.mutate();
    paramDrawable.setVisible(false, true);
    paramDrawable.setCallback(mOwner);
    mDrawables[i] = paramDrawable;
    mNumChildren += 1;
    int j = mChildrenChangingConfigurations;
    mChildrenChangingConfigurations = (paramDrawable.getChangingConfigurations() | j);
    invalidateCache();
    mConstantPadding = null;
    mCheckedPadding = false;
    mCheckedConstantSize = false;
    mCheckedConstantState = false;
    return i;
  }
  
  @RequiresApi(21)
  public final void applyTheme(Resources.Theme paramTheme)
  {
    if (paramTheme != null)
    {
      createAllFutures();
      int i = mNumChildren;
      Drawable[] arrayOfDrawable = mDrawables;
      for (int j = 0; j < i; j++)
      {
        Drawable localDrawable = arrayOfDrawable[j];
        if ((localDrawable != null) && (DrawableCompat.canApplyTheme(localDrawable)))
        {
          DrawableCompat.applyTheme(arrayOfDrawable[j], paramTheme);
          mChildrenChangingConfigurations |= arrayOfDrawable[j].getChangingConfigurations();
        }
      }
      updateDensity(DrawableContainer.Api21Impl.getResources(paramTheme));
    }
  }
  
  @RequiresApi(21)
  public boolean canApplyTheme()
  {
    int i = mNumChildren;
    Drawable[] arrayOfDrawable = mDrawables;
    for (int j = 0; j < i; j++)
    {
      Object localObject = arrayOfDrawable[j];
      if (localObject != null)
      {
        if (DrawableCompat.canApplyTheme((Drawable)localObject)) {
          return true;
        }
      }
      else
      {
        localObject = (Drawable.ConstantState)mDrawableFutures.get(j);
        if ((localObject != null) && (DrawableContainer.Api21Impl.canApplyTheme((Drawable.ConstantState)localObject))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean canConstantState()
  {
    if (mCheckedConstantState) {
      return mCanConstantState;
    }
    createAllFutures();
    mCheckedConstantState = true;
    int i = mNumChildren;
    Drawable[] arrayOfDrawable = mDrawables;
    for (int j = 0; j < i; j++) {
      if (arrayOfDrawable[j].getConstantState() == null)
      {
        mCanConstantState = false;
        return false;
      }
    }
    mCanConstantState = true;
    return true;
  }
  
  public final void clearMutated()
  {
    mMutated = false;
  }
  
  public void computeConstantSize()
  {
    mCheckedConstantSize = true;
    createAllFutures();
    int i = mNumChildren;
    Drawable[] arrayOfDrawable = mDrawables;
    mConstantHeight = -1;
    mConstantWidth = -1;
    int j = 0;
    mConstantMinimumHeight = 0;
    mConstantMinimumWidth = 0;
    while (j < i)
    {
      Drawable localDrawable = arrayOfDrawable[j];
      int k = localDrawable.getIntrinsicWidth();
      if (k > mConstantWidth) {
        mConstantWidth = k;
      }
      k = localDrawable.getIntrinsicHeight();
      if (k > mConstantHeight) {
        mConstantHeight = k;
      }
      k = localDrawable.getMinimumWidth();
      if (k > mConstantMinimumWidth) {
        mConstantMinimumWidth = k;
      }
      k = localDrawable.getMinimumHeight();
      if (k > mConstantMinimumHeight) {
        mConstantMinimumHeight = k;
      }
      j++;
    }
  }
  
  public final int getCapacity()
  {
    return mDrawables.length;
  }
  
  public int getChangingConfigurations()
  {
    return mChangingConfigurations | mChildrenChangingConfigurations;
  }
  
  public final Drawable getChild(int paramInt)
  {
    Object localObject = mDrawables[paramInt];
    if (localObject != null) {
      return (Drawable)localObject;
    }
    localObject = mDrawableFutures;
    if (localObject != null)
    {
      int i = ((SparseArray)localObject).indexOfKey(paramInt);
      if (i >= 0)
      {
        localObject = prepareDrawable(((Drawable.ConstantState)mDrawableFutures.valueAt(i)).newDrawable(mSourceRes));
        mDrawables[paramInt] = localObject;
        mDrawableFutures.removeAt(i);
        if (mDrawableFutures.size() == 0) {
          mDrawableFutures = null;
        }
        return (Drawable)localObject;
      }
    }
    return null;
  }
  
  public final int getChildCount()
  {
    return mNumChildren;
  }
  
  public final int getConstantHeight()
  {
    if (!mCheckedConstantSize) {
      computeConstantSize();
    }
    return mConstantHeight;
  }
  
  public final int getConstantMinimumHeight()
  {
    if (!mCheckedConstantSize) {
      computeConstantSize();
    }
    return mConstantMinimumHeight;
  }
  
  public final int getConstantMinimumWidth()
  {
    if (!mCheckedConstantSize) {
      computeConstantSize();
    }
    return mConstantMinimumWidth;
  }
  
  public final Rect getConstantPadding()
  {
    boolean bool = mVariablePadding;
    Object localObject1 = null;
    if (bool) {
      return null;
    }
    Object localObject2 = mConstantPadding;
    if ((localObject2 == null) && (!mCheckedPadding))
    {
      createAllFutures();
      Rect localRect = new Rect();
      int i = mNumChildren;
      Drawable[] arrayOfDrawable = mDrawables;
      int j = 0;
      while (j < i)
      {
        Object localObject3 = localObject1;
        if (arrayOfDrawable[j].getPadding(localRect))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = new Rect(0, 0, 0, 0);
          }
          int k = left;
          if (k > left) {
            left = k;
          }
          k = top;
          if (k > top) {
            top = k;
          }
          k = right;
          if (k > right) {
            right = k;
          }
          k = bottom;
          localObject3 = localObject2;
          if (k > bottom)
          {
            bottom = k;
            localObject3 = localObject2;
          }
        }
        j++;
        localObject1 = localObject3;
      }
      mCheckedPadding = true;
      mConstantPadding = ((Rect)localObject1);
      return (Rect)localObject1;
    }
    return (Rect)localObject2;
  }
  
  public final int getConstantWidth()
  {
    if (!mCheckedConstantSize) {
      computeConstantSize();
    }
    return mConstantWidth;
  }
  
  public final int getEnterFadeDuration()
  {
    return mEnterFadeDuration;
  }
  
  public final int getExitFadeDuration()
  {
    return mExitFadeDuration;
  }
  
  public final int getOpacity()
  {
    if (mCheckedOpacity) {
      return mOpacity;
    }
    createAllFutures();
    int i = mNumChildren;
    Drawable[] arrayOfDrawable = mDrawables;
    int j;
    if (i > 0) {
      j = arrayOfDrawable[0].getOpacity();
    } else {
      j = -2;
    }
    for (int k = 1; k < i; k++) {
      j = Drawable.resolveOpacity(j, arrayOfDrawable[k].getOpacity());
    }
    mOpacity = j;
    mCheckedOpacity = true;
    return j;
  }
  
  public void growArray(int paramInt1, int paramInt2)
  {
    Drawable[] arrayOfDrawable1 = new Drawable[paramInt2];
    Drawable[] arrayOfDrawable2 = mDrawables;
    if (arrayOfDrawable2 != null) {
      System.arraycopy(arrayOfDrawable2, 0, arrayOfDrawable1, 0, paramInt1);
    }
    mDrawables = arrayOfDrawable1;
  }
  
  public void invalidateCache()
  {
    mCheckedOpacity = false;
    mCheckedStateful = false;
  }
  
  public final boolean isConstantSize()
  {
    return mConstantSize;
  }
  
  public final boolean isStateful()
  {
    if (mCheckedStateful) {
      return mStateful;
    }
    createAllFutures();
    int i = mNumChildren;
    Drawable[] arrayOfDrawable = mDrawables;
    boolean bool1 = false;
    boolean bool2;
    for (int j = 0;; j++)
    {
      bool2 = bool1;
      if (j >= i) {
        break;
      }
      if (arrayOfDrawable[j].isStateful())
      {
        bool2 = true;
        break;
      }
    }
    mStateful = bool2;
    mCheckedStateful = true;
    return bool2;
  }
  
  public void mutate()
  {
    int i = mNumChildren;
    Drawable[] arrayOfDrawable = mDrawables;
    for (int j = 0; j < i; j++)
    {
      Drawable localDrawable = arrayOfDrawable[j];
      if (localDrawable != null) {
        localDrawable.mutate();
      }
    }
    mMutated = true;
  }
  
  public final void setConstantSize(boolean paramBoolean)
  {
    mConstantSize = paramBoolean;
  }
  
  public final void setEnterFadeDuration(int paramInt)
  {
    mEnterFadeDuration = paramInt;
  }
  
  public final void setExitFadeDuration(int paramInt)
  {
    mExitFadeDuration = paramInt;
  }
  
  public final boolean setLayoutDirection(int paramInt1, int paramInt2)
  {
    int i = mNumChildren;
    Drawable[] arrayOfDrawable = mDrawables;
    int j = 0;
    boolean bool2;
    for (boolean bool1 = false; j < i; bool1 = bool2)
    {
      Drawable localDrawable = arrayOfDrawable[j];
      bool2 = bool1;
      if (localDrawable != null)
      {
        boolean bool3 = DrawableCompat.setLayoutDirection(localDrawable, paramInt1);
        bool2 = bool1;
        if (j == paramInt2) {
          bool2 = bool3;
        }
      }
      j++;
    }
    mLayoutDirection = paramInt1;
    return bool1;
  }
  
  public final void setVariablePadding(boolean paramBoolean)
  {
    mVariablePadding = paramBoolean;
  }
  
  public final void updateDensity(Resources paramResources)
  {
    if (paramResources != null)
    {
      mSourceRes = paramResources;
      int i = DrawableContainer.resolveDensity(paramResources, mDensity);
      int j = mDensity;
      mDensity = i;
      if (j != i)
      {
        mCheckedConstantSize = false;
        mCheckedPadding = false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.DrawableContainer.DrawableContainerState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */