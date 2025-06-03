package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import m7.e;
import m7.p;
import m7.q;
import m7.v;

final class bg
  extends bm
{
  public bg(bn parambn, TaskCompletionSource paramTaskCompletionSource1, int paramInt, String paramString, long paramLong1, long paramLong2, TaskCompletionSource paramTaskCompletionSource2)
  {
    super(parambn, paramTaskCompletionSource1);
  }
  
  public final void b()
  {
    if (!bn.k(e)) {
      try
      {
        localObject1 = e;
        localObject2 = (p)a.n;
        Bundle localBundle = bn.a((bn)localObject1, a, b, c, 0);
        localObject1 = new com/google/android/play/core/integrity/bk;
        ((bk)localObject1).<init>(e, d, b);
        ((p)localObject2).z0(localBundle, (q)localObject1);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1 = e;
        Object localObject2 = a;
        bn.i((bn)localObject1).a("requestExpressIntegrityToken(%s, %s)", localRemoteException, new Object[] { localObject2, Long.valueOf(b) });
        d.trySetException(new StandardIntegrityException(-100, localRemoteException));
        return;
      }
    }
    super.a(new StandardIntegrityException(-2, null));
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.bg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */