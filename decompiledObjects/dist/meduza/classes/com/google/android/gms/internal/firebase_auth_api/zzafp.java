package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzagh;
import g;

final class zzafp
  extends zzahf
{
  private final String zza;
  private final String zzb;
  private final String zzc;
  private final zzagh zzd;
  private final String zze;
  
  private zzafp(String paramString1, String paramString2, String paramString3, zzagh paramzzagh, String paramString4)
  {
    zza = paramString1;
    zzb = paramString2;
    zzc = paramString3;
    zzd = paramzzagh;
    zze = paramString4;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzahf))
    {
      paramObject = (zzahf)paramObject;
      if (zza.equals(((zzahf)paramObject).zzd()))
      {
        String str = zzb;
        if ((str == null ? ((zzahf)paramObject).zze() == null : str.equals(((zzahf)paramObject).zze())) && (zzc.equals(((zzahf)paramObject).zzf())) && (zzd.equals(((zzahf)paramObject).zzb())) && (zze.equals(((zzahf)paramObject).zzc()))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = zza.hashCode();
    String str = zzb;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    return ((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ zzc.hashCode()) * 1000003 ^ zzd.hashCode()) * 1000003 ^ zze.hashCode();
  }
  
  public final String toString()
  {
    String str1 = zza;
    String str2 = zzb;
    String str3 = zzc;
    String str4 = String.valueOf(zzd);
    String str5 = zze;
    StringBuilder localStringBuilder = new StringBuilder("RevokeTokenRequest{providerId=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", tenantId=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", token=");
    localStringBuilder.append(str3);
    localStringBuilder.append(", tokenType=");
    localStringBuilder.append(str4);
    localStringBuilder.append(", idToken=");
    return g.f(localStringBuilder, str5, "}");
  }
  
  public final zzagh zzb()
  {
    return zzd;
  }
  
  public final String zzc()
  {
    return zze;
  }
  
  public final String zzd()
  {
    return zza;
  }
  
  public final String zze()
  {
    return zzb;
  }
  
  public final String zzf()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */