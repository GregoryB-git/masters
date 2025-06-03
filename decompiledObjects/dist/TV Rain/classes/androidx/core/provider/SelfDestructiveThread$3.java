package androidx.core.provider;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class SelfDestructiveThread$3
  implements Runnable
{
  public SelfDestructiveThread$3(SelfDestructiveThread paramSelfDestructiveThread, AtomicReference paramAtomicReference, Callable paramCallable, ReentrantLock paramReentrantLock, AtomicBoolean paramAtomicBoolean, Condition paramCondition) {}
  
  public void run()
  {
    try
    {
      val$holder.set(val$callable.call());
      val$lock.lock();
      try
      {
        val$running.set(false);
        val$cond.signal();
        return;
      }
      finally
      {
        val$lock.unlock();
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.provider.SelfDestructiveThread.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */