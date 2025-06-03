package k0;

import d0.C1164C;
import g0.InterfaceC1299c;

/* loaded from: classes.dex */
public final class e1 implements A0 {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1299c f15706o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15707p;

    /* renamed from: q, reason: collision with root package name */
    public long f15708q;

    /* renamed from: r, reason: collision with root package name */
    public long f15709r;

    /* renamed from: s, reason: collision with root package name */
    public C1164C f15710s = C1164C.f12353d;

    public e1(InterfaceC1299c interfaceC1299c) {
        this.f15706o = interfaceC1299c;
    }

    @Override // k0.A0
    public long H() {
        long j7 = this.f15708q;
        if (!this.f15707p) {
            return j7;
        }
        long b7 = this.f15706o.b() - this.f15709r;
        C1164C c1164c = this.f15710s;
        return j7 + (c1164c.f12356a == 1.0f ? g0.M.J0(b7) : c1164c.a(b7));
    }

    public void a(long j7) {
        this.f15708q = j7;
        if (this.f15707p) {
            this.f15709r = this.f15706o.b();
        }
    }

    public void b() {
        if (this.f15707p) {
            return;
        }
        this.f15709r = this.f15706o.b();
        this.f15707p = true;
    }

    public void c() {
        if (this.f15707p) {
            a(H());
            this.f15707p = false;
        }
    }

    @Override // k0.A0
    public C1164C h() {
        return this.f15710s;
    }

    @Override // k0.A0
    public void k(C1164C c1164c) {
        if (this.f15707p) {
            a(H());
        }
        this.f15710s = c1164c;
    }

    @Override // k0.A0
    public /* synthetic */ boolean r() {
        return AbstractC1449z0.a(this);
    }
}
