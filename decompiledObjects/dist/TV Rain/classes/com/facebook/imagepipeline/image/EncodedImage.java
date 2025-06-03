package com.facebook.imagepipeline.image;

import android.util.Pair;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferInputStream;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.SharedReference;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imageformat.ImageFormatChecker;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.WebpUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
public class EncodedImage
  implements Closeable
{
  public static final int DEFAULT_SAMPLE_SIZE = 1;
  public static final int UNKNOWN_HEIGHT = -1;
  public static final int UNKNOWN_ROTATION_ANGLE = -1;
  public static final int UNKNOWN_STREAM_SIZE = -1;
  public static final int UNKNOWN_WIDTH = -1;
  @Nullable
  private BytesRange mBytesRange;
  private int mExifOrientation = 0;
  private int mHeight = -1;
  private ImageFormat mImageFormat = ImageFormat.UNKNOWN;
  @Nullable
  private final Supplier<FileInputStream> mInputStreamSupplier;
  @Nullable
  private final CloseableReference<PooledByteBuffer> mPooledByteBufferRef;
  private int mRotationAngle = -1;
  private int mSampleSize = 1;
  private int mStreamSize = -1;
  private int mWidth = -1;
  
  public EncodedImage(Supplier<FileInputStream> paramSupplier)
  {
    Preconditions.checkNotNull(paramSupplier);
    mPooledByteBufferRef = null;
    mInputStreamSupplier = paramSupplier;
  }
  
  public EncodedImage(Supplier<FileInputStream> paramSupplier, int paramInt)
  {
    this(paramSupplier);
    mStreamSize = paramInt;
  }
  
  public EncodedImage(CloseableReference<PooledByteBuffer> paramCloseableReference)
  {
    Preconditions.checkArgument(CloseableReference.isValid(paramCloseableReference));
    mPooledByteBufferRef = paramCloseableReference.clone();
    mInputStreamSupplier = null;
  }
  
  public static EncodedImage cloneOrNull(EncodedImage paramEncodedImage)
  {
    if (paramEncodedImage != null) {
      paramEncodedImage = paramEncodedImage.cloneOrNull();
    } else {
      paramEncodedImage = null;
    }
    return paramEncodedImage;
  }
  
  public static void closeSafely(@Nullable EncodedImage paramEncodedImage)
  {
    if (paramEncodedImage != null) {
      paramEncodedImage.close();
    }
  }
  
  public static boolean isMetaDataAvailable(EncodedImage paramEncodedImage)
  {
    boolean bool;
    if ((mRotationAngle >= 0) && (mWidth >= 0) && (mHeight >= 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean isValid(@Nullable EncodedImage paramEncodedImage)
  {
    boolean bool;
    if ((paramEncodedImage != null) && (paramEncodedImage.isValid())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  private Pair<Integer, Integer> readImageSize()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 113	com/facebook/imagepipeline/image/EncodedImage:getInputStream	()Ljava/io/InputStream;
    //   4: astore_1
    //   5: aload_1
    //   6: invokestatic 119	com/facebook/imageutils/BitmapUtil:decodeDimensions	(Ljava/io/InputStream;)Landroid/util/Pair;
    //   9: astore_2
    //   10: aload_2
    //   11: ifnull +31 -> 42
    //   14: aload_0
    //   15: aload_2
    //   16: getfield 125	android/util/Pair:first	Ljava/lang/Object;
    //   19: checkcast 127	java/lang/Integer
    //   22: invokevirtual 131	java/lang/Integer:intValue	()I
    //   25: putfield 50	com/facebook/imagepipeline/image/EncodedImage:mWidth	I
    //   28: aload_0
    //   29: aload_2
    //   30: getfield 134	android/util/Pair:second	Ljava/lang/Object;
    //   33: checkcast 127	java/lang/Integer
    //   36: invokevirtual 131	java/lang/Integer:intValue	()I
    //   39: putfield 52	com/facebook/imagepipeline/image/EncodedImage:mHeight	I
    //   42: aload_1
    //   43: ifnull +7 -> 50
    //   46: aload_1
    //   47: invokevirtual 137	java/io/InputStream:close	()V
    //   50: aload_2
    //   51: areturn
    //   52: astore_2
    //   53: goto +6 -> 59
    //   56: astore_2
    //   57: aconst_null
    //   58: astore_1
    //   59: aload_1
    //   60: ifnull +7 -> 67
    //   63: aload_1
    //   64: invokevirtual 137	java/io/InputStream:close	()V
    //   67: aload_2
    //   68: athrow
    //   69: astore_1
    //   70: goto -20 -> 50
    //   73: astore_1
    //   74: goto -7 -> 67
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	this	EncodedImage
    //   4	60	1	localInputStream	InputStream
    //   69	1	1	localIOException1	java.io.IOException
    //   73	1	1	localIOException2	java.io.IOException
    //   9	42	2	localPair	Pair
    //   52	1	2	localObject1	Object
    //   56	12	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   5	10	52	finally
    //   14	42	52	finally
    //   0	5	56	finally
    //   46	50	69	java/io/IOException
    //   63	67	73	java/io/IOException
  }
  
  private Pair<Integer, Integer> readWebPImageSize()
  {
    Pair localPair = WebpUtil.getSize(getInputStream());
    if (localPair != null)
    {
      mWidth = ((Integer)first).intValue();
      mHeight = ((Integer)second).intValue();
    }
    return localPair;
  }
  
  public EncodedImage cloneOrNull()
  {
    Object localObject1 = mInputStreamSupplier;
    CloseableReference localCloseableReference;
    if (localObject1 != null)
    {
      localObject1 = new EncodedImage((Supplier)localObject1, mStreamSize);
    }
    else
    {
      localCloseableReference = CloseableReference.cloneOrNull(mPooledByteBufferRef);
      if (localCloseableReference == null) {
        localObject1 = null;
      }
    }
    try
    {
      localObject1 = new EncodedImage(localCloseableReference);
      CloseableReference.closeSafely(localCloseableReference);
      if (localObject1 != null) {
        ((EncodedImage)localObject1).copyMetaDataFrom(this);
      }
      return (EncodedImage)localObject1;
    }
    finally
    {
      CloseableReference.closeSafely(localCloseableReference);
    }
  }
  
  public void close()
  {
    CloseableReference.closeSafely(mPooledByteBufferRef);
  }
  
  public void copyMetaDataFrom(EncodedImage paramEncodedImage)
  {
    mImageFormat = paramEncodedImage.getImageFormat();
    mWidth = paramEncodedImage.getWidth();
    mHeight = paramEncodedImage.getHeight();
    mRotationAngle = paramEncodedImage.getRotationAngle();
    mExifOrientation = paramEncodedImage.getExifOrientation();
    mSampleSize = paramEncodedImage.getSampleSize();
    mStreamSize = paramEncodedImage.getSize();
    mBytesRange = paramEncodedImage.getBytesRange();
  }
  
  public CloseableReference<PooledByteBuffer> getByteBufferRef()
  {
    return CloseableReference.cloneOrNull(mPooledByteBufferRef);
  }
  
  @Nullable
  public BytesRange getBytesRange()
  {
    return mBytesRange;
  }
  
  public int getExifOrientation()
  {
    return mExifOrientation;
  }
  
  public String getFirstBytesAsHexString(int paramInt)
  {
    Object localObject1 = getByteBufferRef();
    if (localObject1 == null) {
      return "";
    }
    int i = Math.min(getSize(), paramInt);
    byte[] arrayOfByte = new byte[i];
    try
    {
      PooledByteBuffer localPooledByteBuffer = (PooledByteBuffer)((CloseableReference)localObject1).get();
      if (localPooledByteBuffer == null) {
        return "";
      }
      localPooledByteBuffer.read(0, arrayOfByte, 0, i);
      ((CloseableReference)localObject1).close();
      localObject1 = new StringBuilder(i * 2);
      for (paramInt = 0; paramInt < i; paramInt++) {
        ((StringBuilder)localObject1).append(String.format("%02X", new Object[] { Byte.valueOf(arrayOfByte[paramInt]) }));
      }
      return ((StringBuilder)localObject1).toString();
    }
    finally
    {
      ((CloseableReference)localObject1).close();
    }
  }
  
  public int getHeight()
  {
    return mHeight;
  }
  
  public ImageFormat getImageFormat()
  {
    return mImageFormat;
  }
  
  public InputStream getInputStream()
  {
    Object localObject1 = mInputStreamSupplier;
    if (localObject1 != null) {
      return (InputStream)((Supplier)localObject1).get();
    }
    localObject1 = CloseableReference.cloneOrNull(mPooledByteBufferRef);
    if (localObject1 != null) {
      try
      {
        PooledByteBufferInputStream localPooledByteBufferInputStream = new PooledByteBufferInputStream((PooledByteBuffer)((CloseableReference)localObject1).get());
        return localPooledByteBufferInputStream;
      }
      finally
      {
        CloseableReference.closeSafely((CloseableReference)localObject1);
      }
    }
    return null;
  }
  
  public int getRotationAngle()
  {
    return mRotationAngle;
  }
  
  public int getSampleSize()
  {
    return mSampleSize;
  }
  
  public int getSize()
  {
    CloseableReference localCloseableReference = mPooledByteBufferRef;
    if ((localCloseableReference != null) && (localCloseableReference.get() != null)) {
      return ((PooledByteBuffer)mPooledByteBufferRef.get()).size();
    }
    return mStreamSize;
  }
  
  @VisibleForTesting
  public SharedReference<PooledByteBuffer> getUnderlyingReferenceTestOnly()
  {
    try
    {
      Object localObject1 = mPooledByteBufferRef;
      if (localObject1 != null) {
        localObject1 = ((CloseableReference)localObject1).getUnderlyingReferenceTestOnly();
      } else {
        localObject1 = null;
      }
      return (SharedReference<PooledByteBuffer>)localObject1;
    }
    finally {}
  }
  
  public int getWidth()
  {
    return mWidth;
  }
  
  public boolean isCompleteAt(int paramInt)
  {
    ImageFormat localImageFormat = mImageFormat;
    Object localObject = DefaultImageFormats.JPEG;
    boolean bool = true;
    if (localImageFormat != localObject) {
      return true;
    }
    if (mInputStreamSupplier != null) {
      return true;
    }
    Preconditions.checkNotNull(mPooledByteBufferRef);
    localObject = (PooledByteBuffer)mPooledByteBufferRef.get();
    if ((((PooledByteBuffer)localObject).read(paramInt - 2) != -1) || (((PooledByteBuffer)localObject).read(paramInt - 1) != -39)) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isValid()
  {
    try
    {
      if (!CloseableReference.isValid(mPooledByteBufferRef))
      {
        Supplier localSupplier = mInputStreamSupplier;
        if (localSupplier == null)
        {
          bool = false;
          break label31;
        }
      }
      boolean bool = true;
      label31:
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void parseMetaData()
  {
    ImageFormat localImageFormat = ImageFormatChecker.getImageFormat_WrapIOException(getInputStream());
    mImageFormat = localImageFormat;
    Pair localPair;
    if (DefaultImageFormats.isWebpFormat(localImageFormat)) {
      localPair = readWebPImageSize();
    } else {
      localPair = readImageSize();
    }
    if ((localImageFormat == DefaultImageFormats.JPEG) && (mRotationAngle == -1))
    {
      if (localPair != null)
      {
        int i = JfifUtil.getOrientation(getInputStream());
        mExifOrientation = i;
        mRotationAngle = JfifUtil.getAutoRotateAngleFromOrientation(i);
      }
    }
    else {
      mRotationAngle = 0;
    }
  }
  
  public void setBytesRange(@Nullable BytesRange paramBytesRange)
  {
    mBytesRange = paramBytesRange;
  }
  
  public void setExifOrientation(int paramInt)
  {
    mExifOrientation = paramInt;
  }
  
  public void setHeight(int paramInt)
  {
    mHeight = paramInt;
  }
  
  public void setImageFormat(ImageFormat paramImageFormat)
  {
    mImageFormat = paramImageFormat;
  }
  
  public void setRotationAngle(int paramInt)
  {
    mRotationAngle = paramInt;
  }
  
  public void setSampleSize(int paramInt)
  {
    mSampleSize = paramInt;
  }
  
  public void setStreamSize(int paramInt)
  {
    mStreamSize = paramInt;
  }
  
  public void setWidth(int paramInt)
  {
    mWidth = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.image.EncodedImage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */