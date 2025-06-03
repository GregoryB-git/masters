package com.google.android.gms.internal.measurement;

import A2.AbstractC0328n;
import R2.InterfaceC0612u3;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class J0 {

    /* renamed from: j, reason: collision with root package name */
    public static volatile J0 f10424j;

    /* renamed from: a, reason: collision with root package name */
    public final String f10425a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.e f10426b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f10427c;

    /* renamed from: d, reason: collision with root package name */
    public final Q2.a f10428d;

    /* renamed from: e, reason: collision with root package name */
    public final List f10429e;

    /* renamed from: f, reason: collision with root package name */
    public int f10430f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10431g;

    /* renamed from: h, reason: collision with root package name */
    public String f10432h;

    /* renamed from: i, reason: collision with root package name */
    public volatile InterfaceC1062x0 f10433i;

    public abstract class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final long f10434o;

        /* renamed from: p, reason: collision with root package name */
        public final long f10435p;

        /* renamed from: q, reason: collision with root package name */
        public final boolean f10436q;

        public a(J0 j02) {
            this(true);
        }

        public abstract void a();

        public void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (J0.this.f10431g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e7) {
                J0.this.s(e7, false, this.f10436q);
                b();
            }
        }

        public a(boolean z7) {
            this.f10434o = J0.this.f10426b.a();
            this.f10435p = J0.this.f10426b.b();
            this.f10436q = z7;
        }
    }

    public static class b extends C0 {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC0612u3 f10438b;

        public b(InterfaceC0612u3 interfaceC0612u3) {
            this.f10438b = interfaceC0612u3;
        }

        @Override // com.google.android.gms.internal.measurement.E0
        public final void L(String str, String str2, Bundle bundle, long j7) {
            this.f10438b.a(str, str2, bundle, j7);
        }

        @Override // com.google.android.gms.internal.measurement.E0
        public final int a() {
            return System.identityHashCode(this.f10438b);
        }
    }

    public class c implements Application.ActivityLifecycleCallbacks {
        public c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            J0.this.n(new C0983o1(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            J0.this.n(new C1027t1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            J0.this.n(new C1018s1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            J0.this.n(new C0992p1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            BinderC1044v0 binderC1044v0 = new BinderC1044v0();
            J0.this.n(new C1036u1(this, activity, binderC1044v0));
            Bundle o7 = binderC1044v0.o(50L);
            if (o7 != null) {
                bundle.putAll(o7);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            J0.this.n(new C1001q1(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            J0.this.n(new C1009r1(this, activity));
        }
    }

    public J0(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f10425a = (str == null || !J(str2, str3)) ? "FA" : str;
        this.f10426b = E2.h.d();
        this.f10427c = AbstractC0955l0.a().a(new U0(this), AbstractC1035u0.f11175a);
        this.f10428d = new Q2.a(this);
        this.f10429e = new ArrayList();
        if (E(context) && !S()) {
            this.f10432h = null;
            this.f10431g = true;
            Log.w(this.f10425a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (J(str2, str3)) {
            this.f10432h = str2;
        } else {
            this.f10432h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f10425a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f10425a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        n(new M0(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f10425a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c());
        }
    }

    public static boolean E(Context context) {
        return new R2.H2(context, R2.H2.a(context)).b("google_app_id") != null;
    }

    public static J0 e(Context context) {
        return f(context, null, null, null, null);
    }

    public static J0 f(Context context, String str, String str2, String str3, Bundle bundle) {
        AbstractC0328n.i(context);
        if (f10424j == null) {
            synchronized (J0.class) {
                try {
                    if (f10424j == null) {
                        f10424j = new J0(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f10424j;
    }

    public final void B(String str) {
        n(new X0(this, str));
    }

    public final void C(String str, String str2) {
        w(null, str, str2, false);
    }

    public final void D(String str, String str2, Bundle bundle) {
        v(str, str2, bundle, true, true, null);
    }

    public final Long F() {
        BinderC1044v0 binderC1044v0 = new BinderC1044v0();
        n(new C0920h1(this, binderC1044v0));
        return binderC1044v0.Z0(120000L);
    }

    public final void G(Bundle bundle) {
        n(new T0(this, bundle));
    }

    public final void H(String str) {
        n(new W0(this, str));
    }

    public final boolean J(String str, String str2) {
        return (str2 == null || str == null || S()) ? false : true;
    }

    public final void K(Bundle bundle) {
        n(new C0956l1(this, bundle));
    }

    public final void L(String str) {
        n(new Q0(this, str));
    }

    public final String M() {
        BinderC1044v0 binderC1044v0 = new BinderC1044v0();
        n(new C0929i1(this, binderC1044v0));
        return binderC1044v0.a1(120000L);
    }

    public final String N() {
        BinderC1044v0 binderC1044v0 = new BinderC1044v0();
        n(new Y0(this, binderC1044v0));
        return binderC1044v0.a1(50L);
    }

    public final String O() {
        BinderC1044v0 binderC1044v0 = new BinderC1044v0();
        n(new C0893e1(this, binderC1044v0));
        return binderC1044v0.a1(500L);
    }

    public final String P() {
        BinderC1044v0 binderC1044v0 = new BinderC1044v0();
        n(new C0857a1(this, binderC1044v0));
        return binderC1044v0.a1(500L);
    }

    public final String Q() {
        BinderC1044v0 binderC1044v0 = new BinderC1044v0();
        n(new Z0(this, binderC1044v0));
        return binderC1044v0.a1(500L);
    }

    public final void R() {
        n(new S0(this));
    }

    public final boolean S() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int a(String str) {
        BinderC1044v0 binderC1044v0 = new BinderC1044v0();
        n(new C0911g1(this, str, binderC1044v0));
        Integer num = (Integer) BinderC1044v0.v(binderC1044v0.o(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        BinderC1044v0 binderC1044v0 = new BinderC1044v0();
        n(new C0866b1(this, binderC1044v0));
        Long Z02 = binderC1044v0.Z0(500L);
        if (Z02 != null) {
            return Z02.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f10426b.a()).nextLong();
        int i7 = this.f10430f + 1;
        this.f10430f = i7;
        return nextLong + i7;
    }

    public final InterfaceC1062x0 c(Context context, boolean z7) {
        try {
            return AbstractBinderC1053w0.asInterface(DynamiteModule.d(context, DynamiteModule.f10268e, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e7) {
            s(e7, true, false);
            return null;
        }
    }

    public final List g(String str, String str2) {
        BinderC1044v0 binderC1044v0 = new BinderC1044v0();
        n(new N0(this, str, str2, binderC1044v0));
        List list = (List) BinderC1044v0.v(binderC1044v0.o(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map h(String str, String str2, boolean z7) {
        BinderC1044v0 binderC1044v0 = new BinderC1044v0();
        n(new C0875c1(this, str, str2, z7, binderC1044v0));
        Bundle o7 = binderC1044v0.o(5000L);
        if (o7 == null || o7.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(o7.size());
        for (String str3 : o7.keySet()) {
            Object obj = o7.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void i(int i7, String str, Object obj, Object obj2, Object obj3) {
        n(new C0902f1(this, false, 5, str, obj, null, null));
    }

    public final void j(long j7) {
        n(new V0(this, j7));
    }

    public final void k(InterfaceC0612u3 interfaceC0612u3) {
        AbstractC0328n.i(interfaceC0612u3);
        synchronized (this.f10429e) {
            for (int i7 = 0; i7 < this.f10429e.size(); i7++) {
                try {
                    if (interfaceC0612u3.equals(((Pair) this.f10429e.get(i7)).first)) {
                        Log.w(this.f10425a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            b bVar = new b(interfaceC0612u3);
            this.f10429e.add(new Pair(interfaceC0612u3, bVar));
            if (this.f10433i != null) {
                try {
                    this.f10433i.registerOnMeasurementEventListener(bVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f10425a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            n(new C0947k1(this, bVar));
        }
    }

    public final void l(Activity activity, String str, String str2) {
        n(new P0(this, activity, str, str2));
    }

    public final void m(Bundle bundle) {
        n(new L0(this, bundle));
    }

    public final void n(a aVar) {
        this.f10427c.execute(aVar);
    }

    public final void r(Boolean bool) {
        n(new R0(this, bool));
    }

    public final void s(Exception exc, boolean z7, boolean z8) {
        this.f10431g |= z7;
        if (z7) {
            Log.w(this.f10425a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z8) {
            i(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f10425a, "Error with data collection. Data lost.", exc);
    }

    public final void t(String str, Bundle bundle) {
        v(null, str, bundle, false, true, null);
    }

    public final void u(String str, String str2, Bundle bundle) {
        n(new O0(this, str, str2, bundle));
    }

    public final void v(String str, String str2, Bundle bundle, boolean z7, boolean z8, Long l7) {
        n(new C0965m1(this, l7, str, str2, bundle, z7, z8));
    }

    public final void w(String str, String str2, Object obj, boolean z7) {
        n(new C0974n1(this, str, str2, obj, z7));
    }

    public final void x(boolean z7) {
        n(new C0938j1(this, z7));
    }

    public final Q2.a z() {
        return this.f10428d;
    }
}
