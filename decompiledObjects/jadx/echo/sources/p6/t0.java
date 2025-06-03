package p6;

/* loaded from: classes.dex */
public class t0 extends x0 implements InterfaceC1875x {

    /* renamed from: q, reason: collision with root package name */
    public final boolean f18554q;

    public t0(InterfaceC1869q0 interfaceC1869q0) {
        super(true);
        e0(interfaceC1869q0);
        this.f18554q = G0();
    }

    public final boolean G0() {
        x0 w7;
        r a02 = a0();
        C1870s c1870s = a02 instanceof C1870s ? (C1870s) a02 : null;
        if (c1870s != null && (w7 = c1870s.w()) != null) {
            while (!w7.X()) {
                r a03 = w7.a0();
                C1870s c1870s2 = a03 instanceof C1870s ? (C1870s) a03 : null;
                if (c1870s2 != null && (w7 = c1870s2.w()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p6.x0
    public boolean X() {
        return this.f18554q;
    }

    @Override // p6.x0
    public boolean Y() {
        return true;
    }
}
