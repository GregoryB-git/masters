package y0;

import d0.C1194q;
import g0.AbstractC1297a;

/* loaded from: classes.dex */
public abstract class m extends AbstractC2226e {

    /* renamed from: j, reason: collision with root package name */
    public final long f21303j;

    public m(i0.g gVar, i0.k kVar, C1194q c1194q, int i7, Object obj, long j7, long j8, long j9) {
        super(gVar, kVar, 1, c1194q, i7, obj, j7, j8);
        AbstractC1297a.e(c1194q);
        this.f21303j = j9;
    }

    public long g() {
        long j7 = this.f21303j;
        if (j7 != -1) {
            return 1 + j7;
        }
        return -1L;
    }

    public abstract boolean h();
}
