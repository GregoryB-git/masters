package u6;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import n6.c;
import p6.B0;

public final class u
{
  public static final u a;
  public static final B0 b;
  
  static
  {
    u localu = new u();
    a = localu;
    G.f("kotlinx.coroutines.fast.service.loader", true);
    b = localu.a();
  }
  
  public final B0 a()
  {
    try
    {
      List localList = c.e(c.a(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator()));
      Iterator localIterator = ((Iterable)localList).iterator();
      Object localObject3;
      if (!localIterator.hasNext())
      {
        localObject1 = null;
      }
      else
      {
        localObject1 = localIterator.next();
        if (localIterator.hasNext())
        {
          int i = ((t)localObject1).c();
          localObject3 = localObject1;
          do
          {
            Object localObject4 = localIterator.next();
            int j = ((t)localObject4).c();
            localObject1 = localObject3;
            int k = i;
            if (i < j)
            {
              localObject1 = localObject4;
              k = j;
            }
            localObject3 = localObject1;
            i = k;
          } while (localIterator.hasNext());
        }
      }
      Object localObject1 = (t)localObject1;
      if (localObject1 != null)
      {
        localObject3 = v.e((t)localObject1, localList);
        localObject1 = localObject3;
        if (localObject3 != null) {
          return ???;
        }
      }
    }
    finally
    {
      break label176;
    }
    w localw = v.b(null, null, 3, null);
    return localw;
    label176:
    localw = v.b(localw, null, 2, null);
    return localw;
  }
}

/* Location:
 * Qualified Name:     u6.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */