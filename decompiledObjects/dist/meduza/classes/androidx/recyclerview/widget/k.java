package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

public final class k
  implements b.b
{
  public k(RecyclerView paramRecyclerView) {}
  
  public final int a()
  {
    return a.getChildCount();
  }
  
  public final void b(int paramInt)
  {
    View localView = a.getChildAt(paramInt);
    if (localView != null)
    {
      a.getClass();
      RecyclerView.p(localView);
      localView.clearAnimation();
    }
    a.removeViewAt(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */