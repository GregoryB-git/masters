package e7;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzeb;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k3 f4326a;

    public i4(k3 k3Var) {
        this.f4326a = k3Var;
    }

    public final void a(zzeb zzebVar) {
        s4 p10 = this.f4326a.p();
        synchronized (p10.f4647u) {
            if (Objects.equals(p10.f4643p, zzebVar)) {
                p10.f4643p = null;
            }
        }
        if (p10.h().A()) {
            p10.f4642o.remove(Integer.valueOf(zzebVar.zza));
        }
    }

    public final void b(zzeb zzebVar, Bundle bundle) {
        try {
            try {
                this.f4326a.zzj().f4067w.b("onActivityCreated");
                Intent intent = zzebVar.zzc;
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                            }
                        }
                        data = null;
                    }
                    Uri uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        this.f4326a.k();
                        this.f4326a.zzl().u(new n3(this, bundle == null, uri, r6.S(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                    }
                }
            } catch (RuntimeException e10) {
                this.f4326a.zzj().f4060o.c("Throwable caught in onActivityCreated", e10);
            }
        } finally {
            this.f4326a.p().w(zzebVar, bundle);
        }
    }

    public final void c(zzeb zzebVar) {
        int i10;
        s4 p10 = this.f4326a.p();
        synchronized (p10.f4647u) {
            p10.t = false;
            i10 = 1;
            p10.f4644q = true;
        }
        ((b.z) p10.zzb()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (p10.h().A()) {
            q4 A = p10.A(zzebVar);
            p10.f4641e = p10.f4640d;
            p10.f4640d = null;
            p10.zzl().u(new s3(p10, A, elapsedRealtime));
        } else {
            p10.f4640d = null;
            p10.zzl().u(new v4(p10, elapsedRealtime));
        }
        q5 r10 = this.f4326a.r();
        ((b.z) r10.zzb()).getClass();
        r10.zzl().u(new i0(r10, SystemClock.elapsedRealtime(), i10));
    }

    public final void d(zzeb zzebVar, Bundle bundle) {
        q4 q4Var;
        s4 p10 = this.f4326a.p();
        if (!p10.h().A() || bundle == null || (q4Var = (q4) p10.f4642o.get(Integer.valueOf(zzebVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", q4Var.f4591c);
        bundle2.putString("name", q4Var.f4589a);
        bundle2.putString("referrer_name", q4Var.f4590b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void e(zzeb zzebVar) {
        int i10;
        q5 r10 = this.f4326a.r();
        ((b.z) r10.zzb()).getClass();
        r10.zzl().u(new p5(r10, SystemClock.elapsedRealtime()));
        s4 p10 = this.f4326a.p();
        synchronized (p10.f4647u) {
            p10.t = true;
            i10 = 0;
            if (!Objects.equals(zzebVar, p10.f4643p)) {
                synchronized (p10.f4647u) {
                    p10.f4643p = zzebVar;
                    p10.f4644q = false;
                }
                if (p10.h().A()) {
                    p10.f4645r = null;
                    p10.zzl().u(new t4(p10, 1));
                }
            }
        }
        if (!p10.h().A()) {
            p10.f4640d = p10.f4645r;
            p10.zzl().u(new t4(p10, 0));
            return;
        }
        p10.z(zzebVar.zzb, p10.A(zzebVar), false);
        a aVar = ((j2) p10.f3407b).f4374y;
        if (aVar == null) {
            throw new IllegalStateException("Component not created");
        }
        ((b.z) aVar.zzb()).getClass();
        aVar.zzl().u(new i0(aVar, SystemClock.elapsedRealtime(), i10));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(zzeb.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(zzeb.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(zzeb.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(zzeb.zza(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        d(zzeb.zza(activity), bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
