package m9;

import eb.e1;
import eb.t0;
import j9.i;
import j9.n;
import java.util.Collections;
import java.util.List;
import ka.b0;
import ka.l;
import ka.o;
import ka.s;
import ka.t;
import ma.a0.c;
import ma.h;
import ma.h.h;
import n9.a.c;
import q0.g;
import x6.b;

public final class p0
  extends a<s, t, a>
{
  public static final h.h u = h.b;
  public final e0 t;
  
  public p0(v paramv, n9.a parama, e0 parame0, f0 paramf0)
  {
    super(paramv, (t0)localObject2, parama, a.c.b, a.c.a, paramf0);
    t = parame0;
  }
  
  public final void e(Object paramObject)
  {
    j((t)paramObject);
  }
  
  public final void j(t paramt)
  {
    l.f = 0L;
    Object localObject1 = t;
    localObject1.getClass();
    int i = g.c(paramt.L());
    Object localObject2 = null;
    Object localObject3;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i == 4)
            {
              localObject1 = paramt.K();
              localObject2 = new k(((ka.q)localObject1).G(), ((ka.q)localObject1).J());
              localObject1 = new n0.b(((ka.q)localObject1).I(), (k)localObject2);
            }
            else
            {
              throw new IllegalArgumentException("Unknown change type set");
            }
          }
          else
          {
            localObject3 = paramt.J();
            localObject2 = ((o)localObject3).I();
            localObject1 = ((e0)localObject1).b(((o)localObject3).H());
            localObject1 = new n0.a(Collections.emptyList(), (a0.c)localObject2, (i)localObject1, null);
          }
        }
        else
        {
          localObject3 = paramt.I();
          localObject2 = ((ka.m)localObject3).J();
          localObject1 = j9.m.n(((e0)localObject1).b(((ka.m)localObject3).H()), e0.f(((ka.m)localObject3).I()));
          localObject1 = new n0.a(Collections.emptyList(), (a0.c)localObject2, b, (j9.m)localObject1);
        }
      }
      else
      {
        Object localObject4 = paramt.H();
        localObject3 = ((l)localObject4).J();
        localObject2 = ((l)localObject4).I();
        localObject1 = ((e0)localObject1).b(((l)localObject4).H().L());
        j9.q localq = e0.f(((l)localObject4).H().M());
        b.Z("Got a document change without an update time", localq.equals(j9.q.b) ^ true, new Object[0]);
        localObject4 = n.e(((l)localObject4).H().K());
        j9.m localm = new j9.m((i)localObject1);
        localm.k(localq, (n)localObject4);
        localObject1 = new n0.a((List)localObject3, (a0.c)localObject2, (i)localObject1, localm);
      }
    }
    else
    {
      localObject3 = paramt.M();
      i = ((b0)localObject3).K().ordinal();
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i == 4) {
                localObject1 = n0.d.e;
              } else {
                throw new IllegalArgumentException("Unknown target change type");
              }
            }
            else {
              localObject1 = n0.d.d;
            }
          }
          else
          {
            localObject1 = n0.d.c;
            localObject2 = ((b0)localObject3).G();
            localObject2 = e1.c(((na.a)localObject2).G()).g(((na.a)localObject2).I());
          }
        }
        else {
          localObject1 = n0.d.b;
        }
      }
      else {
        localObject1 = n0.d.a;
      }
      localObject1 = new n0.c((n0.d)localObject1, ((b0)localObject3).M(), ((b0)localObject3).J(), (e1)localObject2);
    }
    t.getClass();
    if (paramt.L() != 1) {}
    while (paramt.M().L() != 0)
    {
      paramt = j9.q.b;
      break;
    }
    paramt = e0.f(paramt.M().I());
    ((a)m).e(paramt, (n0)localObject1);
  }
  
  public static abstract interface a
    extends j0
  {
    public abstract void e(j9.q paramq, n0 paramn0);
  }
}

/* Location:
 * Qualified Name:     m9.p0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */