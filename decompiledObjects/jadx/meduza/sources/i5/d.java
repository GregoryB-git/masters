package i5;

import h5.g;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final List<h5.a> f7563a;

    public d(List<h5.a> list) {
        this.f7563a = list;
    }

    @Override // h5.g
    public final int f(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // h5.g
    public final long g(int i10) {
        x6.b.q(i10 == 0);
        return 0L;
    }

    @Override // h5.g
    public final List<h5.a> h(long j10) {
        return j10 >= 0 ? this.f7563a : Collections.emptyList();
    }

    @Override // h5.g
    public final int i() {
        return 1;
    }
}
