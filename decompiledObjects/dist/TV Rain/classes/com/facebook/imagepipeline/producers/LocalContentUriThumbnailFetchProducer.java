package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.JfifUtil;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class LocalContentUriThumbnailFetchProducer
  extends LocalFetchProducer
  implements ThumbnailProducer<EncodedImage>
{
  private static final Rect MICRO_THUMBNAIL_DIMENSIONS = new Rect(0, 0, 96, 96);
  private static final Rect MINI_THUMBNAIL_DIMENSIONS;
  private static final int NO_THUMBNAIL = 0;
  public static final String PRODUCER_NAME = "LocalContentUriThumbnailFetchProducer";
  private static final String[] PROJECTION;
  private static final Class<?> TAG = LocalContentUriThumbnailFetchProducer.class;
  private static final String[] THUMBNAIL_PROJECTION;
  private final ContentResolver mContentResolver;
  
  static
  {
    PROJECTION = new String[] { "_id", "_data" };
    THUMBNAIL_PROJECTION = new String[] { "_data" };
    MINI_THUMBNAIL_DIMENSIONS = new Rect(0, 0, 512, 384);
  }
  
  public LocalContentUriThumbnailFetchProducer(Executor paramExecutor, PooledByteBufferFactory paramPooledByteBufferFactory, ContentResolver paramContentResolver)
  {
    super(paramExecutor, paramPooledByteBufferFactory);
    mContentResolver = paramContentResolver;
  }
  
  @Nullable
  private EncodedImage getCameraImage(Uri paramUri, ResizeOptions paramResizeOptions)
    throws IOException
  {
    paramUri = mContentResolver.query(paramUri, PROJECTION, null, null, null);
    if (paramUri == null) {
      return null;
    }
    try
    {
      int i = paramUri.getCount();
      if (i == 0) {
        return null;
      }
      paramUri.moveToFirst();
      String str = paramUri.getString(paramUri.getColumnIndex("_data"));
      if (paramResizeOptions != null)
      {
        paramResizeOptions = getThumbnail(paramResizeOptions, paramUri.getInt(paramUri.getColumnIndex("_id")));
        if (paramResizeOptions != null)
        {
          paramResizeOptions.setRotationAngle(getRotationAngle(str));
          return paramResizeOptions;
        }
      }
      return null;
    }
    finally
    {
      paramUri.close();
    }
  }
  
  private static int getLength(String paramString)
  {
    int i;
    if (paramString == null) {
      i = -1;
    } else {
      i = (int)new File(paramString).length();
    }
    return i;
  }
  
  private static int getRotationAngle(String paramString)
  {
    if (paramString != null) {
      try
      {
        ExifInterface localExifInterface = new android/media/ExifInterface;
        localExifInterface.<init>(paramString);
        int i = JfifUtil.getAutoRotateAngleFromOrientation(localExifInterface.getAttributeInt("Orientation", 1));
        return i;
      }
      catch (IOException localIOException)
      {
        FLog.e(TAG, localIOException, "Unable to retrieve thumbnail rotation for %s", new Object[] { paramString });
      }
    }
    return 0;
  }
  
  /* Error */
  private EncodedImage getThumbnail(ResizeOptions paramResizeOptions, int paramInt)
    throws IOException
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 145	com/facebook/imagepipeline/producers/LocalContentUriThumbnailFetchProducer:getThumbnailKind	(Lcom/facebook/imagepipeline/common/ResizeOptions;)I
    //   4: istore_3
    //   5: aconst_null
    //   6: astore 4
    //   8: iload_3
    //   9: ifne +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: aload_0
    //   15: getfield 56	com/facebook/imagepipeline/producers/LocalContentUriThumbnailFetchProducer:mContentResolver	Landroid/content/ContentResolver;
    //   18: iload_2
    //   19: i2l
    //   20: iload_3
    //   21: getstatic 39	com/facebook/imagepipeline/producers/LocalContentUriThumbnailFetchProducer:THUMBNAIL_PROJECTION	[Ljava/lang/String;
    //   24: invokestatic 151	android/provider/MediaStore$Images$Thumbnails:queryMiniThumbnail	(Landroid/content/ContentResolver;JI[Ljava/lang/String;)Landroid/database/Cursor;
    //   27: astore 5
    //   29: aload 5
    //   31: ifnonnull +17 -> 48
    //   34: aload 5
    //   36: ifnull +10 -> 46
    //   39: aload 5
    //   41: invokeinterface 76 1 0
    //   46: aconst_null
    //   47: areturn
    //   48: aload 5
    //   50: invokeinterface 80 1 0
    //   55: pop
    //   56: aload 5
    //   58: invokeinterface 73 1 0
    //   63: ifle +70 -> 133
    //   66: aload 5
    //   68: aload 5
    //   70: ldc 35
    //   72: invokeinterface 84 2 0
    //   77: invokeinterface 88 2 0
    //   82: astore_1
    //   83: new 110	java/io/File
    //   86: astore 4
    //   88: aload 4
    //   90: aload_1
    //   91: invokespecial 113	java/io/File:<init>	(Ljava/lang/String;)V
    //   94: aload 4
    //   96: invokevirtual 154	java/io/File:exists	()Z
    //   99: ifeq +34 -> 133
    //   102: new 156	java/io/FileInputStream
    //   105: astore 4
    //   107: aload 4
    //   109: aload_1
    //   110: invokespecial 157	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   113: aload_0
    //   114: aload 4
    //   116: aload_1
    //   117: invokestatic 159	com/facebook/imagepipeline/producers/LocalContentUriThumbnailFetchProducer:getLength	(Ljava/lang/String;)I
    //   120: invokevirtual 163	com/facebook/imagepipeline/producers/LocalFetchProducer:getEncodedImage	(Ljava/io/InputStream;I)Lcom/facebook/imagepipeline/image/EncodedImage;
    //   123: astore_1
    //   124: aload 5
    //   126: invokeinterface 76 1 0
    //   131: aload_1
    //   132: areturn
    //   133: aload 5
    //   135: invokeinterface 76 1 0
    //   140: aconst_null
    //   141: areturn
    //   142: astore_1
    //   143: goto +8 -> 151
    //   146: astore_1
    //   147: aload 4
    //   149: astore 5
    //   151: aload 5
    //   153: ifnull +10 -> 163
    //   156: aload 5
    //   158: invokeinterface 76 1 0
    //   163: aload_1
    //   164: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	165	0	this	LocalContentUriThumbnailFetchProducer
    //   0	165	1	paramResizeOptions	ResizeOptions
    //   0	165	2	paramInt	int
    //   4	17	3	i	int
    //   6	142	4	localObject1	Object
    //   27	130	5	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   48	124	142	finally
    //   14	29	146	finally
  }
  
  private static int getThumbnailKind(ResizeOptions paramResizeOptions)
  {
    Rect localRect = MICRO_THUMBNAIL_DIMENSIONS;
    if (ThumbnailSizeChecker.isImageBigEnough(localRect.width(), localRect.height(), paramResizeOptions)) {
      return 3;
    }
    localRect = MINI_THUMBNAIL_DIMENSIONS;
    if (ThumbnailSizeChecker.isImageBigEnough(localRect.width(), localRect.height(), paramResizeOptions)) {
      return 1;
    }
    return 0;
  }
  
  public boolean canProvideImageForSize(ResizeOptions paramResizeOptions)
  {
    Rect localRect = MINI_THUMBNAIL_DIMENSIONS;
    return ThumbnailSizeChecker.isImageBigEnough(localRect.width(), localRect.height(), paramResizeOptions);
  }
  
  public EncodedImage getEncodedImage(ImageRequest paramImageRequest)
    throws IOException
  {
    Uri localUri = paramImageRequest.getSourceUri();
    if (UriUtil.isLocalCameraUri(localUri))
    {
      paramImageRequest = getCameraImage(localUri, paramImageRequest.getResizeOptions());
      if (paramImageRequest != null) {
        return paramImageRequest;
      }
    }
    return null;
  }
  
  public String getProducerName()
  {
    return "LocalContentUriThumbnailFetchProducer";
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.LocalContentUriThumbnailFetchProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */