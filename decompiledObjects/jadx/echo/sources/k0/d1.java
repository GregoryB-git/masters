package k0;

import g0.AbstractC1297a;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: c, reason: collision with root package name */
    public static final d1 f15698c;

    /* renamed from: d, reason: collision with root package name */
    public static final d1 f15699d;

    /* renamed from: e, reason: collision with root package name */
    public static final d1 f15700e;

    /* renamed from: f, reason: collision with root package name */
    public static final d1 f15701f;

    /* renamed from: g, reason: collision with root package name */
    public static final d1 f15702g;

    /* renamed from: a, reason: collision with root package name */
    public final long f15703a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15704b;

    static {
        d1 d1Var = new d1(0L, 0L);
        f15698c = d1Var;
        f15699d = new d1(Long.MAX_VALUE, Long.MAX_VALUE);
        f15700e = new d1(Long.MAX_VALUE, 0L);
        f15701f = new d1(0L, Long.MAX_VALUE);
        f15702g = d1Var;
    }

    public d1(long j7, long j8) {
        AbstractC1297a.a(j7 >= 0);
        AbstractC1297a.a(j8 >= 0);
        this.f15703a = j7;
        this.f15704b = j8;
    }

    public long a(long j7, long j8, long j9) {
        long j10 = this.f15703a;
        if (j10 == 0 && this.f15704b == 0) {
            return j7;
        }
        long e12 = g0.M.e1(j7, j10, Long.MIN_VALUE);
        long b7 = g0.M.b(j7, this.f15704b, Long.MAX_VALUE);
        boolean z7 = false;
        boolean z8 = e12 <= j8 && j8 <= b7;
        if (e12 <= j9 && j9 <= b7) {
            z7 = true;
        }
        return (z8 && z7) ? Math.abs(j8 - j7) <= Math.abs(j9 - j7) ? j8 : j9 : z8 ? j8 : z7 ? j9 : e12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d1.class != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return this.f15703a == d1Var.f15703a && this.f15704b == d1Var.f15704b;
    }

    public int hashCode() {
        return (((int) this.f15703a) * 31) + ((int) this.f15704b);
    }
}
