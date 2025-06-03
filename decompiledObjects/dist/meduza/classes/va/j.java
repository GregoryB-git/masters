package va;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public final class j
  implements i
{
  public final String a = "Sqflite";
  public final int b;
  public final int c;
  public final LinkedList<f> d = new LinkedList();
  public final HashSet e = new HashSet();
  public final HashSet f = new HashSet();
  public final HashMap g = new HashMap();
  
  public j(int paramInt1, int paramInt2)
  {
    b = paramInt1;
    c = paramInt2;
  }
  
  public final void a(d paramd, Runnable paramRunnable)
  {
    if (paramd == null) {
      paramd = null;
    } else {
      paramd = new h(paramd);
    }
    d(new f(paramd, paramRunnable));
  }
  
  public final void b()
  {
    try
    {
      Object localObject1 = e.iterator();
      while (((Iterator)localObject1).hasNext()) {
        synchronized ((g)((Iterator)localObject1).next())
        {
          HandlerThread localHandlerThread = c;
          if (localHandlerThread != null)
          {
            localHandlerThread.quit();
            c = null;
            d = null;
          }
        }
      }
      Iterator localIterator = f.iterator();
      while (localIterator.hasNext()) {
        synchronized ((g)localIterator.next())
        {
          localObject1 = c;
          if (localObject1 != null)
          {
            ((HandlerThread)localObject1).quit();
            c = null;
            d = null;
          }
        }
      }
      return;
    }
    finally {}
  }
  
  public final f c(g paramg)
  {
    try
    {
      ListIterator localListIterator = d.listIterator();
      g localg;
      f localf;
      do
      {
        boolean bool = localListIterator.hasNext();
        localg = null;
        if (!bool) {
          break;
        }
        localf = (f)localListIterator.next();
        if (localf.a() != null) {
          localg = (g)g.get(localf.a());
        }
      } while ((localg != null) && (localg != paramg));
      localListIterator.remove();
      return localf;
      return null;
    }
    finally {}
  }
  
  public final void d(f paramf)
  {
    try
    {
      d.add(paramf);
      paramf = new java/util/HashSet;
      paramf.<init>(e);
      paramf = paramf.iterator();
      while (paramf.hasNext()) {
        e((g)paramf.next());
      }
      return;
    }
    finally {}
  }
  
  public final void e(g paramg)
  {
    try
    {
      f localf = c(paramg);
      if (localf != null)
      {
        f.add(paramg);
        e.remove(paramg);
        if (localf.a() != null) {
          g.put(localf.a(), paramg);
        }
        Handler localHandler = d;
        x0.f localf1 = new x0/f;
        localf1.<init>(24, paramg, localf);
        localHandler.post(localf1);
      }
      return;
    }
    finally {}
  }
  
  public final void start()
  {
    int i = 0;
    try
    {
      while (i < b)
      {
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(a);
        ((StringBuilder)localObject1).append(i);
        Object localObject3 = ((StringBuilder)localObject1).toString();
        int j = c;
        localObject1 = new va/g;
        ((g)localObject1).<init>((String)localObject3, j);
        localObject3 = new w/g;
        ((w.g)localObject3).<init>(25, this, localObject1);
        ((g)localObject1).a((w.g)localObject3);
        e.add(localObject1);
        i++;
      }
      return;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     va.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */