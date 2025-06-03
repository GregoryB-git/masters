package g1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import r.h;

public final class p
  implements Runnable
{
  public p(int paramInt1, int paramInt2, Bundle paramBundle, c.k paramk, c.m paramm, String paramString) {}
  
  public final void run()
  {
    IBinder localIBinder = ((c.m)a).a();
    e.a.d.remove(localIBinder);
    Iterator localIterator = e.a.c.iterator();
    Object localObject1;
    c.c localc;
    do
    {
      boolean bool = localIterator.hasNext();
      localObject1 = null;
      localObject2 = null;
      if (!bool) {
        break;
      }
      localc = (c.c)localIterator.next();
    } while (c != b);
    if (!TextUtils.isEmpty(c))
    {
      localObject1 = localObject2;
      if (d > 0) {}
    }
    else
    {
      localObject1 = new c.c(e.a, a, b, c, a);
    }
    localIterator.remove();
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new c.c(e.a, c, d, b, a);
    }
    e.a.d.put(localIBinder, localObject2);
    try
    {
      localIBinder.linkToDeath((IBinder.DeathRecipient)localObject2, 0);
    }
    catch (RemoteException localRemoteException)
    {
      Log.w("MBServiceCompat", "IBinder is already dead.");
    }
  }
}

/* Location:
 * Qualified Name:     g1.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */