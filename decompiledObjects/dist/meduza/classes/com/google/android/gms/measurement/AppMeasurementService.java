package com.google.android.gms.measurement;

import a1.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzig;
import e7.a1;
import e7.b1;
import e7.e2;
import e7.i6;
import e7.j2;
import e7.m5;
import e7.n5;
import e7.o5;
import i6.t;

public final class AppMeasurementService
  extends Service
  implements o5
{
  public m5<AppMeasurementService> a;
  
  public final void a(Intent arg1)
  {
    Object localObject1 = a.a;
    int i = ???.getIntExtra("androidx.contentpager.content.wakelockid", 0);
    if (i != 0) {}
    synchronized (a.a)
    {
      localObject1 = (PowerManager.WakeLock)???.get(i);
      if (localObject1 != null)
      {
        ((PowerManager.WakeLock)localObject1).release();
        ???.remove(i);
      }
      for (;;)
      {
        break;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("No active wake lock id #");
        ((StringBuilder)localObject1).append(i);
        Log.w("WakefulBroadcastReceiv.", ((StringBuilder)localObject1).toString());
      }
      return;
    }
  }
  
  public final void b(JobParameters paramJobParameters)
  {
    throw new UnsupportedOperationException();
  }
  
  public final m5<AppMeasurementService> c()
  {
    if (a == null) {
      a = new m5(this);
    }
    return a;
  }
  
  public final IBinder onBind(Intent paramIntent)
  {
    m5 localm5 = c();
    Object localObject = null;
    if (paramIntent == null)
    {
      bo.b("onBind called with null intent");
      paramIntent = (Intent)localObject;
    }
    else
    {
      localm5.getClass();
      paramIntent = paramIntent.getAction();
      if ("com.google.android.gms.measurement.START".equals(paramIntent))
      {
        paramIntent = new zzig(i6.f(a));
      }
      else
      {
        br.c("onBind received unknown action", paramIntent);
        paramIntent = (Intent)localObject;
      }
    }
    return paramIntent;
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
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Object localObject = c();
    a1 locala1 = j2.a(a, null, null).zzj();
    if (paramIntent == null)
    {
      r.b("AppMeasurementService started with null intent");
    }
    else
    {
      String str = paramIntent.getAction();
      w.d("Local AppMeasurementService called. startId, action", Integer.valueOf(paramInt2), str);
      if ("com.google.android.gms.measurement.UPLOAD".equals(str))
      {
        paramIntent = new n5((m5)localObject, paramInt2, locala1, paramIntent);
        localObject = i6.f(a);
        ((i6)localObject).zzl().u(new t((i6)localObject, paramIntent));
      }
    }
    return 2;
  }
  
  public final boolean onUnbind(Intent paramIntent)
  {
    c().c(paramIntent);
    return true;
  }
  
  public final boolean zza(int paramInt)
  {
    return stopSelfResult(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.measurement.AppMeasurementService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */