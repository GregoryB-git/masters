package nc;

import dc.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rb.h;

public final class h1
  extends l1
{
  public static final AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_invoked");
  private volatile int _invoked;
  public final l<Throwable, h> e;
  
  public h1(l<? super Throwable, h> paraml)
  {
    e = paraml;
  }
  
  public final void l(Throwable paramThrowable)
  {
    if (f.compareAndSet(this, 0, 1)) {
      e.invoke(paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     nc.h1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */