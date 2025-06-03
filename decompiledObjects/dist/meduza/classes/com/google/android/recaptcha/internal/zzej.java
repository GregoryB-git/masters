package com.google.android.recaptcha.internal;

import ec.i;

public final class zzej
{
  private final String zza;
  private final long zzb;
  private final int zzc;
  
  public zzej(String paramString, long paramLong, int paramInt)
  {
    zza = paramString;
    zzb = paramLong;
    zzc = paramInt;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof zzej))
    {
      paramObject = (zzej)paramObject;
      if ((i.a(zza, zza)) && (zzb == zzb) && (zzc == zzc)) {
        return true;
      }
    }
    return false;
  }
  
  public final int zza()
  {
    return zzc;
  }
  
  public final long zzb()
  {
    return zzb;
  }
  
  public final String zzc()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzej
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */