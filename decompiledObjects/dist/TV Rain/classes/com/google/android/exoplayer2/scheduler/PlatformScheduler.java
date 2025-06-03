package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.PersistableBundle;
import androidx.annotation.RequiresPermission;
import com.google.android.exoplayer2.util.Util;
import z2;

@TargetApi(21)
public final class PlatformScheduler
  implements Scheduler
{
  private static final String KEY_REQUIREMENTS = "requirements";
  private static final String KEY_SERVICE_ACTION = "service_action";
  private static final String KEY_SERVICE_PACKAGE = "service_package";
  private static final String TAG = "PlatformScheduler";
  private final int jobId;
  private final JobScheduler jobScheduler;
  private final ComponentName jobServiceComponentName;
  
  @RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
  public PlatformScheduler(Context paramContext, int paramInt)
  {
    jobId = paramInt;
    jobServiceComponentName = new ComponentName(paramContext, PlatformSchedulerService.class);
    jobScheduler = ((JobScheduler)paramContext.getSystemService("jobscheduler"));
  }
  
  private static JobInfo buildJobInfo(int paramInt, ComponentName paramComponentName, Requirements paramRequirements, String paramString1, String paramString2)
  {
    paramComponentName = new JobInfo.Builder(paramInt, paramComponentName);
    int i = paramRequirements.getRequiredNetworkType();
    paramInt = 4;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i == 4)
            {
              if (Util.SDK_INT < 26) {
                throw new UnsupportedOperationException();
              }
            }
            else {
              throw new UnsupportedOperationException();
            }
          }
          else if (Util.SDK_INT >= 24) {
            paramInt = 3;
          } else {
            throw new UnsupportedOperationException();
          }
        }
        else {
          paramInt = 2;
        }
      }
      else {
        paramInt = 1;
      }
    }
    else {
      paramInt = 0;
    }
    paramComponentName.setRequiredNetworkType(paramInt);
    paramComponentName.setRequiresDeviceIdle(paramRequirements.isIdleRequired());
    paramComponentName.setRequiresCharging(paramRequirements.isChargingRequired());
    paramComponentName.setPersisted(true);
    PersistableBundle localPersistableBundle = new PersistableBundle();
    localPersistableBundle.putString("service_action", paramString1);
    localPersistableBundle.putString("service_package", paramString2);
    localPersistableBundle.putInt("requirements", paramRequirements.getRequirementsData());
    paramComponentName.setExtras(localPersistableBundle);
    return paramComponentName.build();
  }
  
  private static void logd(String paramString) {}
  
  public boolean cancel()
  {
    StringBuilder localStringBuilder = z2.t("Canceling job: ");
    localStringBuilder.append(jobId);
    logd(localStringBuilder.toString());
    jobScheduler.cancel(jobId);
    return true;
  }
  
  public boolean schedule(Requirements paramRequirements, String paramString1, String paramString2)
  {
    paramRequirements = buildJobInfo(jobId, jobServiceComponentName, paramRequirements, paramString2, paramString1);
    int i = jobScheduler.schedule(paramRequirements);
    paramRequirements = z2.t("Scheduling job: ");
    paramRequirements.append(jobId);
    paramRequirements.append(" result: ");
    paramRequirements.append(i);
    logd(paramRequirements.toString());
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public static final class PlatformSchedulerService
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.scheduler.PlatformScheduler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */