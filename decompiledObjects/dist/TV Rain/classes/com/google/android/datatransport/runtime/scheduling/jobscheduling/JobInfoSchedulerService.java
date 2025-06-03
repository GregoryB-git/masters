package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.BaseBundle;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.TransportContext.Builder;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import q5;

@RequiresApi(api=21)
public class JobInfoSchedulerService
  extends JobService
{
  public boolean onStartJob(JobParameters paramJobParameters)
  {
    Object localObject = paramJobParameters.getExtras().getString("backendName");
    String str = paramJobParameters.getExtras().getString("extras");
    int i = paramJobParameters.getExtras().getInt("priority");
    int j = paramJobParameters.getExtras().getInt("attemptNumber");
    TransportRuntime.initialize(getApplicationContext());
    localObject = TransportContext.builder().setBackendName((String)localObject).setPriority(PriorityMapping.valueOf(i));
    if (str != null) {
      ((TransportContext.Builder)localObject).setExtras(Base64.decode(str, 0));
    }
    TransportRuntime.getInstance().getUploader().upload(((TransportContext.Builder)localObject).build(), j, new q5(this, paramJobParameters, 2));
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