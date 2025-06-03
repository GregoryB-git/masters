package androidx.constraintlayout.core;

final class Pools
{
  private static final boolean DEBUG = false;
  
  public static abstract interface Pool<T>
  {
    public abstract T acquire();
    
    public abstract boolean release(T paramT);
    
    public abstract void releaseAll(T[] paramArrayOfT, int paramInt);
  }
  
  public static class SimplePool<T>
    implements Pools.Pool<T>
  {
    private final Object[] mPool;
    private int mPoolSize;
    
    public SimplePool(int paramInt)
    {
      if (paramInt > 0)
      {
        mPool = new Object[paramInt];
        return;
      }
      throw new IllegalArgumentException("The max pool size must be > 0");
    }
    
    private boolean isInPool(T paramT)
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
    
    public boolean release(T paramT)
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
    
    public void releaseAll(T[] paramArrayOfT, int paramInt)
    {
      int i = paramInt;
      if (paramInt > paramArrayOfT.length) {
        i = paramArrayOfT.length;
      }
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        T ? = paramArrayOfT[paramInt];
        int j = mPoolSize;
        Object[] arrayOfObject = mPool;
        if (j < arrayOfObject.length)
        {
          arrayOfObject[j] = ?;
          mPoolSize = (j + 1);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.Pools
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */