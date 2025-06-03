package p6;

import V5.n;

/* loaded from: classes.dex */
public final class G0 extends w0 {

    /* renamed from: s, reason: collision with root package name */
    public final C1860m f18494s;

    public G0(C1860m c1860m) {
        this.f18494s = c1860m;
    }

    @Override // g6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Throwable) obj);
        return V5.t.f6803a;
    }

    @Override // p6.B
    public void v(Throwable th) {
        C1860m c1860m;
        Object h7;
        Object b02 = w().b0();
        if (b02 instanceof C1877z) {
            c1860m = this.f18494s;
            n.a aVar = V5.n.f6797o;
            h7 = V5.o.a(((C1877z) b02).f18582a);
        } else {
            c1860m = this.f18494s;
            n.a aVar2 = V5.n.f6797o;
            h7 = y0.h(b02);
        }
        c1860m.resumeWith(V5.n.a(h7));
    }
}
