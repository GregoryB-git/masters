package N0;

import F0.AbstractC0372q;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.L;
import F0.O;
import F0.r;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final r f3580a;

    public a(int i7) {
        this.f3580a = (i7 & 1) != 0 ? new O(65496, 2, "image/jpeg") : new b();
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f3580a.a(j7, j8);
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f3580a.b(interfaceC0374t);
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        return this.f3580a.e(interfaceC0373s);
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        return this.f3580a.i(interfaceC0373s, l7);
    }

    @Override // F0.r
    public void release() {
        this.f3580a.release();
    }
}
