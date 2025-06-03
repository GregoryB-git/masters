package R2;

import A2.AbstractC0328n;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: R2.i5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531i5 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5343a;

    public C0531i5(Context context) {
        AbstractC0328n.i(context);
        this.f5343a = context;
    }

    public final int a(final Intent intent, int i7, final int i8) {
        final Y1 j7 = N2.c(this.f5343a, null, null).j();
        if (intent == null) {
            j7.L().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        j7.K().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i8), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable() { // from class: R2.k5
                @Override // java.lang.Runnable
                public final void run() {
                    C0531i5.this.d(i8, j7, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().G().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new R2(D5.k(this.f5343a));
        }
        j().L().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        N2.c(this.f5343a, null, null).j().K().a("Local AppMeasurementService is starting up");
    }

    public final /* synthetic */ void d(int i7, Y1 y12, Intent intent) {
        if (((InterfaceC0559m5) this.f5343a).e(i7)) {
            y12.K().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i7));
            j().K().a("Completed wakeful intent.");
            ((InterfaceC0559m5) this.f5343a).f(intent);
        }
    }

    public final /* synthetic */ void e(Y1 y12, JobParameters jobParameters) {
        y12.K().a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC0559m5) this.f5343a).g(jobParameters, false);
    }

    public final void f(Runnable runnable) {
        D5 k7 = D5.k(this.f5343a);
        k7.e().D(new RunnableC0538j5(this, k7, runnable));
    }

    public final boolean g(final JobParameters jobParameters) {
        final Y1 j7 = N2.c(this.f5343a, null, null).j();
        String string = jobParameters.getExtras().getString("action");
        j7.K().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new Runnable() { // from class: R2.h5
            @Override // java.lang.Runnable
            public final void run() {
                C0531i5.this.e(j7, jobParameters);
            }
        });
        return true;
    }

    public final void h() {
        N2.c(this.f5343a, null, null).j().K().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent intent) {
        if (intent == null) {
            j().G().a("onRebind called with null intent");
        } else {
            j().K().b("onRebind called. action", intent.getAction());
        }
    }

    public final Y1 j() {
        return N2.c(this.f5343a, null, null).j();
    }

    public final boolean k(Intent intent) {
        if (intent == null) {
            j().G().a("onUnbind called with null intent");
            return true;
        }
        j().K().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
