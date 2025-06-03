package n5;

import h5.g;
import java.util.Collections;
import java.util.List;
import v5.e0;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final h5.a[] f11272a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f11273b;

    public b(h5.a[] aVarArr, long[] jArr) {
        this.f11272a = aVarArr;
        this.f11273b = jArr;
    }

    @Override // h5.g
    public final int f(long j10) {
        int b10 = e0.b(this.f11273b, j10, false);
        if (b10 < this.f11273b.length) {
            return b10;
        }
        return -1;
    }

    @Override // h5.g
    public final long g(int i10) {
        x6.b.q(i10 >= 0);
        x6.b.q(i10 < this.f11273b.length);
        return this.f11273b[i10];
    }

    @Override // h5.g
    public final List<h5.a> h(long j10) {
        h5.a aVar;
        int f = e0.f(this.f11273b, j10, false);
        return (f == -1 || (aVar = this.f11272a[f]) == h5.a.f7094z) ? Collections.emptyList() : Collections.singletonList(aVar);
    }

    @Override // h5.g
    public final int i() {
        return this.f11273b.length;
    }
}
