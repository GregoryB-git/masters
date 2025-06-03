package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class zzqz
  implements com.google.android.gms.internal.firebase-auth-api.zzcd
{
  private final zzpg<zzcd> zza;
  private final com.google.android.gms.internal.firebase-auth-api.zznv zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zznv zzc;
  
  private zzqz(zzpg<zzcd> paramzzpg)
  {
    zza = paramzzpg;
    if (paramzzpg.zzf())
    {
      com.google.android.gms.internal.firebase-auth-api.zzns localzzns = zzoj.zzb().zza();
      paramzzpg = zzny.zza(paramzzpg);
      zzb = localzzns.zza(paramzzpg, "mac", "compute");
      paramzzpg = localzzns.zza(paramzzpg, "mac", "verify");
    }
    for (;;)
    {
      zzc = paramzzpg;
      return;
      paramzzpg = zzny.zza;
      zzb = paramzzpg;
    }
  }
  
  public final void zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    zzpi localzzpi;
    if (paramArrayOfByte1.length > 5)
    {
      localObject = Arrays.copyOf(paramArrayOfByte1, 5);
      localObject = zza.zza((byte[])localObject).iterator();
      if (((Iterator)localObject).hasNext()) {
        localzzpi = (zzpi)((Iterator)localObject).next();
      }
    }
    try
    {
      ((zzcd)localzzpi.zzd()).zza(paramArrayOfByte1, paramArrayOfByte2);
      zzc.zza(localzzpi.zza(), paramArrayOfByte2.length);
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException1) {}
    Object localObject = zza.zze().iterator();
    for (;;)
    {
      if (((Iterator)localObject).hasNext()) {
        localzzpi = (zzpi)((Iterator)localObject).next();
      }
      try
      {
        ((zzcd)localzzpi.zzd()).zza(paramArrayOfByte1, paramArrayOfByte2);
        zzc.zza(localzzpi.zza(), paramArrayOfByte2.length);
        return;
      }
      catch (GeneralSecurityException localGeneralSecurityException2) {}
      zzc.zza();
      throw new GeneralSecurityException("invalid MAC");
      zzc.zza();
      throw new GeneralSecurityException("tag too short");
      break;
    }
  }
  
  public final byte[] zza(byte[] paramArrayOfByte)
  {
    try
    {
      byte[] arrayOfByte = ((zzcd)zza.zzb().zzd()).zza(paramArrayOfByte);
      zzb.zza(zza.zzb().zza(), paramArrayOfByte.length);
      return arrayOfByte;
    }
    catch (GeneralSecurityException paramArrayOfByte)
    {
      zzb.zza();
      throw paramArrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzqz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */