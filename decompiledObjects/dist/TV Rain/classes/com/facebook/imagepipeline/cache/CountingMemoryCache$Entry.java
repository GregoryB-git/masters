package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import javax.annotation.Nullable;

@VisibleForTesting
class CountingMemoryCache$Entry<K, V>
{
  public int clientCount;
  public boolean isOrphan;
  public final K key;
  @Nullable
  public final CountingMemoryCache.EntryStateObserver<K> observer;
  public final CloseableReference<V> valueRef;
  
  private CountingMemoryCache$Entry(K paramK, CloseableReference<V> paramCloseableReference, @Nullable CountingMemoryCache.EntryStateObserver<K> paramEntryStateObserver)
  {
    key = Preconditions.checkNotNull(paramK);
    valueRef = ((CloseableReference)Preconditions.checkNotNull(CloseableReference.cloneOrNull(paramCloseableReference)));
    clientCount = 0;
    isOrphan = false;
    observer = paramEntryStateObserver;
  }
  
  @VisibleForTesting
  public static <K, V> Entry<K, V> of(K paramK, CloseableReference<V> paramCloseableReference, @Nullable CountingMemoryCache.EntryStateObserver<K> paramEntryStateObserver)
  {
    return new Entry(paramK, paramCloseableReference, paramEntryStateObserver);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.CountingMemoryCache.Entry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */