package nc;

import ec.i;
import java.util.concurrent.locks.LockSupport;
import ub.h;

public final class f<T>
  extends a<T>
{
  public final Thread d;
  public final x0 e;
  
  public f(h paramh, Thread paramThread, x0 paramx0)
  {
    super(paramh, true);
    d = paramThread;
    e = paramx0;
  }
  
  public final void p(Object paramObject)
  {
    if (!i.a(Thread.currentThread(), d)) {
      LockSupport.unpark(d);
    }
  }
}

/* Location:
 * Qualified Name:     nc.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */