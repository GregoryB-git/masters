package b5;

import v3.i0;

/* loaded from: classes.dex */
public abstract class a extends m {

    /* renamed from: k, reason: collision with root package name */
    public final long f1838k;

    /* renamed from: l, reason: collision with root package name */
    public final long f1839l;

    /* renamed from: m, reason: collision with root package name */
    public c f1840m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f1841n;

    public a(t5.k kVar, t5.n nVar, i0 i0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(kVar, nVar, i0Var, i10, obj, j10, j11, j14);
        this.f1838k = j12;
        this.f1839l = j13;
    }

    public final int e(int i10) {
        int[] iArr = this.f1841n;
        x6.b.K(iArr);
        return iArr[i10];
    }
}
