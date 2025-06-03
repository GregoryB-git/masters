package R2;

import A2.n;
import android.os.RemoteException;

public final class I4
  implements Runnable
{
  public I4(D4 paramD4, W5 paramW5) {}
  
  public final void run()
  {
    R1 localR1 = D4.B(p);
    if (localR1 == null)
    {
      p.j().G().a("Failed to reset data on the service: not connected to service");
      return;
    }
    try
    {
      n.i(o);
      localR1.D0(o);
    }
    catch (RemoteException localRemoteException)
    {
      p.j().G().b("Failed to reset data on the service: remote exception", localRemoteException);
    }
    D4.m0(p);
  }
}

/* Location:
 * Qualified Name:     R2.I4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */