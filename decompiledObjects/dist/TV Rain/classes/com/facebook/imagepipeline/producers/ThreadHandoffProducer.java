package com.facebook.imagepipeline.producers;

import com.facebook.common.executors.StatefulRunnable;
import com.facebook.common.internal.Preconditions;

public class ThreadHandoffProducer<T>
  implements Producer<T>
{
  public static final String PRODUCER_NAME = "BackgroundThreadHandoffProducer";
  private final Producer<T> mInputProducer;
  private final ThreadHandoffProducerQueue mThreadHandoffProducerQueue;
  
  public ThreadHandoffProducer(Producer<T> paramProducer, ThreadHandoffProducerQueue paramThreadHandoffProducerQueue)
  {
    mInputProducer = ((Producer)Preconditions.checkNotNull(paramProducer));
    mThreadHandoffProducerQueue = paramThreadHandoffProducerQueue;
  }
  
  public void produceResults(final Consumer<T> paramConsumer, final ProducerContext paramProducerContext)
  {
    final ProducerListener localProducerListener = paramProducerContext.getListener();
    final String str = paramProducerContext.getId();
    paramConsumer = new StatefulProducerRunnable(paramConsumer, localProducerListener, "BackgroundThreadHandoffProducer", str)
    {
      public void disposeResult(T paramAnonymousT) {}
      
      public T getResult()
        throws Exception
      {
        return null;
      }
      
      public void onSuccess(T paramAnonymousT)
      {
        localProducerListener.onProducerFinishWithSuccess(str, "BackgroundThreadHandoffProducer", null);
        ThreadHandoffProducer.access$000(ThreadHandoffProducer.this).produceResults(paramConsumer, paramProducerContext);
      }
    };
    paramProducerContext.addCallbacks(new BaseProducerContextCallbacks()
    {
      public void onCancellationRequested()
      {
        paramConsumer.cancel();
        ThreadHandoffProducer.access$100(ThreadHandoffProducer.this).remove(paramConsumer);
      }
    });
    mThreadHandoffProducerQueue.addToQueueOrExecute(paramConsumer);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ThreadHandoffProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */