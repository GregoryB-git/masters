package com.google.android.gms.measurement;

import R2.i5;
import R2.m5;
import V.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;

public final class AppMeasurementService
  extends Service
  implements m5
{
  public i5 o;
  
  private final i5 a()
  {
    if (o == null) {
      o = new i5(this);
    }
    return o;
  }
  
  public final boolean e(int paramInt)
  {
    return stopSelfResult(paramInt);
  }
  
  public final void f(Intent paramIntent)
  {
    a.b(paramIntent);
  }
  
  public final void g(JobParameters paramJobParameters, boolean paramBoolean)
  {
    throw new UnsupportedOperationException();
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    return a().b(paramIntent);
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
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return a().a(paramIntent, paramInt1, paramInt2);
  }
  
  public final boolean onUnbind(Intent paramIntent)
  {
    return a().k(paramIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurementService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */