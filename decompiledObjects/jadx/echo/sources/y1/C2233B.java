package y1;

import O1.C0451n;
import O1.C0458v;
import y1.C2233B;

/* renamed from: y1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2233B {

    /* renamed from: a, reason: collision with root package name */
    public static final C2233B f21309a = new C2233B();

    public static final void a() {
        if (T1.a.d(C2233B.class)) {
            return;
        }
        try {
            C0458v c0458v = C0458v.f3949a;
            C0458v.d(new a());
        } catch (Throwable th) {
            T1.a.b(th, C2233B.class);
        }
    }

    /* renamed from: y1.B$a */
    public static final class a implements C0458v.b {
        public static final void k(boolean z7) {
            if (z7) {
                z1.b.b();
            }
        }

        public static final void l(boolean z7) {
            if (z7) {
                J1.a.a();
            }
        }

        public static final void m(boolean z7) {
            if (z7) {
                H1.f.f();
            }
        }

        public static final void n(boolean z7) {
            if (z7) {
                D1.a.a();
            }
        }

        public static final void o(boolean z7) {
            if (z7) {
                E1.k.a();
            }
        }

        public static final void p(boolean z7) {
            if (z7) {
                F1.c.b();
            }
        }

        public static final void q(boolean z7) {
            if (z7) {
                F1.b.a();
            }
        }

        public static final void r(boolean z7) {
            if (z7) {
                A1.d.b();
            }
        }

        @Override // O1.C0458v.b
        public void b(O1.r rVar) {
            C0451n c0451n = C0451n.f3862a;
            C0451n.a(C0451n.b.AAM, new C0451n.a() { // from class: y1.t
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2233B.a.k(z7);
                }
            });
            C0451n.a(C0451n.b.RestrictiveDataFiltering, new C0451n.a() { // from class: y1.u
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2233B.a.l(z7);
                }
            });
            C0451n.a(C0451n.b.PrivacyProtection, new C0451n.a() { // from class: y1.v
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2233B.a.m(z7);
                }
            });
            C0451n.a(C0451n.b.EventDeactivation, new C0451n.a() { // from class: y1.w
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2233B.a.n(z7);
                }
            });
            C0451n.a(C0451n.b.IapLogging, new C0451n.a() { // from class: y1.x
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2233B.a.o(z7);
                }
            });
            C0451n.a(C0451n.b.ProtectedMode, new C0451n.a() { // from class: y1.y
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2233B.a.p(z7);
                }
            });
            C0451n.a(C0451n.b.MACARuleMatching, new C0451n.a() { // from class: y1.z
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2233B.a.q(z7);
                }
            });
            C0451n.a(C0451n.b.CloudBridge, new C0451n.a() { // from class: y1.A
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    C2233B.a.r(z7);
                }
            });
        }

        @Override // O1.C0458v.b
        public void a() {
        }
    }
}
