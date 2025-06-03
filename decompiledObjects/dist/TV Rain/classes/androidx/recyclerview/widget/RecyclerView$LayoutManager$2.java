package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

class RecyclerView$LayoutManager$2
  implements ViewBoundsCheck.Callback
{
  public RecyclerView$LayoutManager$2(RecyclerView.LayoutManager paramLayoutManager) {}
  
  public View getChildAt(int paramInt)
  {
    return this$0.getChildAt(paramInt);
  }
  
  public int getChildEnd(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return this$0.getDecoratedBottom(paramView) + bottomMargin;
  }
  
  public int getChildStart(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return this$0.getDecoratedTop(paramView) - topMargin;
  }
  
  public int getParentEnd()
  {
    return this$0.getHeight() - this$0.getPaddingBottom();
  }
  
  public int getParentStart()
  {
    return this$0.getPaddingTop();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.LayoutManager.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */