package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class AssetDataSource
  extends BaseDataSource
{
  private final AssetManager assetManager;
  private long bytesRemaining;
  @Nullable
  private InputStream inputStream;
  private boolean opened;
  @Nullable
  private Uri uri;
  
  public AssetDataSource(Context paramContext)
  {
    super(false);
    assetManager = paramContext.getAssets();
  }
  
  @Deprecated
  public AssetDataSource(Context paramContext, @Nullable TransferListener paramTransferListener)
  {
    this(paramContext);
    if (paramTransferListener != null) {
      addTransferListener(paramTransferListener);
    }
  }
  
  /* Error */
  public void close()
    throws AssetDataSource.AssetDataSourceException
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 48	com/google/android/exoplayer2/upstream/AssetDataSource:uri	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 50	com/google/android/exoplayer2/upstream/AssetDataSource:inputStream	Ljava/io/InputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 54	java/io/InputStream:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 50	com/google/android/exoplayer2/upstream/AssetDataSource:inputStream	Ljava/io/InputStream;
    //   23: aload_0
    //   24: getfield 56	com/google/android/exoplayer2/upstream/AssetDataSource:opened	Z
    //   27: ifeq +12 -> 39
    //   30: aload_0
    //   31: iconst_0
    //   32: putfield 56	com/google/android/exoplayer2/upstream/AssetDataSource:opened	Z
    //   35: aload_0
    //   36: invokevirtual 59	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   39: return
    //   40: astore_1
    //   41: goto +15 -> 56
    //   44: astore_1
    //   45: new 6	com/google/android/exoplayer2/upstream/AssetDataSource$AssetDataSourceException
    //   48: astore_2
    //   49: aload_2
    //   50: aload_1
    //   51: invokespecial 62	com/google/android/exoplayer2/upstream/AssetDataSource$AssetDataSourceException:<init>	(Ljava/io/IOException;)V
    //   54: aload_2
    //   55: athrow
    //   56: aload_0
    //   57: aconst_null
    //   58: putfield 50	com/google/android/exoplayer2/upstream/AssetDataSource:inputStream	Ljava/io/InputStream;
    //   61: aload_0
    //   62: getfield 56	com/google/android/exoplayer2/upstream/AssetDataSource:opened	Z
    //   65: ifeq +12 -> 77
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield 56	com/google/android/exoplayer2/upstream/AssetDataSource:opened	Z
    //   73: aload_0
    //   74: invokevirtual 59	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	AssetDataSource
    //   9	6	1	localInputStream	InputStream
    //   40	1	1	localObject	Object
    //   44	34	1	localIOException	IOException
    //   48	7	2	localAssetDataSourceException	AssetDataSourceException
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
    throws AssetDataSource.AssetDataSourceException
  {
    try
    {
      Object localObject = uri;
      uri = ((Uri)localObject);
      String str = ((Uri)localObject).getPath();
      if (str.startsWith("/android_asset/"))
      {
        localObject = str.substring(15);
      }
      else
      {
        localObject = str;
        if (str.startsWith("/")) {
          localObject = str.substring(1);
        }
      }
      transferInitializing(paramDataSpec);
      localObject = assetManager.open((String)localObject, 1);
      inputStream = ((InputStream)localObject);
      if (((InputStream)localObject).skip(position) >= position)
      {
        long l = length;
        if (l != -1L)
        {
          bytesRemaining = l;
        }
        else
        {
          l = inputStream.available();
          bytesRemaining = l;
          if (l == 2147483647L) {
            bytesRemaining = -1L;
          }
        }
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
      throw new AssetDataSourceException(paramDataSpec);
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws AssetDataSource.AssetDataSourceException
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l1 = bytesRemaining;
    if (l1 == 0L) {
      return -1;
    }
    long l2;
    if (l1 != -1L) {
      l2 = paramInt2;
    }
    try
    {
      paramInt2 = (int)Math.min(l1, l2);
      paramInt1 = inputStream.read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 == -1)
      {
        if (bytesRemaining == -1L) {
          return -1;
        }
        throw new AssetDataSourceException(new EOFException());
      }
      l2 = bytesRemaining;
      if (l2 != -1L) {
        bytesRemaining = (l2 - paramInt1);
      }
      bytesTransferred(paramInt1);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new AssetDataSourceException(paramArrayOfByte);
    }
  }
  
  public static final class AssetDataSourceException
    extends IOException
  {
    public AssetDataSourceException(IOException paramIOException)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.AssetDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */