package e0;

import android.view.View;
import android.view.ViewParent;

public final class l0
{
  public static boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
  }
  
  public static boolean b(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    return paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
  }
  
  public static void c(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
  }
  
  public static void d(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void e(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt);
  }
  
  public static boolean f(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    return paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
  }
  
  public static void g(ViewParent paramViewParent, View paramView)
  {
    paramViewParent.onStopNestedScroll(paramView);
  }
}

/* Location:
 * Qualified Name:     e0.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */