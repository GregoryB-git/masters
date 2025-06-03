package p6;

import g6.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class o0
  extends s0
{
  public static final AtomicIntegerFieldUpdater t = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_invoked");
  private volatile int _invoked;
  public final l s;
  
  public o0(l paraml)
  {
    s = paraml;
  }
  
  public void v(Throwable paramThrowable)
  {
    if (t.compareAndSet(this, 0, 1)) {
      s.invoke(paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     p6.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */