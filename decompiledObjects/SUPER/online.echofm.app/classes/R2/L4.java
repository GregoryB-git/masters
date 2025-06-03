package R2;

import A2.n;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

public final class L4
  implements Runnable
{
  public L4(D4 paramD4, AtomicReference paramAtomicReference, W5 paramW5) {}
  
  public final void run()
  {
    Object localObject3;
    try
    {
      synchronized (o)
      {
        if (!q.i().J().y())
        {
          q.j().M().a("Analytics storage consent denied; will not get app instance id");
          q.r().T(null);
          q.i().g.b(null);
          o.set(null);
          try
          {
            o.notify();
            return;
          }
          finally
          {
            break label250;
          }
        }
      }
      label214:
      o.notify();
    }
    catch (RemoteException localRemoteException)
    {
      break label214;
      localObject3 = D4.B(q);
      if (localObject3 == null)
      {
        q.j().G().a("Failed to get app instance id");
        o.notify();
        return;
      }
      n.i(p);
      o.set(((R1)localObject3).G(p));
      localObject3 = (String)o.get();
      if (localObject3 != null)
      {
        q.r().T((String)localObject3);
        q.i().g.b((String)localObject3);
      }
      D4.m0(q);
      for (localObject3 = o;; localObject3 = o)
      {
        localObject3.notify();
        break;
        q.j().G().b("Failed to get app instance id", localObject3);
      }
      return;
    }
    throw ((Throwable)localObject3);
    label250:
    throw ((Throwable)localObject3);
  }
}

/* Location:
 * Qualified Name:     R2.L4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */