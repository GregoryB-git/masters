package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbe;
import f;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

public final class zzyn
  implements zzbe
{
  private final com.google.android.gms.internal.firebase-auth-api.zzzd zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzcd zzb;
  private final int zzc;
  private final byte[] zzd;
  
  private zzyn(com.google.android.gms.internal.firebase-auth-api.zzzd paramzzzd, com.google.android.gms.internal.firebase-auth-api.zzcd paramzzcd, int paramInt, byte[] paramArrayOfByte)
  {
    zza = paramzzzd;
    zzb = paramzzcd;
    zzc = paramInt;
    zzd = paramArrayOfByte;
  }
  
  public static zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzcx paramzzcx)
  {
    return new zzyn(new zzxu(paramzzcx.zze().zza(zzbl.zza()), paramzzcx.zzc().zzd()), new zzzg(new zzze(f.j("HMAC", String.valueOf(paramzzcx.zzc().zzg())), new SecretKeySpec(paramzzcx.zzf().zza(zzbl.zza()), "HMAC")), paramzzcx.zzc().zze()), paramzzcx.zzc().zze(), paramzzcx.zzd().zzb());
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    int j = zzc;
    byte[] arrayOfByte1 = zzd;
    if (i >= j + arrayOfByte1.length)
    {
      if (zzpy.zza(arrayOfByte1, paramArrayOfByte1))
      {
        arrayOfByte1 = Arrays.copyOfRange(paramArrayOfByte1, zzd.length, paramArrayOfByte1.length - zzc);
        byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfByte1, paramArrayOfByte1.length - zzc, paramArrayOfByte1.length);
        paramArrayOfByte1 = paramArrayOfByte2;
        if (paramArrayOfByte2 == null) {
          paramArrayOfByte1 = new byte[0];
        }
        paramArrayOfByte2 = Arrays.copyOf(ByteBuffer.allocate(8).putLong(paramArrayOfByte1.length * 8L).array(), 8);
        zzb.zza(arrayOfByte2, zzyc.zza(new byte[][] { paramArrayOfByte1, arrayOfByte1, paramArrayOfByte2 }));
        return zza.zza(arrayOfByte1);
      }
      throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
    throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = zza.zzb(paramArrayOfByte1);
    paramArrayOfByte1 = paramArrayOfByte2;
    if (paramArrayOfByte2 == null) {
      paramArrayOfByte1 = new byte[0];
    }
    paramArrayOfByte2 = Arrays.copyOf(ByteBuffer.allocate(8).putLong(paramArrayOfByte1.length * 8L).array(), 8);
    paramArrayOfByte1 = zzb.zza(zzyc.zza(new byte[][] { paramArrayOfByte1, arrayOfByte, paramArrayOfByte2 }));
    return zzyc.zza(new byte[][] { zzd, arrayOfByte, paramArrayOfByte1 });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzyn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */