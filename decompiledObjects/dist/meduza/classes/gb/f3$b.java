package gb;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class f3$b
  extends f3.a
{
  public final AtomicIntegerFieldUpdater<f3> a;
  
  public f3$b(AtomicIntegerFieldUpdater paramAtomicIntegerFieldUpdater)
  {
    a = paramAtomicIntegerFieldUpdater;
  }
  
  public final boolean a(f3 paramf3)
  {
    return a.compareAndSet(paramf3, 0, -1);
  }
  
  public final void b(f3 paramf3)
  {
    a.set(paramf3, 0);
  }
}

/* Location:
 * Qualified Name:     gb.f3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */