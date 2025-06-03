package F0;

public final class P
  implements M
{
  public final long a;
  public final long b;
  
  public P(long paramLong)
  {
    this(paramLong, 0L);
  }
  
  public P(long paramLong1, long paramLong2)
  {
    a = paramLong1;
    b = paramLong2;
  }
  
  public boolean h()
  {
    return true;
  }
  
  public M.a j(long paramLong)
  {
    return new M.a(new N(paramLong, b));
  }
  
  public long l()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     F0.P
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */