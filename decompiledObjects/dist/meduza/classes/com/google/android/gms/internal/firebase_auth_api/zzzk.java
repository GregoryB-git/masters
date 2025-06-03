package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbe;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzzk
  implements zzbe
{
  private final com.google.android.gms.internal.firebase-auth-api.zzhp zza;
  private final byte[] zzb;
  
  private zzzk(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    zza = new zzhp(paramArrayOfByte1);
    zzb = paramArrayOfByte2;
  }
  
  public static zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzfv paramzzfv)
  {
    return new zzzk(paramzzfv.zzd().zza(zzbl.zza()), paramzzfv.zzc().zzb());
  }
  
  private final byte[] zzc(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length >= 40)
    {
      byte[] arrayOfByte = Arrays.copyOf(paramArrayOfByte1, 24);
      paramArrayOfByte1 = ByteBuffer.wrap(paramArrayOfByte1, 24, paramArrayOfByte1.length - 24);
      return zza.zza(paramArrayOfByte1, arrayOfByte, paramArrayOfByte2);
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = zzb;
    if (arrayOfByte.length == 0) {
      return zzc(paramArrayOfByte1, paramArrayOfByte2);
    }
    if (zzpy.zza(arrayOfByte, paramArrayOfByte1)) {
      return zzc(Arrays.copyOfRange(paramArrayOfByte1, zzb.length, paramArrayOfByte1.length), paramArrayOfByte2);
    }
    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramArrayOfByte1.length + 24 + 16);
    byte[] arrayOfByte = zzpp.zza(24);
    localByteBuffer.put(arrayOfByte);
    zza.zza(localByteBuffer, arrayOfByte, paramArrayOfByte1, paramArrayOfByte2);
    paramArrayOfByte1 = localByteBuffer.array();
    paramArrayOfByte2 = zzb;
    if (paramArrayOfByte2.length == 0) {
      return paramArrayOfByte1;
    }
    return zzyc.zza(new byte[][] { paramArrayOfByte2, paramArrayOfByte1 });
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */