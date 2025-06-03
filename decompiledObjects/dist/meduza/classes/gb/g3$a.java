package gb;

import java.util.Arrays;
import java.util.Map;
import n7.g;
import n7.g.a;
import x6.b;

public final class g3$a
{
  public final String a;
  public final Map<String, ?> b;
  
  public g3$a(String paramString, Map<String, ?> paramMap)
  {
    b.y(paramString, "policyName");
    a = paramString;
    b.y(paramMap, "rawConfigValue");
    b = paramMap;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof a;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (bool1)
    {
      paramObject = (a)paramObject;
      bool3 = bool2;
      if (a.equals(a))
      {
        bool3 = bool2;
        if (b.equals(b)) {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a, b });
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a, "policyName");
    locala.a(b, "rawConfigValue");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     gb.g3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */