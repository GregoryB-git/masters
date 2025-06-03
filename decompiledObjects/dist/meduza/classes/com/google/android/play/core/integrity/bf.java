package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import m7.e;
import m7.p;
import m7.v;

final class bf
  extends bm
{
  public bf(bn parambn, TaskCompletionSource paramTaskCompletionSource1, int paramInt, long paramLong, TaskCompletionSource paramTaskCompletionSource2)
  {
    super(parambn, paramTaskCompletionSource1);
  }
  
  public final void b()
  {
    if (!bn.k(c)) {
      try
      {
        localObject = c;
        p localp = (p)a.n;
        localObject = bn.b((bn)localObject, a, 0);
        bl localbl = new com/google/android/play/core/integrity/bl;
        localbl.<init>(c, b);
        localp.J((Bundle)localObject, localbl);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject = c;
        long l = a;
        bn.i((bn)localObject).a("warmUpIntegrityToken(%s)", localRemoteException, new Object[] { Long.valueOf(l) });
        b.trySetException(new StandardIntegrityException(-100, localRemoteException));
        return;
      }
    }
    super.a(new StandardIntegrityException(-2, null));
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.bf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */