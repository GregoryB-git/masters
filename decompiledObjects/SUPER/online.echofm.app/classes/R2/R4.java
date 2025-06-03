package R2;

import A2.n;
import android.os.RemoteException;

public final class R4
  implements Runnable
{
  public R4(D4 paramD4, W5 paramW5) {}
  
  public final void run()
  {
    R1 localR1 = D4.B(p);
    if (localR1 == null)
    {
      p.j().G().a("Failed to send measurementEnabled to service");
      return;
    }
    try
    {
      n.i(o);
      localR1.N(o);
      D4.m0(p);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      p.j().G().b("Failed to send measurementEnabled to the service", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     R2.R4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */