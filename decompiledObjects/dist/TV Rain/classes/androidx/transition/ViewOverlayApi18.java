package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
class ViewOverlayApi18
  implements ViewOverlayImpl
{
  private final ViewOverlay mViewOverlay;
  
  public ViewOverlayApi18(@NonNull View paramView)
  {
    mViewOverlay = paramView.getOverlay();
  }
  
  public void add(@NonNull Drawable paramDrawable)
  {
    mViewOverlay.add(paramDrawable);
  }
  
  public void remove(@NonNull Drawable paramDrawable)
  {
    mViewOverlay.remove(paramDrawable);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewOverlayApi18
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */