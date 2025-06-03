package I0;

import F0.AbstractC0372q;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.L;
import F0.O;
import F0.r;
import g0.z;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final z f2486a = new z(4);

    /* renamed from: b, reason: collision with root package name */
    public final O f2487b = new O(-1, -1, "image/avif");

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f2487b.a(j7, j8);
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f2487b.b(interfaceC0374t);
    }

    public final boolean c(InterfaceC0373s interfaceC0373s, int i7) {
        this.f2486a.P(4);
        interfaceC0373s.n(this.f2486a.e(), 0, 4);
        return this.f2486a.I() == ((long) i7);
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.o(4);
        return c(interfaceC0373s, 1718909296) && c(interfaceC0373s, 1635150182);
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        return this.f2487b.i(interfaceC0373s, l7);
    }

    @Override // F0.r
    public void release() {
    }
}
