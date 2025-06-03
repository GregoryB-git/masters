package eb;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import x6.b;

public final class h1$c
{
  public final h1.b a;
  public final ScheduledFuture<?> b;
  
  public h1$c(h1.b paramb, ScheduledFuture paramScheduledFuture)
  {
    a = paramb;
    b.y(paramScheduledFuture, "future");
    b = paramScheduledFuture;
  }
  
  public final void a()
  {
    a.b = true;
    b.cancel(false);
  }
}

/* Location:
 * Qualified Name:     eb.h1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */