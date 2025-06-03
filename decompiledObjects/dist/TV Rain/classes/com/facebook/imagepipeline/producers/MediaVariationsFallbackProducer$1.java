package com.facebook.imagepipeline.producers;

import bolts.Continuation;
import bolts.Task;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.MediaVariations;
import java.util.concurrent.atomic.AtomicBoolean;

class MediaVariationsFallbackProducer$1
  implements Continuation<MediaVariations, Object>
{
  public MediaVariationsFallbackProducer$1(MediaVariationsFallbackProducer paramMediaVariationsFallbackProducer, Consumer paramConsumer, ProducerContext paramProducerContext, MediaVariations paramMediaVariations, ImageRequest paramImageRequest, ResizeOptions paramResizeOptions, AtomicBoolean paramAtomicBoolean) {}
  
  public Object then(Task<MediaVariations> paramTask)
    throws Exception
  {
    if ((!paramTask.isCancelled()) && (!paramTask.isFaulted())) {
      try
      {
        if (paramTask.getResult() == null)
        {
          MediaVariationsFallbackProducer.access$000(this$0, val$consumer, val$producerContext, val$mediaVariations.getMediaId());
          return null;
        }
        paramTask = MediaVariationsFallbackProducer.access$100(this$0, val$consumer, val$producerContext, val$imageRequest, (MediaVariations)paramTask.getResult(), val$resizeOptions, val$isCancelled);
        return paramTask;
      }
      catch (Exception paramTask)
      {
        return null;
      }
    }
    return paramTask;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.MediaVariationsFallbackProducer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */