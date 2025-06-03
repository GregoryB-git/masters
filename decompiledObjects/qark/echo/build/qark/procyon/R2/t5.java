// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.t6;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.s7;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;

public final class t5
{
    public final /* synthetic */ l5 a;
    
    public t5(final l5 a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.n();
        if (this.a.i().y(this.a.b().a())) {
            this.a.i().l.a(true);
            final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
            if (activityManager$RunningAppProcessInfo.importance == 100) {
                this.a.j().K().a("Detected application was in foreground");
                this.c(this.a.b().a(), false);
            }
        }
    }
    
    public final void b(final long n, final boolean b) {
        this.a.n();
        l5.H(this.a);
        if (this.a.i().y(n)) {
            this.a.i().l.a(true);
            if (s7.a() && this.a.f().s(K.x0)) {
                this.a.p().I();
            }
        }
        this.a.i().p.b(n);
        if (this.a.i().l.b()) {
            this.c(n, b);
        }
    }
    
    public final void c(final long n, final boolean b) {
        this.a.n();
        if (!this.a.a.p()) {
            return;
        }
        this.a.i().p.b(n);
        this.a.j().K().b("Session started, time", this.a.b().b());
        final long l = n / 1000L;
        this.a.r().a0("auto", "_sid", l, n);
        this.a.i().q.b(l);
        this.a.i().l.a(false);
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_sid", l);
        if (this.a.f().s(K.m0) && b) {
            ((BaseBundle)bundle).putLong("_aib", 1L);
        }
        this.a.r().U("auto", "_s", n, bundle);
        if (t6.a() && this.a.f().s(K.p0)) {
            final String a = this.a.i().v.a();
            if (!TextUtils.isEmpty((CharSequence)a)) {
                final Bundle bundle2 = new Bundle();
                ((BaseBundle)bundle2).putString("_ffr", a);
                this.a.r().U("auto", "_ssr", n, bundle2);
            }
        }
    }
}
