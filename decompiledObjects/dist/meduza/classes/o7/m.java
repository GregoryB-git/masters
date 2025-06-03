package o7;

import java.io.Serializable;
import java.util.Comparator;

public final class m<T>
  extends k0<T>
  implements Serializable
{
  public final Comparator<T> a;
  
  public m(Comparator<T> paramComparator)
  {
    a = paramComparator;
  }
  
  public final int compare(T paramT1, T paramT2)
  {
    return a.compare(paramT1, paramT2);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof m))
    {
      paramObject = (m)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    return a.toString();
  }
}

/* Location:
 * Qualified Name:     o7.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */