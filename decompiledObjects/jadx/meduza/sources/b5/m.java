package b5;

import v3.i0;

/* loaded from: classes.dex */
public abstract class m extends e {

    /* renamed from: j, reason: collision with root package name */
    public final long f1903j;

    public m(t5.k kVar, t5.n nVar, i0 i0Var, int i10, Object obj, long j10, long j11, long j12) {
        super(kVar, nVar, 1, i0Var, i10, obj, j10, j11);
        i0Var.getClass();
        this.f1903j = j12;
    }

    public long c() {
        long j10 = this.f1903j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    public abstract boolean d();
}
