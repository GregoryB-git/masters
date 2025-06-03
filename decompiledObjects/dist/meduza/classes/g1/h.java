package g1;

import android.os.Bundle;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2.m0;
import r.g.c;

public final class h
  implements Runnable
{
  public h(c.e parame, String paramString, Bundle paramBundle) {}
  
  public final void run()
  {
    Iterator localIterator = ((g.c)c.d.d.keySet()).iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (IBinder)localIterator.next();
      localObject1 = (c.c)c.d.d.getOrDefault(localObject1, null);
      c.e locale = c;
      String str = a;
      Bundle localBundle = b;
      locale.getClass();
      Object localObject2 = (List)e.get(str);
      if (localObject2 != null)
      {
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          d0.b localb = (d0.b)((Iterator)localObject2).next();
          if (m0.N(localBundle, (Bundle)b)) {
            d.g(str, (c.c)localObject1, (Bundle)b, localBundle);
          }
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     g1.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */