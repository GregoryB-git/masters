package c1;

import g0.AbstractC1297a;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q extends j0.j implements k {

    /* renamed from: s, reason: collision with root package name */
    public k f10043s;

    /* renamed from: t, reason: collision with root package name */
    public long f10044t;

    @Override // c1.k
    public int c(long j7) {
        return ((k) AbstractC1297a.e(this.f10043s)).c(j7 - this.f10044t);
    }

    @Override // c1.k
    public long e(int i7) {
        return ((k) AbstractC1297a.e(this.f10043s)).e(i7) + this.f10044t;
    }

    @Override // c1.k
    public List h(long j7) {
        return ((k) AbstractC1297a.e(this.f10043s)).h(j7 - this.f10044t);
    }

    @Override // c1.k
    public int j() {
        return ((k) AbstractC1297a.e(this.f10043s)).j();
    }

    @Override // j0.j, j0.AbstractC1368a
    public void m() {
        super.m();
        this.f10043s = null;
    }

    public void z(long j7, k kVar, long j8) {
        this.f15408p = j7;
        this.f10043s = kVar;
        if (j8 != Long.MAX_VALUE) {
            j7 = j8;
        }
        this.f10044t = j7;
    }
}
