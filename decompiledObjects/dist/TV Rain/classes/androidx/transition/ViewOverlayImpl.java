package androidx.transition;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

abstract interface ViewOverlayImpl
{
  public abstract void add(@NonNull Drawable paramDrawable);
  
  public abstract void remove(@NonNull Drawable paramDrawable);
}

/* Location:
 * Qualified Name:     androidx.transition.ViewOverlayImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */