package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;
import f0;

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
        f0.r(localJobParameters, mJobWork);
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
 * Qualified Name:     androidx.core.app.JobIntentService.JobServiceEngineImpl.WrapperWorkItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */