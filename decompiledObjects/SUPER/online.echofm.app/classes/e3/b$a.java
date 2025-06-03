package e3;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import q3.i;

public class b$a
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

/* Location:
 * Qualified Name:     e3.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */