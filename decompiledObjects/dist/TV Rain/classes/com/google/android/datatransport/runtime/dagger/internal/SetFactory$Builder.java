package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collection;
import java.util.List;
import javax.inject.Provider;

public final class SetFactory$Builder<T>
{
  private final List<Provider<Collection<T>>> collectionProviders;
  private final List<Provider<T>> individualProviders;
  
  private SetFactory$Builder(int paramInt1, int paramInt2)
  {
    individualProviders = DaggerCollections.presizedList(paramInt1);
    collectionProviders = DaggerCollections.presizedList(paramInt2);
  }
  
  public Builder<T> addCollectionProvider(Provider<? extends Collection<? extends T>> paramProvider)
  {
    collectionProviders.add(paramProvider);
    return this;
  }
  
  public Builder<T> addProvider(Provider<? extends T> paramProvider)
  {
    individualProviders.add(paramProvider);
    return this;
  }
  
  public SetFactory<T> build()
  {
    return new SetFactory(individualProviders, collectionProviders, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.SetFactory.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */