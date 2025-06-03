package com.google.android.recaptcha.internal;

import lc.k;
import p2.m0;

public final class zzbj
  implements Comparable
{
  private int zza;
  private long zzb;
  private long zzc;
  
  public final String toString()
  {
    String str1 = k.v0(String.valueOf(zzb / zza), 10);
    String str2 = k.v0(String.valueOf(zzc), 10);
    String str3 = k.v0(String.valueOf(zzb), 10);
    String str4 = k.v0(String.valueOf(zza), 5);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("avgExecutionTime: ");
    localStringBuilder.append(str1);
    localStringBuilder.append(" us| maxExecutionTime: ");
    localStringBuilder.append(str2);
    localStringBuilder.append(" us| totalTime: ");
    localStringBuilder.append(str3);
    localStringBuilder.append(" us| #Usages: ");
    localStringBuilder.append(str4);
    return localStringBuilder.toString();
  }
  
  public final int zza(zzbj paramzzbj)
  {
    return m0.s(Long.valueOf(zzb), Long.valueOf(zzb));
  }
  
  public final int zzb()
  {
    return zza;
  }
  
  public final long zzc()
  {
    return zzc;
  }
  
  public final long zzd()
  {
    return zzb;
  }
  
  public final void zze(long paramLong)
  {
    zzc = paramLong;
  }
  
  public final void zzf(long paramLong)
  {
    zzb = paramLong;
  }
  
  public final void zzg(int paramInt)
  {
    zza = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzbj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */