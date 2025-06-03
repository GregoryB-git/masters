package tc;

import java.util.concurrent.TimeUnit;
import sc.v;

public final class j
{
  public static final String a;
  public static final long b;
  public static final int c;
  public static final int d = x6.b.w0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
  public static final long e = TimeUnit.SECONDS.toNanos(x6.b.v0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
  public static e f = e.b;
  public static final s8.b g = new s8.b(0);
  public static final s8.b h = new s8.b(1);
  
  static
  {
    int i = v.a;
    Object localObject1;
    try
    {
      String str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
    }
    catch (SecurityException localSecurityException)
    {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = "DefaultDispatcher";
    }
    a = (String)localObject2;
    b = x6.b.v0("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
    int j = v.a;
    i = j;
    if (j < 2) {
      i = 2;
    }
    c = x6.b.w0("kotlinx.coroutines.scheduler.core.pool.size", i, 1, 0, 8);
  }
}

/* Location:
 * Qualified Name:     tc.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */