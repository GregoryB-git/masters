package M0;

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
    public final z f3478a = new z(4);

    /* renamed from: b, reason: collision with root package name */
    public final O f3479b = new O(-1, -1, "image/heif");

    private boolean c(InterfaceC0373s interfaceC0373s, int i7) {
        this.f3478a.P(4);
        interfaceC0373s.n(this.f3478a.e(), 0, 4);
        return this.f3478a.I() == ((long) i7);
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f3479b.a(j7, j8);
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f3479b.b(interfaceC0374t);
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        interfaceC0373s.o(4);
        return c(interfaceC0373s, 1718909296) && c(interfaceC0373s, 1751476579);
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        return this.f3479b.i(interfaceC0373s, l7);
    }

    @Override // F0.r
    public void release() {
    }
}
