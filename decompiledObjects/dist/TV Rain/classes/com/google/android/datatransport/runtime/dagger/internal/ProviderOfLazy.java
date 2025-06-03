package com.google.android.datatransport.runtime.dagger.internal;

import com.google.android.datatransport.runtime.dagger.Lazy;
import javax.inject.Provider;

public final class ProviderOfLazy<T>
  implements Provider<Lazy<T>>
{
  private final Provider<T> provider;
  
  private ProviderOfLazy(Provider<T> paramProvider)
  {
    provider = paramProvider;
  }
  
  public static <T> Provider<Lazy<T>> create(Provider<T> paramProvider)
  {
    return new ProviderOfLazy((Provider)Preconditions.checkNotNull(paramProvider));
  }
  
  public Lazy<T> get()
  {
    return DoubleCheck.lazy(provider);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.ProviderOfLazy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */