package j;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import e0.o0;
import e0.p0;
import e0.q0;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;

public final class g
{
  public final ArrayList<o0> a = new ArrayList();
  public long b = -1L;
  public Interpolator c;
  public p0 d;
  public boolean e;
  public final a f = new a();
  
  public final void a()
  {
    if (!e) {
      return;
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      ((o0)localIterator.next()).b();
    }
    e = false;
  }
  
  public final void b()
  {
    if (e) {
      return;
    }
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      o0 localo0 = (o0)localIterator.next();
      long l = b;
      if (l >= 0L) {
        localo0.c(l);
      }
      Object localObject = c;
      if (localObject != null)
      {
        View localView = (View)a.get();
        if (localView != null) {
          localView.animate().setInterpolator((TimeInterpolator)localObject);
        }
      }
      if (d != null) {
        localo0.d(f);
      }
      localObject = (View)a.get();
      if (localObject != null) {
        ((View)localObject).animate().start();
      }
    }
    e = true;
  }
  
  public final class a
    extends q0
  {
    public boolean b = false;
    public int c = 0;
    
    public a()
    {
      super();
    }
    
    public final void b()
    {
      if (b) {
        return;
      }
      b = true;
      p0 localp0 = d;
      if (localp0 != null) {
        localp0.b();
      }
    }
    
    public final void c()
    {
      int i = c + 1;
      c = i;
      if (i == a.size())
      {
        p0 localp0 = d;
        if (localp0 != null) {
          localp0.c();
        }
        c = 0;
        b = false;
        e = false;
      }
    }
  }
}

/* Location:
 * Qualified Name:     j.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */