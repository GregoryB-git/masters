package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract interface Pools$Pool<T>
{
  @Nullable
  public abstract T acquire();
  
  public abstract boolean release(@NonNull T paramT);
}

/* Location:
 * Qualified Name:     androidx.core.util.Pools.Pool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */