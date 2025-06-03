package e7;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import b0.f;
import com.google.android.gms.internal.measurement.zzgf.zzo.zza;
import d2.q;
import m6.j;

public final class o4
  extends j0
{
  public JobScheduler d;
  
  public o4(j2 paramj2)
  {
    super(paramj2);
  }
  
  public final boolean s()
  {
    return true;
  }
  
  public final void v(long paramLong)
  {
    t();
    l();
    Object localObject1 = d;
    if (localObject1 != null)
    {
      localObject2 = zza().getPackageName();
      localObject3 = new StringBuilder("measurement-client");
      ((StringBuilder)localObject3).append((String)localObject2);
      if (f.d((JobScheduler)localObject1, ((StringBuilder)localObject3).toString().hashCode()) != null)
      {
        zzjw.b("[sgtm] There's an existing pending job, skip this schedule.");
        return;
      }
    }
    Object localObject2 = w();
    if (localObject2 != zzgf.zzo.zza.zzb)
    {
      zzjw.c("[sgtm] Not eligible for Scion upload", ((Enum)localObject2).name());
      return;
    }
    zzjw.c("[sgtm] Scheduling Scion upload, millis", Long.valueOf(paramLong));
    localObject1 = new PersistableBundle();
    ((BaseBundle)localObject1).putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
    localObject2 = zza().getPackageName();
    Object localObject3 = new StringBuilder("measurement-client");
    ((StringBuilder)localObject3).append((String)localObject2);
    localObject3 = new JobInfo.Builder(((StringBuilder)localObject3).toString().hashCode(), new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(paramLong).setOverrideDeadline(paramLong << 1).setExtras((PersistableBundle)localObject1).build();
    localObject2 = d;
    j.i(localObject2);
    int i = ((JobScheduler)localObject2).schedule((JobInfo)localObject3);
    localObject3 = zzjw;
    if (i == 1) {
      localObject2 = "SUCCESS";
    } else {
      localObject2 = "FAILURE";
    }
    ((b1)localObject3).c("[sgtm] Scion upload job scheduled with result", localObject2);
  }
  
  public final zzgf.zzo.zza w()
  {
    t();
    l();
    if (!h().x(null, h0.M0)) {
      return zzgf.zzo.zza.zzi;
    }
    if (d == null) {
      return zzgf.zzo.zza.zzg;
    }
    Boolean localBoolean = h().v("google_analytics_sgtm_upload_enabled");
    boolean bool;
    if (localBoolean == null) {
      bool = false;
    } else {
      bool = localBoolean.booleanValue();
    }
    if (!bool) {
      return zzgf.zzo.zza.zzh;
    }
    if (!h().x(null, h0.O0)) {
      return zzgf.zzo.zza.zzf;
    }
    if (!r6.i0(zza(), "com.google.android.gms.measurement.AppMeasurementJobService")) {
      return zzgf.zzo.zza.zzc;
    }
    if (Build.VERSION.SDK_INT < 24) {
      return zzgf.zzo.zza.zzd;
    }
    if (!q().F()) {
      return zzgf.zzo.zza.zze;
    }
    return zzgf.zzo.zza.zzb;
  }
  
  public final void x()
  {
    d = ((JobScheduler)zza().getSystemService("jobscheduler"));
  }
}

/* Location:
 * Qualified Name:     e7.o4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */