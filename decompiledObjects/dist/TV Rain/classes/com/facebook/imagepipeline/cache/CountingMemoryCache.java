package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.android.internal.util.Predicate;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmable;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory.BitmapCreationObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class CountingMemoryCache<K, V>
  implements MemoryCache<K, V>, MemoryTrimmable
{
  @VisibleForTesting
  public static final long PARAMS_INTERCHECK_INTERVAL_MS = TimeUnit.MINUTES.toMillis(5L);
  private final CacheTrimStrategy mCacheTrimStrategy;
  @VisibleForTesting
  @GuardedBy("this")
  public final CountingLruMap<K, Entry<K, V>> mCachedEntries;
  @VisibleForTesting
  @GuardedBy("this")
  public final CountingLruMap<K, Entry<K, V>> mExclusiveEntries;
  @GuardedBy("this")
  private long mLastCacheParamsCheck;
  @GuardedBy("this")
  public MemoryCacheParams mMemoryCacheParams;
  private final Supplier<MemoryCacheParams> mMemoryCacheParamsSupplier;
  @VisibleForTesting
  @GuardedBy("this")
  public final Map<Bitmap, Object> mOtherEntries = new WeakHashMap();
  private final ValueDescriptor<V> mValueDescriptor;
  
  public CountingMemoryCache(ValueDescriptor<V> paramValueDescriptor, CacheTrimStrategy paramCacheTrimStrategy, Supplier<MemoryCacheParams> paramSupplier, PlatformBitmapFactory paramPlatformBitmapFactory, boolean paramBoolean)
  {
    mValueDescriptor = paramValueDescriptor;
    mExclusiveEntries = new CountingLruMap(wrapValueDescriptor(paramValueDescriptor));
    mCachedEntries = new CountingLruMap(wrapValueDescriptor(paramValueDescriptor));
    mCacheTrimStrategy = paramCacheTrimStrategy;
    mMemoryCacheParamsSupplier = paramSupplier;
    mMemoryCacheParams = ((MemoryCacheParams)paramSupplier.get());
    mLastCacheParamsCheck = SystemClock.uptimeMillis();
    if (paramBoolean) {
      paramPlatformBitmapFactory.setCreationListener(new PlatformBitmapFactory.BitmapCreationObserver()
      {
        public void onBitmapCreated(Bitmap paramAnonymousBitmap, Object paramAnonymousObject)
        {
          mOtherEntries.put(paramAnonymousBitmap, paramAnonymousObject);
        }
      });
    }
  }
  
  private boolean canCacheNewValue(V paramV)
  {
    try
    {
      int i = mValueDescriptor.getSizeInBytes(paramV);
      int j = mMemoryCacheParams.maxCacheEntrySize;
      boolean bool = true;
      if ((i <= j) && (getInUseCount() <= mMemoryCacheParams.maxCacheEntries - 1))
      {
        int k = getInUseSizeInBytes();
        j = mMemoryCacheParams.maxCacheSize;
        if (k <= j - i) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    finally {}
  }
  
  private void decreaseClientCount(Entry<K, V> paramEntry)
  {
    try
    {
      Preconditions.checkNotNull(paramEntry);
      boolean bool;
      if (clientCount > 0) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      clientCount -= 1;
      return;
    }
    finally {}
  }
  
  private void increaseClientCount(Entry<K, V> paramEntry)
  {
    try
    {
      Preconditions.checkNotNull(paramEntry);
      boolean bool;
      if (!isOrphan) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      clientCount += 1;
      return;
    }
    finally {}
  }
  
  private void makeOrphan(Entry<K, V> paramEntry)
  {
    try
    {
      Preconditions.checkNotNull(paramEntry);
      boolean bool;
      if (!isOrphan) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      isOrphan = true;
      return;
    }
    finally {}
  }
  
  private void makeOrphans(@Nullable ArrayList<Entry<K, V>> paramArrayList)
  {
    if (paramArrayList != null) {
      try
      {
        paramArrayList = paramArrayList.iterator();
        while (paramArrayList.hasNext()) {
          makeOrphan((Entry)paramArrayList.next());
        }
      }
      finally {}
    }
  }
  
  private boolean maybeAddToExclusives(Entry<K, V> paramEntry)
  {
    try
    {
      if ((!isOrphan) && (clientCount == 0))
      {
        mExclusiveEntries.put(key, paramEntry);
        return true;
      }
      return false;
    }
    finally
    {
      paramEntry = finally;
      throw paramEntry;
    }
  }
  
  private void maybeClose(@Nullable ArrayList<Entry<K, V>> paramArrayList)
  {
    if (paramArrayList != null)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        CloseableReference.closeSafely(referenceToClose((Entry)paramArrayList.next()));
      }
    }
  }
  
  private void maybeEvictEntries()
  {
    try
    {
      Object localObject1 = mMemoryCacheParams;
      int i = Math.min(maxEvictionQueueEntries, maxCacheEntries - getInUseCount());
      localObject1 = mMemoryCacheParams;
      localObject1 = trimExclusivelyOwnedEntries(i, Math.min(maxEvictionQueueSize, maxCacheSize - getInUseSizeInBytes()));
      makeOrphans((ArrayList)localObject1);
      maybeClose((ArrayList)localObject1);
      maybeNotifyExclusiveEntryRemoval((ArrayList)localObject1);
      return;
    }
    finally {}
  }
  
  private static <K, V> void maybeNotifyExclusiveEntryInsertion(@Nullable Entry<K, V> paramEntry)
  {
    if (paramEntry != null)
    {
      EntryStateObserver localEntryStateObserver = observer;
      if (localEntryStateObserver != null) {
        localEntryStateObserver.onExclusivityChanged(key, true);
      }
    }
  }
  
  private static <K, V> void maybeNotifyExclusiveEntryRemoval(@Nullable Entry<K, V> paramEntry)
  {
    if (paramEntry != null)
    {
      EntryStateObserver localEntryStateObserver = observer;
      if (localEntryStateObserver != null) {
        localEntryStateObserver.onExclusivityChanged(key, false);
      }
    }
  }
  
  private void maybeNotifyExclusiveEntryRemoval(@Nullable ArrayList<Entry<K, V>> paramArrayList)
  {
    if (paramArrayList != null)
    {
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext()) {
        maybeNotifyExclusiveEntryRemoval((Entry)paramArrayList.next());
      }
    }
  }
  
  private void maybeUpdateCacheParams()
  {
    try
    {
      long l1 = mLastCacheParamsCheck;
      long l2 = PARAMS_INTERCHECK_INTERVAL_MS;
      long l3 = SystemClock.uptimeMillis();
      if (l1 + l2 > l3) {
        return;
      }
      mLastCacheParamsCheck = SystemClock.uptimeMillis();
      mMemoryCacheParams = ((MemoryCacheParams)mMemoryCacheParamsSupplier.get());
      return;
    }
    finally {}
  }
  
  private CloseableReference<V> newClientReference(Entry<K, V> paramEntry)
  {
    try
    {
      increaseClientCount(paramEntry);
      Object localObject = valueRef.get();
      ResourceReleaser local3 = new com/facebook/imagepipeline/cache/CountingMemoryCache$3;
      local3.<init>(this, paramEntry);
      paramEntry = CloseableReference.of(localObject, local3);
      return paramEntry;
    }
    finally
    {
      paramEntry = finally;
      throw paramEntry;
    }
  }
  
  @Nullable
  private CloseableReference<V> referenceToClose(Entry<K, V> paramEntry)
  {
    try
    {
      Preconditions.checkNotNull(paramEntry);
      if ((isOrphan) && (clientCount == 0)) {
        paramEntry = valueRef;
      } else {
        paramEntry = null;
      }
      return paramEntry;
    }
    finally
    {
      paramEntry = finally;
      throw paramEntry;
    }
  }
  
  private void releaseClientReference(Entry<K, V> paramEntry)
  {
    Preconditions.checkNotNull(paramEntry);
    try
    {
      decreaseClientCount(paramEntry);
      boolean bool = maybeAddToExclusives(paramEntry);
      CloseableReference localCloseableReference = referenceToClose(paramEntry);
      CloseableReference.closeSafely(localCloseableReference);
      if (!bool) {
        paramEntry = null;
      }
      maybeNotifyExclusiveEntryInsertion(paramEntry);
      maybeUpdateCacheParams();
      maybeEvictEntries();
      return;
    }
    finally {}
  }
  
  /* Error */
  @Nullable
  private ArrayList<Entry<K, V>> trimExclusivelyOwnedEntries(int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: iconst_0
    //   4: invokestatic 286	java/lang/Math:max	(II)I
    //   7: istore_1
    //   8: iload_2
    //   9: iconst_0
    //   10: invokestatic 286	java/lang/Math:max	(II)I
    //   13: istore_2
    //   14: aload_0
    //   15: getfield 88	com/facebook/imagepipeline/cache/CountingMemoryCache:mExclusiveEntries	Lcom/facebook/imagepipeline/cache/CountingLruMap;
    //   18: invokevirtual 289	com/facebook/imagepipeline/cache/CountingLruMap:getCount	()I
    //   21: iload_1
    //   22: if_icmpgt +20 -> 42
    //   25: aload_0
    //   26: getfield 88	com/facebook/imagepipeline/cache/CountingMemoryCache:mExclusiveEntries	Lcom/facebook/imagepipeline/cache/CountingLruMap;
    //   29: invokevirtual 291	com/facebook/imagepipeline/cache/CountingLruMap:getSizeInBytes	()I
    //   32: istore_3
    //   33: iload_3
    //   34: iload_2
    //   35: if_icmpgt +7 -> 42
    //   38: aload_0
    //   39: monitorexit
    //   40: aconst_null
    //   41: areturn
    //   42: new 181	java/util/ArrayList
    //   45: astore 4
    //   47: aload 4
    //   49: invokespecial 292	java/util/ArrayList:<init>	()V
    //   52: aload_0
    //   53: getfield 88	com/facebook/imagepipeline/cache/CountingMemoryCache:mExclusiveEntries	Lcom/facebook/imagepipeline/cache/CountingLruMap;
    //   56: invokevirtual 289	com/facebook/imagepipeline/cache/CountingLruMap:getCount	()I
    //   59: iload_1
    //   60: if_icmpgt +24 -> 84
    //   63: aload_0
    //   64: getfield 88	com/facebook/imagepipeline/cache/CountingMemoryCache:mExclusiveEntries	Lcom/facebook/imagepipeline/cache/CountingLruMap;
    //   67: invokevirtual 291	com/facebook/imagepipeline/cache/CountingLruMap:getSizeInBytes	()I
    //   70: istore_3
    //   71: iload_3
    //   72: iload_2
    //   73: if_icmple +6 -> 79
    //   76: goto +8 -> 84
    //   79: aload_0
    //   80: monitorexit
    //   81: aload 4
    //   83: areturn
    //   84: aload_0
    //   85: getfield 88	com/facebook/imagepipeline/cache/CountingMemoryCache:mExclusiveEntries	Lcom/facebook/imagepipeline/cache/CountingLruMap;
    //   88: invokevirtual 295	com/facebook/imagepipeline/cache/CountingLruMap:getFirstKey	()Ljava/lang/Object;
    //   91: astore 5
    //   93: aload_0
    //   94: getfield 88	com/facebook/imagepipeline/cache/CountingMemoryCache:mExclusiveEntries	Lcom/facebook/imagepipeline/cache/CountingLruMap;
    //   97: aload 5
    //   99: invokevirtual 298	com/facebook/imagepipeline/cache/CountingLruMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   102: pop
    //   103: aload 4
    //   105: aload_0
    //   106: getfield 90	com/facebook/imagepipeline/cache/CountingMemoryCache:mCachedEntries	Lcom/facebook/imagepipeline/cache/CountingLruMap;
    //   109: aload 5
    //   111: invokevirtual 298	com/facebook/imagepipeline/cache/CountingLruMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   114: invokevirtual 301	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   117: pop
    //   118: goto -66 -> 52
    //   121: astore 5
    //   123: aload_0
    //   124: monitorexit
    //   125: aload 5
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	CountingMemoryCache
    //   0	128	1	paramInt1	int
    //   0	128	2	paramInt2	int
    //   32	42	3	i	int
    //   45	59	4	localArrayList	ArrayList
    //   91	19	5	localObject1	Object
    //   121	5	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	33	121	finally
    //   42	52	121	finally
    //   52	71	121	finally
    //   84	118	121	finally
  }
  
  private ValueDescriptor<Entry<K, V>> wrapValueDescriptor(final ValueDescriptor<V> paramValueDescriptor)
  {
    new ValueDescriptor()
    {
      public int getSizeInBytes(CountingMemoryCache.Entry<K, V> paramAnonymousEntry)
      {
        return paramValueDescriptor.getSizeInBytes(valueRef.get());
      }
    };
  }
  
  public CloseableReference<V> cache(K paramK, CloseableReference<V> paramCloseableReference)
  {
    return cache(paramK, paramCloseableReference, null);
  }
  
  public CloseableReference<V> cache(K paramK, CloseableReference<V> paramCloseableReference, EntryStateObserver<K> paramEntryStateObserver)
  {
    Preconditions.checkNotNull(paramK);
    Preconditions.checkNotNull(paramCloseableReference);
    maybeUpdateCacheParams();
    try
    {
      Entry localEntry = (Entry)mExclusiveEntries.remove(paramK);
      Object localObject = (Entry)mCachedEntries.remove(paramK);
      CloseableReference localCloseableReference = null;
      if (localObject != null)
      {
        makeOrphan((Entry)localObject);
        localObject = referenceToClose((Entry)localObject);
      }
      else
      {
        localObject = null;
      }
      if (canCacheNewValue(paramCloseableReference.get()))
      {
        paramCloseableReference = Entry.of(paramK, paramCloseableReference, paramEntryStateObserver);
        mCachedEntries.put(paramK, paramCloseableReference);
        localCloseableReference = newClientReference(paramCloseableReference);
      }
      CloseableReference.closeSafely((CloseableReference)localObject);
      maybeNotifyExclusiveEntryRemoval(localEntry);
      maybeEvictEntries();
      return localCloseableReference;
    }
    finally {}
  }
  
  public void clear()
  {
    try
    {
      ArrayList localArrayList1 = mExclusiveEntries.clear();
      ArrayList localArrayList2 = mCachedEntries.clear();
      makeOrphans(localArrayList2);
      maybeClose(localArrayList2);
      maybeNotifyExclusiveEntryRemoval(localArrayList1);
      maybeUpdateCacheParams();
      return;
    }
    finally {}
  }
  
  public boolean contains(Predicate<K> paramPredicate)
  {
    try
    {
      boolean bool = mCachedEntries.getMatchingEntries(paramPredicate).isEmpty();
      return bool ^ true;
    }
    finally
    {
      paramPredicate = finally;
      throw paramPredicate;
    }
  }
  
  public boolean contains(K paramK)
  {
    try
    {
      boolean bool = mCachedEntries.contains(paramK);
      return bool;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
  
  @Nullable
  public CloseableReference<V> get(K paramK)
  {
    Preconditions.checkNotNull(paramK);
    try
    {
      Entry localEntry = (Entry)mExclusiveEntries.remove(paramK);
      paramK = (Entry)mCachedEntries.get(paramK);
      if (paramK != null) {
        paramK = newClientReference(paramK);
      } else {
        paramK = null;
      }
      maybeNotifyExclusiveEntryRemoval(localEntry);
      maybeUpdateCacheParams();
      maybeEvictEntries();
      return paramK;
    }
    finally {}
  }
  
  public int getCount()
  {
    try
    {
      int i = mCachedEntries.getCount();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getEvictionQueueCount()
  {
    try
    {
      int i = mExclusiveEntries.getCount();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getEvictionQueueSizeInBytes()
  {
    try
    {
      int i = mExclusiveEntries.getSizeInBytes();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getInUseCount()
  {
    try
    {
      int i = mCachedEntries.getCount();
      int j = mExclusiveEntries.getCount();
      return i - j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getInUseSizeInBytes()
  {
    try
    {
      int i = mCachedEntries.getSizeInBytes();
      int j = mExclusiveEntries.getSizeInBytes();
      return i - j;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getSizeInBytes()
  {
    try
    {
      int i = mCachedEntries.getSizeInBytes();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int removeAll(Predicate<K> paramPredicate)
  {
    try
    {
      ArrayList localArrayList = mExclusiveEntries.removeAll(paramPredicate);
      paramPredicate = mCachedEntries.removeAll(paramPredicate);
      makeOrphans(paramPredicate);
      maybeClose(paramPredicate);
      maybeNotifyExclusiveEntryRemoval(localArrayList);
      maybeUpdateCacheParams();
      maybeEvictEntries();
      return paramPredicate.size();
    }
    finally {}
  }
  
  @Nullable
  public CloseableReference<V> reuse(K paramK)
  {
    Preconditions.checkNotNull(paramK);
    try
    {
      Entry localEntry = (Entry)mExclusiveEntries.remove(paramK);
      int i = 1;
      boolean bool = false;
      if (localEntry != null)
      {
        paramK = (Entry)mCachedEntries.remove(paramK);
        Preconditions.checkNotNull(paramK);
        if (clientCount == 0) {
          bool = true;
        }
        Preconditions.checkState(bool);
        paramK = valueRef;
      }
      else
      {
        paramK = null;
        i = 0;
      }
      if (i != 0) {
        maybeNotifyExclusiveEntryRemoval(localEntry);
      }
      return paramK;
    }
    finally {}
  }
  
  public void trim(MemoryTrimType paramMemoryTrimType)
  {
    double d = mCacheTrimStrategy.getTrimRatio(paramMemoryTrimType);
    try
    {
      paramMemoryTrimType = trimExclusivelyOwnedEntries(Integer.MAX_VALUE, Math.max(0, (int)((1.0D - d) * mCachedEntries.getSizeInBytes()) - getInUseSizeInBytes()));
      makeOrphans(paramMemoryTrimType);
      maybeClose(paramMemoryTrimType);
      maybeNotifyExclusiveEntryRemoval(paramMemoryTrimType);
      maybeUpdateCacheParams();
      maybeEvictEntries();
      return;
    }
    finally {}
  }
  
  public static abstract interface CacheTrimStrategy
  {
    public abstract double getTrimRatio(MemoryTrimType paramMemoryTrimType);
  }
  
  @VisibleForTesting
  public static class Entry<K, V>
  {
    public int clientCount;
    public boolean isOrphan;
    public final K key;
    @Nullable
    public final CountingMemoryCache.EntryStateObserver<K> observer;
    public final CloseableReference<V> valueRef;
    
    private Entry(K paramK, CloseableReference<V> paramCloseableReference, @Nullable CountingMemoryCache.EntryStateObserver<K> paramEntryStateObserver)
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
  
  public static abstract interface EntryStateObserver<K>
  {
    public abstract void onExclusivityChanged(K paramK, boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.CountingMemoryCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */