package com.google.android.datatransport.runtime.dagger.internal;

import javax.inject.Provider;

public final class DelegateFactory<T>
  implements Factory<T>
{
  private Provider<T> delegate;
  
  public static <T> void setDelegate(Provider<T> paramProvider1, Provider<T> paramProvider2)
  {
    Preconditions.checkNotNull(paramProvider2);
    paramProvider1 = (DelegateFactory)paramProvider1;
    if (delegate == null)
    {
      delegate = paramProvider2;
      return;
    }
    throw new IllegalStateException();
  }
  
  public T get()
  {
    Provider localProvider = delegate;
    if (localProvider != null) {
      return (T)localProvider.get();
    }
    throw new IllegalStateException();
  }
  
  public Provider<T> getDelegate()
  {
    return (Provider)Preconditions.checkNotNull(delegate);
  }
  
  @Deprecated
  public void setDelegatedProvider(Provider<T> paramProvider)
  {
    setDelegate(this, paramProvider);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.DelegateFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */