package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class AppCompatImageHelper
{
  private TintInfo mImageTint;
  private TintInfo mInternalImageTint;
  private int mLevel = 0;
  private TintInfo mTmpInfo;
  @NonNull
  private final ImageView mView;
  
  public AppCompatImageHelper(@NonNull ImageView paramImageView)
  {
    mView = paramImageView;
  }
  
  private boolean applyFrameworkTintUsingColorFilter(@NonNull Drawable paramDrawable)
  {
    if (mTmpInfo == null) {
      mTmpInfo = new TintInfo();
    }
    TintInfo localTintInfo = mTmpInfo;
    localTintInfo.clear();
    Object localObject = ImageViewCompat.getImageTintList(mView);
    if (localObject != null)
    {
      mHasTintList = true;
      mTintList = ((ColorStateList)localObject);
    }
    localObject = ImageViewCompat.getImageTintMode(mView);
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
    if (mInternalImageTint != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void applyImageLevel()
  {
    if (mView.getDrawable() != null) {
      mView.getDrawable().setLevel(mLevel);
    }
  }
  
  public void applySupportImageTint()
  {
    Drawable localDrawable = mView.getDrawable();
    if (localDrawable != null) {
      DrawableUtils.fixDrawable(localDrawable);
    }
    if (localDrawable != null)
    {
      if ((shouldApplyFrameworkTintUsingColorFilter()) && (applyFrameworkTintUsingColorFilter(localDrawable))) {
        return;
      }
      TintInfo localTintInfo = mImageTint;
      if (localTintInfo != null)
      {
        AppCompatDrawableManager.tintDrawable(localDrawable, localTintInfo, mView.getDrawableState());
      }
      else
      {
        localTintInfo = mInternalImageTint;
        if (localTintInfo != null) {
          AppCompatDrawableManager.tintDrawable(localDrawable, localTintInfo, mView.getDrawableState());
        }
      }
    }
  }
  
  public ColorStateList getSupportImageTintList()
  {
    Object localObject = mImageTint;
    if (localObject != null) {
      localObject = mTintList;
    } else {
      localObject = null;
    }
    return (ColorStateList)localObject;
  }
  
  public PorterDuff.Mode getSupportImageTintMode()
  {
    Object localObject = mImageTint;
    if (localObject != null) {
      localObject = mTintMode;
    } else {
      localObject = null;
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public boolean hasOverlappingRendering()
  {
    return !(mView.getBackground() instanceof RippleDrawable);
  }
  
  public void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = mView.getContext();
    Object localObject2 = R.styleable.AppCompatImageView;
    localObject1 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt, 0);
    ImageView localImageView = mView;
    ViewCompat.saveAttributeDataForStyleable(localImageView, localImageView.getContext(), (int[])localObject2, paramAttributeSet, ((TintTypedArray)localObject1).getWrappedTypeArray(), paramInt, 0);
    try
    {
      localObject2 = mView.getDrawable();
      paramAttributeSet = (AttributeSet)localObject2;
      if (localObject2 == null)
      {
        paramInt = ((TintTypedArray)localObject1).getResourceId(R.styleable.AppCompatImageView_srcCompat, -1);
        paramAttributeSet = (AttributeSet)localObject2;
        if (paramInt != -1)
        {
          localObject2 = AppCompatResources.getDrawable(mView.getContext(), paramInt);
          paramAttributeSet = (AttributeSet)localObject2;
          if (localObject2 != null)
          {
            mView.setImageDrawable((Drawable)localObject2);
            paramAttributeSet = (AttributeSet)localObject2;
          }
        }
      }
      if (paramAttributeSet != null) {
        DrawableUtils.fixDrawable(paramAttributeSet);
      }
      paramInt = R.styleable.AppCompatImageView_tint;
      if (((TintTypedArray)localObject1).hasValue(paramInt)) {
        ImageViewCompat.setImageTintList(mView, ((TintTypedArray)localObject1).getColorStateList(paramInt));
      }
      paramInt = R.styleable.AppCompatImageView_tintMode;
      if (((TintTypedArray)localObject1).hasValue(paramInt)) {
        ImageViewCompat.setImageTintMode(mView, DrawableUtils.parseTintMode(((TintTypedArray)localObject1).getInt(paramInt, -1), null));
      }
      return;
    }
    finally
    {
      ((TintTypedArray)localObject1).recycle();
    }
  }
  
  public void obtainLevelFromDrawable(@NonNull Drawable paramDrawable)
  {
    mLevel = paramDrawable.getLevel();
  }
  
  public void setImageResource(int paramInt)
  {
    if (paramInt != 0)
    {
      Drawable localDrawable = AppCompatResources.getDrawable(mView.getContext(), paramInt);
      if (localDrawable != null) {
        DrawableUtils.fixDrawable(localDrawable);
      }
      mView.setImageDrawable(localDrawable);
    }
    else
    {
      mView.setImageDrawable(null);
    }
    applySupportImageTint();
  }
  
  public void setInternalImageTint(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      if (mInternalImageTint == null) {
        mInternalImageTint = new TintInfo();
      }
      TintInfo localTintInfo = mInternalImageTint;
      mTintList = paramColorStateList;
      mHasTintList = true;
    }
    else
    {
      mInternalImageTint = null;
    }
    applySupportImageTint();
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList)
  {
    if (mImageTint == null) {
      mImageTint = new TintInfo();
    }
    TintInfo localTintInfo = mImageTint;
    mTintList = paramColorStateList;
    mHasTintList = true;
    applySupportImageTint();
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode)
  {
    if (mImageTint == null) {
      mImageTint = new TintInfo();
    }
    TintInfo localTintInfo = mImageTint;
    mTintMode = paramMode;
    mHasTintMode = true;
    applySupportImageTint();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatImageHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */