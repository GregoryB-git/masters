package i9;

import d2.h0;
import d5.n;
import e9.e;
import java.util.HashMap;
import n9.l;

public final class w
  extends e9.a
{
  public final h0 b = new h0(8);
  public final HashMap c = new HashMap();
  public final HashMap d = new HashMap();
  public final s e = new s();
  public final z f = new z(this);
  public final n g = new n();
  public final y h = new y();
  public f0 i;
  public boolean j;
  
  public final void A()
  {
    x6.b.Z("MemoryPersistence shutdown without start", j, new Object[0]);
    j = false;
  }
  
  public final void B()
  {
    x6.b.Z("MemoryPersistence double-started!", j ^ true, new Object[0]);
    j = true;
  }
  
  public final a j()
  {
    return g;
  }
  
  public final b k(e parame)
  {
    r localr1 = (r)d.get(parame);
    r localr2 = localr1;
    if (localr1 == null)
    {
      localr2 = new r();
      d.put(parame, localr2);
    }
    return localr2;
  }
  
  public final d l()
  {
    return b;
  }
  
  public final f m(e parame)
  {
    return e;
  }
  
  public final a0 n(e parame, f paramf)
  {
    v localv = (v)c.get(parame);
    paramf = localv;
    if (localv == null)
    {
      paramf = new v(this);
      c.put(parame, paramf);
    }
    return paramf;
  }
  
  public final b0 o()
  {
    return new eb.y();
  }
  
  public final f0 p()
  {
    return i;
  }
  
  public final g0 q()
  {
    return h;
  }
  
  public final l1 r()
  {
    return f;
  }
  
  public final boolean u()
  {
    return j;
  }
  
  public final <T> T x(String paramString, l<T> paraml)
  {
    i.f();
    try
    {
      paramString = paraml.get();
      return paramString;
    }
    finally
    {
      i.d();
    }
  }
  
  public final void y(String paramString, Runnable paramRunnable)
  {
    i.f();
    try
    {
      paramRunnable.run();
      return;
    }
    finally
    {
      i.d();
    }
  }
}

/* Location:
 * Qualified Name:     i9.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */