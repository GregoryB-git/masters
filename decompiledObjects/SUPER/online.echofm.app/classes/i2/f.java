package i2;

public final class f
{
  public static final f c = new a().a();
  public final long a;
  public final long b;
  
  public f(long paramLong1, long paramLong2)
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
    return b;
  }
  
  public long b()
  {
    return a;
  }
  
  public static final class a
  {
    public long a = 0L;
    public long b = 0L;
    
    public f a()
    {
      return new f(a, b);
    }
    
    public a b(long paramLong)
    {
      b = paramLong;
      return this;
    }
    
    public a c(long paramLong)
    {
      a = paramLong;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     i2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */