package q0;

import android.net.Uri;
import i0.g;
import i0.i;
import i0.k;
import i0.y;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a
  implements g
{
  public final g a;
  public final byte[] b;
  public final byte[] c;
  public CipherInputStream d;
  
  public a(g paramg, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    a = paramg;
    b = paramArrayOfByte1;
    c = paramArrayOfByte2;
  }
  
  public final void c(y paramy)
  {
    g0.a.e(paramy);
    a.c(paramy);
  }
  
  public void close()
  {
    if (d != null)
    {
      d = null;
      a.close();
    }
  }
  
  public final long e(k paramk)
  {
    try
    {
      Cipher localCipher = q();
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(b, "AES");
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(c);
      try
      {
        localCipher.init(2, localSecretKeySpec, localIvParameterSpec);
        paramk = new i(a, paramk);
        d = new CipherInputStream(paramk, localCipher);
        paramk.b();
        return -1L;
      }
      catch (InvalidAlgorithmParameterException paramk) {}catch (InvalidKeyException paramk) {}
      throw new RuntimeException(paramk);
    }
    catch (NoSuchPaddingException paramk) {}catch (NoSuchAlgorithmException paramk) {}
    throw new RuntimeException(paramk);
  }
  
  public final Map g()
  {
    return a.g();
  }
  
  public final Uri k()
  {
    return a.k();
  }
  
  public Cipher q()
  {
    return Cipher.getInstance("AES/CBC/PKCS7Padding");
  }
  
  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    g0.a.e(d);
    paramInt2 = d.read(paramArrayOfByte, paramInt1, paramInt2);
    paramInt1 = paramInt2;
    if (paramInt2 < 0) {
      paramInt1 = -1;
    }
    return paramInt1;
  }
}

/* Location:
 * Qualified Name:     q0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */