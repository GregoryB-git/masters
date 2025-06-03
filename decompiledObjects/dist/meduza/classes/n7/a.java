package n7;

public final class a<T>
  extends h<T>
{
  public static final a<Object> a = new a();
  
  public final T a()
  {
    throw new IllegalStateException("Optional.get() cannot be called on an absent value");
  }
  
  public final boolean b()
  {
    return false;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    return 2040732332;
  }
  
  public final String toString()
  {
    return "Optional.absent()";
  }
}

/* Location:
 * Qualified Name:     n7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */