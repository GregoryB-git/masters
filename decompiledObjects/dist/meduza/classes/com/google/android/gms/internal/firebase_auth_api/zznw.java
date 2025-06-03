package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbq;
import java.util.Objects;

public final class zznw
{
  private final zzbq zza;
  private final int zzb;
  private final String zzc;
  private final String zzd;
  
  private zznw(zzbq paramzzbq, int paramInt, String paramString1, String paramString2)
  {
    zza = paramzzbq;
    zzb = paramInt;
    zzc = paramString1;
    zzd = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zznw)) {
      return false;
    }
    paramObject = (zznw)paramObject;
    return (zza == zza) && (zzb == zzb) && (zzc.equals(zzc)) && (zzd.equals(zzd));
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { zza, Integer.valueOf(zzb), zzc, zzd });
  }
  
  public final String toString()
  {
    return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", new Object[] { zza, Integer.valueOf(zzb), zzc, zzd });
  }
  
  public final int zza()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zznw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */