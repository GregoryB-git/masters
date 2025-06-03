package gb;

import eb.e1;
import eb.h1;
import eb.h1.c;
import eb.n;
import eb.o;
import eb.u;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class g1
  implements Runnable
{
  public g1(d1 paramd1, List paramList) {}
  
  public final void run()
  {
    Object localObject1 = n.b;
    Object localObject2 = b.m;
    localObject2 = (SocketAddress)a.get(b)).a.get(c);
    d1.d locald = b.m;
    a = a;
    locald.a();
    b.n = a;
    if ((b.x.a == localObject1) || (b.x.a == n.a))
    {
      locald = b.m;
      int i = 0;
      for (int j = 0;; j++)
      {
        k = i;
        if (j >= a.size()) {
          break label189;
        }
        k = a.get(j)).a.indexOf(localObject2);
        if (k != -1) {
          break;
        }
      }
      b = j;
      c = k;
      int k = 1;
      label189:
      if (k == 0)
      {
        if (b.x.a == localObject1)
        {
          localObject1 = b.w;
          b.w = null;
          b.m.a();
          d1.b(b, n.d);
          break label293;
        }
        b.v.c(e1.n.g("InternalSubchannel closed pending transport due to address change"));
        localObject1 = b;
        v = null;
        m.a();
        d1.i(b);
      }
    }
    localObject1 = null;
    label293:
    if (localObject1 != null)
    {
      localObject2 = b;
      if (r != null)
      {
        s.c(e1.n.g("InternalSubchannel closed transport early due to address change"));
        b.r.a();
        localObject2 = b;
        r = null;
        s = null;
      }
      localObject2 = b;
      s = ((h2)localObject1);
      r = l.c(new a(), 5L, TimeUnit.SECONDS, g);
    }
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      d1 locald1 = b;
      h2 localh2 = s;
      r = null;
      s = null;
      localh2.c(e1.n.g("InternalSubchannel closed transport due to address change"));
    }
  }
}

/* Location:
 * Qualified Name:     gb.g1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */