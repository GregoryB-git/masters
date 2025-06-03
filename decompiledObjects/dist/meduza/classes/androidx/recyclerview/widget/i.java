package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public final class i
  extends j
{
  public i(RecyclerView.j paramj)
  {
    super(paramj);
  }
  
  public final int b(View paramView)
  {
    RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
    a.getClass();
    return paramView.getBottom() + getLayoutParamsa.bottom + bottomMargin;
  }
  
  public final int c(View paramView)
  {
    RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
    a.getClass();
    return paramView.getTop() - getLayoutParamsa.top - topMargin;
  }
  
  public final int d()
  {
    RecyclerView.j localj = a;
    return g - localj.s();
  }
  
  public final int e()
  {
    return a.v();
  }
  
  public final int f()
  {
    RecyclerView.j localj = a;
    return g - localj.v() - a.s();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */