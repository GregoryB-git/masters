package nc;

import b.a0;
import eb.y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p2.m0;
import sc.s;
import ub.e;
import ub.h;

public final class o0<T>
  extends s<T>
{
  public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_decision");
  private volatile int _decision;
  
  public o0(e parame, h paramh)
  {
    super(parame, paramh);
  }
  
  public final void Z(Object paramObject)
  {
    AtomicIntegerFieldUpdater localAtomicIntegerFieldUpdater = e;
    do
    {
      int i = localAtomicIntegerFieldUpdater.get(this);
      j = 0;
      if (i != 0)
      {
        if (i == 1) {
          break;
        }
        throw new IllegalStateException("Already resumed".toString());
      }
    } while (!e.compareAndSet(this, 0, 2));
    int j = 1;
    if (j != 0) {
      return;
    }
    a0.C(m0.P(d), y.c(paramObject), null);
  }
  
  public final void p(Object paramObject)
  {
    Z(paramObject);
  }
}

/* Location:
 * Qualified Name:     nc.o0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */