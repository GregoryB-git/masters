package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import m7.e;
import m7.s;
import m7.v;
import m7.w;

final class ag
  extends w
{
  public ag(aj paramaj, TaskCompletionSource paramTaskCompletionSource1, Bundle paramBundle, Activity paramActivity, TaskCompletionSource paramTaskCompletionSource2, int paramInt)
  {
    super(paramTaskCompletionSource1);
  }
  
  public final void b()
  {
    try
    {
      aj localaj1 = e;
      ((s)a.n).y(a, aj.e(localaj1).a(b, c, a));
      return;
    }
    catch (RemoteException localRemoteException)
    {
      aj localaj2 = e;
      int i = d;
      aj.f(localaj2).a("requestAndShowDialog(%s)", localRemoteException, new Object[] { Integer.valueOf(i) });
      c.trySetException(new IntegrityServiceException(-100, localRemoteException));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */