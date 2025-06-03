package eb;

import f;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class q
  implements Comparable<q>
{
  public static final a d = new a();
  public static final long e;
  public static final long f;
  public static final long o = TimeUnit.SECONDS.toNanos(1L);
  public final b a;
  public final long b;
  public volatile boolean c;
  
  static
  {
    long l = TimeUnit.DAYS.toNanos(36500L);
    e = l;
    f = -l;
  }
  
  public q(long paramLong)
  {
    a = locala;
    paramLong = Math.min(e, Math.max(f, paramLong));
    b = (l + paramLong);
    boolean bool;
    if (paramLong <= 0L) {
      bool = true;
    } else {
      bool = false;
    }
    c = bool;
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (q)paramObject;
    f((q)paramObject);
    boolean bool = b - b < 0L;
    int i;
    if (bool) {
      i = -1;
    } else if (i > 0) {
      i = 1;
    } else {
      i = 0;
    }
    return i;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof q)) {
      return false;
    }
    q localq = (q)paramObject;
    paramObject = a;
    if (paramObject == null ? a != null : paramObject != a) {
      return false;
    }
    return b == b;
  }
  
  public final void f(q paramq)
  {
    if (a == a) {
      return;
    }
    StringBuilder localStringBuilder = f.l("Tickers (");
    localStringBuilder.append(a);
    localStringBuilder.append(" and ");
    localStringBuilder.append(a);
    localStringBuilder.append(") don't match. Custom Ticker should only be used in tests!");
    throw new AssertionError(localStringBuilder.toString());
  }
  
  public final boolean g()
  {
    if (!c)
    {
      long l = b;
      ((a)a).getClass();
      if (l - System.nanoTime() <= 0L) {
        c = true;
      } else {
        return false;
      }
    }
    return true;
  }
  
  public final long h(TimeUnit paramTimeUnit)
  {
    ((a)a).getClass();
    long l = System.nanoTime();
    if ((!c) && (b - l <= 0L)) {
      c = true;
    }
    return paramTimeUnit.convert(b - l, TimeUnit.NANOSECONDS);
  }
  
  public final int hashCode()
  {
    return Arrays.asList(new Object[] { a, Long.valueOf(b) }).hashCode();
  }
  
  public final String toString()
  {
    long l1 = h(TimeUnit.NANOSECONDS);
    long l2 = Math.abs(l1);
    long l3 = o;
    l2 /= l3;
    l3 = Math.abs(l1) % l3;
    StringBuilder localStringBuilder1 = new StringBuilder();
    if (l1 < 0L) {
      localStringBuilder1.append('-');
    }
    localStringBuilder1.append(l2);
    if (l3 > 0L) {
      localStringBuilder1.append(String.format(Locale.US, ".%09d", new Object[] { Long.valueOf(l3) }));
    }
    localStringBuilder1.append("s from now");
    if (a != d)
    {
      StringBuilder localStringBuilder2 = f.l(" (ticker=");
      localStringBuilder2.append(a);
      localStringBuilder2.append(")");
      localStringBuilder1.append(localStringBuilder2.toString());
    }
    return localStringBuilder1.toString();
  }
  
  public static final class a
    extends q.b
  {}
  
  public static abstract class b {}
}

/* Location:
 * Qualified Name:     eb.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */