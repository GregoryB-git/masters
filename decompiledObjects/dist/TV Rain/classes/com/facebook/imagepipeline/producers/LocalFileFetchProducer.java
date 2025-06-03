package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

public class LocalFileFetchProducer
  extends LocalFetchProducer
{
  public static final String PRODUCER_NAME = "LocalFileFetchProducer";
  
  public LocalFileFetchProducer(Executor paramExecutor, PooledByteBufferFactory paramPooledByteBufferFactory)
  {
    super(paramExecutor, paramPooledByteBufferFactory);
  }
  
  public EncodedImage getEncodedImage(ImageRequest paramImageRequest)
    throws IOException
  {
    return getEncodedImage(new FileInputStream(paramImageRequest.getSourceFile().toString()), (int)paramImageRequest.getSourceFile().length());
  }
  
  public String getProducerName()
  {
    return "LocalFileFetchProducer";
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.LocalFileFetchProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */