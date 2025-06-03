package i1;

import c1.k;
import g0.M;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class h implements k {

    /* renamed from: o, reason: collision with root package name */
    public final C1344c f14811o;

    /* renamed from: p, reason: collision with root package name */
    public final long[] f14812p;

    /* renamed from: q, reason: collision with root package name */
    public final Map f14813q;

    /* renamed from: r, reason: collision with root package name */
    public final Map f14814r;

    /* renamed from: s, reason: collision with root package name */
    public final Map f14815s;

    public h(C1344c c1344c, Map map, Map map2, Map map3) {
        this.f14811o = c1344c;
        this.f14814r = map2;
        this.f14815s = map3;
        this.f14813q = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f14812p = c1344c.j();
    }

    @Override // c1.k
    public int c(long j7) {
        int d7 = M.d(this.f14812p, j7, false, false);
        if (d7 < this.f14812p.length) {
            return d7;
        }
        return -1;
    }

    @Override // c1.k
    public long e(int i7) {
        return this.f14812p[i7];
    }

    @Override // c1.k
    public List h(long j7) {
        return this.f14811o.h(j7, this.f14813q, this.f14814r, this.f14815s);
    }

    @Override // c1.k
    public int j() {
        return this.f14812p.length;
    }
}
