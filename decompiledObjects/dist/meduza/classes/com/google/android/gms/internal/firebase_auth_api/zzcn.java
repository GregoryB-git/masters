package com.google.android.gms.internal.firebase_auth_api;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

final class zzcn
{
  static
  {
    Charset.forName("UTF-8");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzwo zza(com.google.android.gms.internal.firebase-auth-api.zzwl paramzzwl)
  {
    com.google.android.gms.internal.firebase-auth-api.zzwo.zzb localzzb = zzwo.zza().zza(paramzzwl.zzb());
    paramzzwl = paramzzwl.zze().iterator();
    while (paramzzwl.hasNext())
    {
      zzwl.zza localzza = (zzwl.zza)paramzzwl.next();
      localzzb.zza((zzwo.zza)zzwo.zza.zza().zza(localzza.zzb().zzf()).zza(localzza.zzc()).zza(localzza.zzf()).zza(localzza.zza()).zze());
    }
    return (zzwo)localzzb.zze();
  }
  
  public static void zzb(com.google.android.gms.internal.firebase-auth-api.zzwl paramzzwl)
  {
    int i = paramzzwl.zzb();
    Iterator localIterator = paramzzwl.zze().iterator();
    int j = 1;
    int k = 0;
    int m = k;
    while (localIterator.hasNext())
    {
      paramzzwl = (zzwl.zza)localIterator.next();
      if (paramzzwl.zzc() == zzwc.zzb) {
        if (paramzzwl.zzg())
        {
          if (paramzzwl.zzf() != zzxd.zza)
          {
            if (paramzzwl.zzc() != zzwc.zza)
            {
              int n = m;
              if (paramzzwl.zza() == i) {
                if (m == 0) {
                  n = 1;
                } else {
                  throw new GeneralSecurityException("keyset contains multiple primary keys");
                }
              }
              if (paramzzwl.zzb().zzb() != zzwb.zza.zzd) {
                j = 0;
              }
              k++;
              m = n;
            }
            else
            {
              throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[] { Integer.valueOf(paramzzwl.zza()) }));
            }
          }
          else {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[] { Integer.valueOf(paramzzwl.zza()) }));
          }
        }
        else {
          throw new GeneralSecurityException(String.format("key %d has no key data", new Object[] { Integer.valueOf(paramzzwl.zza()) }));
        }
      }
    }
    if (k != 0)
    {
      if ((m == 0) && (j == 0)) {
        throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
      }
      return;
    }
    throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzcn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */