package p6;

import java.util.concurrent.locks.LockSupport;

public abstract class c0
  extends a0
{
  public abstract Thread T();
  
  public final void U()
  {
    Thread localThread = T();
    if (Thread.currentThread() != localThread)
    {
      c.a();
      LockSupport.unpark(localThread);
    }
  }
}

/* Location:
 * Qualified Name:     p6.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */