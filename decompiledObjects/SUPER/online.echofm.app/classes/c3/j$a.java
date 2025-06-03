package c3;

import java.security.GeneralSecurityException;
import java.util.Set;
import k3.d;

public class j$a
  implements j.b
{
  public j$a(d paramd) {}
  
  public h a(Class paramClass)
  {
    try
    {
      paramClass = new i(a, paramClass);
      return paramClass;
    }
    catch (IllegalArgumentException paramClass)
    {
      throw new GeneralSecurityException("Primitive type not supported", paramClass);
    }
  }
  
  public h b()
  {
    d locald = a;
    return new i(locald, locald.b());
  }
  
  public Class c()
  {
    return a.getClass();
  }
  
  public Set d()
  {
    return a.i();
  }
}

/* Location:
 * Qualified Name:     c3.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */