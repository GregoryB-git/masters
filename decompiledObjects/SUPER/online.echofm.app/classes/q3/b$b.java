package q3;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

public class b$b
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

/* Location:
 * Qualified Name:     q3.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */