package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.core.view.ViewCompat;

class AppCompatBackgroundHelper
{
  private int mBackgroundResId = -1;
  private TintInfo mBackgroundTint;
  private final AppCompatDrawableManager mDrawableManager;
  private TintInfo mInternalBackgroundTint;
  private TintInfo mTmpInfo;
  @NonNull
  private final View mView;
  
  public AppCompatBackgroundHelper(@NonNull View paramView)
  {
    mView = paramView;
    mDrawableManager = AppCompatDrawableManager.get();
  }
  
  private boolean applyFrameworkTintUsingColorFilter(@NonNull Drawable paramDrawable)
  {
    if (mTmpInfo == null) {
      mTmpInfo = new TintInfo();
    }
    TintInfo localTintInfo = mTmpInfo;
    localTintInfo.clear();
    Object localObject = ViewCompat.getBackgroundTintList(mView);
    if (localObject != null)
    {
      mHasTintList = true;
      mTintList = ((ColorStateList)localObject);
    }
    localObject = ViewCompat.getBackgroundTintMode(mView);
    if (localObject != null)
    {
      mHasTintMode = true;
      mTintMode = ((PorterDuff.Mode)localObject);
    }
    if ((!mHasTintList) && (!mHasTintMode)) {
      return false;
    }
    AppCompatDrawableManager.tintDrawable(paramDrawable, localTintInfo, mView.getDrawableState());
    return true;
  }
  
  private boolean shouldApplyFrameworkTintUsingColorFilter()
  {
    boolean bool;
    if (mInternalBackgroundTint != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void applySupportBackgroundTint()
  {
    Drawable localDrawable = mView.getBackground();
    if (localDrawable != null)
    {
      if ((shouldApplyFrameworkTintUsingColorFilter()) && (applyFrameworkTintUsingColorFilter(localDrawable))) {
        return;
      }
      TintInfo localTintInfo = mBackgroundTint;
      if (localTintInfo != null)
      {
        AppCompatDrawableManager.tintDrawable(localDrawable, localTintInfo, mView.getDrawableState());
      }
      else
      {
        localTintInfo = mInternalBackgroundTint;
        if (localTintInfo != null) {
          AppCompatDrawableManager.tintDrawable(localDrawable, localTintInfo, mView.getDrawableState());
        }
      }
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    Object localObject = mBackgroundTint;
    if (localObject != null) {
      localObject = mTintList;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    Object localObject = mBackgroundTint;
    if (localObject != null) {
      localObject = mTintMode;
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public void loadFromAttributes(@Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject = mView.getContext();
    int[] arrayOfInt = R.styleable.ViewBackgroundHelper;
    localObject = TintTypedArray.obtainStyledAttributes((Context)localObject, paramAttributeSet, arrayOfInt, paramInt, 0);
    View localView = mView;
    ViewCompat.saveAttributeDataForStyleable(localView, localView.getContext(), arrayOfInt, paramAttributeSet, ((TintTypedArray)localObject).getWrappedTypeArray(), paramInt, 0);
    try
    {
      paramInt = R.styleable.ViewBackgroundHelper_android_background;
      if (((TintTypedArray)localObject).hasValue(paramInt))
      {
        mBackgroundResId = ((TintTypedArray)localObject).getResourceId(paramInt, -1);
        paramAttributeSet = mDrawableManager.getTintList(mView.getContext(), mBackgroundResId);
        if (paramAttributeSet != null) {
          setInternalBackgroundTint(paramAttributeSet);
        }
      }
      paramInt = R.styleable.ViewBackgroundHelper_backgroundTint;
      if (((TintTypedArray)localObject).hasValue(paramInt)) {
        ViewCompat.setBackgroundTintList(mView, ((TintTypedArray)localObject).getColorStateList(paramInt));
      }
      paramInt = R.styleable.ViewBackgroundHelper_backgroundTintMode;
      if (((TintTypedArray)localObject).hasValue(paramInt)) {
        ViewCompat.setBackgroundTintMode(mView, DrawableUtils.parseTintMode(((TintTypedArray)localObject).getInt(paramInt, -1), null));
      }
      return;
    }
    finally
    {
      ((TintTypedArray)localObject).recycle();
    }
  }
  
  public void onSetBackgroundDrawable(Drawable paramDrawable)
  {
    mBackgroundResId = -1;
    setInternalBackgroundTint(null);
    applySupportBackgroundTint();
  }
  
  public void onSetBackgroundResource(int paramInt)
  {
    mBackgroundResId = paramInt;
    Object localObject = mDrawableManager;
    if (localObject != null) {
      localObject = ((AppCompatDrawableManager)localObject).getTintList(mView.getContext(), paramInt);
    } else {
      localObject = null;
    }
    setInternalBackgroundTint((ColorStateList)localObject);
    applySupportBackgroundTint();
  }
  
  public void setInternalBackgroundTint(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (mInternalBackgroundTint == null) {
        mInternalBackgroundTint = new TintInfo();
      }
      TintInfo localTintInfo = mInternalBackgroundTint;
      mTintList = paramColorStateList;
      mHasTintList = true;
    }
    else
    {
      mInternalBackgroundTint = null;
    }
    applySupportBackgroundTint();
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    if (mBackgroundTint == null) {
      mBackgroundTint = new TintInfo();
    }
    TintInfo localTintInfo = mBackgroundTint;
    mTintList = paramColorStateList;
    mHasTintList = true;
    applySupportBackgroundTint();
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    if (mBackgroundTint == null) {
      mBackgroundTint = new TintInfo();
    }
    TintInfo localTintInfo = mBackgroundTint;
    mTintMode = paramMode;
    mHasTintMode = true;
    applySupportBackgroundTint();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatBackgroundHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */