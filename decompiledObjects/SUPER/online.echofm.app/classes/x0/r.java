package x0;

import android.net.Uri;
import i0.k;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class r
{
  public static final AtomicLong h = new AtomicLong();
  public final long a;
  public final k b;
  public final Uri c;
  public final Map d;
  public final long e;
  public final long f;
  public final long g;
  
  public r(long paramLong1, k paramk, long paramLong2)
  {
    this(paramLong1, paramk, a, Collections.emptyMap(), paramLong2, 0L, 0L);
  }
  
  public r(long paramLong1, k paramk, Uri paramUri, Map paramMap, long paramLong2, long paramLong3, long paramLong4)
  {
    a = paramLong1;
    b = paramk;
    c = paramUri;
    d = paramMap;
    e = paramLong2;
    f = paramLong3;
    g = paramLong4;
  }
  
  public static long a()
  {
    return h.getAndIncrement();
  }
}

/* Location:
 * Qualified Name:     x0.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */