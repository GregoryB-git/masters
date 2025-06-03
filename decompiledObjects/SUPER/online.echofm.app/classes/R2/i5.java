package R2;

import A2.n;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.IBinder;

public final class i5
{
  public final Context a;
  
  public i5(Context paramContext)
  {
    n.i(paramContext);
    a = paramContext;
  }
  
  public final int a(Intent paramIntent, int paramInt1, int paramInt2)
  {
    Y1 localY1 = N2.c(a, null, null).j();
    if (paramIntent == null)
    {
      localY1.L().a("AppMeasurementService started with null intent");
      return 2;
    }
    String str = paramIntent.getAction();
    localY1.K().c("Local AppMeasurementService called. startId, action", Integer.valueOf(paramInt2), str);
    if ("com.google.android.gms.measurement.UPLOAD".equals(str)) {
      f(new k5(this, paramInt2, localY1, paramIntent));
    }
    return 2;
  }
  
  public final IBinder b(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      j().G().a("onBind called with null intent");
      return null;
    }
    paramIntent = paramIntent.getAction();
    if ("com.google.android.gms.measurement.START".equals(paramIntent)) {
      return new R2(D5.k(a));
    }
    j().L().b("onBind received unknown action", paramIntent);
    return null;
  }
  
  public final void c()
  {
    N2.c(a, null, null).j().K().a("Local AppMeasurementService is starting up");
  }
  
  public final void f(Runnable paramRunnable)
  {
    D5 localD5 = D5.k(a);
    localD5.e().D(new j5(this, localD5, paramRunnable));
  }
  
  public final boolean g(JobParameters paramJobParameters)
  {
    Y1 localY1 = N2.c(a, null, null).j();
    String str = paramJobParameters.getExtras().getString("action");
    localY1.K().b("Local AppMeasurementJobService called. action", str);
    if ("com.google.android.gms.measurement.UPLOAD".equals(str)) {
      f(new h5(this, localY1, paramJobParameters));
    }
    return true;
  }
  
  public final void h()
  {
    N2.c(a, null, null).j().K().a("Local AppMeasurementService is shutting down");
  }
  
  public final void i(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      j().G().a("onRebind called with null intent");
      return;
    }
    paramIntent = paramIntent.getAction();
    j().K().b("onRebind called. action", paramIntent);
  }
  
  public final Y1 j()
  {
    return N2.c(a, null, null).j();
  }
  
  public final boolean k(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      j().G().a("onUnbind called with null intent");
      return true;
    }
    paramIntent = paramIntent.getAction();
    j().K().b("onUnbind called for intent. action", paramIntent);
    return true;
  }
}

/* Location:
 * Qualified Name:     R2.i5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */