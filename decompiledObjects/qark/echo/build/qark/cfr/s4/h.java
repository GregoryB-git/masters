/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicInteger
 */
package s4;

import A2.n;
import B3.x;
import V2.k;
import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import s4.b;
import s4.c;
import s4.d;
import s4.e;
import s4.f;
import s4.g;
import s4.i;
import s4.j;
import s4.l;
import s4.m;
import s4.o;
import s4.p;
import s4.q;
import t4.a;
import v4.d;
import v4.f;

public class h
implements i {
    public static final Object m = new Object();
    public static final ThreadFactory n = new ThreadFactory(){
        public final AtomicInteger a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format((String)"firebase-installations-executor-%d", (Object[])new Object[]{this.a.getAndIncrement()}));
        }
    };
    public final s3.e a;
    public final v4.c b;
    public final u4.c c;
    public final q d;
    public final x e;
    public final o f;
    public final Object g = new Object();
    public final ExecutorService h;
    public final Executor i;
    public String j;
    public Set k = new HashSet();
    public final List l = new ArrayList();

    public h(ExecutorService executorService, Executor executor, s3.e e8, v4.c c8, u4.c c9, q q8, x x8, o o8) {
        this.a = e8;
        this.b = c8;
        this.c = c9;
        this.d = q8;
        this.e = x8;
        this.f = o8;
        this.h = executorService;
        this.i = executor;
    }

    public h(s3.e e8, r4.b b8, ExecutorService executorService, Executor executor) {
        this(executorService, executor, e8, new v4.c(e8.m(), b8), new u4.c(e8), q.c(), new x(new c(e8)), new o());
    }

    public static /* synthetic */ u4.b C(s3.e e8) {
        return new u4.b(e8);
    }

    public static /* synthetic */ Void c(h h8) {
        return h8.l();
    }

    public static /* synthetic */ void d(h h8, boolean bl) {
        h8.B(bl);
    }

    public static /* synthetic */ void e(h h8, boolean bl) {
        h8.z(bl);
    }

    public static /* synthetic */ void f(h h8) {
        h8.A();
    }

    public static /* synthetic */ u4.b g(s3.e e8) {
        return h.C(e8);
    }

    public static h t() {
        return h.u(s3.e.o());
    }

    public static h u(s3.e e8) {
        boolean bl = e8 != null;
        n.b(bl, "Null is not a valid value of FirebaseApp.");
        return (h)e8.k(i.class);
    }

    public final /* synthetic */ void A() {
        this.n(false);
    }

    public final /* synthetic */ void B(boolean bl) {
        this.n(bl);
    }

    public final void D() {
        n.f(this.q(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.f(this.x(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.f(this.p(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.b(q.h(this.q()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        n.b(q.g(this.p()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String E(u4.d object) {
        if (!this.a.q().equals((Object)"CHIME_ANDROID_SDK") && !this.a.y() || !object.m()) {
            return this.f.a();
        }
        String string2 = this.s().f();
        object = string2;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            object = this.f.a();
        }
        return object;
    }

    public t4.b F(a object) {
        synchronized (this) {
            this.k.add(object);
            object = new t4.b((a)object){
                public final /* synthetic */ a a;
                {
                    this.a = a8;
                }
            };
            return object;
        }
    }

    public final u4.d G(u4.d d8) {
        Object object = d8.d() != null && d8.d().length() == 11 ? this.s().i() : null;
        object = this.b.d(this.p(), d8.d(), this.x(), this.q(), (String)object);
        int n8 = .a[object.e().ordinal()];
        if (n8 != 1) {
            if (n8 == 2) {
                return d8.q("BAD CONFIG");
            }
            throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
        }
        return d8.s(object.c(), object.d(), this.d.b(), object.b().c(), object.b().d());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void H(Exception exception) {
        Object object = this.g;
        synchronized (object) {
            try {
                Iterator iterator = this.l.iterator();
                do {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    if (!((p)iterator.next()).a(exception)) continue;
                    iterator.remove();
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void I(u4.d d8) {
        Object object = this.g;
        synchronized (object) {
            try {
                Iterator iterator = this.l.iterator();
                do {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    if (!((p)iterator.next()).b(d8)) continue;
                    iterator.remove();
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void J(String string2) {
        synchronized (this) {
            this.j = string2;
            return;
        }
    }

    public final void K(u4.d d8, u4.d d9) {
        synchronized (this) {
            Throwable throwable2;
            block5 : {
                block4 : {
                    try {
                        if (this.k.size() == 0 || TextUtils.equals((CharSequence)d8.d(), (CharSequence)d9.d())) break block4;
                        d8 = this.k.iterator();
                        while (d8.hasNext()) {
                            ((a)d8.next()).a(d9.d());
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public V2.j a() {
        this.D();
        Object object = this.r();
        if (object != null) {
            return V2.m.e(object);
        }
        object = this.i();
        this.h.execute((Runnable)new d(this));
        return object;
    }

    @Override
    public V2.j b(boolean bl) {
        this.D();
        V2.j j8 = this.h();
        this.h.execute((Runnable)new f(this, bl));
        return j8;
    }

    public final V2.j h() {
        k k8 = new k();
        this.j(new l(this.d, k8));
        return k8.a();
    }

    public final V2.j i() {
        k k8 = new k();
        this.j(new m(k8));
        return k8.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(p p8) {
        Object object = this.g;
        synchronized (object) {
            this.l.add((Object)p8);
            return;
        }
    }

    public V2.j k() {
        return V2.m.c((Executor)this.h, new g(this));
    }

    public final Void l() {
        this.J(null);
        u4.d d8 = this.v();
        if (d8.k()) {
            this.b.e(this.p(), d8.d(), this.x(), d8.f());
        }
        this.y(d8.r());
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m(boolean bl) {
        j j82;
        block7 : {
            u4.d d8;
            Object object;
            block8 : {
                d8 = this.v();
                try {
                    if (!d8.i() && !d8.l()) {
                        if (!bl && !this.d.f(d8)) break block7;
                        object = this.o(d8);
                        break block8;
                    }
                    object = this.G(d8);
                }
                catch (j j82) {}
            }
            this.y((u4.d)object);
            this.K(d8, (u4.d)object);
            if (object.k()) {
                this.J(object.d());
            }
            if (object.i()) {
                object = new j(j.a.o);
            } else {
                if (!object.j()) {
                    this.I((u4.d)object);
                    return;
                }
                object = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            this.H((Exception)object);
            return;
        }
        return;
        this.H(j82);
    }

    public final void n(boolean bl) {
        u4.d d8;
        u4.d d9 = d8 = this.w();
        if (bl) {
            d9 = d8.p();
        }
        this.I(d9);
        this.i.execute((Runnable)new e(this, bl));
    }

    public final u4.d o(u4.d d8) {
        v4.f f8 = this.b.f(this.p(), d8.d(), this.x(), d8.f());
        int n8 = .b[f8.b().ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    this.J(null);
                    return d8.r();
                }
                throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
            }
            return d8.q("BAD CONFIG");
        }
        return d8.o(f8.c(), f8.d(), this.d.b());
    }

    public String p() {
        return this.a.r().b();
    }

    public String q() {
        return this.a.r().c();
    }

    public final String r() {
        synchronized (this) {
            String string2 = this.j;
            return string2;
        }
    }

    public final u4.b s() {
        return (u4.b)this.e.get();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final u4.d v() {
        var1_1 = h.m;
        // MONITORENTER : var1_1
        var2_2 = b.a(this.a.m(), "generatefid.lock");
        var3_4 = this.c.d();
        if (var2_2 == null) ** GOTO lbl16
        {
            catch (Throwable var3_5) {
                if (var2_2 == null) throw var3_5;
                var2_2.b();
                throw var3_5;
            }
        }
        var2_2.b();
lbl16: // 2 sources:
        // MONITOREXIT : var1_1
        return var3_4;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final u4.d w() {
        block6 : {
            var3_1 = h.m;
            // MONITORENTER : var3_1
            var4_2 = b.a(this.a.m(), "generatefid.lock");
            try {
                var2_3 = this.c.d();
                var1_4 = var2_3;
                if (!var2_3.j()) break block6;
                var1_4 = this.E(var2_3);
                var1_4 = this.c.b(var2_3.t((String)var1_4));
            }
            catch (Throwable var1_5) {
                ** GOTO lbl22
            }
        }
        if (var4_2 == null) ** GOTO lbl20
        var4_2.b();
lbl20: // 2 sources:
        // MONITOREXIT : var3_1
        return var1_4;
lbl22: // 1 sources:
        if (var4_2 == null) throw var1_5;
        var4_2.b();
        throw var1_5;
    }

    public String x() {
        return this.a.r().g();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void y(u4.d var1_1) {
        var2_4 = h.m;
        // MONITORENTER : var2_4
        var3_5 = b.a(this.a.m(), "generatefid.lock");
        this.c.b(var1_1);
        if (var3_5 == null) ** GOTO lbl16
        {
            catch (Throwable var1_2) {
                if (var3_5 == null) throw var1_2;
                var3_5.b();
                throw var1_2;
            }
        }
        var3_5.b();
lbl16: // 2 sources:
        // MONITOREXIT : var2_4
    }

    public final /* synthetic */ void z(boolean bl) {
        this.m(bl);
    }

}

