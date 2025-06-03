package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Objects;

public final class zzft
  extends zzcr
{
  private final com.google.android.gms.internal.firebase-auth-api.zzft.zza zza;
  private final int zzb;
  
  private zzft(com.google.android.gms.internal.firebase-auth-api.zzft.zza paramzza, int paramInt)
  {
    zza = paramzza;
    zzb = paramInt;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzft zza(com.google.android.gms.internal.firebase-auth-api.zzft.zza paramzza, int paramInt)
  {
    if ((paramInt >= 8) && (paramInt <= 12)) {
      return new zzft(paramzza, paramInt);
    }
    throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzft)) {
      return false;
    }
    paramObject = (zzft)paramObject;
    return (zza == zza) && (zzb == zzb);
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzft.class, zza, Integer.valueOf(zzb) });
  }
  
  public final String toString()
  {
    String str = String.valueOf(zza);
    int i = zzb;
    StringBuilder localStringBuilder = new StringBuilder("X-AES-GCM Parameters (variant: ");
    localStringBuilder.append(str);
    localStringBuilder.append("salt_size_bytes: ");
    localStringBuilder.append(i);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public final boolean zza()
  {
    return zza != zza.zzb;
  }
  
  public final int zzb()
  {
    return zzb;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzft.zza zzc()
  {
    return zza;
  }
  
  public static final class zza
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzft.zza zza = new zza("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzft.zza zzb = new zza("NO_PREFIX");
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzft
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */