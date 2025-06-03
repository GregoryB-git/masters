package i9;

import g9.k0;
import j9.i;
import j9.q;
import java.util.HashMap;
import l3.l;
import t8.e;
import t8.e.a;

public final class z
  implements l1
{
  public final HashMap a = new HashMap();
  public final l b = new l(6);
  public int c;
  public q d = q.b;
  public long e = 0L;
  public final w f;
  
  public z(w paramw)
  {
    f = paramw;
  }
  
  public final m1 a(k0 paramk0)
  {
    return (m1)a.get(paramk0);
  }
  
  public final void b(e<i> parame, int paramInt)
  {
    Object localObject1 = b;
    localObject1.getClass();
    Object localObject2 = parame.iterator();
    for (;;)
    {
      Object localObject3 = (e.a)localObject2;
      if (!((e.a)localObject3).hasNext()) {
        break;
      }
      localObject3 = new c(paramInt, (i)((e.a)localObject3).next());
      a = ((e)a).a(localObject3);
      b = ((e)b).a(localObject3);
    }
    localObject2 = f.i;
    localObject1 = parame.iterator();
    for (;;)
    {
      parame = (e.a)localObject1;
      if (!parame.hasNext()) {
        break;
      }
      ((f0)localObject2).e((i)parame.next());
    }
  }
  
  public final void c(m1 paramm1)
  {
    a.put(a, paramm1);
    int i = b;
    if (i > c) {
      c = i;
    }
    long l = c;
    if (l > e) {
      e = l;
    }
  }
  
  public final int d()
  {
    return c;
  }
  
  public final void e(e<i> parame, int paramInt)
  {
    Object localObject1 = b;
    localObject1.getClass();
    Object localObject2 = parame.iterator();
    for (;;)
    {
      Object localObject3 = (e.a)localObject2;
      if (!((e.a)localObject3).hasNext()) {
        break;
      }
      localObject3 = new c(paramInt, (i)((e.a)localObject3).next());
      a = ((e)a).i(localObject3);
      b = ((e)b).i(localObject3);
    }
    localObject2 = f.i;
    parame = parame.iterator();
    for (;;)
    {
      localObject1 = (e.a)parame;
      if (!((e.a)localObject1).hasNext()) {
        break;
      }
      ((f0)localObject2).c((i)((e.a)localObject1).next());
    }
  }
  
  public final e<i> f(int paramInt)
  {
    return b.c(paramInt);
  }
  
  public final q g()
  {
    return d;
  }
  
  public final void h(m1 paramm1)
  {
    c(paramm1);
  }
  
  public final void i(int paramInt)
  {
    b.d(paramInt);
  }
  
  public final void j(q paramq)
  {
    d = paramq;
  }
}

/* Location:
 * Qualified Name:     i9.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */