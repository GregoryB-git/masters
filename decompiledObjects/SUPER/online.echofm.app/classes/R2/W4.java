package R2;

import A2.n;
import android.os.RemoteException;
import android.text.TextUtils;

public final class W4
  implements Runnable
{
  public W4(D4 paramD4, boolean paramBoolean1, W5 paramW5, boolean paramBoolean2, e parame1, e parame2) {}
  
  public final void run()
  {
    R1 localR1 = D4.B(t);
    if (localR1 == null)
    {
      t.j().G().a("Discarding data. Failed to send conditional user property to service");
      return;
    }
    if (o)
    {
      n.i(p);
      D4 localD4 = t;
      e locale;
      if (q) {
        locale = null;
      } else {
        locale = r;
      }
      localD4.F(localR1, locale, p);
    }
    else
    {
      try
      {
        if (TextUtils.isEmpty(s.o))
        {
          n.i(p);
          localR1.m0(r, p);
        }
      }
      catch (RemoteException localRemoteException)
      {
        break label133;
        localR1.n0(r);
        break label149;
        label133:
        t.j().G().b("Failed to send conditional user property to the service", localRemoteException);
      }
    }
    label149:
    D4.m0(t);
  }
}

/* Location:
 * Qualified Name:     R2.W4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */