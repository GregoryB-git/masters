package io.flutter.plugins.firebase.messaging;

import android.os.Handler;

class JobIntentService$CommandProcessor$1
  implements Runnable
{
  public JobIntentService$CommandProcessor$1(JobIntentService.CommandProcessor paramCommandProcessor) {}
  
  public void run()
  {
    for (;;)
    {
      JobIntentService.GenericWorkItem localGenericWorkItem = this$1.this$0.dequeueWork();
      if (localGenericWorkItem == null) {
        break;
      }
      this$1.this$0.onHandleWork(localGenericWorkItem.getIntent());
      localGenericWorkItem.complete();
    }
    JobIntentService.CommandProcessor.access$000(this$1).post(new Runnable()
    {
      public void run()
      {
        this$1.this$0.processorFinished();
      }
    });
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.JobIntentService.CommandProcessor.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */