package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzcd;
import f;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

public final class zzzg
  implements zzcd
{
  private static final byte[] zza = { 0 };
  private final com.google.android.gms.internal.firebase-auth-api.zzrx zzb;
  private final int zzc;
  private final byte[] zzd;
  private final byte[] zze;
  
  private zzzg(com.google.android.gms.internal.firebase-auth-api.zzqa paramzzqa)
  {
    zzb = new zzzc(paramzzqa.zze().zza(zzbl.zza()));
    zzc = paramzzqa.zzc().zzb();
    zzd = paramzzqa.zzd().zzb();
    if (paramzzqa.zzc().zze().equals(zzqf.zza.zzc))
    {
      paramzzqa = zza;
      zze = Arrays.copyOf(paramzzqa, paramzzqa.length);
      return;
    }
    zze = new byte[0];
  }
  
  private zzzg(com.google.android.gms.internal.firebase-auth-api.zzql paramzzql)
  {
    zzb = new zzze(f.j("HMAC", String.valueOf(paramzzql.zzc().zze())), new SecretKeySpec(paramzzql.zze().zza(zzbl.zza()), "HMAC"));
    zzc = paramzzql.zzc().zzb();
    zzd = paramzzql.zzd().zzb();
    if (paramzzql.zzc().zzf().equals(zzqs.zzc.zzc))
    {
      paramzzql = zza;
      zze = Arrays.copyOf(paramzzql, paramzzql.length);
      return;
    }
    zze = new byte[0];
  }
  
  public zzzg(com.google.android.gms.internal.firebase-auth-api.zzrx paramzzrx, int paramInt)
  {
    zzb = paramzzrx;
    zzc = paramInt;
    zzd = new byte[0];
    zze = new byte[0];
    if (paramInt >= 10)
    {
      paramzzrx.zza(new byte[0], paramInt);
      return;
    }
    throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
  }
  
  public static zzcd zza(com.google.android.gms.internal.firebase-auth-api.zzqa paramzzqa)
  {
    return new zzzg(paramzzqa);
  }
  
  public static zzcd zza(com.google.android.gms.internal.firebase-auth-api.zzql paramzzql)
  {
    return new zzzg(paramzzql);
  }
  
  public final void zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (MessageDigest.isEqual(zza(paramArrayOfByte2), paramArrayOfByte1)) {
      return;
    }
    throw new GeneralSecurityException("invalid MAC");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = zze;
    if (arrayOfByte.length > 0) {
      return zzyc.zza(new byte[][] { zzd, zzb.zza(zzyc.zza(new byte[][] { paramArrayOfByte, arrayOfByte }), zzc) });
    }
    return zzyc.zza(new byte[][] { zzd, zzb.zza(paramArrayOfByte, zzc) });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */