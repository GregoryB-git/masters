package p1;

import ec.i;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import rb.h;
import x0.q0;

public final class q
  implements Executor
{
  public final Executor a;
  public final ArrayDeque<Runnable> b;
  public Runnable c;
  public final Object d;
  
  public q(Executor paramExecutor)
  {
    a = paramExecutor;
    b = new ArrayDeque();
    d = new Object();
  }
  
  public final void a()
  {
    synchronized (d)
    {
      Object localObject2 = b.poll();
      Object localObject3 = (Runnable)localObject2;
      c = ((Runnable)localObject3);
      if (localObject2 != null) {
        a.execute((Runnable)localObject3);
      }
      localObject3 = h.a;
      return;
    }
  }
  
  public final void execute(Runnable paramRunnable)
  {
    i.e(paramRunnable, "command");
    synchronized (d)
    {
      ArrayDeque localArrayDeque = b;
      q0 localq0 = new x0/q0;
      localq0.<init>(3, paramRunnable, this);
      localArrayDeque.offer(localq0);
      if (c == null) {
        a();
      }
      paramRunnable = h.a;
      return;
    }
  }
}

/* Location:
 * Qualified Name:     p1.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */