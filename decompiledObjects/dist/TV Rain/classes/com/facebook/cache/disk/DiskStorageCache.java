package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.binaryresource.BinaryResource;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheErrorLogger.CacheErrorCategory;
import com.facebook.cache.common.CacheEvent;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.common.CacheEventListener.EvictionReason;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.CacheKeyUtil;
import com.facebook.common.disk.DiskTrimmable;
import com.facebook.common.disk.DiskTrimmableRegistry;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.common.statfs.StatFsHelper;
import com.facebook.common.statfs.StatFsHelper.StorageType;
import com.facebook.common.time.Clock;
import com.facebook.common.time.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;
import z2;

@ThreadSafe
public class DiskStorageCache
  implements FileCache, DiskTrimmable
{
  private static final long FILECACHE_SIZE_UPDATE_PERIOD_MS = TimeUnit.MINUTES.toMillis(30L);
  private static final long FUTURE_TIMESTAMP_THRESHOLD_MS;
  private static final String SHARED_PREFS_FILENAME_PREFIX = "disk_entries_list";
  public static final int START_OF_VERSIONING = 1;
  private static final Class<?> TAG = DiskStorageCache.class;
  private static final double TRIMMING_LOWER_BOUND = 0.02D;
  private static final long UNINITIALIZED = -1L;
  private final CacheErrorLogger mCacheErrorLogger;
  private final CacheEventListener mCacheEventListener;
  private long mCacheSizeLastUpdateTime;
  private long mCacheSizeLimit;
  private final long mCacheSizeLimitMinimum;
  private final CacheStats mCacheStats;
  private final Clock mClock;
  private final CountDownLatch mCountDownLatch;
  private final long mDefaultCacheSizeLimit;
  private final EntryEvictionComparatorSupplier mEntryEvictionComparatorSupplier;
  private final boolean mIndexPopulateAtStartupEnabled;
  private boolean mIndexReady;
  private final Object mLock = new Object();
  private final long mLowDiskSpaceCacheSizeLimit;
  @VisibleForTesting
  @GuardedBy("mLock")
  public final Set<String> mResourceIndex;
  private final StatFsHelper mStatFsHelper;
  private final DiskStorage mStorage;
  
  static
  {
    FUTURE_TIMESTAMP_THRESHOLD_MS = TimeUnit.HOURS.toMillis(2L);
  }
  
  public DiskStorageCache(DiskStorage paramDiskStorage, EntryEvictionComparatorSupplier paramEntryEvictionComparatorSupplier, Params paramParams, CacheEventListener paramCacheEventListener, CacheErrorLogger paramCacheErrorLogger, @Nullable DiskTrimmableRegistry paramDiskTrimmableRegistry, Context paramContext, Executor paramExecutor, boolean paramBoolean)
  {
    mLowDiskSpaceCacheSizeLimit = mLowDiskSpaceCacheSizeLimit;
    long l = mDefaultCacheSizeLimit;
    mDefaultCacheSizeLimit = l;
    mCacheSizeLimit = l;
    mStatFsHelper = StatFsHelper.getInstance();
    mStorage = paramDiskStorage;
    mEntryEvictionComparatorSupplier = paramEntryEvictionComparatorSupplier;
    mCacheSizeLastUpdateTime = -1L;
    mCacheEventListener = paramCacheEventListener;
    mCacheSizeLimitMinimum = mCacheSizeLimitMinimum;
    mCacheErrorLogger = paramCacheErrorLogger;
    mCacheStats = new CacheStats();
    if (paramDiskTrimmableRegistry != null) {
      paramDiskTrimmableRegistry.registerDiskTrimmable(this);
    }
    mClock = SystemClock.get();
    mIndexPopulateAtStartupEnabled = paramBoolean;
    mResourceIndex = new HashSet();
    if (paramBoolean)
    {
      mCountDownLatch = new CountDownLatch(1);
      paramExecutor.execute(new Runnable()
      {
        public void run()
        {
          synchronized (DiskStorageCache.access$000(DiskStorageCache.this))
          {
            DiskStorageCache.access$100(DiskStorageCache.this);
            DiskStorageCache.access$202(DiskStorageCache.this, true);
            DiskStorageCache.access$300(DiskStorageCache.this).countDown();
            return;
          }
        }
      });
    }
    else
    {
      mCountDownLatch = new CountDownLatch(0);
    }
  }
  
  private BinaryResource endInsert(DiskStorage.Inserter paramInserter, CacheKey paramCacheKey, String paramString)
    throws IOException
  {
    synchronized (mLock)
    {
      paramInserter = paramInserter.commit(paramCacheKey);
      mResourceIndex.add(paramString);
      mCacheStats.increment(paramInserter.size(), 1L);
      return paramInserter;
    }
  }
  
  @GuardedBy("mLock")
  private void evictAboveSize(long paramLong, CacheEventListener.EvictionReason paramEvictionReason)
    throws IOException
  {
    try
    {
      localObject1 = getSortedEntries(mStorage.getEntries());
      long l1 = mCacheStats.getSize();
      int i = 0;
      localObject1 = ((Collection)localObject1).iterator();
      long l2 = 0L;
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (DiskStorage.Entry)((Iterator)localObject1).next();
        if (l2 > l1 - paramLong) {
          break;
        }
        long l3 = mStorage.remove((DiskStorage.Entry)localObject2);
        mResourceIndex.remove(((DiskStorage.Entry)localObject2).getId());
        if (l3 > 0L)
        {
          i++;
          l2 += l3;
          localObject2 = SettableCacheEvent.obtain().setResourceId(((DiskStorage.Entry)localObject2).getId()).setEvictionReason(paramEvictionReason).setItemSize(l3).setCacheSize(l1 - l2).setCacheLimit(paramLong);
          mCacheEventListener.onEviction((CacheEvent)localObject2);
          ((SettableCacheEvent)localObject2).recycle();
        }
      }
      mCacheStats.increment(-l2, -i);
      mStorage.purgeUnexpectedResources();
      return;
    }
    catch (IOException localIOException)
    {
      paramEvictionReason = mCacheErrorLogger;
      Object localObject1 = CacheErrorLogger.CacheErrorCategory.EVICTION;
      Class localClass = TAG;
      StringBuilder localStringBuilder = z2.t("evictAboveSize: ");
      localStringBuilder.append(localIOException.getMessage());
      paramEvictionReason.logError((CacheErrorLogger.CacheErrorCategory)localObject1, localClass, localStringBuilder.toString(), localIOException);
      throw localIOException;
    }
  }
  
  private Collection<DiskStorage.Entry> getSortedEntries(Collection<DiskStorage.Entry> paramCollection)
  {
    long l1 = mClock.now();
    long l2 = FUTURE_TIMESTAMP_THRESHOLD_MS;
    ArrayList localArrayList1 = new ArrayList(paramCollection.size());
    ArrayList localArrayList2 = new ArrayList(paramCollection.size());
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext())
    {
      paramCollection = (DiskStorage.Entry)localIterator.next();
      if (paramCollection.getTimestamp() > l1 + l2) {
        localArrayList1.add(paramCollection);
      } else {
        localArrayList2.add(paramCollection);
      }
    }
    Collections.sort(localArrayList2, mEntryEvictionComparatorSupplier.get());
    localArrayList1.addAll(localArrayList2);
    return localArrayList1;
  }
  
  private void maybeEvictFilesInCacheDir()
    throws IOException
  {
    synchronized (mLock)
    {
      boolean bool = maybeUpdateFileCacheSize();
      updateFileCacheSizeLimit();
      long l1 = mCacheStats.getSize();
      if ((l1 > mCacheSizeLimit) && (!bool))
      {
        mCacheStats.reset();
        maybeUpdateFileCacheSize();
      }
      long l2 = mCacheSizeLimit;
      if (l1 > l2) {
        evictAboveSize(l2 * 9L / 10L, CacheEventListener.EvictionReason.CACHE_FULL);
      }
      return;
    }
  }
  
  @GuardedBy("mLock")
  private boolean maybeUpdateFileCacheSize()
  {
    long l1 = mClock.now();
    if (mCacheStats.isInitialized())
    {
      long l2 = mCacheSizeLastUpdateTime;
      if ((l2 != -1L) && (l1 - l2 <= FILECACHE_SIZE_UPDATE_PERIOD_MS)) {
        return false;
      }
    }
    return maybeUpdateFileCacheSizeAndIndex();
  }
  
  @GuardedBy("mLock")
  private boolean maybeUpdateFileCacheSizeAndIndex()
  {
    long l1 = mClock.now();
    long l2 = FUTURE_TIMESTAMP_THRESHOLD_MS + l1;
    Object localObject1;
    if ((mIndexPopulateAtStartupEnabled) && (mResourceIndex.isEmpty())) {
      localObject1 = mResourceIndex;
    } else if (mIndexPopulateAtStartupEnabled) {
      localObject1 = new HashSet();
    } else {
      localObject1 = null;
    }
    try
    {
      localObject2 = mStorage.getEntries().iterator();
      long l3 = 0L;
      long l4 = -1L;
      int i = 0;
      int j = 0;
      int k = 0;
      Object localObject3;
      int i1;
      for (int m = 0; ((Iterator)localObject2).hasNext(); m = i1)
      {
        localObject3 = (DiskStorage.Entry)((Iterator)localObject2).next();
        int n = k + 1;
        l3 += ((DiskStorage.Entry)localObject3).getSize();
        int i2;
        if (((DiskStorage.Entry)localObject3).getTimestamp() > l2)
        {
          i1 = m + 1;
          k = (int)(i + ((DiskStorage.Entry)localObject3).getSize());
          l5 = Math.max(((DiskStorage.Entry)localObject3).getTimestamp() - l1, l4);
          i2 = 1;
        }
        else
        {
          l5 = l4;
          k = i;
          i2 = j;
          i1 = m;
          if (mIndexPopulateAtStartupEnabled)
          {
            ((Set)localObject1).add(((DiskStorage.Entry)localObject3).getId());
            i1 = m;
            i2 = j;
            k = i;
            l5 = l4;
          }
        }
        l4 = l5;
        i = k;
        j = i2;
        k = n;
      }
      if (j != 0)
      {
        localObject4 = mCacheErrorLogger;
        localObject3 = CacheErrorLogger.CacheErrorCategory.READ_INVALID_ENTRY;
        localClass = TAG;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Future timestamp found in ");
        ((StringBuilder)localObject2).append(m);
        ((StringBuilder)localObject2).append(" files , with a total size of ");
        ((StringBuilder)localObject2).append(i);
        ((StringBuilder)localObject2).append(" bytes, and a maximum time delta of ");
        ((StringBuilder)localObject2).append(l4);
        ((StringBuilder)localObject2).append("ms");
        ((CacheErrorLogger)localObject4).logError((CacheErrorLogger.CacheErrorCategory)localObject3, localClass, ((StringBuilder)localObject2).toString(), null);
      }
      long l5 = mCacheStats.getCount();
      l4 = k;
      if ((l5 != l4) || (mCacheStats.getSize() != l3))
      {
        if (mIndexPopulateAtStartupEnabled)
        {
          localObject2 = mResourceIndex;
          if (localObject2 != localObject1)
          {
            ((Set)localObject2).clear();
            mResourceIndex.addAll((Collection)localObject1);
          }
        }
        mCacheStats.set(l3, l4);
      }
      mCacheSizeLastUpdateTime = l1;
      return true;
    }
    catch (IOException localIOException)
    {
      Object localObject2 = mCacheErrorLogger;
      Object localObject4 = CacheErrorLogger.CacheErrorCategory.GENERIC_IO;
      Class localClass = TAG;
      localObject1 = z2.t("calcFileCacheSize: ");
      ((StringBuilder)localObject1).append(localIOException.getMessage());
      ((CacheErrorLogger)localObject2).logError((CacheErrorLogger.CacheErrorCategory)localObject4, localClass, ((StringBuilder)localObject1).toString(), localIOException);
    }
    return false;
  }
  
  private DiskStorage.Inserter startInsert(String paramString, CacheKey paramCacheKey)
    throws IOException
  {
    maybeEvictFilesInCacheDir();
    return mStorage.insert(paramString, paramCacheKey);
  }
  
  private void trimBy(double paramDouble)
  {
    try
    {
      synchronized (mLock)
      {
        mCacheStats.reset();
        maybeUpdateFileCacheSize();
        long l = mCacheStats.getSize();
        evictAboveSize(l - (paramDouble * l), CacheEventListener.EvictionReason.CACHE_MANAGER_TRIMMED);
      }
    }
    catch (IOException localIOException)
    {
      CacheErrorLogger localCacheErrorLogger = mCacheErrorLogger;
      CacheErrorLogger.CacheErrorCategory localCacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
      localClass = TAG;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("trimBy: ");
      localStringBuilder.append(localIOException.getMessage());
      localCacheErrorLogger.logError(localCacheErrorCategory, localClass, localStringBuilder.toString(), localIOException);
      return;
    }
  }
  
  @GuardedBy("mLock")
  private void updateFileCacheSizeLimit()
  {
    StatFsHelper.StorageType localStorageType;
    if (mStorage.isExternal()) {
      localStorageType = StatFsHelper.StorageType.EXTERNAL;
    } else {
      localStorageType = StatFsHelper.StorageType.INTERNAL;
    }
    if (mStatFsHelper.testLowDiskSpace(localStorageType, mDefaultCacheSizeLimit - mCacheStats.getSize())) {
      mCacheSizeLimit = mLowDiskSpaceCacheSizeLimit;
    } else {
      mCacheSizeLimit = mDefaultCacheSizeLimit;
    }
  }
  
  @VisibleForTesting
  public void awaitIndex()
  {
    try
    {
      mCountDownLatch.await();
    }
    catch (InterruptedException localInterruptedException)
    {
      FLog.e(TAG, "Memory Index is not ready yet. ");
    }
  }
  
  public void clearAll()
  {
    try
    {
      synchronized (mLock)
      {
        mStorage.clearAll();
        mResourceIndex.clear();
        mCacheEventListener.onCleared();
      }
    }
    catch (IOException localIOException)
    {
      CacheErrorLogger localCacheErrorLogger = mCacheErrorLogger;
      localCacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
      Class localClass = TAG;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("clearAll: ");
      localStringBuilder.append(localIOException.getMessage());
      localCacheErrorLogger.logError(localCacheErrorCategory, localClass, localStringBuilder.toString(), localIOException);
      mCacheStats.reset();
      return;
    }
  }
  
  public long clearOldEntries(long paramLong)
  {
    try
    {
      synchronized (mLock)
      {
        long l1 = mClock.now();
        Object localObject2 = mStorage.getEntries();
        long l2 = mCacheStats.getSize();
        int i = 0;
        localObject2 = ((Collection)localObject2).iterator();
        long l3 = 0L;
        long l4 = 0L;
        try
        {
          while (((Iterator)localObject2).hasNext())
          {
            localObject4 = (DiskStorage.Entry)((Iterator)localObject2).next();
            long l5 = Math.max(1L, Math.abs(l1 - ((DiskStorage.Entry)localObject4).getTimestamp()));
            int j;
            long l7;
            if (l5 >= paramLong)
            {
              long l6 = mStorage.remove((DiskStorage.Entry)localObject4);
              mResourceIndex.remove(((DiskStorage.Entry)localObject4).getId());
              j = i;
              l5 = l3;
              l7 = l4;
              if (l6 > 0L)
              {
                j = i + 1;
                l5 = l3 + l6;
                localObject4 = SettableCacheEvent.obtain().setResourceId(((DiskStorage.Entry)localObject4).getId()).setEvictionReason(CacheEventListener.EvictionReason.CONTENT_STALE).setItemSize(l6).setCacheSize(l2 - l5);
                mCacheEventListener.onEviction((CacheEvent)localObject4);
                ((SettableCacheEvent)localObject4).recycle();
                l7 = l4;
              }
            }
            else
            {
              l7 = Math.max(l4, l5);
              l5 = l3;
              j = i;
            }
            i = j;
            l3 = l5;
            l4 = l7;
          }
          mStorage.purgeUnexpectedResources();
          paramLong = l4;
          if (i > 0)
          {
            maybeUpdateFileCacheSize();
            mCacheStats.increment(-l3, -i);
            paramLong = l4;
          }
        }
        catch (IOException localIOException1)
        {
          paramLong = l4;
        }
      }
    }
    catch (IOException localIOException2)
    {
      paramLong = 0L;
      CacheErrorLogger localCacheErrorLogger = mCacheErrorLogger;
      CacheErrorLogger.CacheErrorCategory localCacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
      Class localClass = TAG;
      Object localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      ((StringBuilder)localObject4).append("clearOldEntries: ");
      ((StringBuilder)localObject4).append(localIOException2.getMessage());
      localCacheErrorLogger.logError(localCacheErrorCategory, localClass, ((StringBuilder)localObject4).toString(), localIOException2);
      return paramLong;
    }
  }
  
  public long getCount()
  {
    return mCacheStats.getCount();
  }
  
  public DiskStorage.DiskDumpInfo getDumpInfo()
    throws IOException
  {
    return mStorage.getDumpInfo();
  }
  
  /* Error */
  public BinaryResource getResource(CacheKey paramCacheKey)
  {
    // Byte code:
    //   0: invokestatic 261	com/facebook/cache/disk/SettableCacheEvent:obtain	()Lcom/facebook/cache/disk/SettableCacheEvent;
    //   3: aload_1
    //   4: invokevirtual 497	com/facebook/cache/disk/SettableCacheEvent:setCacheKey	(Lcom/facebook/cache/common/CacheKey;)Lcom/facebook/cache/disk/SettableCacheEvent;
    //   7: astore_2
    //   8: aload_0
    //   9: getfield 102	com/facebook/cache/disk/DiskStorageCache:mLock	Ljava/lang/Object;
    //   12: astore_3
    //   13: aload_3
    //   14: monitorenter
    //   15: aload_1
    //   16: invokestatic 503	com/facebook/cache/common/CacheKeyUtil:getResourceIds	(Lcom/facebook/cache/common/CacheKey;)Ljava/util/List;
    //   19: astore 4
    //   21: iconst_0
    //   22: istore 5
    //   24: aconst_null
    //   25: astore 6
    //   27: aload 6
    //   29: astore 7
    //   31: iload 5
    //   33: aload 4
    //   35: invokeinterface 506 1 0
    //   40: if_icmpge +52 -> 92
    //   43: aload 4
    //   45: iload 5
    //   47: invokeinterface 509 2 0
    //   52: checkcast 511	java/lang/String
    //   55: astore 6
    //   57: aload_2
    //   58: aload 6
    //   60: invokevirtual 265	com/facebook/cache/disk/SettableCacheEvent:setResourceId	(Ljava/lang/String;)Lcom/facebook/cache/disk/SettableCacheEvent;
    //   63: pop
    //   64: aload_0
    //   65: getfield 120	com/facebook/cache/disk/DiskStorageCache:mStorage	Lcom/facebook/cache/disk/DiskStorage;
    //   68: aload 6
    //   70: aload_1
    //   71: invokeinterface 514 3 0
    //   76: astore 7
    //   78: aload 7
    //   80: ifnull +6 -> 86
    //   83: goto +9 -> 92
    //   86: iinc 5 1
    //   89: goto -58 -> 31
    //   92: aload 7
    //   94: ifnonnull +28 -> 122
    //   97: aload_0
    //   98: getfield 126	com/facebook/cache/disk/DiskStorageCache:mCacheEventListener	Lcom/facebook/cache/common/CacheEventListener;
    //   101: aload_2
    //   102: invokeinterface 517 2 0
    //   107: aload_0
    //   108: getfield 155	com/facebook/cache/disk/DiskStorageCache:mResourceIndex	Ljava/util/Set;
    //   111: aload 6
    //   113: invokeinterface 255 2 0
    //   118: pop
    //   119: goto +25 -> 144
    //   122: aload_0
    //   123: getfield 126	com/facebook/cache/disk/DiskStorageCache:mCacheEventListener	Lcom/facebook/cache/common/CacheEventListener;
    //   126: aload_2
    //   127: invokeinterface 520 2 0
    //   132: aload_0
    //   133: getfield 155	com/facebook/cache/disk/DiskStorageCache:mResourceIndex	Ljava/util/Set;
    //   136: aload 6
    //   138: invokeinterface 202 2 0
    //   143: pop
    //   144: aload_3
    //   145: monitorexit
    //   146: aload_2
    //   147: invokevirtual 288	com/facebook/cache/disk/SettableCacheEvent:recycle	()V
    //   150: aload 7
    //   152: areturn
    //   153: astore_1
    //   154: aload_3
    //   155: monitorexit
    //   156: aload_1
    //   157: athrow
    //   158: astore_1
    //   159: goto +45 -> 204
    //   162: astore_1
    //   163: aload_0
    //   164: getfield 131	com/facebook/cache/disk/DiskStorageCache:mCacheErrorLogger	Lcom/facebook/cache/common/CacheErrorLogger;
    //   167: getstatic 423	com/facebook/cache/common/CacheErrorLogger$CacheErrorCategory:GENERIC_IO	Lcom/facebook/cache/common/CacheErrorLogger$CacheErrorCategory;
    //   170: getstatic 73	com/facebook/cache/disk/DiskStorageCache:TAG	Ljava/lang/Class;
    //   173: ldc_w 521
    //   176: aload_1
    //   177: invokeinterface 324 5 0
    //   182: aload_2
    //   183: aload_1
    //   184: invokevirtual 525	com/facebook/cache/disk/SettableCacheEvent:setException	(Ljava/io/IOException;)Lcom/facebook/cache/disk/SettableCacheEvent;
    //   187: pop
    //   188: aload_0
    //   189: getfield 126	com/facebook/cache/disk/DiskStorageCache:mCacheEventListener	Lcom/facebook/cache/common/CacheEventListener;
    //   192: aload_2
    //   193: invokeinterface 528 2 0
    //   198: aload_2
    //   199: invokevirtual 288	com/facebook/cache/disk/SettableCacheEvent:recycle	()V
    //   202: aconst_null
    //   203: areturn
    //   204: aload_2
    //   205: invokevirtual 288	com/facebook/cache/disk/SettableCacheEvent:recycle	()V
    //   208: aload_1
    //   209: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	210	0	this	DiskStorageCache
    //   0	210	1	paramCacheKey	CacheKey
    //   7	198	2	localSettableCacheEvent	SettableCacheEvent
    //   19	25	4	localList	List
    //   22	65	5	i	int
    //   25	112	6	str	String
    //   29	122	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   15	21	153	finally
    //   31	78	153	finally
    //   97	119	153	finally
    //   122	144	153	finally
    //   144	146	153	finally
    //   154	156	153	finally
    //   8	15	158	finally
    //   156	158	158	finally
    //   163	198	158	finally
    //   8	15	162	java/io/IOException
    //   156	158	162	java/io/IOException
  }
  
  public long getSize()
  {
    return mCacheStats.getSize();
  }
  
  public boolean hasKey(CacheKey paramCacheKey)
  {
    synchronized (mLock)
    {
      if (hasKeySync(paramCacheKey)) {
        return true;
      }
      try
      {
        List localList = CacheKeyUtil.getResourceIds(paramCacheKey);
        for (int i = 0; i < localList.size(); i++)
        {
          String str = (String)localList.get(i);
          if (mStorage.contains(str, paramCacheKey))
          {
            mResourceIndex.add(str);
            return true;
          }
        }
        return false;
      }
      catch (IOException paramCacheKey)
      {
        return false;
      }
    }
  }
  
  public boolean hasKeySync(CacheKey paramCacheKey)
  {
    synchronized (mLock)
    {
      paramCacheKey = CacheKeyUtil.getResourceIds(paramCacheKey);
      for (int i = 0; i < paramCacheKey.size(); i++)
      {
        String str = (String)paramCacheKey.get(i);
        if (mResourceIndex.contains(str)) {
          return true;
        }
      }
      return false;
    }
  }
  
  /* Error */
  public BinaryResource insert(CacheKey paramCacheKey, com.facebook.cache.common.WriterCallback paramWriterCallback)
    throws IOException
  {
    // Byte code:
    //   0: invokestatic 261	com/facebook/cache/disk/SettableCacheEvent:obtain	()Lcom/facebook/cache/disk/SettableCacheEvent;
    //   3: aload_1
    //   4: invokevirtual 497	com/facebook/cache/disk/SettableCacheEvent:setCacheKey	(Lcom/facebook/cache/common/CacheKey;)Lcom/facebook/cache/disk/SettableCacheEvent;
    //   7: astore_3
    //   8: aload_0
    //   9: getfield 126	com/facebook/cache/disk/DiskStorageCache:mCacheEventListener	Lcom/facebook/cache/common/CacheEventListener;
    //   12: aload_3
    //   13: invokeinterface 543 2 0
    //   18: aload_0
    //   19: getfield 102	com/facebook/cache/disk/DiskStorageCache:mLock	Ljava/lang/Object;
    //   22: astore 4
    //   24: aload 4
    //   26: monitorenter
    //   27: aload_1
    //   28: invokestatic 547	com/facebook/cache/common/CacheKeyUtil:getFirstResourceId	(Lcom/facebook/cache/common/CacheKey;)Ljava/lang/String;
    //   31: astore 5
    //   33: aload 4
    //   35: monitorexit
    //   36: aload_3
    //   37: aload 5
    //   39: invokevirtual 265	com/facebook/cache/disk/SettableCacheEvent:setResourceId	(Ljava/lang/String;)Lcom/facebook/cache/disk/SettableCacheEvent;
    //   42: pop
    //   43: aload_0
    //   44: aload 5
    //   46: aload_1
    //   47: invokespecial 549	com/facebook/cache/disk/DiskStorageCache:startInsert	(Ljava/lang/String;Lcom/facebook/cache/common/CacheKey;)Lcom/facebook/cache/disk/DiskStorage$Inserter;
    //   50: astore 4
    //   52: aload 4
    //   54: aload_2
    //   55: aload_1
    //   56: invokeinterface 553 3 0
    //   61: aload_0
    //   62: aload 4
    //   64: aload_1
    //   65: aload 5
    //   67: invokespecial 555	com/facebook/cache/disk/DiskStorageCache:endInsert	(Lcom/facebook/cache/disk/DiskStorage$Inserter;Lcom/facebook/cache/common/CacheKey;Ljava/lang/String;)Lcom/facebook/binaryresource/BinaryResource;
    //   70: astore_1
    //   71: aload_3
    //   72: aload_1
    //   73: invokeinterface 208 1 0
    //   78: invokevirtual 273	com/facebook/cache/disk/SettableCacheEvent:setItemSize	(J)Lcom/facebook/cache/disk/SettableCacheEvent;
    //   81: aload_0
    //   82: getfield 134	com/facebook/cache/disk/DiskStorageCache:mCacheStats	Lcom/facebook/cache/disk/DiskStorageCache$CacheStats;
    //   85: invokevirtual 228	com/facebook/cache/disk/DiskStorageCache$CacheStats:getSize	()J
    //   88: invokevirtual 276	com/facebook/cache/disk/SettableCacheEvent:setCacheSize	(J)Lcom/facebook/cache/disk/SettableCacheEvent;
    //   91: pop
    //   92: aload_0
    //   93: getfield 126	com/facebook/cache/disk/DiskStorageCache:mCacheEventListener	Lcom/facebook/cache/common/CacheEventListener;
    //   96: aload_3
    //   97: invokeinterface 558 2 0
    //   102: aload 4
    //   104: invokeinterface 561 1 0
    //   109: ifne +12 -> 121
    //   112: getstatic 73	com/facebook/cache/disk/DiskStorageCache:TAG	Ljava/lang/Class;
    //   115: ldc_w 563
    //   118: invokestatic 470	com/facebook/common/logging/FLog:e	(Ljava/lang/Class;Ljava/lang/String;)V
    //   121: aload_3
    //   122: invokevirtual 288	com/facebook/cache/disk/SettableCacheEvent:recycle	()V
    //   125: aload_1
    //   126: areturn
    //   127: astore_1
    //   128: aload 4
    //   130: invokeinterface 561 1 0
    //   135: ifne +12 -> 147
    //   138: getstatic 73	com/facebook/cache/disk/DiskStorageCache:TAG	Ljava/lang/Class;
    //   141: ldc_w 563
    //   144: invokestatic 470	com/facebook/common/logging/FLog:e	(Ljava/lang/Class;Ljava/lang/String;)V
    //   147: aload_1
    //   148: athrow
    //   149: astore_1
    //   150: goto +32 -> 182
    //   153: astore_1
    //   154: aload_3
    //   155: aload_1
    //   156: invokevirtual 525	com/facebook/cache/disk/SettableCacheEvent:setException	(Ljava/io/IOException;)Lcom/facebook/cache/disk/SettableCacheEvent;
    //   159: pop
    //   160: aload_0
    //   161: getfield 126	com/facebook/cache/disk/DiskStorageCache:mCacheEventListener	Lcom/facebook/cache/common/CacheEventListener;
    //   164: aload_3
    //   165: invokeinterface 566 2 0
    //   170: getstatic 73	com/facebook/cache/disk/DiskStorageCache:TAG	Ljava/lang/Class;
    //   173: ldc_w 568
    //   176: aload_1
    //   177: invokestatic 571	com/facebook/common/logging/FLog:e	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   180: aload_1
    //   181: athrow
    //   182: aload_3
    //   183: invokevirtual 288	com/facebook/cache/disk/SettableCacheEvent:recycle	()V
    //   186: aload_1
    //   187: athrow
    //   188: astore_1
    //   189: aload 4
    //   191: monitorexit
    //   192: aload_1
    //   193: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	this	DiskStorageCache
    //   0	194	1	paramCacheKey	CacheKey
    //   0	194	2	paramWriterCallback	com.facebook.cache.common.WriterCallback
    //   7	176	3	localSettableCacheEvent	SettableCacheEvent
    //   22	168	4	localObject	Object
    //   31	35	5	str	String
    // Exception table:
    //   from	to	target	type
    //   52	102	127	finally
    //   43	52	149	finally
    //   102	121	149	finally
    //   128	147	149	finally
    //   147	149	149	finally
    //   154	182	149	finally
    //   43	52	153	java/io/IOException
    //   102	121	153	java/io/IOException
    //   128	147	153	java/io/IOException
    //   147	149	153	java/io/IOException
    //   27	36	188	finally
    //   189	192	188	finally
  }
  
  public boolean isEnabled()
  {
    return mStorage.isEnabled();
  }
  
  public boolean isIndexReady()
  {
    boolean bool;
    if ((!mIndexReady) && (mIndexPopulateAtStartupEnabled)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean probe(CacheKey paramCacheKey)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    try
    {
      synchronized (mLock)
      {
        List localList = CacheKeyUtil.getResourceIds(paramCacheKey);
        int i = 0;
        for (;;)
        {
          localObject1 = localObject2;
          String str;
          if (i < localList.size())
          {
            localObject1 = localObject2;
            str = (String)localList.get(i);
            localObject2 = str;
          }
          try
          {
            if (mStorage.touch(str, paramCacheKey))
            {
              localObject2 = str;
              mResourceIndex.add(str);
              localObject2 = str;
              return true;
            }
            i++;
          }
          finally
          {
            for (;;)
            {
              localObject1 = localIOException1;
            }
          }
        }
        localObject1 = localObject2;
        return false;
      }
      return false;
    }
    catch (IOException localIOException2)
    {
      localObject1 = null;
      paramCacheKey = SettableCacheEvent.obtain().setCacheKey(paramCacheKey).setResourceId((String)localObject1).setException(localIOException2);
      mCacheEventListener.onReadException(paramCacheKey);
      paramCacheKey.recycle();
    }
  }
  
  public void remove(CacheKey paramCacheKey)
  {
    try
    {
      synchronized (mLock)
      {
        localObject2 = CacheKeyUtil.getResourceIds(paramCacheKey);
        int i = 0;
        if (i < ((List)localObject2).size())
        {
          paramCacheKey = (String)((List)localObject2).get(i);
          mStorage.remove(paramCacheKey);
          mResourceIndex.remove(paramCacheKey);
          i++;
        }
      }
    }
    catch (IOException localIOException)
    {
      CacheErrorLogger localCacheErrorLogger = mCacheErrorLogger;
      CacheErrorLogger.CacheErrorCategory localCacheErrorCategory = CacheErrorLogger.CacheErrorCategory.DELETE_FILE;
      Object localObject2 = TAG;
      paramCacheKey = new java/lang/StringBuilder;
      paramCacheKey.<init>();
      paramCacheKey.append("delete: ");
      paramCacheKey.append(localIOException.getMessage());
      localCacheErrorLogger.logError(localCacheErrorCategory, (Class)localObject2, paramCacheKey.toString(), localIOException);
      return;
    }
  }
  
  public void trimToMinimum()
  {
    synchronized (mLock)
    {
      maybeUpdateFileCacheSize();
      long l1 = mCacheStats.getSize();
      long l2 = mCacheSizeLimitMinimum;
      if ((l2 > 0L) && (l1 > 0L) && (l1 >= l2))
      {
        double d = 1.0D - l2 / l1;
        if (d > 0.02D) {
          trimBy(d);
        }
        return;
      }
      return;
    }
  }
  
  public void trimToNothing()
  {
    clearAll();
  }
  
  @VisibleForTesting
  public static class CacheStats
  {
    private long mCount = -1L;
    private boolean mInitialized = false;
    private long mSize = -1L;
    
    public long getCount()
    {
      try
      {
        long l = mCount;
        return l;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public long getSize()
    {
      try
      {
        long l = mSize;
        return l;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public void increment(long paramLong1, long paramLong2)
    {
      try
      {
        if (mInitialized)
        {
          mSize += paramLong1;
          mCount += paramLong2;
        }
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public boolean isInitialized()
    {
      try
      {
        boolean bool = mInitialized;
        return bool;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public void reset()
    {
      try
      {
        mInitialized = false;
        mCount = -1L;
        mSize = -1L;
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public void set(long paramLong1, long paramLong2)
    {
      try
      {
        mCount = paramLong2;
        mSize = paramLong1;
        mInitialized = true;
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
  
  public static class Params
  {
    public final long mCacheSizeLimitMinimum;
    public final long mDefaultCacheSizeLimit;
    public final long mLowDiskSpaceCacheSizeLimit;
    
    public Params(long paramLong1, long paramLong2, long paramLong3)
    {
      mCacheSizeLimitMinimum = paramLong1;
      mLowDiskSpaceCacheSizeLimit = paramLong2;
      mDefaultCacheSizeLimit = paramLong3;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DiskStorageCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */