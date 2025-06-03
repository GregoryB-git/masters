package com.facebook.imagepipeline.producers;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.EncodedImage;

class RemoveImageTransformMetaDataProducer$RemoveImageTransformMetaDataConsumer
  extends DelegatingConsumer<EncodedImage, CloseableReference<PooledByteBuffer>>
{
  private RemoveImageTransformMetaDataProducer$RemoveImageTransformMetaDataConsumer(Consumer<CloseableReference<PooledByteBuffer>> paramConsumer)
  {
    super(localConsumer);
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

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.RemoveImageTransformMetaDataProducer.RemoveImageTransformMetaDataConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */