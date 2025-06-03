package com.facebook.imagepipeline.producers;

class DecodeProducer$ProgressiveDecoder$2
  extends BaseProducerContextCallbacks
{
  public DecodeProducer$ProgressiveDecoder$2(DecodeProducer.ProgressiveDecoder paramProgressiveDecoder, DecodeProducer paramDecodeProducer, boolean paramBoolean) {}
  
  public void onCancellationRequested()
  {
    if (val$decodeCancellationEnabled) {
      DecodeProducer.ProgressiveDecoder.access$700(this$1);
    }
  }
  
  public void onIsIntermediateResultExpectedChanged()
  {
    if (DecodeProducer.ProgressiveDecoder.access$500(this$1).isIntermediateResultExpected()) {
      DecodeProducer.ProgressiveDecoder.access$600(this$1).scheduleJob();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */