package com.google.android.gms.internal.auth_api_phone;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback.Stub;
import com.google.android.gms.internal.auth-api-phone.zzv;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzu
  extends IStatusCallback.Stub
{
  public zzu(zzv paramzzv, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void onResult(Status paramStatus)
  {
    if (a == 6)
    {
      zza.trySetException(a0.r(paramStatus));
      return;
    }
    a0.K(paramStatus, null, zza);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth_api_phone.zzu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */