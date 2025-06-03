package V3;

import X3.e;
import Y3.d;
import d4.n;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;

public class x$i
  implements Callable
{
  public x$i(x paramx, boolean paramBoolean1, long paramLong, boolean paramBoolean2, Y3.a parama) {}
  
  public List a()
  {
    if (o) {
      x.c(s).b(p);
    }
    B localB = x.j(s).i(p);
    boolean bool = x.j(s).m(p);
    if ((localB.f()) && (!q))
    {
      localObject1 = s.c(r);
      if (localB.e())
      {
        localObject1 = s.g(localB.b(), s, localB.c(), (Map)localObject1);
        x.c(s).n(localB.c(), (n)localObject1);
      }
      else
      {
        localObject1 = s.f(localB.a(), s, localB.c(), (Map)localObject1);
        x.c(s).h(localB.c(), (b)localObject1);
      }
    }
    if (!bool) {
      return Collections.emptyList();
    }
    Object localObject1 = d.d();
    Object localObject2;
    if (localB.e())
    {
      localObject2 = ((d)localObject1).W(k.Y(), Boolean.TRUE);
    }
    else
    {
      Iterator localIterator = localB.a().iterator();
      for (;;)
      {
        localObject2 = localObject1;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject1 = ((d)localObject1).W((k)((Map.Entry)localIterator.next()).getKey(), Boolean.TRUE);
      }
    }
    return x.k(s, new W3.a(localB.c(), (d)localObject2, q));
  }
}

/* Location:
 * Qualified Name:     V3.x.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */