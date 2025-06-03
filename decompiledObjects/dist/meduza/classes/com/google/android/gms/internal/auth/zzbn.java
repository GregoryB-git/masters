package com.google.android.gms.internal.auth;

import b.a0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzbn
  extends zzbd
{
  public zzbn(zzbo paramzzbo, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void zzc(String paramString)
  {
    Status localStatus;
    if (paramString != null) {
      localStatus = Status.e;
    } else {
      localStatus = new Status(3006, null, null, null);
    }
    a0.K(localStatus, paramString, zza);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */