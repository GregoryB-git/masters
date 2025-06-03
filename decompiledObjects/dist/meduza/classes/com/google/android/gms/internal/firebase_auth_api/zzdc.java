package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class zzdc
  extends zzcr
{
  private final int zza;
  private final int zzb;
  private final int zzc;
  private final int zzd;
  private final com.google.android.gms.internal.firebase-auth-api.zzdc.zzc zze;
  private final com.google.android.gms.internal.firebase-auth-api.zzdc.zza zzf;
  
  private zzdc(int paramInt1, int paramInt2, int paramInt3, int paramInt4, com.google.android.gms.internal.firebase-auth-api.zzdc.zzc paramzzc, com.google.android.gms.internal.firebase-auth-api.zzdc.zza paramzza)
  {
    zza = paramInt1;
    zzb = paramInt2;
    zzc = paramInt3;
    zzd = paramInt4;
    zze = paramzzc;
    zzf = paramzza;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zzf()
  {
    return new zzb(null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzdc)) {
      return false;
    }
    paramObject = (zzdc)paramObject;
    return (zza == zza) && (zzb == zzb) && (zzc == zzc) && (zzd == zzd) && (zze == zze) && (zzf == zzf);
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzdc.class, Integer.valueOf(zza), Integer.valueOf(zzb), Integer.valueOf(zzc), Integer.valueOf(zzd), zze, zzf });
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(zze);
    String str2 = String.valueOf(zzf);
    int i = zzc;
    int j = zzd;
    int k = zza;
    int m = zzb;
    StringBuilder localStringBuilder = new StringBuilder("AesCtrHmacAead Parameters (variant: ");
    localStringBuilder.append(str1);
    localStringBuilder.append(", hashType: ");
    localStringBuilder.append(str2);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append("-byte IV, and ");
    localStringBuilder.append(j);
    localStringBuilder.append("-byte tags, and ");
    localStringBuilder.append(k);
    localStringBuilder.append("-byte AES key, and ");
    localStringBuilder.append(m);
    localStringBuilder.append("-byte HMAC key)");
    return localStringBuilder.toString();
  }
  
  public final boolean zza()
  {
    return zze != zzc.zzc;
  }
  
  public final int zzb()
  {
    return zza;
  }
  
  public final int zzc()
  {
    return zzb;
  }
  
  public final int zzd()
  {
    return zzc;
  }
  
  public final int zze()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdc.zza zzg()
  {
    return zzf;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzc zzh()
  {
    return zze;
  }
  
  public static final class zza
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzdc.zza zza = new zza("SHA1");
    public static final com.google.android.gms.internal.firebase-auth-api.zzdc.zza zzb = new zza("SHA224");
    public static final com.google.android.gms.internal.firebase-auth-api.zzdc.zza zzc = new zza("SHA256");
    public static final com.google.android.gms.internal.firebase-auth-api.zzdc.zza zzd = new zza("SHA384");
    public static final com.google.android.gms.internal.firebase-auth-api.zzdc.zza zze = new zza("SHA512");
    private final String zzf;
    
    private zza(String paramString)
    {
      zzf = paramString;
    }
    
    public final String toString()
    {
      return zzf;
    }
  }
  
  public static final class zzb
  {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private Integer zzd = null;
    private com.google.android.gms.internal.firebase-auth-api.zzdc.zza zze = null;
    private com.google.android.gms.internal.firebase-auth-api.zzdc.zzc zzf = zzdc.zzc.zzc;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zza(int paramInt)
    {
      if ((paramInt != 16) && (paramInt != 24) && (paramInt != 32)) {
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
      }
      zza = Integer.valueOf(paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzdc.zza paramzza)
    {
      zze = paramzza;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzdc.zzc paramzzc)
    {
      zzf = paramzzc;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdc zza()
    {
      if (zza != null)
      {
        if (zzb != null)
        {
          if (zzc != null)
          {
            Object localObject = zzd;
            if (localObject != null)
            {
              if (zze != null)
              {
                if (zzf != null)
                {
                  int i = ((Integer)localObject).intValue();
                  localObject = zze;
                  if (localObject == zzdc.zza.zza)
                  {
                    if (i > 20) {
                      throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[] { Integer.valueOf(i) }));
                    }
                  }
                  else if (localObject == zzdc.zza.zzb)
                  {
                    if (i > 28) {
                      throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[] { Integer.valueOf(i) }));
                    }
                  }
                  else if (localObject == zzdc.zza.zzc)
                  {
                    if (i > 32) {
                      throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[] { Integer.valueOf(i) }));
                    }
                  }
                  else if (localObject == zzdc.zza.zzd)
                  {
                    if (i > 48) {
                      throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[] { Integer.valueOf(i) }));
                    }
                  }
                  else
                  {
                    if (localObject != zzdc.zza.zze) {
                      break label296;
                    }
                    if (i > 64) {
                      break label272;
                    }
                  }
                  return new zzdc(zza.intValue(), zzb.intValue(), zzc.intValue(), zzd.intValue(), zzf, zze, null);
                  label272:
                  throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[] { Integer.valueOf(i) }));
                  label296:
                  throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                throw new GeneralSecurityException("variant is not set");
              }
              throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
          }
          throw new GeneralSecurityException("iv size is not set");
        }
        throw new GeneralSecurityException("HMAC key size is not set");
      }
      throw new GeneralSecurityException("AES key size is not set");
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zzb(int paramInt)
    {
      if (paramInt >= 16)
      {
        zzb = Integer.valueOf(paramInt);
        return this;
      }
      throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[] { Integer.valueOf(paramInt) }));
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zzc(int paramInt)
    {
      if ((paramInt >= 12) && (paramInt <= 16))
      {
        zzc = Integer.valueOf(paramInt);
        return this;
      }
      throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", new Object[] { Integer.valueOf(paramInt) }));
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdc.zzb zzd(int paramInt)
    {
      if (paramInt >= 10)
      {
        zzd = Integer.valueOf(paramInt);
        return this;
      }
      throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[] { Integer.valueOf(paramInt) }));
    }
  }
  
  public static final class zzc
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzdc.zzc zza = new zzc("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzdc.zzc zzb = new zzc("CRUNCHY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzdc.zzc zzc = new zzc("NO_PREFIX");
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
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzdc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */