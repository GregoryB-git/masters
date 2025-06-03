package nb;

import eb.e1;
import eb.h;
import eb.h.a;
import eb.h.b;
import eb.k0.f;
import eb.k0.g;
import eb.k0.i;
import eb.k0.j;
import eb.s0;
import java.util.concurrent.atomic.AtomicLong;
import m.e;

public final class i$g
  extends k0.j
{
  public final k0.j a;
  
  public i$g(k0.j paramj)
  {
    a = paramj;
  }
  
  public final k0.f a(k0.g paramg)
  {
    k0.f localf = a.a(paramg);
    k0.i locali = a;
    paramg = localf;
    if (locali != null) {
      paramg = k0.f.b(locali, new a((i.a)locali.c().a(i.n), b));
    }
    return paramg;
  }
  
  public final class a
    extends h.a
  {
    public final h.a b;
    
    public a(h.a parama)
    {
      b = parama;
    }
    
    public final h a(h.b paramb, s0 params0)
    {
      h.a locala = b;
      if (locala != null) {
        return new a(locala.a(paramb, params0));
      }
      return new b();
    }
    
    public final class a
      extends a
    {
      public a(h paramh) {}
      
      public final void o(e1 parame1)
      {
        i.a locala = i.g.this;
        boolean bool = parame1.e();
        Object localObject = a;
        if ((e != null) || (f != null))
        {
          localObject = b;
          if (bool) {
            localObject = a;
          } else {
            localObject = b;
          }
          ((AtomicLong)localObject).getAndIncrement();
        }
        c.o(parame1);
      }
    }
    
    public final class b
      extends h
    {
      public b() {}
      
      public final void o(e1 parame1)
      {
        i.a locala = i.g.this;
        boolean bool = parame1.e();
        parame1 = a;
        if ((e != null) || (f != null))
        {
          if (bool) {
            parame1 = b.a;
          } else {
            parame1 = b.b;
          }
          parame1.getAndIncrement();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     nb.i.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */