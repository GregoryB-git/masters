package q3;

import h3.b.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public final class m
  implements o3.a
{
  public static final b.b d = b.b.o;
  public final SecretKey a;
  public byte[] b;
  public byte[] c;
  
  public m(byte[] paramArrayOfByte)
  {
    r.a(paramArrayOfByte.length);
    a = new SecretKeySpec(paramArrayOfByte, "AES");
    b();
  }
  
  public static Cipher c()
  {
    if (d.c()) {
      return (Cipher)i.b.a("AES/ECB/NoPadding");
    }
    throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
  }
  
  public byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt <= 16)
    {
      Cipher localCipher = c();
      localCipher.init(1, a);
      int i = Math.max(1, (int)Math.ceil(paramArrayOfByte.length / 16.0D));
      byte[] arrayOfByte1;
      if (i * 16 == paramArrayOfByte.length) {
        arrayOfByte1 = f.d(paramArrayOfByte, (i - 1) * 16, b, 0, 16);
      } else {
        arrayOfByte1 = f.e(m3.a.a(Arrays.copyOfRange(paramArrayOfByte, (i - 1) * 16, paramArrayOfByte.length)), c);
      }
      byte[] arrayOfByte2 = new byte[16];
      for (int j = 0; j < i - 1; j++) {
        arrayOfByte2 = localCipher.doFinal(f.d(arrayOfByte2, 0, paramArrayOfByte, j * 16, 16));
      }
      return Arrays.copyOf(localCipher.doFinal(f.e(arrayOfByte1, arrayOfByte2)), paramInt);
    }
    throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
  }
  
  public final void b()
  {
    Object localObject = c();
    ((Cipher)localObject).init(1, a);
    localObject = m3.a.b(((Cipher)localObject).doFinal(new byte[16]));
    b = ((byte[])localObject);
    c = m3.a.b((byte[])localObject);
  }
}

/* Location:
 * Qualified Name:     q3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */