package R2;

import A2.n;
import android.os.Bundle;
import android.os.RemoteException;

public final class Q4
  implements Runnable
{
  public Q4(D4 paramD4, W5 paramW5, Bundle paramBundle) {}
  
  public final void run()
  {
    R1 localR1 = D4.B(q);
    if (localR1 == null)
    {
      q.j().G().a("Failed to send default event parameters to service");
      return;
    }
    try
    {
      n.i(o);
      localR1.O0(p, o);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      q.j().G().b("Failed to send default event parameters to service", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     R2.Q4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */