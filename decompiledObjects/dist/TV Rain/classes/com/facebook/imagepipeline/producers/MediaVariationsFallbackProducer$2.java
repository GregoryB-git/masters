package com.facebook.imagepipeline.producers;

import bolts.Continuation;
import bolts.Task;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.MediaVariations;
import com.facebook.imagepipeline.request.MediaVariations.Variant;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

class MediaVariationsFallbackProducer$2
  implements Continuation<EncodedImage, Void>
{
  public MediaVariationsFallbackProducer$2(MediaVariationsFallbackProducer paramMediaVariationsFallbackProducer, ProducerListener paramProducerListener, String paramString, Consumer paramConsumer, ProducerContext paramProducerContext, MediaVariations paramMediaVariations, List paramList, int paramInt, ImageRequest paramImageRequest, AtomicBoolean paramAtomicBoolean) {}
  
  public Void then(Task<EncodedImage> paramTask)
    throws Exception
  {
    boolean bool = MediaVariationsFallbackProducer.access$200(paramTask);
    int i = 1;
    int j;
    if (bool)
    {
      val$listener.onProducerFinishWithCancellation(val$requestId, "MediaVariationsFallbackProducer", null);
      val$consumer.onCancellation();
      j = 0;
      i = j;
    }
    else
    {
      if (paramTask.isFaulted())
      {
        val$listener.onProducerFinishWithFailure(val$requestId, "MediaVariationsFallbackProducer", paramTask.getError(), null);
        MediaVariationsFallbackProducer.access$000(this$0, val$consumer, val$producerContext, val$mediaVariations.getMediaId());
      }
      for (;;)
      {
        j = 1;
        break label393;
        EncodedImage localEncodedImage = (EncodedImage)paramTask.getResult();
        if (localEncodedImage != null)
        {
          if ((!val$mediaVariations.shouldForceRequestForSpecifiedUri()) && (MediaVariationsFallbackProducer.access$300((MediaVariations.Variant)val$sortedVariants.get(val$variantsIndex), val$imageRequest.getResizeOptions()))) {
            bool = true;
          } else {
            bool = false;
          }
          paramTask = val$listener;
          str = val$requestId;
          paramTask.onProducerFinishWithSuccess(str, "MediaVariationsFallbackProducer", MediaVariationsFallbackProducer.getExtraMap(paramTask, str, true, val$sortedVariants.size(), val$mediaVariations.getSource(), bool));
          if (bool)
          {
            val$listener.onUltimateProducerReached(val$requestId, "MediaVariationsFallbackProducer", true);
            val$consumer.onProgressUpdate(1.0F);
          }
          i = BaseConsumer.turnOnStatusFlag(BaseConsumer.simpleStatusForIsLast(bool), 2);
          j = i;
          if (!bool) {
            j = BaseConsumer.turnOnStatusFlag(i, 4);
          }
          val$consumer.onNewResult(localEncodedImage, j);
          localEncodedImage.close();
          i = true ^ bool;
          j = 0;
          break label393;
        }
        if (val$variantsIndex < val$sortedVariants.size() - 1)
        {
          MediaVariationsFallbackProducer.access$400(this$0, val$consumer, val$producerContext, val$imageRequest, val$mediaVariations, val$sortedVariants, val$variantsIndex + 1, val$isCancelled);
          break;
        }
        paramTask = val$listener;
        String str = val$requestId;
        paramTask.onProducerFinishWithSuccess(str, "MediaVariationsFallbackProducer", MediaVariationsFallbackProducer.getExtraMap(paramTask, str, false, val$sortedVariants.size(), val$mediaVariations.getSource(), false));
      }
    }
    label393:
    if (i != 0)
    {
      if ((val$producerContext.isIntermediateResultExpected()) && (j == 0))
      {
        paramTask = new SettableProducerContext(val$producerContext);
        paramTask.setIsIntermediateResultExpected(false);
      }
      else
      {
        paramTask = val$producerContext;
      }
      MediaVariationsFallbackProducer.access$000(this$0, val$consumer, paramTask, val$mediaVariations.getMediaId());
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.MediaVariationsFallbackProducer.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */