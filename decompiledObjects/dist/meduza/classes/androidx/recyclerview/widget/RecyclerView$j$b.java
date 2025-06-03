package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public final class RecyclerView$j$b
  implements p.b
{
  public RecyclerView$j$b(RecyclerView.j paramj) {}
  
  public final int a(View paramView)
  {
    RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
    a.getClass();
    return paramView.getTop() - getLayoutParamsa.top - topMargin;
  }
  
  public final int b()
  {
    return a.v();
  }
  
  public final int c()
  {
    RecyclerView.j localj = a;
    return g - localj.s();
  }
  
  public final View d(int paramInt)
  {
    return a.o(paramInt);
  }
  
  public final int e(View paramView)
  {
    RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
    a.getClass();
    return paramView.getBottom() + getLayoutParamsa.bottom + bottomMargin;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */