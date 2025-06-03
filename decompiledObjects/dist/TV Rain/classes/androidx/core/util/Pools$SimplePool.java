package androidx.core.util;

import androidx.annotation.NonNull;

public class Pools$SimplePool<T>
  implements Pools.Pool<T>
{
  private final Object[] mPool;
  private int mPoolSize;
  
  public Pools$SimplePool(int paramInt)
  {
    if (paramInt > 0)
    {
      mPool = new Object[paramInt];
      return;
    }
    throw new IllegalArgumentException("The max pool size must be > 0");
  }
  
  private boolean isInPool(@NonNull T paramT)
  {
    for (int i = 0; i < mPoolSize; i++) {
      if (mPool[i] == paramT) {
        return true;
      }
    }
    return false;
  }
  
  public T acquire()
  {
    int i = mPoolSize;
    if (i > 0)
    {
      int j = i - 1;
      Object[] arrayOfObject = mPool;
      Object localObject = arrayOfObject[j];
      arrayOfObject[j] = null;
      mPoolSize = (i - 1);
      return (T)localObject;
    }
    return null;
  }
  
  public boolean release(@NonNull T paramT)
  {
    if (!isInPool(paramT))
    {
      int i = mPoolSize;
      Object[] arrayOfObject = mPool;
      if (i < arrayOfObject.length)
      {
        arrayOfObject[i] = paramT;
        mPoolSize = (i + 1);
        return true;
      }
      return false;
    }
    throw new IllegalStateException("Already in the pool!");
  }
}

/* Location:
 * Qualified Name:     androidx.core.util.Pools.SimplePool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */