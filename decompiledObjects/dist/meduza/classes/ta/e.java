package ta;

import java.util.Map;
import java.util.Objects;

public final class e
{
  public final String a;
  public final Map<?, ?> b;
  
  public e(String paramString, Map<?, ?> paramMap)
  {
    a = paramString;
    b = paramMap;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (e.class == paramObject.getClass()))
    {
      paramObject = (e)paramObject;
      if ((!a.equals(a)) || (!Objects.equals(b, b))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { a, b });
  }
}

/* Location:
 * Qualified Name:     ta.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */