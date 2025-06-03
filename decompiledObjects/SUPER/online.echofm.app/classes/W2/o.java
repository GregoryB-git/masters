package W2;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class o
{
  public static n b(n paramn1, n paramn2)
  {
    return new b(c((n)m.j(paramn1), (n)m.j(paramn2)), null);
  }
  
  public static List c(n paramn1, n paramn2)
  {
    return Arrays.asList(new n[] { paramn1, paramn2 });
  }
  
  public static String d(String paramString, Iterable paramIterable)
  {
    StringBuilder localStringBuilder = new StringBuilder("Predicates.");
    localStringBuilder.append(paramString);
    localStringBuilder.append('(');
    paramIterable = paramIterable.iterator();
    for (int i = 1; paramIterable.hasNext(); i = 0)
    {
      paramString = paramIterable.next();
      if (i == 0) {
        localStringBuilder.append(',');
      }
      localStringBuilder.append(paramString);
    }
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
  
  public static class b
    implements n, Serializable
  {
    private static final long serialVersionUID = 0L;
    public final List o;
    
    public b(List paramList)
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
}

/* Location:
 * Qualified Name:     W2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */