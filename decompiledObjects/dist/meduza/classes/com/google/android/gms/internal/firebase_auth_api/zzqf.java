package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class zzqf
  extends zzqy
{
  private final int zza;
  private final int zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzqf.zza zzc;
  
  private zzqf(int paramInt1, int paramInt2, com.google.android.gms.internal.firebase-auth-api.zzqf.zza paramzza)
  {
    zza = paramInt1;
    zzb = paramInt2;
    zzc = paramzza;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzqf.zzb zzd()
  {
    return new zzb(null);
  }
  
  private final int zzf()
  {
    com.google.android.gms.internal.firebase-auth-api.zzqf.zza localzza = zzc;
    if (localzza == zza.zzd) {
      return zzb;
    }
    if (localzza == zza.zza) {}
    while ((localzza == zza.zzb) || (localzza == zza.zzc)) {
      return zzb + 5;
    }
    throw new IllegalStateException("Unknown variant");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzqf)) {
      return false;
    }
    paramObject = (zzqf)paramObject;
    return (zza == zza) && (((zzqf)paramObject).zzf() == zzf()) && (zzc == zzc);
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzqf.class, Integer.valueOf(zza), Integer.valueOf(zzb), zzc });
  }
  
  public final String toString()
  {
    String str = String.valueOf(zzc);
    int i = zzb;
    int j = zza;
    StringBuilder localStringBuilder = new StringBuilder("AES-CMAC Parameters (variant: ");
    localStringBuilder.append(str);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append("-byte tags, and ");
    return j.m(localStringBuilder, j, "-byte key)");
  }
  
  public final boolean zza()
  {
    return zzc != zza.zzd;
  }
  
  public final int zzb()
  {
    return zzb;
  }
  
  public final int zzc()
  {
    return zza;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzqf.zza zze()
  {
    return zzc;
  }
  
  public static final class zza
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzqf.zza zza = new zza("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzqf.zza zzb = new zza("CRUNCHY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzqf.zza zzc = new zza("LEGACY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzqf.zza zzd = new zza("NO_PREFIX");
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
    private Integer zza = null;
    private Integer zzb = null;
    private com.google.android.gms.internal.firebase-auth-api.zzqf.zza zzc = zzqf.zza.zzd;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqf.zzb zza(int paramInt)
    {
      if ((paramInt != 16) && (paramInt != 32)) {
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[] { Integer.valueOf(paramInt << 3) }));
      }
      zza = Integer.valueOf(paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqf.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzqf.zza paramzza)
    {
      zzc = paramzza;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqf zza()
    {
      Integer localInteger = zza;
      if (localInteger != null)
      {
        if (zzb != null)
        {
          if (zzc != null) {
            return new zzqf(localInteger.intValue(), zzb.intValue(), zzc, null);
          }
          throw new GeneralSecurityException("variant not set");
        }
        throw new GeneralSecurityException("tag size not set");
      }
      throw new GeneralSecurityException("key size not set");
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzqf.zzb zzb(int paramInt)
    {
      if ((paramInt >= 10) && (16 >= paramInt))
      {
        zzb = Integer.valueOf(paramInt);
        return this;
      }
      throw new GeneralSecurityException(j.g("Invalid tag size for AesCmacParameters: ", paramInt));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzqf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */