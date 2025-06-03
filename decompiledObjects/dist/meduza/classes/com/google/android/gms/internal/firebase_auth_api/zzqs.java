package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class zzqs
  extends zzqy
{
  private final int zza;
  private final int zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzqs.zzc zzc;
  private final com.google.android.gms.internal.firebase-auth-api.zzqs.zza zzd;
  
  private zzqs(int paramInt1, int paramInt2, com.google.android.gms.internal.firebase-auth-api.zzqs.zzc paramzzc, com.google.android.gms.internal.firebase-auth-api.zzqs.zza paramzza)
  {
    zza = paramInt1;
    zzb = paramInt2;
    zzc = paramzzc;
    zzd = paramzza;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzqs.zzb zzd()
  {
    return new zzb(null);
  }
  
  private final int zzg()
  {
    com.google.android.gms.internal.firebase-auth-api.zzqs.zzc localzzc = zzc;
    if (localzzc == zzc.zzd) {
      return zzb;
    }
    if (localzzc == zzc.zza) {}
    while ((localzzc == zzc.zzb) || (localzzc == zzc.zzc)) {
      return zzb + 5;
    }
    throw new IllegalStateException("Unknown variant");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzqs)) {
      return false;
    }
    paramObject = (zzqs)paramObject;
    return (zza == zza) && (((zzqs)paramObject).zzg() == zzg()) && (zzc == zzc) && (zzd == zzd);
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzqs.class, Integer.valueOf(zza), Integer.valueOf(zzb), zzc, zzd });
  }
  
  public final String toString()
  {
    String str1 = String.valueOf(zzc);
    String str2 = String.valueOf(zzd);
    int i = zzb;
    int j = zza;
    StringBuilder localStringBuilder = new StringBuilder("HMAC Parameters (variant: ");
    localStringBuilder.append(str1);
    localStringBuilder.append(", hashType: ");
    localStringBuilder.append(str2);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append("-byte tags, and ");
    localStringBuilder.append(j);
    localStringBuilder.append("-byte key)");
    return localStringBuilder.toString();
  }
  
  public final boolean zza()
  {
    return zzc != zzc.zzd;
  }
  
  public final int zzb()
  {
    return zzb;
  }
  
  public final int zzc()
  {
    return zza;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzqs.zza zze()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzqs.zzc zzf()
  {
    return zzc;
  }
  
  public static final class zza
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzqs.zza zza = new zza("SHA1");
    public static final com.google.android.gms.internal.firebase-auth-api.zzqs.zza zzb = new zza("SHA224");
    public static final com.google.android.gms.internal.firebase-auth-api.zzqs.zza zzc = new zza("SHA256");
    public static final com.google.android.gms.internal.firebase-auth-api.zzqs.zza zzd = new zza("SHA384");
    public static final com.google.android.gms.internal.firebase-auth-api.zzqs.zza zze = new zza("SHA512");
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
    private com.google.android.gms.internal.firebase-auth-api.zzqs.zza zzc = null;
    private com.google.android.gms.internal.firebase-auth-api.zzqs.zzc zzd = zzqs.zzc.zzd;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqs.zzb zza(int paramInt)
    {
      zza = Integer.valueOf(paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqs.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzqs.zza paramzza)
    {
      zzc = paramzza;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqs.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzqs.zzc paramzzc)
    {
      zzd = paramzzc;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqs zza()
    {
      Object localObject = zza;
      if (localObject != null)
      {
        if (zzb != null)
        {
          if (zzc != null)
          {
            if (zzd != null)
            {
              if (((Integer)localObject).intValue() >= 16)
              {
                int i = zzb.intValue();
                localObject = zzc;
                if (i >= 10)
                {
                  if (localObject == zzqs.zza.zza)
                  {
                    if (i > 20) {
                      throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", new Object[] { Integer.valueOf(i) }));
                    }
                  }
                  else if (localObject == zzqs.zza.zzb)
                  {
                    if (i > 28) {
                      throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", new Object[] { Integer.valueOf(i) }));
                    }
                  }
                  else if (localObject == zzqs.zza.zzc)
                  {
                    if (i > 32) {
                      throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", new Object[] { Integer.valueOf(i) }));
                    }
                  }
                  else if (localObject == zzqs.zza.zzd)
                  {
                    if (i > 48) {
                      throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", new Object[] { Integer.valueOf(i) }));
                    }
                  }
                  else
                  {
                    if (localObject != zzqs.zza.zze) {
                      break label286;
                    }
                    if (i > 64) {
                      break label262;
                    }
                  }
                  return new zzqs(zza.intValue(), zzb.intValue(), zzd, zzc, null);
                  label262:
                  throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", new Object[] { Integer.valueOf(i) }));
                  label286:
                  throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[] { Integer.valueOf(i) }));
              }
              throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", new Object[] { zza }));
            }
            throw new GeneralSecurityException("variant is not set");
          }
          throw new GeneralSecurityException("hash type is not set");
        }
        throw new GeneralSecurityException("tag size is not set");
      }
      throw new GeneralSecurityException("key size is not set");
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqs.zzb zzb(int paramInt)
    {
      zzb = Integer.valueOf(paramInt);
      return this;
    }
  }
  
  public static final class zzc
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzqs.zzc zza = new zzc("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzqs.zzc zzb = new zzc("CRUNCHY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzqs.zzc zzc = new zzc("LEGACY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzqs.zzc zzd = new zzc("NO_PREFIX");
    private final String zze;
    
    private zzc(String paramString)
    {
      zze = paramString;
    }
    
    public final String toString()
    {
      return zze;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzqs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */