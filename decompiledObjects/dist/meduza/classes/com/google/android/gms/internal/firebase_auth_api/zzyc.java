package com.google.android.gms.internal.firebase_auth_api;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzyc
{
  public static final void zza(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, ByteBuffer paramByteBuffer3, int paramInt)
  {
    if ((paramInt >= 0) && (paramByteBuffer2.remaining() >= paramInt) && (paramByteBuffer3.remaining() >= paramInt) && (paramByteBuffer1.remaining() >= paramInt))
    {
      for (int i = 0; i < paramInt; i++) {
        paramByteBuffer1.put((byte)(paramByteBuffer2.get() ^ paramByteBuffer3.get()));
      }
      return;
    }
    throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
  }
  
  public static final byte[] zza(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, int paramInt3)
  {
    if ((paramInt3 >= 0) && (paramArrayOfByte1.length - paramInt3 >= paramInt1) && (paramArrayOfByte2.length - paramInt3 >= 0))
    {
      byte[] arrayOfByte = new byte[paramInt3];
      for (paramInt2 = 0; paramInt2 < paramInt3; paramInt2++) {
        arrayOfByte[paramInt2] = ((byte)(byte)(paramArrayOfByte1[(paramInt2 + paramInt1)] ^ paramArrayOfByte2[paramInt2]));
      }
      return arrayOfByte;
    }
    throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
  }
  
  public static final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length == paramArrayOfByte2.length) {
      return zza(paramArrayOfByte1, 0, paramArrayOfByte2, 0, paramArrayOfByte1.length);
    }
    throw new IllegalArgumentException("The lengths of x and y should match.");
  }
  
  public static byte[] zza(byte[]... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    int k = j;
    byte[] arrayOfByte1;
    while (j < i)
    {
      arrayOfByte1 = paramVarArgs[j];
      if (k <= Integer.MAX_VALUE - arrayOfByte1.length)
      {
        k += arrayOfByte1.length;
        j++;
      }
      else
      {
        throw new GeneralSecurityException("exceeded size limit");
      }
    }
    byte[] arrayOfByte2 = new byte[k];
    i = paramVarArgs.length;
    k = 0;
    j = k;
    while (k < i)
    {
      arrayOfByte1 = paramVarArgs[k];
      System.arraycopy(arrayOfByte1, 0, arrayOfByte2, j, arrayOfByte1.length);
      j += arrayOfByte1.length;
      k++;
    }
    return arrayOfByte2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzyc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */