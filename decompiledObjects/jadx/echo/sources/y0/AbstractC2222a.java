package y0;

import d0.C1194q;
import g0.AbstractC1297a;

/* renamed from: y0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2222a extends m {

    /* renamed from: k, reason: collision with root package name */
    public final long f21223k;

    /* renamed from: l, reason: collision with root package name */
    public final long f21224l;

    /* renamed from: m, reason: collision with root package name */
    public C2224c f21225m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f21226n;

    public AbstractC2222a(i0.g gVar, i0.k kVar, C1194q c1194q, int i7, Object obj, long j7, long j8, long j9, long j10, long j11) {
        super(gVar, kVar, c1194q, i7, obj, j7, j8, j11);
        this.f21223k = j9;
        this.f21224l = j10;
    }

    public final int i(int i7) {
        return ((int[]) AbstractC1297a.h(this.f21226n))[i7];
    }

    public final C2224c j() {
        return (C2224c) AbstractC1297a.h(this.f21225m);
    }

    public void k(C2224c c2224c) {
        this.f21225m = c2224c;
        this.f21226n = c2224c.b();
    }
}
