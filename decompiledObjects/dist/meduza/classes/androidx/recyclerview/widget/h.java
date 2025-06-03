package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

public final class h
  extends j
{
  public h(RecyclerView.j paramj)
  {
    super(paramj);
  }
  
  public final int b(View paramView)
  {
    RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
    a.getClass();
    return paramView.getRight() + getLayoutParamsa.right + rightMargin;
  }
  
  public final int c(View paramView)
  {
    RecyclerView.k localk = (RecyclerView.k)paramView.getLayoutParams();
    a.getClass();
    return paramView.getLeft() - getLayoutParamsa.left - leftMargin;
  }
  
  public final int d()
  {
    RecyclerView.j localj = a;
    return f - localj.u();
  }
  
  public final int e()
  {
    return a.t();
  }
  
  public final int f()
  {
    RecyclerView.j localj = a;
    return f - localj.t() - a.u();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */