package com.google.android.gms.internal.firebase_auth_api;

import java.util.Objects;

public final class zznp
  extends zzcg
{
  private final com.google.android.gms.internal.firebase-auth-api.zzpm zza;
  
  public zznp(com.google.android.gms.internal.firebase-auth-api.zzpm paramzzpm)
  {
    zza = paramzzpm;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zznp)) {
      return false;
    }
    paramObject = zza;
    return (zza.zza().zzd().equals(((zzpm)paramObject).zza().zzd())) && (zza.zza().zzf().equals(((zzpm)paramObject).zza().zzf())) && (zza.zza().zze().equals(((zzpm)paramObject).zza().zze()));
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { zza.zza(), zza.zzb() });
  }
  
  public final String toString()
  {
    String str = zza.zza().zzf();
    Object localObject = zza.zza().zzd();
    int i = zzno.zza[localObject.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            localObject = "UNKNOWN";
          } else {
            localObject = "CRUNCHY";
          }
        }
        else {
          localObject = "RAW";
        }
      }
      else {
        localObject = "LEGACY";
      }
    }
    else {
      localObject = "TINK";
    }
    return String.format("(typeUrl=%s, outputPrefixType=%s)", new Object[] { str, localObject });
  }
  
  public final boolean zza()
  {
    return zza.zza().zzd() != zzxd.zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzpm zzb()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zznp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */