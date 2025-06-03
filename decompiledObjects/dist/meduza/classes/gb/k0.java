package gb;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import x6.b;

public final class k0
  implements j
{
  public Random a = new Random();
  public long b = TimeUnit.SECONDS.toNanos(1L);
  public long c = TimeUnit.MINUTES.toNanos(2L);
  public double d = 1.6D;
  public double e = 0.2D;
  public long f = b;
  
  public final long a()
  {
    long l = f;
    double d1 = l;
    f = Math.min((d * d1), c);
    double d2 = e;
    double d3 = -d2 * d1;
    d1 = d2 * d1;
    boolean bool;
    if (d1 >= d3) {
      bool = true;
    } else {
      bool = false;
    }
    b.t(bool);
    return l + (a.nextDouble() * (d1 - d3) + d3);
  }
  
  public static final class a
    implements j.a
  {}
}

/* Location:
 * Qualified Name:     gb.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */