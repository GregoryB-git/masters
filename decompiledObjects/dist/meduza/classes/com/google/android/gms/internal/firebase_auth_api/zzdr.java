package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class zzdr
  extends zzcr
{
  private final int zza;
  private final int zzb;
  private final int zzc;
  private final com.google.android.gms.internal.firebase-auth-api.zzdr.zza zzd;
  
  private zzdr(int paramInt1, int paramInt2, int paramInt3, com.google.android.gms.internal.firebase-auth-api.zzdr.zza paramzza)
  {
    zza = paramInt1;
    zzb = paramInt2;
    zzc = paramInt3;
    zzd = paramzza;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzdr.zzb zze()
  {
    return new zzb(null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzdr)) {
      return false;
    }
    paramObject = (zzdr)paramObject;
    return (zza == zza) && (zzb == zzb) && (zzc == zzc) && (zzd == zzd);
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzdr.class, Integer.valueOf(zza), Integer.valueOf(zzb), Integer.valueOf(zzc), zzd });
  }
  
  public final String toString()
  {
    String str = String.valueOf(zzd);
    int i = zzb;
    int j = zzc;
    int k = zza;
    StringBuilder localStringBuilder = new StringBuilder("AesGcm Parameters (variant: ");
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
    return zzd != zza.zzc;
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
  
  public final com.google.android.gms.internal.firebase-auth-api.zzdr.zza zzf()
  {
    return zzd;
  }
  
  public static final class zza
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzdr.zza zza = new zza("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzdr.zza zzb = new zza("CRUNCHY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzdr.zza zzc = new zza("NO_PREFIX");
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
  
  public static final class zzb
  {
    private Integer zza = null;
    private Integer zzb = null;
    private Integer zzc = null;
    private com.google.android.gms.internal.firebase-auth-api.zzdr.zza zzd = zzdr.zza.zzc;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdr.zzb zza(int paramInt)
    {
      zzb = Integer.valueOf(12);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdr.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzdr.zza paramzza)
    {
      zzd = paramzza;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdr zza()
    {
      Integer localInteger = zza;
      if (localInteger != null)
      {
        if (zzd != null)
        {
          if (zzb != null)
          {
            if (zzc != null) {
              return new zzdr(localInteger.intValue(), zzb.intValue(), zzc.intValue(), zzd, null);
            }
            throw new GeneralSecurityException("Tag size is not set");
          }
          throw new GeneralSecurityException("IV size is not set");
        }
        throw new GeneralSecurityException("Variant is not set");
      }
      throw new GeneralSecurityException("Key size is not set");
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdr.zzb zzb(int paramInt)
    {
      if ((paramInt != 16) && (paramInt != 24) && (paramInt != 32)) {
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
      }
      zza = Integer.valueOf(paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzdr.zzb zzc(int paramInt)
    {
      zzc = Integer.valueOf(16);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzdr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */