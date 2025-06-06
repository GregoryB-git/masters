package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.util.concurrent.Executor;

public class QualifiedResourceFetchProducer
  extends LocalFetchProducer
{
  public static final String PRODUCER_NAME = "QualifiedResourceFetchProducer";
  private final ContentResolver mContentResolver;
  
  public QualifiedResourceFetchProducer(Executor paramExecutor, PooledByteBufferFactory paramPooledByteBufferFactory, ContentResolver paramContentResolver)
  {
    super(paramExecutor, paramPooledByteBufferFactory);
    mContentResolver = paramContentResolver;
  }
  
  public EncodedImage getEncodedImage(ImageRequest paramImageRequest)
    throws IOException
  {
    paramImageRequest = paramImageRequest.getSourceUri();
    return getEncodedImage(mContentResolver.openInputStream(paramImageRequest), -1);
  }
  
  public String getProducerName()
  {
    return "QualifiedResourceFetchProducer";
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.QualifiedResourceFetchProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */