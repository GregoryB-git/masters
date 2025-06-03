package com.facebook.imagepipeline.producers;

class ThreadHandoffProducer$1
  extends StatefulProducerRunnable<T>
{
  public ThreadHandoffProducer$1(ThreadHandoffProducer paramThreadHandoffProducer, Consumer paramConsumer1, ProducerListener paramProducerListener1, String paramString1, String paramString2, ProducerListener paramProducerListener2, String paramString3, Consumer paramConsumer2, ProducerContext paramProducerContext)
  {
    super(paramConsumer1, paramProducerListener1, paramString1, paramString2);
  }
  
  public void disposeResult(T paramT) {}
  
  public T getResult()
    throws Exception
  {
    return null;
  }
  
  public void onSuccess(T paramT)
  {
    val$producerListener.onProducerFinishWithSuccess(val$requestId, "BackgroundThreadHandoffProducer", null);
    ThreadHandoffProducer.access$000(this$0).produceResults(val$consumer, val$context);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ThreadHandoffProducer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */