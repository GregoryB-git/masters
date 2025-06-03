package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ReusableBufferedOutputStream;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class CacheDataSink
  implements DataSink
{
  public static final int DEFAULT_BUFFER_SIZE = 20480;
  private final int bufferSize;
  private ReusableBufferedOutputStream bufferedOutputStream;
  private final Cache cache;
  private DataSpec dataSpec;
  private long dataSpecBytesWritten;
  private File file;
  private final long maxCacheFileSize;
  private OutputStream outputStream;
  private long outputStreamBytesWritten;
  private final boolean syncFileDescriptor;
  private FileOutputStream underlyingFileOutputStream;
  
  public CacheDataSink(Cache paramCache, long paramLong)
  {
    this(paramCache, paramLong, 20480, true);
  }
  
  public CacheDataSink(Cache paramCache, long paramLong, int paramInt)
  {
    this(paramCache, paramLong, paramInt, true);
  }
  
  public CacheDataSink(Cache paramCache, long paramLong, int paramInt, boolean paramBoolean)
  {
    cache = ((Cache)Assertions.checkNotNull(paramCache));
    maxCacheFileSize = paramLong;
    bufferSize = paramInt;
    syncFileDescriptor = paramBoolean;
  }
  
  public CacheDataSink(Cache paramCache, long paramLong, boolean paramBoolean)
  {
    this(paramCache, paramLong, 20480, paramBoolean);
  }
  
  private void closeCurrentOutputStream()
    throws IOException
  {
    Object localObject1 = outputStream;
    if (localObject1 == null) {
      return;
    }
    try
    {
      ((OutputStream)localObject1).flush();
      if (syncFileDescriptor) {
        underlyingFileOutputStream.getFD().sync();
      }
      Util.closeQuietly(outputStream);
      outputStream = null;
      localObject1 = file;
      file = null;
      cache.commitFile((File)localObject1);
      return;
    }
    finally
    {
      Util.closeQuietly(outputStream);
      outputStream = null;
      localObject1 = file;
      file = null;
      ((File)localObject1).delete();
    }
  }
  
  private void openNextOutputStream()
    throws IOException
  {
    long l1 = dataSpec.length;
    if (l1 == -1L) {
      l1 = maxCacheFileSize;
    } else {
      l1 = Math.min(l1 - dataSpecBytesWritten, maxCacheFileSize);
    }
    Cache localCache = cache;
    Object localObject1 = dataSpec;
    Object localObject2 = key;
    long l2 = absoluteStreamPosition;
    file = localCache.startFile((String)localObject2, dataSpecBytesWritten + l2, l1);
    localObject1 = new FileOutputStream(file);
    underlyingFileOutputStream = ((FileOutputStream)localObject1);
    if (bufferSize > 0)
    {
      localObject2 = bufferedOutputStream;
      if (localObject2 == null) {
        bufferedOutputStream = new ReusableBufferedOutputStream(underlyingFileOutputStream, bufferSize);
      } else {
        ((ReusableBufferedOutputStream)localObject2).reset((OutputStream)localObject1);
      }
      outputStream = bufferedOutputStream;
    }
    else
    {
      outputStream = ((OutputStream)localObject1);
    }
    outputStreamBytesWritten = 0L;
  }
  
  public void close()
    throws CacheDataSink.CacheDataSinkException
  {
    if (dataSpec == null) {
      return;
    }
    try
    {
      closeCurrentOutputStream();
      return;
    }
    catch (IOException localIOException)
    {
      throw new CacheDataSinkException(localIOException);
    }
  }
  
  public void open(DataSpec paramDataSpec)
    throws CacheDataSink.CacheDataSinkException
  {
    if ((length == -1L) && (!paramDataSpec.isFlagSet(2)))
    {
      dataSpec = null;
      return;
    }
    dataSpec = paramDataSpec;
    dataSpecBytesWritten = 0L;
    try
    {
      openNextOutputStream();
      return;
    }
    catch (IOException paramDataSpec)
    {
      throw new CacheDataSinkException(paramDataSpec);
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws CacheDataSink.CacheDataSinkException
  {
    if (dataSpec == null) {
      return;
    }
    int i = 0;
    while (i < paramInt2) {
      try
      {
        if (outputStreamBytesWritten == maxCacheFileSize)
        {
          closeCurrentOutputStream();
          openNextOutputStream();
        }
        int j = (int)Math.min(paramInt2 - i, maxCacheFileSize - outputStreamBytesWritten);
        outputStream.write(paramArrayOfByte, paramInt1 + i, j);
        i += j;
        long l1 = outputStreamBytesWritten;
        long l2 = j;
        outputStreamBytesWritten = (l1 + l2);
        dataSpecBytesWritten += l2;
      }
      catch (IOException paramArrayOfByte)
      {
        throw new CacheDataSinkException(paramArrayOfByte);
      }
    }
  }
  
  public static class CacheDataSinkException
    extends Cache.CacheException
  {
    public CacheDataSinkException(IOException paramIOException)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CacheDataSink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */