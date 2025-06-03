package d5;

public final class k$d
{
  public final long a;
  public final long b;
  
  public k$d(long paramLong1, long paramLong2)
  {
    a = paramLong1;
    b = paramLong2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (d.class == paramObject.getClass()))
    {
      paramObject = (d)paramObject;
      if ((a != a) || (b != b)) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (int)a * 31 + (int)b;
  }
}

/* Location:
 * Qualified Name:     d5.k.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */