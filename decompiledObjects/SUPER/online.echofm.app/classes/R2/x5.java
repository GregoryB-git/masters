package R2;

import E2.e;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.i0;

public final class x5
  extends C5
{
  public final AlarmManager d = (AlarmManager)a().getSystemService("alarm");
  public x e;
  public Integer f;
  
  public x5(D5 paramD5)
  {
    super(paramD5);
  }
  
  private final void D()
  {
    JobScheduler localJobScheduler = (JobScheduler)a().getSystemService("jobscheduler");
    if (localJobScheduler != null) {
      localJobScheduler.cancel(A());
    }
  }
  
  public final int A()
  {
    if (f == null)
    {
      String str = a().getPackageName();
      StringBuilder localStringBuilder = new StringBuilder("measurement");
      localStringBuilder.append(str);
      f = Integer.valueOf(localStringBuilder.toString().hashCode());
    }
    return f.intValue();
  }
  
  public final PendingIntent B()
  {
    Context localContext = a();
    return g0.a(localContext, 0, new Intent().setClassName(localContext, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), g0.b);
  }
  
  public final x C()
  {
    if (e == null) {
      e = new A5(this, b.i0());
    }
    return e;
  }
  
  public final boolean x()
  {
    AlarmManager localAlarmManager = d;
    if (localAlarmManager != null) {
      localAlarmManager.cancel(B());
    }
    if (Build.VERSION.SDK_INT >= 24) {
      D();
    }
    return false;
  }
  
  public final void y(long paramLong)
  {
    u();
    Object localObject = a();
    if (!S5.c0((Context)localObject)) {
      j().F().a("Receiver not registered/enabled");
    }
    if (!S5.d0((Context)localObject, false)) {
      j().F().a("Service not registered/enabled");
    }
    z();
    j().K().b("Scheduling upload, millis", Long.valueOf(paramLong));
    long l = b().b();
    if ((paramLong < Math.max(0L, ((Long)K.z.a(null)).longValue())) && (!C().e())) {
      C().b(paramLong);
    }
    if (Build.VERSION.SDK_INT >= 24)
    {
      localObject = a();
      ComponentName localComponentName = new ComponentName((Context)localObject, "com.google.android.gms.measurement.AppMeasurementJobService");
      int i = A();
      PersistableBundle localPersistableBundle = new PersistableBundle();
      localPersistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
      i0.c((Context)localObject, new JobInfo.Builder(i, localComponentName).setMinimumLatency(paramLong).setOverrideDeadline(paramLong << 1).setExtras(localPersistableBundle).build(), "com.google.android.gms", "UploadAlarm");
      return;
    }
    localObject = d;
    if (localObject != null) {
      ((AlarmManager)localObject).setInexactRepeating(2, l + paramLong, Math.max(((Long)K.u.a(null)).longValue(), paramLong), B());
    }
  }
  
  public final void z()
  {
    u();
    j().K().a("Unscheduling upload");
    AlarmManager localAlarmManager = d;
    if (localAlarmManager != null) {
      localAlarmManager.cancel(B());
    }
    C().a();
    if (Build.VERSION.SDK_INT >= 24) {
      D();
    }
  }
}

/* Location:
 * Qualified Name:     R2.x5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */