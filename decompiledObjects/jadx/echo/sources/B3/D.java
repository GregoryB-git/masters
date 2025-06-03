package B3;

import r4.InterfaceC1921a;
import r4.InterfaceC1922b;

/* loaded from: classes.dex */
public class D implements InterfaceC1922b, InterfaceC1921a {

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC1921a.InterfaceC0260a f733c = new InterfaceC1921a.InterfaceC0260a() { // from class: B3.A
        @Override // r4.InterfaceC1921a.InterfaceC0260a
        public final void a(InterfaceC1922b interfaceC1922b) {
            D.f(interfaceC1922b);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC1922b f734d = new InterfaceC1922b() { // from class: B3.B
        @Override // r4.InterfaceC1922b
        public final Object get() {
            Object g7;
            g7 = D.g();
            return g7;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1921a.InterfaceC0260a f735a;

    /* renamed from: b, reason: collision with root package name */
    public volatile InterfaceC1922b f736b;

    public D(InterfaceC1921a.InterfaceC0260a interfaceC0260a, InterfaceC1922b interfaceC1922b) {
        this.f735a = interfaceC0260a;
        this.f736b = interfaceC1922b;
    }

    public static D e() {
        return new D(f733c, f734d);
    }

    public static /* synthetic */ Object g() {
        return null;
    }

    public static /* synthetic */ void h(InterfaceC1921a.InterfaceC0260a interfaceC0260a, InterfaceC1921a.InterfaceC0260a interfaceC0260a2, InterfaceC1922b interfaceC1922b) {
        interfaceC0260a.a(interfaceC1922b);
        interfaceC0260a2.a(interfaceC1922b);
    }

    public static D i(InterfaceC1922b interfaceC1922b) {
        return new D(null, interfaceC1922b);
    }

    @Override // r4.InterfaceC1921a
    public void a(final InterfaceC1921a.InterfaceC0260a interfaceC0260a) {
        InterfaceC1922b interfaceC1922b;
        InterfaceC1922b interfaceC1922b2;
        InterfaceC1922b interfaceC1922b3 = this.f736b;
        InterfaceC1922b interfaceC1922b4 = f734d;
        if (interfaceC1922b3 != interfaceC1922b4) {
            interfaceC0260a.a(interfaceC1922b3);
            return;
        }
        synchronized (this) {
            interfaceC1922b = this.f736b;
            if (interfaceC1922b != interfaceC1922b4) {
                interfaceC1922b2 = interfaceC1922b;
            } else {
                final InterfaceC1921a.InterfaceC0260a interfaceC0260a2 = this.f735a;
                this.f735a = new InterfaceC1921a.InterfaceC0260a() { // from class: B3.C
                    @Override // r4.InterfaceC1921a.InterfaceC0260a
                    public final void a(InterfaceC1922b interfaceC1922b5) {
                        D.h(InterfaceC1921a.InterfaceC0260a.this, interfaceC0260a, interfaceC1922b5);
                    }
                };
                interfaceC1922b2 = null;
            }
        }
        if (interfaceC1922b2 != null) {
            interfaceC0260a.a(interfaceC1922b);
        }
    }

    @Override // r4.InterfaceC1922b
    public Object get() {
        return this.f736b.get();
    }

    public void j(InterfaceC1922b interfaceC1922b) {
        InterfaceC1921a.InterfaceC0260a interfaceC0260a;
        if (this.f736b != f734d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0260a = this.f735a;
            this.f735a = null;
            this.f736b = interfaceC1922b;
        }
        interfaceC0260a.a(interfaceC1922b);
    }

    public static /* synthetic */ void f(InterfaceC1922b interfaceC1922b) {
    }
}
