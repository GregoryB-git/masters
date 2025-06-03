package g1;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import d0.b;
import f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p2.m0;
import r.h;

public final class m
  implements Runnable
{
  public m(c.k paramk, c.m paramm, String paramString, IBinder paramIBinder, Bundle paramBundle) {}
  
  public final void run()
  {
    Object localObject1 = ((c.m)a).a();
    c.c localc = (c.c)e.a.d.getOrDefault(localObject1, null);
    if (localc == null)
    {
      localObject1 = f.l("addSubscription for callback that isn't registered id=");
      ((StringBuilder)localObject1).append(b);
      Log.w("MBServiceCompat", ((StringBuilder)localObject1).toString());
      return;
    }
    c localc1 = e.a;
    String str = b;
    IBinder localIBinder = c;
    Bundle localBundle = d;
    localc1.getClass();
    Object localObject2 = (List)e.get(str);
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new ArrayList();
    }
    Iterator localIterator = ((List)localObject1).iterator();
    while (localIterator.hasNext())
    {
      localObject2 = (b)localIterator.next();
      if ((localIBinder == a) && (m0.h(localBundle, (Bundle)b))) {
        return;
      }
    }
    ((List)localObject1).add(new b(localIBinder, localBundle));
    e.put(str, localObject1);
    localc1.g(str, localc, localBundle, null);
  }
}

/* Location:
 * Qualified Name:     g1.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */