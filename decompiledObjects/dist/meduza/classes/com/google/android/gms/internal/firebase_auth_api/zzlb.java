package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzla;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class zzlb
  implements zzla
{
  private final com.google.android.gms.internal.firebase-auth-api.zzit zza;
  private final int zzb;
  
  public zzlb(com.google.android.gms.internal.firebase-auth-api.zzit paramzzit)
  {
    zza = paramzzit;
    zzb = paramzzit.zzb();
  }
  
  public final int zza()
  {
    return zzb;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    if (paramArrayOfByte2.length >= paramInt)
    {
      paramArrayOfByte2 = Arrays.copyOfRange(paramArrayOfByte2, paramInt, paramArrayOfByte2.length);
      return zzya.zza(zzio.zzb().zza(zza).zza(zzzo.zza(paramArrayOfByte1, zzbl.zza())).zza()).zza(paramArrayOfByte2, zzkw.zza());
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzlb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */