package R2;

import A2.n;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

public final class H4
  implements Runnable
{
  public H4(D4 paramD4, AtomicReference paramAtomicReference, W5 paramW5, Bundle paramBundle) {}
  
  public final void run()
  {
    try
    {
      synchronized (o)
      {
        R1 localR1 = D4.B(r);
        if (localR1 == null)
        {
          r.j().G().a("Failed to get trigger URIs; not connected to service");
          try
          {
            o.notify();
            return;
          }
          finally
          {
            break label140;
          }
        }
      }
      label104:
      o.notify();
    }
    catch (RemoteException localRemoteException)
    {
      break label104;
      n.i(p);
      o.set(localRemoteException.F(p, q));
      D4.m0(r);
      for (localAtomicReference2 = o;; localAtomicReference2 = o)
      {
        localAtomicReference2.notify();
        break;
        r.j().G().b("Failed to get trigger URIs; remote exception", localAtomicReference2);
      }
      return;
    }
    throw localAtomicReference2;
  }
}

/* Location:
 * Qualified Name:     R2.H4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */