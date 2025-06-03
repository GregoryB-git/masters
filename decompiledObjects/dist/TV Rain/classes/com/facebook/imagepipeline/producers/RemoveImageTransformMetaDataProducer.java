package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;

public class RemoveImageTransformMetaDataProducer
  implements Producer<CloseableReference<PooledByteBuffer>>
{
  private final Producer<EncodedImage> mInputProducer;
  
  public RemoveImageTransformMetaDataProducer(Producer<EncodedImage> paramProducer)
  {
    mInputProducer = paramProducer;
  }
  
  public void produceResults(Consumer<CloseableReference<PooledByteBuffer>> paramConsumer, ProducerContext paramProducerContext)
  {
    mInputProducer.produceResults(new RemoveImageTransformMetaDataConsumer(paramConsumer, null), paramProducerContext);
  }
  
  public class RemoveImageTransformMetaDataConsumer
    extends DelegatingConsumer<EncodedImage, CloseableReference<PooledByteBuffer>>
  {
    private RemoveImageTransformMetaDataConsumer()
    {
      super();
    }
    
    public void onNewResultImpl(EncodedImage paramEncodedImage, int paramInt)
    {
      Object localObject1 = null;
      CloseableReference localCloseableReference = null;
      Object localObject2 = localObject1;
      try
      {
        if (EncodedImage.isValid(paramEncodedImage))
        {
          localObject2 = localObject1;
          localCloseableReference = paramEncodedImage.getByteBufferRef();
        }
        localObject2 = localCloseableReference;
        getConsumer().onNewResult(localCloseableReference, paramInt);
        CloseableReference.closeSafely(localCloseableReference);
        return;
      }
      finally
      {
        CloseableReference.closeSafely((CloseableReference)localObject2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.RemoveImageTransformMetaDataProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */