package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileDataSource
  extends BaseDataSource
{
  private long bytesRemaining;
  @Nullable
  private RandomAccessFile file;
  private boolean opened;
  @Nullable
  private Uri uri;
  
  public FileDataSource()
  {
    super(false);
  }
  
  @Deprecated
  public FileDataSource(@Nullable TransferListener paramTransferListener)
  {
    this();
    if (paramTransferListener != null) {
      addTransferListener(paramTransferListener);
    }
  }
  
  /* Error */
  public void close()
    throws FileDataSource.FileDataSourceException
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 36	com/google/android/exoplayer2/upstream/FileDataSource:uri	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 38	com/google/android/exoplayer2/upstream/FileDataSource:file	Ljava/io/RandomAccessFile;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 42	java/io/RandomAccessFile:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 38	com/google/android/exoplayer2/upstream/FileDataSource:file	Ljava/io/RandomAccessFile;
    //   23: aload_0
    //   24: getfield 44	com/google/android/exoplayer2/upstream/FileDataSource:opened	Z
    //   27: ifeq +12 -> 39
    //   30: aload_0
    //   31: iconst_0
    //   32: putfield 44	com/google/android/exoplayer2/upstream/FileDataSource:opened	Z
    //   35: aload_0
    //   36: invokevirtual 47	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   39: return
    //   40: astore_1
    //   41: goto +15 -> 56
    //   44: astore_2
    //   45: new 6	com/google/android/exoplayer2/upstream/FileDataSource$FileDataSourceException
    //   48: astore_1
    //   49: aload_1
    //   50: aload_2
    //   51: invokespecial 50	com/google/android/exoplayer2/upstream/FileDataSource$FileDataSourceException:<init>	(Ljava/io/IOException;)V
    //   54: aload_1
    //   55: athrow
    //   56: aload_0
    //   57: aconst_null
    //   58: putfield 38	com/google/android/exoplayer2/upstream/FileDataSource:file	Ljava/io/RandomAccessFile;
    //   61: aload_0
    //   62: getfield 44	com/google/android/exoplayer2/upstream/FileDataSource:opened	Z
    //   65: ifeq +12 -> 77
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield 44	com/google/android/exoplayer2/upstream/FileDataSource:opened	Z
    //   73: aload_0
    //   74: invokevirtual 47	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	FileDataSource
    //   9	6	1	localRandomAccessFile	RandomAccessFile
    //   40	1	1	localObject	Object
    //   48	30	1	localFileDataSourceException	FileDataSourceException
    //   44	7	2	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   5	10	40	finally
    //   14	18	40	finally
    //   45	56	40	finally
    //   5	10	44	java/io/IOException
    //   14	18	44	java/io/IOException
  }
  
  @Nullable
  public Uri getUri()
  {
    return uri;
  }
  
  public long open(DataSpec paramDataSpec)
    throws FileDataSource.FileDataSourceException
  {
    try
    {
      uri = uri;
      transferInitializing(paramDataSpec);
      RandomAccessFile localRandomAccessFile = new java/io/RandomAccessFile;
      localRandomAccessFile.<init>(uri.getPath(), "r");
      file = localRandomAccessFile;
      localRandomAccessFile.seek(position);
      long l1 = length;
      long l2 = l1;
      if (l1 == -1L) {
        l2 = file.length() - position;
      }
      bytesRemaining = l2;
      if (l2 >= 0L)
      {
        opened = true;
        transferStarted(paramDataSpec);
        return bytesRemaining;
      }
      paramDataSpec = new java/io/EOFException;
      paramDataSpec.<init>();
      throw paramDataSpec;
    }
    catch (IOException paramDataSpec)
    {
      throw new FileDataSourceException(paramDataSpec);
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws FileDataSource.FileDataSourceException
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l = bytesRemaining;
    if (l == 0L) {
      return -1;
    }
    try
    {
      paramInt1 = file.read(paramArrayOfByte, paramInt1, (int)Math.min(l, paramInt2));
      if (paramInt1 > 0)
      {
        bytesRemaining -= paramInt1;
        bytesTransferred(paramInt1);
      }
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new FileDataSourceException(paramArrayOfByte);
    }
  }
  
  public static class FileDataSourceException
    extends IOException
  {
    public FileDataSourceException(IOException paramIOException)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.FileDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */