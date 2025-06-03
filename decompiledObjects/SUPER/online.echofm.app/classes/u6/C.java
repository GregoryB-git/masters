package u6;

import X5.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p6.E0;

public abstract class C
  extends e
  implements E0
{
  public static final AtomicIntegerFieldUpdater r = AtomicIntegerFieldUpdater.newUpdater(C.class, "cleanedAndPointers");
  private volatile int cleanedAndPointers;
  public final long q;
  
  public C(long paramLong, C paramC, int paramInt)
  {
    super(paramC);
    q = paramLong;
    cleanedAndPointers = (paramInt << 16);
  }
  
  public boolean h()
  {
    boolean bool;
    if ((r.get(this) == n()) && (!i())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean m()
  {
    boolean bool;
    if ((r.addAndGet(this, -65536) == n()) && (!i())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public abstract int n();
  
  public abstract void o(int paramInt, Throwable paramThrowable, g paramg);
  
  public final void p()
  {
    if (r.incrementAndGet(this) == n()) {
      k();
    }
  }
  
  public final boolean q()
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = r;
    int i;
    do
    {
      i = localAtomicIntegerFieldUpdater.get(this);
      if ((i == n()) && (!i()))
      {
        bool = false;
        break;
      }
    } while (!localAtomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
    boolean bool = true;
    return bool;
  }
}

/* Location:
 * Qualified Name:     u6.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */