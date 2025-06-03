package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback.Stub;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzx
  extends IStatusCallback.Stub
{
  public zzx(zzab paramzzab, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void onResult(Status paramStatus)
  {
    zzab.zzf(paramStatus, null, zza);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */