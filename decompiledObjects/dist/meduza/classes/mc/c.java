package mc;

import java.util.concurrent.TimeUnit;
import p2.m0;

public enum c
{
  public final TimeUnit a;
  
  static
  {
    c localc1 = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
    b = localc1;
    c localc2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
    c localc3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
    c = localc3;
    c localc4 = new c("SECONDS", 3, TimeUnit.SECONDS);
    d = localc4;
    c localc5 = new c("MINUTES", 4, TimeUnit.MINUTES);
    e = localc5;
    c localc6 = new c("HOURS", 5, TimeUnit.HOURS);
    f = localc6;
    c localc7 = new c("DAYS", 6, TimeUnit.DAYS);
    o = localc7;
    c[] arrayOfc = new c[7];
    arrayOfc[0] = localc1;
    arrayOfc[1] = localc2;
    arrayOfc[2] = localc3;
    arrayOfc[3] = localc4;
    arrayOfc[4] = localc5;
    arrayOfc[5] = localc6;
    arrayOfc[6] = localc7;
    p = arrayOfc;
    m0.D(arrayOfc);
  }
  
  public c(TimeUnit paramTimeUnit)
  {
    a = paramTimeUnit;
  }
}

/* Location:
 * Qualified Name:     mc.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */