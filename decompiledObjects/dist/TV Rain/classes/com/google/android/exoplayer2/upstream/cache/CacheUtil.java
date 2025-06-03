package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.concurrent.atomic.AtomicBoolean;
import z3;

public final class CacheUtil
{
  public static final int DEFAULT_BUFFER_SIZE_BYTES = 131072;
  public static final CacheKeyFactory DEFAULT_CACHE_KEY_FACTORY = new z3(27);
  
  public static void cache(DataSpec paramDataSpec, Cache paramCache, DataSource paramDataSource, @Nullable CachingCounters paramCachingCounters, @Nullable AtomicBoolean paramAtomicBoolean)
    throws IOException, InterruptedException
  {
    cache(paramDataSpec, paramCache, new CacheDataSource(paramCache, paramDataSource), new byte[131072], null, 0, paramCachingCounters, paramAtomicBoolean, false);
  }
  
  public static void cache(DataSpec paramDataSpec, Cache paramCache, CacheDataSource paramCacheDataSource, byte[] paramArrayOfByte, PriorityTaskManager paramPriorityTaskManager, int paramInt, @Nullable CachingCounters paramCachingCounters, @Nullable AtomicBoolean paramAtomicBoolean, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    Assertions.checkNotNull(paramCacheDataSource);
    Assertions.checkNotNull(paramArrayOfByte);
    if (paramCachingCounters != null) {
      getCached(paramDataSpec, paramCache, paramCachingCounters);
    } else {
      paramCachingCounters = new CachingCounters();
    }
    String str = getKey(paramDataSpec);
    long l1 = absoluteStreamPosition;
    long l2 = length;
    if (l2 == -1L) {}
    long l4;
    for (l2 = paramCache.getContentLength(str);; l2 -= l4)
    {
      long l3 = 0L;
      if (l2 == 0L) {
        break;
      }
      throwExceptionIfInterruptedOrCancelled(paramAtomicBoolean);
      boolean bool = l2 < -1L;
      if (bool) {
        l4 = l2;
      } else {
        l4 = Long.MAX_VALUE;
      }
      l4 = paramCache.getCachedLength(str, l1, l4);
      if (l4 <= 0L)
      {
        l4 = -l4;
        if (readAndDiscard(paramDataSpec, l1, l4, paramCacheDataSource, paramArrayOfByte, paramPriorityTaskManager, paramInt, paramCachingCounters, paramAtomicBoolean) < l4)
        {
          if ((!paramBoolean) || (!bool)) {
            break;
          }
          throw new EOFException();
        }
      }
      l1 += l4;
      if (!bool) {
        l4 = l3;
      }
    }
  }
  
  public static String generateKey(Uri paramUri)
  {
    return paramUri.toString();
  }
  
  public static void getCached(DataSpec paramDataSpec, Cache paramCache, CachingCounters paramCachingCounters)
  {
    String str = getKey(paramDataSpec);
    long l1 = absoluteStreamPosition;
    long l2 = length;
    if (l2 == -1L) {
      l2 = paramCache.getContentLength(str);
    }
    contentLength = l2;
    alreadyCachedBytes = 0L;
    newlyCachedBytes = 0L;
    while (l2 != 0L)
    {
      boolean bool = l2 < -1L;
      if (bool) {
        l3 = l2;
      } else {
        l3 = Long.MAX_VALUE;
      }
      long l3 = paramCache.getCachedLength(str, l1, l3);
      if (l3 > 0L)
      {
        alreadyCachedBytes += l3;
      }
      else
      {
        long l4 = -l3;
        l3 = l4;
        if (l4 == Long.MAX_VALUE) {
          return;
        }
      }
      l1 += l3;
      if (!bool) {
        l3 = 0L;
      }
      l2 -= l3;
    }
  }
  
  public static String getKey(DataSpec paramDataSpec)
  {
    String str = key;
    if (str != null) {
      paramDataSpec = str;
    } else {
      paramDataSpec = generateKey(uri);
    }
    return paramDataSpec;
  }
  
  /* Error */
  private static long readAndDiscard(DataSpec paramDataSpec, long paramLong1, long paramLong2, DataSource paramDataSource, byte[] paramArrayOfByte, PriorityTaskManager paramPriorityTaskManager, int paramInt, CachingCounters paramCachingCounters, AtomicBoolean paramAtomicBoolean)
    throws IOException, InterruptedException
  {
    // Byte code:
    //   0: aload 7
    //   2: ifnull +10 -> 12
    //   5: aload 7
    //   7: iload 8
    //   9: invokevirtual 125	com/google/android/exoplayer2/util/PriorityTaskManager:proceed	(I)V
    //   12: aload 10
    //   14: invokestatic 78	com/google/android/exoplayer2/upstream/cache/CacheUtil:throwExceptionIfInterruptedOrCancelled	(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    //   17: new 59	com/google/android/exoplayer2/upstream/DataSpec
    //   20: astore 11
    //   22: aload_0
    //   23: getfield 116	com/google/android/exoplayer2/upstream/DataSpec:uri	Landroid/net/Uri;
    //   26: astore 12
    //   28: aload_0
    //   29: getfield 128	com/google/android/exoplayer2/upstream/DataSpec:httpMethod	I
    //   32: istore 13
    //   34: aload_0
    //   35: getfield 132	com/google/android/exoplayer2/upstream/DataSpec:httpBody	[B
    //   38: astore 14
    //   40: aload_0
    //   41: getfield 135	com/google/android/exoplayer2/upstream/DataSpec:position	J
    //   44: lstore 15
    //   46: aload_0
    //   47: getfield 63	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   50: lstore 17
    //   52: aload_0
    //   53: getfield 112	com/google/android/exoplayer2/upstream/DataSpec:key	Ljava/lang/String;
    //   56: astore 19
    //   58: aload_0
    //   59: getfield 138	com/google/android/exoplayer2/upstream/DataSpec:flags	I
    //   62: istore 20
    //   64: aload 11
    //   66: astore 21
    //   68: aload 11
    //   70: aload 12
    //   72: iload 13
    //   74: aload 14
    //   76: lload_1
    //   77: lload 15
    //   79: lload_1
    //   80: ladd
    //   81: lload 17
    //   83: lsub
    //   84: ldc2_w 67
    //   87: aload 19
    //   89: iload 20
    //   91: iconst_2
    //   92: ior
    //   93: invokespecial 141	com/google/android/exoplayer2/upstream/DataSpec:<init>	(Landroid/net/Uri;I[BJJJLjava/lang/String;I)V
    //   96: aload 5
    //   98: aload 21
    //   100: invokeinterface 147 2 0
    //   105: lstore 17
    //   107: aload 9
    //   109: getfield 102	com/google/android/exoplayer2/upstream/cache/CacheUtil$CachingCounters:contentLength	J
    //   112: ldc2_w 67
    //   115: lcmp
    //   116: ifne +25 -> 141
    //   119: lload 17
    //   121: ldc2_w 67
    //   124: lcmp
    //   125: ifeq +16 -> 141
    //   128: aload 9
    //   130: aload 21
    //   132: getfield 63	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   135: lload 17
    //   137: ladd
    //   138: putfield 102	com/google/android/exoplayer2/upstream/cache/CacheUtil$CachingCounters:contentLength	J
    //   141: lconst_0
    //   142: lstore 17
    //   144: lload 17
    //   146: lload_3
    //   147: lcmp
    //   148: ifeq +114 -> 262
    //   151: aload 10
    //   153: invokestatic 78	com/google/android/exoplayer2/upstream/cache/CacheUtil:throwExceptionIfInterruptedOrCancelled	(Ljava/util/concurrent/atomic/AtomicBoolean;)V
    //   156: lload_3
    //   157: ldc2_w 67
    //   160: lcmp
    //   161: ifeq +20 -> 181
    //   164: aload 6
    //   166: arraylength
    //   167: i2l
    //   168: lload_3
    //   169: lload 17
    //   171: lsub
    //   172: invokestatic 153	java/lang/Math:min	(JJ)J
    //   175: l2i
    //   176: istore 13
    //   178: goto +8 -> 186
    //   181: aload 6
    //   183: arraylength
    //   184: istore 13
    //   186: aload 5
    //   188: aload 6
    //   190: iconst_0
    //   191: iload 13
    //   193: invokeinterface 157 4 0
    //   198: istore 13
    //   200: iload 13
    //   202: iconst_m1
    //   203: if_icmpne +31 -> 234
    //   206: aload 9
    //   208: getfield 102	com/google/android/exoplayer2/upstream/cache/CacheUtil$CachingCounters:contentLength	J
    //   211: ldc2_w 67
    //   214: lcmp
    //   215: ifne +47 -> 262
    //   218: aload 9
    //   220: aload 21
    //   222: getfield 63	com/google/android/exoplayer2/upstream/DataSpec:absoluteStreamPosition	J
    //   225: lload 17
    //   227: ladd
    //   228: putfield 102	com/google/android/exoplayer2/upstream/cache/CacheUtil$CachingCounters:contentLength	J
    //   231: goto +31 -> 262
    //   234: iload 13
    //   236: i2l
    //   237: lstore 15
    //   239: lload 17
    //   241: lload 15
    //   243: ladd
    //   244: lstore 17
    //   246: aload 9
    //   248: aload 9
    //   250: getfield 108	com/google/android/exoplayer2/upstream/cache/CacheUtil$CachingCounters:newlyCachedBytes	J
    //   253: lload 15
    //   255: ladd
    //   256: putfield 108	com/google/android/exoplayer2/upstream/cache/CacheUtil$CachingCounters:newlyCachedBytes	J
    //   259: goto -115 -> 144
    //   262: aload 5
    //   264: invokestatic 163	com/google/android/exoplayer2/util/Util:closeQuietly	(Lcom/google/android/exoplayer2/upstream/DataSource;)V
    //   267: lload 17
    //   269: lreturn
    //   270: astore 21
    //   272: goto +13 -> 285
    //   275: astore_0
    //   276: aload 5
    //   278: invokestatic 163	com/google/android/exoplayer2/util/Util:closeQuietly	(Lcom/google/android/exoplayer2/upstream/DataSource;)V
    //   281: aload_0
    //   282: athrow
    //   283: astore 21
    //   285: aload 5
    //   287: invokestatic 163	com/google/android/exoplayer2/util/Util:closeQuietly	(Lcom/google/android/exoplayer2/upstream/DataSource;)V
    //   290: goto -290 -> 0
    //   293: astore_0
    //   294: aload 21
    //   296: astore_0
    //   297: goto -12 -> 285
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	300	0	paramDataSpec	DataSpec
    //   0	300	1	paramLong1	long
    //   0	300	3	paramLong2	long
    //   0	300	5	paramDataSource	DataSource
    //   0	300	6	paramArrayOfByte	byte[]
    //   0	300	7	paramPriorityTaskManager	PriorityTaskManager
    //   0	300	8	paramInt	int
    //   0	300	9	paramCachingCounters	CachingCounters
    //   0	300	10	paramAtomicBoolean	AtomicBoolean
    //   20	49	11	localDataSpec1	DataSpec
    //   26	45	12	localUri	Uri
    //   32	203	13	i	int
    //   38	37	14	arrayOfByte	byte[]
    //   44	210	15	l1	long
    //   50	218	17	l2	long
    //   56	32	19	str	String
    //   62	31	20	j	int
    //   66	155	21	localDataSpec2	DataSpec
    //   270	1	21	localPriorityTooLowException1	com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException
    //   283	12	21	localPriorityTooLowException2	com.google.android.exoplayer2.util.PriorityTaskManager.PriorityTooLowException
    // Exception table:
    //   from	to	target	type
    //   68	96	270	com/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException
    //   12	64	275	finally
    //   68	96	275	finally
    //   96	119	275	finally
    //   128	141	275	finally
    //   151	156	275	finally
    //   164	178	275	finally
    //   181	186	275	finally
    //   186	200	275	finally
    //   206	231	275	finally
    //   246	259	275	finally
    //   12	64	283	com/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException
    //   96	119	293	com/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException
    //   128	141	293	com/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException
    //   151	156	293	com/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException
    //   164	178	293	com/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException
    //   181	186	293	com/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException
    //   186	200	293	com/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException
    //   206	231	293	com/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException
    //   246	259	293	com/google/android/exoplayer2/util/PriorityTaskManager$PriorityTooLowException
  }
  
  public static void remove(Cache paramCache, String paramString)
  {
    paramString = paramCache.getCachedSpans(paramString).iterator();
    for (;;)
    {
      CacheSpan localCacheSpan;
      if (paramString.hasNext()) {
        localCacheSpan = (CacheSpan)paramString.next();
      }
      try
      {
        paramCache.removeSpan(localCacheSpan);
      }
      catch (Cache.CacheException localCacheException) {}
      return;
    }
  }
  
  private static void throwExceptionIfInterruptedOrCancelled(AtomicBoolean paramAtomicBoolean)
    throws InterruptedException
  {
    if ((!Thread.interrupted()) && ((paramAtomicBoolean == null) || (!paramAtomicBoolean.get()))) {
      return;
    }
    throw new InterruptedException();
  }
  
  public static class CachingCounters
  {
    public volatile long alreadyCachedBytes;
    public volatile long contentLength = -1L;
    public volatile long newlyCachedBytes;
    
    public long totalCachedBytes()
    {
      return alreadyCachedBytes + newlyCachedBytes;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CacheUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */