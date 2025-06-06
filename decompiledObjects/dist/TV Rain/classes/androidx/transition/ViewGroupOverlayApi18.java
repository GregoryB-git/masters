package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class ViewGroupOverlayApi18
  implements ViewGroupOverlayImpl
{
  private final ViewGroupOverlay mViewGroupOverlay;
  
  public ViewGroupOverlayApi18(@NonNull ViewGroup paramViewGroup)
  {
    mViewGroupOverlay = paramViewGroup.getOverlay();
  }
  
  public void add(@NonNull Drawable paramDrawable)
  {
    mViewGroupOverlay.add(paramDrawable);
  }
  
  public void add(@NonNull View paramView)
  {
    mViewGroupOverlay.add(paramView);
  }
  
  public void remove(@NonNull Drawable paramDrawable)
  {
    mViewGroupOverlay.remove(paramDrawable);
  }
  
  public void remove(@NonNull View paramView)
  {
    mViewGroupOverlay.remove(paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewGroupOverlayApi18
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */