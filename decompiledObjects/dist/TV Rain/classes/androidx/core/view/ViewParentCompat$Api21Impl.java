package androidx.core.view;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class ViewParentCompat$Api21Impl
{
  @DoNotInline
  public static boolean onNestedFling(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
  }
  
  @DoNotInline
  public static boolean onNestedPreFling(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    return paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
  }
  
  @DoNotInline
  public static void onNestedPreScroll(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
  }
  
  @DoNotInline
  public static void onNestedScroll(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  @DoNotInline
  public static void onNestedScrollAccepted(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt);
  }
  
  @DoNotInline
  public static boolean onStartNestedScroll(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    return paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
  }
  
  @DoNotInline
  public static void onStopNestedScroll(ViewParent paramViewParent, View paramView)
  {
    paramViewParent.onStopNestedScroll(paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewParentCompat.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */