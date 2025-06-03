package androidx.core.app;

import android.os.AsyncTask;

final class JobIntentService$CommandProcessor
  extends AsyncTask<Void, Void, Void>
{
  public JobIntentService$CommandProcessor(JobIntentService paramJobIntentService) {}
  
  public Void doInBackground(Void... paramVarArgs)
  {
    for (;;)
    {
      paramVarArgs = this$0.dequeueWork();
      if (paramVarArgs == null) {
        break;
      }
      this$0.onHandleWork(paramVarArgs.getIntent());
      paramVarArgs.complete();
    }
    return null;
  }
  
  public void onCancelled(Void paramVoid)
  {
    this$0.processorFinished();
  }
  
  public void onPostExecute(Void paramVoid)
  {
    this$0.processorFinished();
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.JobIntentService.CommandProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */