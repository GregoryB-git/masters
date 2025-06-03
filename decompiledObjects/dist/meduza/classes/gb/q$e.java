package gb;

import eb.c;
import eb.e1;
import eb.h;
import f;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class q$e
  implements Runnable
{
  public final long a;
  
  public q$e(q paramq, long paramLong)
  {
    a = paramLong;
  }
  
  public final void run()
  {
    d2.q localq = new d2.q();
    b.j.i(localq);
    long l1 = Math.abs(a);
    Object localObject = TimeUnit.SECONDS;
    long l2 = l1 / ((TimeUnit)localObject).toNanos(1L);
    long l3 = Math.abs(a);
    l1 = ((TimeUnit)localObject).toNanos(1L);
    StringBuilder localStringBuilder = f.l("deadline exceeded after ");
    if (a < 0L) {
      localStringBuilder.append('-');
    }
    localStringBuilder.append(l2);
    Locale localLocale = Locale.US;
    localStringBuilder.append(String.format(localLocale, ".%09d", new Object[] { Long.valueOf(l3 % l1) }));
    localStringBuilder.append("s. ");
    localObject = (Long)b.i.a(h.b);
    double d;
    if (localObject == null) {
      d = 0.0D;
    } else {
      d = ((Long)localObject).longValue() / q.v;
    }
    localStringBuilder.append(String.format(localLocale, "Name resolution delay %.9f seconds. ", new Object[] { Double.valueOf(d) }));
    localStringBuilder.append(localq);
    b.j.n(e1.h.a(localStringBuilder.toString()));
  }
}

/* Location:
 * Qualified Name:     gb.q.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */