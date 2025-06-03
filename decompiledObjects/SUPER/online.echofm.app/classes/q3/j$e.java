package q3;

import java.security.Provider;
import javax.crypto.Mac;

public class j$e
  implements j
{
  public Mac b(String paramString, Provider paramProvider)
  {
    if (paramProvider == null) {
      return Mac.getInstance(paramString);
    }
    return Mac.getInstance(paramString, paramProvider);
  }
}

/* Location:
 * Qualified Name:     q3.j.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */