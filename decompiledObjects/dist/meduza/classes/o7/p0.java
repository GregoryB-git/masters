package o7;

import java.io.Serializable;

public final class p0<T>
  extends k0<T>
  implements Serializable
{
  public final k0<? super T> a;
  
  public p0(k0<? super T> paramk0)
  {
    paramk0.getClass();
    a = paramk0;
  }
  
  public final <S extends T> k0<S> a()
  {
    return a;
  }
  
  public final int compare(T paramT1, T paramT2)
  {
    return a.compare(paramT2, paramT1);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof p0))
    {
      paramObject = (p0)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return -a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(".reverse()");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     o7.p0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */