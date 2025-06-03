package nc;

import f;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

public final class s0
  implements t0
{
  public final Future<?> a;
  
  public s0(ScheduledFuture paramScheduledFuture)
  {
    a = paramScheduledFuture;
  }
  
  public final void dispose()
  {
    a.cancel(false);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("DisposableFutureHandle[");
    localStringBuilder.append(a);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.s0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */