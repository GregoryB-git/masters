package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.internal.Preconditions;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public class ThrottlingProducer<T>
  implements Producer<T>
{
  public static final String PRODUCER_NAME = "ThrottlingProducer";
  private final Executor mExecutor;
  private final Producer<T> mInputProducer;
  private final int mMaxSimultaneousRequests;
  @GuardedBy("this")
  private int mNumCurrentRequests;
  @GuardedBy("this")
  private final ConcurrentLinkedQueue<Pair<Consumer<T>, ProducerContext>> mPendingRequests;
  
  public ThrottlingProducer(int paramInt, Executor paramExecutor, Producer<T> paramProducer)
  {
    mMaxSimultaneousRequests = paramInt;
    mExecutor = ((Executor)Preconditions.checkNotNull(paramExecutor));
    mInputProducer = ((Producer)Preconditions.checkNotNull(paramProducer));
    mPendingRequests = new ConcurrentLinkedQueue();
    mNumCurrentRequests = 0;
  }
  
  public void produceResults(Consumer<T> paramConsumer, ProducerContext paramProducerContext)
  {
    paramProducerContext.getListener().onProducerStart(paramProducerContext.getId(), "ThrottlingProducer");
    try
    {
      int i = mNumCurrentRequests;
      int j = mMaxSimultaneousRequests;
      int k = 1;
      if (i >= j)
      {
        mPendingRequests.add(Pair.create(paramConsumer, paramProducerContext));
      }
      else
      {
        mNumCurrentRequests = (i + 1);
        k = 0;
      }
      if (k == 0) {
        produceResultsInternal(paramConsumer, paramProducerContext);
      }
      return;
    }
    finally {}
  }
  
  public void produceResultsInternal(Consumer<T> paramConsumer, ProducerContext paramProducerContext)
  {
    paramProducerContext.getListener().onProducerFinishWithSuccess(paramProducerContext.getId(), "ThrottlingProducer", null);
    mInputProducer.produceResults(new ThrottlerConsumer(paramConsumer, null), paramProducerContext);
  }
  
  public class ThrottlerConsumer
    extends DelegatingConsumer<T, T>
  {
    private ThrottlerConsumer()
    {
      super();
    }
    
    private void onRequestFinished()
    {
      synchronized (ThrottlingProducer.this)
      {
        final Pair localPair = (Pair)ThrottlingProducer.access$100(ThrottlingProducer.this).poll();
        if (localPair == null) {
          ThrottlingProducer.access$210(ThrottlingProducer.this);
        }
        if (localPair != null) {
          ThrottlingProducer.access$300(ThrottlingProducer.this).execute(new Runnable()
          {
            public void run()
            {
              ThrottlingProducer localThrottlingProducer = ThrottlingProducer.this;
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
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ThrottlingProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */