package e7;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzgf;

/* loaded from: classes.dex */
public final class o4 extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public JobScheduler f4549d;

    public o4(j2 j2Var) {
        super(j2Var);
    }

    @Override // e7.j0
    public final boolean s() {
        return true;
    }

    public final void v(long j10) {
        JobInfo pendingJob;
        t();
        l();
        JobScheduler jobScheduler = this.f4549d;
        if (jobScheduler != null) {
            pendingJob = jobScheduler.getPendingJob(("measurement-client" + zza().getPackageName()).hashCode());
            if (pendingJob != null) {
                zzj().f4067w.b("[sgtm] There's an existing pending job, skip this schedule.");
                return;
            }
        }
        zzgf.zzo.zza w10 = w();
        if (w10 != zzgf.zzo.zza.CLIENT_UPLOAD_ELIGIBLE) {
            zzj().f4067w.c("[sgtm] Not eligible for Scion upload", w10.name());
            return;
        }
        zzj().f4067w.c("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo build = new JobInfo.Builder(("measurement-client" + zza().getPackageName()).hashCode(), new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f4549d;
        m6.j.i(jobScheduler2);
        zzj().f4067w.c("[sgtm] Scion upload job scheduled with result", jobScheduler2.schedule(build) == 1 ? "SUCCESS" : "FAILURE");
    }

    public final zzgf.zzo.zza w() {
        t();
        l();
        if (!h().x(null, h0.M0)) {
            return zzgf.zzo.zza.CLIENT_FLAG_OFF;
        }
        if (this.f4549d == null) {
            return zzgf.zzo.zza.MISSING_JOB_SCHEDULER;
        }
        Boolean v10 = h().v("google_analytics_sgtm_upload_enabled");
        return !(v10 == null ? false : v10.booleanValue()) ? zzgf.zzo.zza.NOT_ENABLED_IN_MANIFEST : !h().x(null, h0.O0) ? zzgf.zzo.zza.SDK_TOO_OLD : !r6.i0(zza(), "com.google.android.gms.measurement.AppMeasurementJobService") ? zzgf.zzo.zza.MEASUREMENT_SERVICE_NOT_ENABLED : Build.VERSION.SDK_INT < 24 ? zzgf.zzo.zza.ANDROID_TOO_OLD : !q().F() ? zzgf.zzo.zza.NON_PLAY_MODE : zzgf.zzo.zza.CLIENT_UPLOAD_ELIGIBLE;
    }

    public final void x() {
        this.f4549d = (JobScheduler) zza().getSystemService("jobscheduler");
    }
}
