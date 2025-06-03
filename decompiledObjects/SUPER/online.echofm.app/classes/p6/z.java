package p6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class z
{
  public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_handled");
  private volatile int _handled;
  public final Throwable a;
  
  public z(Throwable paramThrowable, boolean paramBoolean)
  {
    a = paramThrowable;
    _handled = paramBoolean;
  }
  
  public final boolean a()
  {
    boolean bool;
    if (b.get(this) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean b()
  {
    return b.compareAndSet(this, 0, 1);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(M.a(this));
    localStringBuilder.append('[');
    localStringBuilder.append(a);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     p6.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */