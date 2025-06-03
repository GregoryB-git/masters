package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public final class SimpleCache
  implements Cache
{
  private static final String TAG = "SimpleCache";
  private static boolean cacheFolderLockingDisabled;
  private static final HashSet<File> lockedCacheDirs = new HashSet();
  private final File cacheDir;
  private final CacheEvictor evictor;
  private final CachedContentIndex index;
  private final HashMap<String, ArrayList<Cache.Listener>> listeners;
  private boolean released;
  private long totalSpace;
  
  public SimpleCache(File paramFile, CacheEvictor paramCacheEvictor)
  {
    this(paramFile, paramCacheEvictor, null, false);
  }
  
  public SimpleCache(final File paramFile, CacheEvictor paramCacheEvictor, CachedContentIndex paramCachedContentIndex)
  {
    if (lockFolder(paramFile))
    {
      cacheDir = paramFile;
      evictor = paramCacheEvictor;
      index = paramCachedContentIndex;
      listeners = new HashMap();
      paramFile = new ConditionVariable();
      new Thread("SimpleCache.initialize()")
      {
        public void run()
        {
          synchronized (SimpleCache.this)
          {
            paramFile.open();
            SimpleCache.access$000(SimpleCache.this);
            SimpleCache.access$100(SimpleCache.this).onCacheInitialized();
            return;
          }
        }
      }.start();
      paramFile.block();
      return;
    }
    paramCacheEvictor = new StringBuilder();
    paramCacheEvictor.append("Another SimpleCache instance uses the folder: ");
    paramCacheEvictor.append(paramFile);
    throw new IllegalStateException(paramCacheEvictor.toString());
  }
  
  public SimpleCache(File paramFile, CacheEvictor paramCacheEvictor, byte[] paramArrayOfByte)
  {
    this(paramFile, paramCacheEvictor, paramArrayOfByte, bool);
  }
  
  public SimpleCache(File paramFile, CacheEvictor paramCacheEvictor, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    this(paramFile, paramCacheEvictor, new CachedContentIndex(paramFile, paramArrayOfByte, paramBoolean));
  }
  
  private void addSpan(SimpleCacheSpan paramSimpleCacheSpan)
  {
    index.getOrAdd(key).addSpan(paramSimpleCacheSpan);
    totalSpace += length;
    notifySpanAdded(paramSimpleCacheSpan);
  }
  
  @Deprecated
  public static void disableCacheFolderLocking()
  {
    try
    {
      cacheFolderLockingDisabled = true;
      lockedCacheDirs.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private SimpleCacheSpan getSpan(String paramString, long paramLong)
    throws Cache.CacheException
  {
    CachedContent localCachedContent = index.get(paramString);
    if (localCachedContent == null) {
      return SimpleCacheSpan.createOpenHole(paramString, paramLong);
    }
    for (;;)
    {
      paramString = localCachedContent.getSpan(paramLong);
      if ((!isCached) || (file.exists())) {
        break;
      }
      removeStaleSpansAndCachedContents();
    }
    return paramString;
  }
  
  private void initialize()
  {
    if (!cacheDir.exists())
    {
      cacheDir.mkdirs();
      return;
    }
    index.load();
    File[] arrayOfFile = cacheDir.listFiles();
    if (arrayOfFile == null) {
      return;
    }
    int i = arrayOfFile.length;
    for (int j = 0; j < i; j++)
    {
      File localFile = arrayOfFile[j];
      if (!localFile.getName().equals("cached_content_index.exi"))
      {
        SimpleCacheSpan localSimpleCacheSpan;
        if (localFile.length() > 0L) {
          localSimpleCacheSpan = SimpleCacheSpan.createCacheEntry(localFile, index);
        } else {
          localSimpleCacheSpan = null;
        }
        if (localSimpleCacheSpan != null) {
          addSpan(localSimpleCacheSpan);
        } else {
          localFile.delete();
        }
      }
    }
    index.removeEmpty();
    try
    {
      index.store();
    }
    catch (Cache.CacheException localCacheException)
    {
      Log.e("SimpleCache", "Storing index file failed", localCacheException);
    }
  }
  
  public static boolean isCacheFolderLocked(File paramFile)
  {
    try
    {
      boolean bool = lockedCacheDirs.contains(paramFile.getAbsoluteFile());
      return bool;
    }
    finally
    {
      paramFile = finally;
      throw paramFile;
    }
  }
  
  private static boolean lockFolder(File paramFile)
  {
    try
    {
      boolean bool = cacheFolderLockingDisabled;
      if (bool) {
        return true;
      }
      bool = lockedCacheDirs.add(paramFile.getAbsoluteFile());
      return bool;
    }
    finally {}
  }
  
  private void notifySpanAdded(SimpleCacheSpan paramSimpleCacheSpan)
  {
    ArrayList localArrayList = (ArrayList)listeners.get(key);
    if (localArrayList != null) {
      for (int i = localArrayList.size() - 1; i >= 0; i--) {
        ((Cache.Listener)localArrayList.get(i)).onSpanAdded(this, paramSimpleCacheSpan);
      }
    }
    evictor.onSpanAdded(this, paramSimpleCacheSpan);
  }
  
  private void notifySpanRemoved(CacheSpan paramCacheSpan)
  {
    ArrayList localArrayList = (ArrayList)listeners.get(key);
    if (localArrayList != null) {
      for (int i = localArrayList.size() - 1; i >= 0; i--) {
        ((Cache.Listener)localArrayList.get(i)).onSpanRemoved(this, paramCacheSpan);
      }
    }
    evictor.onSpanRemoved(this, paramCacheSpan);
  }
  
  private void notifySpanTouched(SimpleCacheSpan paramSimpleCacheSpan, CacheSpan paramCacheSpan)
  {
    ArrayList localArrayList = (ArrayList)listeners.get(key);
    if (localArrayList != null) {
      for (int i = localArrayList.size() - 1; i >= 0; i--) {
        ((Cache.Listener)localArrayList.get(i)).onSpanTouched(this, paramSimpleCacheSpan, paramCacheSpan);
      }
    }
    evictor.onSpanTouched(this, paramSimpleCacheSpan, paramCacheSpan);
  }
  
  /* Error */
  private void removeSpan(CacheSpan paramCacheSpan, boolean paramBoolean)
    throws Cache.CacheException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 55	com/google/android/exoplayer2/upstream/cache/SimpleCache:index	Lcom/google/android/exoplayer2/upstream/cache/CachedContentIndex;
    //   4: aload_1
    //   5: getfield 119	com/google/android/exoplayer2/upstream/cache/CacheSpan:key	Ljava/lang/String;
    //   8: invokevirtual 150	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:get	(Ljava/lang/String;)Lcom/google/android/exoplayer2/upstream/cache/CachedContent;
    //   11: astore_3
    //   12: aload_3
    //   13: ifnull +65 -> 78
    //   16: aload_3
    //   17: aload_1
    //   18: invokevirtual 265	com/google/android/exoplayer2/upstream/cache/CachedContent:removeSpan	(Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)Z
    //   21: ifne +6 -> 27
    //   24: goto +54 -> 78
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 129	com/google/android/exoplayer2/upstream/cache/SimpleCache:totalSpace	J
    //   32: aload_1
    //   33: getfield 132	com/google/android/exoplayer2/upstream/cache/CacheSpan:length	J
    //   36: lsub
    //   37: putfield 129	com/google/android/exoplayer2/upstream/cache/SimpleCache:totalSpace	J
    //   40: iload_2
    //   41: ifeq +32 -> 73
    //   44: aload_0
    //   45: getfield 55	com/google/android/exoplayer2/upstream/cache/SimpleCache:index	Lcom/google/android/exoplayer2/upstream/cache/CachedContentIndex;
    //   48: aload_3
    //   49: getfield 266	com/google/android/exoplayer2/upstream/cache/CachedContent:key	Ljava/lang/String;
    //   52: invokevirtual 269	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:maybeRemove	(Ljava/lang/String;)V
    //   55: aload_0
    //   56: getfield 55	com/google/android/exoplayer2/upstream/cache/SimpleCache:index	Lcom/google/android/exoplayer2/upstream/cache/CachedContentIndex;
    //   59: invokevirtual 212	com/google/android/exoplayer2/upstream/cache/CachedContentIndex:store	()V
    //   62: goto +11 -> 73
    //   65: astore_3
    //   66: aload_0
    //   67: aload_1
    //   68: invokespecial 271	com/google/android/exoplayer2/upstream/cache/SimpleCache:notifySpanRemoved	(Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)V
    //   71: aload_3
    //   72: athrow
    //   73: aload_0
    //   74: aload_1
    //   75: invokespecial 271	com/google/android/exoplayer2/upstream/cache/SimpleCache:notifySpanRemoved	(Lcom/google/android/exoplayer2/upstream/cache/CacheSpan;)V
    //   78: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	SimpleCache
    //   0	79	1	paramCacheSpan	CacheSpan
    //   0	79	2	paramBoolean	boolean
    //   11	38	3	localCachedContent	CachedContent
    //   65	7	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   44	62	65	finally
  }
  
  private void removeStaleSpansAndCachedContents()
    throws Cache.CacheException
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = index.getAll().iterator();
    while (localIterator1.hasNext())
    {
      Iterator localIterator2 = ((CachedContent)localIterator1.next()).getSpans().iterator();
      while (localIterator2.hasNext())
      {
        CacheSpan localCacheSpan = (CacheSpan)localIterator2.next();
        if (!file.exists()) {
          localArrayList.add(localCacheSpan);
        }
      }
    }
    for (int i = 0; i < localArrayList.size(); i++) {
      removeSpan((CacheSpan)localArrayList.get(i), false);
    }
    index.removeEmpty();
    index.store();
  }
  
  private static void unlockFolder(File paramFile)
  {
    try
    {
      if (!cacheFolderLockingDisabled) {
        lockedCacheDirs.remove(paramFile.getAbsoluteFile());
      }
      return;
    }
    finally
    {
      paramFile = finally;
      throw paramFile;
    }
  }
  
  public NavigableSet<CacheSpan> addListener(String paramString, Cache.Listener paramListener)
  {
    try
    {
      boolean bool;
      if (!released) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      ArrayList localArrayList1 = (ArrayList)listeners.get(paramString);
      ArrayList localArrayList2 = localArrayList1;
      if (localArrayList1 == null)
      {
        localArrayList2 = new java/util/ArrayList;
        localArrayList2.<init>();
        listeners.put(paramString, localArrayList2);
      }
      localArrayList2.add(paramListener);
      paramString = getCachedSpans(paramString);
      return paramString;
    }
    finally {}
  }
  
  public void applyContentMetadataMutations(String paramString, ContentMetadataMutations paramContentMetadataMutations)
    throws Cache.CacheException
  {
    try
    {
      boolean bool;
      if (!released) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      index.applyContentMetadataMutations(paramString, paramContentMetadataMutations);
      index.store();
      return;
    }
    finally {}
  }
  
  public void commitFile(File paramFile)
    throws Cache.CacheException
  {
    try
    {
      boolean bool1 = released;
      boolean bool2 = true;
      if (!bool1) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Assertions.checkState(bool1);
      SimpleCacheSpan localSimpleCacheSpan = SimpleCacheSpan.createCacheEntry(paramFile, index);
      if (localSimpleCacheSpan != null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Assertions.checkState(bool1);
      CachedContent localCachedContent = index.get(key);
      Assertions.checkNotNull(localCachedContent);
      Assertions.checkState(localCachedContent.isLocked());
      bool1 = paramFile.exists();
      if (!bool1) {
        return;
      }
      if (paramFile.length() == 0L)
      {
        paramFile.delete();
        return;
      }
      long l = ContentMetadataInternal.getContentLength(localCachedContent.getMetadata());
      if (l != -1L)
      {
        if (position + length <= l) {
          bool1 = bool2;
        } else {
          bool1 = false;
        }
        Assertions.checkState(bool1);
      }
      addSpan(localSimpleCacheSpan);
      index.store();
      notifyAll();
      return;
    }
    finally {}
  }
  
  public long getCacheSpace()
  {
    try
    {
      boolean bool;
      if (!released) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      long l = totalSpace;
      return l;
    }
    finally {}
  }
  
  public long getCachedLength(String paramString, long paramLong1, long paramLong2)
  {
    try
    {
      boolean bool;
      if (!released) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      paramString = index.get(paramString);
      if (paramString != null) {
        paramLong1 = paramString.getCachedBytesLength(paramLong1, paramLong2);
      } else {
        paramLong1 = -paramLong2;
      }
      return paramLong1;
    }
    finally {}
  }
  
  @NonNull
  public NavigableSet<CacheSpan> getCachedSpans(String paramString)
  {
    try
    {
      boolean bool;
      if (!released) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      paramString = index.get(paramString);
      if ((paramString != null) && (!paramString.isEmpty())) {
        paramString = new TreeSet(paramString.getSpans());
      } else {
        paramString = new TreeSet();
      }
      return paramString;
    }
    finally {}
  }
  
  public long getContentLength(String paramString)
  {
    try
    {
      long l = ContentMetadataInternal.getContentLength(getContentMetadata(paramString));
      return l;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public ContentMetadata getContentMetadata(String paramString)
  {
    try
    {
      boolean bool;
      if (!released) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      paramString = index.getContentMetadata(paramString);
      return paramString;
    }
    finally {}
  }
  
  public Set<String> getKeys()
  {
    try
    {
      boolean bool;
      if (!released) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      HashSet localHashSet = new HashSet(index.getKeys());
      return localHashSet;
    }
    finally {}
  }
  
  public boolean isCached(String paramString, long paramLong1, long paramLong2)
  {
    try
    {
      boolean bool1 = released;
      boolean bool2 = true;
      if (!bool1) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      Assertions.checkState(bool1);
      paramString = index.get(paramString);
      if (paramString != null)
      {
        paramLong1 = paramString.getCachedBytesLength(paramLong1, paramLong2);
        if (paramLong1 >= paramLong2)
        {
          bool1 = bool2;
          break label68;
        }
      }
      bool1 = false;
      label68:
      return bool1;
    }
    finally {}
  }
  
  /* Error */
  public void release()
    throws Cache.CacheException
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 310	com/google/android/exoplayer2/upstream/cache/SimpleCache:released	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 60	com/google/android/exoplayer2/upstream/cache/SimpleCache:listeners	Ljava/util/HashMap;
    //   18: invokevirtual 387	java/util/HashMap:clear	()V
    //   21: aload_0
    //   22: invokespecial 173	com/google/android/exoplayer2/upstream/cache/SimpleCache:removeStaleSpansAndCachedContents	()V
    //   25: aload_0
    //   26: getfield 51	com/google/android/exoplayer2/upstream/cache/SimpleCache:cacheDir	Ljava/io/File;
    //   29: invokestatic 389	com/google/android/exoplayer2/upstream/cache/SimpleCache:unlockFolder	(Ljava/io/File;)V
    //   32: aload_0
    //   33: iconst_1
    //   34: putfield 310	com/google/android/exoplayer2/upstream/cache/SimpleCache:released	Z
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: astore_2
    //   41: aload_0
    //   42: getfield 51	com/google/android/exoplayer2/upstream/cache/SimpleCache:cacheDir	Ljava/io/File;
    //   45: invokestatic 389	com/google/android/exoplayer2/upstream/cache/SimpleCache:unlockFolder	(Ljava/io/File;)V
    //   48: aload_0
    //   49: iconst_1
    //   50: putfield 310	com/google/android/exoplayer2/upstream/cache/SimpleCache:released	Z
    //   53: aload_2
    //   54: athrow
    //   55: astore_2
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_2
    //   59: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	SimpleCache
    //   6	2	1	bool	boolean
    //   40	14	2	localObject1	Object
    //   55	4	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   21	25	40	finally
    //   2	7	55	finally
    //   14	21	55	finally
    //   25	37	55	finally
    //   41	55	55	finally
  }
  
  public void releaseHoleSpan(CacheSpan paramCacheSpan)
  {
    try
    {
      boolean bool;
      if (!released) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      paramCacheSpan = index.get(key);
      Assertions.checkNotNull(paramCacheSpan);
      Assertions.checkState(paramCacheSpan.isLocked());
      paramCacheSpan.setLocked(false);
      index.maybeRemove(key);
      notifyAll();
      return;
    }
    finally {}
  }
  
  public void removeListener(String paramString, Cache.Listener paramListener)
  {
    try
    {
      boolean bool = released;
      if (bool) {
        return;
      }
      ArrayList localArrayList = (ArrayList)listeners.get(paramString);
      if (localArrayList != null)
      {
        localArrayList.remove(paramListener);
        if (localArrayList.isEmpty()) {
          listeners.remove(paramString);
        }
      }
      return;
    }
    finally {}
  }
  
  public void removeSpan(CacheSpan paramCacheSpan)
    throws Cache.CacheException
  {
    try
    {
      boolean bool;
      if (!released) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      removeSpan(paramCacheSpan, true);
      return;
    }
    finally {}
  }
  
  public void setContentLength(String paramString, long paramLong)
    throws Cache.CacheException
  {
    try
    {
      ContentMetadataMutations localContentMetadataMutations = new com/google/android/exoplayer2/upstream/cache/ContentMetadataMutations;
      localContentMetadataMutations.<init>();
      ContentMetadataInternal.setContentLength(localContentMetadataMutations, paramLong);
      applyContentMetadataMutations(paramString, localContentMetadataMutations);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public File startFile(String paramString, long paramLong1, long paramLong2)
    throws Cache.CacheException
  {
    try
    {
      boolean bool;
      if (!released) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      CachedContent localCachedContent = index.get(paramString);
      Assertions.checkNotNull(localCachedContent);
      Assertions.checkState(localCachedContent.isLocked());
      if (!cacheDir.exists())
      {
        cacheDir.mkdirs();
        removeStaleSpansAndCachedContents();
      }
      evictor.onStartFile(this, paramString, paramLong1, paramLong2);
      paramString = SimpleCacheSpan.getCacheFile(cacheDir, id, paramLong1, System.currentTimeMillis());
      return paramString;
    }
    finally {}
  }
  
  /* Error */
  public SimpleCacheSpan startReadWrite(String paramString, long paramLong)
    throws java.lang.InterruptedException, Cache.CacheException
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: lload_2
    //   5: invokevirtual 438	com/google/android/exoplayer2/upstream/cache/SimpleCache:startReadWriteNonBlocking	(Ljava/lang/String;J)Lcom/google/android/exoplayer2/upstream/cache/SimpleCacheSpan;
    //   8: astore 4
    //   10: aload 4
    //   12: ifnull +8 -> 20
    //   15: aload_0
    //   16: monitorexit
    //   17: aload 4
    //   19: areturn
    //   20: aload_0
    //   21: invokevirtual 441	java/lang/Object:wait	()V
    //   24: goto -22 -> 2
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	32	0	this	SimpleCache
    //   0	32	1	paramString	String
    //   0	32	2	paramLong	long
    //   8	10	4	localSimpleCacheSpan	SimpleCacheSpan
    // Exception table:
    //   from	to	target	type
    //   2	10	27	finally
    //   20	24	27	finally
  }
  
  @Nullable
  public SimpleCacheSpan startReadWriteNonBlocking(String paramString, long paramLong)
    throws Cache.CacheException
  {
    try
    {
      if (!released) {
        bool = true;
      } else {
        bool = false;
      }
      Assertions.checkState(bool);
      SimpleCacheSpan localSimpleCacheSpan = getSpan(paramString, paramLong);
      boolean bool = isCached;
      if (bool) {
        try
        {
          paramString = index.get(paramString).touch(localSimpleCacheSpan);
          notifySpanTouched(localSimpleCacheSpan, paramString);
          return paramString;
        }
        catch (Cache.CacheException paramString)
        {
          return localSimpleCacheSpan;
        }
      }
      paramString = index.getOrAdd(paramString);
      if (!paramString.isLocked())
      {
        paramString.setLocked(true);
        return localSimpleCacheSpan;
      }
      return null;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.SimpleCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */