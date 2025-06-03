package com.google.android.gms.internal.measurement;

import android.content.Context;
import n7.h;
import n7.q;

final class zzhf
  extends zzie
{
  private final Context zza;
  private final q<h<zzhr>> zzb;
  
  public zzhf(Context paramContext, q<h<zzhr>> paramq)
  {
    if (paramContext != null)
    {
      zza = paramContext;
      zzb = paramq;
      return;
    }
    throw new NullPointerException("Null context");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzie))
    {
      Object localObject = (zzie)paramObject;
      if (zza.equals(((zzie)localObject).zza()))
      {
        paramObject = zzb;
        localObject = ((zzie)localObject).zzb();
        if (paramObject == null ? localObject == null : paramObject.equals(localObject)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = zza.hashCode();
    q localq = zzb;
    int j;
    if (localq == null) {
      j = 0;
    } else {
      j = localq.hashCode();
    }
    return (i ^ 0xF4243) * 1000003 ^ j;
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(zza);
    String str2 = String.valueOf(zzb);
    StringBuilder localStringBuilder = new StringBuilder("FlagsContext{context=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", hermeticFileOverrides=");
    localStringBuilder.append(str2);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final Context zza()
  {
    return zza;
  }
  
  public final q<h<zzhr>> zzb()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */