package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

class RecyclerView$LayoutManager$1
  implements ViewBoundsCheck.Callback
{
  public RecyclerView$LayoutManager$1(RecyclerView.LayoutManager paramLayoutManager) {}
  
  public View getChildAt(int paramInt)
  {
    return this$0.getChildAt(paramInt);
  }
  
  public int getChildEnd(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return this$0.getDecoratedRight(paramView) + rightMargin;
  }
  
  public int getChildStart(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return this$0.getDecoratedLeft(paramView) - leftMargin;
  }
  
  public int getParentEnd()
  {
    return this$0.getWidth() - this$0.getPaddingRight();
  }
  
  public int getParentStart()
  {
    return this$0.getPaddingLeft();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.LayoutManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */