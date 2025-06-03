package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import androidx.annotation.Nullable;

public abstract interface TintableCompoundDrawablesView
{
  @Nullable
  public abstract ColorStateList getSupportCompoundDrawablesTintList();
  
  @Nullable
  public abstract PorterDuff.Mode getSupportCompoundDrawablesTintMode();
  
  public abstract void setSupportCompoundDrawablesTintList(@Nullable ColorStateList paramColorStateList);
  
  public abstract void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode paramMode);
}

/* Location:
 * Qualified Name:     androidx.core.widget.TintableCompoundDrawablesView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */