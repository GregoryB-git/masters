package q3;

import h3.b.b;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class a
  implements l
{
  public static final b.b d = b.b.p;
  public static final ThreadLocal e = new a();
  public final SecretKeySpec a;
  public final int b;
  public final int c;
  
  public a(byte[] paramArrayOfByte, int paramInt)
  {
    if (d.c())
    {
      r.a(paramArrayOfByte.length);
      a = new SecretKeySpec(paramArrayOfByte, "AES");
      int i = ((Cipher)e.get()).getBlockSize();
      c = i;
      if ((paramInt >= 12) && (paramInt <= i))
      {
        b = paramInt;
        return;
      }
      throw new GeneralSecurityException("invalid IV size");
    }
    throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = b;
    if (i <= Integer.MAX_VALUE - j)
    {
      byte[] arrayOfByte1 = new byte[paramArrayOfByte.length + j];
      byte[] arrayOfByte2 = p.c(j);
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, b);
      c(paramArrayOfByte, 0, paramArrayOfByte.length, arrayOfByte1, b, arrayOfByte2, true);
      return arrayOfByte1;
    }
    paramArrayOfByte = new StringBuilder();
    paramArrayOfByte.append("plaintext length can not exceed ");
    paramArrayOfByte.append(Integer.MAX_VALUE - b);
    throw new GeneralSecurityException(paramArrayOfByte.toString());
  }
  
  public byte[] b(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = b;
    if (i >= j)
    {
      byte[] arrayOfByte1 = new byte[j];
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 0, j);
      j = paramArrayOfByte.length;
      i = b;
      byte[] arrayOfByte2 = new byte[j - i];
      c(paramArrayOfByte, i, paramArrayOfByte.length - i, arrayOfByte2, 0, arrayOfByte1, false);
      return arrayOfByte2;
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
  
  public final void c(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, byte[] paramArrayOfByte3, boolean paramBoolean)
  {
    Cipher localCipher = (Cipher)e.get();
    byte[] arrayOfByte = new byte[c];
    System.arraycopy(paramArrayOfByte3, 0, arrayOfByte, 0, b);
    paramArrayOfByte3 = new IvParameterSpec(arrayOfByte);
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      localCipher.init(i, a, paramArrayOfByte3);
      break;
    }
    if (localCipher.doFinal(paramArrayOfByte1, paramInt1, paramInt2, paramArrayOfByte2, paramInt3) == paramInt2) {
      return;
    }
    throw new GeneralSecurityException("stored output's length does not match input's length");
  }
  
  public class a
    extends ThreadLocal
  {
    public Cipher a()
    {
      try
      {
        Cipher localCipher = (Cipher)i.b.a("AES/CTR/NoPadding");
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
 * Qualified Name:     q3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */