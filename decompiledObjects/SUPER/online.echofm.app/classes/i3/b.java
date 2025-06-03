package i3;

import java.security.GeneralSecurityException;
import p3.J;

public abstract class b
{
  public static final String a = new a().d();
  public static final J b = J.V();
  public static final J c = J.V();
  
  static
  {
    try
    {
      a();
      return;
    }
    catch (GeneralSecurityException localGeneralSecurityException)
    {
      throw new ExceptionInInitializerError(localGeneralSecurityException);
    }
  }
  
  public static void a()
  {
    
    if (g3.a.a()) {
      return;
    }
    a.m(true);
  }
}

/* Location:
 * Qualified Name:     i3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */