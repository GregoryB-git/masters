package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
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

final class qo
  implements tt
{
  private final tt a;
  private final byte[] b;
  private final byte[] c;
  private CipherInputStream d;
  
  public qo(tt paramtt, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    a = paramtt;
    b = paramArrayOfByte1;
    c = paramArrayOfByte2;
  }
  
  public final int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    rp.a(d);
    paramInt2 = d.read(paramArrayOfByte, paramInt1, paramInt2);
    paramInt1 = paramInt2;
    if (paramInt2 < 0) {
      paramInt1 = -1;
    }
    return paramInt1;
  }
  
  public final long a(tx paramtx)
    throws IOException
  {
    try
    {
      Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(b, "AES");
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(c);
      try
      {
        localCipher.init(2, localSecretKeySpec, localIvParameterSpec);
        paramtx = new tu(a, paramtx);
        d = new CipherInputStream(paramtx, localCipher);
        paramtx.a();
        return -1L;
      }
      catch (InvalidAlgorithmParameterException paramtx) {}catch (InvalidKeyException paramtx) {}
      throw new RuntimeException(paramtx);
    }
    catch (NoSuchPaddingException paramtx) {}catch (NoSuchAlgorithmException paramtx) {}
    throw new RuntimeException(paramtx);
  }
  
  public final Uri a()
  {
    return a.a();
  }
  
  public final void a(vc paramvc)
  {
    a.a(paramvc);
  }
  
  public final Map<String, List<String>> b()
  {
    return a.b();
  }
  
  public final void c()
    throws IOException
  {
    if (d != null)
    {
      d = null;
      a.c();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */