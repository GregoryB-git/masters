package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class RawResourceDataSource
  extends BaseDataSource
{
  public static final String RAW_RESOURCE_SCHEME = "rawresource";
  @Nullable
  private AssetFileDescriptor assetFileDescriptor;
  private long bytesRemaining;
  @Nullable
  private InputStream inputStream;
  private boolean opened;
  private final Resources resources;
  @Nullable
  private Uri uri;
  
  public RawResourceDataSource(Context paramContext)
  {
    super(false);
    resources = paramContext.getResources();
  }
  
  @Deprecated
  public RawResourceDataSource(Context paramContext, @Nullable TransferListener paramTransferListener)
  {
    this(paramContext);
    if (paramTransferListener != null) {
      addTransferListener(paramTransferListener);
    }
  }
  
  public static Uri buildRawResourceUri(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("rawresource:///");
    localStringBuilder.append(paramInt);
    return Uri.parse(localStringBuilder.toString());
  }
  
  /* Error */
  public void close()
    throws RawResourceDataSource.RawResourceDataSourceException
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 79	com/google/android/exoplayer2/upstream/RawResourceDataSource:uri	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 81	com/google/android/exoplayer2/upstream/RawResourceDataSource:inputStream	Ljava/io/InputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 85	java/io/InputStream:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 81	com/google/android/exoplayer2/upstream/RawResourceDataSource:inputStream	Ljava/io/InputStream;
    //   23: aload_0
    //   24: getfield 87	com/google/android/exoplayer2/upstream/RawResourceDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +7 -> 36
    //   32: aload_1
    //   33: invokevirtual 90	android/content/res/AssetFileDescriptor:close	()V
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield 87	com/google/android/exoplayer2/upstream/RawResourceDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   41: aload_0
    //   42: getfield 92	com/google/android/exoplayer2/upstream/RawResourceDataSource:opened	Z
    //   45: ifeq +12 -> 57
    //   48: aload_0
    //   49: iconst_0
    //   50: putfield 92	com/google/android/exoplayer2/upstream/RawResourceDataSource:opened	Z
    //   53: aload_0
    //   54: invokevirtual 95	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   57: return
    //   58: astore_1
    //   59: goto +15 -> 74
    //   62: astore_1
    //   63: new 6	com/google/android/exoplayer2/upstream/RawResourceDataSource$RawResourceDataSourceException
    //   66: astore_2
    //   67: aload_2
    //   68: aload_1
    //   69: invokespecial 98	com/google/android/exoplayer2/upstream/RawResourceDataSource$RawResourceDataSourceException:<init>	(Ljava/io/IOException;)V
    //   72: aload_2
    //   73: athrow
    //   74: aload_0
    //   75: aconst_null
    //   76: putfield 87	com/google/android/exoplayer2/upstream/RawResourceDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   79: aload_0
    //   80: getfield 92	com/google/android/exoplayer2/upstream/RawResourceDataSource:opened	Z
    //   83: ifeq +12 -> 95
    //   86: aload_0
    //   87: iconst_0
    //   88: putfield 92	com/google/android/exoplayer2/upstream/RawResourceDataSource:opened	Z
    //   91: aload_0
    //   92: invokevirtual 95	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   95: aload_1
    //   96: athrow
    //   97: astore_1
    //   98: goto +15 -> 113
    //   101: astore_1
    //   102: new 6	com/google/android/exoplayer2/upstream/RawResourceDataSource$RawResourceDataSourceException
    //   105: astore_2
    //   106: aload_2
    //   107: aload_1
    //   108: invokespecial 98	com/google/android/exoplayer2/upstream/RawResourceDataSource$RawResourceDataSourceException:<init>	(Ljava/io/IOException;)V
    //   111: aload_2
    //   112: athrow
    //   113: aload_0
    //   114: aconst_null
    //   115: putfield 81	com/google/android/exoplayer2/upstream/RawResourceDataSource:inputStream	Ljava/io/InputStream;
    //   118: aload_0
    //   119: getfield 87	com/google/android/exoplayer2/upstream/RawResourceDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   122: astore_2
    //   123: aload_2
    //   124: ifnull +7 -> 131
    //   127: aload_2
    //   128: invokevirtual 90	android/content/res/AssetFileDescriptor:close	()V
    //   131: aload_0
    //   132: aconst_null
    //   133: putfield 87	com/google/android/exoplayer2/upstream/RawResourceDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   136: aload_0
    //   137: getfield 92	com/google/android/exoplayer2/upstream/RawResourceDataSource:opened	Z
    //   140: ifeq +12 -> 152
    //   143: aload_0
    //   144: iconst_0
    //   145: putfield 92	com/google/android/exoplayer2/upstream/RawResourceDataSource:opened	Z
    //   148: aload_0
    //   149: invokevirtual 95	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   152: aload_1
    //   153: athrow
    //   154: astore_1
    //   155: goto +15 -> 170
    //   158: astore_2
    //   159: new 6	com/google/android/exoplayer2/upstream/RawResourceDataSource$RawResourceDataSourceException
    //   162: astore_1
    //   163: aload_1
    //   164: aload_2
    //   165: invokespecial 98	com/google/android/exoplayer2/upstream/RawResourceDataSource$RawResourceDataSourceException:<init>	(Ljava/io/IOException;)V
    //   168: aload_1
    //   169: athrow
    //   170: aload_0
    //   171: aconst_null
    //   172: putfield 87	com/google/android/exoplayer2/upstream/RawResourceDataSource:assetFileDescriptor	Landroid/content/res/AssetFileDescriptor;
    //   175: aload_0
    //   176: getfield 92	com/google/android/exoplayer2/upstream/RawResourceDataSource:opened	Z
    //   179: ifeq +12 -> 191
    //   182: aload_0
    //   183: iconst_0
    //   184: putfield 92	com/google/android/exoplayer2/upstream/RawResourceDataSource:opened	Z
    //   187: aload_0
    //   188: invokevirtual 95	com/google/android/exoplayer2/upstream/BaseDataSource:transferEnded	()V
    //   191: aload_1
    //   192: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	193	0	this	RawResourceDataSource
    //   9	24	1	localObject1	Object
    //   58	1	1	localObject2	Object
    //   62	34	1	localIOException1	IOException
    //   97	1	1	localObject3	Object
    //   101	52	1	localIOException2	IOException
    //   154	1	1	localObject4	Object
    //   162	30	1	localRawResourceDataSourceException	RawResourceDataSourceException
    //   66	62	2	localObject5	Object
    //   158	7	2	localIOException3	IOException
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
    throws RawResourceDataSource.RawResourceDataSourceException
  {
    try
    {
      Object localObject = uri;
      uri = ((Uri)localObject);
      boolean bool = TextUtils.equals("rawresource", ((Uri)localObject).getScheme());
      if (bool) {
        try
        {
          int i = Integer.parseInt(uri.getLastPathSegment());
          transferInitializing(paramDataSpec);
          assetFileDescriptor = resources.openRawResourceFd(i);
          localObject = new java/io/FileInputStream;
          ((FileInputStream)localObject).<init>(assetFileDescriptor.getFileDescriptor());
          inputStream = ((InputStream)localObject);
          ((InputStream)localObject).skip(assetFileDescriptor.getStartOffset());
          if (inputStream.skip(position) >= position)
          {
            long l1 = length;
            long l2 = -1L;
            if (l1 != -1L)
            {
              bytesRemaining = l1;
            }
            else
            {
              l1 = assetFileDescriptor.getLength();
              if (l1 != -1L) {
                l2 = l1 - position;
              }
              bytesRemaining = l2;
            }
            opened = true;
            transferStarted(paramDataSpec);
            return bytesRemaining;
          }
          paramDataSpec = new java/io/EOFException;
          paramDataSpec.<init>();
          throw paramDataSpec;
        }
        catch (NumberFormatException paramDataSpec)
        {
          paramDataSpec = new com/google/android/exoplayer2/upstream/RawResourceDataSource$RawResourceDataSourceException;
          paramDataSpec.<init>("Resource identifier must be an integer.");
          throw paramDataSpec;
        }
      }
      paramDataSpec = new com/google/android/exoplayer2/upstream/RawResourceDataSource$RawResourceDataSourceException;
      paramDataSpec.<init>("URI must use scheme rawresource");
      throw paramDataSpec;
    }
    catch (IOException paramDataSpec)
    {
      throw new RawResourceDataSourceException(paramDataSpec);
    }
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws RawResourceDataSource.RawResourceDataSourceException
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
        throw new RawResourceDataSourceException(new EOFException());
      }
      l1 = bytesRemaining;
      if (l1 != -1L) {
        bytesRemaining = (l1 - paramInt1);
      }
      bytesTransferred(paramInt1);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new RawResourceDataSourceException(paramArrayOfByte);
    }
  }
  
  public static class RawResourceDataSourceException
    extends IOException
  {
    public RawResourceDataSourceException(IOException paramIOException)
    {
      super();
    }
    
    public RawResourceDataSourceException(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.RawResourceDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */