package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.BaseBundle;
import com.google.android.gms.internal.measurement.zzed;
import e7.a1;
import e7.b1;
import e7.e2;
import e7.h0;
import e7.i6;
import e7.j2;
import e7.m0;
import e7.m5;
import e7.o5;
import e7.x2;
import i6.t;
import java.util.Objects;
import l6.q0;
import m6.j;

public final class AppMeasurementJobService
  extends JobService
  implements o5
{
  public m5<AppMeasurementJobService> a;
  
  public final void a(Intent paramIntent) {}
  
  public final void b(JobParameters paramJobParameters)
  {
    jobFinished(paramJobParameters, false);
  }
  
  public final m5<AppMeasurementJobService> c()
  {
    if (a == null) {
      a = new m5(this);
    }
    return a;
  }
  
  public final void onCreate()
  {
    super.onCreate();
    aca, null, null).zzj().w.b("Local AppMeasurementService is starting up");
  }
  
  public final void onDestroy()
  {
    aca, null, null).zzj().w.b("Local AppMeasurementService is shutting down");
    super.onDestroy();
  }
  
  public final void onRebind(Intent paramIntent)
  {
    c().a(paramIntent);
  }
  
  public final boolean onStartJob(JobParameters paramJobParameters)
  {
    m5 localm5 = c();
    localm5.getClass();
    Object localObject1 = paramJobParameters.getExtras().getString("action");
    if (Objects.equals(localObject1, "com.google.android.gms.measurement.UPLOAD"))
    {
      j.i(localObject1);
      i6 locali6 = i6.f(a);
      Object localObject2 = locali6.zzj();
      w.c("Local AppMeasurementJobService called. action", localObject1);
      localObject2 = new x2(localm5, (a1)localObject2, paramJobParameters);
      locali6.zzl().u(new t(locali6, (Runnable)localObject2));
    }
    if (Objects.equals(localObject1, "com.google.android.gms.measurement.SCION_UPLOAD"))
    {
      j.i(localObject1);
      localObject1 = zzed.zza(a);
      if (((Boolean)h0.O0.a(null)).booleanValue()) {
        ((zzed)localObject1).zza(new q0(localm5, paramJobParameters, 5));
      }
    }
    return true;
  }
  
  public final boolean onStopJob(JobParameters paramJobParameters)
  {
    return false;
  }
  
  public final boolean onUnbind(Intent paramIntent)
  {
    c().c(paramIntent);
    return true;
  }
  
  public final boolean zza(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurementJobService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */