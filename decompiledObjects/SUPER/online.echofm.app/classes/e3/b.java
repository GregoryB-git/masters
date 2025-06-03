package e3;

import h3.b.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import q3.i;
import q3.q;
import q3.r;

public final class b
{
  public static final b.b c = b.b.p;
  public static final ThreadLocal d = new a();
  public final SecretKey a;
  public final boolean b;
  
  public b(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (c.c())
    {
      r.a(paramArrayOfByte.length);
      a = new SecretKeySpec(paramArrayOfByte, "AES");
      b = paramBoolean;
      return;
    }
    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  public static AlgorithmParameterSpec c(byte[] paramArrayOfByte)
  {
    return d(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static AlgorithmParameterSpec d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((q.b()) && (q.a() <= 19)) {
      return new IvParameterSpec(paramArrayOfByte, paramInt1, paramInt2);
    }
    return new GCMParameterSpec(128, paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    if (paramArrayOfByte1.length == 12)
    {
      boolean bool = b;
      int i;
      if (bool) {
        i = 28;
      } else {
        i = 16;
      }
      if (paramArrayOfByte2.length >= i)
      {
        i = 0;
        if ((bool) && (!ByteBuffer.wrap(paramArrayOfByte1).equals(ByteBuffer.wrap(paramArrayOfByte2, 0, 12)))) {
          throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec localAlgorithmParameterSpec = c(paramArrayOfByte1);
        paramArrayOfByte1 = d;
        ((Cipher)paramArrayOfByte1.get()).init(2, a, localAlgorithmParameterSpec);
        if ((paramArrayOfByte3 != null) && (paramArrayOfByte3.length != 0)) {
          ((Cipher)paramArrayOfByte1.get()).updateAAD(paramArrayOfByte3);
        }
        bool = b;
        if (bool) {
          i = 12;
        }
        int j;
        if (bool) {
          j = paramArrayOfByte2.length - 12;
        } else {
          j = paramArrayOfByte2.length;
        }
        return ((Cipher)paramArrayOfByte1.get()).doFinal(paramArrayOfByte2, i, j);
      }
      throw new GeneralSecurityException("ciphertext too short");
    }
    throw new GeneralSecurityException("iv is wrong size");
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3)
  {
    if (paramArrayOfByte1.length == 12)
    {
      if (paramArrayOfByte2.length <= 2147483619)
      {
        boolean bool = b;
        int i = paramArrayOfByte2.length;
        if (bool) {
          i += 28;
        } else {
          i += 16;
        }
        byte[] arrayOfByte = new byte[i];
        if (bool) {
          System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, 12);
        }
        AlgorithmParameterSpec localAlgorithmParameterSpec = c(paramArrayOfByte1);
        paramArrayOfByte1 = d;
        ((Cipher)paramArrayOfByte1.get()).init(1, a, localAlgorithmParameterSpec);
        if ((paramArrayOfByte3 != null) && (paramArrayOfByte3.length != 0)) {
          ((Cipher)paramArrayOfByte1.get()).updateAAD(paramArrayOfByte3);
        }
        if (b) {
          i = 12;
        } else {
          i = 0;
        }
        i = ((Cipher)paramArrayOfByte1.get()).doFinal(paramArrayOfByte2, 0, paramArrayOfByte2.length, arrayOfByte, i);
        if (i == paramArrayOfByte2.length + 16) {
          return arrayOfByte;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[] { Integer.valueOf(16), Integer.valueOf(i - paramArrayOfByte2.length) }));
      }
      throw new GeneralSecurityException("plaintext too long");
    }
    throw new GeneralSecurityException("iv is wrong size");
  }
  
  public class a
    extends ThreadLocal
  {
    public Cipher a()
    {
      try
      {
        Cipher localCipher = (Cipher)i.b.a("AES/GCM/NoPadding");
        return localCipher;
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        throw new IllegalStateException(localGeneralSecurityException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     e3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */