package pc;

import a0.j;
import d2.h0;
import dc.l;
import ec.d;
import f;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.i2;
import p2.m0;
import rb.h;
import sc.c;

public final class n<E>
  extends b<E>
{
  public final a t;
  
  public n(int paramInt, a parama, l<? super E, h> paraml)
  {
    super(paramInt, paraml);
    t = parama;
    paraml = a.a;
    int i = 0;
    int j;
    if (parama != paraml) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      j = i;
      if (paramInt >= 1) {
        j = 1;
      }
      if (j != 0) {
        return;
      }
      throw new IllegalArgumentException(j.h("Buffered channel capacity must be at least 1, but ", paramInt, " was specified").toString());
    }
    parama = f.l("This implementation does not support suspension for senders, use ");
    parama.append(ec.t.a(b.class).e());
    parama.append(" instead");
    throw new IllegalArgumentException(parama.toString().toString());
  }
  
  public final Object L(E paramE, boolean paramBoolean)
  {
    Object localObject1;
    Object localObject2;
    if (t == a.c)
    {
      localObject1 = super.l(paramE);
      localObject2 = localObject1;
      if (!(localObject1 instanceof j.b ^ true)) {
        if ((localObject1 instanceof j.a))
        {
          localObject2 = localObject1;
        }
        else
        {
          if (paramBoolean)
          {
            localObject2 = b;
            if (localObject2 != null)
            {
              paramE = m0.k((l)localObject2, paramE, null);
              if (paramE != null) {
                throw paramE;
              }
            }
          }
          localObject2 = h.a;
        }
      }
    }
    else
    {
      h0 localh0 = e.d;
      localObject2 = (k)b.o.get(this);
      long l1 = b.c.getAndIncrement(this);
      long l2 = l1 & 0xFFFFFFFFFFFFFFF;
      paramBoolean = w(l1, false);
      int i = e.b;
      long l3 = i;
      l1 = l2 / l3;
      int j = (int)(l2 % l3);
      if (c != l1)
      {
        localObject1 = b.b(this, l1, (k)localObject2);
        if (localObject1 == null) {
          if (paramBoolean) {
            paramE = new j.a(t());
          }
        }
      }
      for (;;)
      {
        localObject2 = paramE;
        break label397;
        break;
        localObject2 = localObject1;
        int k = b.e(this, (k)localObject2, j, paramE, l2, localh0, paramBoolean);
        if (k == 0) {
          break label387;
        }
        if (k == 1) {
          break label392;
        }
        if (k != 2)
        {
          if (k != 3)
          {
            if (k != 4)
            {
              if (k == 5) {
                ((c)localObject2).a();
              }
              break;
            }
            if (l2 < s()) {
              ((c)localObject2).a();
            }
            paramE = new j.a(t());
            continue;
          }
          throw new IllegalStateException("unexpected".toString());
        }
        if (!paramBoolean) {
          break label332;
        }
        ((sc.t)localObject2).h();
        paramE = new j.a(t());
      }
      label332:
      if ((localh0 instanceof i2)) {
        paramE = (i2)localh0;
      } else {
        paramE = null;
      }
      if (paramE != null) {
        paramE.c((sc.t)localObject2, j + i);
      }
      j(c * l3 + j);
      break label392;
      label387:
      ((c)localObject2).a();
      label392:
      localObject2 = h.a;
    }
    label397:
    return localObject2;
  }
  
  public final Object k(E paramE, ub.e<? super h> parame)
  {
    parame = L(paramE, true);
    boolean bool = parame instanceof j.a;
    if (bool)
    {
      if (bool) {
        parame = (j.a)parame;
      }
      parame = b;
      if (parame != null)
      {
        paramE = m0.k(parame, paramE, null);
        if (paramE != null)
        {
          x6.b.e(paramE, t());
          throw paramE;
        }
      }
      throw t();
    }
    return h.a;
  }
  
  public final Object l(E paramE)
  {
    return L(paramE, false);
  }
  
  public final boolean y()
  {
    boolean bool;
    if (t == a.b) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     pc.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */