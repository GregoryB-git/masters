package com.google.android.datatransport.runtime.dagger.internal;

import java.util.Collections;
import java.util.Map;

public final class MapBuilder<K, V>
{
  private final Map<K, V> contributions;
  
  private MapBuilder(int paramInt)
  {
    contributions = DaggerCollections.newLinkedHashMapWithExpectedSize(paramInt);
  }
  
  public static <K, V> MapBuilder<K, V> newMapBuilder(int paramInt)
  {
    return new MapBuilder(paramInt);
  }
  
  public Map<K, V> build()
  {
    if (contributions.size() != 0) {
      return Collections.unmodifiableMap(contributions);
    }
    return Collections.emptyMap();
  }
  
  public MapBuilder<K, V> put(K paramK, V paramV)
  {
    contributions.put(paramK, paramV);
    return this;
  }
  
  public MapBuilder<K, V> putAll(Map<K, V> paramMap)
  {
    contributions.putAll(paramMap);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.dagger.internal.MapBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */