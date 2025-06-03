package com.facebook.imagepipeline.producers;

public class SwallowResultProducer<T>
  implements Producer<Void>
{
  private final Producer<T> mInputProducer;
  
  public SwallowResultProducer(Producer<T> paramProducer)
  {
    mInputProducer = paramProducer;
  }
  
  public void produceResults(Consumer<Void> paramConsumer, ProducerContext paramProducerContext)
  {
    paramConsumer = new DelegatingConsumer(paramConsumer)
    {
      public void onNewResultImpl(T paramAnonymousT, int paramAnonymousInt)
      {
        if (BaseConsumer.isLast(paramAnonymousInt)) {
          getConsumer().onNewResult(null, paramAnonymousInt);
        }
      }
    };
    mInputProducer.produceResults(paramConsumer, paramProducerContext);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.SwallowResultProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */