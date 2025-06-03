package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzall;
import com.google.android.gms.internal.firebase-auth-api.zzaln;

final class zzama
  implements zzall
{
  private final zzaln zza;
  private final String zzb;
  private final Object[] zzc;
  private final int zzd;
  
  public zzama(zzaln paramzzaln, String paramString, Object[] paramArrayOfObject)
  {
    zza = paramzzaln;
    zzb = paramString;
    zzc = paramArrayOfObject;
    int i = paramString.charAt(0);
    if (i < 55296)
    {
      zzd = i;
      return;
    }
    int j = i & 0x1FFF;
    int k = 13;
    int m;
    for (i = 1;; i++)
    {
      m = paramString.charAt(i);
      if (m < 55296) {
        break;
      }
      j |= (m & 0x1FFF) << k;
      k += 13;
    }
    zzd = (j | m << k);
  }
  
  public final zzaln zza()
  {
    return zza;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzalz zzb()
  {
    int i = zzd;
    if ((i & 0x1) != 0) {
      return zzalz.zza;
    }
    if ((i & 0x4) == 4) {
      return zzalz.zzc;
    }
    return zzalz.zzb;
  }
  
  public final boolean zzc()
  {
    return (zzd & 0x2) == 2;
  }
  
  public final String zzd()
  {
    return zzb;
  }
  
  public final Object[] zze()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzama
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */