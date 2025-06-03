package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzlr;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

public final class zzlk
{
  private static final byte[] zza = new byte[0];
  private final com.google.android.gms.internal.firebase-auth-api.zzll zzb;
  private final BigInteger zzc;
  private final byte[] zzd;
  private final byte[] zze;
  private BigInteger zzf;
  
  private zzlk(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, BigInteger paramBigInteger, com.google.android.gms.internal.firebase-auth-api.zzll paramzzll)
  {
    zzd = paramArrayOfByte2;
    zze = paramArrayOfByte3;
    zzf = BigInteger.ZERO;
    zzc = paramBigInteger;
    zzb = paramzzll;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzlk zza(byte[] paramArrayOfByte1, zzlr paramzzlr, com.google.android.gms.internal.firebase-auth-api.zzlo paramzzlo, com.google.android.gms.internal.firebase-auth-api.zzlp paramzzlp, com.google.android.gms.internal.firebase-auth-api.zzll paramzzll, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte1 = paramzzlo.zza(paramArrayOfByte1, paramzzlr);
    byte[] arrayOfByte2 = zzlu.zza;
    paramzzlr = zzlu.zza(paramzzlo.zza(), paramzzlp.zzb(), paramzzll.zzc());
    byte[] arrayOfByte3 = zzlu.zzl;
    paramzzlo = zza;
    paramArrayOfByte2 = zzyc.zza(new byte[][] { arrayOfByte2, paramzzlp.zza(arrayOfByte3, paramzzlo, "psk_id_hash", paramzzlr), paramzzlp.zza(arrayOfByte3, paramArrayOfByte2, "info_hash", paramzzlr) });
    arrayOfByte1 = paramzzlp.zza(arrayOfByte1, paramzzlo, "secret", paramzzlr);
    paramzzlo = paramzzlp.zza(arrayOfByte1, paramArrayOfByte2, "key", paramzzlr, paramzzll.zza());
    paramzzlr = paramzzlp.zza(arrayOfByte1, paramArrayOfByte2, "base_nonce", paramzzlr, paramzzll.zzb());
    paramzzll.zzb();
    paramzzlp = BigInteger.ONE;
    return new zzlk(paramArrayOfByte1, paramzzlo, paramzzlr, paramzzlp.shiftLeft(96).subtract(paramzzlp), paramzzll);
  }
  
  private final byte[] zza()
  {
    try
    {
      Object localObject1 = zzyc.zza(zze, zzmo.zza(zzf, zzb.zzb()));
      if (zzf.compareTo(zzc) < 0)
      {
        zzf = zzf.add(BigInteger.ONE);
        return (byte[])localObject1;
      }
      localObject1 = new java/security/GeneralSecurityException;
      ((GeneralSecurityException)localObject1).<init>("message limit reached");
      throw ((Throwable)localObject1);
    }
    finally {}
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = zza();
    return zzb.zza(zzd, arrayOfByte, paramArrayOfByte1, paramInt, paramArrayOfByte2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzlk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */