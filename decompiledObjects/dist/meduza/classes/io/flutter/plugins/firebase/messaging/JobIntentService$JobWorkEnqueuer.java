package io.flutter.plugins.firebase.messaging;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

final class JobIntentService$JobWorkEnqueuer
  extends JobIntentService.WorkEnqueuer
{
  private final JobInfo mJobInfo;
  private final JobScheduler mJobScheduler;
  
  public JobIntentService$JobWorkEnqueuer(Context paramContext, ComponentName paramComponentName, int paramInt)
  {
    super(paramComponentName);
    ensureJobId(paramInt);
    mJobInfo = new JobInfo.Builder(paramInt, mComponentName).setOverrideDeadline(0L).build();
    mJobScheduler = ((JobScheduler)paramContext.getApplicationContext().getSystemService("jobscheduler"));
  }
  
  public void enqueueWork(Intent paramIntent)
  {
    mJobScheduler.enqueue(mJobInfo, new JobWorkItem(paramIntent));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.JobIntentService.JobWorkEnqueuer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */