package io.flutter.plugins.firebase.messaging;

import O5.H;
import O5.I;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public final class a$h
  extends a.i
{
  public final JobInfo d;
  public final JobScheduler e;
  
  public a$h(Context paramContext, ComponentName paramComponentName, int paramInt)
  {
    super(paramComponentName);
    b(paramInt);
    d = new JobInfo.Builder(paramInt, a).setOverrideDeadline(0L).build();
    e = ((JobScheduler)paramContext.getApplicationContext().getSystemService("jobscheduler"));
  }
  
  public void a(Intent paramIntent)
  {
    H.a(e, d, I.a(paramIntent));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.a.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */