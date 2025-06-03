package com.facebook.imagepipeline.producers;

import java.util.concurrent.atomic.AtomicBoolean;

class PartialDiskCacheProducer$2
  extends BaseProducerContextCallbacks
{
  public PartialDiskCacheProducer$2(PartialDiskCacheProducer paramPartialDiskCacheProducer, AtomicBoolean paramAtomicBoolean) {}
  
  public void onCancellationRequested()
  {
    val$isCancelled.set(true);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.PartialDiskCacheProducer.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */