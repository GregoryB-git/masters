package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.BaseBundle;
import android.util.Base64;
import java.util.concurrent.Executor;
import k3.j.a;
import k3.s;
import k3.w;
import q3.k;
import u3.a;

public class JobInfoSchedulerService
  extends JobService
{
  public final boolean onStartJob(JobParameters paramJobParameters)
  {
    String str = paramJobParameters.getExtras().getString("backendName");
    Object localObject1 = paramJobParameters.getExtras().getString("extras");
    int i = paramJobParameters.getExtras().getInt("priority");
    int j = paramJobParameters.getExtras().getInt("attemptNumber");
    w.b(getApplicationContext());
    Object localObject2 = s.a();
    ((j.a)localObject2).b(str);
    ((j.a)localObject2).c(a.b(i));
    if (localObject1 != null) {
      b = Base64.decode((String)localObject1, 0);
    }
    localObject1 = ad;
    localObject2 = ((j.a)localObject2).a();
    paramJobParameters = new x0.f(5, this, paramJobParameters);
    e.execute(new q3.f(localObject1, localObject2, j, paramJobParameters, 0));
    return true;
  }
  
  public final boolean onStopJob(JobParameters paramJobParameters)
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */