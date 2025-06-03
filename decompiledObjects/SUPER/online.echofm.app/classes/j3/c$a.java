package j3;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

public final class c$a
{
  public String a = null;
  public KeyStore b = null;
  
  public c$a()
  {
    if (c.c())
    {
      try
      {
        KeyStore localKeyStore = KeyStore.getInstance("AndroidKeyStore");
        b = localKeyStore;
        localKeyStore.load(null);
        return;
      }
      catch (IOException localIOException) {}catch (GeneralSecurityException localGeneralSecurityException) {}
      throw new IllegalStateException(localGeneralSecurityException);
    }
    throw new IllegalStateException("need Android Keystore on Android M or newer");
  }
}

/* Location:
 * Qualified Name:     j3.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */