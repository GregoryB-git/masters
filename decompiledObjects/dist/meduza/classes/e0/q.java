package e0;

import android.view.View;

public abstract interface q
{
  public abstract void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3);
  
  public abstract void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public abstract void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt1, int paramInt2);
  
  public abstract boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt1, int paramInt2);
  
  public abstract void onStopNestedScroll(View paramView, int paramInt);
}

/* Location:
 * Qualified Name:     e0.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */