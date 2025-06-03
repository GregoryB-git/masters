// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import java.io.File;
import T3.c;
import A2.n;
import T3.h;
import R3.i;
import java.util.concurrent.ScheduledExecutorService;
import s3.e;
import java.util.List;
import c4.d;

public abstract class f
{
    public d a;
    public j b;
    public A c;
    public A d;
    public r e;
    public String f;
    public List g;
    public String h;
    public d.a i;
    public boolean j;
    public long k;
    public e l;
    public X3.e m;
    public boolean n;
    public boolean o;
    public l p;
    
    public f() {
        this.i = c4.d.a.p;
        this.k = 10485760L;
        this.n = false;
        this.o = false;
    }
    
    public static T3.d H(final A a, final ScheduledExecutorService scheduledExecutorService) {
        return new V3.d(a, scheduledExecutorService);
    }
    
    public final void A() {
        synchronized (this) {
            this.p = new i(this.l);
        }
    }
    
    public boolean B() {
        return this.n;
    }
    
    public boolean C() {
        return this.j;
    }
    
    public h E(final T3.f f, final h.a a) {
        return this.u().d(this, this.n(), f, a);
    }
    
    public void F() {
        if (this.o) {
            this.G();
            this.o = false;
        }
    }
    
    public final void G() {
        this.b.a();
        this.e.a();
    }
    
    public void b() {
        if (!this.B()) {
            return;
        }
        throw new Q3.d("Modifications to DatabaseConfig objects must occur before they are in use");
    }
    
    public final String c(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Firebase/");
        sb.append("5");
        sb.append("/");
        sb.append(Q3.h.g());
        sb.append("/");
        sb.append(str);
        return sb.toString();
    }
    
    public final void d() {
        A2.n.j(this.d, "You must register an appCheckTokenProvider before initializing Context.");
    }
    
    public final void e() {
        A2.n.j(this.c, "You must register an authTokenProvider before initializing Context.");
    }
    
    public final void f() {
        if (this.b == null) {
            this.b = this.u().g(this);
        }
    }
    
    public final void g() {
        if (this.a == null) {
            this.a = this.u().b(this, this.i, this.g);
        }
    }
    
    public final void h() {
        if (this.e == null) {
            this.e = this.p.a(this);
        }
    }
    
    public final void i() {
        if (this.f == null) {
            this.f = "default";
        }
    }
    
    public final void j() {
        if (this.h == null) {
            this.h = this.c(this.u().e(this));
        }
    }
    
    public void k() {
        // monitorenter(this)
        // monitorexit(this)
        Label_0028: {
            try {
                if (!this.n) {
                    this.n = true;
                    this.z();
                }
            }
            finally {
                break Label_0028;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public A l() {
        return this.d;
    }
    
    public A m() {
        return this.c;
    }
    
    public c n() {
        return new c(this.r(), H(this.m(), this.p()), H(this.l(), this.p()), this.p(), this.C(), Q3.h.g(), this.y(), this.l.r().c(), this.w().getAbsolutePath());
    }
    
    public j o() {
        return this.b;
    }
    
    public final ScheduledExecutorService p() {
        final r v = this.v();
        if (v instanceof Y3.c) {
            return ((Y3.c)v).d();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }
    
    public c4.c q(final String s) {
        return new c4.c(this.a, s);
    }
    
    public d r() {
        return this.a;
    }
    
    public long s() {
        return this.k;
    }
    
    public X3.e t(final String s) {
        final X3.e m = this.m;
        if (m != null) {
            return m;
        }
        if (!this.j) {
            return new X3.d();
        }
        final X3.e f = this.p.f(this, s);
        if (f != null) {
            return f;
        }
        throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
    }
    
    public final l u() {
        if (this.p == null) {
            this.A();
        }
        return this.p;
    }
    
    public r v() {
        return this.e;
    }
    
    public File w() {
        return this.u().c();
    }
    
    public String x() {
        return this.f;
    }
    
    public String y() {
        return this.h;
    }
    
    public final void z() {
        this.g();
        this.u();
        this.j();
        this.f();
        this.h();
        this.i();
        this.e();
        this.d();
    }
}
