package com.facebook.imagepipeline.cache;

import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.cache.common.WriterCallback;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteStreams;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class BufferedDiskCache
{
  private static final Class<?> TAG = BufferedDiskCache.class;
  private final FileCache mFileCache;
  private final ImageCacheStatsTracker mImageCacheStatsTracker;
  private final PooledByteBufferFactory mPooledByteBufferFactory;
  private final PooledByteStreams mPooledByteStreams;
  private final Executor mReadExecutor;
  private final StagingArea mStagingArea;
  private final Executor mWriteExecutor;
  
  public BufferedDiskCache(FileCache paramFileCache, PooledByteBufferFactory paramPooledByteBufferFactory, PooledByteStreams paramPooledByteStreams, Executor paramExecutor1, Executor paramExecutor2, ImageCacheStatsTracker paramImageCacheStatsTracker)
  {
    mFileCache = paramFileCache;
    mPooledByteBufferFactory = paramPooledByteBufferFactory;
    mPooledByteStreams = paramPooledByteStreams;
    mReadExecutor = paramExecutor1;
    mWriteExecutor = paramExecutor2;
    mImageCacheStatsTracker = paramImageCacheStatsTracker;
    mStagingArea = StagingArea.getInstance();
  }
  
  private boolean checkInStagingAreaAndFileCache(CacheKey paramCacheKey)
  {
    EncodedImage localEncodedImage = mStagingArea.get(paramCacheKey);
    if (localEncodedImage != null)
    {
      localEncodedImage.close();
      FLog.v(TAG, "Found image for %s in staging area", paramCacheKey.getUriString());
      mImageCacheStatsTracker.onStagingAreaHit(paramCacheKey);
      return true;
    }
    FLog.v(TAG, "Did not find image for %s in staging area", paramCacheKey.getUriString());
    mImageCacheStatsTracker.onStagingAreaMiss();
    try
    {
      boolean bool = mFileCache.hasKey(paramCacheKey);
      return bool;
    }
    catch (Exception paramCacheKey) {}
    return false;
  }
  
  private Task<Boolean> containsAsync(CacheKey paramCacheKey)
  {
    try
    {
      Object localObject = new com/facebook/imagepipeline/cache/BufferedDiskCache$1;
      ((1)localObject).<init>(this, paramCacheKey);
      localObject = Task.call((Callable)localObject, mReadExecutor);
      return (Task<Boolean>)localObject;
    }
    catch (Exception localException)
    {
      FLog.w(TAG, localException, "Failed to schedule disk-cache read for %s", new Object[] { paramCacheKey.getUriString() });
      return Task.forError(localException);
    }
  }
  
  private Task<EncodedImage> foundPinnedImage(CacheKey paramCacheKey, EncodedImage paramEncodedImage)
  {
    FLog.v(TAG, "Found image for %s in staging area", paramCacheKey.getUriString());
    mImageCacheStatsTracker.onStagingAreaHit(paramCacheKey);
    return Task.forResult(paramEncodedImage);
  }
  
  private Task<EncodedImage> getAsync(CacheKey paramCacheKey, AtomicBoolean paramAtomicBoolean)
  {
    try
    {
      Callable local2 = new com/facebook/imagepipeline/cache/BufferedDiskCache$2;
      local2.<init>(this, paramAtomicBoolean, paramCacheKey);
      paramAtomicBoolean = Task.call(local2, mReadExecutor);
      return paramAtomicBoolean;
    }
    catch (Exception paramAtomicBoolean)
    {
      FLog.w(TAG, paramAtomicBoolean, "Failed to schedule disk-cache read for %s", new Object[] { paramCacheKey.getUriString() });
    }
    return Task.forError(paramAtomicBoolean);
  }
  
  /* Error */
  private com.facebook.common.memory.PooledByteBuffer readFromDiskCache(CacheKey paramCacheKey)
    throws IOException
  {
    // Byte code:
    //   0: getstatic 36	com/facebook/imagepipeline/cache/BufferedDiskCache:TAG	Ljava/lang/Class;
    //   3: astore_2
    //   4: aload_2
    //   5: ldc -85
    //   7: aload_1
    //   8: invokeinterface 111 1 0
    //   13: invokestatic 117	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    //   16: aload_0
    //   17: getfield 43	com/facebook/imagepipeline/cache/BufferedDiskCache:mFileCache	Lcom/facebook/cache/disk/FileCache;
    //   20: aload_1
    //   21: invokeinterface 175 2 0
    //   26: astore_3
    //   27: aload_3
    //   28: ifnonnull +26 -> 54
    //   31: aload_2
    //   32: ldc -79
    //   34: aload_1
    //   35: invokeinterface 111 1 0
    //   40: invokestatic 117	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    //   43: aload_0
    //   44: getfield 53	com/facebook/imagepipeline/cache/BufferedDiskCache:mImageCacheStatsTracker	Lcom/facebook/imagepipeline/cache/ImageCacheStatsTracker;
    //   47: invokeinterface 180 1 0
    //   52: aconst_null
    //   53: areturn
    //   54: aload_2
    //   55: ldc -74
    //   57: aload_1
    //   58: invokeinterface 111 1 0
    //   63: invokestatic 117	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    //   66: aload_0
    //   67: getfield 53	com/facebook/imagepipeline/cache/BufferedDiskCache:mImageCacheStatsTracker	Lcom/facebook/imagepipeline/cache/ImageCacheStatsTracker;
    //   70: invokeinterface 185 1 0
    //   75: aload_3
    //   76: invokeinterface 191 1 0
    //   81: astore 4
    //   83: aload_0
    //   84: getfield 45	com/facebook/imagepipeline/cache/BufferedDiskCache:mPooledByteBufferFactory	Lcom/facebook/common/memory/PooledByteBufferFactory;
    //   87: aload 4
    //   89: aload_3
    //   90: invokeinterface 195 1 0
    //   95: l2i
    //   96: invokeinterface 201 3 0
    //   101: astore_3
    //   102: aload 4
    //   104: invokevirtual 204	java/io/InputStream:close	()V
    //   107: aload_2
    //   108: ldc -50
    //   110: aload_1
    //   111: invokeinterface 111 1 0
    //   116: invokestatic 117	com/facebook/common/logging/FLog:v	(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    //   119: aload_3
    //   120: areturn
    //   121: astore_2
    //   122: aload 4
    //   124: invokevirtual 204	java/io/InputStream:close	()V
    //   127: aload_2
    //   128: athrow
    //   129: astore 4
    //   131: getstatic 36	com/facebook/imagepipeline/cache/BufferedDiskCache:TAG	Ljava/lang/Class;
    //   134: aload 4
    //   136: ldc -48
    //   138: iconst_1
    //   139: anewarray 4	java/lang/Object
    //   142: dup
    //   143: iconst_0
    //   144: aload_1
    //   145: invokeinterface 111 1 0
    //   150: aastore
    //   151: invokestatic 150	com/facebook/common/logging/FLog:w	(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   154: aload_0
    //   155: getfield 53	com/facebook/imagepipeline/cache/BufferedDiskCache:mImageCacheStatsTracker	Lcom/facebook/imagepipeline/cache/ImageCacheStatsTracker;
    //   158: invokeinterface 211 1 0
    //   163: aload 4
    //   165: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	166	0	this	BufferedDiskCache
    //   0	166	1	paramCacheKey	CacheKey
    //   3	105	2	localClass	Class
    //   121	7	2	localObject1	Object
    //   26	94	3	localObject2	Object
    //   81	42	4	localInputStream	java.io.InputStream
    //   129	35	4	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   83	102	121	finally
    //   0	27	129	java/io/IOException
    //   31	52	129	java/io/IOException
    //   54	83	129	java/io/IOException
    //   102	119	129	java/io/IOException
    //   122	129	129	java/io/IOException
  }
  
  private void writeToDiskCache(CacheKey paramCacheKey, EncodedImage paramEncodedImage)
  {
    Class localClass = TAG;
    FLog.v(localClass, "About to write to disk-cache for key %s", paramCacheKey.getUriString());
    try
    {
      FileCache localFileCache = mFileCache;
      WriterCallback local6 = new com/facebook/imagepipeline/cache/BufferedDiskCache$6;
      local6.<init>(this, paramEncodedImage);
      localFileCache.insert(paramCacheKey, local6);
      FLog.v(localClass, "Successful disk-cache write for key %s", paramCacheKey.getUriString());
    }
    catch (IOException paramEncodedImage)
    {
      FLog.w(TAG, paramEncodedImage, "Failed to write to disk-cache for key %s", new Object[] { paramCacheKey.getUriString() });
    }
  }
  
  public Task<Void> clearAll()
  {
    mStagingArea.clearAll();
    try
    {
      Object localObject = new com/facebook/imagepipeline/cache/BufferedDiskCache$5;
      ((5)localObject).<init>(this);
      localObject = Task.call((Callable)localObject, mWriteExecutor);
      return (Task<Void>)localObject;
    }
    catch (Exception localException)
    {
      FLog.w(TAG, localException, "Failed to schedule disk-cache clear", new Object[0]);
      return Task.forError(localException);
    }
  }
  
  public Task<Boolean> contains(CacheKey paramCacheKey)
  {
    if (containsSync(paramCacheKey)) {
      return Task.forResult(Boolean.TRUE);
    }
    return containsAsync(paramCacheKey);
  }
  
  public boolean containsSync(CacheKey paramCacheKey)
  {
    boolean bool;
    if ((!mStagingArea.containsKey(paramCacheKey)) && (!mFileCache.hasKeySync(paramCacheKey))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean diskCheckSync(CacheKey paramCacheKey)
  {
    if (containsSync(paramCacheKey)) {
      return true;
    }
    return checkInStagingAreaAndFileCache(paramCacheKey);
  }
  
  public Task<EncodedImage> get(CacheKey paramCacheKey, AtomicBoolean paramAtomicBoolean)
  {
    EncodedImage localEncodedImage = mStagingArea.get(paramCacheKey);
    if (localEncodedImage != null) {
      return foundPinnedImage(paramCacheKey, localEncodedImage);
    }
    return getAsync(paramCacheKey, paramAtomicBoolean);
  }
  
  public void put(CacheKey paramCacheKey, EncodedImage paramEncodedImage)
  {
    Preconditions.checkNotNull(paramCacheKey);
    Preconditions.checkArgument(EncodedImage.isValid(paramEncodedImage));
    mStagingArea.put(paramCacheKey, paramEncodedImage);
    EncodedImage localEncodedImage = EncodedImage.cloneOrNull(paramEncodedImage);
    try
    {
      Executor localExecutor = mWriteExecutor;
      Runnable local3 = new com/facebook/imagepipeline/cache/BufferedDiskCache$3;
      local3.<init>(this, paramCacheKey, localEncodedImage);
      localExecutor.execute(local3);
    }
    catch (Exception localException)
    {
      FLog.w(TAG, localException, "Failed to schedule disk-cache write for %s", new Object[] { paramCacheKey.getUriString() });
      mStagingArea.remove(paramCacheKey, paramEncodedImage);
      EncodedImage.closeSafely(localEncodedImage);
    }
  }
  
  public Task<Void> remove(CacheKey paramCacheKey)
  {
    Preconditions.checkNotNull(paramCacheKey);
    mStagingArea.remove(paramCacheKey);
    try
    {
      Object localObject = new com/facebook/imagepipeline/cache/BufferedDiskCache$4;
      ((4)localObject).<init>(this, paramCacheKey);
      localObject = Task.call((Callable)localObject, mWriteExecutor);
      return (Task<Void>)localObject;
    }
    catch (Exception localException)
    {
      FLog.w(TAG, localException, "Failed to schedule disk-cache remove for %s", new Object[] { paramCacheKey.getUriString() });
      return Task.forError(localException);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BufferedDiskCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */