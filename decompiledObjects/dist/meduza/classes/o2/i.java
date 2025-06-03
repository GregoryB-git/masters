package o2;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import nc.j1;
import nc.m1;
import nc.o1;
import s7.e;
import z2.a;
import z2.a.b;
import z2.c;

public final class i<R>
  implements e<R>
{
  public final j1 a;
  public final c<R> b;
  
  public i(m1 paramm1)
  {
    a = paramm1;
    b = localc;
    paramm1.invokeOnCompletion(new h(this));
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    return b.cancel(paramBoolean);
  }
  
  public final void f(Runnable paramRunnable, Executor paramExecutor)
  {
    b.f(paramRunnable, paramExecutor);
  }
  
  public final R get()
  {
    return (R)b.get();
  }
  
  public final R get(long paramLong, TimeUnit paramTimeUnit)
  {
    return (R)b.get(paramLong, paramTimeUnit);
  }
  
  public final boolean isCancelled()
  {
    return b.a instanceof a.b;
  }
  
  public final boolean isDone()
  {
    return b.isDone();
  }
}

/* Location:
 * Qualified Name:     o2.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */