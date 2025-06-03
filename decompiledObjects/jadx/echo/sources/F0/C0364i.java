package F0;

import F0.M;

/* renamed from: F0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0364i implements M {

    /* renamed from: a, reason: collision with root package name */
    public final long f1902a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1903b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1904c;

    /* renamed from: d, reason: collision with root package name */
    public final long f1905d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1906e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1907f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1908g;

    public C0364i(long j7, long j8, int i7, int i8, boolean z7) {
        long d7;
        this.f1902a = j7;
        this.f1903b = j8;
        this.f1904c = i8 == -1 ? 1 : i8;
        this.f1906e = i7;
        this.f1908g = z7;
        if (j7 == -1) {
            this.f1905d = -1L;
            d7 = -9223372036854775807L;
        } else {
            this.f1905d = j7 - j8;
            d7 = d(j7, j8, i7);
        }
        this.f1907f = d7;
    }

    public static long d(long j7, long j8, int i7) {
        return (Math.max(0L, j7 - j8) * 8000000) / i7;
    }

    public final long a(long j7) {
        int i7 = this.f1904c;
        long j8 = (((j7 * this.f1906e) / 8000000) / i7) * i7;
        long j9 = this.f1905d;
        if (j9 != -1) {
            j8 = Math.min(j8, j9 - i7);
        }
        return this.f1903b + Math.max(j8, 0L);
    }

    public long b(long j7) {
        return d(j7, this.f1903b, this.f1906e);
    }

    @Override // F0.M
    public boolean h() {
        return this.f1905d != -1 || this.f1908g;
    }

    @Override // F0.M
    public M.a j(long j7) {
        if (this.f1905d == -1 && !this.f1908g) {
            return new M.a(new N(0L, this.f1903b));
        }
        long a7 = a(j7);
        long b7 = b(a7);
        N n7 = new N(b7, a7);
        if (this.f1905d != -1 && b7 < j7) {
            int i7 = this.f1904c;
            if (i7 + a7 < this.f1902a) {
                long j8 = a7 + i7;
                return new M.a(n7, new N(b(j8), j8));
            }
        }
        return new M.a(n7);
    }

    @Override // F0.M
    public long l() {
        return this.f1907f;
    }
}
