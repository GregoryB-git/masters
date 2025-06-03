package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

public final class zzea
  extends zzcr
{
  private final int zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzea.zzb zzb;
  
  private zzea(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzea.zzb paramzzb)
  {
    zza = paramInt;
    zzb = paramzzb;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzea.zza zzc()
  {
    return new zza(null);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzea)) {
      return false;
    }
    paramObject = (zzea)paramObject;
    return (zza == zza) && (zzb == zzb);
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { com.google.android.gms.internal.firebase-auth-api.zzea.class, Integer.valueOf(zza), zzb });
  }
  
  public final String toString()
  {
    String str = String.valueOf(zzb);
    int i = zza;
    StringBuilder localStringBuilder = new StringBuilder("AesGcmSiv Parameters (variant: ");
    localStringBuilder.append(str);
    localStringBuilder.append(", ");
    localStringBuilder.append(i);
    localStringBuilder.append("-byte key)");
    return localStringBuilder.toString();
  }
  
  public final boolean zza()
  {
    return zzb != zzb.zzc;
  }
  
  public final int zzb()
  {
    return zza;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzea.zzb zzd()
  {
    return zzb;
  }
  
  public static final class zza
  {
    private Integer zza = null;
    private com.google.android.gms.internal.firebase-auth-api.zzea.zzb zzb = zzea.zzb.zzc;
    
    public final com.google.android.gms.internal.firebase-auth-api.zzea.zza zza(int paramInt)
    {
      if ((paramInt != 16) && (paramInt != 32)) {
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[] { Integer.valueOf(paramInt) }));
      }
      zza = Integer.valueOf(paramInt);
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzea.zza zza(com.google.android.gms.internal.firebase-auth-api.zzea.zzb paramzzb)
    {
      zzb = paramzzb;
      return this;
    }
    
    public final com.google.android.gms.internal.firebase-auth-api.zzea zza()
    {
      Integer localInteger = zza;
      if (localInteger != null)
      {
        if (zzb != null) {
          return new zzea(localInteger.intValue(), zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
      }
      throw new GeneralSecurityException("Key size is not set");
    }
  }
  
  public static final class zzb
  {
    public static final com.google.android.gms.internal.firebase-auth-api.zzea.zzb zza = new zzb("TINK");
    public static final com.google.android.gms.internal.firebase-auth-api.zzea.zzb zzb = new zzb("CRUNCHY");
    public static final com.google.android.gms.internal.firebase-auth-api.zzea.zzb zzc = new zzb("NO_PREFIX");
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
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzea
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */