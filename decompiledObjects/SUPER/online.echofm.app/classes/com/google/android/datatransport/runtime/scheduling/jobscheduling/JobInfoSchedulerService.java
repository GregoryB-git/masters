package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.BaseBundle;
import android.util.Base64;
import f2.p;
import f2.p.a;
import f2.u;
import m2.e;
import m2.r;
import q2.a;

public class JobInfoSchedulerService
  extends JobService
{
  public boolean onStartJob(JobParameters paramJobParameters)
  {
    Object localObject = paramJobParameters.getExtras().getString("backendName");
    String str = paramJobParameters.getExtras().getString("extras");
    int i = paramJobParameters.getExtras().getInt("priority");
    int j = paramJobParameters.getExtras().getInt("attemptNumber");
    u.f(getApplicationContext());
    localObject = p.a().b((String)localObject).d(a.b(i));
    if (str != null) {
      ((p.a)localObject).c(Base64.decode(str, 0));
    }
    u.c().e().v(((p.a)localObject).a(), j, new e(this, paramJobParameters));
    return true;
  }
  
  public boolean onStopJob(JobParameters paramJobParameters)
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */