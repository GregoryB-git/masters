package T;

public class a$e
{
  public final long a;
  public final long b;
  
  public a$e(long paramLong1, long paramLong2)
  {
    if (paramLong2 == 0L)
    {
      a = 0L;
      b = 1L;
      return;
    }
    a = paramLong1;
    b = paramLong2;
  }
  
  public double a()
  {
    return a / b;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append("/");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     T.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */