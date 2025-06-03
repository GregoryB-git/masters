package e7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.google.android.gms.internal.measurement.zzcy;
import d2.q;

public final class x5
  extends h6
{
  public final AlarmManager e = (AlarmManager)zza().getSystemService("alarm");
  public s5 f;
  public Integer o;
  
  public x5(i6 parami6)
  {
    super(parami6);
  }
  
  public final boolean r()
  {
    Object localObject = e;
    if (localObject != null) {
      ((AlarmManager)localObject).cancel(u());
    }
    if (Build.VERSION.SDK_INT >= 24)
    {
      localObject = (JobScheduler)zza().getSystemService("jobscheduler");
      if (localObject != null) {
        ((JobScheduler)localObject).cancel(t());
      }
    }
    return false;
  }
  
  public final void s()
  {
    p();
    zzjw.b("Unscheduling upload");
    Object localObject = e;
    if (localObject != null) {
      ((AlarmManager)localObject).cancel(u());
    }
    v().a();
    if (Build.VERSION.SDK_INT >= 24)
    {
      localObject = (JobScheduler)zza().getSystemService("jobscheduler");
      if (localObject != null) {
        ((JobScheduler)localObject).cancel(t());
      }
    }
  }
  
  public final int t()
  {
    if (o == null)
    {
      String str = zza().getPackageName();
      StringBuilder localStringBuilder = new StringBuilder("measurement");
      localStringBuilder.append(str);
      o = Integer.valueOf(localStringBuilder.toString().hashCode());
    }
    return o.intValue();
  }
  
  public final PendingIntent u()
  {
    Context localContext = zza();
    return zzcy.zza(localContext, 0, new Intent().setClassName(localContext, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcy.zza);
  }
  
  public final v v()
  {
    if (f == null) {
      f = new s5(this, c.t, 1);
    }
    return f;
  }
}

/* Location:
 * Qualified Name:     e7.x5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */