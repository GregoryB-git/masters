package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class zzad
  extends zzah
{
  public zzad(zzae paramzzae) {}
  
  public final void zzb(Account paramAccount)
  {
    zzae localzzae = zza;
    Status localStatus;
    if (paramAccount != null) {
      localStatus = Status.e;
    } else {
      localStatus = zzal.zza();
    }
    localzzae.setResult(new zzai(localStatus, paramAccount));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzad
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */