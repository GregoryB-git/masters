package com.facebook.imagepipeline.producers;

class PostprocessorProducer$RepeatedPostprocessorConsumer$1
  extends BaseProducerContextCallbacks
{
  public PostprocessorProducer$RepeatedPostprocessorConsumer$1(PostprocessorProducer.RepeatedPostprocessorConsumer paramRepeatedPostprocessorConsumer, PostprocessorProducer paramPostprocessorProducer) {}
  
  public void onCancellationRequested()
  {
    if (PostprocessorProducer.RepeatedPostprocessorConsumer.access$1000(this$1)) {
      this$1.getConsumer().onCancellation();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.PostprocessorProducer.RepeatedPostprocessorConsumer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */