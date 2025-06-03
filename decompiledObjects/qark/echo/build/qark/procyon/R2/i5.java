// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import android.app.job.JobParameters;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.H0;
import android.content.Intent;
import A2.n;
import android.content.Context;

public final class i5
{
    public final Context a;
    
    public i5(final Context a) {
        n.i(a);
        this.a = a;
    }
    
    public final int a(final Intent intent, final int n, final int i) {
        final Y1 j = N2.c(this.a, null, null).j();
        if (intent == null) {
            j.L().a("AppMeasurementService started with null intent");
            return 2;
        }
        final String action = intent.getAction();
        j.K().c("Local AppMeasurementService called. startId, action", i, action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            this.f(new k5(this, i, j, intent));
        }
        return 2;
    }
    
    public final IBinder b(final Intent intent) {
        if (intent == null) {
            this.j().G().a("onBind called with null intent");
            return null;
        }
        final String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return (IBinder)new R2(D5.k(this.a));
        }
        this.j().L().b("onBind received unknown action", action);
        return null;
    }
    
    public final void c() {
        N2.c(this.a, null, null).j().K().a("Local AppMeasurementService is starting up");
    }
    
    public final void f(final Runnable runnable) {
        final D5 k = D5.k(this.a);
        k.e().D(new j5(this, k, runnable));
    }
    
    public final boolean g(final JobParameters jobParameters) {
        final Y1 j = N2.c(this.a, null, null).j();
        final String string = ((BaseBundle)jobParameters.getExtras()).getString("action");
        j.K().b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            this.f(new h5(this, j, jobParameters));
        }
        return true;
    }
    
    public final void h() {
        N2.c(this.a, null, null).j().K().a("Local AppMeasurementService is shutting down");
    }
    
    public final void i(final Intent intent) {
        if (intent == null) {
            this.j().G().a("onRebind called with null intent");
            return;
        }
        this.j().K().b("onRebind called. action", intent.getAction());
    }
    
    public final Y1 j() {
        return N2.c(this.a, null, null).j();
    }
    
    public final boolean k(final Intent intent) {
        if (intent == null) {
            this.j().G().a("onUnbind called with null intent");
            return true;
        }
        this.j().K().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
