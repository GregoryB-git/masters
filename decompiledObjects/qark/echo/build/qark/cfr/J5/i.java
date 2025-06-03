/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ExecutorService
 */
package J5;

import A5.a;
import J5.a;
import J5.b;
import J5.c;
import J5.d;
import J5.e;
import J5.f;
import J5.g;
import J5.h;
import J5.o;
import J5.p;
import J5.t;
import V2.j;
import V2.k;
import android.content.Context;
import android.os.Looper;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import s3.m;

public class i
implements A5.a,
p.b,
p.a {
    public Context a;
    public boolean b = false;

    public static /* synthetic */ void g(String string2, Boolean bl, k k8) {
        i.w(string2, bl, k8);
    }

    public static /* synthetic */ void h(i i8, p.d d8, String string2, k k8) {
        i8.s(d8, string2, k8);
    }

    public static /* synthetic */ void i(String string2, Boolean bl, k k8) {
        i.x(string2, bl, k8);
    }

    public static /* synthetic */ void j(i i8, s3.e e8, k k8) {
        i8.r(e8, k8);
    }

    public static /* synthetic */ void k(String string2, k k8) {
        i.q(string2, k8);
    }

    public static /* synthetic */ void l(i i8, k k8) {
        i8.v(k8);
    }

    public static /* synthetic */ void m(i i8, k k8) {
        i8.t(k8);
    }

    public static /* synthetic */ void n(p.f f8, j j8) {
        i.u(f8, j8);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void q(String object, k k8) {
        try {
            object = s3.e.p((String)object);
            object.j();
        }
        catch (Exception exception) {}
        k8.b(exception);
        return;
        catch (IllegalStateException illegalStateException) {}
        k8.c(null);
    }

    public static /* synthetic */ void u(p.f f8, j j8) {
        if (j8.n()) {
            f8.a(j8.j());
            return;
        }
        f8.b((Throwable)j8.i());
    }

    public static /* synthetic */ void w(String string2, Boolean bl, k k8) {
        try {
            s3.e.p(string2).F(bl);
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    public static /* synthetic */ void x(String string2, Boolean bl, k k8) {
        try {
            s3.e.p(string2).E(bl);
            k8.c(null);
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    @Override
    public void a(p.f f8) {
        k k8 = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new d(this, k8));
        this.y(k8, f8);
    }

    @Override
    public void b(String string2, Boolean bl, p.f f8) {
        k k8 = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new e(string2, bl, k8));
        this.y(k8, f8);
    }

    @Override
    public void c(p.f f8) {
        k k8 = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new b(this, k8));
        this.y(k8, f8);
    }

    @Override
    public void d(String string2, p.f f8) {
        k k8 = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new a(string2, k8));
        this.y(k8, f8);
    }

    @Override
    public void e(String string2, p.d d8, p.f f8) {
        k k8 = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new f(this, d8, string2, k8));
        this.y(k8, f8);
    }

    @Override
    public void f(String string2, Boolean bl, p.f f8) {
        k k8 = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new c(string2, bl, k8));
        this.y(k8, f8);
    }

    public final j o(s3.e e8) {
        k k8 = new k();
        FlutterFirebasePlugin.cachedThreadPool.execute((Runnable)new h(this, e8, k8));
        return k8.a();
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        t.e(b8.b(), this);
        o.e(b8.b(), this);
        this.a = b8.a();
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        this.a = null;
        t.e(b8.b(), null);
        o.e(b8.b(), null);
    }

    public final p.d p(m m8) {
        p.d.a a8 = new p.d.a();
        a8.b(m8.b());
        a8.c(m8.c());
        if (m8.f() != null) {
            a8.e(m8.f());
        }
        if (m8.g() != null) {
            a8.f(m8.g());
        }
        a8.d(m8.d());
        a8.g(m8.h());
        a8.h(m8.e());
        return a8.a();
    }

    public final /* synthetic */ void r(s3.e e8, k k8) {
        try {
            p.e.a a8 = new p.e.a();
            a8.c(e8.q());
            a8.d(this.p(e8.r()));
            a8.b(e8.x());
            a8.e((Map)V2.m.a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(e8)));
            k8.c(a8.a());
            return;
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void s(p.d object, String string2, k k8) {
        try {
            object = new m.b().b(object.b()).c(object.c()).d(object.d()).f(object.e()).g(object.f()).h(object.g()).e(object.h()).a();
        }
        catch (Exception exception) {
            k8.b(exception);
            return;
        }
        try {
            Looper.prepare();
        }
        catch (Exception exception) {}
        k8.c((p.e)V2.m.a(this.o(s3.e.w(this.a, (m)object, string2))));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void t(k k8) {
        try {
            if (!this.b) {
                this.b = true;
            } else {
                V2.m.a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            }
            List list = s3.e.n(this.a);
            ArrayList arrayList = new ArrayList(list.size());
            list = list.iterator();
            do {
                if (!list.hasNext()) {
                    k8.c((Object)arrayList);
                    return;
                }
                arrayList.add((Object)((p.e)V2.m.a(this.o((s3.e)list.next()))));
            } while (true);
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void v(k k8) {
        try {
            m m8 = m.a(this.a);
            if (m8 == null) {
                k8.c(null);
                return;
            }
            k8.c(this.p(m8));
            return;
        }
        catch (Exception exception) {}
        k8.b(exception);
    }

    public final void y(k k8, p.f f8) {
        k8.a().b(new g(f8));
    }
}

