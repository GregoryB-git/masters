package X2;

import java.io.Serializable;
import java.util.Comparator;

public final class m
  extends P
  implements Serializable
{
  private static final long serialVersionUID = 0L;
  public final Comparator o;
  
  public m(Comparator paramComparator)
  {
    o = ((Comparator)W2.m.j(paramComparator));
  }
  
  public int compare(Object paramObject1, Object paramObject2)
  {
    return o.compare(paramObject1, paramObject2);
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof m))
    {
      paramObject = (m)paramObject;
      return o.equals(o);
    }
    return false;
  }
  
  public int hashCode()
  {
    return o.hashCode();
  }
  
  public String toString()
  {
    return o.toString();
  }
}

/* Location:
 * Qualified Name:     X2.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */