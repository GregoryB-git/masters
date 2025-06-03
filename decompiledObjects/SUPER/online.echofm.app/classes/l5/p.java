package l5;

import java.util.Map;
import java.util.Objects;

public class p
{
  public final String a;
  public final Map b;
  
  public p(String paramString, Map paramMap)
  {
    a = paramString;
    b = paramMap;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (p)paramObject;
      if ((!a.equals(a)) || (!Objects.equals(b, b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { a, b });
  }
}

/* Location:
 * Qualified Name:     l5.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */