package R2;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C1024s7;
import com.google.android.gms.internal.measurement.C1032t6;

/* renamed from: R2.t5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607t5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0552l5 f5544a;

    public C0607t5(C0552l5 c0552l5) {
        this.f5544a = c0552l5;
    }

    public final void a() {
        this.f5544a.n();
        if (this.f5544a.i().y(this.f5544a.b().a())) {
            this.f5544a.i().f5395l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f5544a.j().K().a("Detected application was in foreground");
                c(this.f5544a.b().a(), false);
            }
        }
    }

    public final void b(long j7, boolean z7) {
        this.f5544a.n();
        this.f5544a.G();
        if (this.f5544a.i().y(j7)) {
            this.f5544a.i().f5395l.a(true);
            if (C1024s7.a() && this.f5544a.f().s(K.f4867x0)) {
                this.f5544a.p().I();
            }
        }
        this.f5544a.i().f5399p.b(j7);
        if (this.f5544a.i().f5395l.b()) {
            c(j7, z7);
        }
    }

    public final void c(long j7, boolean z7) {
        this.f5544a.n();
        if (this.f5544a.f5424a.p()) {
            this.f5544a.i().f5399p.b(j7);
            this.f5544a.j().K().b("Session started, time", Long.valueOf(this.f5544a.b().b()));
            long j8 = j7 / 1000;
            this.f5544a.r().a0("auto", "_sid", Long.valueOf(j8), j7);
            this.f5544a.i().f5400q.b(j8);
            this.f5544a.i().f5395l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j8);
            if (this.f5544a.f().s(K.f4845m0) && z7) {
                bundle.putLong("_aib", 1L);
            }
            this.f5544a.r().U("auto", "_s", j7, bundle);
            if (C1032t6.a() && this.f5544a.f().s(K.f4851p0)) {
                String a7 = this.f5544a.i().f5405v.a();
                if (TextUtils.isEmpty(a7)) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("_ffr", a7);
                this.f5544a.r().U("auto", "_ssr", j7, bundle2);
            }
        }
    }
}
