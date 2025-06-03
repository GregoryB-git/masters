package W2;

import java.io.Serializable;
import java.util.List;

public class o$b
  implements n, Serializable
{
  private static final long serialVersionUID = 0L;
  public final List o;
  
  public o$b(List paramList)
  {
    o = paramList;
  }
  
  public boolean apply(Object paramObject)
  {
    for (int i = 0; i < o.size(); i++) {
      if (!((n)o.get(i)).apply(paramObject)) {
        return false;
      }
    }
    return true;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof b))
    {
      paramObject = (b)paramObject;
      return o.equals(o);
    }
    return false;
  }
  
  public int hashCode()
  {
    return o.hashCode() + 306654252;
  }
  
  public String toString()
  {
    return o.a("and", o);
  }
}

/* Location:
 * Qualified Name:     W2.o.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */