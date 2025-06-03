package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class r$a
  implements Executor
{
  public final Object a = new Object();
  public final ArrayDeque b = new ArrayDeque();
  public final Executor c;
  public Runnable d;
  
  public r$a(r.b paramb)
  {
    c = paramb;
  }
  
  public final void a()
  {
    synchronized (a)
    {
      Runnable localRunnable = (Runnable)b.poll();
      d = localRunnable;
      if (localRunnable != null) {
        c.execute(localRunnable);
      }
      return;
    }
  }
  
  public final void execute(Runnable paramRunnable)
  {
    synchronized (a)
    {
      ArrayDeque localArrayDeque = b;
      q localq = new g/q;
      localq.<init>(0, this, paramRunnable);
      localArrayDeque.add(localq);
      if (d == null) {
        a();
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     g.r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */