package gb;

import eb.a.b;
import eb.e1;
import eb.h1;
import eb.u0.d;
import eb.u0.e;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class c3$c
  extends u0.d
{
  public u0.d a;
  
  public c3$c(c3 paramc3, u0.d paramd)
  {
    a = paramd;
  }
  
  public final void a(e1 parame1)
  {
    a.a(parame1);
    b.c.execute(new u.a(this, 20));
  }
  
  public final void b(u0.e parame)
  {
    Object localObject1 = b;
    Object localObject2 = c3.d;
    if (((eb.a)localObject1).a((a.b)localObject2) == null)
    {
      localObject1 = a;
      Collections.emptyList();
      Object localObject3 = eb.a.b;
      localObject3 = a;
      Object localObject4 = b;
      parame = c;
      localObject4.getClass();
      c3.b localb = new c3.b(b);
      IdentityHashMap localIdentityHashMap = new IdentityHashMap(1);
      localIdentityHashMap.put(localObject2, localb);
      localObject2 = a.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject4 = (Map.Entry)((Iterator)localObject2).next();
        if (!localIdentityHashMap.containsKey(((Map.Entry)localObject4).getKey())) {
          localIdentityHashMap.put((a.b)((Map.Entry)localObject4).getKey(), ((Map.Entry)localObject4).getValue());
        }
      }
      ((u0.d)localObject1).b(new u0.e((List)localObject3, new eb.a(localIdentityHashMap), parame));
      return;
    }
    throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
  }
}

/* Location:
 * Qualified Name:     gb.c3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */