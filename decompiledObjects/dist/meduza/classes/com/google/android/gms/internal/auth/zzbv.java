package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

public final class zzbv
  implements k6.j
{
  private final Status zza;
  private final String zzb;
  
  public zzbv(Status paramStatus)
  {
    m6.j.i(paramStatus);
    zza = paramStatus;
    zzb = "";
  }
  
  public zzbv(String paramString)
  {
    m6.j.i(paramString);
    zzb = paramString;
    zza = Status.e;
  }
  
  public final String getSpatulaHeader()
  {
    return zzb;
  }
  
  public final Status getStatus()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */