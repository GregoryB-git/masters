package n7;

import f;

public final class l<T>
  extends h<T>
{
  public final T a;
  
  public l(T paramT)
  {
    a = paramT;
  }
  
  public final T a()
  {
    return (T)a;
  }
  
  public final boolean b()
  {
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof l))
    {
      paramObject = (l)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a.hashCode() + 1502476572;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Optional.of(");
    localStringBuilder.append(a);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     n7.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */