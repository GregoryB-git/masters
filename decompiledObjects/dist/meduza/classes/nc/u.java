package nc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class u
{
  public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(u.class, "_handled");
  private volatile int _handled;
  public final Throwable a;
  
  public u(Throwable paramThrowable, boolean paramBoolean)
  {
    a = paramThrowable;
    _handled = paramBoolean;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append('[');
    localStringBuilder.append(a);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     nc.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */