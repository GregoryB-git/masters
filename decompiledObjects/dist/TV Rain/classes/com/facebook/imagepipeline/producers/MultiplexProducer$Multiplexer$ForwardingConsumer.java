package com.facebook.imagepipeline.producers;

class MultiplexProducer$Multiplexer$ForwardingConsumer
  extends BaseConsumer<T>
{
  private MultiplexProducer$Multiplexer$ForwardingConsumer(MultiplexProducer.Multiplexer paramMultiplexer) {}
  
  public void onCancellationImpl()
  {
    this$1.onCancelled(this);
  }
  
  public void onFailureImpl(Throwable paramThrowable)
  {
    this$1.onFailure(this, paramThrowable);
  }
  
  public void onNewResultImpl(T paramT, int paramInt)
  {
    this$1.onNextResult(this, paramT, paramInt);
  }
  
  public void onProgressUpdateImpl(float paramFloat)
  {
    this$1.onProgressUpdate(this, paramFloat);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.MultiplexProducer.Multiplexer.ForwardingConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */