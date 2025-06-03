/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import E2.e;
import R2.C3;
import R2.K;
import R2.N2;
import R2.P1;
import R2.S1;
import R2.Y1;
import R2.a2;
import R2.g;
import R2.l2;
import R2.l5;
import R2.m3;
import R2.o2;
import R2.q2;
import R2.r2;
import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.t6;

public final class t5 {
    public final /* synthetic */ l5 a;

    public t5(l5 l52) {
        this.a = l52;
    }

    public final void a() {
        this.a.n();
        if (this.a.i().y(this.a.b().a())) {
            this.a.i().l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState((ActivityManager.RunningAppProcessInfo)runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.a.j().K().a("Detected application was in foreground");
                this.c(this.a.b().a(), false);
            }
        }
    }

    public final void b(long l8, boolean bl) {
        this.a.n();
        l5.H(this.a);
        if (this.a.i().y(l8)) {
            this.a.i().l.a(true);
            if (s7.a() && this.a.f().s(K.x0)) {
                this.a.p().I();
            }
        }
        this.a.i().p.b(l8);
        if (this.a.i().l.b()) {
            this.c(l8, bl);
        }
    }

    public final void c(long l8, boolean bl) {
        this.a.n();
        if (!this.a.a.p()) {
            return;
        }
        this.a.i().p.b(l8);
        long l9 = this.a.b().b();
        this.a.j().K().b("Session started, time", l9);
        l9 = l8 / 1000L;
        this.a.r().a0("auto", "_sid", l9, l8);
        this.a.i().q.b(l9);
        this.a.i().l.a(false);
        Object object = new Bundle();
        object.putLong("_sid", l9);
        if (this.a.f().s(K.m0) && bl) {
            object.putLong("_aib", 1L);
        }
        this.a.r().U("auto", "_s", l8, (Bundle)object);
        if (t6.a() && this.a.f().s(K.p0) && !TextUtils.isEmpty((CharSequence)(object = this.a.i().v.a()))) {
            Bundle bundle = new Bundle();
            bundle.putString("_ffr", (String)object);
            this.a.r().U("auto", "_ssr", l8, bundle);
        }
    }
}

