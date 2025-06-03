package l1;

import F0.T;
import F0.t;
import d0.q;
import d0.q.b;
import g0.E;
import g0.M;
import g0.a;
import g0.z;

public final class x
  implements D
{
  public q a;
  public E b;
  public T c;
  
  public x(String paramString)
  {
    a = new q.b().o0(paramString).K();
  }
  
  public void a(z paramz)
  {
    b();
    long l1 = b.e();
    long l2 = b.f();
    if ((l1 != -9223372036854775807L) && (l2 != -9223372036854775807L))
    {
      q localq = a;
      if (l2 != s)
      {
        localq = localq.a().s0(l2).K();
        a = localq;
        c.d(localq);
      }
      int i = paramz.a();
      c.e(paramz, i);
      c.b(l1, 1, i, 0, null);
    }
  }
  
  public final void b()
  {
    a.h(b);
    M.i(c);
  }
  
  public void c(E paramE, t paramt, K.d paramd)
  {
    b = paramE;
    paramd.a();
    paramE = paramt.a(paramd.c(), 5);
    c = paramE;
    paramE.d(a);
  }
}

/* Location:
 * Qualified Name:     l1.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */