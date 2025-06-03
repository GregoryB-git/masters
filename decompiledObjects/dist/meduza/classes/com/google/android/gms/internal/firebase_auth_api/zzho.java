package com.google.android.gms.internal.firebase_auth_api;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

abstract class zzho
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zza;
  private final com.google.android.gms.internal.firebase-auth-api.zzhm zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzhm zzc;
  
  public zzho(byte[] paramArrayOfByte)
  {
    if (zza.zza())
    {
      zzb = zza(paramArrayOfByte, 1);
      zzc = zza(paramArrayOfByte, 0);
      return;
    }
    throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
  }
  
  private final byte[] zza(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = zzc.zza(paramArrayOfByte, 0);
    byte[] arrayOfByte = new byte[32];
    paramArrayOfByte.get(arrayOfByte);
    return arrayOfByte;
  }
  
  private static byte[] zza(byte[] paramArrayOfByte, ByteBuffer paramByteBuffer)
  {
    int i;
    if (paramArrayOfByte.length % 16 == 0) {
      i = paramArrayOfByte.length;
    } else {
      i = paramArrayOfByte.length + 16 - paramArrayOfByte.length % 16;
    }
    int j = paramByteBuffer.remaining();
    int k = j % 16;
    if (k == 0) {
      k = j;
    } else {
      k = j + 16 - k;
    }
    k += i;
    ByteBuffer localByteBuffer = ByteBuffer.allocate(k + 16).order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.put(paramArrayOfByte);
    localByteBuffer.position(i);
    localByteBuffer.put(paramByteBuffer);
    localByteBuffer.position(k);
    localByteBuffer.putLong(paramArrayOfByte.length);
    localByteBuffer.putLong(j);
    return localByteBuffer.array();
  }
  
  public abstract com.google.android.gms.internal.firebase-auth-api.zzhm zza(byte[] paramArrayOfByte, int paramInt);
  
  public void zza(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    if (paramByteBuffer.remaining() >= paramArrayOfByte2.length + 16)
    {
      int i = paramByteBuffer.position();
      zzb.zza(paramByteBuffer, paramArrayOfByte1, paramArrayOfByte2);
      paramByteBuffer.position(i);
      paramByteBuffer.limit(paramByteBuffer.limit() - 16);
      paramArrayOfByte2 = paramArrayOfByte3;
      if (paramArrayOfByte3 == null) {
        paramArrayOfByte2 = new byte[0];
      }
      paramArrayOfByte1 = zzhu.zza(zza(paramArrayOfByte1), zza(paramArrayOfByte2, paramByteBuffer));
      paramByteBuffer.limit(paramByteBuffer.limit() + 16);
      paramByteBuffer.put(paramArrayOfByte1);
      return;
    }
    throw new IllegalArgumentException("Given ByteBuffer output is too small");
  }
  
  public byte[] zza(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramByteBuffer.remaining() >= 16)
    {
      int i = paramByteBuffer.position();
      byte[] arrayOfByte1 = new byte[16];
      paramByteBuffer.position(paramByteBuffer.limit() - 16);
      paramByteBuffer.get(arrayOfByte1);
      paramByteBuffer.position(i);
      paramByteBuffer.limit(paramByteBuffer.limit() - 16);
      byte[] arrayOfByte2 = paramArrayOfByte2;
      if (paramArrayOfByte2 == null) {
        arrayOfByte2 = new byte[0];
      }
      try
      {
        boolean bool = MessageDigest.isEqual(zzhu.zza(zza(paramArrayOfByte1), zza(arrayOfByte2, paramByteBuffer)), arrayOfByte1);
        if (bool)
        {
          paramByteBuffer.position(i);
          return zzb.zza(paramArrayOfByte1, paramByteBuffer);
        }
        paramByteBuffer = new java/security/GeneralSecurityException;
        paramByteBuffer.<init>("invalid MAC");
        throw paramByteBuffer;
      }
      catch (GeneralSecurityException paramByteBuffer)
      {
        throw new AEADBadTagException(paramByteBuffer.toString());
      }
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
  
  public byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    return zza(ByteBuffer.wrap(paramArrayOfByte2), paramArrayOfByte1, paramArrayOfByte3);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzho
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */