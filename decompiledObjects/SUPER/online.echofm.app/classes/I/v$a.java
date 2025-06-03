package I;

import android.view.ViewGroup;

public abstract class v$a
{
  public static int a(ViewGroup paramViewGroup)
  {
    return paramViewGroup.getNestedScrollAxes();
  }
  
  public static boolean b(ViewGroup paramViewGroup)
  {
    return paramViewGroup.isTransitionGroup();
  }
  
  public static void c(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    paramViewGroup.setTransitionGroup(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     I.v.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */