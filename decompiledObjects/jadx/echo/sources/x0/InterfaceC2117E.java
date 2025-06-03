package x0;

import android.os.Handler;
import d0.C1194q;
import g0.AbstractC1297a;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import x0.InterfaceC2117E;
import x0.InterfaceC2142x;

/* renamed from: x0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC2117E {

    /* renamed from: x0.E$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f20523a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC2142x.b f20524b;

        /* renamed from: c, reason: collision with root package name */
        public final CopyOnWriteArrayList f20525c;

        /* renamed from: x0.E$a$a, reason: collision with other inner class name */
        public static final class C0293a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f20526a;

            /* renamed from: b, reason: collision with root package name */
            public InterfaceC2117E f20527b;

            public C0293a(Handler handler, InterfaceC2117E interfaceC2117E) {
                this.f20526a = handler;
                this.f20527b = interfaceC2117E;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void A(final r rVar, final C2139u c2139u) {
            Iterator it = this.f20525c.iterator();
            while (it.hasNext()) {
                C0293a c0293a = (C0293a) it.next();
                final InterfaceC2117E interfaceC2117E = c0293a.f20527b;
                g0.M.S0(c0293a.f20526a, new Runnable() { // from class: x0.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2117E.a.this.n(interfaceC2117E, rVar, c2139u);
                    }
                });
            }
        }

        public void B(InterfaceC2117E interfaceC2117E) {
            Iterator it = this.f20525c.iterator();
            while (it.hasNext()) {
                C0293a c0293a = (C0293a) it.next();
                if (c0293a.f20527b == interfaceC2117E) {
                    this.f20525c.remove(c0293a);
                }
            }
        }

        public void C(int i7, long j7, long j8) {
            D(new C2139u(1, i7, null, 3, null, g0.M.i1(j7), g0.M.i1(j8)));
        }

        public void D(final C2139u c2139u) {
            final InterfaceC2142x.b bVar = (InterfaceC2142x.b) AbstractC1297a.e(this.f20524b);
            Iterator it = this.f20525c.iterator();
            while (it.hasNext()) {
                C0293a c0293a = (C0293a) it.next();
                final InterfaceC2117E interfaceC2117E = c0293a.f20527b;
                g0.M.S0(c0293a.f20526a, new Runnable() { // from class: x0.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2117E.a.this.o(interfaceC2117E, bVar, c2139u);
                    }
                });
            }
        }

        public a E(int i7, InterfaceC2142x.b bVar) {
            return new a(this.f20525c, i7, bVar);
        }

        public void g(Handler handler, InterfaceC2117E interfaceC2117E) {
            AbstractC1297a.e(handler);
            AbstractC1297a.e(interfaceC2117E);
            this.f20525c.add(new C0293a(handler, interfaceC2117E));
        }

        public void h(int i7, C1194q c1194q, int i8, Object obj, long j7) {
            i(new C2139u(1, i7, c1194q, i8, obj, g0.M.i1(j7), -9223372036854775807L));
        }

        public void i(final C2139u c2139u) {
            Iterator it = this.f20525c.iterator();
            while (it.hasNext()) {
                C0293a c0293a = (C0293a) it.next();
                final InterfaceC2117E interfaceC2117E = c0293a.f20527b;
                g0.M.S0(c0293a.f20526a, new Runnable() { // from class: x0.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2117E.a.this.j(interfaceC2117E, c2139u);
                    }
                });
            }
        }

        public final /* synthetic */ void j(InterfaceC2117E interfaceC2117E, C2139u c2139u) {
            interfaceC2117E.W(this.f20523a, this.f20524b, c2139u);
        }

        public final /* synthetic */ void k(InterfaceC2117E interfaceC2117E, r rVar, C2139u c2139u) {
            interfaceC2117E.p0(this.f20523a, this.f20524b, rVar, c2139u);
        }

        public final /* synthetic */ void l(InterfaceC2117E interfaceC2117E, r rVar, C2139u c2139u) {
            interfaceC2117E.m0(this.f20523a, this.f20524b, rVar, c2139u);
        }

        public final /* synthetic */ void m(InterfaceC2117E interfaceC2117E, r rVar, C2139u c2139u, IOException iOException, boolean z7) {
            interfaceC2117E.a0(this.f20523a, this.f20524b, rVar, c2139u, iOException, z7);
        }

        public final /* synthetic */ void n(InterfaceC2117E interfaceC2117E, r rVar, C2139u c2139u) {
            interfaceC2117E.K(this.f20523a, this.f20524b, rVar, c2139u);
        }

        public final /* synthetic */ void o(InterfaceC2117E interfaceC2117E, InterfaceC2142x.b bVar, C2139u c2139u) {
            interfaceC2117E.Z(this.f20523a, bVar, c2139u);
        }

        public void p(r rVar, int i7) {
            q(rVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void q(r rVar, int i7, int i8, C1194q c1194q, int i9, Object obj, long j7, long j8) {
            r(rVar, new C2139u(i7, i8, c1194q, i9, obj, g0.M.i1(j7), g0.M.i1(j8)));
        }

        public void r(final r rVar, final C2139u c2139u) {
            Iterator it = this.f20525c.iterator();
            while (it.hasNext()) {
                C0293a c0293a = (C0293a) it.next();
                final InterfaceC2117E interfaceC2117E = c0293a.f20527b;
                g0.M.S0(c0293a.f20526a, new Runnable() { // from class: x0.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2117E.a.this.k(interfaceC2117E, rVar, c2139u);
                    }
                });
            }
        }

        public void s(r rVar, int i7) {
            t(rVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void t(r rVar, int i7, int i8, C1194q c1194q, int i9, Object obj, long j7, long j8) {
            u(rVar, new C2139u(i7, i8, c1194q, i9, obj, g0.M.i1(j7), g0.M.i1(j8)));
        }

        public void u(final r rVar, final C2139u c2139u) {
            Iterator it = this.f20525c.iterator();
            while (it.hasNext()) {
                C0293a c0293a = (C0293a) it.next();
                final InterfaceC2117E interfaceC2117E = c0293a.f20527b;
                g0.M.S0(c0293a.f20526a, new Runnable() { // from class: x0.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2117E.a.this.l(interfaceC2117E, rVar, c2139u);
                    }
                });
            }
        }

        public void v(r rVar, int i7, int i8, C1194q c1194q, int i9, Object obj, long j7, long j8, IOException iOException, boolean z7) {
            x(rVar, new C2139u(i7, i8, c1194q, i9, obj, g0.M.i1(j7), g0.M.i1(j8)), iOException, z7);
        }

        public void w(r rVar, int i7, IOException iOException, boolean z7) {
            v(rVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z7);
        }

        public void x(final r rVar, final C2139u c2139u, final IOException iOException, final boolean z7) {
            Iterator it = this.f20525c.iterator();
            while (it.hasNext()) {
                C0293a c0293a = (C0293a) it.next();
                final InterfaceC2117E interfaceC2117E = c0293a.f20527b;
                g0.M.S0(c0293a.f20526a, new Runnable() { // from class: x0.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC2117E.a.this.m(interfaceC2117E, rVar, c2139u, iOException, z7);
                    }
                });
            }
        }

        public void y(r rVar, int i7) {
            z(rVar, i7, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        public void z(r rVar, int i7, int i8, C1194q c1194q, int i9, Object obj, long j7, long j8) {
            A(rVar, new C2139u(i7, i8, c1194q, i9, obj, g0.M.i1(j7), g0.M.i1(j8)));
        }

        public a(CopyOnWriteArrayList copyOnWriteArrayList, int i7, InterfaceC2142x.b bVar) {
            this.f20525c = copyOnWriteArrayList;
            this.f20523a = i7;
            this.f20524b = bVar;
        }
    }

    void K(int i7, InterfaceC2142x.b bVar, r rVar, C2139u c2139u);

    void W(int i7, InterfaceC2142x.b bVar, C2139u c2139u);

    void Z(int i7, InterfaceC2142x.b bVar, C2139u c2139u);

    void a0(int i7, InterfaceC2142x.b bVar, r rVar, C2139u c2139u, IOException iOException, boolean z7);

    void m0(int i7, InterfaceC2142x.b bVar, r rVar, C2139u c2139u);

    void p0(int i7, InterfaceC2142x.b bVar, r rVar, C2139u c2139u);
}
