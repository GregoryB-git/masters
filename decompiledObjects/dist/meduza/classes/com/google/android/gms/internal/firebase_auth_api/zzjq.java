package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.Set;

public final class zzjq
  extends zzkt
{
  private static final Set<zzcg> zza = (Set)zzpw.zza(new zzjp());
  private final com.google.android.gms.internal.firebase-auth-api.zzjq.zza zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzjq.zzd zzc;
  private final com.google.android.gms.internal.firebase-auth-api.zzjq.zzc zzd;
  private final com.google.android.gms.internal.firebase-auth-api.zzjq.zze zze;
  private final com.google.android.gms.internal.firebase-auth-api.zzcg zzf;
  private final com.google.android.gms.internal.firebase-auth-api.zzzn zzg;
  
  private zzjq(com.google.android.gms.internal.firebase-auth-api.zzjq.zza paramzza, com.google.android.gms.internal.firebase-auth-api.zzjq.zzd paramzzd, com.google.android.gms.internal.firebase-auth-api.zzjq.zzc paramzzc, com.google.android.gms.internal.firebase-auth-api.zzcg paramzzcg, com.google.android.gms.internal.firebase-auth-api.zzjq.zze paramzze, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn)
  {
    zzb = paramzza;
    zzc = paramzzd;
    zzd = paramzzc;
    zzf = paramzzcg;
    zze = paramzze;
    zzg = paramzzzn;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zzc()
  {
    return new zzb(null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzjq)) {
      return false;
    }
    paramObject = (zzjq)paramObject;
    return (Objects.equals(zzb, zzb)) && (Objects.equals(zzc, zzc)) && (Objects.equals(zzd, zzd)) && (Objects.equals(zzf, zzf)) && (Objects.equals(zze, zze)) && (Objects.equals(zzg, zzg));
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzjq.class, zzb, zzc, zzd, zzf, zze, zzg });
  }
  
  public final String toString()
  {
    return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", new Object[] { zzb, zzc, zzd, zzf, zze, zzg });
  }
  
  public final boolean zza()
  {
    return zze != zze.zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzcg zzb()
  {
    return zzf;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq.zza zzd()
  {
    return zzb;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzd zze()
  {
    return zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzc zzf()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzjq.zze zzg()
  {
    return zze;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzzn zzh()
  {
    return zzg;
  }
  
  public static final class zza
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zza zza = new zza("NIST_P256");
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zza zzb = new zza("NIST_P384");
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zza zzc = new zza("NIST_P521");
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zza zzd = new zza("X25519");
    private final String zze;
    
    private zza(String paramString)
    {
      zze = paramString;
    }
    
    public final String toString()
    {
      return zze;
    }
  }
  
  public static final class zzb
  {
    private com.google.android.gms.internal.firebase-auth-api.zzjq.zza zza = null;
    private com.google.android.gms.internal.firebase-auth-api.zzjq.zzd zzb = null;
    private com.google.android.gms.internal.firebase-auth-api.zzjq.zzc zzc = null;
    private com.google.android.gms.internal.firebase-auth-api.zzcg zzd = null;
    private com.google.android.gms.internal.firebase-auth-api.zzjq.zze zze = zzjq.zze.zzc;
    private com.google.android.gms.internal.firebase-auth-api.zzzn zzf = null;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzcg paramzzcg)
    {
      if (zzjq.zzi().contains(paramzzcg))
      {
        zzd = paramzzcg;
        return this;
      }
      throw new GeneralSecurityException(j.j("Invalid DEM parameters ", String.valueOf(paramzzcg), "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported."));
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzjq.zza paramzza)
    {
      zza = paramzza;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzjq.zzc paramzzc)
    {
      zzc = paramzzc;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzjq.zzd paramzzd)
    {
      zzb = paramzzd;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzjq.zze paramzze)
    {
      zze = paramzze;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzjq.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn)
    {
      if (paramzzzn.zza() == 0)
      {
        zzf = null;
        return this;
      }
      zzf = paramzzzn;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzjq zza()
    {
      com.google.android.gms.internal.firebase-auth-api.zzjq.zza localzza1 = zza;
      if (localzza1 != null)
      {
        if (zzb != null)
        {
          if (zzd != null)
          {
            if (zze != null)
            {
              com.google.android.gms.internal.firebase-auth-api.zzjq.zza localzza2 = zzjq.zza.zzd;
              if ((localzza1 != localzza2) && (zzc == null)) {
                throw new GeneralSecurityException("Point format is not set");
              }
              if ((localzza1 == localzza2) && (zzc != null)) {
                throw new GeneralSecurityException("For Curve25519 point format must not be set");
              }
              return new zzjq(zza, zzb, zzc, zzd, zze, zzf, null);
            }
            throw new GeneralSecurityException("Variant is not set");
          }
          throw new GeneralSecurityException("DEM parameters are not set");
        }
        throw new GeneralSecurityException("Hash type is not set");
      }
      throw new GeneralSecurityException("Elliptic curve type is not set");
    }
  }
  
  public static final class zzc
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zzc zza = new zzc("COMPRESSED");
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zzc zzb = new zzc("UNCOMPRESSED");
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zzc zzc = new zzc("LEGACY_UNCOMPRESSED");
    private final String zzd;
    
    private zzc(String paramString)
    {
      zzd = paramString;
    }
    
    public final String toString()
    {
      return zzd;
    }
  }
  
  public static final class zzd
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zzd zza = new zzd("SHA1");
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zzd zzb = new zzd("SHA224");
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zzd zzc = new zzd("SHA256");
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zzd zzd = new zzd("SHA384");
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zzd zze = new zzd("SHA512");
    private final String zzf;
    
    private zzd(String paramString)
    {
      zzf = paramString;
    }
    
    public final String toString()
    {
      return zzf;
    }
  }
  
  public static final class zze
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zze zza = new zze("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zze zzb = new zze("CRUNCHY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzjq.zze zzc = new zze("NO_PREFIX");
    private final String zzd;
    
    private zze(String paramString)
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzjq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */