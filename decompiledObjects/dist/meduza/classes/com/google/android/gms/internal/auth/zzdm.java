package com.google.android.gms.internal.auth;

import g;

final class zzdm
  implements zzdj
{
  private static final zzdj zza = zzdl.zza;
  private volatile zzdj zzb;
  private Object zzc;
  
  public zzdm(zzdj paramzzdj)
  {
    zzb = paramzzdj;
  }
  
  public final String toString()
  {
    zzdj localzzdj = zzb;
    Object localObject = localzzdj;
    if (localzzdj == zza) {
      localObject = g.e("<supplier that returned ", String.valueOf(zzc), ">");
    }
    return g.e("Suppliers.memoize(", String.valueOf(localObject), ")");
  }
  
  public final Object zza()
  {
    Object localObject1 = zzb;
    zzdj localzzdj = zza;
    if (localObject1 != localzzdj) {
      try
      {
        if (zzb != localzzdj)
        {
          localObject1 = zzb.zza();
          zzc = localObject1;
          zzb = localzzdj;
          return localObject1;
        }
      }
      finally {}
    }
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzdm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */