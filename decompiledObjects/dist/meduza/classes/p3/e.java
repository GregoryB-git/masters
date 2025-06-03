package p3;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import q3.c.a;
import q3.e.b;

public final class e
  implements m3.b
{
  public final qb.a b;
  
  public final Object get()
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      localObject1 = (t3.a)b.get();
      HashMap localHashMap = new HashMap();
      Object localObject2 = h3.e.a;
      Object localObject3 = new c.a();
      Set localSet = Collections.emptySet();
      if (localSet != null)
      {
        c = localSet;
        a = Long.valueOf(30000L);
        b = Long.valueOf(86400000L);
        localHashMap.put(localObject2, ((c.a)localObject3).a());
        localObject2 = h3.e.c;
        localObject3 = new c.a();
        localSet = Collections.emptySet();
        if (localSet != null)
        {
          c = localSet;
          a = Long.valueOf(1000L);
          b = Long.valueOf(86400000L);
          localHashMap.put(localObject2, ((c.a)localObject3).a());
          localObject3 = h3.e.b;
          localObject2 = new c.a();
          localSet = Collections.emptySet();
          if (localSet != null)
          {
            c = localSet;
            a = Long.valueOf(86400000L);
            b = Long.valueOf(86400000L);
            localSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new e.b[] { e.b.b })));
            if (localSet != null)
            {
              c = localSet;
              localHashMap.put(localObject3, ((c.a)localObject2).a());
              if (localObject1 != null)
              {
                if (localHashMap.keySet().size() >= h3.e.values().length)
                {
                  new HashMap();
                  return new q3.b((t3.a)localObject1, localHashMap);
                }
                throw new IllegalStateException("Not all priorities have been configured");
              }
              throw new NullPointerException("missing required property: clock");
            }
            throw new NullPointerException("Null flags");
          }
          throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
      }
      throw new NullPointerException("Null flags");
    }
    Object localObject1 = ((Context)b.get()).getPackageName();
    if (localObject1 != null) {
      return localObject1;
    }
    throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
  }
}

/* Location:
 * Qualified Name:     p3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */