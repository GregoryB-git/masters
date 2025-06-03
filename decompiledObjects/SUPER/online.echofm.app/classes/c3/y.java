package c3;

import java.security.GeneralSecurityException;

public final class y
{
  public static final y a = new y();
  
  public static y a()
  {
    return a;
  }
  
  public static y b(y paramy)
  {
    if (paramy != null) {
      return paramy;
    }
    throw new GeneralSecurityException("SecretKeyAccess is required");
  }
}

/* Location:
 * Qualified Name:     c3.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */