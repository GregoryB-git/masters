package com.google.android.recaptcha.internal;

import java.util.List;

final class zznv
{
  public static final List zza(Object paramObject, long paramLong)
  {
    zznk localzznk1 = (zznk)zzps.zzf(paramObject, paramLong);
    zznk localzznk2 = localzznk1;
    if (!localzznk1.zzc())
    {
      int i = localzznk1.size();
      if (i == 0) {
        i = 10;
      } else {
        i += i;
      }
      localzznk2 = localzznk1.zzd(i);
      zzps.zzs(paramObject, paramLong, localzznk2);
    }
    return localzznk2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zznv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */