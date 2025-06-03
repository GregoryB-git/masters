package gb;

import eb.e1;
import eb.g1;
import eb.h;
import eb.j.b;
import eb.r;
import eb.s;
import eb.s.a;
import eb.s0;
import hb.h.b;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import m.e;
import x6.b;

public abstract class a$b
  extends d.a
{
  public final l3 h;
  public boolean i;
  public t j;
  public boolean k;
  public s l = s.d;
  public boolean m = false;
  public a n;
  public volatile boolean o;
  public boolean p;
  public boolean q;
  
  public a$b(int paramInt, l3 paraml3, r3 paramr3)
  {
    super(paramInt, paraml3, paramr3);
    h = paraml3;
  }
  
  public final void g(e1 parame1, t.a parama, s0 params0)
  {
    if (!i)
    {
      i = true;
      Object localObject = h;
      AtomicBoolean localAtomicBoolean = b;
      int i1 = 0;
      if (localAtomicBoolean.compareAndSet(false, true))
      {
        localObject = a;
        int i2 = localObject.length;
        while (i1 < i2)
        {
          localObject[i1].o(parame1);
          i1++;
        }
      }
      if (c != null) {
        parame1.e();
      }
      j.d(parame1, parama, params0);
    }
  }
  
  public final void h(s0 params0)
  {
    b.I(p ^ true, "Received headers on closed stream");
    Object localObject1 = h.a;
    int i1 = localObject1.length;
    for (int i2 = 0; i2 < i1; i2++) {
      ((h)localObject1[i2]).w();
    }
    Object localObject2 = (String)params0.c(v0.f);
    boolean bool = k;
    localObject1 = null;
    Object localObject3;
    if ((bool) && (localObject2 != null))
    {
      if (((String)localObject2).equalsIgnoreCase("gzip"))
      {
        localObject3 = new w0();
        localObject2 = d;
        if (e == j.b.a) {
          bool = true;
        } else {
          bool = false;
        }
        b.I(bool, "per-message decompressor already set");
        if (f == null) {
          bool = true;
        } else {
          bool = false;
        }
        b.I(bool, "full stream decompressor already set");
        f = ((w0)localObject3);
        u = null;
        localObject3 = d;
        localObject2 = (y0)this;
        a = new f((y0)localObject2, (y0)localObject2, (i2)localObject3);
        i2 = 1;
        break label245;
      }
      if (!((String)localObject2).equalsIgnoreCase("identity"))
      {
        params0 = new g1(e1.m.g(String.format("Can't find full stream decompressor for %s", new Object[] { localObject2 })));
        break label355;
      }
    }
    i2 = 0;
    label245:
    localObject2 = (String)params0.c(v0.d);
    if (localObject2 != null)
    {
      localObject3 = (s.a)l.a.get(localObject2);
      if (localObject3 != null) {
        localObject1 = a;
      }
      if (localObject1 == null)
      {
        params0 = new g1(e1.m.g(String.format("Can't find decompressor for %s", new Object[] { localObject2 })));
      }
      else
      {
        if (localObject1 == j.b.a) {
          break label374;
        }
        if (i2 == 0) {
          break label364;
        }
        params0 = new g1(e1.m.g("Full stream and gRPC message encoding cannot both be set"));
      }
      label355:
      ((h.b)this).e(params0);
      return;
      label364:
      a.I((r)localObject1);
    }
    label374:
    j.b(params0);
  }
  
  public final void i(s0 params0, e1 parame1, boolean paramBoolean)
  {
    j(parame1, t.a.a, paramBoolean, params0);
  }
  
  public final void j(final e1 parame1, final t.a parama, boolean paramBoolean, final s0 params0)
  {
    b.y(parame1, "status");
    if ((p) && (!paramBoolean)) {
      return;
    }
    p = true;
    q = parame1.e();
    synchronized (b)
    {
      g = true;
      if (m)
      {
        n = null;
        g(parame1, parama, params0);
      }
      else
      {
        n = new a(parame1, parama, params0);
        parame1 = a;
        if (paramBoolean) {
          parame1.close();
        } else {
          parame1.H();
        }
      }
      return;
    }
  }
  
  public final class a
    implements Runnable
  {
    public a(e1 parame1, t.a parama, s0 params0) {}
    
    public final void run()
    {
      g(parame1, parama, params0);
    }
  }
}

/* Location:
 * Qualified Name:     gb.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */