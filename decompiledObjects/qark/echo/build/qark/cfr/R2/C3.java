/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.SparseArray
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.PriorityQueue
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArraySet
 *  java.util.concurrent.Executor
 *  java.util.concurrent.atomic.AtomicLong
 *  java.util.concurrent.atomic.AtomicReference
 */
package R2;

import E2.e;
import E2.n;
import R2.A3;
import R2.B;
import R2.B3;
import R2.C;
import R2.D;
import R2.D3;
import R2.D4;
import R2.E3;
import R2.G1;
import R2.G2;
import R2.G3;
import R2.H2;
import R2.H3;
import R2.I;
import R2.K;
import R2.K3;
import R2.M3;
import R2.N2;
import R2.O3;
import R2.P1;
import R2.Q3;
import R2.R5;
import R2.S1;
import R2.S3;
import R2.S5;
import R2.T3;
import R2.U3;
import R2.U5;
import R2.V1;
import R2.V3;
import R2.V5;
import R2.W3;
import R2.X1;
import R2.Y1;
import R2.Y3;
import R2.Z3;
import R2.a2;
import R2.a4;
import R2.b4;
import R2.c4;
import R2.c6;
import R2.e4;
import R2.f;
import R2.f1;
import R2.f4;
import R2.g;
import R2.g4;
import R2.h4;
import R2.i4;
import R2.j4;
import R2.k4;
import R2.l2;
import R2.l4;
import R2.l5;
import R2.m3;
import R2.n2;
import R2.n3;
import R2.o2;
import R2.o3;
import R2.q2;
import R2.q3;
import R2.r2;
import R2.r3;
import R2.r5;
import R2.s3;
import R2.t5;
import R2.u3;
import R2.v3;
import R2.v4;
import R2.v5;
import R2.w4;
import R2.x;
import R2.y3;
import R2.z;
import R2.z3;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import b3.c;
import com.google.android.gms.internal.measurement.G6;
import com.google.android.gms.internal.measurement.H6;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.t6;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import t.a;

public final class C3
extends f1 {
    public k4 c;
    public v3 d;
    public final Set e = new CopyOnWriteArraySet();
    public boolean f;
    public final AtomicReference g;
    public final Object h = new Object();
    public boolean i = false;
    public PriorityQueue j;
    public q3 k;
    public final AtomicLong l;
    public long m;
    public final c6 n;
    public boolean o = true;
    public x p;
    public final U5 q;

    public C3(N2 n22) {
        super(n22);
        this.q = new c4(this);
        this.g = new AtomicReference();
        this.k = q3.c;
        this.m = -1L;
        this.l = new AtomicLong(0L);
        this.n = new c6(n22);
    }

    public static /* synthetic */ void K(C3 c32, q3 q32, long l8, boolean bl, boolean bl2) {
        c32.n();
        c32.v();
        q3 q33 = c32.i().J();
        if (l8 <= c32.m && q3.k(q33.b(), q32.b())) {
            c32.j().J().b("Dropped out-of-date consent setting, proposed settings", q32);
            return;
        }
        if (c32.i().A(q32)) {
            c32.m = l8;
            c32.t().U(bl);
            if (bl2) {
                c32.t().Q(new AtomicReference());
                return;
            }
        } else {
            c32.j().J().b("Lower precedence consent source ignored, proposed source", q32.b());
        }
    }

    public static /* synthetic */ void L(C3 c32, q3 q32, q3 q33) {
        q3.a a8 = q3.a.q;
        q3.a a9 = q3.a.p;
        boolean bl = q32.m(q33, a8, a9);
        boolean bl2 = q32.r(q33, a8, a9);
        if (bl || bl2) {
            c32.p().I();
        }
    }

    public static /* synthetic */ void v0(C3 c32) {
        c32.t0();
    }

    @Override
    public final boolean A() {
        return false;
    }

    public final ArrayList C(String string2, String string3) {
        if (this.e().J()) {
            this.j().G().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (f.a()) {
            this.j().G().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.e().v(atomicReference, 5000L, "get conditional user properties", new b4(this, atomicReference, null, string2, string3));
        string2 = (List)atomicReference.get();
        if (string2 == null) {
            this.j().G().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return S5.t0((List)string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Map D(String object, String string2, boolean bl) {
        block7 : {
            block6 : {
                block5 : {
                    if (!this.e().J()) break block5;
                    object = this.j().G();
                    string2 = "Cannot get user properties from analytics worker thread";
                    break block6;
                }
                if (!f.a()) break block7;
                object = this.j().G();
                string2 = "Cannot get user properties from main thread";
            }
            object.a(string2);
            return Collections.emptyMap();
        }
        Object object2 = new AtomicReference();
        this.a.e().v((AtomicReference)object2, 5000L, "get user properties", new a4(this, (AtomicReference)object2, null, (String)object, string2, bl));
        string2 = (List)object2.get();
        if (string2 == null) {
            this.j().G().b("Timed out waiting for handle get user properties, includeInternal", bl);
            return Collections.emptyMap();
        }
        object = new a(string2.size());
        string2 = string2.iterator();
        while (string2.hasNext()) {
            object2 = (R5)string2.next();
            Object object3 = object2.a();
            if (object3 == null) continue;
            object.put((Object)object2.p, object3);
        }
        return object;
    }

    public final void E(long l8, boolean bl) {
        this.n();
        this.v();
        this.j().F().a("Resetting analytics data (FE)");
        m3 m32 = this.u();
        m32.n();
        m32.f.b();
        if (s7.a() && this.f().s(K.x0)) {
            this.p().I();
        }
        boolean bl2 = this.a.p();
        m32 = this.i();
        m32.e.b(l8);
        if (!TextUtils.isEmpty((CharSequence)m32.i().v.a())) {
            m32.v.b(null);
        }
        if (G6.a() && m32.f().s(K.q0)) {
            m32.p.b(0L);
        }
        m32.q.b(0L);
        if (!m32.f().R()) {
            m32.E(bl2 ^ true);
        }
        m32.w.b(null);
        m32.x.b(0L);
        m32.y.b(null);
        if (bl) {
            this.t().a0();
        }
        if (G6.a() && this.f().s(K.q0)) {
            this.u().e.a();
        }
        this.o = bl2 ^ true;
    }

    public final void F(z z8) {
        this.e().D(new j4(this, z8));
    }

    public final void G(q3 q32) {
        this.n();
        boolean bl = q32.y() && q32.x() || this.t().e0();
        if (bl != this.a.q()) {
            this.a.w(bl);
            q32 = this.i().L();
            if (!bl || q32 == null || q32.booleanValue()) {
                this.S(bl, false);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void H(q3 object, long l8) {
        int n8;
        boolean bl;
        boolean bl2;
        q3 q32;
        boolean bl3;
        block11 : {
            block10 : {
                this.v();
                n8 = object.b();
                if (n8 != -10 && object.s() == null && object.u() == null) {
                    this.j().M().a("Discarding empty consent settings");
                    return;
                }
                Object object2 = this.h;
                // MONITORENTER : object2
                q32 = this.k;
                bl3 = q3.k(n8, q32.b());
                bl2 = false;
                bl = false;
                if (!bl3) break block10;
                boolean bl4 = object.t(this.k);
                bl3 = bl;
                if (object.y()) {
                    bl3 = bl;
                    if (!this.k.y()) {
                        bl3 = true;
                    }
                }
                this.k = object = object.o(this.k);
                bl = bl3;
                bl2 = true;
                bl3 = bl4;
                // MONITOREXIT : object2
                break block11;
            }
            bl3 = bl = false;
        }
        if (!bl2) {
            this.j().J().b("Ignoring lower-priority consent settings, proposed settings", object);
            return;
        }
        long l9 = this.l.getAndIncrement();
        if (bl3) {
            this.T(null);
            this.e().G(new i4(this, (q3)object, l8, l9, bl, q32));
            return;
        }
        object = new l4(this, (q3)object, l9, bl, q32);
        if (n8 != 30 && n8 != -10) {
            this.e().D((Runnable)object);
            return;
        }
        this.e().G((Runnable)object);
    }

    public final void I(u3 u32) {
        this.v();
        A2.n.i(u32);
        if (!this.e.add((Object)u32)) {
            this.j().L().a("OnEventListener already registered");
        }
    }

    public final void J(v3 v32) {
        v3 v33;
        this.n();
        this.v();
        if (v32 != null && v32 != (v33 = this.d)) {
            boolean bl = v33 == null;
            A2.n.m(bl, "EventInterceptor already set.");
        }
        this.d = v32;
    }

    public final /* synthetic */ void O(Bundle bundle) {
        if (bundle == null) {
            this.i().y.b(new Bundle());
            return;
        }
        Bundle bundle2 = this.i().y.a();
        for (String string2 : bundle.keySet()) {
            Object object = bundle.get(string2);
            if (!(object == null || object instanceof String || object instanceof Long || object instanceof Double)) {
                this.k();
                if (S5.g0(object)) {
                    this.k();
                    S5.M(this.q, 27, null, null, 0);
                }
                this.j().M().c("Invalid default event parameter type. Name, value", string2, object);
                continue;
            }
            if (S5.H0(string2)) {
                this.j().M().b("Invalid default event parameter name. Name", string2);
                continue;
            }
            if (object == null) {
                bundle2.remove(string2);
                continue;
            }
            if (!this.k().k0("param", string2, this.f().t(this.a.B().F()), object)) continue;
            this.k().R(bundle2, string2, object);
        }
        this.k();
        if (S5.f0(bundle2, this.f().E())) {
            this.k();
            S5.M(this.q, 26, null, null, 0);
            this.j().M().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.i().y.b(bundle2);
        this.t().K(bundle2);
    }

    public final void P(Bundle bundle, int n8, long l8) {
        this.v();
        Object object = q3.i(bundle);
        if (object != null) {
            this.j().M().b("Ignoring invalid consent setting", object);
            this.j().M().a("Valid consent values are 'granted', 'denied'");
        }
        object = q3.d(bundle, n8);
        if (n6.a() && this.f().s(K.S0)) {
            if (object.z()) {
                this.H((q3)object, l8);
            }
            if ((object = z.b(bundle, n8)).j()) {
                this.F((z)object);
            }
            if ((bundle = z.d(bundle)) != null) {
                this.b0("app", "allow_personalized_ads", bundle.toString(), false);
            }
            return;
        }
        this.H((q3)object, l8);
    }

    public final void Q(Bundle bundle, long l8) {
        A2.n.i((Object)bundle);
        bundle = new Bundle(bundle);
        if (!TextUtils.isEmpty((CharSequence)bundle.getString("app_id"))) {
            this.j().L().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle.remove("app_id");
        A2.n.i((Object)bundle);
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
        A2.n.e(bundle.getString("name"));
        A2.n.e(bundle.getString("origin"));
        A2.n.i(bundle.get("value"));
        bundle.putLong("creation_timestamp", l8);
        String string2 = bundle.getString("name");
        Object object = bundle.get("value");
        if (this.k().q0(string2) != 0) {
            this.j().G().b("Invalid conditional user property name", this.h().g(string2));
            return;
        }
        if (this.k().w(string2, object) != 0) {
            this.j().G().c("Invalid conditional user property value", this.h().g(string2), object);
            return;
        }
        Object object2 = this.k().A0(string2, object);
        if (object2 == null) {
            this.j().G().c("Unable to normalize conditional user property value", this.h().g(string2), object);
            return;
        }
        n3.b(bundle, object2);
        l8 = bundle.getLong("trigger_timeout");
        if (!(TextUtils.isEmpty((CharSequence)bundle.getString("trigger_event_name")) || l8 <= 15552000000L && l8 >= 1L)) {
            this.j().G().c("Invalid conditional user property timeout", this.h().g(string2), l8);
            return;
        }
        l8 = bundle.getLong("time_to_live");
        if (l8 <= 15552000000L && l8 >= 1L) {
            this.e().D(new Z3(this, bundle));
            return;
        }
        this.j().G().c("Invalid conditional user property time to live", this.h().g(string2), l8);
    }

    public final void R(Boolean bl) {
        this.v();
        this.e().D(new g4(this, bl));
    }

    public final void S(Boolean bl, boolean bl2) {
        this.n();
        this.v();
        this.j().F().b("Setting app measurement enabled (FE)", (Object)bl);
        this.i().v(bl);
        if (bl2) {
            this.i().C(bl);
        }
        if (this.a.q() || bl != null && !bl.booleanValue()) {
            this.t0();
        }
    }

    public final void T(String string2) {
        this.g.set((Object)string2);
    }

    public final void U(String string2, String string3, long l8, Bundle bundle) {
        this.n();
        boolean bl = this.d == null || S5.H0(string3);
        this.V(string2, string3, l8, bundle, true, bl, true, null);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void V(String string2, String string3, long l8, Bundle object, boolean bl, boolean bl2, boolean bl3, String string4) {
        Object object2;
        boolean bl4;
        int n10;
        int n8;
        int n9;
        Object object3;
        block42 : {
            A2.n.e(string2);
            A2.n.i(object);
            this.n();
            this.v();
            if (!this.a.p()) {
                this.j().F().a("Event not sent since app measurement is disabled");
                return;
            }
            object3 = this.p().H();
            if (object3 != null && !object3.contains((Object)string3)) {
                this.j().F().c("Dropping non-safelisted event. event name, origin", string3, string2);
                return;
            }
            bl4 = this.f;
            n8 = 0;
            n9 = 0;
            if (!bl4) {
                this.f = true;
                bl4 = this.a.t();
                object3 = !bl4 ? Class.forName((String)"com.google.android.gms.tagmanager.TagManagerService", (boolean)true, (ClassLoader)this.a().getClassLoader()) : Class.forName((String)"com.google.android.gms.tagmanager.TagManagerService");
                {
                    catch (ClassNotFoundException classNotFoundException) {}
                }
                try {
                    object3.getDeclaredMethod("initialize", new Class[]{Context.class}).invoke((Object)null, new Object[]{this.a()});
                }
                catch (Exception exception) {
                    this.j().L().b("Failed to invoke Tag Manager's initialize() method", (Object)exception);
                    break block42;
                }
                this.j().J().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals((Object)string3)) {
            if (object.containsKey("gclid")) {
                this.a0("auto", "_lgclid", object.getString("gclid"), this.b().a());
            }
            if (H6.a() && this.f().s(K.Z0) && object.containsKey("gbraid")) {
                this.a0("auto", "_gbraid", object.getString("gbraid"), this.b().a());
            }
        }
        if (bl && S5.L0(string3)) {
            this.k().Q((Bundle)object, this.i().y.a());
        }
        if (!bl3 && !"_iap".equals((Object)string3)) {
            object3 = this.a.L();
            bl4 = object3.C0("event", string3);
            n10 = 2;
            if (bl4) {
                if (!object3.o0("event", r3.a, r3.b, string3)) {
                    n10 = 13;
                } else if (object3.i0("event", 40, string3)) {
                    n10 = 0;
                }
            }
            if (n10 != 0) {
                this.j().H().b("Invalid public event name. Event will not be logged (FE)", this.h().c(string3));
                this.a.L();
                string2 = S5.I(string3, 40, true);
                n8 = n9;
                if (string3 != null) {
                    n8 = string3.length();
                }
                this.a.L();
                S5.M(this.q, n10, "_ev", string2, n8);
                return;
            }
        }
        if ((object3 = this.s().C(false)) != null && !object.containsKey("_sc")) {
            object3.d = true;
        }
        bl4 = bl && !bl3;
        S5.L((w4)object3, (Bundle)object, bl4);
        bl4 = "am".equals((Object)string2);
        boolean bl5 = S5.H0(string3);
        if (bl && this.d != null && !bl5 && !bl4) {
            this.j().F().c("Passing event to registered event handler (FE)", this.h().c(string3), this.h().b((Bundle)object));
            A2.n.i(this.d);
            this.d.a(string2, string3, (Bundle)object, l8);
            return;
        }
        if (!this.a.s()) {
            return;
        }
        n9 = this.k().v(string3);
        if (n9 != 0) {
            this.j().H().b("Invalid event name. Event will not be logged (FE)", this.h().c(string3));
            this.k();
            string2 = S5.I(string3, 40, true);
            n10 = n8;
            if (string3 != null) {
                n10 = string3.length();
            }
            this.a.L();
            S5.N(this.q, string4, n9, "_ev", string2, n10);
            return;
        }
        object3 = E2.f.c("_o", "_sn", "_sc", "_si");
        object3 = this.k().F(string4, string3, (Bundle)object, (List)object3, bl3);
        A2.n.i(object3);
        if (this.s().C(false) != null && "_ae".equals((Object)string3)) {
            object = this.u().f;
            long l9 = object.d.b().b();
            long l10 = l9 - object.b;
            object.b = l9;
            if (l10 > 0L) {
                this.k().P((Bundle)object3, l10);
            }
        }
        if (t6.a() && this.f().s(K.p0)) {
            if (!"auto".equals((Object)string2) && "_ssr".equals((Object)string3)) {
                object2 = this.k();
                object = object3.getString("_ffr");
                if (n.a((String)object)) {
                    object = null;
                } else if (object != null) {
                    object = object.trim();
                }
                if (V5.a(object, object2.i().v.a())) {
                    object2.j().F().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                object2.i().v.b((String)object);
            } else if ("_ae".equals((Object)string3) && !TextUtils.isEmpty((CharSequence)(object = this.k().i().v.a()))) {
                object3.putString("_ffr", (String)object);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(object3);
        bl = this.f().s(K.Q0) ? this.u().F() : this.i().s.b();
        if (this.i().p.a() > 0L && this.i().y(l8) && bl) {
            this.j().K().a("Current session is expired, remove the session number, ID, and engagement time");
            this.a0("auto", "_sid", null, this.b().a());
            this.a0("auto", "_sno", null, this.b().a());
            this.a0("auto", "_se", null, this.b().a());
            this.i().q.b(0L);
        }
        if (object3.getLong("extend_session", 0L) == 1L) {
            this.j().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
            this.a.K().e.b(l8, true);
        }
        object = new ArrayList((Collection)object3.keySet());
        Collections.sort((List)object);
        n9 = object.size();
        n10 = 0;
        while (n10 < n9) {
            object2 = object.get(n10);
            n8 = n10 + 1;
            object2 = (String)object2;
            n10 = n8;
            if (object2 == null) continue;
            this.k();
            Bundle[] arrbundle = S5.x0(object3.get((String)object2));
            n10 = n8;
            if (arrbundle == null) continue;
            object3.putParcelableArray((String)object2, (Parcelable[])arrbundle);
            n10 = n8;
        }
        n10 = 0;
        do {
            if (n10 >= arrayList.size()) {
                if (this.s().C(false) == null) return;
                if (!"_ae".equals((Object)string3)) return;
                this.u().E(true, true, this.b().b());
                return;
            }
            object2 = (Bundle)arrayList.get(n10);
            object3 = n10 != 0 ? "_ep" : string3;
            object2.putString("_o", string2);
            object = object2;
            if (bl2) {
                object = this.k().r0((Bundle)object2);
            }
            object3 = new I((String)object3, new D((Bundle)object), string2, l8);
            this.t().D((I)object3, string4);
            if (!bl4) {
                object3 = this.e.iterator();
                while (object3.hasNext()) {
                    ((u3)object3.next()).a(string2, string3, new Bundle((Bundle)object), l8);
                }
            }
            ++n10;
        } while (true);
    }

    public final void W(String string2, String string3, long l8, Object object) {
        this.e().D(new T3(this, string2, string3, object, l8));
    }

    public final void X(String string2, String string3, Bundle bundle) {
        long l8 = this.b().a();
        A2.n.e(string2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", string2);
        bundle2.putLong("creation_timestamp", l8);
        if (string3 != null) {
            bundle2.putString("expired_event_name", string3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.e().D(new Y3(this, bundle2));
    }

    public final void Y(String string2, String string3, Bundle bundle, String string4) {
        this.m();
        this.x0(string2, string3, this.b().a(), bundle, false, true, true, string4);
    }

    public final void Z(String string2, String string3, Bundle bundle, boolean bl, boolean bl2, long l8) {
        if (string2 == null) {
            string2 = "app";
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!(string3 == "screen_view" || string3 != null && string3.equals((Object)"screen_view"))) {
            boolean bl3 = !bl2 || this.d == null || S5.H0(string3);
            this.x0(string2, string3, l8, bundle, bl2, bl3, bl, null);
            return;
        }
        this.s().O(bundle, l8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a0(String var1_1, String var2_2, Object var3_3, long var4_4) {
        block5 : {
            A2.n.e((String)var1_1);
            A2.n.e((String)var2_2);
            this.n();
            this.v();
            if (!"allow_personalized_ads".equals(var2_2)) ** GOTO lbl-1000
            if (!(var3_3 instanceof String) || TextUtils.isEmpty((CharSequence)(var8_5 = (String)var3_3))) break block5;
            var3_3 = var8_5.toLowerCase(Locale.ENGLISH);
            var2_2 = "false";
            var6_6 = "false".equals(var3_3) != false ? 1L : 0L;
            var3_3 = var6_6;
            var8_5 = this.i().m;
            if (var3_3.longValue() == 1L) {
                var2_2 = "true";
            }
            var8_5.b((String)var2_2);
            var2_2 = var3_3;
            ** GOTO lbl21
        }
        if (var3_3 == null) {
            this.i().m.b("unset");
            var2_2 = var3_3;
lbl21: // 2 sources:
            var3_3 = "_npa";
            var8_5 = var2_2;
        } else lbl-1000: // 2 sources:
        {
            var8_5 = var3_3;
            var3_3 = var2_2;
        }
        if (!this.a.p()) {
            this.j().K().a("User property not set since app measurement is disabled");
            return;
        }
        if (!this.a.s()) {
            return;
        }
        var1_1 = new R5((String)var3_3, var4_4, var8_5, (String)var1_1);
        this.t().J((R5)var1_1);
    }

    public final void b0(String string2, String string3, Object object, boolean bl) {
        this.c0(string2, string3, object, bl, this.b().a());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void c0(String var1_1, String var2_2, Object var3_3, boolean var4_4, long var5_5) {
        block15 : {
            block14 : {
                block13 : {
                    block12 : {
                        var10_6 = var1_1;
                        if (var1_1 == null) {
                            var10_6 = "app";
                        }
                        var8_7 = 0;
                        var9_8 = 0;
                        if (!var4_4) break block12;
                        var7_9 = this.k().q0(var2_2);
                        break block13;
                    }
                    var1_1 = this.k();
                    if (!var1_1.C0("user property", var2_2)) ** GOTO lbl-1000
                    if (!var1_1.n0("user property", s3.a, var2_2)) {
                        var7_9 = 15;
                    } else if (!var1_1.i0("user property", 24, var2_2)) lbl-1000: // 2 sources:
                    {
                        var7_9 = 6;
                    } else {
                        var7_9 = 0;
                    }
                }
                if (var7_9 != 0) {
                    this.k();
                    var1_1 = S5.I(var2_2, 24, true);
                    var8_7 = var9_8;
                    if (var2_2 != null) {
                        var8_7 = var2_2.length();
                    }
                    this.a.L();
                    S5.M(this.q, var7_9, "_ev", (String)var1_1, var8_7);
                    return;
                }
                if (var3_3 == null) {
                    this.W((String)var10_6, var2_2, var5_5, null);
                    return;
                }
                var9_8 = this.k().w(var2_2, var3_3);
                if (var9_8 == 0) {
                    var1_1 = this.k().A0(var2_2, var3_3);
                    if (var1_1 == null) return;
                    this.W((String)var10_6, var2_2, var5_5, var1_1);
                    return;
                }
                this.k();
                var1_1 = S5.I(var2_2, 24, true);
                if (var3_3 instanceof String) break block14;
                var7_9 = var8_7;
                if (!(var3_3 instanceof CharSequence)) break block15;
            }
            var7_9 = String.valueOf((Object)var3_3).length();
        }
        this.a.L();
        S5.M(this.q, var9_8, "_ev", (String)var1_1, var7_9);
    }

    public final /* synthetic */ void d0(List list) {
        this.n();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray sparseArray = this.i().H();
            for (v5 v52 : list) {
                if (z3.a(sparseArray, v52.q) && (Long)sparseArray.get(v52.q) >= v52.p) continue;
                this.s0().add((Object)v52);
            }
            this.r0();
        }
    }

    public final Boolean e0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean)this.e().v(atomicReference, 15000L, "boolean test flag value", new O3(this, atomicReference));
    }

    public final Double f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double)this.e().v(atomicReference, 15000L, "double test flag value", new h4(this, atomicReference));
    }

    public final Integer g0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer)this.e().v(atomicReference, 15000L, "int test flag value", new e4(this, atomicReference));
    }

    public final Long h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long)this.e().v(atomicReference, 15000L, "long test flag value", new f4(this, atomicReference));
    }

    public final String i0() {
        return (String)this.g.get();
    }

    public final String j0() {
        w4 w42 = this.a.I().P();
        if (w42 != null) {
            return w42.b;
        }
        return null;
    }

    public final String k0() {
        w4 w42 = this.a.I().P();
        if (w42 != null) {
            return w42.a;
        }
        return null;
    }

    public final String l0() {
        if (this.a.M() != null) {
            return this.a.M();
        }
        try {
            String string2 = new H2(this.a(), this.a.P()).b("google_app_id");
            return string2;
        }
        catch (IllegalStateException illegalStateException) {
            this.a.j().G().b("getGoogleAppId failed with exception", (Object)illegalStateException);
            return null;
        }
    }

    public final String m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String)this.e().v(atomicReference, 15000L, "String test flag value", new W3(this, atomicReference));
    }

    public final void n0() {
        Object object;
        this.n();
        this.v();
        if (!this.a.s()) {
            return;
        }
        if (this.f().s(K.k0) && (object = this.f().F("google_analytics_deferred_deep_link_enabled")) != null && object.booleanValue()) {
            this.j().F().a("Deferred Deep Link feature enabled.");
            this.e().D(new H3(this));
        }
        this.t().X();
        this.o = false;
        object = this.i().N();
        if (!TextUtils.isEmpty((CharSequence)object)) {
            this.g().o();
            if (!object.equals((Object)Build.VERSION.RELEASE)) {
                Bundle bundle = new Bundle();
                bundle.putString("_po", (String)object);
                this.z0("auto", "_ou", bundle);
            }
        }
    }

    public final void o0() {
        if (this.a().getApplicationContext() instanceof Application && this.c != null) {
            ((Application)this.a().getApplicationContext()).unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this.c);
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
            if (f.a()) {
                this.j().G().a("Cannot get trigger URIs from main thread");
                return;
            }
            this.v();
            this.j().K().a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            this.e().v(atomicReference, 5000L, "get trigger URIs", new D3(this, atomicReference));
            atomicReference = (List)atomicReference.get();
            if (atomicReference == null) {
                this.j().G().a("Timed out waiting for get trigger URIs");
                return;
            }
            this.e().D(new G3(this, (List)atomicReference));
        }
    }

    public final void q0() {
        this.n();
        if (this.i().t.b()) {
            this.j().F().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long l8 = this.i().u.a();
        this.i().u.b(1L + l8);
        if (l8 >= 5L) {
            this.j().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            this.i().t.a(true);
            return;
        }
        if (n6.a() && this.f().s(K.U0)) {
            if (this.p == null) {
                this.p = new V3(this, this.a);
            }
            this.p.b(0L);
            return;
        }
        this.a.u();
    }

    public final void r0() {
        this.n();
        if (!this.s0().isEmpty()) {
            if (this.i) {
                return;
            }
            v5 v52 = (v5)this.s0().poll();
            if (v52 == null) {
                return;
            }
            Object object = this.k().Q0();
            if (object == null) {
                return;
            }
            this.i = true;
            this.j().K().b("Registering trigger URI", v52.o);
            object = object.c(Uri.parse((String)v52.o));
            if (object == null) {
                this.i = false;
                this.s0().add((Object)v52);
                return;
            }
            SparseArray sparseArray = this.i().H();
            sparseArray.put(v52.q, (Object)v52.p);
            Object object2 = this.i();
            int[] arrn = new int[sparseArray.size()];
            long[] arrl = new long[sparseArray.size()];
            for (int i8 = 0; i8 < sparseArray.size(); ++i8) {
                arrn[i8] = sparseArray.keyAt(i8);
                arrl[i8] = (Long)sparseArray.valueAt(i8);
            }
            sparseArray = new Bundle();
            sparseArray.putIntArray("uriSources", arrn);
            sparseArray.putLongArray("uriTimestamps", arrl);
            object2.n.b((Bundle)sparseArray);
            object2 = new M3(this);
            c.a((b3.e)object, new Q3(this, v52), (Executor)object2);
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
        String string2 = this.i().m.a();
        if (string2 != null) {
            if ("unset".equals((Object)string2)) {
                this.a0("app", "_npa", null, this.b().a());
            } else {
                long l8 = "true".equals((Object)string2) ? 1L : 0L;
                this.a0("app", "_npa", l8, this.b().a());
            }
        }
        if (this.a.p() && this.o) {
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

    public final void u0(u3 u32) {
        this.v();
        A2.n.i(u32);
        if (!this.e.remove((Object)u32)) {
            this.j().L().a("OnEventListener had not been registered");
        }
    }

    public final void w0(Bundle bundle) {
        this.Q(bundle, this.b().a());
    }

    public final void x0(String string2, String string3, long l8, Bundle bundle, boolean bl, boolean bl2, boolean bl3, String string4) {
        bundle = S5.E(bundle);
        this.e().D(new U3(this, string2, string3, l8, bundle, bl, bl2, bl3, string4));
    }

    public final void y0(String string2, String string3, Bundle bundle) {
        this.Z(string2, string3, bundle, true, true, this.b().a());
    }

    public final void z0(String string2, String string3, Bundle bundle) {
        this.n();
        this.U(string2, string3, this.b().a(), bundle);
    }
}

