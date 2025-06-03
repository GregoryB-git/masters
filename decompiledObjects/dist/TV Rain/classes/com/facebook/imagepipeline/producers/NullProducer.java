package com.facebook.imagepipeline.producers;

public class NullProducer<T>
  implements Producer<T>
{
  public void produceResults(Consumer<T> paramConsumer, ProducerContext paramProducerContext)
  {
    paramConsumer.onNewResult(null, 1);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.NullProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */