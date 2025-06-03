package androidx.core.view;

import android.view.ViewGroup;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class ViewGroupCompat$Api21Impl
{
  @DoNotInline
  public static int getNestedScrollAxes(ViewGroup paramViewGroup)
  {
    return paramViewGroup.getNestedScrollAxes();
  }
  
  @DoNotInline
  public static boolean isTransitionGroup(ViewGroup paramViewGroup)
  {
    return paramViewGroup.isTransitionGroup();
  }
  
  @DoNotInline
  public static void setTransitionGroup(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    paramViewGroup.setTransitionGroup(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewGroupCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */