package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

class MultiplexProducer$Multiplexer$1
  extends BaseProducerContextCallbacks
{
  public MultiplexProducer$Multiplexer$1(MultiplexProducer.Multiplexer paramMultiplexer, Pair paramPair) {}
  
  public void onCancellationRequested()
  {
    synchronized (this$1)
    {
      boolean bool = MultiplexProducer.Multiplexer.access$200(this$1).remove(val$consumerContextPair);
      Object localObject1 = null;
      if (bool)
      {
        if (MultiplexProducer.Multiplexer.access$200(this$1).isEmpty())
        {
          localObject2 = MultiplexProducer.Multiplexer.access$300(this$1);
        }
        else
        {
          localObject2 = MultiplexProducer.Multiplexer.access$400(this$1);
          localList1 = MultiplexProducer.Multiplexer.access$500(this$1);
          localList2 = MultiplexProducer.Multiplexer.access$600(this$1);
          localObject4 = null;
          break label102;
        }
      }
      else {
        localObject2 = null;
      }
      List localList1 = null;
      List localList2 = null;
      Object localObject4 = localObject2;
      Object localObject2 = localObject1;
      label102:
      BaseProducerContext.callOnIsPrefetchChanged((List)localObject2);
      BaseProducerContext.callOnPriorityChanged(localList1);
      BaseProducerContext.callOnIsIntermediateResultExpectedChanged(localList2);
      if (localObject4 != null) {
        ((BaseProducerContext)localObject4).cancel();
      }
      if (bool) {
        ((Consumer)val$consumerContextPair.first).onCancellation();
      }
      return;
    }
  }
  
  public void onIsIntermediateResultExpectedChanged()
  {
    BaseProducerContext.callOnIsIntermediateResultExpectedChanged(MultiplexProducer.Multiplexer.access$600(this$1));
  }
  
  public void onIsPrefetchChanged()
  {
    BaseProducerContext.callOnIsPrefetchChanged(MultiplexProducer.Multiplexer.access$400(this$1));
  }
  
  public void onPriorityChanged()
  {
    BaseProducerContext.callOnPriorityChanged(MultiplexProducer.Multiplexer.access$500(this$1));
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.MultiplexProducer.Multiplexer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */