package n1;

import F0.AbstractC0372q;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.L;
import F0.O;
import F0.r;
import g0.z;
import java.util.List;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1694a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final z f17863a = new z(4);

    /* renamed from: b, reason: collision with root package name */
    public final O f17864b = new O(-1, -1, "image/webp");

    @Override // F0.r
    public void a(long j7, long j8) {
        this.f17864b.a(j7, j8);
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f17864b.b(interfaceC0374t);
    }

    @Override // F0.r
    public /* synthetic */ r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        this.f17863a.P(4);
        interfaceC0373s.n(this.f17863a.e(), 0, 4);
        if (this.f17863a.I() != 1380533830) {
            return false;
        }
        interfaceC0373s.o(4);
        this.f17863a.P(4);
        interfaceC0373s.n(this.f17863a.e(), 0, 4);
        return this.f17863a.I() == 1464156752;
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        return this.f17864b.i(interfaceC0373s, l7);
    }

    @Override // F0.r
    public void release() {
    }
}
