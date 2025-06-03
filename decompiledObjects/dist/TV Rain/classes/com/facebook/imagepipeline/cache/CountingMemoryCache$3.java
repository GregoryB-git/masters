package com.facebook.imagepipeline.cache;

import com.facebook.common.references.ResourceReleaser;

class CountingMemoryCache$3
  implements ResourceReleaser<V>
{
  public CountingMemoryCache$3(CountingMemoryCache paramCountingMemoryCache, CountingMemoryCache.Entry paramEntry) {}
  
  public void release(V paramV)
  {
    CountingMemoryCache.access$000(this$0, val$entry);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.CountingMemoryCache.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */