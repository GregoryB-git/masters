package com.google.android.gms.internal.auth;

import java.io.Serializable;

public final class zzdo
{
  public static zzdj zza(zzdj paramzzdj)
  {
    if ((!(paramzzdj instanceof zzdm)) && (!(paramzzdj instanceof zzdk)))
    {
      if ((paramzzdj instanceof Serializable)) {
        paramzzdj = new zzdk(paramzzdj);
      } else {
        paramzzdj = new zzdm(paramzzdj);
      }
      return paramzzdj;
    }
    return paramzzdj;
  }
  
  public static zzdj zzb(Object paramObject)
  {
    return new zzdn(paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzdo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */