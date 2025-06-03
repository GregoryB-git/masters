package com.google.android.recaptcha.internal;

final class zzou
  implements zzof
{
  private final zzoi zza;
  private final String zzb;
  private final Object[] zzc;
  private final int zzd;
  
  public zzou(zzoi paramzzoi, String paramString, Object[] paramArrayOfObject)
  {
    zza = paramzzoi;
    zzb = paramString;
    zzc = paramArrayOfObject;
    int i = paramString.charAt(0);
    if (i < 55296)
    {
      zzd = i;
      return;
    }
    int j = i & 0x1FFF;
    i = 1;
    int k = 13;
    int m;
    for (;;)
    {
      m = paramString.charAt(i);
      if (m < 55296) {
        break;
      }
      j |= (m & 0x1FFF) << k;
      k += 13;
      i++;
    }
    zzd = (j | m << k);
  }
  
  public final zzoi zza()
  {
    return zza;
  }
  
  public final boolean zzb()
  {
    return (zzd & 0x2) == 2;
  }
  
  public final int zzc()
  {
    int i = zzd;
    if ((i & 0x1) != 0) {
      return 1;
    }
    if ((i & 0x4) == 4) {
      return 3;
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
 * Qualified Name:     com.google.android.recaptcha.internal.zzou
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */