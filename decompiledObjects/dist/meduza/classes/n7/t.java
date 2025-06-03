package n7;

import f;
import java.io.Serializable;
import java.util.Arrays;
import x6.b;

public final class t<T>
  implements q<T>, Serializable
{
  public final T a;
  
  public t(T paramT)
  {
    a = paramT;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof t))
    {
      paramObject = (t)paramObject;
      return b.Q(a, a);
    }
    return false;
  }
  
  public final T get()
  {
    return (T)a;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { a });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Suppliers.ofInstance(");
    localStringBuilder.append(a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     n7.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */