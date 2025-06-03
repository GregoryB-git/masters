package com.facebook.imagepipeline.producers;

import bolts.Continuation;
import bolts.Task;
import com.facebook.imagepipeline.image.EncodedImage;

class DiskCacheReadProducer$1
  implements Continuation<EncodedImage, Void>
{
  public DiskCacheReadProducer$1(DiskCacheReadProducer paramDiskCacheReadProducer, ProducerListener paramProducerListener, String paramString, Consumer paramConsumer, ProducerContext paramProducerContext) {}
  
  public Void then(Task<EncodedImage> paramTask)
    throws Exception
  {
    if (DiskCacheReadProducer.access$000(paramTask))
    {
      val$listener.onProducerFinishWithCancellation(val$requestId, "DiskCacheProducer", null);
      val$consumer.onCancellation();
    }
    else if (paramTask.isFaulted())
    {
      val$listener.onProducerFinishWithFailure(val$requestId, "DiskCacheProducer", paramTask.getError(), null);
      DiskCacheReadProducer.access$100(this$0).produceResults(val$consumer, val$producerContext);
    }
    else
    {
      Object localObject = (EncodedImage)paramTask.getResult();
      if (localObject != null)
      {
        ProducerListener localProducerListener = val$listener;
        paramTask = val$requestId;
        localProducerListener.onProducerFinishWithSuccess(paramTask, "DiskCacheProducer", DiskCacheReadProducer.getExtraMap(localProducerListener, paramTask, true, ((EncodedImage)localObject).getSize()));
        val$listener.onUltimateProducerReached(val$requestId, "DiskCacheProducer", true);
        val$consumer.onProgressUpdate(1.0F);
        val$consumer.onNewResult(localObject, 1);
        ((EncodedImage)localObject).close();
      }
      else
      {
        localObject = val$listener;
        paramTask = val$requestId;
        ((ProducerListener)localObject).onProducerFinishWithSuccess(paramTask, "DiskCacheProducer", DiskCacheReadProducer.getExtraMap((ProducerListener)localObject, paramTask, false, 0));
        DiskCacheReadProducer.access$100(this$0).produceResults(val$consumer, val$producerContext);
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DiskCacheReadProducer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */