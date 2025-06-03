package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class zzdk
  extends zzcr
{
  private final int zza;
  private final int zzb;
  private final int zzc;
  private final com.google.android.gms.internal.firebase-auth-api.zzdk.zzb zzd;
  
  private zzdk(int paramInt1, int paramInt2, int paramInt3, com.google.android.gms.internal.firebase-auth-api.zzdk.zzb paramzzb)
  {
    zza = paramInt1;
    zzb = paramInt2;
    zzc = paramInt3;
    zzd = paramzzb;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzdk.zza zze()
  {
    return new zza(null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzdk)) {
      return false;
    }
    paramObject = (zzdk)paramObject;
    return (zza == zza) && (zzb == zzb) && (zzc == zzc) && (zzd == zzd);
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzdk.class, Integer.valueOf(zza), Integer.valueOf(zzb), Integer.valueOf(zzc), zzd });
  }
  
  public final String toString()
  {
    String str = String.valueOf(zzd);
    int i = zzb;
    int j = zzc;
    int k = zza;
    StringBuilder localStringBuilder = new StringBuilder("AesEax Parameters (variant: ");
    localStringBuilder.append(str);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append("-byte IV, ");
    localStringBuilder.append(j);
    localStringBuilder.append("-byte tag, and ");
    localStringBuilder.append(k);
    localStringBuilder.append("-byte key)");
    return localStringBuilder.toString();
  }
  
  public final boolean zza()
  {
    return zzd != zzb.zzc;
  }
  
  public final int zzb()
  {
    return zzb;
  }
  
  public final int zzc()
  {
    return zza;
  }
  
  public final int zzd()
  {
    return zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdk.zzb zzf()
  {
    return zzd;
  }
  
  public static final class zza
  {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private com.google.android.gms.internal.firebase-auth-api.zzdk.zzb zzd = zzdk.zzb.zzc;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdk.zza zza(int paramInt)
    {
      if ((paramInt != 12) && (paramInt != 16)) {
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[] { Integer.valueOf(paramInt) }));
      }
      zzb = Integer.valueOf(paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdk.zza zza(com.google.android.gms.internal.firebase-auth-api.zzdk.zzb paramzzb)
    {
      zzd = paramzzb;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdk zza()
    {
      Integer localInteger = zza;
      if (localInteger != null)
      {
        if (zzb != null)
        {
          if (zzd != null)
          {
            if (zzc != null) {
              return new zzdk(localInteger.intValue(), zzb.intValue(), zzc.intValue(), zzd, null);
            }
            throw new GeneralSecurityException("Tag size is not set");
          }
          throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("IV size is not set");
      }
      throw new GeneralSecurityException("Key size is not set");
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdk.zza zzb(int paramInt)
    {
      if ((paramInt != 16) && (paramInt != 24) && (paramInt != 32)) {
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
      }
      zza = Integer.valueOf(paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdk.zza zzc(int paramInt)
    {
      zzc = Integer.valueOf(16);
      return this;
    }
  }
  
  public static final class zzb
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzdk.zzb zza = new zzb("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzdk.zzb zzb = new zzb("CRUNCHY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzdk.zzb zzc = new zzb("NO_PREFIX");
    private final String zzd;
    
    private zzb(String paramString)
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzdk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */