package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class zzkm
  implements com.google.android.gms.internal.firebase-auth-api.zzbj
{
  private final zzpg<zzbj> zza;
  private final com.google.android.gms.internal.firebase-auth-api.zznv zzb;
  
  public zzkm(zzpg<zzbj> paramzzpg)
  {
    zza = paramzzpg;
    if (paramzzpg.zzf()) {}
    for (paramzzpg = zzoj.zzb().zza().zza(zzny.zza(paramzzpg), "hybrid_decrypt", "decrypt");; paramzzpg = zzny.zza)
    {
      zzb = paramzzpg;
      return;
    }
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Object localObject2;
    if (paramArrayOfByte1.length > 5)
    {
      localObject1 = Arrays.copyOfRange(paramArrayOfByte1, 0, 5);
      localObject1 = zza.zza((byte[])localObject1).iterator();
      if (((Iterator)localObject1).hasNext()) {
        localObject2 = (zzpi)((Iterator)localObject1).next();
      }
    }
    Object localObject3;
    try
    {
      localObject3 = ((zzbj)((zzpi)localObject2).zzd()).zza(paramArrayOfByte1, paramArrayOfByte2);
      zzb.zza(((zzpi)localObject2).zza(), paramArrayOfByte1.length);
      return (byte[])localObject3;
    }
    catch (GeneralSecurityException localGeneralSecurityException1) {}
    Object localObject1 = zza.zza(zzbi.zza).iterator();
    for (;;)
    {
      if (((Iterator)localObject1).hasNext()) {
        localObject3 = (zzpi)((Iterator)localObject1).next();
      }
      try
      {
        localObject2 = ((zzbj)((zzpi)localObject3).zzd()).zza(paramArrayOfByte1, paramArrayOfByte2);
        zzb.zza(((zzpi)localObject3).zza(), paramArrayOfByte1.length);
        return (byte[])localObject2;
      }
      catch (GeneralSecurityException localGeneralSecurityException2) {}
      zzb.zza();
      throw new GeneralSecurityException("decryption failed");
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzkm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */