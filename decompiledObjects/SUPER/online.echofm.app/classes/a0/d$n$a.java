package a0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import t.h;

public class d$n$a
  implements Runnable
{
  public d$n$a(d.n paramn, d.o paramo, String paramString, int paramInt1, int paramInt2, Bundle paramBundle) {}
  
  public void run()
  {
    Object localObject1 = o.asBinder();
    t.a.s.remove(localObject1);
    d.f localf = new d.f(t.a, p, q, r, s, o);
    Object localObject2 = t.a;
    t = localf;
    localObject2 = ((d)localObject2).g(p, r, s);
    h = ((d.e)localObject2);
    d locald = t.a;
    t = null;
    StringBuilder localStringBuilder1;
    if (localObject2 == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("No root for client ");
      ((StringBuilder)localObject1).append(p);
      ((StringBuilder)localObject1).append(" from service ");
      ((StringBuilder)localObject1).append(getClass().getName());
      Log.i("MBServiceCompat", ((StringBuilder)localObject1).toString());
      try
      {
        o.a();
      }
      catch (RemoteException localRemoteException1)
      {
        localStringBuilder1 = new StringBuilder();
        localStringBuilder1.append("Calling onConnectFailed() failed. Ignoring. pkg=");
        localStringBuilder1.append(p);
        Log.w("MBServiceCompat", localStringBuilder1.toString());
      }
    }
    else
    {
      try
      {
        s.put(localStringBuilder1, localf);
        localStringBuilder1.linkToDeath(localf, 0);
        if (t.a.v != null) {
          o.b(h.d(), t.a.v, h.c());
        }
      }
      catch (RemoteException localRemoteException2)
      {
        StringBuilder localStringBuilder2 = new StringBuilder();
        localStringBuilder2.append("Calling onConnect() failed. Dropping client. pkg=");
        localStringBuilder2.append(p);
        Log.w("MBServiceCompat", localStringBuilder2.toString());
        t.a.s.remove(localStringBuilder1);
      }
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.n.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */