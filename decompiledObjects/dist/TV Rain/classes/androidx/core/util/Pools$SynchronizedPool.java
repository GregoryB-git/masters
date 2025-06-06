package androidx.core.util;

import androidx.annotation.NonNull;

public class Pools$SynchronizedPool<T>
  extends Pools.SimplePool<T>
{
  private final Object mLock = new Object();
  
  public Pools$SynchronizedPool(int paramInt)
  {
    super(paramInt);
  }
  
  public T acquire()
  {
    synchronized (mLock)
    {
      Object localObject2 = super.acquire();
      return (T)localObject2;
    }
  }
  
  public boolean release(@NonNull T paramT)
  {
    synchronized (mLock)
    {
      boolean bool = super.release(paramT);
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.Pools.SynchronizedPool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */