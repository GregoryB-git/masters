package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

final class zzbr
  extends zzbd
{
  public zzbr(zzbs paramzzbs) {}
  
  public final void zzc(String paramString)
  {
    if (paramString != null)
    {
      zza.setResult(new zzbv(paramString));
      return;
    }
    zza.setResult(new zzbv(new Status(3006, null, null, null)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */