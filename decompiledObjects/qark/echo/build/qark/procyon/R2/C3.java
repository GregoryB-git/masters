// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import java.util.Comparator;
import java.util.function.Function;
import java.util.concurrent.Executor;
import b3.b;
import b3.c;
import android.net.Uri;
import com.google.android.gms.internal.measurement.g7;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.util.SparseArray;
import android.os.Build$VERSION;
import E2.e;
import java.util.Locale;
import android.os.Parcelable;
import java.util.Collection;
import com.google.android.gms.internal.measurement.t6;
import com.google.android.gms.internal.measurement.H6;
import android.content.Context;
import com.google.android.gms.internal.measurement.n6;
import A2.n;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.G6;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.s7;
import java.util.Iterator;
import t.a;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Set;

public final class C3 extends f1
{
    public k4 c;
    public v3 d;
    public final Set e;
    public boolean f;
    public final AtomicReference g;
    public final Object h;
    public boolean i;
    public PriorityQueue j;
    public q3 k;
    public final AtomicLong l;
    public long m;
    public final c6 n;
    public boolean o;
    public x p;
    public final U5 q;
    
    public C3(final N2 n2) {
        super(n2);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.i = false;
        this.o = true;
        this.q = new c4(this);
        this.g = new AtomicReference();
        this.k = q3.c;
        this.m = -1L;
        this.l = new AtomicLong(0L);
        this.n = new c6(n2);
    }
    
    @Override
    public final boolean A() {
        return false;
    }
    
    public final ArrayList C(final String s, final String s2) {
        if (this.e().J()) {
            this.j().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (R2.f.a()) {
            this.j().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        final AtomicReference<List> atomicReference = new AtomicReference<List>();
        super.a.e().v(atomicReference, 5000L, "get conditional user properties", new b4(this, atomicReference, null, s, s2));
        final List list = atomicReference.get();
        if (list == null) {
            this.j().G().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return S5.t0(list);
    }
    
    public final Map D(final String s, String s2, final boolean b) {
        a2 a2;
        if (this.e().J()) {
            a2 = this.j().G();
            s2 = "Cannot get user properties from analytics worker thread";
        }
        else if (R2.f.a()) {
            a2 = this.j().G();
            s2 = "Cannot get user properties from main thread";
        }
        else {
            final AtomicReference<List<R5>> atomicReference = new AtomicReference<List<R5>>();
            super.a.e().v(atomicReference, 5000L, "get user properties", new a4(this, atomicReference, null, s, s2, b));
            final List<R5> list = atomicReference.get();
            if (list == null) {
                this.j().G().b("Timed out waiting for handle get user properties, includeInternal", b);
                return Collections.emptyMap();
            }
            final a a3 = new a(list.size());
            for (final R5 r5 : list) {
                final Object a4 = r5.a();
                if (a4 != null) {
                    a3.put(r5.p, a4);
                }
            }
            return a3;
        }
        a2.a(s2);
        return Collections.emptyMap();
    }
    
    public final void E(final long n, final boolean b) {
        this.n();
        this.v();
        this.j().F().a("Resetting analytics data (FE)");
        final l5 u = this.u();
        u.n();
        u.f.b();
        if (s7.a() && this.f().s(K.x0)) {
            this.p().I();
        }
        final boolean p2 = super.a.p();
        final l2 i = this.i();
        i.e.b(n);
        if (!TextUtils.isEmpty((CharSequence)i.i().v.a())) {
            i.v.b(null);
        }
        if (G6.a() && i.f().s(K.q0)) {
            i.p.b(0L);
        }
        i.q.b(0L);
        if (!i.f().R()) {
            i.E(p2 ^ true);
        }
        i.w.b(null);
        i.x.b(0L);
        i.y.b(null);
        if (b) {
            this.t().a0();
        }
        if (G6.a() && this.f().s(K.q0)) {
            this.u().e.a();
        }
        this.o = (p2 ^ true);
    }
    
    public final void F(final z z) {
        this.e().D(new j4(this, z));
    }
    
    public final void G(final q3 q3) {
        this.n();
        final boolean b = (q3.y() && q3.x()) || this.t().e0();
        if (b != super.a.q()) {
            super.a.w(b);
            final Boolean l = this.i().L();
            if (!b || l == null || l) {
                this.S(b, false);
            }
        }
    }
    
    public final void H(q3 o, final long n) {
        this.v();
        final int b = ((q3)o).b();
        if (b != -10 && ((q3)o).s() == null && ((q3)o).u() == null) {
            this.j().M().a("Discarding empty consent settings");
            return;
        }
        while (true) {
            final Object h = this.h;
            // monitorenter(h)
            while (true) {
                Label_0278: {
                    while (true) {
                        try {
                            final q3 k = this.k;
                            final boolean i = q3.k(b, k.b());
                            boolean b2 = false;
                            final boolean b3 = false;
                            if (!i) {
                                break Label_0278;
                            }
                            final boolean t = ((q3)o).t(this.k);
                            boolean b4 = b3;
                            if (((q3)o).y()) {
                                b4 = b3;
                                if (!this.k.y()) {
                                    b4 = true;
                                }
                            }
                            o = ((q3)o).o(this.k);
                            this.k = (q3)o;
                            final boolean b5 = b4;
                            b2 = true;
                            final boolean b6 = t;
                            // monitorexit(h)
                            if (!b2) {
                                this.j().J().b("Ignoring lower-priority consent settings, proposed settings", o);
                                return;
                            }
                            final long andIncrement = this.l.getAndIncrement();
                            if (b6) {
                                this.T(null);
                                this.e().G(new i4(this, (q3)o, n, andIncrement, b5, k));
                                return;
                            }
                            final l4 l4 = new l4(this, (q3)o, andIncrement, b5, k);
                            if (b != 30 && b != -10) {
                                this.e().D(l4);
                                return;
                            }
                            this.e().G(l4);
                            return;
                            // monitorexit(h)
                            throw o;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                boolean b6;
                final boolean b5 = b6 = false;
                continue;
            }
        }
    }
    
    public final void I(final u3 u3) {
        this.v();
        A2.n.i(u3);
        if (!this.e.add(u3)) {
            this.j().L().a("OnEventListener already registered");
        }
    }
    
    public final void J(final v3 d) {
        this.n();
        this.v();
        if (d != null) {
            final v3 d2 = this.d;
            if (d != d2) {
                A2.n.m(d2 == null, "EventInterceptor already set.");
            }
        }
        this.d = d;
    }
    
    public final void P(final Bundle bundle, final int n, final long n2) {
        this.v();
        final String i = q3.i(bundle);
        if (i != null) {
            this.j().M().b("Ignoring invalid consent setting", i);
            this.j().M().a("Valid consent values are 'granted', 'denied'");
        }
        final q3 d = q3.d(bundle, n);
        if (n6.a() && this.f().s(K.S0)) {
            if (d.z()) {
                this.H(d, n2);
            }
            final z b = z.b(bundle, n);
            if (b.j()) {
                this.F(b);
            }
            final Boolean d2 = z.d(bundle);
            if (d2 != null) {
                this.b0("app", "allow_personalized_ads", d2.toString(), false);
            }
            return;
        }
        this.H(d, n2);
    }
    
    public final void Q(Bundle bundle, long n) {
        n.i(bundle);
        bundle = new Bundle(bundle);
        if (!TextUtils.isEmpty((CharSequence)((BaseBundle)bundle).getString("app_id"))) {
            this.j().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle.remove("app_id");
        n.i(bundle);
        n3.a(bundle, "app_id", String.class, null);
        n3.a(bundle, "origin", String.class, null);
        n3.a(bundle, "name", String.class, null);
        n3.a(bundle, "value", Object.class, null);
        n3.a(bundle, "trigger_event_name", String.class, null);
        n3.a(bundle, "trigger_timeout", Long.class, 0L);
        n3.a(bundle, "timed_out_event_name", String.class, null);
        n3.a(bundle, "timed_out_event_params", Bundle.class, null);
        n3.a(bundle, "triggered_event_name", String.class, null);
        n3.a(bundle, "triggered_event_params", Bundle.class, null);
        n3.a(bundle, "time_to_live", Long.class, 0L);
        n3.a(bundle, "expired_event_name", String.class, null);
        n3.a(bundle, "expired_event_params", Bundle.class, null);
        n.e(((BaseBundle)bundle).getString("name"));
        n.e(((BaseBundle)bundle).getString("origin"));
        n.i(((BaseBundle)bundle).get("value"));
        ((BaseBundle)bundle).putLong("creation_timestamp", n);
        final String string = ((BaseBundle)bundle).getString("name");
        final Object value = ((BaseBundle)bundle).get("value");
        if (this.k().q0(string) != 0) {
            this.j().G().b("Invalid conditional user property name", this.h().g(string));
            return;
        }
        if (this.k().w(string, value) != 0) {
            this.j().G().c("Invalid conditional user property value", this.h().g(string), value);
            return;
        }
        final Object a0 = this.k().A0(string, value);
        if (a0 == null) {
            this.j().G().c("Unable to normalize conditional user property value", this.h().g(string), value);
            return;
        }
        n3.b(bundle, a0);
        n = ((BaseBundle)bundle).getLong("trigger_timeout");
        if (!TextUtils.isEmpty((CharSequence)((BaseBundle)bundle).getString("trigger_event_name")) && (n > 15552000000L || n < 1L)) {
            this.j().G().c("Invalid conditional user property timeout", this.h().g(string), n);
            return;
        }
        n = ((BaseBundle)bundle).getLong("time_to_live");
        if (n <= 15552000000L && n >= 1L) {
            this.e().D(new Z3(this, bundle));
            return;
        }
        this.j().G().c("Invalid conditional user property time to live", this.h().g(string), n);
    }
    
    public final void R(final Boolean b) {
        this.v();
        this.e().D(new g4(this, b));
    }
    
    public final void S(final Boolean b, final boolean b2) {
        this.n();
        this.v();
        this.j().F().b("Setting app measurement enabled (FE)", b);
        this.i().v(b);
        if (b2) {
            this.i().C(b);
        }
        if (super.a.q() || (b != null && !b)) {
            this.t0();
        }
    }
    
    public final void T(final String newValue) {
        this.g.set(newValue);
    }
    
    public final void U(final String s, final String s2, final long n, final Bundle bundle) {
        this.n();
        this.V(s, s2, n, bundle, true, this.d == null || S5.H0(s2), true, null);
    }
    
    public final void V(String s, final String s2, final long n, Bundle list, boolean b, final boolean b2, final boolean b3, final String s3) {
        n.e(s);
        n.i(list);
        this.n();
        this.v();
        if (!super.a.p()) {
            this.j().F().a("Event not sent since app measurement is disabled");
            return;
        }
        final List h = this.p().H();
        if (h != null && !h.contains(s2)) {
            this.j().F().c("Dropping non-safelisted event. event name, origin", s2, s);
            return;
        }
        final boolean f = this.f;
        int length = 0;
        int n2 = 0;
    Label_0204_Outer:
        while (true) {
            if (!f) {
                this.f = true;
                while (true) {
                    try {
                        Class<?> clazz;
                        if (!super.a.t()) {
                            clazz = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.a().getClassLoader());
                        }
                        else {
                            clazz = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                        }
                        try {
                            clazz.getDeclaredMethod("initialize", Context.class).invoke(null, this.a());
                        }
                        catch (Exception ex) {
                            this.j().L().b("Failed to invoke Tag Manager's initialize() method", ex);
                        }
                        if ("_cmp".equals(s2)) {
                            if (((BaseBundle)list).containsKey("gclid")) {
                                this.a0("auto", "_lgclid", ((BaseBundle)list).getString("gclid"), this.b().a());
                            }
                            if (H6.a() && this.f().s(K.Z0) && ((BaseBundle)list).containsKey("gbraid")) {
                                this.a0("auto", "_gbraid", ((BaseBundle)list).getString("gbraid"), this.b().a());
                            }
                        }
                        if (b && S5.L0(s2)) {
                            this.k().Q(list, this.i().y.a());
                        }
                        if (!b3 && !"_iap".equals(s2)) {
                            final S5 l = super.a.L();
                            final boolean c0 = l.C0("event", s2);
                            int n3 = 2;
                            if (c0) {
                                if (!l.o0("event", r3.a, r3.b, s2)) {
                                    n3 = 13;
                                }
                                else if (l.i0("event", 40, s2)) {
                                    n3 = 0;
                                }
                            }
                            if (n3 != 0) {
                                this.j().H().b("Invalid public event name. Event will not be logged (FE)", this.h().c(s2));
                                super.a.L();
                                s = S5.I(s2, 40, true);
                                length = n2;
                                if (s2 != null) {
                                    length = s2.length();
                                }
                                super.a.L();
                                S5.M(this.q, n3, "_ev", s, length);
                                return;
                            }
                        }
                        final w4 c2 = this.s().C(false);
                        if (c2 != null && !((BaseBundle)list).containsKey("_sc")) {
                            c2.d = true;
                        }
                        S5.L(c2, list, b && !b3);
                        final boolean equals = "am".equals(s);
                        final boolean h2 = S5.H0(s2);
                        if (b && this.d != null && !h2 && !equals) {
                            this.j().F().c("Passing event to registered event handler (FE)", this.h().c(s2), this.h().b(list));
                            n.i(this.d);
                            this.d.a(s, s2, list, n);
                            return;
                        }
                        if (!super.a.s()) {
                            return;
                        }
                        n2 = this.k().v(s2);
                        if (n2 != 0) {
                            this.j().H().b("Invalid event name. Event will not be logged (FE)", this.h().c(s2));
                            this.k();
                            s = S5.I(s2, 40, true);
                            int length2 = length;
                            if (s2 != null) {
                                length2 = s2.length();
                            }
                            super.a.L();
                            S5.N(this.q, s3, n2, "_ev", s, length2);
                            return;
                        }
                        final Bundle f2 = this.k().F(s3, s2, list, E2.f.c("_o", "_sn", "_sc", "_si"), b3);
                        n.i(f2);
                        if (this.s().C(false) != null && "_ae".equals(s2)) {
                            list = (Bundle)this.u().f;
                            final long b4 = ((r5)list).d.b().b();
                            final long n4 = b4 - ((r5)list).b;
                            ((r5)list).b = b4;
                            if (n4 > 0L) {
                                this.k().P(f2, n4);
                            }
                        }
                        if (t6.a() && this.f().s(K.p0)) {
                            if (!"auto".equals(s) && "_ssr".equals(s2)) {
                                final S5 k = this.k();
                                list = (Bundle)((BaseBundle)f2).getString("_ffr");
                                if (E2.n.a((String)list)) {
                                    list = null;
                                }
                                else if (list != null) {
                                    list = (Bundle)((String)list).trim();
                                }
                                if (V5.a(list, k.i().v.a())) {
                                    k.j().F().a("Not logging duplicate session_start_with_rollout event");
                                    return;
                                }
                                k.i().v.b((String)list);
                            }
                            else if ("_ae".equals(s2)) {
                                list = (Bundle)this.k().i().v.a();
                                if (!TextUtils.isEmpty((CharSequence)list)) {
                                    ((BaseBundle)f2).putString("_ffr", (String)list);
                                }
                            }
                        }
                        final ArrayList<Object> list2 = new ArrayList<Object>();
                        list2.add(f2);
                        if (this.f().s(K.Q0)) {
                            b = this.u().F();
                        }
                        else {
                            b = this.i().s.b();
                        }
                        if (this.i().p.a() > 0L && this.i().y(n) && b) {
                            this.j().K().a("Current session is expired, remove the session number, ID, and engagement time");
                            this.a0("auto", "_sid", null, this.b().a());
                            this.a0("auto", "_sno", null, this.b().a());
                            this.a0("auto", "_se", null, this.b().a());
                            this.i().q.b(0L);
                        }
                        if (((BaseBundle)f2).getLong("extend_session", 0L) == 1L) {
                            this.j().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                            super.a.K().e.b(n, true);
                        }
                        list = (Bundle)new ArrayList(((BaseBundle)f2).keySet());
                        Collections.sort((List<Comparable>)list);
                        n2 = ((ArrayList)list).size();
                        int i = 0;
                        while (i < n2) {
                            final Object value = ((ArrayList<Object>)list).get(i);
                            length = i + 1;
                            final String s4 = (String)value;
                            i = length;
                            if (s4 != null) {
                                this.k();
                                final Bundle[] x0 = S5.x0(((BaseBundle)f2).get(s4));
                                i = length;
                                if (x0 == null) {
                                    continue Label_0204_Outer;
                                }
                                f2.putParcelableArray(s4, (Parcelable[])x0);
                                i = length;
                            }
                        }
                        for (int j = 0; j < list2.size(); ++j) {
                            final Bundle bundle = list2.get(j);
                            String s5;
                            if (j != 0) {
                                s5 = "_ep";
                            }
                            else {
                                s5 = s2;
                            }
                            ((BaseBundle)bundle).putString("_o", s);
                            list = bundle;
                            if (b2) {
                                list = this.k().r0(bundle);
                            }
                            this.t().D(new I(s5, new D(list), s, n), s3);
                            if (!equals) {
                                final Iterator<u3> iterator = (Iterator<u3>)this.e.iterator();
                                while (iterator.hasNext()) {
                                    iterator.next().a(s, s2, new Bundle(list), n);
                                }
                            }
                        }
                        if (this.s().C(false) != null && "_ae".equals(s2)) {
                            this.u().E(true, true, this.b().b());
                        }
                        return;
                        this.j().J().a("Tag Manager is not found and thus will not be used");
                        continue Label_0204_Outer;
                    }
                    catch (ClassNotFoundException ex2) {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public final void W(final String s, final String s2, final long n, final Object o) {
        this.e().D(new T3(this, s, s2, o, n));
    }
    
    public final void X(final String s, final String s2, final Bundle bundle) {
        final long a = this.b().a();
        A2.n.e(s);
        final Bundle bundle2 = new Bundle();
        ((BaseBundle)bundle2).putString("name", s);
        ((BaseBundle)bundle2).putLong("creation_timestamp", a);
        if (s2 != null) {
            ((BaseBundle)bundle2).putString("expired_event_name", s2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.e().D(new Y3(this, bundle2));
    }
    
    public final void Y(final String s, final String s2, final Bundle bundle, final String s3) {
        this.m();
        this.x0(s, s2, this.b().a(), bundle, false, true, true, s3);
    }
    
    public final void Z(String s, final String s2, Bundle bundle, final boolean b, final boolean b2, final long n) {
        if (s == null) {
            s = "app";
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (s2 == "screen_view" || (s2 != null && s2.equals("screen_view"))) {
            this.s().O(bundle, n);
            return;
        }
        this.x0(s, s2, n, bundle, b2, !b2 || this.d == null || S5.H0(s2), b, null);
    }
    
    public final void a0(final String s, String anObject, final Object o, final long n) {
        n.e(s);
        n.e(anObject);
        this.n();
        this.v();
        String s3 = null;
        Object o3 = null;
        Label_0154: {
            if ("allow_personalized_ads".equals(anObject)) {
                while (true) {
                    Label_0127: {
                        if (!(o instanceof String)) {
                            break Label_0127;
                        }
                        final String s2 = (String)o;
                        if (TextUtils.isEmpty((CharSequence)s2)) {
                            break Label_0127;
                        }
                        final String lowerCase = s2.toLowerCase(Locale.ENGLISH);
                        anObject = "false";
                        long l;
                        if ("false".equals(lowerCase)) {
                            l = 1L;
                        }
                        else {
                            l = 0L;
                        }
                        final Long value = l;
                        final r2 m = this.i().m;
                        if (value == 1L) {
                            anObject = "true";
                        }
                        m.b(anObject);
                        final Object o2 = value;
                        s3 = "_npa";
                        o3 = o2;
                        break Label_0154;
                    }
                    if (o == null) {
                        this.i().m.b("unset");
                        final Object o2 = o;
                        continue;
                    }
                    break;
                }
            }
            o3 = o;
            s3 = anObject;
        }
        if (!super.a.p()) {
            this.j().K().a("User property not set since app measurement is disabled");
            return;
        }
        if (!super.a.s()) {
            return;
        }
        this.t().J(new R5(s3, n, o3, s));
    }
    
    public final void b0(final String s, final String s2, final Object o, final boolean b) {
        this.c0(s, s2, o, b, this.b().a());
    }
    
    public final void c0(String s, final String s2, final Object obj, final boolean b, final long n) {
        String s3 = s;
        if (s == null) {
            s3 = "app";
        }
        final boolean b2 = false;
        final boolean b3 = false;
        int q0 = 0;
        Label_0099: {
            if (b) {
                q0 = this.k().q0(s2);
            }
            else {
                final S5 k = this.k();
                if (k.C0("user property", s2)) {
                    if (!k.n0("user property", R2.s3.a, s2)) {
                        q0 = 15;
                        break Label_0099;
                    }
                    if (k.i0("user property", 24, s2)) {
                        q0 = 0;
                        break Label_0099;
                    }
                }
                q0 = 6;
            }
        }
        if (q0 != 0) {
            this.k();
            s = S5.I(s2, 24, true);
            int length = b3 ? 1 : 0;
            if (s2 != null) {
                length = s2.length();
            }
            super.a.L();
            S5.M(this.q, q0, "_ev", s, length);
            return;
        }
        if (obj == null) {
            this.W(s3, s2, n, null);
            return;
        }
        final int w = this.k().w(s2, obj);
        if (w != 0) {
            this.k();
            s = S5.I(s2, 24, true);
            int length2 = 0;
            Label_0215: {
                if (!(obj instanceof String)) {
                    length2 = (b2 ? 1 : 0);
                    if (!(obj instanceof CharSequence)) {
                        break Label_0215;
                    }
                }
                length2 = String.valueOf(obj).length();
            }
            super.a.L();
            S5.M(this.q, w, "_ev", s, length2);
            return;
        }
        final Object a0 = this.k().A0(s2, obj);
        if (a0 != null) {
            this.W(s3, s2, n, a0);
        }
    }
    
    public final Boolean e0() {
        final AtomicReference atomicReference = new AtomicReference();
        return (Boolean)this.e().v(atomicReference, 15000L, "boolean test flag value", new O3(this, atomicReference));
    }
    
    public final Double f0() {
        final AtomicReference atomicReference = new AtomicReference();
        return (Double)this.e().v(atomicReference, 15000L, "double test flag value", new h4(this, atomicReference));
    }
    
    public final Integer g0() {
        final AtomicReference atomicReference = new AtomicReference();
        return (Integer)this.e().v(atomicReference, 15000L, "int test flag value", new e4(this, atomicReference));
    }
    
    public final Long h0() {
        final AtomicReference atomicReference = new AtomicReference();
        return (Long)this.e().v(atomicReference, 15000L, "long test flag value", new f4(this, atomicReference));
    }
    
    public final String i0() {
        return this.g.get();
    }
    
    public final String j0() {
        final w4 p = super.a.I().P();
        if (p != null) {
            return p.b;
        }
        return null;
    }
    
    public final String k0() {
        final w4 p = super.a.I().P();
        if (p != null) {
            return p.a;
        }
        return null;
    }
    
    public final String l0() {
        if (super.a.M() != null) {
            return super.a.M();
        }
        try {
            return new H2(this.a(), super.a.P()).b("google_app_id");
        }
        catch (IllegalStateException ex) {
            super.a.j().G().b("getGoogleAppId failed with exception", ex);
            return null;
        }
    }
    
    public final String m0() {
        final AtomicReference atomicReference = new AtomicReference();
        return (String)this.e().v(atomicReference, 15000L, "String test flag value", new W3(this, atomicReference));
    }
    
    public final void n0() {
        this.n();
        this.v();
        if (!super.a.s()) {
            return;
        }
        if (this.f().s(K.k0)) {
            final Boolean f = this.f().F("google_analytics_deferred_deep_link_enabled");
            if (f != null && f) {
                this.j().F().a("Deferred Deep Link feature enabled.");
                this.e().D(new H3(this));
            }
        }
        this.t().X();
        this.o = false;
        final String n = this.i().N();
        if (!TextUtils.isEmpty((CharSequence)n)) {
            this.g().o();
            if (!n.equals(Build$VERSION.RELEASE)) {
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putString("_po", n);
                this.z0("auto", "_ou", bundle);
            }
        }
    }
    
    public final void o0() {
        if (this.a().getApplicationContext() instanceof Application && this.c != null) {
            ((Application)this.a().getApplicationContext()).unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this.c);
        }
    }
    
    public final void p0() {
        if (g7.a()) {
            if (!this.f().s(K.M0)) {
                return;
            }
            if (this.e().J()) {
                this.j().G().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (R2.f.a()) {
                this.j().G().a("Cannot get trigger URIs from main thread");
                return;
            }
            this.v();
            this.j().K().a("Getting trigger URIs (FE)");
            final AtomicReference<List> atomicReference = new AtomicReference<List>();
            this.e().v(atomicReference, 5000L, "get trigger URIs", new D3(this, atomicReference));
            final List list = atomicReference.get();
            if (list == null) {
                this.j().G().a("Timed out waiting for get trigger URIs");
                return;
            }
            this.e().D(new G3(this, list));
        }
    }
    
    public final void q0() {
        this.n();
        if (this.i().t.b()) {
            this.j().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        final long a = this.i().u.a();
        this.i().u.b(1L + a);
        if (a >= 5L) {
            this.j().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            this.i().t.a(true);
            return;
        }
        if (n6.a() && this.f().s(K.U0)) {
            if (this.p == null) {
                this.p = new V3(this, super.a);
            }
            this.p.b(0L);
            return;
        }
        super.a.u();
    }
    
    public final void r0() {
        this.n();
        if (!this.s0().isEmpty()) {
            if (this.i) {
                return;
            }
            final v5 e = this.s0().poll();
            if (e == null) {
                return;
            }
            final q1.a q0 = this.k().Q0();
            if (q0 == null) {
                return;
            }
            this.i = true;
            this.j().K().b("Registering trigger URI", e.o);
            final b3.e c = q0.c(Uri.parse(e.o));
            int i = 0;
            if (c == null) {
                this.i = false;
                this.s0().add(e);
                return;
            }
            final SparseArray h = this.i().H();
            h.put(e.q, (Object)e.p);
            final l2 j = this.i();
            final int[] array = new int[h.size()];
            final long[] array2 = new long[h.size()];
            while (i < h.size()) {
                array[i] = h.keyAt(i);
                array2[i] = (long)h.valueAt(i);
                ++i;
            }
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putIntArray("uriSources", array);
            ((BaseBundle)bundle).putLongArray("uriTimestamps", array2);
            j.n.b(bundle);
            b3.c.a(c, new Q3(this, e), new M3(this));
        }
    }
    
    public final PriorityQueue s0() {
        if (this.j == null) {
            B3.a();
            this.j = A3.a(K3.a(y3.a, E3.o));
        }
        return this.j;
    }
    
    public final void t0() {
        this.n();
        final String a = this.i().m.a();
        if (a != null) {
            if ("unset".equals(a)) {
                this.a0("app", "_npa", null, this.b().a());
            }
            else {
                long l;
                if ("true".equals(a)) {
                    l = 1L;
                }
                else {
                    l = 0L;
                }
                this.a0("app", "_npa", l, this.b().a());
            }
        }
        if (super.a.p() && this.o) {
            this.j().F().a("Recording app launch after enabling measurement for the first time (FE)");
            this.n0();
            if (G6.a() && this.f().s(K.q0)) {
                this.u().e.a();
            }
            this.e().D(new S3(this));
            return;
        }
        this.j().F().a("Updating Scion state (FE)");
        this.t().b0();
    }
    
    public final void u0(final u3 u3) {
        this.v();
        A2.n.i(u3);
        if (!this.e.remove(u3)) {
            this.j().L().a("OnEventListener had not been registered");
        }
    }
    
    public final void w0(final Bundle bundle) {
        this.Q(bundle, this.b().a());
    }
    
    public final void x0(final String s, final String s2, final long n, Bundle e, final boolean b, final boolean b2, final boolean b3, final String s3) {
        e = S5.E(e);
        this.e().D(new U3(this, s, s2, n, e, b, b2, b3, s3));
    }
    
    public final void y0(final String s, final String s2, final Bundle bundle) {
        this.Z(s, s2, bundle, true, true, this.b().a());
    }
    
    public final void z0(final String s, final String s2, final Bundle bundle) {
        this.n();
        this.U(s, s2, this.b().a(), bundle);
    }
}
