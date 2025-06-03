package W2;

public final class a
  extends l
{
  public static final a o = new a();
  private static final long serialVersionUID = 0L;
  
  public static l e()
  {
    return o;
  }
  
  private Object readResolve()
  {
    return o;
  }
  
  public Object b()
  {
    throw new IllegalStateException("Optional.get() cannot be called on an absent value");
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return 2040732332;
  }
  
  public String toString()
  {
    return "Optional.absent()";
  }
}

/* Location:
 * Qualified Name:     W2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */