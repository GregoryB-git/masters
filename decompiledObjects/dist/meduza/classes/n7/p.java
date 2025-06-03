package n7;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import x6.b;

public final class p
{
  public final v.a a = v.a;
  public boolean b;
  public long c;
  
  public final long a(TimeUnit paramTimeUnit)
  {
    boolean bool = b;
    long l = 0L;
    if (bool)
    {
      a.getClass();
      l = 0L + (System.nanoTime() - c);
    }
    return paramTimeUnit.convert(l, TimeUnit.NANOSECONDS);
  }
  
  public final void b()
  {
    b.I(b ^ true, "This stopwatch is already running.");
    b = true;
    a.getClass();
    c = System.nanoTime();
  }
  
  public final String toString()
  {
    long l;
    if (b)
    {
      a.getClass();
      l = System.nanoTime() - c + 0L;
    }
    else
    {
      l = 0L;
    }
    Object localObject1 = TimeUnit.DAYS;
    Object localObject2 = TimeUnit.NANOSECONDS;
    if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L)
    {
      localObject1 = TimeUnit.HOURS;
      if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L)
      {
        localObject1 = TimeUnit.MINUTES;
        if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L)
        {
          localObject1 = TimeUnit.SECONDS;
          if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L)
          {
            localObject1 = TimeUnit.MILLISECONDS;
            if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L)
            {
              localObject1 = TimeUnit.MICROSECONDS;
              if (((TimeUnit)localObject1).convert(l, (TimeUnit)localObject2) <= 0L) {
                localObject1 = localObject2;
              }
            }
          }
        }
      }
    }
    double d = l / ((TimeUnit)localObject2).convert(1L, (TimeUnit)localObject1);
    localObject2 = new StringBuilder();
    int i = i.a;
    ((StringBuilder)localObject2).append(String.format(Locale.ROOT, "%.4g", new Object[] { Double.valueOf(d) }));
    ((StringBuilder)localObject2).append(" ");
    switch (a.a[localObject1.ordinal()])
    {
    default: 
      throw new AssertionError();
    case 7: 
      localObject1 = "d";
      break;
    case 6: 
      localObject1 = "h";
      break;
    case 5: 
      localObject1 = "min";
      break;
    case 4: 
      localObject1 = "s";
      break;
    case 3: 
      localObject1 = "ms";
      break;
    case 2: 
      localObject1 = "μs";
      break;
    case 1: 
      localObject1 = "ns";
    }
    ((StringBuilder)localObject2).append((String)localObject1);
    return ((StringBuilder)localObject2).toString();
  }
}

/* Location:
 * Qualified Name:     n7.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */