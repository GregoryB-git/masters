// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D3;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.concurrent.Callable;
import V2.j;
import java.util.concurrent.Executor;
import S4.b;
import H3.m;
import H3.A;
import E3.d;
import H3.C;
import H3.y;
import E3.f;
import r4.a;
import R4.l;
import s4.i;
import s3.e;
import H3.s;

public class g
{
    public final s a;
    
    public g(final s a) {
        this.a = a;
    }
    
    public static g d() {
        final g g = (g)e.o().k(g.class);
        if (g != null) {
            return g;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }
    
    public static g e(final e e, final i i, final l l, final a a, final a a2) {
        final Context m = e.m();
        final String packageName = m.getPackageName();
        final f f = E3.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Initializing Firebase Crashlytics ");
        sb.append(s.l());
        sb.append(" for ");
        sb.append(packageName);
        f.g(sb.toString());
        final M3.g g = new M3.g(m);
        final y y = new y(e);
        final C c = new C(m, packageName, i, y);
        final d d = new d(a);
        final D3.d d2 = new D3.d(a2);
        final ExecutorService c2 = A.c("Crashlytics Exception Handler");
        final m j = new m(y, g);
        l.e(j);
        final s s = new s(e, c, d, y, d2.e(), d2.d(), g, c2, j);
        final String c3 = e.r().c();
        final String n = H3.i.n(m);
        final List k = H3.i.k(m);
        final f f2 = E3.f.f();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Mapping file ID is: ");
        sb2.append(n);
        f2.b(sb2.toString());
        for (final H3.f f3 : k) {
            E3.f.f().b(String.format("Build id for %s on %s: %s", f3.c(), f3.a(), f3.b()));
        }
        final E3.e e2 = new E3.e(m);
        try {
            final H3.a a3 = H3.a.a(m, c, c3, n, k, e2);
            final f f4 = E3.f.f();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Installer package name is: ");
            sb3.append(a3.d);
            f4.i(sb3.toString());
            final ExecutorService c4 = A.c("com.google.firebase.crashlytics.startup");
            final O3.f l2 = O3.f.l(m, c3, c, new L3.b(), a3.f, a3.g, g, y);
            l2.p(c4).g(c4, new V2.b() {
                @Override
                public Object a(final j j) {
                    if (!j.n()) {
                        E3.f.f().e("Error fetching settings.", j.i());
                    }
                    return null;
                }
            });
            V2.m.c(c4, new Callable() {
                public final /* synthetic */ boolean o = s.s(a3, l2);
                
                public Void a() {
                    if (this.o) {
                        s.j(l2);
                    }
                    return null;
                }
            });
            return new g(s);
        }
        catch (PackageManager$NameNotFoundException ex) {
            E3.f.f().e("Error retrieving app package info.", (Throwable)ex);
            return null;
        }
    }
    
    public j a() {
        return this.a.e();
    }
    
    public void b() {
        this.a.f();
    }
    
    public boolean c() {
        return this.a.g();
    }
    
    public void f(final String s) {
        this.a.n(s);
    }
    
    public void g(final Throwable t) {
        if (t == null) {
            f.f().k("A null value was passed to recordException. Ignoring.");
            return;
        }
        this.a.o(t);
    }
    
    public void h() {
        this.a.t();
    }
    
    public void i(final Boolean b) {
        this.a.u(b);
    }
    
    public void j(final boolean b) {
        this.a.u(b);
    }
    
    public void k(final String s, final String s2) {
        this.a.v(s, s2);
    }
    
    public void l(final String s) {
        this.a.x(s);
    }
}
