package g1;

import android.os.IBinder;
import android.util.Log;
import d0.b;
import f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import r.h;

public final class n
  implements Runnable
{
  public n(c.k paramk, c.m paramm, String paramString, IBinder paramIBinder) {}
  
  public final void run()
  {
    Object localObject1 = ((c.m)a).a();
    c.c localc = (c.c)d.a.d.getOrDefault(localObject1, null);
    if (localc == null)
    {
      localObject1 = f.l("removeSubscription for callback that isn't registered id=");
      ((StringBuilder)localObject1).append(b);
      Log.w("MBServiceCompat", ((StringBuilder)localObject1).toString());
      return;
    }
    Object localObject3 = d.a;
    localObject1 = b;
    IBinder localIBinder = c;
    localObject3.getClass();
    int i = 1;
    int j = 0;
    int k = 0;
    if (localIBinder == null) {}
    try
    {
      if (e.remove(localObject1) != null)
      {
        j = i;
        break label211;
        List localList = (List)e.get(localObject1);
        if (localList != null)
        {
          localObject3 = localList.iterator();
          i = k;
          while (((Iterator)localObject3).hasNext()) {
            if (localIBinder == nexta)
            {
              ((Iterator)localObject3).remove();
              i = 1;
            }
          }
          j = i;
          if (localList.size() == 0)
          {
            e.remove(localObject1);
            j = i;
          }
        }
      }
      label211:
      if (j == 0)
      {
        localObject1 = f.l("removeSubscription called for ");
        ((StringBuilder)localObject1).append(b);
        ((StringBuilder)localObject1).append(" which is not subscribed");
        Log.w("MBServiceCompat", ((StringBuilder)localObject1).toString());
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     g1.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */