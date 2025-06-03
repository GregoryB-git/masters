package com.facebook.imagepipeline.producers;

public abstract interface Producer<T>
{
  public abstract void produceResults(Consumer<T> paramConsumer, ProducerContext paramProducerContext);
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.Producer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */