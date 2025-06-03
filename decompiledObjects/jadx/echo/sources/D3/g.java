package D3;

import H3.A;
import H3.AbstractC0387i;
import H3.C;
import H3.C0379a;
import H3.C0384f;
import H3.C0391m;
import H3.C0396s;
import H3.C0402y;
import R4.l;
import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import V2.m;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import r4.InterfaceC1921a;
import s3.C1947e;
import s4.i;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final C0396s f1260a;

    public class a implements InterfaceC0651b {
        @Override // V2.InterfaceC0651b
        public Object a(AbstractC0659j abstractC0659j) {
            if (abstractC0659j.n()) {
                return null;
            }
            E3.f.f().e("Error fetching settings.", abstractC0659j.i());
            return null;
        }
    }

    public class b implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f1261o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ C0396s f1262p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ O3.f f1263q;

        public b(boolean z7, C0396s c0396s, O3.f fVar) {
            this.f1261o = z7;
            this.f1262p = c0396s;
            this.f1263q = fVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (!this.f1261o) {
                return null;
            }
            this.f1262p.j(this.f1263q);
            return null;
        }
    }

    public g(C0396s c0396s) {
        this.f1260a = c0396s;
    }

    public static g d() {
        g gVar = (g) C1947e.o().k(g.class);
        if (gVar != null) {
            return gVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public static g e(C1947e c1947e, i iVar, l lVar, InterfaceC1921a interfaceC1921a, InterfaceC1921a interfaceC1921a2) {
        Context m7 = c1947e.m();
        String packageName = m7.getPackageName();
        E3.f.f().g("Initializing Firebase Crashlytics " + C0396s.l() + " for " + packageName);
        M3.g gVar = new M3.g(m7);
        C0402y c0402y = new C0402y(c1947e);
        C c7 = new C(m7, packageName, iVar, c0402y);
        E3.d dVar = new E3.d(interfaceC1921a);
        d dVar2 = new d(interfaceC1921a2);
        ExecutorService c8 = A.c("Crashlytics Exception Handler");
        C0391m c0391m = new C0391m(c0402y, gVar);
        lVar.e(c0391m);
        C0396s c0396s = new C0396s(c1947e, c7, dVar, c0402y, dVar2.e(), dVar2.d(), gVar, c8, c0391m);
        String c9 = c1947e.r().c();
        String n7 = AbstractC0387i.n(m7);
        List<C0384f> k7 = AbstractC0387i.k(m7);
        E3.f.f().b("Mapping file ID is: " + n7);
        for (C0384f c0384f : k7) {
            E3.f.f().b(String.format("Build id for %s on %s: %s", c0384f.c(), c0384f.a(), c0384f.b()));
        }
        try {
            C0379a a7 = C0379a.a(m7, c7, c9, n7, k7, new E3.e(m7));
            E3.f.f().i("Installer package name is: " + a7.f2242d);
            ExecutorService c10 = A.c("com.google.firebase.crashlytics.startup");
            O3.f l7 = O3.f.l(m7, c9, c7, new L3.b(), a7.f2244f, a7.f2245g, gVar, c0402y);
            l7.p(c10).g(c10, new a());
            m.c(c10, new b(c0396s.s(a7, l7), c0396s, l7));
            return new g(c0396s);
        } catch (PackageManager.NameNotFoundException e7) {
            E3.f.f().e("Error retrieving app package info.", e7);
            return null;
        }
    }

    public AbstractC0659j a() {
        return this.f1260a.e();
    }

    public void b() {
        this.f1260a.f();
    }

    public boolean c() {
        return this.f1260a.g();
    }

    public void f(String str) {
        this.f1260a.n(str);
    }

    public void g(Throwable th) {
        if (th == null) {
            E3.f.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f1260a.o(th);
        }
    }

    public void h() {
        this.f1260a.t();
    }

    public void i(Boolean bool) {
        this.f1260a.u(bool);
    }

    public void j(boolean z7) {
        this.f1260a.u(Boolean.valueOf(z7));
    }

    public void k(String str, String str2) {
        this.f1260a.v(str, str2);
    }

    public void l(String str) {
        this.f1260a.x(str);
    }
}
