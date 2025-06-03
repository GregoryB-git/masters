package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import f6.b;
import k6.j;

final class zzbu
  implements j
{
  private final Status zza;
  private b zzb;
  
  public zzbu(Status paramStatus)
  {
    zza = paramStatus;
  }
  
  public zzbu(b paramb)
  {
    zzb = paramb;
    zza = Status.e;
  }
  
  public final b getResponse()
  {
    return zzb;
  }
  
  public final Status getStatus()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzbu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */