package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.Provider;

public final class DoubleCheck<T>
  implements Provider<T>, Lazy<T>
{
  private static final Object UNINITIALIZED = new Object();
  private volatile Object instance = UNINITIALIZED;
  private volatile Provider<T> provider;
  
  private DoubleCheck(Provider<T> paramProvider)
  {
    provider = paramProvider;
  }
  
  public static <P extends Provider<T>, T> Lazy<T> lazy(P paramP)
  {
    if ((paramP instanceof Lazy)) {
      return (Lazy)paramP;
    }
    return new DoubleCheck((Provider)Preconditions.checkNotNull(paramP));
  }
  
  public static <P extends Provider<T>, T> Provider<T> provider(P paramP)
  {
    Preconditions.checkNotNull(paramP);
    if ((paramP instanceof DoubleCheck)) {
      return paramP;
    }
    return new DoubleCheck(paramP);
  }
  
  public static Object reentrantCheck(Object paramObject1, Object paramObject2)
  {
    int i;
    if ((paramObject1 != UNINITIALIZED) && (!(paramObject1 instanceof MemoizedSentinel))) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) && (paramObject1 != paramObject2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Scoped provider was invoked recursively returning different results: ");
      localStringBuilder.append(paramObject1);
      localStringBuilder.append(" & ");
      localStringBuilder.append(paramObject2);
      localStringBuilder.append(". This is likely due to a circular dependency.");
      throw new IllegalStateException(localStringBuilder.toString());
    }
    return paramObject2;
  }
  
  public T get()
  {
    Object localObject1 = instance;
    Object localObject2 = UNINITIALIZED;
    Object localObject3 = localObject1;
    if (localObject1 == localObject2) {
      try
      {
        localObject1 = instance;
        localObject3 = localObject1;
        if (localObject1 == localObject2)
        {
          localObject3 = provider.get();
          instance = reentrantCheck(instance, localObject3);
          provider = null;
        }
      }
      finally {}
    }
    return ?;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.DoubleCheck
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */