package b4;

import Y3.m;
import a4.c;
import a4.e.a;
import d4.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a
{
  public final Map a = new HashMap();
  
  public List a()
  {
    return new ArrayList(a.values());
  }
  
  public void b(c paramc)
  {
    e.a locala1 = paramc.j();
    Object localObject1 = paramc.i();
    Object localObject2 = e.a.p;
    boolean bool;
    if ((locala1 != localObject2) && (locala1 != e.a.r) && (locala1 != e.a.o)) {
      bool = false;
    } else {
      bool = true;
    }
    m.g(bool, "Only child changes supported for tracking");
    m.f(true ^ paramc.i().s());
    c localc;
    if (a.containsKey(localObject1))
    {
      localc = (c)a.get(localObject1);
      e.a locala2 = localc.j();
      if ((locala1 == localObject2) && (locala2 == e.a.o))
      {
        a.put(paramc.i(), c.d((b)localObject1, paramc.k(), localc.k()));
        return;
      }
      e.a locala3 = e.a.o;
      if ((locala1 == locala3) && (locala2 == localObject2))
      {
        a.remove(localObject1);
        return;
      }
      if ((locala1 == locala3) && (locala2 == e.a.r))
      {
        a.put(localObject1, c.g((b)localObject1, localc.l()));
        return;
      }
      locala3 = e.a.r;
      if ((locala1 == locala3) && (locala2 == localObject2))
      {
        localObject2 = a;
        localc = c.b((b)localObject1, paramc.k());
        paramc = (c)localObject2;
      }
      else if ((locala1 == locala3) && (locala2 == locala3))
      {
        localObject2 = a;
        localc = c.d((b)localObject1, paramc.k(), localc.l());
        paramc = (c)localObject2;
      }
      else
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Illegal combination of changes: ");
        ((StringBuilder)localObject1).append(paramc);
        ((StringBuilder)localObject1).append(" occurred after ");
        ((StringBuilder)localObject1).append(localc);
        throw new IllegalStateException(((StringBuilder)localObject1).toString());
      }
    }
    else
    {
      localObject2 = a;
      localObject1 = paramc.i();
      localc = paramc;
      paramc = (c)localObject2;
    }
    paramc.put(localObject1, localc);
  }
}

/* Location:
 * Qualified Name:     b4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */