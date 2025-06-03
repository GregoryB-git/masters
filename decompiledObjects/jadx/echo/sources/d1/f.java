package d1;

import c1.k;
import g0.AbstractC1297a;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: o, reason: collision with root package name */
    public final List f13116o;

    public f(List list) {
        this.f13116o = list;
    }

    @Override // c1.k
    public int c(long j7) {
        return j7 < 0 ? 0 : -1;
    }

    @Override // c1.k
    public long e(int i7) {
        AbstractC1297a.a(i7 == 0);
        return 0L;
    }

    @Override // c1.k
    public List h(long j7) {
        return j7 >= 0 ? this.f13116o : Collections.emptyList();
    }

    @Override // c1.k
    public int j() {
        return 1;
    }
}
