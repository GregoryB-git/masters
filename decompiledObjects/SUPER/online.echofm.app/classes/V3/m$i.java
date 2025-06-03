package V3;

import Q3.b;
import Q3.c;
import Q3.r.b;
import T3.p;
import d4.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class m$i
  implements p
{
  public m$i(m paramm1, k paramk, List paramList, m paramm2) {}
  
  public void a(String paramString1, String paramString2)
  {
    paramString2 = m.y(paramString1, paramString2);
    m.z(d, "Transaction", a, paramString2);
    paramString1 = new ArrayList();
    Object localObject1;
    if (paramString2 == null)
    {
      paramString2 = new ArrayList();
      localObject1 = b.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        final m.z localz = (m.z)((Iterator)localObject1).next();
        m.z.o(localz, m.A.r);
        paramString1.addAll(m.B(d).s(m.z.p(localz), false, false, m.p(d)));
        Object localObject2 = m.z.l(localz);
        paramString2.add(new a(localz, Q3.k.a(Q3.k.c(c, m.z.w(localz)), d4.i.d((n)localObject2))));
        localObject2 = d;
        ((m)localObject2).b0(new D((m)localObject2, m.z.z(localz), a4.i.a(m.z.w(localz))));
      }
      localObject1 = d;
      m.r((m)localObject1, m.q((m)localObject1).k(a));
      m.s(d);
      m.x(c, paramString1);
      for (int i = 0; i < paramString2.size(); i++) {
        d.X((Runnable)paramString2.get(i));
      }
    }
    if (paramString2.f() == -1)
    {
      paramString2 = b.iterator();
      if (paramString2.hasNext())
      {
        localObject1 = (m.z)paramString2.next();
        if (m.z.n((m.z)localObject1) == m.A.s) {}
        for (paramString1 = m.A.t;; paramString1 = m.A.p)
        {
          m.z.o((m.z)localObject1, paramString1);
          break;
        }
      }
    }
    else
    {
      localObject1 = b.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramString1 = (m.z)((Iterator)localObject1).next();
        m.z.o(paramString1, m.A.t);
        m.z.D(paramString1, paramString2);
      }
    }
    m.m(d, a);
  }
  
  public class a
    implements Runnable
  {
    public a(m.z paramz, b paramb) {}
    
    public void run()
    {
      m.z.x(localz).b(null, true, p);
    }
  }
}

/* Location:
 * Qualified Name:     V3.m.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */