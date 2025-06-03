package R2;

import A2.n;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

public final class V4
  implements Runnable
{
  public V4(D4 paramD4, AtomicReference paramAtomicReference, String paramString1, String paramString2, String paramString3, W5 paramW5) {}
  
  public final void run()
  {
    Object localObject3;
    try
    {
      synchronized (o)
      {
        R1 localR1 = D4.B(t);
        if (localR1 == null)
        {
          t.j().G().d("(legacy) Failed to get conditional properties; not connected to service", Y1.v(p), q, r);
          o.set(Collections.emptyList());
          try
          {
            o.notify();
            return;
          }
          finally
          {
            break label234;
          }
        }
      }
      AtomicReference localAtomicReference2;
      label177:
      o.notify();
    }
    catch (RemoteException localRemoteException)
    {
      break label177;
      if (TextUtils.isEmpty(p))
      {
        n.i(s);
        localAtomicReference2 = o;
      }
      for (localObject3 = localRemoteException.V0(q, r, s);; localObject3 = ((R1)localObject3).K0(p, q, r))
      {
        localAtomicReference2.set(localObject3);
        break;
        localAtomicReference2 = o;
      }
      D4.m0(t);
      for (localObject3 = o;; localObject3 = o)
      {
        localObject3.notify();
        break;
        t.j().G().d("(legacy) Failed to get conditional properties; remote exception", Y1.v(p), q, localObject3);
        o.set(Collections.emptyList());
      }
      return;
    }
    throw ((Throwable)localObject3);
    label234:
    throw ((Throwable)localObject3);
  }
}

/* Location:
 * Qualified Name:     R2.V4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */