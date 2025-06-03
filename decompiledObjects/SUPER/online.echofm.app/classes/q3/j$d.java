package q3;

import java.security.KeyPairGenerator;
import java.security.Provider;

public class j$d
  implements j
{
  public KeyPairGenerator b(String paramString, Provider paramProvider)
  {
    if (paramProvider == null) {
      return KeyPairGenerator.getInstance(paramString);
    }
    return KeyPairGenerator.getInstance(paramString, paramProvider);
  }
}

/* Location:
 * Qualified Name:     q3.j.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */