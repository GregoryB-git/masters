package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Map;
import javax.inject.Provider;

public final class MapProviderFactory$Builder<K, V>
  extends AbstractMapFactory.Builder<K, V, Provider<V>>
{
  private MapProviderFactory$Builder(int paramInt)
  {
    super(paramInt);
  }
  
  public MapProviderFactory<K, V> build()
  {
    return new MapProviderFactory(map, null);
  }
  
  public Builder<K, V> put(K paramK, Provider<V> paramProvider)
  {
    super.put(paramK, paramProvider);
    return this;
  }
  
  public Builder<K, V> putAll(Provider<Map<K, Provider<V>>> paramProvider)
  {
    super.putAll(paramProvider);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.MapProviderFactory.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */