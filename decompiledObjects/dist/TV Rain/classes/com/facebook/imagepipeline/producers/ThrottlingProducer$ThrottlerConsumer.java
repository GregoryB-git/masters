package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

class ThrottlingProducer$ThrottlerConsumer
  extends DelegatingConsumer<T, T>
{
  private ThrottlingProducer$ThrottlerConsumer(Consumer<T> paramConsumer)
  {
    super(localConsumer);
  }
  
  private void onRequestFinished()
  {
    synchronized (this$0)
    {
      final Pair localPair = (Pair)ThrottlingProducer.access$100(this$0).poll();
      if (localPair == null) {
        ThrottlingProducer.access$210(this$0);
      }
      if (localPair != null) {
        ThrottlingProducer.access$300(this$0).execute(new Runnable()
        {
          public void run()
          {
            ThrottlingProducer localThrottlingProducer = this$0;
            Pair localPair = localPair;
            localThrottlingProducer.produceResultsInternal((Consumer)first, (ProducerContext)second);
          }
        });
      }
      return;
    }
  }
  
  public void onCancellationImpl()
  {
    getConsumer().onCancellation();
    onRequestFinished();
  }
  
  public void onFailureImpl(Throwable paramThrowable)
  {
    getConsumer().onFailure(paramThrowable);
    onRequestFinished();
  }
  
  public void onNewResultImpl(T paramT, int paramInt)
  {
    getConsumer().onNewResult(paramT, paramInt);
    if (BaseConsumer.isLast(paramInt)) {
      onRequestFinished();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ThrottlingProducer.ThrottlerConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */