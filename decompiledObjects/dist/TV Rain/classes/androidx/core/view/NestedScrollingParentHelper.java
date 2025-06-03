package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

public class NestedScrollingParentHelper
{
  private int mNestedScrollAxesNonTouch;
  private int mNestedScrollAxesTouch;
  
  public NestedScrollingParentHelper(@NonNull ViewGroup paramViewGroup) {}
  
  public int getNestedScrollAxes()
  {
    return mNestedScrollAxesTouch | mNestedScrollAxesNonTouch;
  }
  
  public void onNestedScrollAccepted(@NonNull View paramView1, @NonNull View paramView2, int paramInt)
  {
    onNestedScrollAccepted(paramView1, paramView2, paramInt, 0);
  }
  
  public void onNestedScrollAccepted(@NonNull View paramView1, @NonNull View paramView2, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 1) {
      mNestedScrollAxesNonTouch = paramInt1;
    } else {
      mNestedScrollAxesTouch = paramInt1;
    }
  }
  
  public void onStopNestedScroll(@NonNull View paramView)
  {
    onStopNestedScroll(paramView, 0);
  }
  
  public void onStopNestedScroll(@NonNull View paramView, int paramInt)
  {
    if (paramInt == 1) {
      mNestedScrollAxesNonTouch = 0;
    } else {
      mNestedScrollAxesTouch = 0;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.NestedScrollingParentHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */