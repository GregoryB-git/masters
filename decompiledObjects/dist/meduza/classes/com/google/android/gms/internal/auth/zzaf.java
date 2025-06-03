package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class zzaf
  extends zzah
{
  public zzaf(zzag paramzzag) {}
  
  public final void zzc(boolean paramBoolean)
  {
    zzag localzzag = zza;
    Status localStatus;
    if (paramBoolean) {
      localStatus = Status.e;
    } else {
      localStatus = zzal.zza();
    }
    localzzag.setResult(new zzak(localStatus));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzaf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */