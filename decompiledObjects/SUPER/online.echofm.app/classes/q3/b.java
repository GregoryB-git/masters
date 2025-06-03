package q3;

import c3.a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class b
  implements a
{
  public static final h3.b.b e = h3.b.b.o;
  public static final ThreadLocal f = new a();
  public static final ThreadLocal g = new b();
  public final byte[] a;
  public final byte[] b;
  public final SecretKeySpec c;
  public final int d;
  
  public b(byte[] paramArrayOfByte, int paramInt)
  {
    if (e.c())
    {
      if ((paramInt != 12) && (paramInt != 16)) {
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
      }
      d = paramInt;
      r.a(paramArrayOfByte.length);
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte, "AES");
      c = localSecretKeySpec;
      paramArrayOfByte = (Cipher)f.get();
      paramArrayOfByte.init(1, localSecretKeySpec);
      paramArrayOfByte = c(paramArrayOfByte.doFinal(new byte[16]));
      a = paramArrayOfByte;
      b = c(paramArrayOfByte);
      return;
    }
    throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
  }
  
  public static byte[] c(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[16];
    int k;
    for (int i = 0; i < 15; i = k)
    {
      int j = paramArrayOfByte[i];
      k = i + 1;
      arrayOfByte[i] = ((byte)(byte)((j << 1 ^ (paramArrayOfByte[k] & 0xFF) >>> 7) & 0xFF));
    }
    i = paramArrayOfByte[15];
    arrayOfByte[15] = ((byte)(byte)(paramArrayOfByte[0] >> 7 & 0x87 ^ i << 1));
    return arrayOfByte;
  }
  
  public static byte[] f(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    byte[] arrayOfByte = new byte[i];
    for (int j = 0; j < i; j++) {
      arrayOfByte[j] = ((byte)(byte)(paramArrayOfByte1[j] ^ paramArrayOfByte2[j]));
    }
    return arrayOfByte;
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    int j = d;
    if (i <= 2147483631 - j)
    {
      byte[] arrayOfByte1 = new byte[paramArrayOfByte1.length + j + 16];
      byte[] arrayOfByte2 = p.c(j);
      i = d;
      j = 0;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, 0, i);
      Object localObject = (Cipher)f.get();
      ((Cipher)localObject).init(1, c);
      arrayOfByte2 = d((Cipher)localObject, 0, arrayOfByte2, 0, arrayOfByte2.length);
      if (paramArrayOfByte2 == null) {
        paramArrayOfByte2 = new byte[0];
      }
      paramArrayOfByte2 = d((Cipher)localObject, 1, paramArrayOfByte2, 0, paramArrayOfByte2.length);
      Cipher localCipher = (Cipher)g.get();
      localCipher.init(1, c, new IvParameterSpec(arrayOfByte2));
      localCipher.doFinal(paramArrayOfByte1, 0, paramArrayOfByte1.length, arrayOfByte1, d);
      localObject = d((Cipher)localObject, 2, arrayOfByte1, d, paramArrayOfByte1.length);
      i = paramArrayOfByte1.length;
      int k = d;
      while (j < 16)
      {
        arrayOfByte1[(i + k + j)] = ((byte)(byte)(paramArrayOfByte2[j] ^ arrayOfByte2[j] ^ localObject[j]));
        j++;
      }
      return arrayOfByte1;
    }
    throw new GeneralSecurityException("plaintext too long");
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length - d - 16;
    if (i >= 0)
    {
      Cipher localCipher = (Cipher)f.get();
      localCipher.init(1, c);
      byte[] arrayOfByte1 = d(localCipher, 0, paramArrayOfByte1, 0, d);
      int j = 0;
      byte[] arrayOfByte2 = paramArrayOfByte2;
      if (paramArrayOfByte2 == null) {
        arrayOfByte2 = new byte[0];
      }
      paramArrayOfByte2 = d(localCipher, 1, arrayOfByte2, 0, arrayOfByte2.length);
      arrayOfByte2 = d(localCipher, 2, paramArrayOfByte1, d, i);
      int k = paramArrayOfByte1.length;
      int m = 0;
      while (j < 16)
      {
        m = (byte)(m | paramArrayOfByte1[(k - 16 + j)] ^ paramArrayOfByte2[j] ^ arrayOfByte1[j] ^ arrayOfByte2[j]);
        j++;
      }
      if (m == 0)
      {
        paramArrayOfByte2 = (Cipher)g.get();
        paramArrayOfByte2.init(1, c, new IvParameterSpec(arrayOfByte1));
        return paramArrayOfByte2.doFinal(paramArrayOfByte1, d, i);
      }
      throw new AEADBadTagException("tag mismatch");
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
  
  public final byte[] d(Cipher paramCipher, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    byte[] arrayOfByte = new byte[16];
    arrayOfByte[15] = ((byte)(byte)paramInt1);
    if (paramInt3 == 0) {
      return paramCipher.doFinal(f(arrayOfByte, a));
    }
    arrayOfByte = paramCipher.doFinal(arrayOfByte);
    for (paramInt1 = 0; paramInt3 - paramInt1 > 16; paramInt1 += 16)
    {
      for (int i = 0; i < 16; i++) {
        arrayOfByte[i] = ((byte)(byte)(arrayOfByte[i] ^ paramArrayOfByte[(paramInt2 + paramInt1 + i)]));
      }
      arrayOfByte = paramCipher.doFinal(arrayOfByte);
    }
    return paramCipher.doFinal(f(arrayOfByte, e(Arrays.copyOfRange(paramArrayOfByte, paramInt1 + paramInt2, paramInt2 + paramInt3))));
  }
  
  public final byte[] e(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length == 16) {
      return f(paramArrayOfByte, a);
    }
    byte[] arrayOfByte = Arrays.copyOf(b, 16);
    for (int i = 0; i < paramArrayOfByte.length; i++) {
      arrayOfByte[i] = ((byte)(byte)(arrayOfByte[i] ^ paramArrayOfByte[i]));
    }
    arrayOfByte[paramArrayOfByte.length] = ((byte)(byte)(arrayOfByte[paramArrayOfByte.length] ^ 0x80));
    return arrayOfByte;
  }
  
  public class a
    extends ThreadLocal
  {
    public Cipher a()
    {
      try
      {
        Cipher localCipher = (Cipher)i.b.a("AES/ECB/NOPADDING");
        return localCipher;
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        throw new IllegalStateException(localGeneralSecurityException);
      }
    }
  }
  
  public class b
    extends ThreadLocal
  {
    public Cipher a()
    {
      try
      {
        Cipher localCipher = (Cipher)i.b.a("AES/CTR/NOPADDING");
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
 * Qualified Name:     q3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */