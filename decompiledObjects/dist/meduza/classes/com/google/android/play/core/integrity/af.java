package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import m7.e;
import m7.f;
import m7.s;
import m7.t;
import m7.v;
import m7.w;

final class af
  extends w
{
  public af(aj paramaj, TaskCompletionSource paramTaskCompletionSource1, byte[] paramArrayOfByte, Long paramLong, Parcelable paramParcelable, TaskCompletionSource paramTaskCompletionSource2, IntegrityTokenRequest paramIntegrityTokenRequest)
  {
    super(paramTaskCompletionSource1);
  }
  
  public final void a(Exception paramException)
  {
    if ((paramException instanceof f))
    {
      super.a(new IntegrityServiceException(-9, paramException));
      return;
    }
    super.a(paramException);
  }
  
  public final void b()
  {
    try
    {
      Object localObject1 = e;
      localObject2 = (s)a.n;
      localObject1 = aj.a((aj)localObject1, a, b, null);
      localObject3 = new com/google/android/play/core/integrity/ai;
      ((ai)localObject3).<init>(e, c);
      ((s)localObject2).z1((Bundle)localObject1, (t)localObject3);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject3 = e;
      Object localObject2 = d;
      aj.f((aj)localObject3).a("requestIntegrityToken(%s)", localRemoteException, new Object[] { localObject2 });
      c.trySetException(new IntegrityServiceException(-100, localRemoteException));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.af
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */