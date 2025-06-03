package com.google.android.gms.internal.firebase_auth_api;

final class zzap
{
  private final Object zza;
  private final Object zzb;
  private final Object zzc;
  
  public zzap(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    zza = paramObject1;
    zzb = paramObject2;
    zzc = paramObject3;
  }
  
  public final IllegalArgumentException zza()
  {
    String str1 = String.valueOf(zza);
    String str2 = String.valueOf(zzb);
    String str3 = String.valueOf(zza);
    String str4 = String.valueOf(zzc);
    StringBuilder localStringBuilder = new StringBuilder("Multiple entries with same key: ");
    localStringBuilder.append(str1);
    localStringBuilder.append("=");
    localStringBuilder.append(str2);
    localStringBuilder.append(" and ");
    localStringBuilder.append(str3);
    localStringBuilder.append("=");
    localStringBuilder.append(str4);
    return new IllegalArgumentException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */