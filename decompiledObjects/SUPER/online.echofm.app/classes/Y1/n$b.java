package Y1;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;

public final class n$b
{
  public final ScheduledThreadPoolExecutor a()
  {
    try
    {
      if (n.p() == null)
      {
        ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor1 = new java/util/concurrent/ScheduledThreadPoolExecutor;
        localScheduledThreadPoolExecutor1.<init>(1);
        n.q(localScheduledThreadPoolExecutor1);
      }
    }
    finally
    {
      break label47;
    }
    ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor2 = n.p();
    if (localScheduledThreadPoolExecutor2 != null) {
      return localScheduledThreadPoolExecutor2;
    }
    Intrinsics.n("backgroundExecutor");
    throw null;
    label47:
    throw localScheduledThreadPoolExecutor2;
  }
}

/* Location:
 * Qualified Name:     Y1.n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */