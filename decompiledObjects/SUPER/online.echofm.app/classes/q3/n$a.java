package q3;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;

public class n$a
  extends ThreadLocal
{
  public n$a(n paramn) {}
  
  public Mac a()
  {
    try
    {
      Mac localMac = (Mac)i.c.a(n.b(a));
      localMac.init(n.c(a));
      return localMac;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new IllegalStateException(localGeneralSecurityException);
    }
  }
}

/* Location:
 * Qualified Name:     q3.n.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */