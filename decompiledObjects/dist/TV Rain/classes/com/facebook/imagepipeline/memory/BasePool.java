package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Sets;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.MemoryTrimType;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.memory.Pool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.NotThreadSafe;

public abstract class BasePool<V>
  implements Pool<V>
{
  private final Class<?> TAG = getClass();
  private boolean mAllowNewBuckets;
  @VisibleForTesting
  public final SparseArray<Bucket<V>> mBuckets;
  @VisibleForTesting
  @GuardedBy("this")
  public final Counter mFree;
  @VisibleForTesting
  public final Set<V> mInUseValues;
  public final MemoryTrimmableRegistry mMemoryTrimmableRegistry;
  public final PoolParams mPoolParams;
  private final PoolStatsTracker mPoolStatsTracker;
  @VisibleForTesting
  @GuardedBy("this")
  public final Counter mUsed;
  
  public BasePool(MemoryTrimmableRegistry paramMemoryTrimmableRegistry, PoolParams paramPoolParams, PoolStatsTracker paramPoolStatsTracker)
  {
    mMemoryTrimmableRegistry = ((MemoryTrimmableRegistry)Preconditions.checkNotNull(paramMemoryTrimmableRegistry));
    mPoolParams = ((PoolParams)Preconditions.checkNotNull(paramPoolParams));
    mPoolStatsTracker = ((PoolStatsTracker)Preconditions.checkNotNull(paramPoolStatsTracker));
    mBuckets = new SparseArray();
    initBuckets(new SparseIntArray(0));
    mInUseValues = Sets.newIdentityHashSet();
    mFree = new Counter();
    mUsed = new Counter();
  }
  
  private void ensurePoolSizeInvariant()
  {
    try
    {
      boolean bool;
      if ((isMaxSizeSoftCapExceeded()) && (mFree.mNumBytes != 0)) {
        bool = false;
      } else {
        bool = true;
      }
      Preconditions.checkState(bool);
      return;
    }
    finally {}
  }
  
  private Bucket<V> getBucketIfPresent(int paramInt)
  {
    try
    {
      Bucket localBucket = (Bucket)mBuckets.get(paramInt);
      return localBucket;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void initBuckets(SparseIntArray paramSparseIntArray)
  {
    try
    {
      Preconditions.checkNotNull(paramSparseIntArray);
      mBuckets.clear();
      SparseIntArray localSparseIntArray = mPoolParams.bucketSizes;
      if (localSparseIntArray != null)
      {
        for (int i = 0; i < localSparseIntArray.size(); i++)
        {
          int j = localSparseIntArray.keyAt(i);
          int k = localSparseIntArray.valueAt(i);
          int m = paramSparseIntArray.get(j, 0);
          SparseArray localSparseArray = mBuckets;
          Bucket localBucket = new com/facebook/imagepipeline/memory/Bucket;
          localBucket.<init>(getSizeInBytes(j), k, m);
          localSparseArray.put(j, localBucket);
        }
        mAllowNewBuckets = false;
      }
      else
      {
        mAllowNewBuckets = true;
      }
      return;
    }
    finally {}
  }
  
  @SuppressLint({"InvalidAccessToGuardedField"})
  private void logStats()
  {
    if (FLog.isLoggable(2)) {
      FLog.v(TAG, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(mUsed.mCount), Integer.valueOf(mUsed.mNumBytes), Integer.valueOf(mFree.mCount), Integer.valueOf(mFree.mNumBytes));
    }
  }
  
  public abstract V alloc(int paramInt);
  
  @VisibleForTesting
  public boolean canAllocate(int paramInt)
  {
    try
    {
      PoolParams localPoolParams = mPoolParams;
      int i = maxSizeHardCap;
      int j = mUsed.mNumBytes;
      if (paramInt > i - j)
      {
        mPoolStatsTracker.onHardCapReached();
        return false;
      }
      int k = maxSizeSoftCap;
      if (paramInt > k - (j + mFree.mNumBytes)) {
        trimToSize(k - paramInt);
      }
      if (paramInt > i - (mUsed.mNumBytes + mFree.mNumBytes))
      {
        mPoolStatsTracker.onHardCapReached();
        return false;
      }
      return true;
    }
    finally {}
  }
  
  @VisibleForTesting
  public abstract void free(V paramV);
  
  /* Error */
  public V get(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 202	com/facebook/imagepipeline/memory/BasePool:ensurePoolSizeInvariant	()V
    //   4: aload_0
    //   5: iload_1
    //   6: invokevirtual 205	com/facebook/imagepipeline/memory/BasePool:getBucketedSize	(I)I
    //   9: istore_1
    //   10: aload_0
    //   11: monitorenter
    //   12: aload_0
    //   13: iload_1
    //   14: invokevirtual 208	com/facebook/imagepipeline/memory/BasePool:getBucket	(I)Lcom/facebook/imagepipeline/memory/Bucket;
    //   17: astore_2
    //   18: aload_2
    //   19: ifnull +102 -> 121
    //   22: aload_2
    //   23: invokevirtual 211	com/facebook/imagepipeline/memory/Bucket:get	()Ljava/lang/Object;
    //   26: astore_3
    //   27: aload_3
    //   28: ifnull +93 -> 121
    //   31: aload_0
    //   32: getfield 97	com/facebook/imagepipeline/memory/BasePool:mInUseValues	Ljava/util/Set;
    //   35: aload_3
    //   36: invokeinterface 217 2 0
    //   41: invokestatic 116	com/facebook/common/internal/Preconditions:checkState	(Z)V
    //   44: aload_0
    //   45: aload_3
    //   46: invokevirtual 221	com/facebook/imagepipeline/memory/BasePool:getBucketedSizeForValue	(Ljava/lang/Object;)I
    //   49: istore_1
    //   50: aload_0
    //   51: iload_1
    //   52: invokevirtual 150	com/facebook/imagepipeline/memory/BasePool:getSizeInBytes	(I)I
    //   55: istore 4
    //   57: aload_0
    //   58: getfield 102	com/facebook/imagepipeline/memory/BasePool:mUsed	Lcom/facebook/imagepipeline/memory/BasePool$Counter;
    //   61: iload 4
    //   63: invokevirtual 224	com/facebook/imagepipeline/memory/BasePool$Counter:increment	(I)V
    //   66: aload_0
    //   67: getfield 100	com/facebook/imagepipeline/memory/BasePool:mFree	Lcom/facebook/imagepipeline/memory/BasePool$Counter;
    //   70: iload 4
    //   72: invokevirtual 227	com/facebook/imagepipeline/memory/BasePool$Counter:decrement	(I)V
    //   75: aload_0
    //   76: getfield 75	com/facebook/imagepipeline/memory/BasePool:mPoolStatsTracker	Lcom/facebook/imagepipeline/memory/PoolStatsTracker;
    //   79: iload 4
    //   81: invokeinterface 230 2 0
    //   86: aload_0
    //   87: invokespecial 232	com/facebook/imagepipeline/memory/BasePool:logStats	()V
    //   90: iconst_2
    //   91: invokestatic 168	com/facebook/common/logging/FLog:isLoggable	(I)Z
    //   94: ifeq +23 -> 117
    //   97: aload_0
    //   98: getfield 57	com/facebook/imagepipeline/memory/BasePool:TAG	Ljava/lang/Class;
    //   101: ldc -22
    //   103: aload_3
    //   104: invokestatic 239	java/lang/System:identityHashCode	(Ljava/lang/Object;)I
    //   107: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   110: iload_1
    //   111: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   114: invokestatic 242	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   117: aload_0
    //   118: monitorexit
    //   119: aload_3
    //   120: areturn
    //   121: aload_0
    //   122: iload_1
    //   123: invokevirtual 150	com/facebook/imagepipeline/memory/BasePool:getSizeInBytes	(I)I
    //   126: istore 4
    //   128: aload_0
    //   129: iload 4
    //   131: invokevirtual 244	com/facebook/imagepipeline/memory/BasePool:canAllocate	(I)Z
    //   134: ifeq +145 -> 279
    //   137: aload_0
    //   138: getfield 102	com/facebook/imagepipeline/memory/BasePool:mUsed	Lcom/facebook/imagepipeline/memory/BasePool$Counter;
    //   141: iload 4
    //   143: invokevirtual 224	com/facebook/imagepipeline/memory/BasePool$Counter:increment	(I)V
    //   146: aload_2
    //   147: ifnull +7 -> 154
    //   150: aload_2
    //   151: invokevirtual 247	com/facebook/imagepipeline/memory/Bucket:incrementInUseCount	()V
    //   154: aload_0
    //   155: monitorexit
    //   156: aconst_null
    //   157: astore_2
    //   158: aload_0
    //   159: iload_1
    //   160: invokevirtual 249	com/facebook/imagepipeline/memory/BasePool:alloc	(I)Ljava/lang/Object;
    //   163: astore_3
    //   164: aload_3
    //   165: astore_2
    //   166: goto +37 -> 203
    //   169: astore 5
    //   171: aload_0
    //   172: monitorenter
    //   173: aload_0
    //   174: getfield 102	com/facebook/imagepipeline/memory/BasePool:mUsed	Lcom/facebook/imagepipeline/memory/BasePool$Counter;
    //   177: iload 4
    //   179: invokevirtual 227	com/facebook/imagepipeline/memory/BasePool$Counter:decrement	(I)V
    //   182: aload_0
    //   183: iload_1
    //   184: invokevirtual 208	com/facebook/imagepipeline/memory/BasePool:getBucket	(I)Lcom/facebook/imagepipeline/memory/Bucket;
    //   187: astore_3
    //   188: aload_3
    //   189: ifnull +7 -> 196
    //   192: aload_3
    //   193: invokevirtual 252	com/facebook/imagepipeline/memory/Bucket:decrementInUseCount	()V
    //   196: aload_0
    //   197: monitorexit
    //   198: aload 5
    //   200: invokestatic 258	com/facebook/common/internal/Throwables:propagateIfPossible	(Ljava/lang/Throwable;)V
    //   203: aload_0
    //   204: monitorenter
    //   205: aload_0
    //   206: getfield 97	com/facebook/imagepipeline/memory/BasePool:mInUseValues	Ljava/util/Set;
    //   209: aload_2
    //   210: invokeinterface 217 2 0
    //   215: invokestatic 116	com/facebook/common/internal/Preconditions:checkState	(Z)V
    //   218: aload_0
    //   219: invokevirtual 261	com/facebook/imagepipeline/memory/BasePool:trimToSoftCap	()V
    //   222: aload_0
    //   223: getfield 75	com/facebook/imagepipeline/memory/BasePool:mPoolStatsTracker	Lcom/facebook/imagepipeline/memory/PoolStatsTracker;
    //   226: iload 4
    //   228: invokeinterface 264 2 0
    //   233: aload_0
    //   234: invokespecial 232	com/facebook/imagepipeline/memory/BasePool:logStats	()V
    //   237: iconst_2
    //   238: invokestatic 168	com/facebook/common/logging/FLog:isLoggable	(I)Z
    //   241: ifeq +24 -> 265
    //   244: aload_0
    //   245: getfield 57	com/facebook/imagepipeline/memory/BasePool:TAG	Ljava/lang/Class;
    //   248: ldc_w 266
    //   251: aload_2
    //   252: invokestatic 239	java/lang/System:identityHashCode	(Ljava/lang/Object;)I
    //   255: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   258: iload_1
    //   259: invokestatic 179	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   262: invokestatic 242	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    //   265: aload_0
    //   266: monitorexit
    //   267: aload_2
    //   268: areturn
    //   269: astore_2
    //   270: aload_0
    //   271: monitorexit
    //   272: aload_2
    //   273: athrow
    //   274: astore_2
    //   275: aload_0
    //   276: monitorexit
    //   277: aload_2
    //   278: athrow
    //   279: new 18	com/facebook/imagepipeline/memory/BasePool$PoolSizeViolationException
    //   282: astore_2
    //   283: aload_2
    //   284: aload_0
    //   285: getfield 71	com/facebook/imagepipeline/memory/BasePool:mPoolParams	Lcom/facebook/imagepipeline/memory/PoolParams;
    //   288: getfield 189	com/facebook/imagepipeline/memory/PoolParams:maxSizeHardCap	I
    //   291: aload_0
    //   292: getfield 102	com/facebook/imagepipeline/memory/BasePool:mUsed	Lcom/facebook/imagepipeline/memory/BasePool$Counter;
    //   295: getfield 112	com/facebook/imagepipeline/memory/BasePool$Counter:mNumBytes	I
    //   298: aload_0
    //   299: getfield 100	com/facebook/imagepipeline/memory/BasePool:mFree	Lcom/facebook/imagepipeline/memory/BasePool$Counter;
    //   302: getfield 112	com/facebook/imagepipeline/memory/BasePool$Counter:mNumBytes	I
    //   305: iload 4
    //   307: invokespecial 269	com/facebook/imagepipeline/memory/BasePool$PoolSizeViolationException:<init>	(IIII)V
    //   310: aload_2
    //   311: athrow
    //   312: astore_2
    //   313: aload_0
    //   314: monitorexit
    //   315: aload_2
    //   316: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	317	0	this	BasePool
    //   0	317	1	paramInt	int
    //   17	251	2	localObject1	Object
    //   269	4	2	localObject2	Object
    //   274	4	2	localObject3	Object
    //   282	29	2	localPoolSizeViolationException	PoolSizeViolationException
    //   312	4	2	localObject4	Object
    //   26	167	3	localObject5	Object
    //   55	251	4	i	int
    //   169	30	5	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   158	164	169	finally
    //   205	265	269	finally
    //   265	267	269	finally
    //   270	272	269	finally
    //   173	188	274	finally
    //   192	196	274	finally
    //   196	198	274	finally
    //   275	277	274	finally
    //   12	18	312	finally
    //   22	27	312	finally
    //   31	117	312	finally
    //   117	119	312	finally
    //   121	146	312	finally
    //   150	154	312	finally
    //   154	156	312	finally
    //   279	312	312	finally
    //   313	315	312	finally
  }
  
  @VisibleForTesting
  public Bucket<V> getBucket(int paramInt)
  {
    try
    {
      Bucket localBucket = (Bucket)mBuckets.get(paramInt);
      if ((localBucket == null) && (mAllowNewBuckets))
      {
        if (FLog.isLoggable(2)) {
          FLog.v(TAG, "creating new bucket %s", Integer.valueOf(paramInt));
        }
        localBucket = newBucket(paramInt);
        mBuckets.put(paramInt, localBucket);
        return localBucket;
      }
      return localBucket;
    }
    finally {}
  }
  
  public abstract int getBucketedSize(int paramInt);
  
  public abstract int getBucketedSizeForValue(V paramV);
  
  public abstract int getSizeInBytes(int paramInt);
  
  public Map<String, Integer> getStats()
  {
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      for (int i = 0; i < mBuckets.size(); i++)
      {
        int j = mBuckets.keyAt(i);
        Bucket localBucket = (Bucket)mBuckets.valueAt(i);
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("buckets_used_");
        localStringBuilder.append(getSizeInBytes(j));
        localHashMap.put(localStringBuilder.toString(), Integer.valueOf(localBucket.getInUseCount()));
      }
      localHashMap.put("soft_cap", Integer.valueOf(mPoolParams.maxSizeSoftCap));
      localHashMap.put("hard_cap", Integer.valueOf(mPoolParams.maxSizeHardCap));
      localHashMap.put("used_count", Integer.valueOf(mUsed.mCount));
      localHashMap.put("used_bytes", Integer.valueOf(mUsed.mNumBytes));
      localHashMap.put("free_count", Integer.valueOf(mFree.mCount));
      localHashMap.put("free_bytes", Integer.valueOf(mFree.mNumBytes));
      return localHashMap;
    }
    finally {}
  }
  
  public void initialize()
  {
    mMemoryTrimmableRegistry.registerMemoryTrimmable(this);
    mPoolStatsTracker.setBasePool(this);
  }
  
  @VisibleForTesting
  public boolean isMaxSizeSoftCapExceeded()
  {
    try
    {
      boolean bool;
      if (mUsed.mNumBytes + mFree.mNumBytes > mPoolParams.maxSizeSoftCap) {
        bool = true;
      } else {
        bool = false;
      }
      if (bool) {
        mPoolStatsTracker.onSoftCapReached();
      }
      return bool;
    }
    finally {}
  }
  
  public boolean isReusable(V paramV)
  {
    Preconditions.checkNotNull(paramV);
    return true;
  }
  
  public Bucket<V> newBucket(int paramInt)
  {
    return new Bucket(getSizeInBytes(paramInt), Integer.MAX_VALUE, 0);
  }
  
  public void onParamsChanged() {}
  
  public void release(V paramV)
  {
    Preconditions.checkNotNull(paramV);
    int i = getBucketedSizeForValue(paramV);
    int j = getSizeInBytes(i);
    try
    {
      Bucket localBucket = getBucketIfPresent(i);
      if (!mInUseValues.remove(paramV))
      {
        FLog.e(TAG, "release (free, value unrecognized) (object, size) = (%x, %s)", new Object[] { Integer.valueOf(System.identityHashCode(paramV)), Integer.valueOf(i) });
        free(paramV);
        mPoolStatsTracker.onFree(j);
      }
      else if ((localBucket != null) && (!localBucket.isMaxLengthExceeded()) && (!isMaxSizeSoftCapExceeded()) && (isReusable(paramV)))
      {
        localBucket.release(paramV);
        mFree.increment(j);
        mUsed.decrement(j);
        mPoolStatsTracker.onValueRelease(j);
        if (FLog.isLoggable(2)) {
          FLog.v(TAG, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(paramV)), Integer.valueOf(i));
        }
      }
      else
      {
        if (localBucket != null) {
          localBucket.decrementInUseCount();
        }
        if (FLog.isLoggable(2)) {
          FLog.v(TAG, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(paramV)), Integer.valueOf(i));
        }
        free(paramV);
        mUsed.decrement(j);
        mPoolStatsTracker.onFree(j);
      }
      logStats();
      return;
    }
    finally {}
  }
  
  public void trim(MemoryTrimType paramMemoryTrimType)
  {
    trimToNothing();
  }
  
  @VisibleForTesting
  public void trimToNothing()
  {
    ArrayList localArrayList = new ArrayList(mBuckets.size());
    Object localObject2 = new SparseIntArray();
    int i = 0;
    int j = 0;
    try
    {
      Bucket localBucket;
      while (j < mBuckets.size())
      {
        localBucket = (Bucket)mBuckets.valueAt(j);
        if (localBucket.getFreeListSize() > 0) {
          localArrayList.add(localBucket);
        }
        ((SparseIntArray)localObject2).put(mBuckets.keyAt(j), localBucket.getInUseCount());
        j++;
      }
      initBuckets((SparseIntArray)localObject2);
      mFree.reset();
      logStats();
      onParamsChanged();
      j = i;
      if (j < localArrayList.size())
      {
        localBucket = (Bucket)localArrayList.get(j);
        for (;;)
        {
          localObject2 = localBucket.pop();
          if (localObject2 == null)
          {
            j++;
            break;
          }
          free(localObject2);
        }
      }
      return;
    }
    finally {}
  }
  
  @VisibleForTesting
  public void trimToSize(int paramInt)
  {
    try
    {
      int i = mUsed.mNumBytes;
      int j = mFree.mNumBytes;
      j = Math.min(i + j - paramInt, j);
      if (j <= 0) {
        return;
      }
      if (FLog.isLoggable(2)) {
        FLog.v(TAG, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(paramInt), Integer.valueOf(mUsed.mNumBytes + mFree.mNumBytes), Integer.valueOf(j));
      }
      logStats();
      for (i = 0; (i < mBuckets.size()) && (j > 0); i++)
      {
        Bucket localBucket = (Bucket)mBuckets.valueAt(i);
        while (j > 0)
        {
          Object localObject2 = localBucket.pop();
          if (localObject2 == null) {
            break;
          }
          free(localObject2);
          int k = mItemSize;
          j -= k;
          mFree.decrement(k);
        }
      }
      logStats();
      if (FLog.isLoggable(2)) {
        FLog.v(TAG, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(paramInt), Integer.valueOf(mUsed.mNumBytes + mFree.mNumBytes));
      }
      return;
    }
    finally {}
  }
  
  @VisibleForTesting
  public void trimToSoftCap()
  {
    try
    {
      if (isMaxSizeSoftCapExceeded()) {
        trimToSize(mPoolParams.maxSizeSoftCap);
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @VisibleForTesting
  @NotThreadSafe
  public static class Counter
  {
    private static final String TAG = "com.facebook.imagepipeline.memory.BasePool.Counter";
    public int mCount;
    public int mNumBytes;
    
    public void decrement(int paramInt)
    {
      int i = mNumBytes;
      if (i >= paramInt)
      {
        int j = mCount;
        if (j > 0)
        {
          mCount = (j - 1);
          mNumBytes = (i - paramInt);
          return;
        }
      }
      FLog.wtf("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(mNumBytes), Integer.valueOf(mCount) });
    }
    
    public void increment(int paramInt)
    {
      mCount += 1;
      mNumBytes += paramInt;
    }
    
    public void reset()
    {
      mCount = 0;
      mNumBytes = 0;
    }
  }
  
  public static class InvalidSizeException
    extends RuntimeException
  {
    public InvalidSizeException(Object paramObject)
    {
      super();
    }
  }
  
  public static class InvalidValueException
    extends RuntimeException
  {
    public InvalidValueException(Object paramObject)
    {
      super();
    }
  }
  
  public static class PoolSizeViolationException
    extends RuntimeException
  {
    public PoolSizeViolationException(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      super();
    }
  }
  
  public static class SizeTooLargeException
    extends BasePool.InvalidSizeException
  {
    public SizeTooLargeException(Object paramObject)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.BasePool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */