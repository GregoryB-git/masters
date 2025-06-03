package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract interface ResourceManagerInternal$ResourceManagerHooks
{
  @Nullable
  public abstract Drawable createDrawableFor(@NonNull ResourceManagerInternal paramResourceManagerInternal, @NonNull Context paramContext, @DrawableRes int paramInt);
  
  @Nullable
  public abstract ColorStateList getTintListForDrawableRes(@NonNull Context paramContext, @DrawableRes int paramInt);
  
  @Nullable
  public abstract PorterDuff.Mode getTintModeForDrawableRes(int paramInt);
  
  public abstract boolean tintDrawable(@NonNull Context paramContext, @DrawableRes int paramInt, @NonNull Drawable paramDrawable);
  
  public abstract boolean tintDrawableUsingColorFilter(@NonNull Context paramContext, @DrawableRes int paramInt, @NonNull Drawable paramDrawable);
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */