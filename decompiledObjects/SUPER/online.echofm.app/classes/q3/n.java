package q3;

import h3.b.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import o3.a;

public final class n
  implements a
{
  public static final b.b e = b.b.p;
  public final ThreadLocal a;
  public final String b;
  public final Key c;
  public final int d;
  
  public n(String paramString, Key paramKey)
  {
    a locala = new a();
    a = locala;
    if (e.c())
    {
      b = paramString;
      c = paramKey;
      if (paramKey.getEncoded().length >= 16)
      {
        paramString.hashCode();
        int i = paramString.hashCode();
        int j = -1;
        switch (i)
        {
        default: 
          break;
        case 392317873: 
          if (paramString.equals("HMACSHA512")) {
            j = 4;
          }
          break;
        case 392316170: 
          if (paramString.equals("HMACSHA384")) {
            j = 3;
          }
          break;
        case 392315118: 
          if (paramString.equals("HMACSHA256")) {
            j = 2;
          }
          break;
        case 392315023: 
          if (paramString.equals("HMACSHA224")) {
            j = 1;
          }
          break;
        case -1823053428: 
          if (paramString.equals("HMACSHA1")) {
            j = 0;
          }
          break;
        }
        switch (j)
        {
        default: 
          paramKey = new StringBuilder();
          paramKey.append("unknown Hmac algorithm: ");
          paramKey.append(paramString);
          throw new NoSuchAlgorithmException(paramKey.toString());
        case 4: 
          j = 64;
        }
        for (;;)
        {
          d = j;
          break;
          j = 48;
          continue;
          j = 32;
          continue;
          j = 28;
          continue;
          j = 20;
        }
        locala.get();
        return;
      }
      throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }
    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  public byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt <= d)
    {
      ((Mac)a.get()).update(paramArrayOfByte);
      return Arrays.copyOf(((Mac)a.get()).doFinal(), paramInt);
    }
    throw new InvalidAlgorithmParameterException("tag size too big");
  }
  
  public class a
    extends ThreadLocal
  {
    public a() {}
    
    public Mac a()
    {
      try
      {
        Mac localMac = (Mac)i.c.a(n.b(n.this));
        localMac.init(n.c(n.this));
        return localMac;
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        throw new IllegalStateException(localGeneralSecurityException);
      }
    }
  }
}

/* Location:
 * Qualified Name:     q3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */