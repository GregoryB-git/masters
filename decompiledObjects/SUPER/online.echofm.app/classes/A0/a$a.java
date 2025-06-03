package A0;

public final class a$a
{
  public final long a;
  public final long b;
  
  public a$a(long paramLong1, long paramLong2)
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
    if (!(paramObject instanceof a)) {
      return false;
    }
    paramObject = (a)paramObject;
    if ((a != a) || (b != b)) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return (int)a * 31 + (int)b;
  }
}

/* Location:
 * Qualified Name:     A0.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */