package k7;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.review.internal.zze;
import java.util.ArrayList;
import java.util.Iterator;

public final class k
  extends e
{
  public k(m paramm, IBinder paramIBinder) {}
  
  public final void a()
  {
    c localc = zze.zzb(b);
    Object localObject2 = c.a;
    m = localc;
    b.a("linkToDeath", new Object[0]);
    try
    {
      m.asBinder().linkToDeath(j, 0);
    }
    catch (RemoteException localRemoteException)
    {
      localObject2 = b;
      localObject2.getClass();
      if (Log.isLoggable("PlayCore", 6)) {
        Log.e("PlayCore", d.c(a, "linkToDeath failed", new Object[0]), localRemoteException);
      }
    }
    Object localObject1 = c.a;
    g = false;
    localObject1 = d.iterator();
    while (((Iterator)localObject1).hasNext()) {
      ((Runnable)((Iterator)localObject1).next()).run();
    }
    c.a.d.clear();
  }
}

/* Location:
 * Qualified Name:     k7.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */