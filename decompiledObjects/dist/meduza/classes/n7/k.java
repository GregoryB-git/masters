package n7;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public final class k<T>
  implements j<T>, Serializable
{
  public final List<? extends j<? super T>> a;
  
  public k() {}
  
  public k(List paramList)
  {
    a = paramList;
  }
  
  public final boolean apply(T paramT)
  {
    for (int i = 0; i < a.size(); i++) {
      if (!((j)a.get(i)).apply(paramT)) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof k))
    {
      paramObject = (k)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode() + 306654252;
  }
  
  public final String toString()
  {
    Object localObject = a;
    StringBuilder localStringBuilder = new StringBuilder("Predicates.");
    localStringBuilder.append("and");
    localStringBuilder.append('(');
    Iterator localIterator = ((Iterable)localObject).iterator();
    for (int i = 1; localIterator.hasNext(); i = 0)
    {
      localObject = localIterator.next();
      if (i == 0) {
        localStringBuilder.append(',');
      }
      localStringBuilder.append(localObject);
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     n7.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */