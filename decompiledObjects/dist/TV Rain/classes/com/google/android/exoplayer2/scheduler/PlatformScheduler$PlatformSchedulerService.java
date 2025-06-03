package com.google.android.exoplayer2.scheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.BaseBundle;
import com.google.android.exoplayer2.util.Util;

public final class PlatformScheduler$PlatformSchedulerService
  extends JobService
{
  public boolean onStartJob(JobParameters paramJobParameters)
  {
    PlatformScheduler.access$000("PlatformSchedulerService started");
    Object localObject = paramJobParameters.getExtras();
    if (new Requirements(((BaseBundle)localObject).getInt("requirements")).checkRequirements(this))
    {
      PlatformScheduler.access$000("Requirements are met");
      paramJobParameters = ((BaseBundle)localObject).getString("service_action");
      String str = ((BaseBundle)localObject).getString("service_package");
      Intent localIntent = new Intent(paramJobParameters).setPackage(str);
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Starting service action: ");
      ((StringBuilder)localObject).append(paramJobParameters);
      ((StringBuilder)localObject).append(" package: ");
      ((StringBuilder)localObject).append(str);
      PlatformScheduler.access$000(((StringBuilder)localObject).toString());
      Util.startForegroundService(this, localIntent);
    }
    else
    {
      PlatformScheduler.access$000("Requirements are not met");
      jobFinished(paramJobParameters, true);
    }
    return false;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.scheduler.PlatformScheduler.PlatformSchedulerService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */