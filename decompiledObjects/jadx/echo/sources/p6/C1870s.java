package p6;

/* renamed from: p6.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1870s extends s0 implements r {

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC1871t f18553s;

    public C1870s(InterfaceC1871t interfaceC1871t) {
        this.f18553s = interfaceC1871t;
    }

    @Override // p6.r
    public boolean d(Throwable th) {
        return w().O(th);
    }

    @Override // p6.r
    public InterfaceC1869q0 getParent() {
        return w();
    }

    @Override // g6.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Throwable) obj);
        return V5.t.f6803a;
    }

    @Override // p6.B
    public void v(Throwable th) {
        this.f18553s.t(w());
    }
}
