package i2;

import ec.i;
import java.util.List;
import sb.q;

public final class k
{
  public final List<a> a;
  
  public k(List<? extends a> paramList)
  {
    a = paramList;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (i.a(k.class, paramObject.getClass())))
    {
      paramObject = (k)paramObject;
      return i.a(a, a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    return q.p(a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
  }
}

/* Location:
 * Qualified Name:     i2.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */