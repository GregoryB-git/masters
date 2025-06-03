package l1;

import F0.T;
import F0.g;
import F0.t;
import d0.q;
import d0.q.b;
import g0.a;
import g0.z;
import java.util.List;

public final class F
{
  public final List a;
  public final T[] b;
  
  public F(List paramList)
  {
    a = paramList;
    b = new T[paramList.size()];
  }
  
  public void a(long paramLong, z paramz)
  {
    g.a(paramLong, paramz, b);
  }
  
  public void b(t paramt, K.d paramd)
  {
    for (int i = 0; i < b.length; i++)
    {
      paramd.a();
      T localT = paramt.a(paramd.c(), 3);
      q localq = (q)a.get(i);
      String str = n;
      boolean bool;
      if ((!"application/cea-608".equals(str)) && (!"application/cea-708".equals(str))) {
        bool = false;
      } else {
        bool = true;
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Invalid closed caption MIME type provided: ");
      ((StringBuilder)localObject).append(str);
      a.b(bool, ((StringBuilder)localObject).toString());
      localObject = a;
      if (localObject == null) {
        localObject = paramd.b();
      }
      localT.d(new q.b().a0((String)localObject).o0(str).q0(e).e0(d).L(G).b0(q).K());
      b[i] = localT;
    }
  }
}

/* Location:
 * Qualified Name:     l1.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */