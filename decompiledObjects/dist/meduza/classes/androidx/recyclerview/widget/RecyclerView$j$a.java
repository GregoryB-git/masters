package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public final class RecyclerView$j$a
  implements p.b
{
  public RecyclerView$j$a(RecyclerView.j paramj) {}
  
  public final int a(View paramView)
  {
    RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
    a.getClass();
    return paramView.getLeft() - getLayoutParamsa.left - leftMargin;
  }
  
  public final int b()
  {
    return a.t();
  }
  
  public final int c()
  {
    RecyclerView.j localj = a;
    return f - localj.u();
  }
  
  public final View d(int paramInt)
  {
    return a.o(paramInt);
  }
  
  public final int e(View paramView)
  {
    RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
    a.getClass();
    return paramView.getRight() + getLayoutParamsa.right + rightMargin;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */