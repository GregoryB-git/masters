package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzlo;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class zzme
  implements zzlo
{
  private final com.google.android.gms.internal.firebase-auth-api.zzli zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzmd zzb;
  
  public zzme(com.google.android.gms.internal.firebase-auth-api.zzli paramzzli)
  {
    zza = paramzzli;
    try
    {
      paramzzli = zzmf.zzb();
    }
    catch (GeneralSecurityException paramzzli)
    {
      paramzzli = new zzmh(null);
    }
    zzb = paramzzli;
  }
  
  public final byte[] zza()
  {
    if (Arrays.equals(zza.zzb(), zzlu.zzf)) {
      return zzlu.zzb;
    }
    throw new GeneralSecurityException("Could not determine HPKE KEM ID");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte, com.google.android.gms.internal.firebase-auth-api.zzlr paramzzlr)
  {
    byte[] arrayOfByte1 = zzb.zza(paramzzlr.zza().zzb(), paramArrayOfByte);
    paramzzlr = zzyc.zza(new byte[][] { paramArrayOfByte, paramzzlr.zzb().zzb() });
    byte[] arrayOfByte2 = zzlu.zza(zzlu.zzb);
    paramArrayOfByte = zza;
    return paramArrayOfByte.zza(null, arrayOfByte1, "eae_prk", paramzzlr, "shared_secret", arrayOfByte2, paramArrayOfByte.zza());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzme
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */