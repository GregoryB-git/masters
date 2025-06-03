package e7;

import android.os.RemoteException;
import d2.q;
import m6.j;

public final class d5
  implements Runnable
{
  public final void run()
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      w4 localw41 = c;
      localn0 = e;
      if (localn0 == null) {
        zzjr.b("Failed to send app backgrounded");
      } else {
        try
        {
          j.i(b);
          localn0.Y1(b);
          c.H();
        }
        catch (RemoteException localRemoteException1)
        {
          c.zzj().o.c("Failed to send app backgrounded to the service", localRemoteException1);
        }
      }
      return;
    }
    w4 localw42 = c;
    n0 localn0 = e;
    if (localn0 == null) {
      zzjo.b("Failed to send measurementEnabled to service");
    } else {
      try
      {
        j.i(b);
        localn0.E0(b);
        c.H();
      }
      catch (RemoteException localRemoteException2)
      {
        c.zzj().o.c("Failed to send measurementEnabled to the service", localRemoteException2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     e7.d5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */