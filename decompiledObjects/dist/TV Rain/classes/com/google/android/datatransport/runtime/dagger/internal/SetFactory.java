package com.google.android.datatransport.runtime.dagger.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Provider;

public final class SetFactory<T>
  implements Factory<Set<T>>
{
  private static final Factory<Set<Object>> EMPTY_FACTORY = InstanceFactory.create(Collections.emptySet());
  private final List<Provider<Collection<T>>> collectionProviders;
  private final List<Provider<T>> individualProviders;
  
  private SetFactory(List<Provider<T>> paramList, List<Provider<Collection<T>>> paramList1)
  {
    individualProviders = paramList;
    collectionProviders = paramList1;
  }
  
  public static <T> Builder<T> builder(int paramInt1, int paramInt2)
  {
    return new Builder(paramInt1, paramInt2, null);
  }
  
  public static <T> Factory<Set<T>> empty()
  {
    return EMPTY_FACTORY;
  }
  
  public Set<T> get()
  {
    int i = individualProviders.size();
    ArrayList localArrayList = new ArrayList(collectionProviders.size());
    int j = collectionProviders.size();
    int k = 0;
    for (int m = 0; m < j; m++)
    {
      localObject = (Collection)((Provider)collectionProviders.get(m)).get();
      i += ((Collection)localObject).size();
      localArrayList.add(localObject);
    }
    Object localObject = DaggerCollections.newHashSetWithExpectedSize(i);
    i = individualProviders.size();
    for (m = 0; m < i; m++) {
      ((Set)localObject).add(Preconditions.checkNotNull(((Provider)individualProviders.get(m)).get()));
    }
    i = localArrayList.size();
    for (m = k; m < i; m++)
    {
      Iterator localIterator = ((Collection)localArrayList.get(m)).iterator();
      while (localIterator.hasNext()) {
        ((Set)localObject).add(Preconditions.checkNotNull(localIterator.next()));
      }
    }
    return Collections.unmodifiableSet((Set)localObject);
  }
  
  public static final class Builder<T>
  {
    private final List<Provider<Collection<T>>> collectionProviders;
    private final List<Provider<T>> individualProviders;
    
    private Builder(int paramInt1, int paramInt2)
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
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.SetFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */