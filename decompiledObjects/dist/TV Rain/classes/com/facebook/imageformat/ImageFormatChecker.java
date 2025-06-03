package com.facebook.imageformat;

import com.facebook.common.internal.ByteStreams;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class ImageFormatChecker
{
  private static ImageFormatChecker sInstance;
  @Nullable
  private List<ImageFormat.FormatChecker> mCustomImageFormatCheckers;
  private final ImageFormat.FormatChecker mDefaultFormatChecker = new DefaultImageFormatChecker();
  private int mMaxHeaderLength;
  
  private ImageFormatChecker()
  {
    updateMaxHeaderLength();
  }
  
  public static ImageFormat getImageFormat(InputStream paramInputStream)
    throws IOException
  {
    return getInstance().determineImageFormat(paramInputStream);
  }
  
  /* Error */
  public static ImageFormat getImageFormat(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_2
    //   5: astore_3
    //   6: new 42	java/io/FileInputStream
    //   9: astore 4
    //   11: aload_2
    //   12: astore_3
    //   13: aload 4
    //   15: aload_0
    //   16: invokespecial 45	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   19: aload 4
    //   21: invokestatic 47	com/facebook/imageformat/ImageFormatChecker:getImageFormat	(Ljava/io/InputStream;)Lcom/facebook/imageformat/ImageFormat;
    //   24: astore_0
    //   25: aload 4
    //   27: invokestatic 53	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   30: aload_0
    //   31: areturn
    //   32: astore_0
    //   33: aload 4
    //   35: astore_3
    //   36: goto +28 -> 64
    //   39: astore_0
    //   40: aload 4
    //   42: astore_0
    //   43: goto +7 -> 50
    //   46: astore_0
    //   47: goto +17 -> 64
    //   50: aload_0
    //   51: astore_3
    //   52: getstatic 59	com/facebook/imageformat/ImageFormat:UNKNOWN	Lcom/facebook/imageformat/ImageFormat;
    //   55: astore 4
    //   57: aload_0
    //   58: invokestatic 53	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   61: aload 4
    //   63: areturn
    //   64: aload_3
    //   65: invokestatic 53	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   68: aload_0
    //   69: athrow
    //   70: astore_0
    //   71: aload_1
    //   72: astore_0
    //   73: goto -23 -> 50
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	76	0	paramString	String
    //   1	71	1	localObject1	Object
    //   3	9	2	localObject2	Object
    //   5	60	3	localObject3	Object
    //   9	53	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   19	25	32	finally
    //   19	25	39	java/io/IOException
    //   6	11	46	finally
    //   13	19	46	finally
    //   52	57	46	finally
    //   6	11	70	java/io/IOException
    //   13	19	70	java/io/IOException
  }
  
  public static ImageFormat getImageFormat_WrapIOException(InputStream paramInputStream)
  {
    try
    {
      paramInputStream = getImageFormat(paramInputStream);
      return paramInputStream;
    }
    catch (IOException paramInputStream)
    {
      throw Throwables.propagate(paramInputStream);
    }
  }
  
  public static ImageFormatChecker getInstance()
  {
    try
    {
      if (sInstance == null)
      {
        localImageFormatChecker = new com/facebook/imageformat/ImageFormatChecker;
        localImageFormatChecker.<init>();
        sInstance = localImageFormatChecker;
      }
      ImageFormatChecker localImageFormatChecker = sInstance;
      return localImageFormatChecker;
    }
    finally {}
  }
  
  private static int readHeaderFromStream(int paramInt, InputStream paramInputStream, byte[] paramArrayOfByte)
    throws IOException
  {
    Preconditions.checkNotNull(paramInputStream);
    Preconditions.checkNotNull(paramArrayOfByte);
    boolean bool;
    if (paramArrayOfByte.length >= paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    if (paramInputStream.markSupported()) {
      try
      {
        paramInputStream.mark(paramInt);
        paramInt = ByteStreams.read(paramInputStream, paramArrayOfByte, 0, paramInt);
        return paramInt;
      }
      finally
      {
        paramInputStream.reset();
      }
    }
    return ByteStreams.read(paramInputStream, paramArrayOfByte, 0, paramInt);
  }
  
  private void updateMaxHeaderLength()
  {
    mMaxHeaderLength = mDefaultFormatChecker.getHeaderSize();
    Object localObject = mCustomImageFormatCheckers;
    if (localObject != null)
    {
      Iterator localIterator = ((List)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (ImageFormat.FormatChecker)localIterator.next();
        mMaxHeaderLength = Math.max(mMaxHeaderLength, ((ImageFormat.FormatChecker)localObject).getHeaderSize());
      }
    }
  }
  
  public ImageFormat determineImageFormat(InputStream paramInputStream)
    throws IOException
  {
    Preconditions.checkNotNull(paramInputStream);
    int i = mMaxHeaderLength;
    byte[] arrayOfByte = new byte[i];
    i = readHeaderFromStream(i, paramInputStream, arrayOfByte);
    paramInputStream = mDefaultFormatChecker.determineFormat(arrayOfByte, i);
    if ((paramInputStream != null) && (paramInputStream != ImageFormat.UNKNOWN)) {
      return paramInputStream;
    }
    paramInputStream = mCustomImageFormatCheckers;
    if (paramInputStream != null)
    {
      paramInputStream = paramInputStream.iterator();
      while (paramInputStream.hasNext())
      {
        ImageFormat localImageFormat = ((ImageFormat.FormatChecker)paramInputStream.next()).determineFormat(arrayOfByte, i);
        if ((localImageFormat != null) && (localImageFormat != ImageFormat.UNKNOWN)) {
          return localImageFormat;
        }
      }
    }
    return ImageFormat.UNKNOWN;
  }
  
  public void setCustomImageFormatCheckers(@Nullable List<ImageFormat.FormatChecker> paramList)
  {
    mCustomImageFormatCheckers = paramList;
    updateMaxHeaderLength();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imageformat.ImageFormatChecker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */