package R2;

import A2.n;
import android.os.RemoteException;
import android.text.TextUtils;

public final class T4
  implements Runnable
{
  public T4(D4 paramD4, boolean paramBoolean1, W5 paramW5, boolean paramBoolean2, I paramI, String paramString) {}
  
  public final void run()
  {
    R1 localR1 = D4.B(t);
    if (localR1 == null)
    {
      t.j().G().a("Discarding data. Failed to send event to service");
      return;
    }
    if (o)
    {
      n.i(p);
      D4 localD4 = t;
      I localI;
      if (q) {
        localI = null;
      } else {
        localI = r;
      }
      localD4.F(localR1, localI, p);
    }
    else
    {
      try
      {
        if (TextUtils.isEmpty(s))
        {
          n.i(p);
          localR1.R0(r, p);
        }
      }
      catch (RemoteException localRemoteException)
      {
        break label144;
        localR1.S0(r, s, t.j().O());
        break label160;
        label144:
        t.j().G().b("Failed to send event to the service", localRemoteException);
      }
    }
    label160:
    D4.m0(t);
  }
}

/* Location:
 * Qualified Name:     R2.T4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */