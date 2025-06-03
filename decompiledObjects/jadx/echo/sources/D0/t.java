package D0;

import D0.q;
import d0.C1177P;
import g0.AbstractC1297a;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final a f1214a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1215b;

    /* renamed from: g, reason: collision with root package name */
    public C1177P f1220g;

    /* renamed from: i, reason: collision with root package name */
    public long f1222i;

    /* renamed from: c, reason: collision with root package name */
    public final q.a f1216c = new q.a();

    /* renamed from: d, reason: collision with root package name */
    public final g0.D f1217d = new g0.D();

    /* renamed from: e, reason: collision with root package name */
    public final g0.D f1218e = new g0.D();

    /* renamed from: f, reason: collision with root package name */
    public final g0.q f1219f = new g0.q();

    /* renamed from: h, reason: collision with root package name */
    public C1177P f1221h = C1177P.f12555e;

    /* renamed from: j, reason: collision with root package name */
    public long f1223j = -9223372036854775807L;

    public interface a {
        void b(C1177P c1177p);

        void c(long j7, long j8, long j9, boolean z7);

        void d();
    }

    public t(a aVar, q qVar) {
        this.f1214a = aVar;
        this.f1215b = qVar;
    }

    public static Object c(g0.D d7) {
        AbstractC1297a.a(d7.k() > 0);
        while (d7.k() > 1) {
            d7.h();
        }
        return AbstractC1297a.e(d7.h());
    }

    public final void a() {
        AbstractC1297a.h(Long.valueOf(this.f1219f.d()));
        this.f1214a.d();
    }

    public void b() {
        this.f1219f.a();
        this.f1223j = -9223372036854775807L;
        if (this.f1218e.k() > 0) {
            Long l7 = (Long) c(this.f1218e);
            l7.longValue();
            this.f1218e.a(0L, l7);
        }
        if (this.f1220g != null) {
            this.f1217d.c();
        } else if (this.f1217d.k() > 0) {
            this.f1220g = (C1177P) c(this.f1217d);
        }
    }

    public boolean d(long j7) {
        long j8 = this.f1223j;
        return j8 != -9223372036854775807L && j8 >= j7;
    }

    public boolean e() {
        return this.f1215b.d(true);
    }

    public final boolean f(long j7) {
        Long l7 = (Long) this.f1218e.i(j7);
        if (l7 == null || l7.longValue() == this.f1222i) {
            return false;
        }
        this.f1222i = l7.longValue();
        return true;
    }

    public final boolean g(long j7) {
        C1177P c1177p = (C1177P) this.f1217d.i(j7);
        if (c1177p == null || c1177p.equals(C1177P.f12555e) || c1177p.equals(this.f1221h)) {
            return false;
        }
        this.f1221h = c1177p;
        return true;
    }

    public void h(long j7, long j8) {
        while (!this.f1219f.c()) {
            long b7 = this.f1219f.b();
            if (f(b7)) {
                this.f1215b.j();
            }
            int c7 = this.f1215b.c(b7, j7, j8, this.f1222i, false, this.f1216c);
            if (c7 == 0 || c7 == 1) {
                this.f1223j = b7;
                i(c7 == 0);
            } else if (c7 != 2 && c7 != 3 && c7 != 4) {
                if (c7 != 5) {
                    throw new IllegalStateException(String.valueOf(c7));
                }
                return;
            } else {
                this.f1223j = b7;
                a();
            }
        }
    }

    public final void i(boolean z7) {
        long longValue = ((Long) AbstractC1297a.h(Long.valueOf(this.f1219f.d()))).longValue();
        if (g(longValue)) {
            this.f1214a.b(this.f1221h);
        }
        this.f1214a.c(z7 ? -1L : this.f1216c.g(), longValue, this.f1222i, this.f1215b.i());
    }

    public void j(float f7) {
        AbstractC1297a.a(f7 > 0.0f);
        this.f1215b.r(f7);
    }
}
