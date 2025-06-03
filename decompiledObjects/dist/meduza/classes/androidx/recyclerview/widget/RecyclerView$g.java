package androidx.recyclerview.widget;

import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class RecyclerView$g
{
  public b a = null;
  public ArrayList<a> b = new ArrayList();
  public long c = 250L;
  public long d = 250L;
  
  public final void a(RecyclerView.v paramv)
  {
    Object localObject = a;
    if (localObject != null)
    {
      RecyclerView.h localh = (RecyclerView.h)localObject;
      int i = 1;
      paramv.h(true);
      if (e != null) {
        e = null;
      }
      int j;
      if ((f & 0x10) != 0) {
        j = 1;
      } else {
        j = 0;
      }
      if (j == 0)
      {
        RecyclerView localRecyclerView = a;
        localRecyclerView.y();
        localObject = d;
        j = a).a.indexOfChild(null);
        if (j == -1)
        {
          ((b)localObject).f(null);
          j = i;
        }
        else if (b.c(j))
        {
          b.d(j);
          ((b)localObject).f(null);
          ((k)a).b(j);
          j = i;
        }
        else
        {
          j = 0;
        }
        if (j == 0)
        {
          localRecyclerView.z(j ^ 0x1);
          if ((j == 0) && (paramv.g())) {
            a.removeDetachedView(null, false);
          }
        }
        else
        {
          RecyclerView.p(null);
          a.f(null);
          throw null;
        }
      }
    }
  }
  
  public final void b()
  {
    int i = b.size();
    for (int j = 0; j < i; j++) {
      ((a)b.get(j)).a();
    }
    b.clear();
  }
  
  public abstract void c();
  
  public abstract boolean d();
  
  public static abstract interface a
  {
    public abstract void a();
  }
  
  public static abstract interface b {}
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */