package com.google.android.gms.internal.firebase_auth_api;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

public final class zzlu
{
  public static final byte[] zza = zza(1, 0);
  public static final byte[] zzb;
  public static final byte[] zzc;
  public static final byte[] zzd;
  public static final byte[] zze;
  public static final byte[] zzf;
  public static final byte[] zzg;
  public static final byte[] zzh;
  public static final byte[] zzi;
  public static final byte[] zzj;
  public static final byte[] zzk;
  public static final byte[] zzl;
  private static final byte[] zzm;
  private static final byte[] zzn;
  private static final byte[] zzo;
  
  static
  {
    zza(1, 2);
    zzb = zza(2, 32);
    zzc = zza(2, 16);
    zzd = zza(2, 17);
    zze = zza(2, 18);
    zzf = zza(2, 1);
    zzg = zza(2, 2);
    zzh = zza(2, 3);
    zzi = zza(2, 1);
    zzj = zza(2, 2);
    zzk = zza(2, 3);
    zzl = new byte[0];
    Charset localCharset = zzpy.zza;
    zzm = "KEM".getBytes(localCharset);
    zzn = "HPKE".getBytes(localCharset);
    zzo = "HPKE-v1".getBytes(localCharset);
  }
  
  public static int zza(com.google.android.gms.internal.firebase-auth-api.zzju.zzd paramzzd)
  {
    if (paramzzd == zzju.zzd.zzd) {
      return 32;
    }
    if (paramzzd == zzju.zzd.zza) {
      return 32;
    }
    if (paramzzd == zzju.zzd.zzb) {
      return 48;
    }
    if (paramzzd == zzju.zzd.zzc) {
      return 66;
    }
    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
  }
  
  private static byte[] zza(int paramInt1, int paramInt2)
  {
    if ((paramInt1 <= 4) && (paramInt1 >= 0))
    {
      if ((paramInt2 >= 0) && ((paramInt1 >= 4) || (paramInt2 < 1 << (paramInt1 << 3))))
      {
        byte[] arrayOfByte = new byte[paramInt1];
        for (int i = 0; i < paramInt1; i++) {
          arrayOfByte[i] = ((byte)(byte)(paramInt2 >> (paramInt1 - i - 1) * 8));
        }
        return arrayOfByte;
      }
      throw new IllegalArgumentException("value too large");
    }
    throw new IllegalArgumentException("capacity must be between 0 and 4");
  }
  
  public static byte[] zza(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    return zzyc.zza(new byte[][] { zzo, paramArrayOfByte2, paramString.getBytes(zzpy.zza), paramArrayOfByte1 });
  }
  
  public static byte[] zza(String paramString, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    return zzyc.zza(new byte[][] { zza(2, paramInt), zzo, paramArrayOfByte2, paramString.getBytes(zzpy.zza), paramArrayOfByte1 });
  }
  
  public static byte[] zza(byte[] paramArrayOfByte)
  {
    return zzyc.zza(new byte[][] { zzm, paramArrayOfByte });
  }
  
  public static byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    return zzyc.zza(new byte[][] { zzn, paramArrayOfByte1, paramArrayOfByte2, paramArrayOfByte3 });
  }
  
  public static int zzb(com.google.android.gms.internal.firebase-auth-api.zzju.zzd paramzzd)
  {
    if (paramzzd == zzju.zzd.zzd) {
      return 32;
    }
    if (paramzzd == zzju.zzd.zza) {
      return 65;
    }
    if (paramzzd == zzju.zzd.zzb) {
      return 97;
    }
    if (paramzzd == zzju.zzd.zzc) {
      return 133;
    }
    throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzyl zzc(com.google.android.gms.internal.firebase-auth-api.zzju.zzd paramzzd)
  {
    if (paramzzd == zzju.zzd.zza) {
      return zzyl.zza;
    }
    if (paramzzd == zzju.zzd.zzb) {
      return zzyl.zzb;
    }
    if (paramzzd == zzju.zzd.zzc) {
      return zzyl.zzc;
    }
    throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzlu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */