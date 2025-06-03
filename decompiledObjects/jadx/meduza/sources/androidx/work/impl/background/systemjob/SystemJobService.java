package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import l.l;
import o2.j;
import p2.d;
import p2.i0;
import p2.k0;
import p2.r;
import p2.x;
import y2.s;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final String f1519e = j.f("SystemJobService");

    /* renamed from: a, reason: collision with root package name */
    public k0 f1520a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1521b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final l f1522c = new l(2);

    /* renamed from: d, reason: collision with root package name */
    public i0 f1523d;

    public static class a {
        public static String[] a(JobParameters jobParameters) {
            String[] triggeredContentAuthorities;
            triggeredContentAuthorities = jobParameters.getTriggeredContentAuthorities();
            return triggeredContentAuthorities;
        }

        public static Uri[] b(JobParameters jobParameters) {
            Uri[] triggeredContentUris;
            triggeredContentUris = jobParameters.getTriggeredContentUris();
            return triggeredContentUris;
        }
    }

    public static class b {
        public static Network a(JobParameters jobParameters) {
            Network network;
            network = jobParameters.getNetwork();
            return network;
        }
    }

    public static class c {
        public static int a(JobParameters jobParameters) {
            int stopReason;
            stopReason = jobParameters.getStopReason();
            String str = SystemJobService.f1519e;
            switch (stopReason) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    return stopReason;
                default:
                    return -512;
            }
        }
    }

    public static x2.l b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new x2.l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p2.d
    public final void a(x2.l lVar, boolean z10) {
        JobParameters jobParameters;
        j.d().a(f1519e, lVar.f16820a + " executed on JobScheduler");
        synchronized (this.f1521b) {
            jobParameters = (JobParameters) this.f1521b.remove(lVar);
        }
        this.f1522c.f(lVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k0 d10 = k0.d(getApplicationContext());
            this.f1520a = d10;
            r rVar = d10.f;
            this.f1523d = new i0(rVar, d10.f12880d);
            rVar.a(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            j.d().g(f1519e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k0 k0Var = this.f1520a;
        if (k0Var != null) {
            r rVar = k0Var.f;
            synchronized (rVar.f12953k) {
                rVar.f12952j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f1520a == null) {
            j.d().a(f1519e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        x2.l b10 = b(jobParameters);
        if (b10 == null) {
            j.d().b(f1519e, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f1521b) {
            if (this.f1521b.containsKey(b10)) {
                j.d().a(f1519e, "Job is already being executed by SystemJobService: " + b10);
                return false;
            }
            j.d().a(f1519e, "onStartJob for " + b10);
            this.f1521b.put(b10, jobParameters);
            WorkerParameters.a aVar = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                aVar = new WorkerParameters.a();
                if (a.b(jobParameters) != null) {
                    aVar.f1441b = Arrays.asList(a.b(jobParameters));
                }
                if (a.a(jobParameters) != null) {
                    aVar.f1440a = Arrays.asList(a.a(jobParameters));
                }
                if (i10 >= 28) {
                    b.a(jobParameters);
                }
            }
            i0 i0Var = this.f1523d;
            i0Var.f12871b.d(new s(i0Var.f12870a, this.f1522c.h(b10), aVar));
            return true;
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f1520a == null) {
            j.d().a(f1519e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        x2.l b10 = b(jobParameters);
        if (b10 == null) {
            j.d().b(f1519e, "WorkSpec id not found!");
            return false;
        }
        j.d().a(f1519e, "onStopJob for " + b10);
        synchronized (this.f1521b) {
            this.f1521b.remove(b10);
        }
        x f = this.f1522c.f(b10);
        if (f != null) {
            int a10 = Build.VERSION.SDK_INT >= 31 ? c.a(jobParameters) : -512;
            i0 i0Var = this.f1523d;
            i0Var.getClass();
            i0Var.c(f, a10);
        }
        r rVar = this.f1520a.f;
        String str = b10.f16820a;
        synchronized (rVar.f12953k) {
            contains = rVar.f12951i.contains(str);
        }
        return !contains;
    }
}
