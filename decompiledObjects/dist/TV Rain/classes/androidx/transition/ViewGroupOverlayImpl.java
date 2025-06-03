package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;

abstract interface ViewGroupOverlayImpl
  extends ViewOverlayImpl
{
  public abstract void add(@NonNull View paramView);
  
  public abstract void remove(@NonNull View paramView);
}

/* Location:
 * Qualified Name:     androidx.transition.ViewGroupOverlayImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */