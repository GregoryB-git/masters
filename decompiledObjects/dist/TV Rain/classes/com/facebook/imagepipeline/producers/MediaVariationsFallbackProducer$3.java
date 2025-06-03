package com.facebook.imagepipeline.producers;

import java.util.concurrent.atomic.AtomicBoolean;

class MediaVariationsFallbackProducer$3
  extends BaseProducerContextCallbacks
{
  public MediaVariationsFallbackProducer$3(MediaVariationsFallbackProducer paramMediaVariationsFallbackProducer, AtomicBoolean paramAtomicBoolean) {}
  
  public void onCancellationRequested()
  {
    val$isCancelled.set(true);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.MediaVariationsFallbackProducer.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */