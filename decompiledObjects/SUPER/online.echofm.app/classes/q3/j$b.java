package q3;

import java.security.Provider;
import javax.crypto.KeyAgreement;

public class j$b
  implements j
{
  public KeyAgreement b(String paramString, Provider paramProvider)
  {
    if (paramProvider == null) {
      return KeyAgreement.getInstance(paramString);
    }
    return KeyAgreement.getInstance(paramString, paramProvider);
  }
}

/* Location:
 * Qualified Name:     q3.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */