package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

public final class StaggeredGridLayoutManager$f
{
  public ArrayList<View> a = new ArrayList();
  public int b = Integer.MIN_VALUE;
  public int c = Integer.MIN_VALUE;
  public final int d;
  
  public StaggeredGridLayoutManager$f(StaggeredGridLayoutManager paramStaggeredGridLayoutManager, int paramInt)
  {
    d = paramInt;
  }
  
  public static StaggeredGridLayoutManager.c d(View paramView)
  {
    return (StaggeredGridLayoutManager.c)paramView.getLayoutParams();
  }
  
  public final void a()
  {
    Object localObject = a;
    localObject = (View)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
    StaggeredGridLayoutManager.c localc = d((View)localObject);
    c = e.j.b((View)localObject);
    localc.getClass();
  }
  
  public final void b()
  {
    a.clear();
    b = Integer.MIN_VALUE;
    c = Integer.MIN_VALUE;
  }
  
  public final int c(int paramInt)
  {
    int i = c;
    if (i != Integer.MIN_VALUE) {
      return i;
    }
    if (a.size() == 0) {
      return paramInt;
    }
    a();
    return c;
  }
  
  public final int e(int paramInt)
  {
    int i = b;
    if (i != Integer.MIN_VALUE) {
      return i;
    }
    if (a.size() == 0) {
      return paramInt;
    }
    View localView = (View)a.get(0);
    StaggeredGridLayoutManager.c localc = d(localView);
    b = e.j.c(localView);
    localc.getClass();
    return b;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */