package io.flutter.plugins.firebase.messaging;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.util.Log;
import c0.b;

final class JobIntentService$JobServiceEngineImpl$WrapperWorkItem
  implements JobIntentService.GenericWorkItem
{
  public final JobWorkItem mJobWork;
  
  public JobIntentService$JobServiceEngineImpl$WrapperWorkItem(JobIntentService.JobServiceEngineImpl paramJobServiceEngineImpl, JobWorkItem paramJobWorkItem)
  {
    mJobWork = paramJobWorkItem;
  }
  
  public void complete()
  {
    synchronized (this$0.mLock)
    {
      JobParameters localJobParameters = this$0.mParams;
      if (localJobParameters != null) {
        try
        {
          b.s(localJobParameters, mJobWork);
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          str = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
          Log.e("JobServiceEngineImpl", str, localIllegalArgumentException);
        }
        catch (SecurityException localSecurityException)
        {
          for (;;)
          {
            String str = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
          }
        }
      }
      return;
    }
  }
  
  public Intent getIntent()
  {
    return mJobWork.getIntent();
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.JobIntentService.JobServiceEngineImpl.WrapperWorkItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */