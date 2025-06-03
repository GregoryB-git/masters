package W2;

public final class p
  extends l
{
  private static final long serialVersionUID = 0L;
  public final Object o;
  
  public p(Object paramObject)
  {
    o = paramObject;
  }
  
  public Object b()
  {
    return o;
  }
  
  public boolean c()
  {
    return true;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof p))
    {
      paramObject = (p)paramObject;
      return o.equals(o);
    }
    return false;
  }
  
  public int hashCode()
  {
    return o.hashCode() + 1502476572;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Optional.of(");
    localStringBuilder.append(o);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     W2.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */