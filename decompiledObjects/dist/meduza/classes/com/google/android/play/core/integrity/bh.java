package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import m7.e;
import m7.p;
import m7.v;

final class bh
  extends bm
{
  public bh(bn parambn, TaskCompletionSource paramTaskCompletionSource1, Bundle paramBundle, Activity paramActivity, TaskCompletionSource paramTaskCompletionSource2, int paramInt)
  {
    super(parambn, paramTaskCompletionSource1);
  }
  
  public final void b()
  {
    if (bn.k(e))
    {
      super.a(new StandardIntegrityException(-2, null));
      return;
    }
    try
    {
      bn localbn = e;
      localObject = a;
      ((p)n).y(a, bn.h(localbn).a(b, c, (e)localObject));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = e;
      int i = d;
      bn.i((bn)localObject).a("requestAndShowDialog(%s)", localRemoteException, new Object[] { Integer.valueOf(i) });
      c.trySetException(new StandardIntegrityException(-100, localRemoteException));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.bh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */