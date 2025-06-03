package com.facebook.imagepipeline.producers;

class SwallowResultProducer$1
  extends DelegatingConsumer<T, Void>
{
  public SwallowResultProducer$1(SwallowResultProducer paramSwallowResultProducer, Consumer paramConsumer)
  {
    super(paramConsumer);
  }
  
  public void onNewResultImpl(T paramT, int paramInt)
  {
    if (BaseConsumer.isLast(paramInt)) {
      getConsumer().onNewResult(null, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.SwallowResultProducer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */