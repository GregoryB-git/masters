package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

public final class zzqf$zzb
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

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzqf.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */