package M4;

import java.util.concurrent.TimeUnit;

public class i
{
  public long a;
  public long b;
  public TimeUnit c;
  
  public i(long paramLong1, long paramLong2, TimeUnit paramTimeUnit)
  {
    a = paramLong1;
    b = paramLong2;
    c = paramTimeUnit;
  }
  
  public double a()
  {
    int i = a.a[c.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          return a / c.toSeconds(b);
        }
        return a / b * TimeUnit.SECONDS.toMillis(1L);
      }
      return a / b * TimeUnit.SECONDS.toMicros(1L);
    }
    return a / b * TimeUnit.SECONDS.toNanos(1L);
  }
}

/* Location:
 * Qualified Name:     M4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */