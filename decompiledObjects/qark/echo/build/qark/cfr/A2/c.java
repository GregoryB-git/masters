/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.DeadObjectException
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.Message
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Set
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicInteger
 */
package A2;

import A2.U;
import A2.V;
import A2.W;
import A2.X;
import A2.Y;
import A2.Z;
import A2.a0;
import A2.e0;
import A2.f;
import A2.h;
import A2.i;
import A2.j;
import A2.k;
import A2.m0;
import A2.n;
import A2.o;
import A2.p;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c {
    public static final String[] D;
    public static final x2.d[] E;
    public boolean A;
    public volatile a0 B;
    public AtomicInteger C;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public m0 g;
    public final Context h;
    public final Looper i;
    public final h j;
    public final x2.k k;
    public final Handler l;
    public final Object m;
    public final Object n;
    public k o;
    public c p;
    public IInterface q;
    public final ArrayList r;
    public X s;
    public int t;
    public final a u;
    public final b v;
    public final int w;
    public final String x;
    public volatile String y;
    public x2.b z;

    static {
        E = new x2.d[0];
        D = new String[]{"service_esmobile", "service_googleme"};
    }

    public c(Context context, Looper looper, int n8, a a8, b b8, String string2) {
        h h8 = h.b(context);
        x2.k k8 = x2.k.f();
        n.i(a8);
        n.i(b8);
        this(context, looper, h8, k8, n8, a8, b8, string2);
    }

    public c(Context context, Looper looper, h h8, x2.k k8, int n8, a a8, b b8, String string2) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList();
        this.t = 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        n.j((Object)context, "Context must not be null");
        this.h = context;
        n.j((Object)looper, "Looper must not be null");
        this.i = looper;
        n.j(h8, "Supervisor must not be null");
        this.j = h8;
        n.j(k8, "API availability must not be null");
        this.k = k8;
        this.l = new U(this, looper);
        this.w = n8;
        this.u = a8;
        this.v = b8;
        this.x = string2;
    }

    public Bundle A() {
        return new Bundle();
    }

    public String B() {
        return null;
    }

    public Set C() {
        return Collections.emptySet();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IInterface D() {
        Object object = this.m;
        synchronized (object) {
            try {
                if (this.t != 5) {
                    this.r();
                    IInterface iInterface = this.q;
                    n.j((Object)iInterface, "Client is connected but service is null");
                    return iInterface;
                }
                throw new DeadObjectException();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public abstract String E();

    public abstract String F();

    public String G() {
        return "com.google.android.gms";
    }

    public A2.e H() {
        a0 a02 = this.B;
        if (a02 == null) {
            return null;
        }
        return a02.r;
    }

    public boolean I() {
        if (this.h() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean J() {
        if (this.B != null) {
            return true;
        }
        return false;
    }

    public void K(IInterface iInterface) {
        this.c = System.currentTimeMillis();
    }

    public void L(x2.b b8) {
        this.d = b8.a();
        this.e = System.currentTimeMillis();
    }

    public void M(int n8) {
        this.a = n8;
        this.b = System.currentTimeMillis();
    }

    public void N(int n8, IBinder iBinder, Bundle bundle, int n9) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(1, n9, -1, (Object)new Y(this, n8, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String string2) {
        this.y = string2;
    }

    public void Q(int n8) {
        Handler handler = this.l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), n8));
    }

    public void R(c c8, int n8, PendingIntent pendingIntent) {
        n.j(c8, "Connection progress callbacks cannot be null.");
        this.p = c8;
        c8 = this.l;
        c8.sendMessage(c8.obtainMessage(3, this.C.get(), n8, (Object)pendingIntent));
    }

    public boolean S() {
        return false;
    }

    public final String X() {
        String string2;
        String string3 = string2 = this.x;
        if (string2 == null) {
            string3 = this.h.getClass().getName();
        }
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a() {
        Object object = this.m;
        synchronized (object) {
            if (this.t != 4) return false;
            return true;
        }
    }

    public void b(e e8) {
        e8.a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void c() {
        this.C.incrementAndGet();
        Object object = this.r;
        // MONITORENTER : object
        int n8 = this.r.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            ((V)this.r.get(i8)).d();
        }
        this.r.clear();
        // MONITOREXIT : object
        object = this.n;
        this.o = null;
        // MONITOREXIT : object
        this.i0(1, null);
    }

    public final void e0(int n8, Bundle bundle, int n9) {
        bundle = this.l;
        bundle.sendMessage(bundle.obtainMessage(7, n9, -1, (Object)new Z(this, n8, null)));
    }

    public void f(String string2) {
        this.f = string2;
        this.c();
    }

    public boolean g() {
        return true;
    }

    public abstract int h();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean i() {
        Object object = this.m;
        synchronized (object) {
            boolean bl;
            int n8 = this.t;
            boolean bl2 = bl = true;
            if (n8 == 2) return bl2;
            if (n8 != 3) return false;
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i0(int n8, IInterface object) {
        boolean bl = false;
        boolean bl2 = n8 == 4;
        boolean bl3 = object != null;
        if (bl2 == bl3) {
            bl = true;
        }
        n.a(bl);
        Object object2 = this.m;
        synchronized (object2) {
            try {
                this.t = n8;
                this.q = object;
                if (n8 != 1) {
                    if (n8 != 2 && n8 != 3) {
                        if (n8 == 4) {
                            n.i(object);
                            this.K((IInterface)object);
                        }
                    } else {
                        Object object3;
                        Object object4;
                        Object object5;
                        object = this.s;
                        if (object != null && (object5 = this.g) != null) {
                            object3 = object5.c();
                            object5 = object5.b();
                            object4 = new StringBuilder();
                            object4.append("Calling connect() while still connected, missing disconnect() for ");
                            object4.append((String)object3);
                            object4.append(" on ");
                            object4.append((String)object5);
                            Log.e((String)"GmsClient", (String)object4.toString());
                            object3 = this.j;
                            object5 = this.g.c();
                            n.i(object5);
                            object3.e((String)object5, this.g.b(), this.g.a(), (ServiceConnection)object, this.X(), this.g.d());
                            this.C.incrementAndGet();
                        }
                        this.s = object3 = new X(this, this.C.get());
                        object = this.t == 3 && this.B() != null ? new m0(this.y().getPackageName(), this.B(), true, h.a(), false) : new m0(this.G(), this.F(), false, h.a(), this.I());
                        this.g = object;
                        if (object.d() && this.h() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((Object)this.g.c())));
                        }
                        object = this.j;
                        object5 = this.g.c();
                        n.i(object5);
                        object4 = this.g.b();
                        n8 = this.g.a();
                        String string2 = this.X();
                        bl = this.g.d();
                        Executor executor = this.w();
                        if (!object.f(new e0((String)object5, (String)object4, n8, bl), (ServiceConnection)object3, string2, executor)) {
                            object = this.g.c();
                            object3 = this.g.b();
                            object5 = new StringBuilder();
                            object5.append("unable to connect to service: ");
                            object5.append((String)object);
                            object5.append(" on ");
                            object5.append((String)object3);
                            Log.w((String)"GmsClient", (String)object5.toString());
                            this.e0(16, null, this.C.get());
                        }
                    }
                } else {
                    object = this.s;
                    if (object != null) {
                        h h8 = this.j;
                        String string3 = this.g.c();
                        n.i(string3);
                        h8.e(string3, this.g.b(), this.g.a(), (ServiceConnection)object, this.X(), this.g.d());
                        this.s = null;
                    }
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final x2.d[] j() {
        a0 a02 = this.B;
        if (a02 == null) {
            return null;
        }
        return a02.p;
    }

    public String k() {
        m0 m02;
        if (this.a() && (m02 = this.g) != null) {
            return m02.b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public String l() {
        return this.f;
    }

    public boolean m() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void o(i object, Set object2) {
        DeadObjectException deadObjectException2;
        block18 : {
            void var1_6;
            Bundle bundle = this.A();
            int n8 = this.w;
            Object object3 = this.y;
            int n9 = x2.k.a;
            Scope[] arrscope = f.C;
            Bundle bundle2 = new Bundle();
            x2.d[] arrd = f.D;
            object3 = new f(6, n8, n9, null, null, arrscope, bundle2, null, arrd, arrd, true, 0, false, (String)object3);
            object3.r = this.h.getPackageName();
            object3.u = bundle;
            if (object2 != null) {
                object3.t = (Scope[])object2.toArray((Object[])new Scope[0]);
            }
            if (this.m()) {
                bundle = this.u();
                object2 = bundle;
                if (bundle == null) {
                    object2 = new Account("<<default account>>", "com.google");
                }
                object3.v = object2;
                if (object != null) {
                    object3.s = object.asBinder();
                }
            } else if (this.O()) {
                object3.v = this.u();
            }
            object3.w = E;
            object3.x = this.v();
            if (this.S()) {
                object3.A = true;
            }
            object = this.n;
            // MONITORENTER : object
            try {
                object2 = this.o;
                if (object2 != null) {
                    object2.h0(new W(this, this.C.get()), (f)object3);
                    return;
                }
                Log.w((String)"GmsClient", (String)"mServiceBroker is null, client disconnected");
                // MONITOREXIT : object
                return;
            }
            catch (Throwable throwable) {}
            try {
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (RemoteException remoteException) {
            }
            catch (SecurityException securityException) {
                throw securityException;
            }
            catch (DeadObjectException deadObjectException2) {
                break block18;
            }
            Log.w((String)"GmsClient", (String)"IGmsServiceBroker.getService failed", (Throwable)var1_6);
            this.N(8, null, null, this.C.get());
            return;
        }
        Log.w((String)"GmsClient", (String)"IGmsServiceBroker.getService failed", (Throwable)deadObjectException2);
        this.Q(3);
    }

    public void p(c c8) {
        n.j(c8, "Connection progress callbacks cannot be null.");
        this.p = c8;
        this.i0(2, null);
    }

    public void q() {
        int n8 = this.k.h(this.h, this.h());
        if (n8 != 0) {
            this.i0(1, null);
            this.R(new d(), n8, null);
            return;
        }
        this.p(new d());
    }

    public final void r() {
        if (this.a()) {
            return;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    public abstract IInterface s(IBinder var1);

    public boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public x2.d[] v() {
        return E;
    }

    public Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.h;
    }

    public int z() {
        return this.w;
    }

    public static interface a {
        public void n(int var1);

        public void v(Bundle var1);
    }

    public static interface b {
        public void o(x2.b var1);
    }

    public static interface c {
        public void b(x2.b var1);
    }

    public class d
    implements c {
        @Override
        public final void b(x2.b object) {
            if (object.i()) {
                object = c.this;
                object.o(null, object.C());
                return;
            }
            if (c.this.v != null) {
                c.this.v.o((x2.b)object);
            }
        }
    }

    public static interface e {
        public void a();
    }

}

