package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzla;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class zzkz
  implements zzla
{
  private final com.google.android.gms.internal.firebase-auth-api.zzdc zza;
  private final int zzb;
  
  public zzkz(com.google.android.gms.internal.firebase-auth-api.zzdc paramzzdc)
  {
    zza = paramzzdc;
    int i = paramzzdc.zzb();
    zzb = (paramzzdc.zzc() + i);
  }
  
  public final int zza()
  {
    return zzb;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    if (paramArrayOfByte2.length >= paramInt)
    {
      byte[] arrayOfByte = Arrays.copyOfRange(paramArrayOfByte2, paramInt, paramArrayOfByte2.length);
      paramArrayOfByte2 = Arrays.copyOf(paramArrayOfByte1, zza.zzb());
      int i = zza.zzb();
      paramInt = zza.zzb();
      paramArrayOfByte1 = Arrays.copyOfRange(paramArrayOfByte1, i, zza.zzc() + paramInt);
      return zzyn.zza(zzcx.zzb().zza(zza).zza(zzzo.zza(paramArrayOfByte2, zzbl.zza())).zzb(zzzo.zza(paramArrayOfByte1, zzbl.zza())).zza()).zza(arrayOfByte, zzkw.zza());
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzkz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */