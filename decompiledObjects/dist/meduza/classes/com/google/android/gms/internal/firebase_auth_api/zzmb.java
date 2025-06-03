package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzlo;
import f;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

final class zzmb
  implements zzlo
{
  private final com.google.android.gms.internal.firebase-auth-api.zzyl zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzli zzb;
  
  private zzmb(com.google.android.gms.internal.firebase-auth-api.zzli paramzzli, com.google.android.gms.internal.firebase-auth-api.zzyl paramzzyl)
  {
    zzb = paramzzli;
    zza = paramzzyl;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzmb zza(com.google.android.gms.internal.firebase-auth-api.zzyl paramzzyl)
  {
    int i = zzma.zza[paramzzyl.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return new zzmb(new zzli("HmacSha512"), zzyl.zzc);
        }
        throw new GeneralSecurityException(f.j("invalid curve type: ", String.valueOf(paramzzyl)));
      }
      return new zzmb(new zzli("HmacSha384"), zzyl.zzb);
    }
    return new zzmb(new zzli("HmacSha256"), zzyl.zza);
  }
  
  public final byte[] zza()
  {
    int i = zzma.zza[zza.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return zzlu.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
      }
      return zzlu.zzd;
    }
    return zzlu.zzc;
  }
  
  public final byte[] zza(byte[] paramArrayOfByte, com.google.android.gms.internal.firebase-auth-api.zzlr paramzzlr)
  {
    Object localObject1 = zzyi.zza(zza, paramzzlr.zza().zzb());
    com.google.android.gms.internal.firebase-auth-api.zzyl localzzyl = zza;
    Object localObject2 = zzyk.zza;
    localObject1 = zzyi.zza((ECPrivateKey)localObject1, zzyi.zza(zzyi.zza(localzzyl), (com.google.android.gms.internal.firebase-auth-api.zzyk)localObject2, paramArrayOfByte));
    localObject2 = zzyc.zza(new byte[][] { paramArrayOfByte, paramzzlr.zzb().zzb() });
    paramArrayOfByte = zzlu.zza(zza());
    paramzzlr = zzb;
    return paramzzlr.zza(null, (byte[])localObject1, "eae_prk", (byte[])localObject2, "shared_secret", paramArrayOfByte, paramzzlr.zza());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */