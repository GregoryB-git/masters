package s7;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public abstract class a$i<V>
  extends a<V>
  implements a.h<V>
{
  public final boolean cancel(boolean paramBoolean)
  {
    return super.cancel(paramBoolean);
  }
  
  public final void f(Runnable paramRunnable, Executor paramExecutor)
  {
    super.f(paramRunnable, paramExecutor);
  }
  
  public final V get()
  {
    return (V)super.get();
  }
  
  public final V get(long paramLong, TimeUnit paramTimeUnit)
  {
    return (V)super.get(paramLong, paramTimeUnit);
  }
  
  public final boolean isCancelled()
  {
    return a instanceof a.b;
  }
  
  public final boolean isDone()
  {
    return super.isDone();
  }
}

/* Location:
 * Qualified Name:     s7.a.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */