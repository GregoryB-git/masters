package com.facebook.imagepipeline.producers;

import com.facebook.common.executors.StatefulRunnable;
import com.facebook.common.internal.Closeables;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

public abstract class LocalFetchProducer
  implements Producer<EncodedImage>
{
  private final Executor mExecutor;
  private final PooledByteBufferFactory mPooledByteBufferFactory;
  
  public LocalFetchProducer(Executor paramExecutor, PooledByteBufferFactory paramPooledByteBufferFactory)
  {
    mExecutor = paramExecutor;
    mPooledByteBufferFactory = paramPooledByteBufferFactory;
  }
  
  public EncodedImage getByteBufferBackedEncodedImage(InputStream paramInputStream, int paramInt)
    throws IOException
  {
    Object localObject1 = null;
    if (paramInt <= 0) {}
    try
    {
      Object localObject2 = CloseableReference.of(mPooledByteBufferFactory.newByteBuffer(paramInputStream));
      localObject1 = localObject2;
      break label46;
      localObject2 = CloseableReference.of(mPooledByteBufferFactory.newByteBuffer(paramInputStream, paramInt));
      localObject1 = localObject2;
      label46:
      localObject2 = localObject1;
      localObject1 = localObject2;
      EncodedImage localEncodedImage = new EncodedImage((CloseableReference)localObject2);
      return localEncodedImage;
    }
    finally
    {
      Closeables.closeQuietly(paramInputStream);
      CloseableReference.closeSafely((CloseableReference)localObject1);
    }
  }
  
  public abstract EncodedImage getEncodedImage(ImageRequest paramImageRequest)
    throws IOException;
  
  public EncodedImage getEncodedImage(InputStream paramInputStream, int paramInt)
    throws IOException
  {
    return getByteBufferBackedEncodedImage(paramInputStream, paramInt);
  }
  
  public abstract String getProducerName();
  
  public void produceResults(final Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    final ProducerListener localProducerListener = paramProducerContext.getListener();
    final String str = paramProducerContext.getId();
    final ImageRequest localImageRequest = paramProducerContext.getImageRequest();
    paramConsumer = new StatefulProducerRunnable(paramConsumer, localProducerListener, getProducerName(), str)
    {
      public void disposeResult(EncodedImage paramAnonymousEncodedImage)
      {
        EncodedImage.closeSafely(paramAnonymousEncodedImage);
      }
      
      public EncodedImage getResult()
        throws Exception
      {
        EncodedImage localEncodedImage = getEncodedImage(localImageRequest);
        if (localEncodedImage == null)
        {
          localProducerListener.onUltimateProducerReached(str, getProducerName(), false);
          return null;
        }
        localEncodedImage.parseMetaData();
        localProducerListener.onUltimateProducerReached(str, getProducerName(), true);
        return localEncodedImage;
      }
    };
    paramProducerContext.addCallbacks(new BaseProducerContextCallbacks()
    {
      public void onCancellationRequested()
      {
        paramConsumer.cancel();
      }
    });
    mExecutor.execute(paramConsumer);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.LocalFetchProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */