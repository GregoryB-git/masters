package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract interface TintableImageSourceView
{
  @Nullable
  public abstract ColorStateList getSupportImageTintList();
  
  @Nullable
  public abstract PorterDuff.Mode getSupportImageTintMode();
  
  public abstract void setSupportImageTintList(@Nullable ColorStateList paramColorStateList);
  
  public abstract void setSupportImageTintMode(@Nullable PorterDuff.Mode paramMode);
}

/* Location:
 * Qualified Name:     androidx.core.widget.TintableImageSourceView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */