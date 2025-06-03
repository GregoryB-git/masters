package com.google.android.exoplayer2.upstream.crypto;

import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class AesFlushingCipher
{
  private final int blockSize;
  private final Cipher cipher;
  private final byte[] flushedBlock;
  private int pendingXorBytes;
  private final byte[] zerosBlock;
  
  public AesFlushingCipher(int paramInt, byte[] paramArrayOfByte, long paramLong1, long paramLong2)
  {
    try
    {
      Cipher localCipher = Cipher.getInstance("AES/CTR/NoPadding");
      cipher = localCipher;
      int i = localCipher.getBlockSize();
      blockSize = i;
      zerosBlock = new byte[i];
      flushedBlock = new byte[i];
      long l = paramLong2 / i;
      i = (int)(paramLong2 % i);
      SecretKeySpec localSecretKeySpec = new javax/crypto/spec/SecretKeySpec;
      localSecretKeySpec.<init>(paramArrayOfByte, com.google.android.exoplayer2.util.Util.splitAtFirst(localCipher.getAlgorithm(), "/")[0]);
      paramArrayOfByte = new javax/crypto/spec/IvParameterSpec;
      paramArrayOfByte.<init>(getInitializationVector(paramLong1, l));
      localCipher.init(paramInt, localSecretKeySpec, paramArrayOfByte);
      if (i != 0) {
        updateInPlace(new byte[i], 0, i);
      }
      return;
    }
    catch (InvalidAlgorithmParameterException paramArrayOfByte) {}catch (InvalidKeyException paramArrayOfByte) {}catch (NoSuchPaddingException paramArrayOfByte) {}catch (NoSuchAlgorithmException paramArrayOfByte) {}
    throw new RuntimeException(paramArrayOfByte);
  }
  
  private byte[] getInitializationVector(long paramLong1, long paramLong2)
  {
    return ByteBuffer.allocate(16).putLong(paramLong1).putLong(paramLong2).array();
  }
  
  private int nonFlushingUpdate(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
  {
    try
    {
      paramInt1 = cipher.update(paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, paramInt3);
      return paramInt1;
    }
    catch (ShortBufferException paramArrayOfByte1)
    {
      throw new RuntimeException(paramArrayOfByte1);
    }
  }
  
  public void update(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
  {
    do
    {
      i = pendingXorBytes;
      if (i <= 0) {
        break;
      }
      paramArrayOfByte2[paramInt3] = ((byte)(byte)(paramArrayOfByte1[paramInt1] ^ flushedBlock[(blockSize - i)]));
      paramInt3++;
      paramInt1++;
      pendingXorBytes = (i - 1);
      i = paramInt2 - 1;
      paramInt2 = i;
    } while (i != 0);
    return;
    paramInt1 = nonFlushingUpdate(paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, paramInt3);
    if (paramInt2 == paramInt1) {
      return;
    }
    int i = paramInt2 - paramInt1;
    int j = blockSize;
    paramInt2 = 0;
    boolean bool1 = true;
    boolean bool2;
    if (i < j) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkState(bool2);
    paramInt1 = paramInt3 + paramInt1;
    paramInt3 = blockSize - i;
    pendingXorBytes = paramInt3;
    if (nonFlushingUpdate(zerosBlock, 0, paramInt3, flushedBlock, 0) == blockSize) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    Assertions.checkState(bool2);
    while (paramInt2 < i)
    {
      paramArrayOfByte2[paramInt1] = ((byte)flushedBlock[paramInt2]);
      paramInt2++;
      paramInt1++;
    }
  }
  
  public void updateInPlace(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    update(paramArrayOfByte, paramInt1, paramInt2, paramArrayOfByte, paramInt1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.crypto.AesFlushingCipher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */