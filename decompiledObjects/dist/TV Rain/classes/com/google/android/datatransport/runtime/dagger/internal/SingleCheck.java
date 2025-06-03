package com.google.android.datatransport.runtime.dagger.internal;

import javax.inject.Provider;

public final class SingleCheck<T>
  implements Provider<T>
{
  private static final Object UNINITIALIZED = new Object();
  private volatile Object instance = UNINITIALIZED;
  private volatile Provider<T> provider;
  
  private SingleCheck(Provider<T> paramProvider)
  {
    provider = paramProvider;
  }
  
  public static <P extends Provider<T>, T> Provider<T> provider(P paramP)
  {
    if ((!(paramP instanceof SingleCheck)) && (!(paramP instanceof DoubleCheck))) {
      return new SingleCheck((Provider)Preconditions.checkNotNull(paramP));
    }
    return paramP;
  }
  
  public T get()
  {
    Object localObject1 = instance;
    Object localObject2 = localObject1;
    if (localObject1 == UNINITIALIZED)
    {
      localObject2 = provider;
      if (localObject2 == null)
      {
        localObject2 = instance;
      }
      else
      {
        localObject2 = ((Provider)localObject2).get();
        instance = localObject2;
        provider = null;
      }
    }
    return (T)localObject2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.SingleCheck
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */