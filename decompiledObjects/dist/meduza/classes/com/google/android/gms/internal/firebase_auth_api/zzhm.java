package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

abstract class zzhm
{
  public int[] zza;
  private final int zzb;
  
  public zzhm(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramArrayOfByte.length == 32)
    {
      zza = zzhh.zza(paramArrayOfByte);
      zzb = paramInt;
      return;
    }
    throw new InvalidKeyException("The key length in bytes must be 32.");
  }
  
  private final void zza(byte[] paramArrayOfByte, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2)
  {
    if (paramArrayOfByte.length == zza())
    {
      int i = paramByteBuffer2.remaining();
      int j = i / 64 + 1;
      for (int k = 0; k < j; k++)
      {
        ByteBuffer localByteBuffer = zza(paramArrayOfByte, zzb + k);
        if (k == j - 1) {
          zzyc.zza(paramByteBuffer1, paramByteBuffer2, localByteBuffer, i % 64);
        } else {
          zzyc.zza(paramByteBuffer1, paramByteBuffer2, localByteBuffer, 64);
        }
      }
      return;
    }
    throw new GeneralSecurityException(j.g("The nonce length (in bytes) must be ", zza()));
  }
  
  public abstract int zza();
  
  public final ByteBuffer zza(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte = zza(zzhh.zza(paramArrayOfByte), paramInt);
    Object localObject = (int[])paramArrayOfByte.clone();
    zzhh.zza((int[])localObject);
    for (paramInt = 0; paramInt < paramArrayOfByte.length; paramInt++) {
      paramArrayOfByte[paramInt] += localObject[paramInt];
    }
    localObject = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
    ((ByteBuffer)localObject).asIntBuffer().put(paramArrayOfByte, 0, 16);
    return (ByteBuffer)localObject;
  }
  
  public void zza(ByteBuffer paramByteBuffer, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramByteBuffer.remaining() >= paramArrayOfByte2.length)
    {
      zza(paramArrayOfByte1, paramByteBuffer, ByteBuffer.wrap(paramArrayOfByte2));
      return;
    }
    throw new IllegalArgumentException("Given ByteBuffer output is too small");
  }
  
  public byte[] zza(byte[] paramArrayOfByte, ByteBuffer paramByteBuffer)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(paramByteBuffer.remaining());
    zza(paramArrayOfByte, localByteBuffer, paramByteBuffer);
    return localByteBuffer.array();
  }
  
  public abstract int[] zza(int[] paramArrayOfInt, int paramInt);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzhm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */