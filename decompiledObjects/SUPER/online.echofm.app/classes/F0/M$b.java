package F0;

public class M$b
  implements M
{
  public final long a;
  public final M.a b;
  
  public M$b(long paramLong)
  {
    this(paramLong, 0L);
  }
  
  public M$b(long paramLong1, long paramLong2)
  {
    a = paramLong1;
    N localN;
    if (paramLong2 == 0L) {
      localN = N.c;
    } else {
      localN = new N(0L, paramLong2);
    }
    b = new M.a(localN);
  }
  
  public boolean h()
  {
    return false;
  }
  
  public M.a j(long paramLong)
  {
    return b;
  }
  
  public long l()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     F0.M.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */