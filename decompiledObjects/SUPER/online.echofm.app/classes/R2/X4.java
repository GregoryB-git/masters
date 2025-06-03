package R2;

import A2.n;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public final class X4
  implements Runnable
{
  public X4(D4 paramD4, AtomicReference paramAtomicReference, String paramString1, String paramString2, String paramString3, W5 paramW5, boolean paramBoolean) {}
  
  public final void run()
  {
    Object localObject3;
    try
    {
      synchronized (o)
      {
        R1 localR1 = D4.B(u);
        if (localR1 == null)
        {
          u.j().G().d("(legacy) Failed to get user properties; not connected to service", Y1.v(p), q, r);
          o.set(Collections.emptyList());
          try
          {
            o.notify();
            return;
          }
          finally
          {
            break label242;
          }
        }
      }
      AtomicReference localAtomicReference2;
      label185:
      o.notify();
    }
    catch (RemoteException localRemoteException)
    {
      break label185;
      if (TextUtils.isEmpty(p))
      {
        n.i(s);
        localAtomicReference2 = o;
      }
      for (localObject3 = localRemoteException.x0(q, r, t, s);; localObject3 = ((R1)localObject3).W(p, q, r, t))
      {
        localAtomicReference2.set(localObject3);
        break;
        localAtomicReference2 = o;
      }
      D4.m0(u);
      for (localObject3 = o;; localObject3 = o)
      {
        localObject3.notify();
        break;
        u.j().G().d("(legacy) Failed to get user properties; remote exception", Y1.v(p), q, localObject3);
        o.set(Collections.emptyList());
      }
      return;
    }
    throw ((Throwable)localObject3);
    label242:
    throw ((Throwable)localObject3);
  }
}

/* Location:
 * Qualified Name:     R2.X4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */