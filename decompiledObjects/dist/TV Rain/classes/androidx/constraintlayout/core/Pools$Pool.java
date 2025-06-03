package androidx.constraintlayout.core;

abstract interface Pools$Pool<T>
{
  public abstract T acquire();
  
  public abstract boolean release(T paramT);
  
  public abstract void releaseAll(T[] paramArrayOfT, int paramInt);
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.Pools.Pool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */