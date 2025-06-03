package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class ContentDataSource
  extends BaseDataSource
{
  @Nullable
  private AssetFileDescriptor assetFileDescriptor;
  private long bytesRemaining;
  @Nullable
  private FileInputStream inputStream;
  private boolean opened;
  private final ContentResolver resolver;
  @Nullable
  private Uri uri;
  
  public ContentDataSource(Context paramContext)
  {
    super(false);
    resolver = paramContext.getContentResolver();
  }
  
  @Deprecated
  public ContentDataSource(Context paramContext, @Nullable TransferListener paramTransferListener)
  {
    this(paramContext);
    if (paramTransferListener != null) {
      addTransferListener(paramTransferListener);
    }
  }
  
  /* Error */
  public void close()
    throws ContentDataSource.ContentDataSourceException
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 50	com/google/android/exoplayer2/upstream/ContentDataSource:uri	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 52	com/google/android/exoplayer2/upstream/ContentDataSource:inputStream	Ljava/io/FileInputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 56	java/io/FileInputStream:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 52	com/google/android/exoplayer2/upstream/ContentDataSource:inputStream	Ljava/io/FileInputStream;
    //   23: aload_0
    //   24: getfield 58	com/google/android/exoplayer2/upstream/ContentDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +7 -> 36
    //   32: aload_1
    //   33: invokevirtual 61	android/content/res/AssetFileDescriptor:close	()V
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield 58	com/google/android/exoplayer2/upstream/ContentDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   41: aload_0
    //   42: getfield 63	com/google/android/exoplayer2/upstream/ContentDataSource:opened	Z
    //   45: ifeq +12 -> 57
    //   48: aload_0
    //   49: iconst_0
    //   50: putfield 63	com/google/android/exoplayer2/upstream/ContentDataSource:opened	Z
    //   53: aload_0
    //   54: invokevirtual 66	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   57: return
    //   58: astore_1
    //   59: goto +15 -> 74
    //   62: astore_2
    //   63: new 6	com/google/android/exoplayer2/upstream/ContentDataSource$ContentDataSourceException
    //   66: astore_1
    //   67: aload_1
    //   68: aload_2
    //   69: invokespecial 69	com/google/android/exoplayer2/upstream/ContentDataSource$ContentDataSourceException:<init>	(Ljava/io/IOException;)V
    //   72: aload_1
    //   73: athrow
    //   74: aload_0
    //   75: aconst_null
    //   76: putfield 58	com/google/android/exoplayer2/upstream/ContentDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   79: aload_0
    //   80: getfield 63	com/google/android/exoplayer2/upstream/ContentDataSource:opened	Z
    //   83: ifeq +12 -> 95
    //   86: aload_0
    //   87: iconst_0
    //   88: putfield 63	com/google/android/exoplayer2/upstream/ContentDataSource:opened	Z
    //   91: aload_0
    //   92: invokevirtual 66	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   95: aload_1
    //   96: athrow
    //   97: astore_2
    //   98: goto +15 -> 113
    //   101: astore_1
    //   102: new 6	com/google/android/exoplayer2/upstream/ContentDataSource$ContentDataSourceException
    //   105: astore_2
    //   106: aload_2
    //   107: aload_1
    //   108: invokespecial 69	com/google/android/exoplayer2/upstream/ContentDataSource$ContentDataSourceException:<init>	(Ljava/io/IOException;)V
    //   111: aload_2
    //   112: athrow
    //   113: aload_0
    //   114: aconst_null
    //   115: putfield 52	com/google/android/exoplayer2/upstream/ContentDataSource:inputStream	Ljava/io/FileInputStream;
    //   118: aload_0
    //   119: getfield 58	com/google/android/exoplayer2/upstream/ContentDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   122: astore_1
    //   123: aload_1
    //   124: ifnull +7 -> 131
    //   127: aload_1
    //   128: invokevirtual 61	android/content/res/AssetFileDescriptor:close	()V
    //   131: aload_0
    //   132: aconst_null
    //   133: putfield 58	com/google/android/exoplayer2/upstream/ContentDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   136: aload_0
    //   137: getfield 63	com/google/android/exoplayer2/upstream/ContentDataSource:opened	Z
    //   140: ifeq +12 -> 152
    //   143: aload_0
    //   144: iconst_0
    //   145: putfield 63	com/google/android/exoplayer2/upstream/ContentDataSource:opened	Z
    //   148: aload_0
    //   149: invokevirtual 66	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   152: aload_2
    //   153: athrow
    //   154: astore_1
    //   155: goto +15 -> 170
    //   158: astore_1
    //   159: new 6	com/google/android/exoplayer2/upstream/ContentDataSource$ContentDataSourceException
    //   162: astore_2
    //   163: aload_2
    //   164: aload_1
    //   165: invokespecial 69	com/google/android/exoplayer2/upstream/ContentDataSource$ContentDataSourceException:<init>	(Ljava/io/IOException;)V
    //   168: aload_2
    //   169: athrow
    //   170: aload_0
    //   171: aconst_null
    //   172: putfield 58	com/google/android/exoplayer2/upstream/ContentDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   175: aload_0
    //   176: getfield 63	com/google/android/exoplayer2/upstream/ContentDataSource:opened	Z
    //   179: ifeq +12 -> 191
    //   182: aload_0
    //   183: iconst_0
    //   184: putfield 63	com/google/android/exoplayer2/upstream/ContentDataSource:opened	Z
    //   187: aload_0
    //   188: invokevirtual 66	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   191: aload_1
    //   192: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	this	ContentDataSource
    //   9	24	1	localObject1	Object
    //   58	1	1	localObject2	Object
    //   66	30	1	localContentDataSourceException1	ContentDataSourceException
    //   101	7	1	localIOException1	IOException
    //   122	6	1	localAssetFileDescriptor	AssetFileDescriptor
    //   154	1	1	localObject3	Object
    //   158	34	1	localIOException2	IOException
    //   62	7	2	localIOException3	IOException
    //   97	1	2	localObject4	Object
    //   105	64	2	localContentDataSourceException2	ContentDataSourceException
    // Exception table:
    //   from	to	target	type
    //   23	28	58	finally
    //   32	36	58	finally
    //   63	74	58	finally
    //   23	28	62	java/io/IOException
    //   32	36	62	java/io/IOException
    //   5	10	97	finally
    //   14	18	97	finally
    //   102	113	97	finally
    //   5	10	101	java/io/IOException
    //   14	18	101	java/io/IOException
    //   118	123	154	finally
    //   127	131	154	finally
    //   159	170	154	finally
    //   118	123	158	java/io/IOException
    //   127	131	158	java/io/IOException
  }
  
  @Nullable
  public Uri getUri()
  {
    return uri;
  }
  
  public long open(DataSpec paramDataSpec)
    throws ContentDataSource.ContentDataSourceException
  {
    try
    {
      uri = uri;
      transferInitializing(paramDataSpec);
      Object localObject = resolver.openAssetFileDescriptor(uri, "r");
      assetFileDescriptor = ((AssetFileDescriptor)localObject);
      if (localObject != null)
      {
        localObject = new java/io/FileInputStream;
        ((FileInputStream)localObject).<init>(assetFileDescriptor.getFileDescriptor());
        inputStream = ((FileInputStream)localObject);
        long l1 = assetFileDescriptor.getStartOffset();
        long l2 = inputStream.skip(position + l1) - l1;
        if (l2 == position)
        {
          long l3 = length;
          l1 = -1L;
          if (l3 != -1L)
          {
            bytesRemaining = l3;
          }
          else
          {
            l3 = assetFileDescriptor.getLength();
            if (l3 == -1L)
            {
              localObject = inputStream.getChannel();
              l2 = ((FileChannel)localObject).size();
              if (l2 != 0L) {
                l1 = l2 - ((FileChannel)localObject).position();
              }
              bytesRemaining = l1;
            }
            else
            {
              bytesRemaining = (l3 - l2);
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
      paramDataSpec = new java/io/FileNotFoundException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Could not open file descriptor for: ");
      ((StringBuilder)localObject).append(uri);
      paramDataSpec.<init>(((StringBuilder)localObject).toString());
      throw paramDataSpec;
    }
    catch (IOException paramDataSpec)
    {
      throw new ContentDataSourceException(paramDataSpec);
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws ContentDataSource.ContentDataSourceException
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
        throw new ContentDataSourceException(new EOFException());
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
      throw new ContentDataSourceException(paramArrayOfByte);
    }
  }
  
  public static class ContentDataSourceException
    extends IOException
  {
    public ContentDataSourceException(IOException paramIOException)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.ContentDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */