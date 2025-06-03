package com.facebook.imagepipeline.producers;

import bolts.Continuation;
import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;

class PartialDiskCacheProducer$1
  implements Continuation<EncodedImage, Void>
{
  public PartialDiskCacheProducer$1(PartialDiskCacheProducer paramPartialDiskCacheProducer, ProducerListener paramProducerListener, String paramString, Consumer paramConsumer, ProducerContext paramProducerContext, CacheKey paramCacheKey) {}
  
  public Void then(Task<EncodedImage> paramTask)
    throws Exception
  {
    if (PartialDiskCacheProducer.access$000(paramTask))
    {
      val$listener.onProducerFinishWithCancellation(val$requestId, "PartialDiskCacheProducer", null);
      val$consumer.onCancellation();
    }
    else if (paramTask.isFaulted())
    {
      val$listener.onProducerFinishWithFailure(val$requestId, "PartialDiskCacheProducer", paramTask.getError(), null);
      PartialDiskCacheProducer.access$100(this$0, val$consumer, val$producerContext, val$partialImageCacheKey, null);
    }
    else
    {
      paramTask = (EncodedImage)paramTask.getResult();
      Object localObject1;
      Object localObject2;
      if (paramTask != null)
      {
        localObject1 = val$listener;
        localObject2 = val$requestId;
        ((ProducerListener)localObject1).onProducerFinishWithSuccess((String)localObject2, "PartialDiskCacheProducer", PartialDiskCacheProducer.getExtraMap((ProducerListener)localObject1, (String)localObject2, true, paramTask.getSize()));
        localObject2 = BytesRange.toMax(paramTask.getSize() - 1);
        paramTask.setBytesRange((BytesRange)localObject2);
        int i = paramTask.getSize();
        localObject1 = val$producerContext.getImageRequest();
        if (((BytesRange)localObject2).contains(((ImageRequest)localObject1).getBytesRange()))
        {
          val$listener.onUltimateProducerReached(val$requestId, "PartialDiskCacheProducer", true);
          val$consumer.onNewResult(paramTask, 9);
        }
        else
        {
          val$consumer.onNewResult(paramTask, 8);
          localObject2 = new SettableProducerContext(ImageRequestBuilder.fromRequest((ImageRequest)localObject1).setBytesRange(BytesRange.from(i - 1)).build(), val$producerContext);
          PartialDiskCacheProducer.access$100(this$0, val$consumer, (ProducerContext)localObject2, val$partialImageCacheKey, paramTask);
        }
      }
      else
      {
        localObject2 = val$listener;
        localObject1 = val$requestId;
        ((ProducerListener)localObject2).onProducerFinishWithSuccess((String)localObject1, "PartialDiskCacheProducer", PartialDiskCacheProducer.getExtraMap((ProducerListener)localObject2, (String)localObject1, false, 0));
        PartialDiskCacheProducer.access$100(this$0, val$consumer, val$producerContext, val$partialImageCacheKey, paramTask);
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.PartialDiskCacheProducer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */