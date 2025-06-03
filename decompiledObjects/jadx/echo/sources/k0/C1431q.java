package k0;

import android.os.SystemClock;
import d0.C1198u;
import g0.AbstractC1297a;

/* renamed from: k0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1431q implements InterfaceC1443w0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f15869a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15870b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15871c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15872d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15873e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15874f;

    /* renamed from: g, reason: collision with root package name */
    public final float f15875g;

    /* renamed from: h, reason: collision with root package name */
    public long f15876h;

    /* renamed from: i, reason: collision with root package name */
    public long f15877i;

    /* renamed from: j, reason: collision with root package name */
    public long f15878j;

    /* renamed from: k, reason: collision with root package name */
    public long f15879k;

    /* renamed from: l, reason: collision with root package name */
    public long f15880l;

    /* renamed from: m, reason: collision with root package name */
    public long f15881m;

    /* renamed from: n, reason: collision with root package name */
    public float f15882n;

    /* renamed from: o, reason: collision with root package name */
    public float f15883o;

    /* renamed from: p, reason: collision with root package name */
    public float f15884p;

    /* renamed from: q, reason: collision with root package name */
    public long f15885q;

    /* renamed from: r, reason: collision with root package name */
    public long f15886r;

    /* renamed from: s, reason: collision with root package name */
    public long f15887s;

    /* renamed from: k0.q$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public float f15888a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        public float f15889b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        public long f15890c = 1000;

        /* renamed from: d, reason: collision with root package name */
        public float f15891d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        public long f15892e = g0.M.J0(20);

        /* renamed from: f, reason: collision with root package name */
        public long f15893f = g0.M.J0(500);

        /* renamed from: g, reason: collision with root package name */
        public float f15894g = 0.999f;

        public C1431q a() {
            return new C1431q(this.f15888a, this.f15889b, this.f15890c, this.f15891d, this.f15892e, this.f15893f, this.f15894g);
        }

        public b b(float f7) {
            AbstractC1297a.a(f7 >= 1.0f);
            this.f15889b = f7;
            return this;
        }

        public b c(float f7) {
            AbstractC1297a.a(0.0f < f7 && f7 <= 1.0f);
            this.f15888a = f7;
            return this;
        }

        public b d(long j7) {
            AbstractC1297a.a(j7 > 0);
            this.f15892e = g0.M.J0(j7);
            return this;
        }

        public b e(float f7) {
            AbstractC1297a.a(f7 >= 0.0f && f7 < 1.0f);
            this.f15894g = f7;
            return this;
        }

        public b f(long j7) {
            AbstractC1297a.a(j7 > 0);
            this.f15890c = j7;
            return this;
        }

        public b g(float f7) {
            AbstractC1297a.a(f7 > 0.0f);
            this.f15891d = f7 / 1000000.0f;
            return this;
        }

        public b h(long j7) {
            AbstractC1297a.a(j7 >= 0);
            this.f15893f = g0.M.J0(j7);
            return this;
        }
    }

    public C1431q(float f7, float f8, long j7, float f9, long j8, long j9, float f10) {
        this.f15869a = f7;
        this.f15870b = f8;
        this.f15871c = j7;
        this.f15872d = f9;
        this.f15873e = j8;
        this.f15874f = j9;
        this.f15875g = f10;
        this.f15876h = -9223372036854775807L;
        this.f15877i = -9223372036854775807L;
        this.f15879k = -9223372036854775807L;
        this.f15880l = -9223372036854775807L;
        this.f15883o = f7;
        this.f15882n = f8;
        this.f15884p = 1.0f;
        this.f15885q = -9223372036854775807L;
        this.f15878j = -9223372036854775807L;
        this.f15881m = -9223372036854775807L;
        this.f15886r = -9223372036854775807L;
        this.f15887s = -9223372036854775807L;
    }

    public static long h(long j7, long j8, float f7) {
        return (long) ((j7 * f7) + ((1.0f - f7) * j8));
    }

    @Override // k0.InterfaceC1443w0
    public void a() {
        long j7 = this.f15881m;
        if (j7 == -9223372036854775807L) {
            return;
        }
        long j8 = j7 + this.f15874f;
        this.f15881m = j8;
        long j9 = this.f15880l;
        if (j9 != -9223372036854775807L && j8 > j9) {
            this.f15881m = j9;
        }
        this.f15885q = -9223372036854775807L;
    }

    @Override // k0.InterfaceC1443w0
    public void b(C1198u.g gVar) {
        this.f15876h = g0.M.J0(gVar.f12874a);
        this.f15879k = g0.M.J0(gVar.f12875b);
        this.f15880l = g0.M.J0(gVar.f12876c);
        float f7 = gVar.f12877d;
        if (f7 == -3.4028235E38f) {
            f7 = this.f15869a;
        }
        this.f15883o = f7;
        float f8 = gVar.f12878e;
        if (f8 == -3.4028235E38f) {
            f8 = this.f15870b;
        }
        this.f15882n = f8;
        if (f7 == 1.0f && f8 == 1.0f) {
            this.f15876h = -9223372036854775807L;
        }
        g();
    }

    @Override // k0.InterfaceC1443w0
    public float c(long j7, long j8) {
        if (this.f15876h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j7, j8);
        if (this.f15885q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f15885q < this.f15871c) {
            return this.f15884p;
        }
        this.f15885q = SystemClock.elapsedRealtime();
        f(j7);
        long j9 = j7 - this.f15881m;
        if (Math.abs(j9) < this.f15873e) {
            this.f15884p = 1.0f;
        } else {
            this.f15884p = g0.M.o((this.f15872d * j9) + 1.0f, this.f15883o, this.f15882n);
        }
        return this.f15884p;
    }

    @Override // k0.InterfaceC1443w0
    public void d(long j7) {
        this.f15877i = j7;
        g();
    }

    @Override // k0.InterfaceC1443w0
    public long e() {
        return this.f15881m;
    }

    public final void f(long j7) {
        long j8 = this.f15886r + (this.f15887s * 3);
        if (this.f15881m > j8) {
            float J02 = g0.M.J0(this.f15871c);
            this.f15881m = a3.h.c(j8, this.f15878j, this.f15881m - (((long) ((this.f15884p - 1.0f) * J02)) + ((long) ((this.f15882n - 1.0f) * J02))));
            return;
        }
        long q7 = g0.M.q(j7 - ((long) (Math.max(0.0f, this.f15884p - 1.0f) / this.f15872d)), this.f15881m, j8);
        this.f15881m = q7;
        long j9 = this.f15880l;
        if (j9 == -9223372036854775807L || q7 <= j9) {
            return;
        }
        this.f15881m = j9;
    }

    public final void g() {
        long j7;
        long j8 = this.f15876h;
        if (j8 != -9223372036854775807L) {
            j7 = this.f15877i;
            if (j7 == -9223372036854775807L) {
                long j9 = this.f15879k;
                if (j9 != -9223372036854775807L && j8 < j9) {
                    j8 = j9;
                }
                j7 = this.f15880l;
                if (j7 == -9223372036854775807L || j8 <= j7) {
                    j7 = j8;
                }
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (this.f15878j == j7) {
            return;
        }
        this.f15878j = j7;
        this.f15881m = j7;
        this.f15886r = -9223372036854775807L;
        this.f15887s = -9223372036854775807L;
        this.f15885q = -9223372036854775807L;
    }

    public final void i(long j7, long j8) {
        long h7;
        long j9 = j7 - j8;
        long j10 = this.f15886r;
        if (j10 == -9223372036854775807L) {
            this.f15886r = j9;
            h7 = 0;
        } else {
            long max = Math.max(j9, h(j10, j9, this.f15875g));
            this.f15886r = max;
            h7 = h(this.f15887s, Math.abs(j9 - max), this.f15875g);
        }
        this.f15887s = h7;
    }
}
