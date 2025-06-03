package a0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import t.h;

public class d$n$f
  implements Runnable
{
  public d$n$f(d.n paramn, d.o paramo, int paramInt1, String paramString, int paramInt2, Bundle paramBundle) {}
  
  public void run()
  {
    IBinder localIBinder = o.asBinder();
    t.a.s.remove(localIBinder);
    Iterator localIterator = t.a.r.iterator();
    Object localObject1;
    d.f localf;
    do
    {
      boolean bool = localIterator.hasNext();
      localObject1 = null;
      localObject2 = null;
      if (!bool) {
        break;
      }
      localf = (d.f)localIterator.next();
    } while (c != p);
    if (!TextUtils.isEmpty(q))
    {
      localObject1 = localObject2;
      if (r > 0) {}
    }
    else
    {
      localObject1 = new d.f(t.a, a, b, c, s, o);
    }
    localIterator.remove();
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = new d.f(t.a, q, r, p, s, o);
    }
    t.a.s.put(localIBinder, localObject2);
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
 * Qualified Name:     a0.d.n.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */