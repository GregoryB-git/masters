package nc;

import ec.j;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sc.g;
import ub.a;
import ub.b;
import ub.e;
import ub.f;
import ub.f.a;
import ub.h;
import ub.h.b;
import ub.h.c;

public abstract class a0
  extends a
  implements f
{
  public static final a b = new a();
  
  public a0()
  {
    super(f.a.a);
  }
  
  public void A0(h paramh, Runnable paramRunnable)
  {
    z0(paramh, paramRunnable);
  }
  
  public boolean B0()
  {
    return this instanceof f2 ^ true;
  }
  
  public final g C(e parame)
  {
    return new g(this, parame);
  }
  
  public final void Q(e<?> parame)
  {
    parame = (g)parame;
    AtomicReferenceFieldUpdater localAtomicReferenceFieldUpdater = g.p;
    while (localAtomicReferenceFieldUpdater.get(parame) == b.a0.Z) {}
    parame = g.p.get(parame);
    if ((parame instanceof l)) {
      parame = (l)parame;
    } else {
      parame = null;
    }
    if (parame != null) {
      parame.p();
    }
  }
  
  public final <E extends h.b> E get(h.c<E> paramc)
  {
    ec.i.e(paramc, "key");
    if ((paramc instanceof b))
    {
      b localb = (b)paramc;
      paramc = a;
      ec.i.e(paramc, "key");
      int i;
      if ((paramc != localb) && (b != paramc)) {
        i = 0;
      } else {
        i = 1;
      }
      if (i != 0)
      {
        paramc = (h.b)a.invoke(this);
        if ((paramc instanceof h.b)) {
          return paramc;
        }
      }
    }
    else if (f.a.a == paramc)
    {
      return this;
    }
    paramc = null;
    return paramc;
  }
  
  public final h minusKey(h.c<?> paramc)
  {
    ec.i.e(paramc, "key");
    if ((paramc instanceof b))
    {
      paramc = (b)paramc;
      h.c localc = a;
      ec.i.e(localc, "key");
      int i;
      if ((localc != paramc) && (b != localc)) {
        i = 0;
      } else {
        i = 1;
      }
      if ((i == 0) || ((h.b)a.invoke(this) == null)) {
        break label89;
      }
    }
    else
    {
      if (f.a.a != paramc) {
        break label89;
      }
    }
    return ub.i.a;
    label89:
    paramc = this;
    return paramc;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append('@');
    localStringBuilder.append(g0.b(this));
    return localStringBuilder.toString();
  }
  
  public abstract void z0(h paramh, Runnable paramRunnable);
  
  public static final class a
    extends b<f, a0>
  {
    public a()
    {
      super(a.a);
    }
    
    public static final class a
      extends j
      implements dc.l<h.b, a0>
    {
      public static final a a = new a();
      
      public a()
      {
        super();
      }
      
      public final Object invoke(Object paramObject)
      {
        paramObject = (h.b)paramObject;
        if ((paramObject instanceof a0)) {
          paramObject = (a0)paramObject;
        } else {
          paramObject = null;
        }
        return paramObject;
      }
    }
  }
}

/* Location:
 * Qualified Name:     nc.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */