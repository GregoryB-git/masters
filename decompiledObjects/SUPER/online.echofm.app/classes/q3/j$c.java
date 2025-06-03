package q3;

import java.security.KeyFactory;
import java.security.Provider;

public class j$c
  implements j
{
  public KeyFactory b(String paramString, Provider paramProvider)
  {
    if (paramProvider == null) {
      return KeyFactory.getInstance(paramString);
    }
    return KeyFactory.getInstance(paramString, paramProvider);
  }
}

/* Location:
 * Qualified Name:     q3.j.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */