package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class WrappedDrawableState
  extends Drawable.ConstantState
{
  public int mChangingConfigurations;
  public Drawable.ConstantState mDrawableState;
  public ColorStateList mTint = null;
  public PorterDuff.Mode mTintMode = WrappedDrawableApi14.DEFAULT_TINT_MODE;
  
  public WrappedDrawableState(@Nullable WrappedDrawableState paramWrappedDrawableState)
  {
    if (paramWrappedDrawableState != null)
    {
      mChangingConfigurations = mChangingConfigurations;
      mDrawableState = mDrawableState;
      mTint = mTint;
      mTintMode = mTintMode;
    }
  }
  
  public boolean canConstantState()
  {
    boolean bool;
    if (mDrawableState != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int getChangingConfigurations()
  {
    int i = mChangingConfigurations;
    Drawable.ConstantState localConstantState = mDrawableState;
    int j;
    if (localConstantState != null) {
      j = localConstantState.getChangingConfigurations();
    } else {
      j = 0;
    }
    return i | j;
  }
  
  @NonNull
  public Drawable newDrawable()
  {
    return newDrawable(null);
  }
  
  @NonNull
  public Drawable newDrawable(@Nullable Resources paramResources)
  {
    return new WrappedDrawableApi21(this, paramResources);
  }
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.WrappedDrawableState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */