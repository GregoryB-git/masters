package com.facebook.imagepipeline.producers;

import com.facebook.common.executors.StatefulRunnable;

class LocalVideoThumbnailProducer$2
  extends BaseProducerContextCallbacks
{
  public LocalVideoThumbnailProducer$2(LocalVideoThumbnailProducer paramLocalVideoThumbnailProducer, StatefulProducerRunnable paramStatefulProducerRunnable) {}
  
  public void onCancellationRequested()
  {
    val$cancellableProducerRunnable.cancel();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */