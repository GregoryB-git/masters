package com.facebook.imagepipeline.producers;

import com.facebook.common.executors.StatefulRunnable;

class ThreadHandoffProducer$2
  extends BaseProducerContextCallbacks
{
  public ThreadHandoffProducer$2(ThreadHandoffProducer paramThreadHandoffProducer, StatefulProducerRunnable paramStatefulProducerRunnable) {}
  
  public void onCancellationRequested()
  {
    val$statefulRunnable.cancel();
    ThreadHandoffProducer.access$100(this$0).remove(val$statefulRunnable);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.ThreadHandoffProducer.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */