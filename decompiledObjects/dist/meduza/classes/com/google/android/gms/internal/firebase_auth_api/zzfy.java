package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import java.util.Objects;

public final class zzfy
  extends zzcr
{
  private final com.google.android.gms.internal.firebase-auth-api.zzfy.zza zza;
  
  private zzfy(com.google.android.gms.internal.firebase-auth-api.zzfy.zza paramzza)
  {
    zza = paramzza;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzfy zza(com.google.android.gms.internal.firebase-auth-api.zzfy.zza paramzza)
  {
    return new zzfy(paramzza);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzfy zzc()
  {
    return new zzfy(zza.zzc);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzfy)) {
      return false;
    }
    return zza == zza;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzfy.class, zza });
  }
  
  public final String toString()
  {
    return j.j("XChaCha20Poly1305 Parameters (variant: ", String.valueOf(zza), ")");
  }
  
  public final boolean zza()
  {
    return zza != zza.zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzfy.zza zzb()
  {
    return zza;
  }
  
  public static final class zza
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzfy.zza zza = new zza("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzfy.zza zzb = new zza("CRUNCHY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzfy.zza zzc = new zza("NO_PREFIX");
    private final String zzd;
    
    private zza(String paramString)
    {
      zzd = paramString;
    }
    
    public final String toString()
    {
      return zzd;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzfy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */