package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zznv;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class zzny
{
  public static final zznv zza = new zzoa(null);
  
  public static <P> zznu zza(zzpg<P> paramzzpg)
  {
    zznx localzznx = new zznx();
    localzznx.zza(paramzzpg.zza());
    Iterator localIterator1 = paramzzpg.zzd().iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((List)localIterator1.next()).iterator();
      while (localIterator2.hasNext())
      {
        zzpi localzzpi = (zzpi)localIterator2.next();
        Object localObject = localzzpi.zzb();
        int i = zzob.zza[localObject.ordinal()];
        if (i != 1)
        {
          if (i != 2)
          {
            if (i == 3) {
              localObject = zzbq.zzc;
            } else {
              throw new IllegalStateException("Unknown key status");
            }
          }
          else {
            localObject = zzbq.zzb;
          }
        }
        else {
          localObject = zzbq.zza;
        }
        i = localzzpi.zza();
        String str = localzzpi.zze();
        if (str.startsWith("type.googleapis.com/google.crypto.")) {
          str = str.substring(34);
        }
        localzznx.zza((com.google.android.gms.internal.firebase-auth-api.zzbq)localObject, i, str, localzzpi.zzc().name());
      }
    }
    if (paramzzpg.zzb() != null) {
      localzznx.zza(paramzzpg.zzb().zza());
    }
    try
    {
      paramzzpg = localzznx.zza();
      return paramzzpg;
    }
    catch (GeneralSecurityException paramzzpg)
    {
      throw new IllegalStateException(paramzzpg);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzny
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */