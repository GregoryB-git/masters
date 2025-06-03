package com.google.android.gms.internal.auth;

final class zzgh
  implements zzfu
{
  private final zzfx zza;
  private final String zzb;
  private final Object[] zzc;
  private final int zzd;
  
  public zzgh(zzfx paramzzfx, String paramString, Object[] paramArrayOfObject)
  {
    zza = paramzzfx;
    zzb = "\001\001\000\000\001\001\001\000\001\000\001\032";
    zzc = paramArrayOfObject;
    int i = "\001\001\000\000\001\001\001\000\001\000\001\032".charAt(0);
    if (i < 55296)
    {
      zzd = i;
      return;
    }
    i &= 0x1FFF;
    int j = 1;
    int k = 13;
    int m;
    for (;;)
    {
      m = "\001\001\000\000\001\001\001\000\001\000\001\032".charAt(j);
      if (m < 55296) {
        break;
      }
      i |= (m & 0x1FFF) << k;
      k += 13;
      j++;
    }
    zzd = (m << k | i);
  }
  
  public final zzfx zza()
  {
    return zza;
  }
  
  public final boolean zzb()
  {
    return (zzd & 0x2) == 2;
  }
  
  public final int zzc()
  {
    if ((zzd & 0x1) != 0) {
      return 1;
    }
    return 2;
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
 * Qualified Name:     com.google.android.gms.internal.auth.zzgh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */