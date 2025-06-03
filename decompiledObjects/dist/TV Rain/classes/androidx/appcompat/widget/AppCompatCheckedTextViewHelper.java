package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CheckedTextViewCompat;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
class AppCompatCheckedTextViewHelper
{
  private ColorStateList mCheckMarkTintList = null;
  private PorterDuff.Mode mCheckMarkTintMode = null;
  private boolean mHasCheckMarkTint = false;
  private boolean mHasCheckMarkTintMode = false;
  private boolean mSkipNextApply;
  @NonNull
  private final CheckedTextView mView;
  
  public AppCompatCheckedTextViewHelper(@NonNull CheckedTextView paramCheckedTextView)
  {
    mView = paramCheckedTextView;
  }
  
  public void applyCheckMarkTint()
  {
    Drawable localDrawable = CheckedTextViewCompat.getCheckMarkDrawable(mView);
    if ((localDrawable != null) && ((mHasCheckMarkTint) || (mHasCheckMarkTintMode)))
    {
      localDrawable = DrawableCompat.wrap(localDrawable).mutate();
      if (mHasCheckMarkTint) {
        DrawableCompat.setTintList(localDrawable, mCheckMarkTintList);
      }
      if (mHasCheckMarkTintMode) {
        DrawableCompat.setTintMode(localDrawable, mCheckMarkTintMode);
      }
      if (localDrawable.isStateful()) {
        localDrawable.setState(mView.getDrawableState());
      }
      mView.setCheckMarkDrawable(localDrawable);
    }
  }
  
  public ColorStateList getSupportCheckMarkTintList()
  {
    return mCheckMarkTintList;
  }
  
  public PorterDuff.Mode getSupportCheckMarkTintMode()
  {
    return mCheckMarkTintMode;
  }
  
  public void loadFromAttributes(@Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    localObject = mView.getContext();
    int[] arrayOfInt = R.styleable.CheckedTextView;
    localObject = TintTypedArray.obtainStyledAttributes((Context)localObject, paramAttributeSet, arrayOfInt, paramInt, 0);
    CheckedTextView localCheckedTextView = mView;
    ViewCompat.saveAttributeDataForStyleable(localCheckedTextView, localCheckedTextView.getContext(), arrayOfInt, paramAttributeSet, ((TintTypedArray)localObject).getWrappedTypeArray(), paramInt, 0);
    for (;;)
    {
      try
      {
        paramInt = R.styleable.CheckedTextView_checkMarkCompat;
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
        paramAttributeSet.setCheckMarkDrawable(AppCompatResources.getDrawable(paramAttributeSet.getContext(), paramInt));
        paramInt = 1;
      }
      catch (Resources.NotFoundException paramAttributeSet) {}
    }
    paramInt = 0;
    if (paramInt == 0)
    {
      paramInt = R.styleable.CheckedTextView_android_checkMark;
      if (((TintTypedArray)localObject).hasValue(paramInt))
      {
        paramInt = ((TintTypedArray)localObject).getResourceId(paramInt, 0);
        if (paramInt != 0)
        {
          paramAttributeSet = mView;
          paramAttributeSet.setCheckMarkDrawable(AppCompatResources.getDrawable(paramAttributeSet.getContext(), paramInt));
        }
      }
    }
    paramInt = R.styleable.CheckedTextView_checkMarkTint;
    if (((TintTypedArray)localObject).hasValue(paramInt)) {
      CheckedTextViewCompat.setCheckMarkTintList(mView, ((TintTypedArray)localObject).getColorStateList(paramInt));
    }
    paramInt = R.styleable.CheckedTextView_checkMarkTintMode;
    if (((TintTypedArray)localObject).hasValue(paramInt)) {
      CheckedTextViewCompat.setCheckMarkTintMode(mView, DrawableUtils.parseTintMode(((TintTypedArray)localObject).getInt(paramInt, -1), null));
    }
    ((TintTypedArray)localObject).recycle();
  }
  
  public void onSetCheckMarkDrawable()
  {
    if (mSkipNextApply)
    {
      mSkipNextApply = false;
      return;
    }
    mSkipNextApply = true;
    applyCheckMarkTint();
  }
  
  public void setSupportCheckMarkTintList(ColorStateList paramColorStateList)
  {
    mCheckMarkTintList = paramColorStateList;
    mHasCheckMarkTint = true;
    applyCheckMarkTint();
  }
  
  public void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    mCheckMarkTintMode = paramMode;
    mHasCheckMarkTintMode = true;
    applyCheckMarkTint();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatCheckedTextViewHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */