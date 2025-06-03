package R2;

import android.content.Context;
import android.os.RemoteException;

public final class M4
  implements Runnable
{
  public M4(D4 paramD4, w4 paramw4) {}
  
  public final void run()
  {
    R1 localR1 = D4.B(p);
    if (localR1 == null)
    {
      p.j().G().a("Failed to send current screen to service");
      return;
    }
    try
    {
      w4 localw4 = o;
      if (localw4 == null) {
        localR1.I0(0L, null, null, p.a().getPackageName());
      }
    }
    catch (RemoteException localRemoteException)
    {
      break label99;
    }
    localR1.I0(c, a, b, p.a().getPackageName());
    D4.m0(p);
    return;
    label99:
    p.j().G().b("Failed to send current screen to the service", localRemoteException);
  }
}

/* Location:
 * Qualified Name:     R2.M4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */