package com.google.android.gms.internal.firebase_auth_api;

final class zzafq
  extends zzahe
{
  private final String zza;
  private final String zzb;
  
  public zzafq(String paramString1, String paramString2)
  {
    zza = paramString1;
    zzb = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzahe))
    {
      paramObject = (zzahe)paramObject;
      String str = zza;
      if (str == null ? ((zzahe)paramObject).zzb() == null : str.equals(((zzahe)paramObject).zzb()))
      {
        str = zzb;
        paramObject = ((zzahe)paramObject).zza();
        if (str == null ? paramObject == null : str.equals(paramObject)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    String str = zza;
    int i = 0;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    str = zzb;
    if (str != null) {
      i = str.hashCode();
    }
    return (j ^ 0xF4243) * 1000003 ^ i;
  }
  
  public final String toString()
  {
    String str1 = zza;
    String str2 = zzb;
    StringBuilder localStringBuilder = new StringBuilder("RecaptchaEnforcementState{provider=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", enforcementState=");
    localStringBuilder.append(str2);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final String zza()
  {
    return zzb;
  }
  
  public final String zzb()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */