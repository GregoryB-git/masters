package com.facebook.imagepipeline.producers;

import com.facebook.common.executors.StatefulRunnable;

class LocalExifThumbnailProducer$2
  extends BaseProducerContextCallbacks
{
  public LocalExifThumbnailProducer$2(LocalExifThumbnailProducer paramLocalExifThumbnailProducer, StatefulProducerRunnable paramStatefulProducerRunnable) {}
  
  public void onCancellationRequested()
  {
    val$cancellableProducerRunnable.cancel();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.LocalExifThumbnailProducer.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */