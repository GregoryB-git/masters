package p6;

import X5.d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class p
  extends z
{
  public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(p.class, "_resumed");
  private volatile int _resumed = 0;
  
  public p(d paramd, Throwable paramThrowable, boolean paramBoolean)
  {
    super((Throwable)localObject, paramBoolean);
  }
  
  public final boolean c()
  {
    return c.compareAndSet(this, 0, 1);
  }
}

/* Location:
 * Qualified Name:     p6.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */