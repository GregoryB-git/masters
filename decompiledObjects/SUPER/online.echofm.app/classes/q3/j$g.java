package q3;

import java.security.Provider;
import java.security.Signature;

public class j$g
  implements j
{
  public Signature b(String paramString, Provider paramProvider)
  {
    if (paramProvider == null) {
      return Signature.getInstance(paramString);
    }
    return Signature.getInstance(paramString, paramProvider);
  }
}

/* Location:
 * Qualified Name:     q3.j.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */