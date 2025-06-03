package L4;

import M4.l;
import M4.o;
import android.content.Context;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final C4.a f3338a;

    /* renamed from: b, reason: collision with root package name */
    public final double f3339b;

    /* renamed from: c, reason: collision with root package name */
    public final double f3340c;

    /* renamed from: d, reason: collision with root package name */
    public a f3341d;

    /* renamed from: e, reason: collision with root package name */
    public a f3342e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3343f;

    public static class a {

        /* renamed from: k, reason: collision with root package name */
        public static final F4.a f3344k = F4.a.e();

        /* renamed from: l, reason: collision with root package name */
        public static final long f3345l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a, reason: collision with root package name */
        public final M4.a f3346a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f3347b;

        /* renamed from: c, reason: collision with root package name */
        public l f3348c;

        /* renamed from: d, reason: collision with root package name */
        public M4.i f3349d;

        /* renamed from: e, reason: collision with root package name */
        public long f3350e;

        /* renamed from: f, reason: collision with root package name */
        public double f3351f;

        /* renamed from: g, reason: collision with root package name */
        public M4.i f3352g;

        /* renamed from: h, reason: collision with root package name */
        public M4.i f3353h;

        /* renamed from: i, reason: collision with root package name */
        public long f3354i;

        /* renamed from: j, reason: collision with root package name */
        public long f3355j;

        public a(M4.i iVar, long j7, M4.a aVar, C4.a aVar2, String str, boolean z7) {
            this.f3346a = aVar;
            this.f3350e = j7;
            this.f3349d = iVar;
            this.f3351f = j7;
            this.f3348c = aVar.a();
            g(aVar2, str, z7);
            this.f3347b = z7;
        }

        public static long c(C4.a aVar, String str) {
            return str == "Trace" ? aVar.E() : aVar.q();
        }

        public static long d(C4.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        public static long e(C4.a aVar, String str) {
            return str == "Trace" ? aVar.F() : aVar.r();
        }

        public static long f(C4.a aVar, String str) {
            return str == "Trace" ? aVar.t() : aVar.t();
        }

        public synchronized void a(boolean z7) {
            try {
                this.f3349d = z7 ? this.f3352g : this.f3353h;
                this.f3350e = z7 ? this.f3354i : this.f3355j;
            } catch (Throwable th) {
                throw th;
            }
        }

        public synchronized boolean b(N4.i iVar) {
            try {
                l a7 = this.f3346a.a();
                double d7 = (this.f3348c.d(a7) * this.f3349d.a()) / f3345l;
                if (d7 > 0.0d) {
                    this.f3351f = Math.min(this.f3351f + d7, this.f3350e);
                    this.f3348c = a7;
                }
                double d8 = this.f3351f;
                if (d8 >= 1.0d) {
                    this.f3351f = d8 - 1.0d;
                    return true;
                }
                if (this.f3347b) {
                    f3344k.j("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }

        public final void g(C4.a aVar, String str, boolean z7) {
            long f7 = f(aVar, str);
            long e7 = e(aVar, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            M4.i iVar = new M4.i(e7, f7, timeUnit);
            this.f3352g = iVar;
            this.f3354i = e7;
            if (z7) {
                f3344k.b("Foreground %s logging rate:%f, burst capacity:%d", str, iVar, Long.valueOf(e7));
            }
            long d7 = d(aVar, str);
            long c7 = c(aVar, str);
            M4.i iVar2 = new M4.i(c7, d7, timeUnit);
            this.f3353h = iVar2;
            this.f3355j = c7;
            if (z7) {
                f3344k.b("Background %s logging rate:%f, capacity:%d", str, iVar2, Long.valueOf(c7));
            }
        }
    }

    public d(M4.i iVar, long j7, M4.a aVar, double d7, double d8, C4.a aVar2) {
        this.f3341d = null;
        this.f3342e = null;
        boolean z7 = false;
        this.f3343f = false;
        o.a(0.0d <= d7 && d7 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d8 && d8 < 1.0d) {
            z7 = true;
        }
        o.a(z7, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.f3339b = d7;
        this.f3340c = d8;
        this.f3338a = aVar2;
        this.f3341d = new a(iVar, j7, aVar, aVar2, "Trace", this.f3343f);
        this.f3342e = new a(iVar, j7, aVar, aVar2, "Network", this.f3343f);
    }

    public static double b() {
        return new Random().nextDouble();
    }

    public void a(boolean z7) {
        this.f3341d.a(z7);
        this.f3342e.a(z7);
    }

    public final boolean c(List list) {
        return list.size() > 0 && ((N4.k) list.get(0)).Z() > 0 && ((N4.k) list.get(0)).Y(0) == N4.l.GAUGES_AND_SYSTEM_EVENTS;
    }

    public final boolean d() {
        return this.f3340c < this.f3338a.f();
    }

    public final boolean e() {
        return this.f3339b < this.f3338a.s();
    }

    public final boolean f() {
        return this.f3339b < this.f3338a.G();
    }

    public boolean g(N4.i iVar) {
        if (!j(iVar)) {
            return false;
        }
        if (iVar.o()) {
            return !this.f3342e.b(iVar);
        }
        if (iVar.l()) {
            return !this.f3341d.b(iVar);
        }
        return true;
    }

    public boolean h(N4.i iVar) {
        if (iVar.l() && !f() && !c(iVar.n().s0())) {
            return false;
        }
        if (!i(iVar) || d() || c(iVar.n().s0())) {
            return !iVar.o() || e() || c(iVar.p().q0());
        }
        return false;
    }

    public boolean i(N4.i iVar) {
        return iVar.l() && iVar.n().r0().startsWith("_st_") && iVar.n().h0("Hosting_activity");
    }

    public boolean j(N4.i iVar) {
        return (!iVar.l() || (!(iVar.n().r0().equals(M4.c.FOREGROUND_TRACE_NAME.toString()) || iVar.n().r0().equals(M4.c.BACKGROUND_TRACE_NAME.toString())) || iVar.n().k0() <= 0)) && !iVar.f();
    }

    public d(Context context, M4.i iVar, long j7) {
        this(iVar, j7, new M4.a(), b(), b(), C4.a.g());
        this.f3343f = o.b(context);
    }
}
