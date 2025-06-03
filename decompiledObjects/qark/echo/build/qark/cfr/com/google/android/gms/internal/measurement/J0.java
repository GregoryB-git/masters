/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.BadParcelableException
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.NetworkOnMainThreadException
 *  android.os.RemoteException
 *  android.util.Log
 *  android.util.Pair
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Random
 *  java.util.Set
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.ThreadFactory
 */
package com.google.android.gms.internal.measurement;

import A2.n;
import E2.e;
import E2.h;
import R2.H2;
import R2.u3;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.measurement.C0;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.L0;
import com.google.android.gms.internal.measurement.M0;
import com.google.android.gms.internal.measurement.N0;
import com.google.android.gms.internal.measurement.O0;
import com.google.android.gms.internal.measurement.P0;
import com.google.android.gms.internal.measurement.Q0;
import com.google.android.gms.internal.measurement.R0;
import com.google.android.gms.internal.measurement.S0;
import com.google.android.gms.internal.measurement.T0;
import com.google.android.gms.internal.measurement.U0;
import com.google.android.gms.internal.measurement.V0;
import com.google.android.gms.internal.measurement.W0;
import com.google.android.gms.internal.measurement.X0;
import com.google.android.gms.internal.measurement.Y0;
import com.google.android.gms.internal.measurement.Z0;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.h1;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.k1;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.m1;
import com.google.android.gms.internal.measurement.n1;
import com.google.android.gms.internal.measurement.o1;
import com.google.android.gms.internal.measurement.p1;
import com.google.android.gms.internal.measurement.q1;
import com.google.android.gms.internal.measurement.r1;
import com.google.android.gms.internal.measurement.s1;
import com.google.android.gms.internal.measurement.t1;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.u1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

public class J0 {
    public static volatile J0 j;
    public final String a;
    public final e b;
    public final ExecutorService c;
    public final Q2.a d;
    public final List e;
    public int f;
    public boolean g;
    public String h;
    public volatile x0 i;

    /*
     * Enabled aggressive block sorting
     */
    public J0(Context context, String string2, String string3, String string4, Bundle bundle) {
        if (string2 == null || !this.J(string3, string4)) {
            string2 = "FA";
        }
        this.a = string2;
        this.b = h.d();
        this.c = l0.a().a(new U0(this), u0.a);
        this.d = new Q2.a(this);
        this.e = new ArrayList();
        boolean bl = J0.E(context);
        boolean bl2 = true;
        if (bl && !this.S()) {
            this.h = null;
            this.g = true;
            Log.w((String)this.a, (String)"Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!this.J(string3, string4)) {
            this.h = "fa";
            if (string3 != null && string4 != null) {
                Log.v((String)this.a, (String)"Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            } else {
                boolean bl3 = string3 == null;
                if (string4 != null) {
                    bl2 = false;
                }
                if (bl3 ^ bl2) {
                    Log.w((String)this.a, (String)"Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        } else {
            this.h = string3;
        }
        this.n(new M0(this, string3, string4, context, bundle));
        context = (Application)context.getApplicationContext();
        if (context == null) {
            Log.w((String)this.a, (String)"Unable to register lifecycle notifications. Application null.");
            return;
        }
        context.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)new c());
    }

    public static boolean E(Context object) {
        try {
            object = new H2((Context)object, H2.a((Context)object)).b("google_app_id");
            if (object != null) {
                return true;
            }
            return false;
        }
        catch (IllegalStateException illegalStateException) {
            return false;
        }
    }

    public static J0 e(Context context) {
        return J0.f(context, null, null, null, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static J0 f(Context context, String string2, String string3, String string4, Bundle bundle) {
        n.i((Object)context);
        if (j != null) return j;
        synchronized (J0.class) {
            try {
                if (j != null) return j;
                j = new J0(context, string2, string3, string4, bundle);
                return j;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* synthetic */ boolean y(J0 j02, String string2, String string3) {
        return j02.J(string2, string3);
    }

    public final void B(String string2) {
        this.n(new X0(this, string2));
    }

    public final void C(String string2, String string3) {
        this.w(null, string2, string3, false);
    }

    public final void D(String string2, String string3, Bundle bundle) {
        this.v(string2, string3, bundle, true, true, null);
    }

    public final Long F() {
        v0 v02 = new v0();
        this.n(new h1(this, v02));
        return v02.Z0(120000L);
    }

    public final void G(Bundle bundle) {
        this.n(new T0(this, bundle));
    }

    public final void H(String string2) {
        this.n(new W0(this, string2));
    }

    public final boolean J(String string2, String string3) {
        if (string3 != null && string2 != null && !this.S()) {
            return true;
        }
        return false;
    }

    public final void K(Bundle bundle) {
        this.n(new l1(this, bundle));
    }

    public final void L(String string2) {
        this.n(new Q0(this, string2));
    }

    public final String M() {
        v0 v02 = new v0();
        this.n(new i1(this, v02));
        return v02.a1(120000L);
    }

    public final String N() {
        v0 v02 = new v0();
        this.n(new Y0(this, v02));
        return v02.a1(50L);
    }

    public final String O() {
        v0 v02 = new v0();
        this.n(new e1(this, v02));
        return v02.a1(500L);
    }

    public final String P() {
        v0 v02 = new v0();
        this.n(new a1(this, v02));
        return v02.a1(500L);
    }

    public final String Q() {
        v0 v02 = new v0();
        this.n(new Z0(this, v02));
        return v02.a1(500L);
    }

    public final void R() {
        this.n(new S0(this));
    }

    public final boolean S() {
        try {
            Class.forName((String)"com.google.firebase.analytics.FirebaseAnalytics", (boolean)false, (ClassLoader)this.getClass().getClassLoader());
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    public final int a(String string2) {
        v0 v02 = new v0();
        this.n(new g1(this, string2, v02));
        string2 = (Integer)v0.v(v02.o(10000L), Integer.class);
        if (string2 == null) {
            return 25;
        }
        return string2.intValue();
    }

    public final long b() {
        v0 v02 = new v0();
        this.n(new b1(this, v02));
        v02 = v02.Z0(500L);
        if (v02 == null) {
            int n8;
            long l8 = new Random(System.nanoTime() ^ this.b.a()).nextLong();
            this.f = n8 = this.f + 1;
            return l8 + (long)n8;
        }
        return v02.longValue();
    }

    public final x0 c(Context object, boolean bl) {
        try {
            object = w0.asInterface(DynamiteModule.d((Context)object, DynamiteModule.e, "com.google.android.gms.measurement.dynamite").c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            return object;
        }
        catch (DynamiteModule.a a8) {
            this.s(a8, true, false);
            return null;
        }
    }

    public final List g(String string2, String string3) {
        v0 v02 = new v0();
        this.n(new N0(this, string2, string3, v02));
        string2 = string3 = (List)v0.v(v02.o(5000L), List.class);
        if (string3 == null) {
            string2 = Collections.emptyList();
        }
        return string2;
    }

    public final Map h(String string2, String string3, boolean bl) {
        v0 v02 = new v0();
        this.n(new c1(this, string2, string3, bl, v02));
        string2 = v02.o(5000L);
        if (string2 != null && string2.size() != 0) {
            string3 = new HashMap(string2.size());
            for (String string4 : string2.keySet()) {
                Object object = string2.get(string4);
                if (!(object instanceof Double) && !(object instanceof Long) && !(object instanceof String)) continue;
                string3.put((Object)string4, object);
            }
            return string3;
        }
        return Collections.emptyMap();
    }

    public final void i(int n8, String string2, Object object, Object object2, Object object3) {
        this.n(new f1(this, false, 5, string2, object, null, null));
    }

    public final void j(long l8) {
        this.n(new V0(this, l8));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(u3 u32) {
        n.i(u32);
        List list = this.e;
        synchronized (list) {
            int n8 = 0;
            do {
                block10 : {
                    b b8;
                    block11 : {
                        if (n8 < this.e.size()) {
                            if (u32.equals(((Pair)this.e.get((int)n8)).first)) {
                                Log.w((String)this.a, (String)"OnEventListener already registered.");
                                return;
                            }
                            break block10;
                        }
                        b8 = new b(u32);
                        this.e.add((Object)new Pair((Object)u32, (Object)b8));
                        // MONITOREXIT [0, 3, 6] lbl15 : MonitorExitStatement: MONITOREXIT : var3_4
                        if (this.i == null) break block11;
                        try {
                            this.i.registerOnMeasurementEventListener(b8);
                            return;
                        }
                        catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException illegalArgumentException) {}
                        Log.w((String)this.a, (String)"Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                    }
                    this.n(new k1(this, b8));
                    return;
                }
                ++n8;
            } while (true);
            {
                try {}
                catch (Throwable throwable) {
                    continue;
                }
                throw throwable;
            }
        }
    }

    public final void l(Activity activity, String string2, String string3) {
        this.n(new P0(this, activity, string2, string3));
    }

    public final void m(Bundle bundle) {
        this.n(new L0(this, bundle));
    }

    public final void n(a a8) {
        this.c.execute((Runnable)a8);
    }

    public final void r(Boolean bl) {
        this.n(new R0(this, bl));
    }

    public final void s(Exception exception, boolean bl, boolean bl2) {
        this.g |= bl;
        if (bl) {
            Log.w((String)this.a, (String)"Data collection startup failed. No data will be collected.", (Throwable)exception);
            return;
        }
        if (bl2) {
            this.i(5, "Error with data collection. Data lost.", (Object)exception, null, null);
        }
        Log.w((String)this.a, (String)"Error with data collection. Data lost.", (Throwable)exception);
    }

    public final void t(String string2, Bundle bundle) {
        this.v(null, string2, bundle, false, true, null);
    }

    public final void u(String string2, String string3, Bundle bundle) {
        this.n(new O0(this, string2, string3, bundle));
    }

    public final void v(String string2, String string3, Bundle bundle, boolean bl, boolean bl2, Long l8) {
        this.n(new m1(this, l8, string2, string3, bundle, bl, bl2));
    }

    public final void w(String string2, String string3, Object object, boolean bl) {
        this.n(new n1(this, string2, string3, object, bl));
    }

    public final void x(boolean bl) {
        this.n(new j1(this, bl));
    }

    public final Q2.a z() {
        return this.d;
    }

    public abstract class a
    implements Runnable {
        public final long o;
        public final long p;
        public final boolean q;

        public a() {
            this(true);
        }

        public a(boolean bl) {
            this.o = J0.this.b.a();
            this.p = J0.this.b.b();
            this.q = bl;
        }

        public abstract void a();

        public void b() {
        }

        public void run() {
            if (J0.this.g) {
                this.b();
                return;
            }
            try {
                this.a();
                return;
            }
            catch (Exception exception) {
                J0.this.s(exception, false, this.q);
                this.b();
                return;
            }
        }
    }

    public static final class b
    extends C0 {
        public final u3 b;

        public b(u3 u32) {
            this.b = u32;
        }

        @Override
        public final void L(String string2, String string3, Bundle bundle, long l8) {
            this.b.a(string2, string3, bundle, l8);
        }

        @Override
        public final int a() {
            return System.identityHashCode((Object)this.b);
        }
    }

    public final class c
    implements Application.ActivityLifecycleCallbacks {
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            J0.this.n(new o1(this, bundle, activity));
        }

        public final void onActivityDestroyed(Activity activity) {
            J0.this.n(new t1(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            J0.this.n(new s1(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            J0.this.n(new p1(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            v0 v02 = new v0();
            J0.this.n(new u1(this, activity, v02));
            activity = v02.o(50L);
            if (activity != null) {
                bundle.putAll((Bundle)activity);
            }
        }

        public final void onActivityStarted(Activity activity) {
            J0.this.n(new q1(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            J0.this.n(new r1(this, activity));
        }
    }

}

