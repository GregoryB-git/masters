package q3;

import java.security.MessageDigest;
import java.security.Provider;

public class j$f
  implements j
{
  public MessageDigest b(String paramString, Provider paramProvider)
  {
    if (paramProvider == null) {
      return MessageDigest.getInstance(paramString);
    }
    return MessageDigest.getInstance(paramString, paramProvider);
  }
}

/* Location:
 * Qualified Name:     q3.j.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */