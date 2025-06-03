package f3;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import q3.i;
import q3.p;
import q3.q;
import q3.r;

public final class a
  implements c3.a
{
  public static final ThreadLocal b = new a();
  public final SecretKey a;
  
  public a(byte[] paramArrayOfByte)
  {
    r.a(paramArrayOfByte.length);
    a = new SecretKeySpec(paramArrayOfByte, "AES");
  }
  
  public static AlgorithmParameterSpec c(byte[] paramArrayOfByte)
  {
    return d(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static AlgorithmParameterSpec d(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      Class.forName("javax.crypto.spec.GCMParameterSpec");
      GCMParameterSpec localGCMParameterSpec = new GCMParameterSpec(128, paramArrayOfByte, paramInt1, paramInt2);
      return localGCMParameterSpec;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      if (q.b()) {
        return new IvParameterSpec(paramArrayOfByte, paramInt1, paramInt2);
      }
      throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
    }
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length <= 2147483619)
    {
      byte[] arrayOfByte = new byte[paramArrayOfByte1.length + 28];
      Object localObject = p.c(12);
      System.arraycopy(localObject, 0, arrayOfByte, 0, 12);
      localObject = c((byte[])localObject);
      ThreadLocal localThreadLocal = b;
      ((Cipher)localThreadLocal.get()).init(1, a, (AlgorithmParameterSpec)localObject);
      if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
        ((Cipher)localThreadLocal.get()).updateAAD(paramArrayOfByte2);
      }
      int i = ((Cipher)localThreadLocal.get()).doFinal(paramArrayOfByte1, 0, paramArrayOfByte1.length, arrayOfByte, 12);
      if (i == paramArrayOfByte1.length + 16) {
        return arrayOfByte;
      }
      throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[] { Integer.valueOf(16), Integer.valueOf(i - paramArrayOfByte1.length) }));
    }
    throw new GeneralSecurityException("plaintext too long");
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length >= 28)
    {
      AlgorithmParameterSpec localAlgorithmParameterSpec = d(paramArrayOfByte1, 0, 12);
      ThreadLocal localThreadLocal = b;
      ((Cipher)localThreadLocal.get()).init(2, a, localAlgorithmParameterSpec);
      if ((paramArrayOfByte2 != null) && (paramArrayOfByte2.length != 0)) {
        ((Cipher)localThreadLocal.get()).updateAAD(paramArrayOfByte2);
      }
      return ((Cipher)localThreadLocal.get()).doFinal(paramArrayOfByte1, 12, paramArrayOfByte1.length - 12);
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
  
  public class a
    extends ThreadLocal
  {
    public Cipher a()
    {
      try
      {
        Cipher localCipher = (Cipher)i.b.a("AES/GCM-SIV/NoPadding");
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
 * Qualified Name:     f3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */