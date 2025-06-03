package com.google.android.gms.internal.firebase_auth_api;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgl
{
  private static final ThreadLocal<Cipher> zza = new zzgo();
  
  public static AlgorithmParameterSpec zza(byte[] paramArrayOfByte)
  {
    return zza(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static AlgorithmParameterSpec zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    Integer localInteger = zzpy.zzb();
    if ((localInteger != null) && (localInteger.intValue() <= 19)) {
      return new IvParameterSpec(paramArrayOfByte, paramInt1, paramInt2);
    }
    return new GCMParameterSpec(128, paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public static Cipher zza()
  {
    return (Cipher)zza.get();
  }
  
  public static SecretKey zzb(byte[] paramArrayOfByte)
  {
    zzzi.zza(paramArrayOfByte.length);
    return new SecretKeySpec(paramArrayOfByte, "AES");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzgl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */