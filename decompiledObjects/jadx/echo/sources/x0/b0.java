package x0;

import d0.AbstractC1170I;
import d0.C1198u;
import x0.InterfaceC2142x;

/* loaded from: classes.dex */
public abstract class b0 extends AbstractC2127h {

    /* renamed from: l, reason: collision with root package name */
    public static final Void f20714l = null;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2142x f20715k;

    public b0(InterfaceC2142x interfaceC2142x) {
        this.f20715k = interfaceC2142x;
    }

    @Override // x0.AbstractC2127h
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2142x.b F(Void r12, InterfaceC2142x.b bVar) {
        return N(bVar);
    }

    @Override // x0.AbstractC2127h
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final long G(Void r12, long j7, InterfaceC2142x.b bVar) {
        return O(j7, bVar);
    }

    @Override // x0.AbstractC2127h
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int H(Void r12, int i7) {
        return Q(i7);
    }

    public abstract void S(AbstractC1170I abstractC1170I);

    @Override // x0.AbstractC2127h
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void I(Void r12, InterfaceC2142x interfaceC2142x, AbstractC1170I abstractC1170I) {
        S(abstractC1170I);
    }

    public final void U() {
        K(f20714l, this.f20715k);
    }

    public void V() {
        U();
    }

    @Override // x0.InterfaceC2142x
    public C1198u a() {
        return this.f20715k.a();
    }

    @Override // x0.AbstractC2120a, x0.InterfaceC2142x
    public boolean i() {
        return this.f20715k.i();
    }

    @Override // x0.AbstractC2120a, x0.InterfaceC2142x
    public AbstractC1170I j() {
        return this.f20715k.j();
    }

    @Override // x0.AbstractC2120a, x0.InterfaceC2142x
    public void l(C1198u c1198u) {
        this.f20715k.l(c1198u);
    }

    @Override // x0.AbstractC2127h, x0.AbstractC2120a
    public final void z(i0.y yVar) {
        super.z(yVar);
        V();
    }

    public InterfaceC2142x.b N(InterfaceC2142x.b bVar) {
        return bVar;
    }

    public int Q(int i7) {
        return i7;
    }

    public long O(long j7, InterfaceC2142x.b bVar) {
        return j7;
    }
}
