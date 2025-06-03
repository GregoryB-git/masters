package Q1;

import O1.C0451n;
import x1.C2146B;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f4343a = new g();

    public static final void d() {
        if (C2146B.p()) {
            C0451n c0451n = C0451n.f3862a;
            C0451n.a(C0451n.b.CrashReport, new C0451n.a() { // from class: Q1.d
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    g.e(z7);
                }
            });
            C0451n.a(C0451n.b.ErrorReport, new C0451n.a() { // from class: Q1.e
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    g.f(z7);
                }
            });
            C0451n.a(C0451n.b.AnrReport, new C0451n.a() { // from class: Q1.f
                @Override // O1.C0451n.a
                public final void a(boolean z7) {
                    g.g(z7);
                }
            });
        }
    }

    public static final void e(boolean z7) {
        if (z7) {
            S1.c.f5831b.c();
            C0451n c0451n = C0451n.f3862a;
            if (C0451n.g(C0451n.b.CrashShield)) {
                b.b();
                T1.a.a();
            }
            if (C0451n.g(C0451n.b.ThreadCheck)) {
                V1.a.a();
            }
        }
    }

    public static final void f(boolean z7) {
        if (z7) {
            U1.e.d();
        }
    }

    public static final void g(boolean z7) {
        if (z7) {
            R1.e.c();
        }
    }
}
