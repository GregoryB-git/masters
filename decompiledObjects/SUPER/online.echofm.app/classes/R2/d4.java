package R2;

import E2.e;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.r7;
import com.google.android.gms.internal.measurement.y0;

public final class d4
  implements Runnable
{
  public d4(C3 paramC3, y0 paramy0) {}
  
  public final void run()
  {
    Object localObject = p.u();
    if ((r7.a()) && (((m3)localObject).f().s(K.D0))) {
      if (!((m3)localObject).i().J().y()) {
        localObject = ((m3)localObject).j().M();
      }
    }
    for (String str = "Analytics storage consent denied; will not get session id";; str = "getSessionId has been disabled.")
    {
      ((a2)localObject).a(str);
      do
      {
        localObject = null;
        break;
      } while ((((m3)localObject).i().y(((m3)localObject).b().a())) || (iq.a() == 0L));
      localObject = Long.valueOf(iq.a());
      break;
      localObject = ((m3)localObject).j().M();
    }
    if (localObject != null)
    {
      p.a.L().T(o, ((Long)localObject).longValue());
      return;
    }
    try
    {
      o.l(null);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      p.a.j().G().b("getSessionId failed with exception", localRemoteException);
    }
  }
}

/* Location:
 * Qualified Name:     R2.d4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */