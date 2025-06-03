package n7;

import f;
import java.io.Serializable;

public final class r<T>
  implements q<T>, Serializable
{
  public final q<T> a;
  public volatile transient boolean b;
  public transient T c;
  
  public r(q<T> paramq)
  {
    a = paramq;
  }
  
  public final T get()
  {
    if (!b) {
      try
      {
        if (!b)
        {
          Object localObject1 = a.get();
          c = localObject1;
          b = true;
          return (T)localObject1;
        }
      }
      finally {}
    }
    return (T)c;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Suppliers.memoize(");
    Object localObject;
    if (b)
    {
      localObject = f.l("<supplier that returned ");
      ((StringBuilder)localObject).append(c);
      ((StringBuilder)localObject).append(">");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = a;
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     n7.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */