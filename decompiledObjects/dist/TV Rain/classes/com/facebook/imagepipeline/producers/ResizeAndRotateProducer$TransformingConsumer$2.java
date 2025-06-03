package com.facebook.imagepipeline.producers;

class ResizeAndRotateProducer$TransformingConsumer$2
  extends BaseProducerContextCallbacks
{
  public ResizeAndRotateProducer$TransformingConsumer$2(ResizeAndRotateProducer.TransformingConsumer paramTransformingConsumer, ResizeAndRotateProducer paramResizeAndRotateProducer, Consumer paramConsumer) {}
  
  public void onCancellationRequested()
  {
    ResizeAndRotateProducer.TransformingConsumer.access$300(this$1).clearJob();
    ResizeAndRotateProducer.TransformingConsumer.access$402(this$1, true);
    val$consumer.onCancellation();
  }
  
  public void onIsIntermediateResultExpectedChanged()
  {
    if (ResizeAndRotateProducer.TransformingConsumer.access$200(this$1).isIntermediateResultExpected()) {
      ResizeAndRotateProducer.TransformingConsumer.access$300(this$1).scheduleJob();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ResizeAndRotateProducer.TransformingConsumer.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */