package com.facebook.imagepipeline.producers;

import android.util.Pair;

class ThrottlingProducer$ThrottlerConsumer$1
  implements Runnable
{
  public ThrottlingProducer$ThrottlerConsumer$1(ThrottlingProducer.ThrottlerConsumer paramThrottlerConsumer, Pair paramPair) {}
  
  public void run()
  {
    ThrottlingProducer localThrottlingProducer = this$1.this$0;
    Pair localPair = val$nextRequestPair;
    localThrottlingProducer.produceResultsInternal((Consumer)first, (ProducerContext)second);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ThrottlingProducer.ThrottlerConsumer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */