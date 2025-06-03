package R2;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.G6;

/* renamed from: R2.r5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593r5 {

    /* renamed from: a, reason: collision with root package name */
    public long f5521a;

    /* renamed from: b, reason: collision with root package name */
    public long f5522b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0629x f5523c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0552l5 f5524d;

    public C0593r5(C0552l5 c0552l5) {
        this.f5524d = c0552l5;
        this.f5523c = new C0614u5(this, c0552l5.f5424a);
        long b7 = c0552l5.b().b();
        this.f5521a = b7;
        this.f5522b = b7;
    }

    public static /* synthetic */ void c(C0593r5 c0593r5) {
        c0593r5.f5524d.n();
        c0593r5.d(false, false, c0593r5.f5524d.b().b());
        c0593r5.f5524d.o().v(c0593r5.f5524d.b().b());
    }

    public final long a(long j7) {
        long j8 = j7 - this.f5522b;
        this.f5522b = j7;
        return j8;
    }

    public final void b() {
        this.f5523c.a();
        this.f5521a = 0L;
        this.f5522b = 0L;
    }

    public final boolean d(boolean z7, boolean z8, long j7) {
        this.f5524d.n();
        this.f5524d.v();
        if (!G6.a() || !this.f5524d.f().s(K.f4853q0) || this.f5524d.f5424a.p()) {
            this.f5524d.i().f5399p.b(this.f5524d.b().a());
        }
        long j8 = j7 - this.f5521a;
        if (!z7 && j8 < 1000) {
            this.f5524d.j().K().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j8));
            return false;
        }
        if (!z8) {
            j8 = a(j7);
        }
        this.f5524d.j().K().b("Recording user engagement, ms", Long.valueOf(j8));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j8);
        S5.L(this.f5524d.s().C(!this.f5524d.f().Q()), bundle, true);
        if (!z8) {
            this.f5524d.r().z0("auto", "_e", bundle);
        }
        this.f5521a = j7;
        this.f5523c.a();
        this.f5523c.b(3600000L);
        return true;
    }

    public final void e(long j7) {
        this.f5523c.a();
    }

    public final void f(long j7) {
        this.f5524d.n();
        this.f5523c.a();
        this.f5521a = j7;
        this.f5522b = j7;
    }
}
