package io.flutter.plugins.firebase.messaging;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

final class JobIntentService$CommandProcessor
{
  private final Executor executor = Executors.newSingleThreadExecutor();
  private final Handler handler = new Handler(Looper.getMainLooper());
  
  public JobIntentService$CommandProcessor(JobIntentService paramJobIntentService) {}
  
  public void cancel()
  {
    this$0.processorFinished();
  }
  
  public void execute()
  {
    executor.execute(new Runnable()
    {
      public void run()
      {
        for (;;)
        {
          JobIntentService.GenericWorkItem localGenericWorkItem = this$0.dequeueWork();
          if (localGenericWorkItem == null) {
            break;
          }
          this$0.onHandleWork(localGenericWorkItem.getIntent());
          localGenericWorkItem.complete();
        }
        JobIntentService.CommandProcessor.access$000(JobIntentService.CommandProcessor.this).post(new Runnable()
        {
          public void run()
          {
            this$0.processorFinished();
          }
        });
      }
    });
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.JobIntentService.CommandProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */