package nc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import ub.e;

public final class m
  extends u
{
  public static final AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(m.class, "_resumed");
  private volatile int _resumed = 0;
  
  public m(e<?> parame, Throwable paramThrowable, boolean paramBoolean)
  {
    super((Throwable)localObject, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     nc.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */