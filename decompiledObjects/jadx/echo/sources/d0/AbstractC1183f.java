package d0;

import d0.AbstractC1170I;

/* renamed from: d0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1183f implements InterfaceC1165D {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1170I.c f12614a = new AbstractC1170I.c();

    @Override // d0.InterfaceC1165D
    public final boolean B() {
        return b() != -1;
    }

    @Override // d0.InterfaceC1165D
    public final boolean G() {
        return c() != -1;
    }

    @Override // d0.InterfaceC1165D
    public final boolean I() {
        AbstractC1170I L6 = L();
        return !L6.q() && L6.n(E(), this.f12614a).f12428i;
    }

    @Override // d0.InterfaceC1165D
    public final int M() {
        return L().p();
    }

    @Override // d0.InterfaceC1165D
    public final boolean Q() {
        AbstractC1170I L6 = L();
        return !L6.q() && L6.n(E(), this.f12614a).f();
    }

    public final int R() {
        int q7 = q();
        if (q7 == 1) {
            return 0;
        }
        return q7;
    }

    public final void S(int i7) {
        U(-1, -9223372036854775807L, i7, false);
    }

    public final void T(int i7) {
        U(E(), -9223372036854775807L, i7, true);
    }

    public abstract void U(int i7, long j7, int i8, boolean z7);

    public final void V(int i7, int i8) {
        U(i7, -9223372036854775807L, i8, false);
    }

    public final void W(int i7) {
        int b7 = b();
        if (b7 == -1) {
            S(i7);
        } else if (b7 == E()) {
            T(i7);
        } else {
            V(b7, i7);
        }
    }

    public final long a() {
        AbstractC1170I L6 = L();
        if (L6.q()) {
            return -9223372036854775807L;
        }
        return L6.n(E(), this.f12614a).d();
    }

    public final int b() {
        AbstractC1170I L6 = L();
        if (L6.q()) {
            return -1;
        }
        return L6.e(E(), R(), N());
    }

    public final int c() {
        AbstractC1170I L6 = L();
        if (L6.q()) {
            return -1;
        }
        return L6.l(E(), R(), N());
    }

    @Override // d0.InterfaceC1165D
    public final void s(int i7, long j7) {
        U(i7, j7, 10, false);
    }

    @Override // d0.InterfaceC1165D
    public final boolean w() {
        AbstractC1170I L6 = L();
        return !L6.q() && L6.n(E(), this.f12614a).f12427h;
    }

    @Override // d0.InterfaceC1165D
    public final void y() {
        W(8);
    }
}
