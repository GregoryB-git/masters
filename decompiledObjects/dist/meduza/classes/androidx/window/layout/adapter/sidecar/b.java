package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import ec.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import rb.h;
import sb.s;
import w.g;

public final class b
  implements j2.a
{
  public static volatile b c;
  public static final ReentrantLock d = new ReentrantLock();
  public a a;
  public final CopyOnWriteArrayList<b> b;
  
  public b(SidecarCompat paramSidecarCompat)
  {
    a = paramSidecarCompat;
    b = new CopyOnWriteArrayList();
    paramSidecarCompat = a;
    if (paramSidecarCompat != null) {
      paramSidecarCompat.c(new a());
    }
  }
  
  public final void a(Activity paramActivity, m1.b paramb, x0.k paramk)
  {
    i.e(paramActivity, "context");
    ReentrantLock localReentrantLock = d;
    localReentrantLock.lock();
    try
    {
      Object localObject1 = a;
      if (localObject1 == null)
      {
        paramActivity = new i2/k;
        paramActivity.<init>(s.a);
        paramk.accept(paramActivity);
        return;
      }
      Object localObject2 = b;
      boolean bool = localObject2 instanceof Collection;
      int i = 0;
      int j;
      if ((bool) && (((CopyOnWriteArrayList)localObject2).isEmpty()))
      {
        j = i;
      }
      else
      {
        localObject2 = ((CopyOnWriteArrayList)localObject2).iterator();
        do
        {
          j = i;
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
        } while (!i.a(nexta, paramActivity));
        j = 1;
      }
      localObject2 = new androidx/window/layout/adapter/sidecar/b$b;
      ((b)localObject2).<init>(paramActivity, paramb, paramk);
      b.add(localObject2);
      if (j == 0)
      {
        ((a)localObject1).a(paramActivity);
      }
      else
      {
        Iterator localIterator = b.iterator();
        do
        {
          bool = localIterator.hasNext();
          paramb = null;
          if (!bool) {
            break;
          }
          localObject1 = localIterator.next();
        } while (!i.a(paramActivity, a));
        paramActivity = (Activity)localObject1;
        break label225;
        paramActivity = null;
        label225:
        localObject1 = (b)paramActivity;
        paramActivity = paramb;
        if (localObject1 != null) {
          paramActivity = d;
        }
        if (paramActivity != null)
        {
          d = paramActivity;
          paramb = b;
          localObject1 = new w/g;
          ((g)localObject1).<init>(6, localObject2, paramActivity);
          paramb.execute((Runnable)localObject1);
        }
      }
      paramActivity = h.a;
      localReentrantLock.unlock();
      if (h.a == null) {
        paramk.accept(new i2.k(s.a));
      }
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final void b(d0.a<i2.k> parama)
  {
    i.e(parama, "callback");
    synchronized (d)
    {
      Object localObject1 = a;
      if (localObject1 == null) {
        return;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localObject1 = b.iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (b)((Iterator)localObject1).next();
        if (c == parama) {
          localArrayList.add(localObject2);
        }
      }
      b.removeAll(localArrayList);
      localObject1 = localArrayList.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        parama = nexta;
        localObject2 = b;
        boolean bool = localObject2 instanceof Collection;
        int i = 0;
        int j;
        if ((bool) && (((CopyOnWriteArrayList)localObject2).isEmpty()))
        {
          j = i;
        }
        else
        {
          localObject2 = ((CopyOnWriteArrayList)localObject2).iterator();
          do
          {
            j = i;
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
          } while (!i.a(nexta, parama));
          j = 1;
        }
        if (j == 0)
        {
          localObject2 = a;
          if (localObject2 != null) {
            ((a)localObject2).b(parama);
          }
        }
      }
      parama = h.a;
      return;
    }
  }
  
  public final class a
    implements a.a
  {
    public final void a(Activity paramActivity, i2.k paramk)
    {
      i.e(paramActivity, "activity");
      Iterator localIterator = a.b.iterator();
      while (localIterator.hasNext())
      {
        b.b localb = (b.b)localIterator.next();
        if (i.a(a, paramActivity))
        {
          d = paramk;
          b.execute(new g(6, localb, paramk));
        }
      }
    }
  }
  
  public static final class b
  {
    public final Activity a;
    public final Executor b;
    public final d0.a<i2.k> c;
    public i2.k d;
    
    public b(Activity paramActivity, m1.b paramb, x0.k paramk)
    {
      a = paramActivity;
      b = paramb;
      c = paramk;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.adapter.sidecar.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */