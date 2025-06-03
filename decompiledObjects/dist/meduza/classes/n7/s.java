package n7;

import e0.d;
import f;

public final class s<T>
  implements q<T>
{
  public static final d c = new d(2);
  public volatile q<T> a;
  public T b;
  
  public s(q<T> paramq)
  {
    a = paramq;
  }
  
  public final T get()
  {
    Object localObject1 = a;
    d locald = c;
    if (localObject1 != locald) {
      try
      {
        if (a != locald)
        {
          localObject1 = a.get();
          b = localObject1;
          a = locald;
          return (T)localObject1;
        }
      }
      finally {}
    }
    return (T)b;
  }
  
  public final String toString()
  {
    q localq = a;
    StringBuilder localStringBuilder = f.l("Suppliers.memoize(");
    Object localObject = localq;
    if (localq == c)
    {
      localObject = f.l("<supplier that returned ");
      ((StringBuilder)localObject).append(b);
      ((StringBuilder)localObject).append(">");
      localObject = ((StringBuilder)localObject).toString();
    }
    localStringBuilder.append(localObject);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     n7.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */