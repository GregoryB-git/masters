package N0;

import F0.D;
import F0.InterfaceC0374t;
import F0.M;
import F0.N;
import F0.T;

/* loaded from: classes.dex */
public final class e implements InterfaceC0374t {

    /* renamed from: o, reason: collision with root package name */
    public final long f3598o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0374t f3599p;

    public class a extends D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ M f3600b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M m7, M m8) {
            super(m7);
            this.f3600b = m8;
        }

        @Override // F0.D, F0.M
        public M.a j(long j7) {
            M.a j8 = this.f3600b.j(j7);
            N n7 = j8.f1789a;
            N n8 = new N(n7.f1794a, n7.f1795b + e.this.f3598o);
            N n9 = j8.f1790b;
            return new M.a(n8, new N(n9.f1794a, n9.f1795b + e.this.f3598o));
        }
    }

    public e(long j7, InterfaceC0374t interfaceC0374t) {
        this.f3598o = j7;
        this.f3599p = interfaceC0374t;
    }

    @Override // F0.InterfaceC0374t
    public T a(int i7, int i8) {
        return this.f3599p.a(i7, i8);
    }

    @Override // F0.InterfaceC0374t
    public void e(M m7) {
        this.f3599p.e(new a(m7, m7));
    }

    @Override // F0.InterfaceC0374t
    public void j() {
        this.f3599p.j();
    }
}
