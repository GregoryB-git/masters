package androidx.core.graphics.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract interface WrappedDrawable
{
  public abstract Drawable getWrappedDrawable();
  
  public abstract void setWrappedDrawable(Drawable paramDrawable);
}

/* Location:
 * Qualified Name:     androidx.core.graphics.drawable.WrappedDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */