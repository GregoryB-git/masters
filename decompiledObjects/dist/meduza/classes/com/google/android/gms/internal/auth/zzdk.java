package com.google.android.gms.internal.auth;

import g;
import java.io.Serializable;

final class zzdk
  implements Serializable, zzdj
{
  public final zzdj zza;
  public volatile transient boolean zzb;
  public transient Object zzc;
  
  public zzdk(zzdj paramzzdj)
  {
    zza = paramzzdj;
  }
  
  public final String toString()
  {
    Object localObject;
    if (zzb) {
      localObject = g.e("<supplier that returned ", String.valueOf(zzc), ">");
    } else {
      localObject = zza;
    }
    return g.e("Suppliers.memoize(", localObject.toString(), ")");
  }
  
  public final Object zza()
  {
    if (!zzb) {
      try
      {
        if (!zzb)
        {
          Object localObject1 = zza.zza();
          zzc = localObject1;
          zzb = true;
          return localObject1;
        }
      }
      finally {}
    }
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzdk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */