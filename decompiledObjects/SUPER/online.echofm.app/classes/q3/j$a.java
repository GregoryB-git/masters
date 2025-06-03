package q3;

import java.security.Provider;
import javax.crypto.Cipher;

public class j$a
  implements j
{
  public Cipher b(String paramString, Provider paramProvider)
  {
    if (paramProvider == null) {
      return Cipher.getInstance(paramString);
    }
    return Cipher.getInstance(paramString, paramProvider);
  }
}

/* Location:
 * Qualified Name:     q3.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */