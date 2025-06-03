package o0;

import dc.p;
import ec.i;
import ec.r;
import ec.s;
import rb.f;
import ub.e;
import wb.c;

public final class q$d
  implements k<T>
{
  public q$d(vc.a parama, r paramr, s<T> params, q<T> paramq) {}
  
  public final Object a(g paramg, e parame)
  {
    if ((parame instanceof y))
    {
      localObject1 = (y)parame;
      i = p;
      if ((i & 0x80000000) != 0)
      {
        p = (i + Integer.MIN_VALUE);
        break label48;
      }
    }
    Object localObject1 = new y(this, parame);
    label48:
    Object localObject2 = f;
    vb.a locala = vb.a.a;
    int i = p;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            localObject3 = c;
            localObject4 = (s)b;
            parame = (vc.a)a;
            paramg = parame;
            try
            {
              f.b(localObject2);
              localObject2 = localObject3;
            }
            finally
            {
              break label494;
            }
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        localObject3 = (q)c;
        parame = (s)b;
        paramg = (vc.a)a;
        localObject4 = paramg;
        try
        {
          f.b(localObject2);
        }
        finally
        {
          break label497;
        }
      }
      localObject4 = e;
      parame = d;
      localObject5 = (r)c;
      paramg = (vc.a)b;
      localObject3 = (p)a;
      f.b(localObject2);
    }
    else
    {
      f.b(localObject2);
      localObject5 = a;
      parame = b;
      localObject2 = c;
      localObject4 = d;
      a = paramg;
      b = localObject5;
      c = parame;
      d = ((s)localObject2);
      e = ((q)localObject4);
      p = 1;
      if (((vc.a)localObject5).b((c)localObject1) == locala) {
        return locala;
      }
      localObject3 = paramg;
      paramg = (g)localObject5;
      localObject5 = parame;
      parame = (e)localObject2;
    }
    try
    {
      if (a) {
        break label507;
      }
      localObject2 = a;
      a = paramg;
      b = parame;
      c = localObject4;
      d = null;
      e = null;
      p = 2;
      localObject2 = ((p)localObject3).invoke(localObject2, localObject1);
      if (localObject2 == locala) {
        return locala;
      }
      localObject3 = localObject4;
      localObject4 = paramg;
      if (!i.a(localObject2, a))
      {
        localObject4 = paramg;
        a = paramg;
        localObject4 = paramg;
        b = parame;
        localObject4 = paramg;
        c = localObject2;
        localObject4 = paramg;
        p = 3;
        localObject4 = paramg;
        localObject1 = ((q)localObject3).j(localObject2, (e)localObject1);
        if (localObject1 == locala) {
          return locala;
        }
        localObject4 = parame;
        parame = paramg;
        paramg = parame;
        a = localObject2;
      }
      else
      {
        localObject4 = parame;
        parame = paramg;
      }
      paramg = parame;
      localObject4 = a;
      parame.a(null);
      return localObject4;
    }
    finally
    {
      label494:
      break label519;
    }
    break label519;
    label497:
    paramg = (g)localObject4;
    break label519;
    label507:
    parame = new java/lang/IllegalStateException;
    parame.<init>("InitializerApi.updateData should not be called after initialization is complete.");
    throw parame;
    label519:
    paramg.a(null);
    throw parame;
  }
}

/* Location:
 * Qualified Name:     o0.q.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */