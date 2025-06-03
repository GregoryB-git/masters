package c4;

import c4.t;

/* loaded from: classes.dex */
public class d implements t {

    /* renamed from: a, reason: collision with root package name */
    public final long f2267a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2268b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2269c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2270d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2271e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2272g;

    public d(int i10, int i11, long j10, long j11, boolean z10) {
        long max;
        this.f2267a = j10;
        this.f2268b = j11;
        this.f2269c = i11 == -1 ? 1 : i11;
        this.f2271e = i10;
        this.f2272g = z10;
        if (j10 == -1) {
            this.f2270d = -1L;
            max = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.f2270d = j12;
            max = ((Math.max(0L, j12) * 8) * 1000000) / i10;
        }
        this.f = max;
    }

    @Override // c4.t
    public final boolean e() {
        return this.f2270d != -1 || this.f2272g;
    }

    @Override // c4.t
    public final t.a g(long j10) {
        long j11 = this.f2270d;
        if (j11 == -1 && !this.f2272g) {
            u uVar = new u(0L, this.f2268b);
            return new t.a(uVar, uVar);
        }
        long j12 = this.f2269c;
        long j13 = (((this.f2271e * j10) / 8000000) / j12) * j12;
        if (j11 != -1) {
            j13 = Math.min(j13, j11 - j12);
        }
        long max = Math.max(j13, 0L);
        long j14 = this.f2268b;
        long j15 = max + j14;
        long max2 = ((Math.max(0L, j15 - j14) * 8) * 1000000) / this.f2271e;
        u uVar2 = new u(max2, j15);
        if (this.f2270d != -1 && max2 < j10) {
            long j16 = this.f2269c + j15;
            if (j16 < this.f2267a) {
                return new t.a(uVar2, new u(((Math.max(0L, j16 - this.f2268b) * 8) * 1000000) / this.f2271e, j16));
            }
        }
        return new t.a(uVar2, uVar2);
    }

    @Override // c4.t
    public final long h() {
        return this.f;
    }
}
