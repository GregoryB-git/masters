package v3;

/* loaded from: classes.dex */
public final class n1 {

    /* renamed from: c, reason: collision with root package name */
    public static final n1 f15525c;

    /* renamed from: a, reason: collision with root package name */
    public final long f15526a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15527b;

    static {
        n1 n1Var = new n1(0L, 0L);
        new n1(Long.MAX_VALUE, Long.MAX_VALUE);
        new n1(Long.MAX_VALUE, 0L);
        new n1(0L, Long.MAX_VALUE);
        f15525c = n1Var;
    }

    public n1(long j10, long j11) {
        x6.b.q(j10 >= 0);
        x6.b.q(j11 >= 0);
        this.f15526a = j10;
        this.f15527b = j11;
    }

    public final long a(long j10, long j11, long j12) {
        long j13 = this.f15526a;
        if (j13 == 0 && this.f15527b == 0) {
            return j10;
        }
        int i10 = v5.e0.f15881a;
        long j14 = j10 - j13;
        long j15 = ((j13 ^ j10) & (j10 ^ j14)) >= 0 ? j14 : Long.MIN_VALUE;
        long j16 = this.f15527b;
        long j17 = j10 + j16;
        if (((j16 ^ j17) & (j10 ^ j17)) < 0) {
            j17 = Long.MAX_VALUE;
        }
        boolean z10 = j15 <= j11 && j11 <= j17;
        boolean z11 = j15 <= j12 && j12 <= j17;
        return (z10 && z11) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z10 ? j11 : z11 ? j12 : j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n1.class != obj.getClass()) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return this.f15526a == n1Var.f15526a && this.f15527b == n1Var.f15527b;
    }

    public final int hashCode() {
        return (((int) this.f15526a) * 31) + ((int) this.f15527b);
    }
}
