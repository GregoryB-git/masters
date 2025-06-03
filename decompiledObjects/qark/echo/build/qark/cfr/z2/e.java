/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicInteger
 */
package z2;

import A2.E;
import A2.h;
import A2.o;
import A2.t;
import K2.i;
import V2.j;
import V2.k;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.a;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import y2.d;
import z2.G;
import z2.H;
import z2.I;
import z2.Q;
import z2.T;
import z2.b;
import z2.c;
import z2.l;
import z2.m;
import z2.p;
import z2.r;
import z2.s;
import z2.x;
import z2.z;

public class e
implements Handler.Callback {
    public static final Status F = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status G = new Status(4, "The user must be signed in to make this API call.");
    public static final Object H = new Object();
    public static e I;
    public p A = null;
    public final Set B = new t.b();
    public final Set C = new t.b();
    public final Handler D;
    public volatile boolean E = true;
    public long o = 5000L;
    public long p = 120000L;
    public long q = 10000L;
    public boolean r = false;
    public A2.r s;
    public t t;
    public final Context u;
    public final x2.j v;
    public final E w;
    public final AtomicInteger x = new AtomicInteger(1);
    public final AtomicInteger y = new AtomicInteger(0);
    public final Map z = new ConcurrentHashMap(5, 0.75f, 1);

    public e(Context context, Looper object, x2.j j8) {
        this.u = context;
        this.D = object = new i((Looper)object, this);
        this.v = j8;
        this.w = new E(j8);
        if (E2.i.a(context)) {
            this.E = false;
        }
        object.sendMessage(object.obtainMessage(6));
    }

    public static Status h(b object, x2.b b8) {
        object = object.b();
        String string2 = String.valueOf((Object)b8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("API: ");
        stringBuilder.append((String)object);
        stringBuilder.append(" is not available on this device. Connection failed with: ");
        stringBuilder.append(string2);
        return new Status(b8, stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e x(Context object) {
        Object object2 = H;
        synchronized (object2) {
            try {
                if (I != null) return I;
                Looper looper = h.c().getLooper();
                I = new e(object.getApplicationContext(), looper, x2.j.m());
                return I;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void D(d d8, int n8, m object, k k8, l l8) {
        this.l(k8, object.d(), d8);
        object = new Q(n8, (m)object, k8, l8);
        k8 = this.D;
        k8.sendMessage(k8.obtainMessage(4, (Object)new I((T)object, this.y.get(), d8)));
    }

    public final void E(A2.l l8, int n8, long l9, int n9) {
        Handler handler = this.D;
        handler.sendMessage(handler.obtainMessage(18, (Object)new H(l8, n8, l9, n9)));
    }

    public final void F(x2.b b8, int n8) {
        if (!this.g(b8, n8)) {
            Handler handler = this.D;
            handler.sendMessage(handler.obtainMessage(5, n8, 0, (Object)b8));
        }
    }

    public final void a() {
        Handler handler = this.D;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(d d8) {
        Handler handler = this.D;
        handler.sendMessage(handler.obtainMessage(7, (Object)d8));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(p p8) {
        Object object = H;
        synchronized (object) {
            try {
                if (this.A != p8) {
                    this.A = p8;
                    this.B.clear();
                }
                this.B.addAll((Collection)p8.t());
                return;
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
    public final void d(p p8) {
        Object object = H;
        synchronized (object) {
            try {
                if (this.A == p8) {
                    this.A = null;
                    this.B.clear();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final boolean f() {
        if (this.r) {
            return false;
        }
        A2.p p8 = o.b().a();
        if (p8 != null && !p8.f()) {
            return false;
        }
        int n8 = this.w.a(this.u, 203400000);
        if (n8 != -1 && n8 != 0) {
            return false;
        }
        return true;
    }

    public final boolean g(x2.b b8, int n8) {
        return this.v.w(this.u, b8, n8);
    }

    public final boolean handleMessage(Message object) {
        int n8 = object.what;
        long l8 = 300000L;
        Object object22 = null;
        switch (n8) {
            default: {
                object = new StringBuilder();
                object.append("Unknown message id: ");
                object.append(n8);
                Log.w((String)"GoogleApiManager", (String)object.toString());
                return false;
            }
            case 19: {
                this.r = false;
                return true;
            }
            case 18: {
                object = (H)object.obj;
                if (object.c == 0L) {
                    object = new A2.r(object.b, Arrays.asList((Object[])new A2.l[]{object.a}));
                    this.j().a((A2.r)object);
                    return true;
                }
                object22 = this.s;
                if (object22 != null) {
                    List list = object22.d();
                    if (object22.a() == object.b && (list == null || list.size() < object.d)) {
                        this.s.f(object.a);
                    } else {
                        this.D.removeMessages(17);
                        this.k();
                    }
                }
                if (this.s != null) break;
                object22 = new ArrayList();
                object22.add((Object)object.a);
                this.s = new A2.r(object.b, (List)object22);
                object22 = this.D;
                object22.sendMessageDelayed(object22.obtainMessage(17), object.c);
                return true;
            }
            case 17: {
                this.k();
                return true;
            }
            case 16: {
                object = (z)object.obj;
                if (!this.z.containsKey((Object)z.b((z)object))) break;
                x.B((x)this.z.get((Object)z.b((z)object)), (z)object);
                return true;
            }
            case 15: {
                object = (z)object.obj;
                if (!this.z.containsKey((Object)z.b((z)object))) break;
                x.A((x)this.z.get((Object)z.b((z)object)), (z)object);
                return true;
            }
            case 14: {
                a.a(object.obj);
                throw null;
            }
            case 12: {
                if (!this.z.containsKey(object.obj)) break;
                ((x)this.z.get(object.obj)).a();
                return true;
            }
            case 11: {
                if (!this.z.containsKey(object.obj)) break;
                ((x)this.z.get(object.obj)).K();
                return true;
            }
            case 10: {
                for (Object object22 : this.C) {
                    if ((object22 = (x)this.z.remove(object22)) == null) continue;
                    object22.J();
                }
                this.C.clear();
                return true;
            }
            case 9: {
                if (!this.z.containsKey(object.obj)) break;
                ((x)this.z.get(object.obj)).I();
                return true;
            }
            case 7: {
                this.i((d)object.obj);
                return true;
            }
            case 6: {
                if (!(this.u.getApplicationContext() instanceof Application)) break;
                c.c((Application)this.u.getApplicationContext());
                c.b().a(new s(this));
                if (c.b().e(true)) break;
                this.q = 300000L;
                return true;
            }
            case 5: {
                n8 = object.arg1;
                Object object3 = (x2.b)object.obj;
                Iterator iterator = this.z.values().iterator();
                do {
                    object = object22;
                } while (iterator.hasNext() && (object = (x)iterator.next()).q() != n8);
                if (object != null) {
                    if (object3.a() == 13) {
                        object22 = this.v.e(object3.a());
                        object3 = object3.d();
                        iterator = new StringBuilder();
                        iterator.append("Error resolution was canceled by the user, original error message: ");
                        iterator.append((String)object22);
                        iterator.append(": ");
                        iterator.append((String)object3);
                        x.x((x)object, new Status(17, iterator.toString()));
                        return true;
                    }
                    x.x((x)object, e.h(x.u((x)object), (x2.b)object3));
                    return true;
                }
                object = new StringBuilder();
                object.append("Could not find API instance ");
                object.append(n8);
                object.append(" while trying to fail enqueued calls.");
                object22 = new Exception();
                Log.wtf((String)"GoogleApiManager", (String)object.toString(), (Throwable)object22);
                return true;
            }
            case 4: 
            case 8: 
            case 13: {
                I i8 = (I)object.obj;
                object = object22 = (x)this.z.get((Object)i8.c.d());
                if (object22 == null) {
                    object = this.i(i8.c);
                }
                if (object.L() && this.y.get() != i8.b) {
                    i8.a.a(F);
                    object.J();
                    return true;
                }
                object.E(i8.a);
                return true;
            }
            case 3: {
                for (Object object22 : this.z.values()) {
                    object22.C();
                    object22.D();
                }
                break;
            }
            case 2: {
                a.a(object.obj);
                throw null;
            }
            case 1: {
                if (((Boolean)object.obj).booleanValue()) {
                    l8 = 10000L;
                }
                this.q = l8;
                this.D.removeMessages(12);
                for (Object object22 : this.z.keySet()) {
                    Handler handler = this.D;
                    handler.sendMessageDelayed(handler.obtainMessage(12, object22), this.q);
                }
            }
        }
        return true;
    }

    public final x i(d d8) {
        x x8;
        b b8 = d8.d();
        x x9 = x8 = (x)this.z.get((Object)b8);
        if (x8 == null) {
            x9 = new x(this, d8);
            this.z.put((Object)b8, (Object)x9);
        }
        if (x9.L()) {
            this.C.add((Object)b8);
        }
        x9.D();
        return x9;
    }

    public final t j() {
        if (this.t == null) {
            this.t = A2.s.a(this.u);
        }
        return this.t;
    }

    public final void k() {
        A2.r r8 = this.s;
        if (r8 != null) {
            if (r8.a() > 0 || this.f()) {
                this.j().a(r8);
            }
            this.s = null;
        }
    }

    public final void l(k object, int n8, d object2) {
        if (n8 != 0 && (object2 = G.b(this, n8, object2.d())) != null) {
            object = object.a();
            Handler handler = this.D;
            handler.getClass();
            object.c(new r(handler), (V2.e)object2);
        }
    }

    public final int m() {
        return this.x.getAndIncrement();
    }

    public final x w(b b8) {
        return (x)this.z.get((Object)b8);
    }
}

