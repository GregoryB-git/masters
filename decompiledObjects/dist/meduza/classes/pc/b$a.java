package pc;

import b.a0;
import d2.h0;
import ec.i;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.i2;
import p2.m0;
import qc.g;
import rb.f;
import sc.c;
import sc.o;
import sc.t;
import sc.u;
import vb.a;

public final class b$a
  implements h<E>, i2
{
  public Object a = e.p;
  public nc.l<? super Boolean> b;
  
  public final Object a(g paramg)
  {
    Object localObject1 = c;
    Object localObject2 = (k)b.p.get(localObject1);
    int i;
    long l1;
    long l2;
    long l3;
    Object localObject3;
    Object localObject4;
    h0 localh0;
    for (;;)
    {
      if (((b)localObject1).x())
      {
        a = e.l;
        paramg = c.q();
        if (paramg == null)
        {
          paramg = Boolean.FALSE;
          break label627;
        }
        i = u.a;
        throw paramg;
      }
      l1 = b.d.getAndIncrement(localObject1);
      l2 = e.b;
      l3 = l1 / l2;
      i = (int)(l1 % l2);
      if (c != l3)
      {
        localObject3 = ((b)localObject1).o(l3, (k)localObject2);
        if (localObject3 == null) {
          continue;
        }
        localObject2 = localObject3;
      }
      localObject4 = ((b)localObject1).I((k)localObject2, i, l1, null);
      localObject3 = e.m;
      if (localObject4 == localObject3) {
        break label629;
      }
      localh0 = e.o;
      if (localObject4 != localh0) {
        break;
      }
      if (l1 < ((b)localObject1).u()) {
        ((c)localObject2).a();
      }
    }
    if (localObject4 == e.n)
    {
      Object localObject5 = c;
      localObject4 = a0.u(m0.P(paramg));
      try
      {
        b = ((nc.l)localObject4);
        Object localObject6 = ((b)localObject5).I((k)localObject2, i, l1, this);
        if (localObject6 == localObject3)
        {
          c((t)localObject2, i);
        }
        else
        {
          localObject3 = null;
          if (localObject6 == localh0)
          {
            if (l1 < ((b)localObject5).u()) {
              ((c)localObject2).a();
            }
            paramg = (k)b.p.get(localObject5);
            for (;;)
            {
              if (((b)localObject5).x())
              {
                localObject2 = b;
                i.b(localObject2);
                b = null;
                a = e.l;
                paramg = c.q();
                if (paramg == null) {
                  paramg = Boolean.FALSE;
                } else {
                  paramg = f.a(paramg);
                }
                ((nc.l)localObject2).resumeWith(paramg);
                break label593;
              }
              l3 = b.d.getAndIncrement(localObject5);
              l1 = e.b;
              l2 = l3 / l1;
              i = (int)(l3 % l1);
              if (c != l2)
              {
                localObject2 = ((b)localObject5).o(l2, paramg);
                if (localObject2 == null) {
                  continue;
                }
                paramg = (g)localObject2;
              }
              localObject6 = ((b)localObject5).I(paramg, i, l3, this);
              if (localObject6 == e.m)
              {
                c(paramg, i);
                break label593;
              }
              if (localObject6 != e.o) {
                break;
              }
              if (l3 < ((b)localObject5).u()) {
                paramg.a();
              }
            }
            if (localObject6 != e.n)
            {
              paramg.a();
              a = localObject6;
              b = null;
              localObject1 = Boolean.TRUE;
              localObject5 = b;
              localObject2 = localObject1;
              paramg = (g)localObject3;
              if (localObject5 != null)
              {
                localObject2 = e;
                paramg = new sc/o;
                paramg.<init>((dc.l)localObject5, localObject6, (ub.h)localObject2);
                localObject2 = localObject1;
              }
            }
            else
            {
              paramg = new java/lang/IllegalStateException;
              paramg.<init>("unexpected".toString());
              throw paramg;
            }
          }
          else
          {
            ((c)localObject2).a();
            a = localObject6;
            b = null;
            localObject1 = Boolean.TRUE;
            localObject5 = b;
            localObject2 = localObject1;
            paramg = (g)localObject3;
            if (localObject5 != null)
            {
              paramg = new o((dc.l)localObject5, localObject6, e);
              localObject2 = localObject1;
            }
          }
          ((nc.l)localObject4).b(localObject2, paramg);
        }
        label593:
        paramg = ((nc.l)localObject4).s();
        localObject2 = a.a;
        return paramg;
      }
      finally
      {
        ((nc.l)localObject4).A();
      }
    }
    ((c)localObject2).a();
    a = localObject4;
    paramg = Boolean.TRUE;
    label627:
    return paramg;
    label629:
    throw new IllegalStateException("unreachable".toString());
  }
  
  public final void c(t<?> paramt, int paramInt)
  {
    nc.l locall = b;
    if (locall != null) {
      locall.c(paramt, paramInt);
    }
  }
  
  public final E next()
  {
    Object localObject1 = a;
    Object localObject2 = e.p;
    int i;
    if (localObject1 != localObject2) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      a = localObject2;
      if (localObject1 != e.l) {
        return (E)localObject1;
      }
      localObject2 = c;
      localObject1 = b.c;
      localObject2 = ((b)localObject2).r();
      i = u.a;
      throw ((Throwable)localObject2);
    }
    throw new IllegalStateException("`hasNext()` has not been invoked".toString());
  }
}

/* Location:
 * Qualified Name:     pc.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */