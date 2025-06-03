/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.concurrent.ScheduledExecutorService
 */
package V3;

import A2.n;
import R3.i;
import T3.c;
import T3.d;
import T3.h;
import V3.A;
import V3.d;
import V3.e;
import V3.j;
import V3.l;
import V3.r;
import c4.d;
import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import s3.m;

public abstract class f {
    public c4.d a;
    public j b;
    public A c;
    public A d;
    public r e;
    public String f;
    public List g;
    public String h;
    public d.a i = d.a.p;
    public boolean j;
    public long k = 0xA00000L;
    public s3.e l;
    public X3.e m;
    public boolean n = false;
    public boolean o = false;
    public l p;

    public static T3.d H(A a8, ScheduledExecutorService scheduledExecutorService) {
        return new d(a8, scheduledExecutorService);
    }

    public static /* synthetic */ void a(A a8, ScheduledExecutorService scheduledExecutorService, boolean bl, d.a a9) {
        a8.a(bl, new A.a(){

            public static /* synthetic */ void b(d.a a8, String string2) {
                a8.a(string2);
            }

            @Override
            public void a(String string2) {
                ScheduledExecutorService.this.execute((Runnable)new e(a9, string2));
            }
        });
    }

    public final void A() {
        synchronized (this) {
            this.p = new i(this.l);
            return;
        }
    }

    public boolean B() {
        return this.n;
    }

    public boolean C() {
        return this.j;
    }

    public h E(T3.f f8, h.a a8) {
        return this.u().d(this, this.n(), f8, a8);
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

    public final String c(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Firebase/");
        stringBuilder.append("5");
        stringBuilder.append("/");
        stringBuilder.append(Q3.h.g());
        stringBuilder.append("/");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void d() {
        n.j(this.d, "You must register an appCheckTokenProvider before initializing Context.");
    }

    public final void e() {
        n.j(this.c, "You must register an authTokenProvider before initializing Context.");
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
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                block3 : {
                    try {
                        if (this.n) break block3;
                        this.n = true;
                        this.z();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public A l() {
        return this.d;
    }

    public A m() {
        return this.c;
    }

    public c n() {
        return new c(this.r(), f.H(this.m(), this.p()), f.H(this.l(), this.p()), this.p(), this.C(), Q3.h.g(), this.y(), this.l.r().c(), this.w().getAbsolutePath());
    }

    public j o() {
        return this.b;
    }

    public final ScheduledExecutorService p() {
        r r8 = this.v();
        if (r8 instanceof Y3.c) {
            return ((Y3.c)r8).d();
        }
        throw new RuntimeException("Custom run loops are not supported!");
    }

    public c4.c q(String string2) {
        return new c4.c(this.a, string2);
    }

    public c4.d r() {
        return this.a;
    }

    public long s() {
        return this.k;
    }

    public X3.e t(String object) {
        X3.e e8 = this.m;
        if (e8 != null) {
            return e8;
        }
        if (this.j) {
            if ((object = this.p.f(this, (String)object)) != null) {
                return object;
            }
            throw new IllegalArgumentException("You have enabled persistence, but persistence is not supported on this platform.");
        }
        return new X3.d();
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

