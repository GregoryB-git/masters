package R2;

import A2.AbstractC0328n;
import R2.C0585q3;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import b3.AbstractC0794c;
import b3.InterfaceFutureC0796e;
import com.google.android.gms.internal.measurement.C0917g7;
import com.google.android.gms.internal.measurement.C0979n6;
import com.google.android.gms.internal.measurement.C1024s7;
import com.google.android.gms.internal.measurement.C1032t6;
import com.google.android.gms.internal.measurement.G6;
import com.google.android.gms.internal.measurement.H6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import q1.AbstractC1883a;
import t.C1958a;

/* loaded from: classes.dex */
public final class C3 extends AbstractC0506f1 {

    /* renamed from: c, reason: collision with root package name */
    public C0544k4 f4568c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0619v3 f4569d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f4570e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4571f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f4572g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f4573h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4574i;

    /* renamed from: j, reason: collision with root package name */
    public PriorityQueue f4575j;

    /* renamed from: k, reason: collision with root package name */
    public C0585q3 f4576k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicLong f4577l;

    /* renamed from: m, reason: collision with root package name */
    public long f4578m;

    /* renamed from: n, reason: collision with root package name */
    public final c6 f4579n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4580o;

    /* renamed from: p, reason: collision with root package name */
    public AbstractC0629x f4581p;

    /* renamed from: q, reason: collision with root package name */
    public final U5 f4582q;

    public C3(N2 n22) {
        super(n22);
        this.f4570e = new CopyOnWriteArraySet();
        this.f4573h = new Object();
        this.f4574i = false;
        this.f4580o = true;
        this.f4582q = new C0488c4(this);
        this.f4572g = new AtomicReference();
        this.f4576k = C0585q3.f5491c;
        this.f4578m = -1L;
        this.f4577l = new AtomicLong(0L);
        this.f4579n = new c6(n22);
    }

    public static /* synthetic */ void K(C3 c32, C0585q3 c0585q3, long j7, boolean z7, boolean z8) {
        c32.n();
        c32.v();
        C0585q3 J6 = c32.i().J();
        if (j7 <= c32.f4578m && C0585q3.k(J6.b(), c0585q3.b())) {
            c32.j().J().b("Dropped out-of-date consent setting, proposed settings", c0585q3);
            return;
        }
        if (!c32.i().A(c0585q3)) {
            c32.j().J().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c0585q3.b()));
            return;
        }
        c32.f4578m = j7;
        c32.t().U(z7);
        if (z8) {
            c32.t().Q(new AtomicReference());
        }
    }

    public static /* synthetic */ void L(C3 c32, C0585q3 c0585q3, C0585q3 c0585q32) {
        C0585q3.a aVar = C0585q3.a.ANALYTICS_STORAGE;
        C0585q3.a aVar2 = C0585q3.a.AD_STORAGE;
        boolean m7 = c0585q3.m(c0585q32, aVar, aVar2);
        boolean r7 = c0585q3.r(c0585q32, aVar, aVar2);
        if (m7 || r7) {
            c32.p().I();
        }
    }

    @Override // R2.AbstractC0506f1
    public final boolean A() {
        return false;
    }

    public final ArrayList C(String str, String str2) {
        if (e().J()) {
            j().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (C0504f.a()) {
            j().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f5424a.e().v(atomicReference, 5000L, "get conditional user properties", new RunnableC0481b4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return S5.t0(list);
        }
        j().G().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final Map D(String str, String str2, boolean z7) {
        C0472a2 G6;
        String str3;
        if (e().J()) {
            G6 = j().G();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!C0504f.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f5424a.e().v(atomicReference, 5000L, "get user properties", new RunnableC0474a4(this, atomicReference, null, str, str2, z7));
                List<R5> list = (List) atomicReference.get();
                if (list == null) {
                    j().G().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z7));
                    return Collections.emptyMap();
                }
                C1958a c1958a = new C1958a(list.size());
                for (R5 r52 : list) {
                    Object a7 = r52.a();
                    if (a7 != null) {
                        c1958a.put(r52.f4991p, a7);
                    }
                }
                return c1958a;
            }
            G6 = j().G();
            str3 = "Cannot get user properties from main thread";
        }
        G6.a(str3);
        return Collections.emptyMap();
    }

    public final void E(long j7, boolean z7) {
        n();
        v();
        j().F().a("Resetting analytics data (FE)");
        C0552l5 u7 = u();
        u7.n();
        u7.f5418f.b();
        if (C1024s7.a() && f().s(K.f4867x0)) {
            p().I();
        }
        boolean p7 = this.f5424a.p();
        C0549l2 i7 = i();
        i7.f5388e.b(j7);
        if (!TextUtils.isEmpty(i7.i().f5405v.a())) {
            i7.f5405v.b(null);
        }
        if (G6.a() && i7.f().s(K.f4853q0)) {
            i7.f5399p.b(0L);
        }
        i7.f5400q.b(0L);
        if (!i7.f().R()) {
            i7.E(!p7);
        }
        i7.f5406w.b(null);
        i7.f5407x.b(0L);
        i7.f5408y.b(null);
        if (z7) {
            t().a0();
        }
        if (G6.a() && f().s(K.f4853q0)) {
            u().f5417e.a();
        }
        this.f4580o = !p7;
    }

    public final void F(C0643z c0643z) {
        e().D(new RunnableC0537j4(this, c0643z));
    }

    public final void G(C0585q3 c0585q3) {
        n();
        boolean z7 = (c0585q3.y() && c0585q3.x()) || t().e0();
        if (z7 != this.f5424a.q()) {
            this.f5424a.w(z7);
            Boolean L6 = i().L();
            if (!z7 || L6 == null || L6.booleanValue()) {
                S(Boolean.valueOf(z7), false);
            }
        }
    }

    public final void H(C0585q3 c0585q3, long j7) {
        C0585q3 c0585q32;
        boolean z7;
        C0585q3 c0585q33;
        boolean z8;
        boolean z9;
        v();
        int b7 = c0585q3.b();
        if (b7 != -10 && c0585q3.s() == null && c0585q3.u() == null) {
            j().M().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f4573h) {
            try {
                c0585q32 = this.f4576k;
                z7 = false;
                if (C0585q3.k(b7, c0585q32.b())) {
                    z9 = c0585q3.t(this.f4576k);
                    if (c0585q3.y() && !this.f4576k.y()) {
                        z7 = true;
                    }
                    C0585q3 o7 = c0585q3.o(this.f4576k);
                    this.f4576k = o7;
                    c0585q33 = o7;
                    z8 = z7;
                    z7 = true;
                } else {
                    c0585q33 = c0585q3;
                    z8 = false;
                    z9 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z7) {
            j().J().b("Ignoring lower-priority consent settings, proposed settings", c0585q33);
            return;
        }
        long andIncrement = this.f4577l.getAndIncrement();
        if (z9) {
            T(null);
            e().G(new RunnableC0530i4(this, c0585q33, j7, andIncrement, z8, c0585q32));
            return;
        }
        RunnableC0551l4 runnableC0551l4 = new RunnableC0551l4(this, c0585q33, andIncrement, z8, c0585q32);
        if (b7 == 30 || b7 == -10) {
            e().G(runnableC0551l4);
        } else {
            e().D(runnableC0551l4);
        }
    }

    public final void I(InterfaceC0612u3 interfaceC0612u3) {
        v();
        AbstractC0328n.i(interfaceC0612u3);
        if (this.f4570e.add(interfaceC0612u3)) {
            return;
        }
        j().L().a("OnEventListener already registered");
    }

    public final void J(InterfaceC0619v3 interfaceC0619v3) {
        InterfaceC0619v3 interfaceC0619v32;
        n();
        v();
        if (interfaceC0619v3 != null && interfaceC0619v3 != (interfaceC0619v32 = this.f4569d)) {
            AbstractC0328n.m(interfaceC0619v32 == null, "EventInterceptor already set.");
        }
        this.f4569d = interfaceC0619v3;
    }

    public final /* synthetic */ void O(Bundle bundle) {
        if (bundle == null) {
            i().f5408y.b(new Bundle());
            return;
        }
        Bundle a7 = i().f5408y.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                k();
                if (S5.g0(obj)) {
                    k();
                    S5.M(this.f4582q, 27, null, null, 0);
                }
                j().M().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (S5.H0(str)) {
                j().M().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a7.remove(str);
            } else if (k().k0("param", str, f().t(this.f5424a.B().F()), obj)) {
                k().R(a7, str, obj);
            }
        }
        k();
        if (S5.f0(a7, f().E())) {
            k();
            S5.M(this.f4582q, 26, null, null, 0);
            j().M().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        i().f5408y.b(a7);
        t().K(a7);
    }

    public final void P(Bundle bundle, int i7, long j7) {
        v();
        String i8 = C0585q3.i(bundle);
        if (i8 != null) {
            j().M().b("Ignoring invalid consent setting", i8);
            j().M().a("Valid consent values are 'granted', 'denied'");
        }
        C0585q3 d7 = C0585q3.d(bundle, i7);
        if (!C0979n6.a() || !f().s(K.f4803S0)) {
            H(d7, j7);
            return;
        }
        if (d7.z()) {
            H(d7, j7);
        }
        C0643z b7 = C0643z.b(bundle, i7);
        if (b7.j()) {
            F(b7);
        }
        Boolean d8 = C0643z.d(bundle);
        if (d8 != null) {
            b0("app", "allow_personalized_ads", d8.toString(), false);
        }
    }

    public final void Q(Bundle bundle, long j7) {
        AbstractC0328n.i(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            j().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC0328n.i(bundle2);
        AbstractC0564n3.a(bundle2, "app_id", String.class, null);
        AbstractC0564n3.a(bundle2, "origin", String.class, null);
        AbstractC0564n3.a(bundle2, "name", String.class, null);
        AbstractC0564n3.a(bundle2, "value", Object.class, null);
        AbstractC0564n3.a(bundle2, "trigger_event_name", String.class, null);
        AbstractC0564n3.a(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC0564n3.a(bundle2, "timed_out_event_name", String.class, null);
        AbstractC0564n3.a(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC0564n3.a(bundle2, "triggered_event_name", String.class, null);
        AbstractC0564n3.a(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC0564n3.a(bundle2, "time_to_live", Long.class, 0L);
        AbstractC0564n3.a(bundle2, "expired_event_name", String.class, null);
        AbstractC0564n3.a(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC0328n.e(bundle2.getString("name"));
        AbstractC0328n.e(bundle2.getString("origin"));
        AbstractC0328n.i(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j7);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (k().q0(string) != 0) {
            j().G().b("Invalid conditional user property name", h().g(string));
            return;
        }
        if (k().w(string, obj) != 0) {
            j().G().c("Invalid conditional user property value", h().g(string), obj);
            return;
        }
        Object A02 = k().A0(string, obj);
        if (A02 == null) {
            j().G().c("Unable to normalize conditional user property value", h().g(string), obj);
            return;
        }
        AbstractC0564n3.b(bundle2, A02);
        long j8 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j8 > 15552000000L || j8 < 1)) {
            j().G().c("Invalid conditional user property timeout", h().g(string), Long.valueOf(j8));
            return;
        }
        long j9 = bundle2.getLong("time_to_live");
        if (j9 > 15552000000L || j9 < 1) {
            j().G().c("Invalid conditional user property time to live", h().g(string), Long.valueOf(j9));
        } else {
            e().D(new Z3(this, bundle2));
        }
    }

    public final void R(Boolean bool) {
        v();
        e().D(new RunnableC0516g4(this, bool));
    }

    public final void S(Boolean bool, boolean z7) {
        n();
        v();
        j().F().b("Setting app measurement enabled (FE)", bool);
        i().v(bool);
        if (z7) {
            i().C(bool);
        }
        if (this.f5424a.q() || !(bool == null || bool.booleanValue())) {
            t0();
        }
    }

    public final void T(String str) {
        this.f4572g.set(str);
    }

    public final void U(String str, String str2, long j7, Bundle bundle) {
        n();
        V(str, str2, j7, bundle, true, this.f4569d == null || S5.H0(str2), true, null);
    }

    public final void V(String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        long j8;
        String str4;
        C3 c32;
        String str5;
        String str6;
        int length;
        AbstractC0328n.e(str);
        AbstractC0328n.i(bundle);
        n();
        v();
        if (!this.f5424a.p()) {
            j().F().a("Event not sent since app measurement is disabled");
            return;
        }
        List H6 = p().H();
        if (H6 != null && !H6.contains(str2)) {
            j().F().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f4571f) {
            this.f4571f = true;
            try {
                try {
                    (!this.f5424a.t() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, a().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, a());
                } catch (Exception e7) {
                    j().L().b("Failed to invoke Tag Manager's initialize() method", e7);
                }
            } catch (ClassNotFoundException unused) {
                j().J().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2)) {
            if (bundle.containsKey("gclid")) {
                a0("auto", "_lgclid", bundle.getString("gclid"), b().a());
            }
            if (H6.a() && f().s(K.f4817Z0) && bundle.containsKey("gbraid")) {
                a0("auto", "_gbraid", bundle.getString("gbraid"), b().a());
            }
        }
        if (z7 && S5.L0(str2)) {
            k().Q(bundle, i().f5408y.a());
        }
        if (!z9 && !"_iap".equals(str2)) {
            S5 L6 = this.f5424a.L();
            int i7 = 2;
            if (L6.C0("event", str2)) {
                if (!L6.o0("event", AbstractC0591r3.f5512a, AbstractC0591r3.f5513b, str2)) {
                    i7 = 13;
                } else if (L6.i0("event", 40, str2)) {
                    i7 = 0;
                }
            }
            if (i7 != 0) {
                j().H().b("Invalid public event name. Event will not be logged (FE)", h().c(str2));
                this.f5424a.L();
                String I6 = S5.I(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f5424a.L();
                S5.M(this.f4582q, i7, "_ev", I6, length);
                return;
            }
        }
        C0627w4 C7 = s().C(false);
        if (C7 != null && !bundle.containsKey("_sc")) {
            C7.f5577d = true;
        }
        S5.L(C7, bundle, z7 && !z9);
        boolean equals = "am".equals(str);
        boolean H02 = S5.H0(str2);
        if (z7 && this.f4569d != null && !H02 && !equals) {
            j().F().c("Passing event to registered event handler (FE)", h().c(str2), h().b(bundle));
            AbstractC0328n.i(this.f4569d);
            this.f4569d.a(str, str2, bundle, j7);
            return;
        }
        if (this.f5424a.s()) {
            int v7 = k().v(str2);
            if (v7 != 0) {
                j().H().b("Invalid event name. Event will not be logged (FE)", h().c(str2));
                k();
                String I7 = S5.I(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f5424a.L();
                S5.N(this.f4582q, str3, v7, "_ev", I7, length);
                return;
            }
            Bundle F6 = k().F(str3, str2, bundle, E2.f.c("_o", "_sn", "_sc", "_si"), z9);
            AbstractC0328n.i(F6);
            if (s().C(false) != null && "_ae".equals(str2)) {
                C0593r5 c0593r5 = u().f5418f;
                long b7 = c0593r5.f5524d.b().b();
                long j9 = b7 - c0593r5.f5522b;
                c0593r5.f5522b = b7;
                if (j9 > 0) {
                    k().P(F6, j9);
                }
            }
            if (C1032t6.a() && f().s(K.f4851p0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    S5 k7 = k();
                    String string = F6.getString("_ffr");
                    String trim = E2.n.a(string) ? null : string != null ? string.trim() : string;
                    if (V5.a(trim, k7.i().f5405v.a())) {
                        k7.j().F().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    k7.i().f5405v.b(trim);
                } else if ("_ae".equals(str2)) {
                    String a7 = k().i().f5405v.a();
                    if (!TextUtils.isEmpty(a7)) {
                        F6.putString("_ffr", a7);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(F6);
            boolean F7 = f().s(K.f4799Q0) ? u().F() : i().f5402s.b();
            if (i().f5399p.a() > 0 && i().y(j7) && F7) {
                j().K().a("Current session is expired, remove the session number, ID, and engagement time");
                j8 = 0;
                str4 = "_ae";
                a0("auto", "_sid", null, b().a());
                a0("auto", "_sno", null, b().a());
                a0("auto", "_se", null, b().a());
                i().f5400q.b(0L);
            } else {
                j8 = 0;
                str4 = "_ae";
            }
            if (F6.getLong("extend_session", j8) == 1) {
                j().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                c32 = this;
                c32.f5424a.K().f5417e.b(j7, true);
            } else {
                c32 = this;
            }
            ArrayList arrayList2 = new ArrayList(F6.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i8 = 0;
            while (i8 < size) {
                Object obj = arrayList2.get(i8);
                i8++;
                String str7 = (String) obj;
                if (str7 != null) {
                    k();
                    Bundle[] x02 = S5.x0(F6.get(str7));
                    if (x02 != null) {
                        F6.putParcelableArray(str7, x02);
                    }
                }
            }
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                Bundle bundle2 = (Bundle) arrayList.get(i9);
                if (i9 != 0) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                bundle2.putString("_o", str5);
                if (z8) {
                    bundle2 = k().r0(bundle2);
                }
                Bundle bundle3 = bundle2;
                t().D(new I(str6, new D(bundle3), str, j7), str3);
                if (!equals) {
                    Iterator it = c32.f4570e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC0612u3) it.next()).a(str, str2, new Bundle(bundle3), j7);
                    }
                }
            }
            if (s().C(false) == null || !str4.equals(str2)) {
                return;
            }
            u().E(true, true, b().b());
        }
    }

    public final void W(String str, String str2, long j7, Object obj) {
        e().D(new T3(this, str, str2, obj, j7));
    }

    public final void X(String str, String str2, Bundle bundle) {
        long a7 = b().a();
        AbstractC0328n.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a7);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        e().D(new Y3(this, bundle2));
    }

    public final void Y(String str, String str2, Bundle bundle, String str3) {
        m();
        x0(str, str2, b().a(), bundle, false, true, true, str3);
    }

    public final void Z(String str, String str2, Bundle bundle, boolean z7, boolean z8, long j7) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            s().O(bundle2, j7);
        } else {
            x0(str3, str2, j7, bundle2, z8, !z8 || this.f4569d == null || S5.H0(str2), z7, null);
        }
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            A2.AbstractC0328n.e(r9)
            A2.AbstractC0328n.e(r10)
            r8.n()
            r8.v()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L60
            boolean r0 = r11 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L51
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L51
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            R2.l2 r0 = r8.i()
            R2.r2 r0 = r0.f5396m
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4b
            java.lang.String r11 = "true"
        L4b:
            r0.b(r11)
            r6 = r10
        L4f:
            r3 = r1
            goto L62
        L51:
            if (r11 != 0) goto L60
            R2.l2 r10 = r8.i()
            R2.r2 r10 = r10.f5396m
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
            goto L4f
        L60:
            r3 = r10
            r6 = r11
        L62:
            R2.N2 r10 = r8.f5424a
            boolean r10 = r10.p()
            if (r10 != 0) goto L78
            R2.Y1 r9 = r8.j()
            R2.a2 r9 = r9.K()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L78:
            R2.N2 r10 = r8.f5424a
            boolean r10 = r10.s()
            if (r10 != 0) goto L81
            return
        L81:
            R2.R5 r10 = new R2.R5
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            R2.D4 r9 = r8.t()
            r9.J(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C3.a0(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ E2.e b() {
        return super.b();
    }

    public final void b0(String str, String str2, Object obj, boolean z7) {
        c0(str, str2, obj, z7, b().a());
    }

    public final void c0(String str, String str2, Object obj, boolean z7, long j7) {
        int i7;
        int length;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        if (z7) {
            i7 = k().q0(str2);
        } else {
            S5 k7 = k();
            if (k7.C0("user property", str2)) {
                if (!k7.n0("user property", AbstractC0598s3.f5527a, str2)) {
                    i7 = 15;
                } else if (k7.i0("user property", 24, str2)) {
                    i7 = 0;
                }
            }
            i7 = 6;
        }
        if (i7 != 0) {
            k();
            String I6 = S5.I(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.f5424a.L();
            S5.M(this.f4582q, i7, "_ev", I6, length);
            return;
        }
        if (obj == null) {
            W(str3, str2, j7, null);
            return;
        }
        int w7 = k().w(str2, obj);
        if (w7 == 0) {
            Object A02 = k().A0(str2, obj);
            if (A02 != null) {
                W(str3, str2, j7, A02);
                return;
            }
            return;
        }
        k();
        String I7 = S5.I(str2, 24, true);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        this.f5424a.L();
        S5.M(this.f4582q, w7, "_ev", I7, length);
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ C0504f d() {
        return super.d();
    }

    public final /* synthetic */ void d0(List list) {
        boolean contains;
        n();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray H6 = i().H();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0621v5 c0621v5 = (C0621v5) it.next();
                contains = H6.contains(c0621v5.f5565q);
                if (!contains || ((Long) H6.get(c0621v5.f5565q)).longValue() < c0621v5.f5564p) {
                    s0().add(c0621v5);
                }
            }
            r0();
        }
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ G2 e() {
        return super.e();
    }

    public final Boolean e0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) e().v(atomicReference, 15000L, "boolean test flag value", new O3(this, atomicReference));
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0511g f() {
        return super.f();
    }

    public final Double f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) e().v(atomicReference, 15000L, "double test flag value", new RunnableC0523h4(this, atomicReference));
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C g() {
        return super.g();
    }

    public final Integer g0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) e().v(atomicReference, 15000L, "int test flag value", new RunnableC0502e4(this, atomicReference));
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ X1 h() {
        return super.h();
    }

    public final Long h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) e().v(atomicReference, 15000L, "long test flag value", new RunnableC0509f4(this, atomicReference));
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ C0549l2 i() {
        return super.i();
    }

    public final String i0() {
        return (String) this.f4572g.get();
    }

    @Override // R2.AbstractC0557m3, R2.InterfaceC0571o3
    public final /* bridge */ /* synthetic */ Y1 j() {
        return super.j();
    }

    public final String j0() {
        C0627w4 P6 = this.f5424a.I().P();
        if (P6 != null) {
            return P6.f5575b;
        }
        return null;
    }

    @Override // R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ S5 k() {
        return super.k();
    }

    public final String k0() {
        C0627w4 P6 = this.f5424a.I().P();
        if (P6 != null) {
            return P6.f5574a;
        }
        return null;
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final String l0() {
        if (this.f5424a.M() != null) {
            return this.f5424a.M();
        }
        try {
            return new H2(a(), this.f5424a.P()).b("google_app_id");
        } catch (IllegalStateException e7) {
            this.f5424a.j().G().b("getGoogleAppId failed with exception", e7);
            return null;
        }
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final String m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) e().v(atomicReference, 15000L, "String test flag value", new W3(this, atomicReference));
    }

    @Override // R2.G1, R2.AbstractC0557m3
    public final /* bridge */ /* synthetic */ void n() {
        super.n();
    }

    public final void n0() {
        Boolean F6;
        n();
        v();
        if (this.f5424a.s()) {
            if (f().s(K.f4841k0) && (F6 = f().F("google_analytics_deferred_deep_link_enabled")) != null && F6.booleanValue()) {
                j().F().a("Deferred Deep Link feature enabled.");
                e().D(new Runnable() { // from class: R2.H3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3.this.q0();
                    }
                });
            }
            t().X();
            this.f4580o = false;
            String N6 = i().N();
            if (TextUtils.isEmpty(N6)) {
                return;
            }
            g().o();
            if (N6.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", N6);
            z0("auto", "_ou", bundle);
        }
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ B o() {
        return super.o();
    }

    public final void o0() {
        if (!(a().getApplicationContext() instanceof Application) || this.f4568c == null) {
            return;
        }
        ((Application) a().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f4568c);
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ S1 p() {
        return super.p();
    }

    public final void p0() {
        if (C0917g7.a() && f().s(K.f4791M0)) {
            if (e().J()) {
                j().G().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C0504f.a()) {
                j().G().a("Cannot get trigger URIs from main thread");
                return;
            }
            v();
            j().K().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            e().v(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: R2.D3
                @Override // java.lang.Runnable
                public final void run() {
                    C3 c32 = C3.this;
                    AtomicReference atomicReference2 = atomicReference;
                    Bundle a7 = c32.i().f5397n.a();
                    D4 t7 = c32.t();
                    if (a7 == null) {
                        a7 = new Bundle();
                    }
                    t7.R(atomicReference2, a7);
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                j().G().a("Timed out waiting for get trigger URIs");
            } else {
                e().D(new Runnable() { // from class: R2.G3
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3.this.d0(list);
                    }
                });
            }
        }
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ V1 q() {
        return super.q();
    }

    public final void q0() {
        n();
        if (i().f5403t.b()) {
            j().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a7 = i().f5404u.a();
        i().f5404u.b(1 + a7);
        if (a7 >= 5) {
            j().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            i().f5403t.a(true);
        } else {
            if (!C0979n6.a() || !f().s(K.f4807U0)) {
                this.f5424a.u();
                return;
            }
            if (this.f4581p == null) {
                this.f4581p = new V3(this, this.f5424a);
            }
            this.f4581p.b(0L);
        }
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C3 r() {
        return super.r();
    }

    public final void r0() {
        C0621v5 c0621v5;
        AbstractC1883a Q02;
        n();
        if (s0().isEmpty() || this.f4574i || (c0621v5 = (C0621v5) s0().poll()) == null || (Q02 = k().Q0()) == null) {
            return;
        }
        this.f4574i = true;
        j().K().b("Registering trigger URI", c0621v5.f5563o);
        InterfaceFutureC0796e c7 = Q02.c(Uri.parse(c0621v5.f5563o));
        if (c7 == null) {
            this.f4574i = false;
            s0().add(c0621v5);
            return;
        }
        SparseArray H6 = i().H();
        H6.put(c0621v5.f5565q, Long.valueOf(c0621v5.f5564p));
        C0549l2 i7 = i();
        int[] iArr = new int[H6.size()];
        long[] jArr = new long[H6.size()];
        for (int i8 = 0; i8 < H6.size(); i8++) {
            iArr[i8] = H6.keyAt(i8);
            jArr[i8] = ((Long) H6.valueAt(i8)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        i7.f5397n.b(bundle);
        AbstractC0794c.a(c7, new Q3(this, c0621v5), new M3(this));
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C0620v4 s() {
        return super.s();
    }

    public final PriorityQueue s0() {
        Comparator comparing;
        if (this.f4575j == null) {
            B3.a();
            comparing = Comparator.comparing(new Function() { // from class: R2.y3
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((C0621v5) obj).f5564p);
                }
            }, new Comparator() { // from class: R2.E3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return (((Long) obj).longValue() > ((Long) obj2).longValue() ? 1 : (((Long) obj).longValue() == ((Long) obj2).longValue() ? 0 : -1));
                }
            });
            this.f4575j = A3.a(comparing);
        }
        return this.f4575j;
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ D4 t() {
        return super.t();
    }

    public final void t0() {
        n();
        String a7 = i().f5396m.a();
        if (a7 != null) {
            if ("unset".equals(a7)) {
                a0("app", "_npa", null, b().a());
            } else {
                a0("app", "_npa", Long.valueOf("true".equals(a7) ? 1L : 0L), b().a());
            }
        }
        if (!this.f5424a.p() || !this.f4580o) {
            j().F().a("Updating Scion state (FE)");
            t().b0();
            return;
        }
        j().F().a("Recording app launch after enabling measurement for the first time (FE)");
        n0();
        if (G6.a() && f().s(K.f4853q0)) {
            u().f5417e.a();
        }
        e().D(new S3(this));
    }

    @Override // R2.G1
    public final /* bridge */ /* synthetic */ C0552l5 u() {
        return super.u();
    }

    public final void u0(InterfaceC0612u3 interfaceC0612u3) {
        v();
        AbstractC0328n.i(interfaceC0612u3);
        if (this.f4570e.remove(interfaceC0612u3)) {
            return;
        }
        j().L().a("OnEventListener had not been registered");
    }

    public final void w0(Bundle bundle) {
        Q(bundle, b().a());
    }

    public final void x0(String str, String str2, long j7, Bundle bundle, boolean z7, boolean z8, boolean z9, String str3) {
        e().D(new U3(this, str, str2, j7, S5.E(bundle), z7, z8, z9, str3));
    }

    public final void y0(String str, String str2, Bundle bundle) {
        Z(str, str2, bundle, true, true, b().a());
    }

    public final void z0(String str, String str2, Bundle bundle) {
        n();
        U(str, str2, b().a(), bundle);
    }
}
