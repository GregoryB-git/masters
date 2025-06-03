package com.google.android.gms.internal.firebase_auth_api;

import java.util.Objects;

public final class zzep
  extends zzcr
{
  private final String zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzep.zza zzb;
  
  private zzep(String paramString, com.google.android.gms.internal.firebase-auth-api.zzep.zza paramzza)
  {
    zza = paramString;
    zzb = paramzza;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzep zza(String paramString, com.google.android.gms.internal.firebase-auth-api.zzep.zza paramzza)
  {
    return new zzep(paramString, paramzza);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzep)) {
      return false;
    }
    paramObject = (zzep)paramObject;
    return (zza.equals(zza)) && (zzb.equals(zzb));
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzep.class, zza, zzb });
  }
  
  public final String toString()
  {
    String str1 = zza;
    String str2 = String.valueOf(zzb);
    StringBuilder localStringBuilder = new StringBuilder("LegacyKmsAead Parameters (keyUri: ");
    localStringBuilder.append(str1);
    localStringBuilder.append(", variant: ");
    localStringBuilder.append(str2);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final boolean zza()
  {
    return zzb != zza.zzb;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzep.zza zzb()
  {
    return zzb;
  }
  
  public final String zzc()
  {
    return zza;
  }
  
  public static final class zza
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzep.zza zza = new zza("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzep.zza zzb = new zza("NO_PREFIX");
    private final String zzc;
    
    private zza(String paramString)
    {
      zzc = paramString;
    }
    
    public final String toString()
    {
      return zzc;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzep
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */