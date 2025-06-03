package com.google.android.gms.measurement;

import R2.i5;
import R2.m5;
import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;

@TargetApi(24)
public final class AppMeasurementJobService
  extends JobService
  implements m5
{
  public i5 o;
  
  public final i5 a()
  {
    if (o == null) {
      o = new i5(this);
    }
    return o;
  }
  
  public final boolean e(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void f(Intent paramIntent) {}
  
  public final void g(JobParameters paramJobParameters, boolean paramBoolean)
  {
    jobFinished(paramJobParameters, false);
  }
  
  public final void onCreate()
  {
    super.onCreate();
    a().c();
  }
  
  public final void onDestroy()
  {
    a().h();
    super.onDestroy();
  }
  
  public final void onRebind(Intent paramIntent)
  {
    a().i(paramIntent);
  }
  
  public final boolean onStartJob(JobParameters paramJobParameters)
  {
    return a().g(paramJobParameters);
  }
  
  public final boolean onStopJob(JobParameters paramJobParameters)
  {
    return false;
  }
  
  public final boolean onUnbind(Intent paramIntent)
  {
    return a().k(paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurementJobService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */