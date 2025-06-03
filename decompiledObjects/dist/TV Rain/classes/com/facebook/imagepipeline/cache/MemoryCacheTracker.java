package com.facebook.imagepipeline.cache;

public abstract interface MemoryCacheTracker<K>
{
  public abstract void onCacheHit(K paramK);
  
  public abstract void onCacheMiss();
  
  public abstract void onCachePut();
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.MemoryCacheTracker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */