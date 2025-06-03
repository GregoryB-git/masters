package e5;

import android.net.Uri;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import t5.k;
import t5.l0;
import t5.m;
import t5.n;

public final class a
  implements k
{
  public final k a;
  public final byte[] b;
  public final byte[] c;
  public CipherInputStream d;
  
  public a(k paramk, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    a = paramk;
    b = paramArrayOfByte1;
    c = paramArrayOfByte2;
  }
  
  public final long a(n paramn)
  {
    try
    {
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(b, "AES");
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(c);
      try
      {
        localCipher.init(2, localSecretKeySpec, localIvParameterSpec);
        paramn = new m(a, paramn);
        d = new CipherInputStream(paramn, localCipher);
        paramn.f();
        return -1L;
      }
      catch (InvalidAlgorithmParameterException paramn) {}catch (InvalidKeyException paramn) {}
      throw new RuntimeException(paramn);
    }
    catch (NoSuchPaddingException paramn) {}catch (NoSuchAlgorithmException paramn) {}
    throw new RuntimeException(paramn);
  }
  
  public final void close()
  {
    if (d != null)
    {
      d = null;
      a.close();
    }
  }
  
  public final void f(l0 paraml0)
  {
    paraml0.getClass();
    a.f(paraml0);
  }
  
  public final Map<String, List<String>> h()
  {
    return a.h();
  }
  
  public final Uri l()
  {
    return a.l();
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    d.getClass();
    paramInt2 = d.read(paramArrayOfByte, paramInt1, paramInt2);
    paramInt1 = paramInt2;
    if (paramInt2 < 0) {
      paramInt1 = -1;
    }
    return paramInt1;
  }
}

/* Location:
 * Qualified Name:     e5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */