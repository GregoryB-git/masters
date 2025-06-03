package com.google.android.datatransport.runtime.dagger.internal;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;

abstract class AbstractMapFactory<K, V, V2>
  implements Factory<Map<K, V2>>
{
  private final Map<K, Provider<V>> contributingMap;
  
  public AbstractMapFactory(Map<K, Provider<V>> paramMap)
  {
    contributingMap = Collections.unmodifiableMap(paramMap);
  }
  
  final Map<K, Provider<V>> contributingMap()
  {
    return contributingMap;
  }
  
  public static abstract class Builder<K, V, V2>
  {
    public final LinkedHashMap<K, Provider<V>> map;
    
    public Builder(int paramInt)
    {
      map = DaggerCollections.newLinkedHashMapWithExpectedSize(paramInt);
    }
    
    public Builder<K, V, V2> put(K paramK, Provider<V> paramProvider)
    {
      map.put(Preconditions.checkNotNull(paramK, "key"), Preconditions.checkNotNull(paramProvider, "provider"));
      return this;
    }
    
    public Builder<K, V, V2> putAll(Provider<Map<K, V2>> paramProvider)
    {
      if ((paramProvider instanceof DelegateFactory)) {
        return putAll(((DelegateFactory)paramProvider).getDelegate());
      }
      paramProvider = (AbstractMapFactory)paramProvider;
      map.putAll(AbstractMapFactory.access$000(paramProvider));
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.AbstractMapFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */