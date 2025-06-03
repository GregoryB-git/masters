package sc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import nc.v1;
import ub.h;

public abstract class t<S extends t<S>>
  extends c<S>
  implements v1
{
  public static final AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers");
  public final long c;
  private volatile int cleanedAndPointers;
  
  public t(long paramLong, S paramS, int paramInt)
  {
    super(paramS);
    c = paramLong;
    cleanedAndPointers = (paramInt << 16);
  }
  
  public final boolean c()
  {
    int i = d.get(this);
    int j = f();
    boolean bool = true;
    if (i == j)
    {
      if (b() == null) {
        j = 1;
      } else {
        j = 0;
      }
      if (j == 0) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public final boolean e()
  {
    int i = d.addAndGet(this, -65536);
    int j = f();
    boolean bool = true;
    if (i == j)
    {
      if (b() == null) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public abstract int f();
  
  public abstract void g(int paramInt, h paramh);
  
  public final void h()
  {
    if (d.incrementAndGet(this) == f()) {
      d();
    }
  }
  
  public final boolean i()
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = d;
    int i;
    boolean bool;
    label51:
    do
    {
      i = localAtomicIntegerFieldUpdater.get(this);
      int j = f();
      bool = true;
      if (i == j)
      {
        if (b() == null) {
          j = 1;
        } else {
          j = 0;
        }
        if (j == 0)
        {
          j = 0;
          break label51;
        }
      }
      j = 1;
      if (j == 0)
      {
        bool = false;
        break;
      }
    } while (!localAtomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
    return bool;
  }
}

/* Location:
 * Qualified Name:     sc.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */