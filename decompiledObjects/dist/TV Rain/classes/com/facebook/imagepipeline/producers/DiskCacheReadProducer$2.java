package com.facebook.imagepipeline.producers;

import java.util.concurrent.atomic.AtomicBoolean;

class DiskCacheReadProducer$2
  extends BaseProducerContextCallbacks
{
  public DiskCacheReadProducer$2(DiskCacheReadProducer paramDiskCacheReadProducer, AtomicBoolean paramAtomicBoolean) {}
  
  public void onCancellationRequested()
  {
    val$isCancelled.set(true);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DiskCacheReadProducer.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */