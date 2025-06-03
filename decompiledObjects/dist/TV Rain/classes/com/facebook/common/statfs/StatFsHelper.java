package com.facebook.common.statfs;

import android.annotation.SuppressLint;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class StatFsHelper
{
  private static final long RESTAT_INTERVAL_MS = TimeUnit.MINUTES.toMillis(2L);
  private static StatFsHelper sStatsFsHelper;
  private final Lock lock = new ReentrantLock();
  private volatile File mExternalPath;
  private volatile StatFs mExternalStatFs = null;
  private volatile boolean mInitialized = false;
  private volatile File mInternalPath;
  private volatile StatFs mInternalStatFs = null;
  @GuardedBy("lock")
  private long mLastRestatTime;
  
  public static StatFs createStatFs(String paramString)
  {
    return new StatFs(paramString);
  }
  
  /* Error */
  private void ensureInitialized()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 51	com/facebook/common/statfs/StatFsHelper:mInitialized	Z
    //   4: ifne +66 -> 70
    //   7: aload_0
    //   8: getfield 56	com/facebook/common/statfs/StatFsHelper:lock	Ljava/util/concurrent/locks/Lock;
    //   11: invokeinterface 68 1 0
    //   16: aload_0
    //   17: getfield 51	com/facebook/common/statfs/StatFsHelper:mInitialized	Z
    //   20: ifne +26 -> 46
    //   23: aload_0
    //   24: invokestatic 74	android/os/Environment:getDataDirectory	()Ljava/io/File;
    //   27: putfield 76	com/facebook/common/statfs/StatFsHelper:mInternalPath	Ljava/io/File;
    //   30: aload_0
    //   31: invokestatic 79	android/os/Environment:getExternalStorageDirectory	()Ljava/io/File;
    //   34: putfield 81	com/facebook/common/statfs/StatFsHelper:mExternalPath	Ljava/io/File;
    //   37: aload_0
    //   38: invokespecial 84	com/facebook/common/statfs/StatFsHelper:updateStats	()V
    //   41: aload_0
    //   42: iconst_1
    //   43: putfield 51	com/facebook/common/statfs/StatFsHelper:mInitialized	Z
    //   46: aload_0
    //   47: getfield 56	com/facebook/common/statfs/StatFsHelper:lock	Ljava/util/concurrent/locks/Lock;
    //   50: invokeinterface 87 1 0
    //   55: goto +15 -> 70
    //   58: astore_1
    //   59: aload_0
    //   60: getfield 56	com/facebook/common/statfs/StatFsHelper:lock	Ljava/util/concurrent/locks/Lock;
    //   63: invokeinterface 87 1 0
    //   68: aload_1
    //   69: athrow
    //   70: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	StatFsHelper
    //   58	11	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   16	46	58	finally
  }
  
  public static StatFsHelper getInstance()
  {
    try
    {
      if (sStatsFsHelper == null)
      {
        localStatFsHelper = new com/facebook/common/statfs/StatFsHelper;
        localStatFsHelper.<init>();
        sStatsFsHelper = localStatFsHelper;
      }
      StatFsHelper localStatFsHelper = sStatsFsHelper;
      return localStatFsHelper;
    }
    finally {}
  }
  
  /* Error */
  private void maybeUpdateStats()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	com/facebook/common/statfs/StatFsHelper:lock	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 97 1 0
    //   9: ifeq +46 -> 55
    //   12: invokestatic 103	android/os/SystemClock:uptimeMillis	()J
    //   15: aload_0
    //   16: getfield 105	com/facebook/common/statfs/StatFsHelper:mLastRestatTime	J
    //   19: lsub
    //   20: getstatic 41	com/facebook/common/statfs/StatFsHelper:RESTAT_INTERVAL_MS	J
    //   23: lcmp
    //   24: ifle +7 -> 31
    //   27: aload_0
    //   28: invokespecial 84	com/facebook/common/statfs/StatFsHelper:updateStats	()V
    //   31: aload_0
    //   32: getfield 56	com/facebook/common/statfs/StatFsHelper:lock	Ljava/util/concurrent/locks/Lock;
    //   35: invokeinterface 87 1 0
    //   40: goto +15 -> 55
    //   43: astore_1
    //   44: aload_0
    //   45: getfield 56	com/facebook/common/statfs/StatFsHelper:lock	Ljava/util/concurrent/locks/Lock;
    //   48: invokeinterface 87 1 0
    //   53: aload_1
    //   54: athrow
    //   55: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	56	0	this	StatFsHelper
    //   43	11	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   12	31	43	finally
  }
  
  @GuardedBy("lock")
  private void updateStats()
  {
    mInternalStatFs = updateStatsHelper(mInternalStatFs, mInternalPath);
    mExternalStatFs = updateStatsHelper(mExternalStatFs, mExternalPath);
    mLastRestatTime = SystemClock.uptimeMillis();
  }
  
  private StatFs updateStatsHelper(@Nullable StatFs paramStatFs, @Nullable File paramFile)
  {
    localObject1 = null;
    localObject2 = localObject1;
    if (paramFile != null) {
      if (!paramFile.exists()) {
        localObject2 = localObject1;
      } else if (paramStatFs != null) {}
    }
    try
    {
      try
      {
        paramStatFs = createStatFs(paramFile.getAbsolutePath());
        break label45;
        paramStatFs.restat(paramFile.getAbsolutePath());
        label45:
        localObject2 = paramStatFs;
      }
      finally {}
    }
    catch (IllegalArgumentException paramStatFs)
    {
      for (;;)
      {
        localObject2 = localObject1;
      }
    }
    return (StatFs)localObject2;
  }
  
  @SuppressLint({"DeprecatedMethod"})
  public long getAvailableStorageSpace(StorageType paramStorageType)
  {
    ensureInitialized();
    maybeUpdateStats();
    if (paramStorageType == StorageType.INTERNAL) {
      paramStorageType = mInternalStatFs;
    } else {
      paramStorageType = mExternalStatFs;
    }
    if (paramStorageType != null)
    {
      long l = paramStorageType.getBlockSizeLong();
      return paramStorageType.getAvailableBlocksLong() * l;
    }
    return 0L;
  }
  
  @SuppressLint({"DeprecatedMethod"})
  public long getFreeStorageSpace(StorageType paramStorageType)
  {
    ensureInitialized();
    maybeUpdateStats();
    if (paramStorageType == StorageType.INTERNAL) {
      paramStorageType = mInternalStatFs;
    } else {
      paramStorageType = mExternalStatFs;
    }
    if (paramStorageType != null)
    {
      long l = paramStorageType.getBlockSizeLong();
      return paramStorageType.getFreeBlocksLong() * l;
    }
    return -1L;
  }
  
  @SuppressLint({"DeprecatedMethod"})
  public long getTotalStorageSpace(StorageType paramStorageType)
  {
    ensureInitialized();
    maybeUpdateStats();
    if (paramStorageType == StorageType.INTERNAL) {
      paramStorageType = mInternalStatFs;
    } else {
      paramStorageType = mExternalStatFs;
    }
    if (paramStorageType != null)
    {
      long l = paramStorageType.getBlockSizeLong();
      return paramStorageType.getBlockCountLong() * l;
    }
    return -1L;
  }
  
  /* Error */
  public void resetStats()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	com/facebook/common/statfs/StatFsHelper:lock	Ljava/util/concurrent/locks/Lock;
    //   4: invokeinterface 97 1 0
    //   9: ifeq +35 -> 44
    //   12: aload_0
    //   13: invokespecial 140	com/facebook/common/statfs/StatFsHelper:ensureInitialized	()V
    //   16: aload_0
    //   17: invokespecial 84	com/facebook/common/statfs/StatFsHelper:updateStats	()V
    //   20: aload_0
    //   21: getfield 56	com/facebook/common/statfs/StatFsHelper:lock	Ljava/util/concurrent/locks/Lock;
    //   24: invokeinterface 87 1 0
    //   29: goto +15 -> 44
    //   32: astore_1
    //   33: aload_0
    //   34: getfield 56	com/facebook/common/statfs/StatFsHelper:lock	Ljava/util/concurrent/locks/Lock;
    //   37: invokeinterface 87 1 0
    //   42: aload_1
    //   43: athrow
    //   44: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	StatFsHelper
    //   32	11	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   12	20	32	finally
  }
  
  public boolean testLowDiskSpace(StorageType paramStorageType, long paramLong)
  {
    ensureInitialized();
    long l = getAvailableStorageSpace(paramStorageType);
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (l > 0L) {
      if (l < paramLong) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public static enum StorageType
  {
    static
    {
      StorageType localStorageType1 = new StorageType("INTERNAL", 0);
      INTERNAL = localStorageType1;
      StorageType localStorageType2 = new StorageType("EXTERNAL", 1);
      EXTERNAL = localStorageType2;
      $VALUES = new StorageType[] { localStorageType1, localStorageType2 };
    }
    
    private StorageType() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.statfs.StatFsHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */