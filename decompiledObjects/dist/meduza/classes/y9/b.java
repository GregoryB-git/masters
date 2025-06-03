package y9;

import java.util.Arrays;
import m6.h;
import m6.h.a;

public final class b
{
  public String a;
  
  public b(String paramString)
  {
    a = paramString;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof b)) {
      return false;
    }
    paramObject = (b)paramObject;
    return h.a(a, a);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a });
  }
  
  public final String toString()
  {
    h.a locala = new h.a(this);
    locala.a(a, "token");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     y9.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */