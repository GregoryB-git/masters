/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.util.Log
 *  java.io.Serializable
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ScheduledExecutorService
 *  java.util.concurrent.ScheduledFuture
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package y1;

import A1.d;
import O1.C;
import O1.v;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.K;
import x1.N;
import x1.r;
import y1.C;
import y1.D;
import y1.E;
import y1.F;
import y1.G;
import y1.H;
import y1.a;
import y1.e;
import y1.f;
import y1.g;
import y1.h;
import y1.i;
import y1.j;
import y1.k;
import y1.l;
import y1.m;
import y1.o;
import y1.p;
import y1.s;

public final class n {
    public static final n a = new n();
    public static final String b = n.class.getName();
    public static final int c = 100;
    public static volatile f d = new f();
    public static final ScheduledExecutorService e = Executors.newSingleThreadScheduledExecutor();
    public static ScheduledFuture f;
    public static final Runnable g;

    static {
        g = new h();
    }

    public static /* synthetic */ void a(a a8, x1.F f8, H h8, E e8, K k8) {
        n.j(a8, f8, h8, e8, k8);
    }

    public static /* synthetic */ void b(a a8, e e8) {
        n.h(a8, e8);
    }

    public static /* synthetic */ void c(C c8) {
        n.m(c8);
    }

    public static /* synthetic */ void d(a a8, H h8) {
        n.r(a8, h8);
    }

    public static /* synthetic */ void e() {
        n.o();
    }

    public static /* synthetic */ void f() {
        n.t();
    }

    public static final void g(a a8, e e8) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a8, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(e8, "appEvent");
            e.execute((Runnable)new i(a8, e8));
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, n.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void h(a a8, e e8) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a8, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(e8, "$appEvent");
            d.a(a8, e8);
            if (p.b.e() != p.b.p && d.d() > c) {
                n.n(C.s);
                return;
            }
            if (f == null) {
                f = e.schedule(g, 15L, TimeUnit.SECONDS);
            }
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, n.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final x1.F i(a a8, H h8, boolean bl, E e8) {
        boolean bl2 = false;
        if (T1.a.d(n.class)) {
            return null;
        }
        try {
            int n8;
            Intrinsics.checkNotNullParameter(a8, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(h8, "appEvents");
            Intrinsics.checkNotNullParameter(e8, "flushState");
            String string2 = a8.b();
            O1.r r8 = v.q(string2, false);
            Object object = x1.F.n;
            Object object2 = x.a;
            string2 = String.format((String)"%s/activities", (Object[])Arrays.copyOf((Object[])new Object[]{string2}, (int)1));
            Intrinsics.checkNotNullExpressionValue(string2, "java.lang.String.format(format, *args)");
            object2 = object.A(null, string2, null, null);
            object2.D(true);
            string2 = object2.u();
            object = string2;
            if (string2 == null) {
                object = new Bundle();
            }
            object.putString("access_token", a8.a());
            string2 = F.b.d();
            if (string2 != null) {
                object.putString("device_token", string2);
            }
            if ((string2 = s.c.k()) != null) {
                object.putString("install_referrer", string2);
            }
            object2.G((Bundle)object);
            if (r8 != null) {
                bl2 = r8.n();
            }
            if ((n8 = h8.e((x1.F)object2, B.l(), bl2, bl)) == 0) {
                return null;
            }
            e8.c(e8.a() + n8);
            object2.C(new k(a8, (x1.F)object2, h8, e8));
            return object2;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, n.class);
        return null;
    }

    public static final void j(a a8, x1.F f8, H h8, E e8, K k8) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a8, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(f8, "$postRequest");
            Intrinsics.checkNotNullParameter(h8, "$appEvents");
            Intrinsics.checkNotNullParameter(e8, "$flushState");
            Intrinsics.checkNotNullParameter(k8, "response");
            n.q(a8, f8, k8, h8, e8);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, n.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final List k(f f8, E e8) {
        if (T1.a.d(n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(f8, "appEventCollection");
            Intrinsics.checkNotNullParameter(e8, "flushResults");
            boolean bl = B.z(B.l());
            ArrayList arrayList = new ArrayList();
            Iterator iterator = f8.f().iterator();
            do {
                if (!iterator.hasNext()) {
                    return arrayList;
                }
                Object object = (a)iterator.next();
                H h8 = f8.c((a)object);
                if (h8 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if ((object = n.i((a)object, h8, bl, e8)) == null) continue;
                arrayList.add(object);
                if (!d.a.f()) continue;
                A1.g.l((x1.F)object);
            } while (true);
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, n.class);
        return null;
    }

    public static final void l(C c8) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)c8, "reason");
            e.execute((Runnable)new j(c8));
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, n.class);
            return;
        }
    }

    public static final void m(C c8) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)c8, "$reason");
            n.n(c8);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, n.class);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void n(C object) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(object, "reason");
            G g8 = g.a();
            d.b(g8);
            try {
                object = n.u((C)((Object)object), d);
                if (object == null) return;
            }
            catch (Exception exception) {
                Log.w((String)b, (String)"Caught unexpected exception while flushing app events: ", (Throwable)exception);
                return;
            }
            g8 = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
            g8.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", object.a());
            g8.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (Serializable)object.b());
            Z.a.b(B.l()).d((Intent)g8);
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, n.class);
    }

    public static final void o() {
        Throwable throwable2;
        block4 : {
            if (T1.a.d(n.class)) {
                return;
            }
            try {
                f = null;
                if (p.b.e() != p.b.p) {
                    n.n(C.p);
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            return;
        }
        T1.a.b(throwable2, n.class);
    }

    public static final Set p() {
        if (T1.a.d(n.class)) {
            return null;
        }
        try {
            Set set = d.f();
            return set;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, n.class);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void q(a a8, x1.F object, K object2, H h8, E e8) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a8, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(object, "request");
            Intrinsics.checkNotNullParameter(object2, "response");
            Intrinsics.checkNotNullParameter(h8, "appEvents");
            Intrinsics.checkNotNullParameter(e8, "flushState");
            r r8 = object2.b();
            Object object3 = "Success";
            D d8 = D.o;
            boolean bl = true;
            if (r8 != null) {
                if (r8.b() == -1) {
                    object3 = "Failed: No Connectivity";
                    d8 = D.q;
                } else {
                    object3 = x.a;
                    object3 = String.format((String)"Failed:\n  Response: %s\n  Error %s", (Object[])Arrays.copyOf((Object[])new Object[]{object2.toString(), r8.toString()}, (int)2));
                    Intrinsics.checkNotNullExpressionValue(object3, "java.lang.String.format(format, *args)");
                    d8 = D.p;
                }
            }
            object2 = B.a;
            if (B.H(N.s)) {
                block13 : {
                    object2 = (String)object.w();
                    try {
                        object2 = new JSONArray((String)object2).toString(2);
                        Intrinsics.checkNotNullExpressionValue(object2, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                        break block13;
                    }
                    catch (JSONException jSONException) {}
                    object2 = "<Can't encode events for debug logging>";
                }
                C.a a9 = O1.C.e;
                N n8 = N.s;
                String string2 = b;
                Intrinsics.checkNotNullExpressionValue(string2, "TAG");
                a9.c(n8, string2, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf((Object)object.q()), object3, object2);
            }
            if (r8 == null) {
                bl = false;
            }
            h8.b(bl);
            object = D.q;
            if (d8 == object) {
                B.t().execute((Runnable)new m(a8, h8));
            }
            if (d8 != D.o && e8.b() != object) {
                e8.d(d8);
            }
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, n.class);
    }

    public static final void r(a a8, H h8) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a8, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(h8, "$appEvents");
            o.a(a8, h8);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, n.class);
            return;
        }
    }

    public static final void s() {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            e.execute((Runnable)new l());
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, n.class);
            return;
        }
    }

    public static final void t() {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            o o8 = o.a;
            o.b(d);
            d = new f();
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, n.class);
            return;
        }
    }

    public static final E u(C c8, f f8) {
        Throwable throwable2;
        block5 : {
            block4 : {
                E e8;
                if (T1.a.d(n.class)) {
                    return null;
                }
                try {
                    Intrinsics.checkNotNullParameter((Object)c8, "reason");
                    Intrinsics.checkNotNullParameter(f8, "appEventCollection");
                    e8 = new E();
                    f8 = n.k(f8, e8);
                    if (!(((Collection)f8).isEmpty() ^ true)) break block4;
                    C.a a8 = O1.C.e;
                    N n8 = N.s;
                    String string2 = b;
                    Intrinsics.checkNotNullExpressionValue(string2, "TAG");
                    a8.c(n8, string2, "Flushing %d events due to %s.", e8.a(), c8.toString());
                    c8 = f8.iterator();
                    while (c8.hasNext()) {
                        ((x1.F)c8.next()).k();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return e8;
            }
            return null;
        }
        T1.a.b(throwable2, n.class);
        return null;
    }
}

