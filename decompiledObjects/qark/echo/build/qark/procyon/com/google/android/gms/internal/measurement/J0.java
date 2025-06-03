// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.os.BaseBundle;
import android.app.Activity;
import android.os.NetworkOnMainThreadException;
import android.os.BadParcelableException;
import android.os.RemoteException;
import android.util.Pair;
import R2.u3;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Random;
import A2.n;
import R2.H2;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ThreadFactory;
import E2.h;
import android.os.Bundle;
import android.content.Context;
import java.util.List;
import Q2.a;
import java.util.concurrent.ExecutorService;
import E2.e;

public class J0
{
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
    
    public J0(final Context context, String a, final String h, final String s, final Bundle bundle) {
        if (a == null || !this.J(h, s)) {
            a = "FA";
        }
        this.a = a;
        this.b = E2.h.d();
        this.c = l0.a().a(new U0(this), u0.a);
        this.d = new Q2.a(this);
        this.e = new ArrayList();
        final boolean e = E(context);
        int n = true ? 1 : 0;
        if (e && !this.S()) {
            this.h = null;
            this.g = true;
            Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!this.J(h, s)) {
            this.h = "fa";
            if (h != null && s != null) {
                Log.v(this.a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
            else {
                final boolean b = h == null;
                if (s != null) {
                    n = (false ? 1 : 0);
                }
                if (((b ? 1 : 0) ^ n) != 0x0) {
                    Log.w(this.a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            }
        }
        else {
            this.h = h;
        }
        this.n((a)new M0(this, h, s, context, bundle));
        final Application application = (Application)context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
            return;
        }
        application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)new c());
    }
    
    public static boolean E(final Context context) {
        try {
            return new H2(context, H2.a(context)).b("google_app_id") != null;
        }
        catch (IllegalStateException ex) {
            return false;
        }
    }
    
    public static J0 e(final Context context) {
        return f(context, null, null, null, null);
    }
    
    public static J0 f(final Context context, final String s, final String s2, final String s3, final Bundle bundle) {
        n.i(context);
        while (true) {
            if (J0.j == null) {
                // monitorenter(J0.class)
                while (true) {
                    try {
                        if (J0.j == null) {
                            J0.j = new J0(context, s, s2, s3, bundle);
                        }
                        // monitorexit(J0.class)
                        return J0.j;
                    }
                    // monitorexit(J0.class)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public final void B(final String s) {
        this.n((a)new X0(this, s));
    }
    
    public final void C(final String s, final String s2) {
        this.w(null, s, s2, false);
    }
    
    public final void D(final String s, final String s2, final Bundle bundle) {
        this.v(s, s2, bundle, true, true, null);
    }
    
    public final Long F() {
        final v0 v0 = new v0();
        this.n((a)new h1(this, v0));
        return v0.Z0(120000L);
    }
    
    public final void G(final Bundle bundle) {
        this.n((a)new T0(this, bundle));
    }
    
    public final void H(final String s) {
        this.n((a)new W0(this, s));
    }
    
    public final boolean J(final String s, final String s2) {
        return s2 != null && s != null && !this.S();
    }
    
    public final void K(final Bundle bundle) {
        this.n((a)new l1(this, bundle));
    }
    
    public final void L(final String s) {
        this.n((a)new Q0(this, s));
    }
    
    public final String M() {
        final v0 v0 = new v0();
        this.n((a)new i1(this, v0));
        return v0.a1(120000L);
    }
    
    public final String N() {
        final v0 v0 = new v0();
        this.n((a)new Y0(this, v0));
        return v0.a1(50L);
    }
    
    public final String O() {
        final v0 v0 = new v0();
        this.n((a)new e1(this, v0));
        return v0.a1(500L);
    }
    
    public final String P() {
        final v0 v0 = new v0();
        this.n((a)new a1(this, v0));
        return v0.a1(500L);
    }
    
    public final String Q() {
        final v0 v0 = new v0();
        this.n((a)new Z0(this, v0));
        return v0.a1(500L);
    }
    
    public final void R() {
        this.n((a)new S0(this));
    }
    
    public final boolean S() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, this.getClass().getClassLoader());
            return true;
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    public final int a(final String s) {
        final v0 v0 = new v0();
        this.n((a)new g1(this, s, v0));
        final Integer n = (Integer)com.google.android.gms.internal.measurement.v0.v(v0.o(10000L), Integer.class);
        if (n == null) {
            return 25;
        }
        return n;
    }
    
    public final long b() {
        final v0 v0 = new v0();
        this.n((a)new b1(this, v0));
        final Long z0 = v0.Z0(500L);
        if (z0 == null) {
            final long nextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
            final int f = this.f + 1;
            this.f = f;
            return nextLong + f;
        }
        return z0;
    }
    
    public final x0 c(final Context context, final boolean b) {
        try {
            return w0.asInterface(DynamiteModule.d(context, DynamiteModule.e, "com.google.android.gms.measurement.dynamite").c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        }
        catch (DynamiteModule.a a) {
            this.s(a, true, false);
            return null;
        }
    }
    
    public final List g(final String s, final String s2) {
        final v0 v0 = new v0();
        this.n((a)new N0(this, s, s2, v0));
        List<Object> emptyList;
        if ((emptyList = (List<Object>)com.google.android.gms.internal.measurement.v0.v(v0.o(5000L), List.class)) == null) {
            emptyList = Collections.emptyList();
        }
        return emptyList;
    }
    
    public final Map h(final String s, final String s2, final boolean b) {
        final v0 v0 = new v0();
        this.n((a)new c1(this, s, s2, b, v0));
        final Bundle o = v0.o(5000L);
        if (o != null && ((BaseBundle)o).size() != 0) {
            final HashMap hashMap = new HashMap<String, Object>(((BaseBundle)o).size());
            for (final String s3 : ((BaseBundle)o).keySet()) {
                final Object value = ((BaseBundle)o).get(s3);
                if (value instanceof Double || value instanceof Long || value instanceof String) {
                    hashMap.put(s3, value);
                }
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
    
    public final void i(final int n, final String s, final Object o, final Object o2, final Object o3) {
        this.n((a)new f1(this, false, 5, s, o, null, null));
    }
    
    public final void j(final long n) {
        this.n((a)new V0(this, n));
    }
    
    public final void k(u3 u3) {
        n.i(u3);
        final List e = this.e;
        // monitorenter(e)
        int n = 0;
    Label_0141_Outer:
        while (true) {
            Label_0153: {
                while (true) {
                    try {
                        if (n < this.e.size()) {
                            if (u3.equals(((Pair)this.e.get(n)).first)) {
                                Log.w(this.a, "OnEventListener already registered.");
                                // monitorexit(e)
                                return;
                            }
                            break Label_0153;
                        }
                        else {
                            final b b = new b(u3);
                            this.e.add(new Pair((Object)u3, (Object)b));
                            // monitorexit(e)
                            Label_0126: {
                                if (this.i == null) {
                                    break Label_0126;
                                }
                                while (true) {
                                    while (true) {
                                        try {
                                            this.i.registerOnMeasurementEventListener(b);
                                            return;
                                            Log.w(this.a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                                            this.n((a)new k1(this, b));
                                            return;
                                        }
                                        // monitorexit(e)
                                        catch (RemoteException ex) {}
                                        catch (BadParcelableException ex2) {}
                                        catch (IllegalArgumentException ex3) {}
                                        catch (IllegalStateException ex4) {}
                                        catch (NetworkOnMainThreadException ex5) {}
                                        catch (NullPointerException ex6) {}
                                        catch (SecurityException ex7) {}
                                        catch (UnsupportedOperationException ex8) {}
                                        continue Label_0141_Outer;
                                    }
                                }
                            }
                        }
                    }
                    finally {}
                    final u3 u4;
                    u3 = u4;
                    continue;
                }
            }
            ++n;
        }
    }
    
    public final void l(final Activity activity, final String s, final String s2) {
        this.n((a)new P0(this, activity, s, s2));
    }
    
    public final void m(final Bundle bundle) {
        this.n((a)new L0(this, bundle));
    }
    
    public final void n(final a a) {
        this.c.execute(a);
    }
    
    public final void r(final Boolean b) {
        this.n((a)new R0(this, b));
    }
    
    public final void s(final Exception ex, final boolean b, final boolean b2) {
        this.g |= b;
        if (b) {
            Log.w(this.a, "Data collection startup failed. No data will be collected.", (Throwable)ex);
            return;
        }
        if (b2) {
            this.i(5, "Error with data collection. Data lost.", ex, null, null);
        }
        Log.w(this.a, "Error with data collection. Data lost.", (Throwable)ex);
    }
    
    public final void t(final String s, final Bundle bundle) {
        this.v(null, s, bundle, false, true, null);
    }
    
    public final void u(final String s, final String s2, final Bundle bundle) {
        this.n((a)new O0(this, s, s2, bundle));
    }
    
    public final void v(final String s, final String s2, final Bundle bundle, final boolean b, final boolean b2, final Long n) {
        this.n((a)new m1(this, n, s, s2, bundle, b, b2));
    }
    
    public final void w(final String s, final String s2, final Object o, final boolean b) {
        this.n((a)new n1(this, s, s2, o, b));
    }
    
    public final void x(final boolean b) {
        this.n((a)new j1(this, b));
    }
    
    public final Q2.a z() {
        return this.d;
    }
    
    public abstract class a implements Runnable
    {
        public final long o;
        public final long p;
        public final boolean q;
        
        public a(final J0 j0) {
            this(j0, true);
        }
        
        public a(final boolean q) {
            this.o = J0.this.b.a();
            this.p = J0.this.b.b();
            this.q = q;
        }
        
        public abstract void a();
        
        public void b() {
        }
        
        @Override
        public void run() {
            if (J0.I(J0.this)) {
                this.b();
                return;
            }
            try {
                this.a();
            }
            catch (Exception ex) {
                J0.this.s(ex, false, this.q);
                this.b();
            }
        }
    }
    
    public static final class b extends C0
    {
        public final u3 b;
        
        public b(final u3 b) {
            this.b = b;
        }
        
        @Override
        public final void L(final String s, final String s2, final Bundle bundle, final long n) {
            this.b.a(s, s2, bundle, n);
        }
        
        @Override
        public final int a() {
            return System.identityHashCode(this.b);
        }
    }
    
    public final class c implements Application$ActivityLifecycleCallbacks
    {
        public final void onActivityCreated(final Activity activity, final Bundle bundle) {
            J0.this.n((a)new o1(this, bundle, activity));
        }
        
        public final void onActivityDestroyed(final Activity activity) {
            J0.this.n((a)new t1(this, activity));
        }
        
        public final void onActivityPaused(final Activity activity) {
            J0.this.n((a)new s1(this, activity));
        }
        
        public final void onActivityResumed(final Activity activity) {
            J0.this.n((a)new p1(this, activity));
        }
        
        public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
            final v0 v0 = new v0();
            J0.this.n((a)new u1(this, activity, v0));
            final Bundle o = v0.o(50L);
            if (o != null) {
                bundle.putAll(o);
            }
        }
        
        public final void onActivityStarted(final Activity activity) {
            J0.this.n((a)new q1(this, activity));
        }
        
        public final void onActivityStopped(final Activity activity) {
            J0.this.n((a)new r1(this, activity));
        }
    }
}
