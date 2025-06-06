package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

class ViewGroupOverlayApi14
  extends ViewOverlayApi14
  implements ViewGroupOverlayImpl
{
  public ViewGroupOverlayApi14(Context paramContext, ViewGroup paramViewGroup, View paramView)
  {
    super(paramContext, paramViewGroup, paramView);
  }
  
  public static ViewGroupOverlayApi14 createFrom(ViewGroup paramViewGroup)
  {
    return (ViewGroupOverlayApi14)ViewOverlayApi14.createFrom(paramViewGroup);
  }
  
  public void add(@NonNull View paramView)
  {
    mOverlayViewGroup.add(paramView);
  }
  
  public void remove(@NonNull View paramView)
  {
    mOverlayViewGroup.remove(paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ViewGroupOverlayApi14
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */