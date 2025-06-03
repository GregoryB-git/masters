package v3;

import android.os.SystemClock;
import v3.o0;

/* loaded from: classes.dex */
public final class i implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f15406a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15407b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15408c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15409d;

    /* renamed from: e, reason: collision with root package name */
    public final long f15410e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final float f15411g;

    /* renamed from: n, reason: collision with root package name */
    public float f15418n;

    /* renamed from: o, reason: collision with root package name */
    public float f15419o;

    /* renamed from: h, reason: collision with root package name */
    public long f15412h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public long f15413i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public long f15415k = -9223372036854775807L;

    /* renamed from: l, reason: collision with root package name */
    public long f15416l = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    public float f15420p = 1.0f;

    /* renamed from: q, reason: collision with root package name */
    public long f15421q = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public long f15414j = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public long f15417m = -9223372036854775807L;

    /* renamed from: r, reason: collision with root package name */
    public long f15422r = -9223372036854775807L;

    /* renamed from: s, reason: collision with root package name */
    public long f15423s = -9223372036854775807L;

    public i(float f, float f10, long j10, float f11, long j11, long j12, float f12) {
        this.f15406a = f;
        this.f15407b = f10;
        this.f15408c = j10;
        this.f15409d = f11;
        this.f15410e = j11;
        this.f = j12;
        this.f15411g = f12;
        this.f15419o = f;
        this.f15418n = f10;
    }

    @Override // v3.m0
    public final float a(long j10, long j11) {
        long j12;
        if (this.f15412h == -9223372036854775807L) {
            return 1.0f;
        }
        long j13 = j10 - j11;
        long j14 = this.f15422r;
        if (j14 == -9223372036854775807L) {
            this.f15422r = j13;
            j12 = 0;
        } else {
            float f = this.f15411g;
            long max = Math.max(j13, (long) (((1.0f - f) * j13) + (j14 * f)));
            this.f15422r = max;
            long abs = Math.abs(j13 - max);
            long j15 = this.f15423s;
            float f10 = this.f15411g;
            j12 = (long) (((1.0f - f10) * abs) + (j15 * f10));
        }
        this.f15423s = j12;
        if (this.f15421q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f15421q < this.f15408c) {
            return this.f15420p;
        }
        this.f15421q = SystemClock.elapsedRealtime();
        long j16 = (this.f15423s * 3) + this.f15422r;
        if (this.f15417m > j16) {
            float I = v5.e0.I(this.f15408c);
            long[] jArr = {j16, this.f15414j, this.f15417m - (((long) ((this.f15420p - 1.0f) * I)) + ((long) ((this.f15418n - 1.0f) * I)))};
            for (int i10 = 1; i10 < 3; i10++) {
                long j17 = jArr[i10];
                if (j17 > j16) {
                    j16 = j17;
                }
            }
            this.f15417m = j16;
        } else {
            long j18 = v5.e0.j(j10 - ((long) (Math.max(0.0f, this.f15420p - 1.0f) / this.f15409d)), this.f15417m, j16);
            this.f15417m = j18;
            long j19 = this.f15416l;
            if (j19 != -9223372036854775807L && j18 > j19) {
                this.f15417m = j19;
            }
        }
        long j20 = j10 - this.f15417m;
        if (Math.abs(j20) < this.f15410e) {
            this.f15420p = 1.0f;
        } else {
            this.f15420p = v5.e0.h((this.f15409d * j20) + 1.0f, this.f15419o, this.f15418n);
        }
        return this.f15420p;
    }

    @Override // v3.m0
    public final long b() {
        return this.f15417m;
    }

    @Override // v3.m0
    public final void c() {
        long j10 = this.f15417m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f;
        this.f15417m = j11;
        long j12 = this.f15416l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f15417m = j12;
        }
        this.f15421q = -9223372036854775807L;
    }

    @Override // v3.m0
    public final void d(o0.e eVar) {
        this.f15412h = v5.e0.I(eVar.f15585a);
        this.f15415k = v5.e0.I(eVar.f15586b);
        this.f15416l = v5.e0.I(eVar.f15587c);
        float f = eVar.f15588d;
        if (f == -3.4028235E38f) {
            f = this.f15406a;
        }
        this.f15419o = f;
        float f10 = eVar.f15589e;
        if (f10 == -3.4028235E38f) {
            f10 = this.f15407b;
        }
        this.f15418n = f10;
        if (f == 1.0f && f10 == 1.0f) {
            this.f15412h = -9223372036854775807L;
        }
        f();
    }

    @Override // v3.m0
    public final void e(long j10) {
        this.f15413i = j10;
        f();
    }

    public final void f() {
        long j10 = this.f15412h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f15413i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f15415k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f15416l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f15414j == j10) {
            return;
        }
        this.f15414j = j10;
        this.f15417m = j10;
        this.f15422r = -9223372036854775807L;
        this.f15423s = -9223372036854775807L;
        this.f15421q = -9223372036854775807L;
    }
}
