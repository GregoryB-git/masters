package V3;

import A2.AbstractC0328n;
import T3.d;
import T3.h;
import V3.A;
import c4.C0851c;
import c4.InterfaceC0852d;
import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import s3.C1947e;

/* renamed from: V3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0667f {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC0852d f6517a;

    /* renamed from: b, reason: collision with root package name */
    public j f6518b;

    /* renamed from: c, reason: collision with root package name */
    public A f6519c;

    /* renamed from: d, reason: collision with root package name */
    public A f6520d;

    /* renamed from: e, reason: collision with root package name */
    public r f6521e;

    /* renamed from: f, reason: collision with root package name */
    public String f6522f;

    /* renamed from: g, reason: collision with root package name */
    public List f6523g;

    /* renamed from: h, reason: collision with root package name */
    public String f6524h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6526j;

    /* renamed from: l, reason: collision with root package name */
    public C1947e f6528l;

    /* renamed from: m, reason: collision with root package name */
    public X3.e f6529m;

    /* renamed from: p, reason: collision with root package name */
    public l f6532p;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0852d.a f6525i = InterfaceC0852d.a.INFO;

    /* renamed from: k, reason: collision with root package name */
    public long f6527k = 10485760;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6530n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6531o = false;

    /* renamed from: V3.f$a */
    public class a implements A.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ScheduledExecutorService f6533a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d.a f6534b;

        public a(ScheduledExecutorService scheduledExecutorService, d.a aVar) {
            this.f6533a = scheduledExecutorService;
            this.f6534b = aVar;
        }

        @Override // V3.A.a
        public void a(final String str) {
            ScheduledExecutorService scheduledExecutorService = this.f6533a;
            final d.a aVar = this.f6534b;
            scheduledExecutorService.execute(new Runnable() { // from class: V3.e
                @Override // java.lang.Runnable
                public final void run() {
                    d.a.this.a(str);
                }
            });
        }
    }

    public static /* synthetic */ void D(A a7, ScheduledExecutorService scheduledExecutorService, boolean z7, d.a aVar) {
        a7.a(z7, new a(scheduledExecutorService, aVar));
    }

    public static T3.d H(final A a7, final ScheduledExecutorService scheduledExecutorService) {
        return new T3.d() { // from class: V3.d
            @Override // T3.d
            public final void a(boolean z7, d.a aVar) {
                AbstractC0667f.D(A.this, scheduledExecutorService, z7, aVar);
            }
        };
    }

    public final synchronized void A() {
        this.f6532p = new R3.i(this.f6528l);
    }

    public boolean B() {
        return this.f6530n;
    }

    public boolean C() {
        return this.f6526j;
    }

    public T3.h E(T3.f fVar, h.a aVar) {
        return u().d(this, n(), fVar, aVar);
    }

    public void F() {
        if (this.f6531o) {
            G();
            this.f6531o = false;
        }
    }

    public final void G() {
        this.f6518b.a();
        this.f6521e.a();
    }

    public void b() {
        if (B()) {
            throw new Q3.d("Modifications to DatabaseConfig objects must occur before they are in use");
        }
    }

    public final String c(String str) {
        return "Firebase/5/" + Q3.h.g() + "/" + str;
    }

    public final void d() {
        AbstractC0328n.j(this.f6520d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    public final void e() {
        AbstractC0328n.j(this.f6519c, "You must register an authTokenProvider before initializing Context.");
    }

    public final void f() {
        if (this.f6518b == null) {
            this.f6518b = u().g(this);
        }
    }

    public final void g() {
        if (this.f6517a == null) {
            this.f6517a = u().b(this, this.f6525i, this.f6523g);
        }
    }

    public final void h() {
        if (this.f6521e == null) {
            this.f6521e = this.f6532p.a(this);
        }
    }

    public final void i() {
        if (this.f6522f == null) {
            this.f6522f = "default";
        }
    }

    public final void j() {
        if (this.f6524h == null) {
            this.f6524h = c(u().e(this));
        }
    }

    public synchronized void k() {
        if (!this.f6530n) {
            this.f6530n = true;
            z();
        }
    }

    public A l() {
        return this.f6520d;
    }

    public A m() {
        return this.f6519c;
    }

    public T3.c n() {
        return new T3.c(r(), H(m(), p()), H(l(), p()), p(), C(), Q3.h.g(), y(), this.f6528l.r().c(), w().getAbsolutePath());
    }

    public j o() {
        return this.f6518b;
    }

    public final ScheduledExecutorService p() {
        r v7 = v();
        if (v7 instanceof Y3.c) {
            return ((Y3.c) v7).d();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    public C0851c q(String str) {
        return new C0851c(this.f6517a, str);
    }

    public InterfaceC0852d r() {
        return this.f6517a;
    }

    public long s() {
        return this.f6527k;
    }

    public X3.e t(String str) {
        X3.e eVar = this.f6529m;
        if (eVar != null) {
            return eVar;
        }
        if (!this.f6526j) {
            return new X3.d();
        }
        X3.e f7 = this.f6532p.f(this, str);
        if (f7 != null) {
            return f7;
        }
        throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
    }

    public final l u() {
        if (this.f6532p == null) {
            A();
        }
        return this.f6532p;
    }

    public r v() {
        return this.f6521e;
    }

    public File w() {
        return u().c();
    }

    public String x() {
        return this.f6522f;
    }

    public String y() {
        return this.f6524h;
    }

    public final void z() {
        g();
        u();
        j();
        f();
        h();
        i();
        e();
        d();
    }
}
