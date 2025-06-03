package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class zzcw
  implements com.google.android.gms.internal.firebase-auth-api.zzbe
{
  private final zzpg<zzbe> zza;
  private final com.google.android.gms.internal.firebase-auth-api.zznv zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zznv zzc;
  
  private zzcw(zzpg<zzbe> paramzzpg)
  {
    zza = paramzzpg;
    if (paramzzpg.zzf())
    {
      com.google.android.gms.internal.firebase-auth-api.zzns localzzns = zzoj.zzb().zza();
      paramzzpg = zzny.zza(paramzzpg);
      zzb = localzzns.zza(paramzzpg, "aead", "encrypt");
      paramzzpg = localzzns.zza(paramzzpg, "aead", "decrypt");
    }
    for (;;)
    {
      zzc = paramzzpg;
      return;
      paramzzpg = zzny.zza;
      zzb = paramzzpg;
    }
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
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
    byte[] arrayOfByte;
    try
    {
      arrayOfByte = ((zzbe)localzzpi.zzd()).zza(paramArrayOfByte1, paramArrayOfByte2);
      zzc.zza(localzzpi.zza(), paramArrayOfByte1.length);
      return arrayOfByte;
    }
    catch (GeneralSecurityException localGeneralSecurityException1) {}
    Object localObject = zza.zza(zzbi.zza).iterator();
    for (;;)
    {
      if (((Iterator)localObject).hasNext()) {
        localzzpi = (zzpi)((Iterator)localObject).next();
      }
      try
      {
        arrayOfByte = ((zzbe)localzzpi.zzd()).zza(paramArrayOfByte1, paramArrayOfByte2);
        zzc.zza(localzzpi.zza(), paramArrayOfByte1.length);
        return arrayOfByte;
      }
      catch (GeneralSecurityException localGeneralSecurityException2) {}
      zzc.zza();
      throw new GeneralSecurityException("decryption failed");
      break;
    }
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      paramArrayOfByte2 = ((zzbe)zza.zzb().zzd()).zzb(paramArrayOfByte1, paramArrayOfByte2);
      zzb.zza(zza.zzb().zza(), paramArrayOfByte1.length);
      return paramArrayOfByte2;
    }
    catch (GeneralSecurityException paramArrayOfByte1)
    {
      zzb.zza();
      throw paramArrayOfByte1;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzcw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */