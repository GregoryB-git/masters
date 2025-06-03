package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import java.util.Objects;

public final class zzeg
  extends zzcr
{
  private final com.google.android.gms.internal.firebase-auth-api.zzeg.zza zza;
  
  private zzeg(com.google.android.gms.internal.firebase-auth-api.zzeg.zza paramzza)
  {
    zza = paramzza;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzeg zza(com.google.android.gms.internal.firebase-auth-api.zzeg.zza paramzza)
  {
    return new zzeg(paramzza);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzeg)) {
      return false;
    }
    return zza == zza;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzeg.class, zza });
  }
  
  public final String toString()
  {
    return j.j("ChaCha20Poly1305 Parameters (variant: ", String.valueOf(zza), ")");
  }
  
  public final boolean zza()
  {
    return zza != zza.zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzeg.zza zzb()
  {
    return zza;
  }
  
  public static final class zza
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzeg.zza zza = new zza("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzeg.zza zzb = new zza("CRUNCHY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzeg.zza zzc = new zza("NO_PREFIX");
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzeg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */