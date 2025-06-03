package ec;

public final class k
  implements c
{
  public final Class<?> a;
  
  public k(Class paramClass)
  {
    a = paramClass;
  }
  
  public final Class<?> d()
  {
    return a;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (((paramObject instanceof k)) && (i.a(a, a))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(" (Kotlin reflection is not available)");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     ec.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */