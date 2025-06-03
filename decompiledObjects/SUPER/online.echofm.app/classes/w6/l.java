package w6;

import java.util.concurrent.TimeUnit;
import l6.d;
import u6.G;

public abstract class l
{
  public static final String a = G.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
  public static final long b = G.h("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
  public static final int c = G.g("kotlinx.coroutines.scheduler.core.pool.size", d.a(G.a(), 2), 1, 0, 8, null);
  public static final int d = G.g("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
  public static final long e = TimeUnit.SECONDS.toNanos(G.h("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
  public static g f = e.a;
  public static final i g = new j(0);
  public static final i h = new j(1);
}

/* Location:
 * Qualified Name:     w6.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */