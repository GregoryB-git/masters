package F0;

public final class N
{
  public static final N c = new N(0L, 0L);
  public final long a;
  public final long b;
  
  public N(long paramLong1, long paramLong2)
  {
    a = paramLong1;
    b = paramLong2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (N.class == paramObject.getClass()))
    {
      paramObject = (N)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return (int)a * 31 + (int)b;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("[timeUs=");
    localStringBuilder.append(a);
    localStringBuilder.append(", position=");
    localStringBuilder.append(b);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     F0.N
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */