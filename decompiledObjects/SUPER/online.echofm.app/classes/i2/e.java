package i2;

public final class e
{
  public static final e c = new a().a();
  public final long a;
  public final long b;
  
  public e(long paramLong1, long paramLong2)
  {
    a = paramLong1;
    b = paramLong2;
  }
  
  public static a c()
  {
    return new a();
  }
  
  public long a()
  {
    return a;
  }
  
  public long b()
  {
    return b;
  }
  
  public static final class a
  {
    public long a = 0L;
    public long b = 0L;
    
    public e a()
    {
      return new e(a, b);
    }
    
    public a b(long paramLong)
    {
      a = paramLong;
      return this;
    }
    
    public a c(long paramLong)
    {
      b = paramLong;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     i2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */