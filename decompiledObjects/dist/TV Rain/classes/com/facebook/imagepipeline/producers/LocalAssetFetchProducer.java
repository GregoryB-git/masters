package com.facebook.imagepipeline.producers;

import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

public class LocalAssetFetchProducer
  extends LocalFetchProducer
{
  public static final String PRODUCER_NAME = "LocalAssetFetchProducer";
  private final AssetManager mAssetManager;
  
  public LocalAssetFetchProducer(Executor paramExecutor, PooledByteBufferFactory paramPooledByteBufferFactory, AssetManager paramAssetManager)
  {
    super(paramExecutor, paramPooledByteBufferFactory);
    mAssetManager = paramAssetManager;
  }
  
  private static String getAssetName(ImageRequest paramImageRequest)
  {
    return paramImageRequest.getSourceUri().getPath().substring(1);
  }
  
  /* Error */
  private int getLength(ImageRequest paramImageRequest)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aconst_null
    //   3: astore_3
    //   4: aload_0
    //   5: getfield 17	com/facebook/imagepipeline/producers/LocalAssetFetchProducer:mAssetManager	Landroid/content/res/AssetManager;
    //   8: aload_1
    //   9: invokestatic 44	com/facebook/imagepipeline/producers/LocalAssetFetchProducer:getAssetName	(Lcom/facebook/imagepipeline/request/ImageRequest;)Ljava/lang/String;
    //   12: invokevirtual 50	android/content/res/AssetManager:openFd	(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   15: astore_1
    //   16: aload_1
    //   17: astore_3
    //   18: aload_1
    //   19: astore_2
    //   20: aload_1
    //   21: invokevirtual 55	android/content/res/AssetFileDescriptor:getLength	()J
    //   24: lstore 4
    //   26: lload 4
    //   28: l2i
    //   29: istore 6
    //   31: aload_1
    //   32: invokevirtual 59	android/content/res/AssetFileDescriptor:close	()V
    //   35: iload 6
    //   37: ireturn
    //   38: astore_1
    //   39: aload_3
    //   40: ifnull +7 -> 47
    //   43: aload_3
    //   44: invokevirtual 59	android/content/res/AssetFileDescriptor:close	()V
    //   47: aload_1
    //   48: athrow
    //   49: astore_1
    //   50: aload_2
    //   51: ifnull +7 -> 58
    //   54: aload_2
    //   55: invokevirtual 59	android/content/res/AssetFileDescriptor:close	()V
    //   58: iconst_m1
    //   59: ireturn
    //   60: astore_1
    //   61: goto -26 -> 35
    //   64: astore_3
    //   65: goto -18 -> 47
    //   68: astore_1
    //   69: goto -11 -> 58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	LocalAssetFetchProducer
    //   0	72	1	paramImageRequest	ImageRequest
    //   1	54	2	localImageRequest1	ImageRequest
    //   3	41	3	localImageRequest2	ImageRequest
    //   64	1	3	localIOException	IOException
    //   24	3	4	l	long
    //   29	7	6	i	int
    // Exception table:
    //   from	to	target	type
    //   4	16	38	finally
    //   20	26	38	finally
    //   4	16	49	java/io/IOException
    //   20	26	49	java/io/IOException
    //   31	35	60	java/io/IOException
    //   43	47	64	java/io/IOException
    //   54	58	68	java/io/IOException
  }
  
  public EncodedImage getEncodedImage(ImageRequest paramImageRequest)
    throws IOException
  {
    return getEncodedImage(mAssetManager.open(getAssetName(paramImageRequest), 2), getLength(paramImageRequest));
  }
  
  public String getProducerName()
  {
    return "LocalAssetFetchProducer";
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.LocalAssetFetchProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */