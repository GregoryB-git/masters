package com.facebook.imagepipeline.cache;

import com.android.internal.util.Predicate;
import com.facebook.common.references.CloseableReference;

public class InstrumentedMemoryCache<K, V>
  implements MemoryCache<K, V>
{
  private final MemoryCache<K, V> mDelegate;
  private final MemoryCacheTracker mTracker;
  
  public InstrumentedMemoryCache(MemoryCache<K, V> paramMemoryCache, MemoryCacheTracker paramMemoryCacheTracker)
  {
    mDelegate = paramMemoryCache;
    mTracker = paramMemoryCacheTracker;
  }
  
  public CloseableReference<V> cache(K paramK, CloseableReference<V> paramCloseableReference)
  {
    mTracker.onCachePut();
    return mDelegate.cache(paramK, paramCloseableReference);
  }
  
  public boolean contains(Predicate<K> paramPredicate)
  {
    return mDelegate.contains(paramPredicate);
  }
  
  public CloseableReference<V> get(K paramK)
  {
    CloseableReference localCloseableReference = mDelegate.get(paramK);
    if (localCloseableReference == null) {
      mTracker.onCacheMiss();
    } else {
      mTracker.onCacheHit(paramK);
    }
    return localCloseableReference;
  }
  
  public int removeAll(Predicate<K> paramPredicate)
  {
    return mDelegate.removeAll(paramPredicate);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.InstrumentedMemoryCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */