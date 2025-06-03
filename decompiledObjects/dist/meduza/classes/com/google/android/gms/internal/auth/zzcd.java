package com.google.android.gms.internal.auth;

import android.content.Context;

final class zzcd
  extends zzda
{
  private final Context zza;
  private final zzdj zzb;
  
  public zzcd(Context paramContext, zzdj paramzzdj)
  {
    zza = paramContext;
    zzb = paramzzdj;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzda))
    {
      paramObject = (zzda)paramObject;
      if ((zza.equals(((zzda)paramObject).zza())) && (zzb.equals(((zzda)paramObject).zzb()))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (zza.hashCode() ^ 0xF4243) * 1000003 ^ zzb.hashCode();
  }
  
  public final String toString()
  {
    String str1 = zza.toString();
    String str2 = zzb.toString();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("FlagsContext{context=");
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
  
  public final zzdj zzb()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzcd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */