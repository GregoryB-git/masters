package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CompoundButtonCompat;

class AppCompatCompoundButtonHelper
{
  private ColorStateList mButtonTintList = null;
  private PorterDuff.Mode mButtonTintMode = null;
  private boolean mHasButtonTint = false;
  private boolean mHasButtonTintMode = false;
  private boolean mSkipNextApply;
  @NonNull
  private final CompoundButton mView;
  
  public AppCompatCompoundButtonHelper(@NonNull CompoundButton paramCompoundButton)
  {
    mView = paramCompoundButton;
  }
  
  public void applyButtonTint()
  {
    Drawable localDrawable = CompoundButtonCompat.getButtonDrawable(mView);
    if ((localDrawable != null) && ((mHasButtonTint) || (mHasButtonTintMode)))
    {
      localDrawable = DrawableCompat.wrap(localDrawable).mutate();
      if (mHasButtonTint) {
        DrawableCompat.setTintList(localDrawable, mButtonTintList);
      }
      if (mHasButtonTintMode) {
        DrawableCompat.setTintMode(localDrawable, mButtonTintMode);
      }
      if (localDrawable.isStateful()) {
        localDrawable.setState(mView.getDrawableState());
      }
      mView.setButtonDrawable(localDrawable);
    }
  }
  
  public int getCompoundPaddingLeft(int paramInt)
  {
    return paramInt;
  }
  
  public ColorStateList getSupportButtonTintList()
  {
    return mButtonTintList;
  }
  
  public PorterDuff.Mode getSupportButtonTintMode()
  {
    return mButtonTintMode;
  }
  
  public void loadFromAttributes(@Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    localObject = mView.getContext();
    int[] arrayOfInt = R.styleable.CompoundButton;
    localObject = TintTypedArray.obtainStyledAttributes((Context)localObject, paramAttributeSet, arrayOfInt, paramInt, 0);
    CompoundButton localCompoundButton = mView;
    ViewCompat.saveAttributeDataForStyleable(localCompoundButton, localCompoundButton.getContext(), arrayOfInt, paramAttributeSet, ((TintTypedArray)localObject).getWrappedTypeArray(), paramInt, 0);
    for (;;)
    {
      try
      {
        paramInt = R.styleable.CompoundButton_buttonCompat;
        if (((TintTypedArray)localObject).hasValue(paramInt))
        {
          paramInt = ((TintTypedArray)localObject).getResourceId(paramInt, 0);
          if (paramInt == 0) {}
        }
      }
      finally
      {
        ((TintTypedArray)localObject).recycle();
      }
      try
      {
        paramAttributeSet = mView;
        paramAttributeSet.setButtonDrawable(AppCompatResources.getDrawable(paramAttributeSet.getContext(), paramInt));
        paramInt = 1;
      }
      catch (Resources.NotFoundException paramAttributeSet) {}
    }
    paramInt = 0;
    if (paramInt == 0)
    {
      paramInt = R.styleable.CompoundButton_android_button;
      if (((TintTypedArray)localObject).hasValue(paramInt))
      {
        paramInt = ((TintTypedArray)localObject).getResourceId(paramInt, 0);
        if (paramInt != 0)
        {
          paramAttributeSet = mView;
          paramAttributeSet.setButtonDrawable(AppCompatResources.getDrawable(paramAttributeSet.getContext(), paramInt));
        }
      }
    }
    paramInt = R.styleable.CompoundButton_buttonTint;
    if (((TintTypedArray)localObject).hasValue(paramInt)) {
      CompoundButtonCompat.setButtonTintList(mView, ((TintTypedArray)localObject).getColorStateList(paramInt));
    }
    paramInt = R.styleable.CompoundButton_buttonTintMode;
    if (((TintTypedArray)localObject).hasValue(paramInt)) {
      CompoundButtonCompat.setButtonTintMode(mView, DrawableUtils.parseTintMode(((TintTypedArray)localObject).getInt(paramInt, -1), null));
    }
    ((TintTypedArray)localObject).recycle();
  }
  
  public void onSetButtonDrawable()
  {
    if (mSkipNextApply)
    {
      mSkipNextApply = false;
      return;
    }
    mSkipNextApply = true;
    applyButtonTint();
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    mButtonTintList = paramColorStateList;
    mHasButtonTint = true;
    applyButtonTint();
  }
  
  public void setSupportButtonTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    mButtonTintMode = paramMode;
    mHasButtonTintMode = true;
    applyButtonTint();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatCompoundButtonHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */