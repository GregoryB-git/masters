package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map.Entry;
import m.a;
import n.b;
import n.b.d;

public abstract class LiveData
{
  public static final Object k = new Object();
  public final Object a = new Object();
  public b b = new b();
  public int c = 0;
  public boolean d;
  public volatile Object e;
  public volatile Object f;
  public int g;
  public boolean h;
  public boolean i;
  public final Runnable j;
  
  public LiveData()
  {
    Object localObject = k;
    f = localObject;
    j = new a();
    e = localObject;
    g = -1;
  }
  
  public static void a(String paramString)
  {
    if (a.d().b()) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Cannot invoke ");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" on a background thread");
    throw new IllegalStateException(localStringBuilder.toString());
  }
  
  public void b(int paramInt)
  {
    int m = c;
    c = (paramInt + m);
    if (d) {
      return;
    }
    d = true;
    for (;;)
    {
      int n;
      try
      {
        n = c;
        if (m == n) {
          break;
        }
        if ((m == 0) && (n > 0)) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
        if ((m > 0) && (n == 0)) {
          m = 1;
        } else {
          m = 0;
        }
        if (paramInt != 0) {
          f();
        }
      }
      finally
      {
        break label100;
      }
      if (m != 0) {
        g();
      }
      m = n;
    }
    d = false;
    return;
    label100:
    d = false;
    throw ((Throwable)localObject);
  }
  
  public final void c(c paramc)
  {
    if (!p) {
      return;
    }
    if (!paramc.d())
    {
      paramc.b(false);
      return;
    }
    int m = q;
    int n = g;
    if (m >= n) {
      return;
    }
    q = n;
    o.a(e);
  }
  
  public void d(c paramc)
  {
    if (h)
    {
      i = true;
      return;
    }
    h = true;
    do
    {
      i = false;
      c localc;
      if (paramc != null)
      {
        c(paramc);
        localc = null;
      }
      else
      {
        b.d locald = b.f();
        do
        {
          localc = paramc;
          if (!locald.hasNext()) {
            break;
          }
          c((c)((Map.Entry)locald.next()).getValue());
        } while (!i);
        localc = paramc;
      }
      paramc = localc;
    } while (i);
    h = false;
  }
  
  public void e(m paramm)
  {
    a("observeForever");
    b localb = new b(paramm);
    paramm = (c)b.k(paramm, localb);
    if (!(paramm instanceof LifecycleBoundObserver))
    {
      if (paramm != null) {
        return;
      }
      localb.b(true);
      return;
    }
    throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
  }
  
  public void f() {}
  
  public void g() {}
  
  public void h(Object paramObject)
  {
    synchronized (a)
    {
      int m;
      if (f == k) {
        m = 1;
      } else {
        m = 0;
      }
      f = paramObject;
      if (m == 0) {
        return;
      }
      a.d().c(j);
      return;
    }
  }
  
  public void i(m paramm)
  {
    a("removeObserver");
    paramm = (c)b.q(paramm);
    if (paramm == null) {
      return;
    }
    paramm.c();
    paramm.b(false);
  }
  
  public void j(Object paramObject)
  {
    a("setValue");
    g += 1;
    e = paramObject;
    d(null);
  }
  
  public class LifecycleBoundObserver
    extends LiveData.c
    implements f
  {
    public final h s;
    
    public void a(h paramh, d.b paramb)
    {
      paramh = s.g().b();
      if (paramh == d.c.o)
      {
        t.i(o);
        return;
      }
      paramb = null;
      while (paramb != paramh)
      {
        b(d());
        d.c localc = s.g().b();
        paramb = paramh;
        paramh = localc;
      }
    }
    
    public void c()
    {
      s.g().c(this);
    }
    
    public boolean d()
    {
      return s.g().b().c(d.c.r);
    }
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      synchronized (a)
      {
        Object localObject2 = f;
        f = LiveData.k;
        j(localObject2);
        return;
      }
    }
  }
  
  public class b
    extends LiveData.c
  {
    public b(m paramm)
    {
      super(paramm);
    }
    
    public boolean d()
    {
      return true;
    }
  }
  
  public abstract class c
  {
    public final m o;
    public boolean p;
    public int q = -1;
    
    public c(m paramm)
    {
      o = paramm;
    }
    
    public void b(boolean paramBoolean)
    {
      if (paramBoolean == p) {
        return;
      }
      p = paramBoolean;
      LiveData localLiveData = LiveData.this;
      int i;
      if (paramBoolean) {
        i = 1;
      } else {
        i = -1;
      }
      localLiveData.b(i);
      if (p) {
        d(this);
      }
    }
    
    public void c() {}
    
    public abstract boolean d();
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.LiveData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */