package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class DataFetchProducer
  extends LocalFetchProducer
{
  public static final String PRODUCER_NAME = "DataFetchProducer";
  
  public DataFetchProducer(PooledByteBufferFactory paramPooledByteBufferFactory)
  {
    super(CallerThreadExecutor.getInstance(), paramPooledByteBufferFactory);
  }
  
  @VisibleForTesting
  public static byte[] getData(String paramString)
  {
    Preconditions.checkArgument(paramString.substring(0, 5).equals("data:"));
    int i = paramString.indexOf(',');
    String str = paramString.substring(i + 1, paramString.length());
    if (isBase64(paramString.substring(0, i))) {
      return Base64.decode(str, 0);
    }
    return Uri.decode(str).getBytes();
  }
  
  @VisibleForTesting
  public static boolean isBase64(String paramString)
  {
    if (!paramString.contains(";")) {
      return false;
    }
    paramString = paramString.split(";");
    return paramString[(paramString.length - 1)].equals("base64");
  }
  
  public EncodedImage getEncodedImage(ImageRequest paramImageRequest)
    throws IOException
  {
    paramImageRequest = getData(paramImageRequest.getSourceUri().toString());
    return getByteBufferBackedEncodedImage(new ByteArrayInputStream(paramImageRequest), paramImageRequest.length);
  }
  
  public String getProducerName()
  {
    return "DataFetchProducer";
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DataFetchProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */