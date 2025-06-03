package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class agx
{
  private final agv a;
  
  public agx(agv paramagv, SecureRandom paramSecureRandom)
  {
    a = paramagv;
  }
  
  public final byte[] a(String paramString)
    throws agw
  {
    try
    {
      Object localObject = a;
      int i = 0;
      paramString = ((agv)localObject).a(paramString, false);
      if (paramString.length == 32)
      {
        localObject = ByteBuffer.wrap(paramString, 4, 16);
        paramString = new byte[16];
        ((ByteBuffer)localObject).get(paramString);
        while (i < 16)
        {
          paramString[i] = ((byte)(byte)(paramString[i] ^ 0x44));
          i++;
        }
        return paramString;
      }
      paramString = new com/google/ads/interactivemedia/v3/internal/agw;
      paramString.<init>(this);
      throw paramString;
    }
    catch (IllegalArgumentException paramString)
    {
      throw new agw(this, paramString);
    }
  }
  
  public final byte[] a(byte[] paramArrayOfByte, String paramString)
    throws agw
  {
    if (paramArrayOfByte.length == 16) {
      try
      {
        byte[] arrayOfByte = a.a(paramString, false);
        if (arrayOfByte.length > 16)
        {
          Object localObject = ByteBuffer.allocate(arrayOfByte.length);
          ((ByteBuffer)localObject).put(arrayOfByte);
          ((ByteBuffer)localObject).flip();
          paramString = new byte[16];
          arrayOfByte = new byte[arrayOfByte.length - 16];
          ((ByteBuffer)localObject).get(paramString);
          ((ByteBuffer)localObject).get(arrayOfByte);
          localObject = new javax/crypto/spec/SecretKeySpec;
          ((SecretKeySpec)localObject).<init>(paramArrayOfByte, "AES");
          paramArrayOfByte = Cipher.getInstance("AES/CBC/PKCS5Padding");
          IvParameterSpec localIvParameterSpec = new javax/crypto/spec/IvParameterSpec;
          localIvParameterSpec.<init>(paramString);
          paramArrayOfByte.init(2, (Key)localObject, localIvParameterSpec);
          return paramArrayOfByte.doFinal(arrayOfByte);
        }
        paramArrayOfByte = new com/google/ads/interactivemedia/v3/internal/agw;
        paramArrayOfByte.<init>(this);
        throw paramArrayOfByte;
      }
      catch (IllegalArgumentException paramArrayOfByte)
      {
        throw new agw(this, paramArrayOfByte);
      }
      catch (InvalidAlgorithmParameterException paramArrayOfByte)
      {
        throw new agw(this, paramArrayOfByte);
      }
      catch (BadPaddingException paramArrayOfByte)
      {
        throw new agw(this, paramArrayOfByte);
      }
      catch (NoSuchPaddingException paramArrayOfByte)
      {
        throw new agw(this, paramArrayOfByte);
      }
      catch (IllegalBlockSizeException paramArrayOfByte)
      {
        throw new agw(this, paramArrayOfByte);
      }
      catch (InvalidKeyException paramArrayOfByte)
      {
        throw new agw(this, paramArrayOfByte);
      }
      catch (NoSuchAlgorithmException paramArrayOfByte)
      {
        throw new agw(this, paramArrayOfByte);
      }
    }
    throw new agw(this);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.agx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */