package j0;

import g0.a;
import java.util.ArrayDeque;

public abstract class k
  implements g
{
  public final Thread a;
  public final Object b = new Object();
  public final ArrayDeque c = new ArrayDeque();
  public final ArrayDeque d = new ArrayDeque();
  public final i[] e;
  public final j[] f;
  public int g;
  public int h;
  public i i;
  public h j;
  public boolean k;
  public boolean l;
  public int m;
  public long n = -9223372036854775807L;
  
  public k(i[] paramArrayOfi, j[] paramArrayOfj)
  {
    e = paramArrayOfi;
    g = paramArrayOfi.length;
    int i1 = 0;
    for (int i2 = 0; i2 < g; i2++) {
      e[i2] = i();
    }
    f = paramArrayOfj;
    h = paramArrayOfj.length;
    for (i2 = i1; i2 < h; i2++) {
      f[i2] = j();
    }
    paramArrayOfi = new a("ExoPlayer:SimpleDecoder");
    a = paramArrayOfi;
    paramArrayOfi.start();
  }
  
  public final void b(i parami)
  {
    synchronized (b)
    {
      r();
      boolean bool;
      if (parami == i) {
        bool = true;
      } else {
        bool = false;
      }
      a.a(bool);
      c.addLast(parami);
      q();
      i = null;
      return;
    }
  }
  
  public final void c(long paramLong)
  {
    synchronized (b)
    {
      if ((g != e.length) && (!k)) {
        bool = false;
      }
    }
    boolean bool = true;
    a.f(bool);
    n = paramLong;
    return;
    throw ((Throwable)localObject2);
  }
  
  public final void flush()
  {
    synchronized (b)
    {
      k = true;
      m = 0;
      i locali = i;
      if (locali != null)
      {
        s(locali);
        i = null;
      }
    }
    while (!c.isEmpty()) {
      s((i)c.removeFirst());
    }
    while (!d.isEmpty()) {
      ((j)d.removeFirst()).x();
    }
    return;
    throw ((Throwable)localObject2);
  }
  
  public final boolean h()
  {
    boolean bool;
    if ((!c.isEmpty()) && (h > 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public abstract i i();
  
  public abstract j j();
  
  public abstract h k(Throwable paramThrowable);
  
  public abstract h l(i parami, j paramj, boolean paramBoolean);
  
  public final boolean m()
  {
    Object localObject6;
    int i1;
    boolean bool;
    h localh;
    synchronized (b)
    {
      if ((!l) && (!h())) {
        b.wait();
      }
    }
  }
  
  public final i n()
  {
    synchronized (b)
    {
      r();
      boolean bool;
      if (i == null) {
        bool = true;
      } else {
        bool = false;
      }
      a.f(bool);
      int i1 = g;
      Object localObject2;
      if (i1 == 0)
      {
        localObject2 = null;
      }
      else
      {
        localObject2 = e;
        i1--;
        g = i1;
        localObject2 = localObject2[i1];
      }
      i = ((i)localObject2);
      return (i)localObject2;
    }
  }
  
  public final j o()
  {
    j localj;
    synchronized (b)
    {
      r();
      if (d.isEmpty()) {
        return null;
      }
    }
  }
  
  public final boolean p(long paramLong)
  {
    synchronized (b)
    {
      long l1 = n;
      boolean bool;
      if ((l1 != -9223372036854775807L) && (paramLong < l1)) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
  }
  
  public final void q()
  {
    if (h()) {
      b.notify();
    }
  }
  
  public final void r()
  {
    h localh = j;
    if (localh == null) {
      return;
    }
    throw localh;
  }
  
  public void release()
  {
    synchronized (b)
    {
      l = true;
      b.notify();
      try
      {
        a.join();
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
      }
      return;
    }
  }
  
  public final void s(i parami)
  {
    parami.m();
    i[] arrayOfi = e;
    int i1 = g;
    g = (i1 + 1);
    arrayOfi[i1] = parami;
  }
  
  public void t(j paramj)
  {
    synchronized (b)
    {
      u(paramj);
      q();
      return;
    }
  }
  
  public final void u(j paramj)
  {
    paramj.m();
    j[] arrayOfj = f;
    int i1 = h;
    h = (i1 + 1);
    arrayOfj[i1] = paramj;
  }
  
  public final void v()
  {
    try
    {
      boolean bool;
      do
      {
        bool = m();
      } while (bool);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IllegalStateException(localInterruptedException);
    }
  }
  
  public final void w(int paramInt)
  {
    int i1 = g;
    int i2 = e.length;
    int i3 = 0;
    boolean bool;
    if (i1 == i2) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    i[] arrayOfi = e;
    i2 = arrayOfi.length;
    while (i3 < i2)
    {
      arrayOfi[i3].z(paramInt);
      i3++;
    }
  }
  
  public class a
    extends Thread
  {
    public a(String paramString)
    {
      super();
    }
    
    public void run()
    {
      k.g(k.this);
    }
  }
}

/* Location:
 * Qualified Name:     j0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */