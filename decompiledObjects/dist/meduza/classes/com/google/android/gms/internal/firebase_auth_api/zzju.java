package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Objects;

public final class zzju
  extends zzkt
{
  private final com.google.android.gms.internal.firebase-auth-api.zzju.zzd zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzju.zze zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzju.zza zzc;
  private final com.google.android.gms.internal.firebase-auth-api.zzju.zzf zzd;
  
  private zzju(com.google.android.gms.internal.firebase-auth-api.zzju.zzd paramzzd, com.google.android.gms.internal.firebase-auth-api.zzju.zze paramzze, com.google.android.gms.internal.firebase-auth-api.zzju.zza paramzza, com.google.android.gms.internal.firebase-auth-api.zzju.zzf paramzzf)
  {
    zza = paramzzd;
    zzb = paramzze;
    zzc = paramzza;
    zzd = paramzzf;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzju.zzb zzc()
  {
    return new zzb(null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzju)) {
      return false;
    }
    paramObject = (zzju)paramObject;
    return (zza == zza) && (zzb == zzb) && (zzc == zzc) && (zzd == zzd);
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzju.class, zza, zzb, zzc, zzd });
  }
  
  public final boolean zza()
  {
    return zzd != zzf.zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzju.zza zzb()
  {
    return zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzju.zze zzd()
  {
    return zzb;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzju.zzd zze()
  {
    return zza;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzju.zzf zzf()
  {
    return zzd;
  }
  
  public static final class zza
    extends zzju.zzc
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zza zza = new zza("AES_128_GCM", 1);
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zza zzb = new zza("AES_256_GCM", 2);
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zza zzc = new zza("CHACHA20_POLY1305", 3);
    
    private zza(String paramString, int paramInt)
    {
      super(paramInt, null);
    }
  }
  
  public static final class zzb
  {
    private com.google.android.gms.internal.firebase-auth-api.zzju.zzd zza = null;
    private com.google.android.gms.internal.firebase-auth-api.zzju.zze zzb = null;
    private com.google.android.gms.internal.firebase-auth-api.zzju.zza zzc = null;
    private com.google.android.gms.internal.firebase-auth-api.zzju.zzf zzd = zzju.zzf.zzc;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzju.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzju.zza paramzza)
    {
      zzc = paramzza;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzju.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzju.zzd paramzzd)
    {
      zza = paramzzd;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzju.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzju.zze paramzze)
    {
      zzb = paramzze;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzju.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzju.zzf paramzzf)
    {
      zzd = paramzzf;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzju zza()
    {
      com.google.android.gms.internal.firebase-auth-api.zzju.zzd localzzd = zza;
      if (localzzd != null)
      {
        com.google.android.gms.internal.firebase-auth-api.zzju.zze localzze = zzb;
        if (localzze != null)
        {
          com.google.android.gms.internal.firebase-auth-api.zzju.zza localzza = zzc;
          if (localzza != null)
          {
            com.google.android.gms.internal.firebase-auth-api.zzju.zzf localzzf = zzd;
            if (localzzf != null) {
              return new zzju(localzzd, localzze, localzza, localzzf, null);
            }
            throw new GeneralSecurityException("HPKE variant is not set");
          }
          throw new GeneralSecurityException("HPKE AEAD parameter is not set");
        }
        throw new GeneralSecurityException("HPKE KDF parameter is not set");
      }
      throw new GeneralSecurityException("HPKE KEM parameter is not set");
    }
  }
  
  public static class zzc
  {
    private final String zza;
    private final int zzb;
    
    private zzc(String paramString, int paramInt)
    {
      zza = paramString;
      zzb = paramInt;
    }
    
    public String toString()
    {
      return String.format("%s(0x%04x)", new Object[] { zza, Integer.valueOf(zzb) });
    }
  }
  
  public static final class zzd
    extends zzju.zzc
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zzd zza = new zzd("DHKEM_P256_HKDF_SHA256", 16);
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zzd zzb = new zzd("DHKEM_P384_HKDF_SHA384", 17);
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zzd zzc = new zzd("DHKEM_P521_HKDF_SHA512", 18);
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zzd zzd = new zzd("DHKEM_X25519_HKDF_SHA256", 32);
    
    private zzd(String paramString, int paramInt)
    {
      super(paramInt, null);
    }
  }
  
  public static final class zze
    extends zzju.zzc
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zze zza = new zze("HKDF_SHA256", 1);
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zze zzb = new zze("HKDF_SHA384", 2);
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zze zzc = new zze("HKDF_SHA512", 3);
    
    private zze(String paramString, int paramInt)
    {
      super(paramInt, null);
    }
  }
  
  public static final class zzf
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zzf zza = new zzf("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zzf zzb = new zzf("CRUNCHY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzju.zzf zzc = new zzf("NO_PREFIX");
    private final String zzd;
    
    private zzf(String paramString)
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzju
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */