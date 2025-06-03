package u5;

import java.util.concurrent.atomic.AtomicLong;

public class N$a
{
  public static final AtomicLong b = new AtomicLong(0L);
  public final long a;
  
  public N$a(long paramLong)
  {
    a = paramLong;
  }
  
  public static a b()
  {
    return c(b.incrementAndGet());
  }
  
  public static a c(long paramLong)
  {
    return new a(paramLong);
  }
  
  public long d()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     u5.N.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */