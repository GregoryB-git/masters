package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class zzit
  extends zzix
{
  private final int zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzit.zza zzb;
  
  private zzit(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzit.zza paramzza)
  {
    zza = paramInt;
    zzb = paramzza;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzit.zzb zzc()
  {
    return new zzb(null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzit)) {
      return false;
    }
    paramObject = (zzit)paramObject;
    return (zza == zza) && (zzb == zzb);
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzit.class, Integer.valueOf(zza), zzb });
  }
  
  public final String toString()
  {
    String str = String.valueOf(zzb);
    int i = zza;
    StringBuilder localStringBuilder = new StringBuilder("AesSiv Parameters (variant: ");
    localStringBuilder.append(str);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append("-byte key)");
    return localStringBuilder.toString();
  }
  
  public final boolean zza()
  {
    return zzb != zza.zzc;
  }
  
  public final int zzb()
  {
    return zza;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzit.zza zzd()
  {
    return zzb;
  }
  
  public static final class zza
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzit.zza zza = new zza("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzit.zza zzb = new zza("CRUNCHY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzit.zza zzc = new zza("NO_PREFIX");
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
    private com.google.android.gms.internal.firebase-auth-api.zzit.zza zzb = zzit.zza.zzc;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzit.zzb zza(int paramInt)
    {
      if ((paramInt != 32) && (paramInt != 48) && (paramInt != 64)) {
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", new Object[] { Integer.valueOf(paramInt) }));
      }
      zza = Integer.valueOf(paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzit.zzb zza(com.google.android.gms.internal.firebase-auth-api.zzit.zza paramzza)
    {
      zzb = paramzza;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzit zza()
    {
      Integer localInteger = zza;
      if (localInteger != null)
      {
        if (zzb != null) {
          return new zzit(localInteger.intValue(), zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
      }
      throw new GeneralSecurityException("Key size is not set");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzit
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */