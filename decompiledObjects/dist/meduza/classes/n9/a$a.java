package n9;

import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import x6.b;

public final class a$a
{
  public final Runnable a;
  public ScheduledFuture b;
  
  public a$a(a parama, Runnable paramRunnable)
  {
    a = paramRunnable;
  }
  
  public final void a()
  {
    c.d();
    ScheduledFuture localScheduledFuture = b;
    if (localScheduledFuture != null)
    {
      localScheduledFuture.cancel(false);
      b();
    }
  }
  
  public final void b()
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Caller should have verified scheduledFuture is non-null.", bool, new Object[0]);
    b = null;
    b.Z("Delayed task not found.", c.b.remove(this), new Object[0]);
  }
}

/* Location:
 * Qualified Name:     n9.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */