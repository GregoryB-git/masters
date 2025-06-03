package com.facebook.imagepipeline.cache;

import com.facebook.common.references.CloseableReference;

class CountingMemoryCache$2
  implements ValueDescriptor<CountingMemoryCache.Entry<K, V>>
{
  public CountingMemoryCache$2(CountingMemoryCache paramCountingMemoryCache, ValueDescriptor paramValueDescriptor) {}
  
  public int getSizeInBytes(CountingMemoryCache.Entry<K, V> paramEntry)
  {
    return val$evictableValueDescriptor.getSizeInBytes(valueRef.get());
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.CountingMemoryCache.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */