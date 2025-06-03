package p6;

import X5.d;
import X5.g;
import Y5.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import u6.B;
import u6.k;

public final class T
  extends B
{
  public static final AtomicIntegerFieldUpdater s = AtomicIntegerFieldUpdater.newUpdater(T.class, "_decision");
  private volatile int _decision;
  
  public T(g paramg, d paramd)
  {
    super(paramg, paramd);
  }
  
  private final boolean L0()
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = s;
    do
    {
      int i = localAtomicIntegerFieldUpdater.get(this);
      if (i != 0)
      {
        if (i == 1) {
          return false;
        }
        throw new IllegalStateException("Already resumed".toString());
      }
    } while (!s.compareAndSet(this, 0, 2));
    return true;
  }
  
  private final boolean M0()
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = s;
    do
    {
      int i = localAtomicIntegerFieldUpdater.get(this);
      if (i != 0)
      {
        if (i == 2) {
          return false;
        }
        throw new IllegalStateException("Already suspended".toString());
      }
    } while (!s.compareAndSet(this, 0, 1));
    return true;
  }
  
  public void F(Object paramObject)
  {
    G0(paramObject);
  }
  
  public void G0(Object paramObject)
  {
    if (L0()) {
      return;
    }
    k.c(b.b(r), D.a(paramObject, r), null, 2, null);
  }
  
  public final Object K0()
  {
    if (M0()) {
      return b.c();
    }
    Object localObject = y0.h(b0());
    if (!(localObject instanceof z)) {
      return localObject;
    }
    throw a;
  }
}

/* Location:
 * Qualified Name:     p6.T
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */