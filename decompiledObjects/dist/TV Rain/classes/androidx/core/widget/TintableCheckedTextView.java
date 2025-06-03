package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract interface TintableCheckedTextView
{
  @Nullable
  public abstract ColorStateList getSupportCheckMarkTintList();
  
  @Nullable
  public abstract PorterDuff.Mode getSupportCheckMarkTintMode();
  
  public abstract void setSupportCheckMarkTintList(@Nullable ColorStateList paramColorStateList);
  
  public abstract void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode paramMode);
}

/* Location:
 * Qualified Name:     androidx.core.widget.TintableCheckedTextView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */