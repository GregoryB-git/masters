// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import android.os.BaseBundle;
import org.json.JSONException;
import org.json.JSONArray;
import x1.N;
import java.util.Set;
import android.util.Log;
import java.io.Serializable;
import android.content.Intent;
import java.util.Iterator;
import A1.g;
import A1.d;
import java.util.ArrayList;
import java.util.List;
import O1.r;
import x1.B;
import android.os.Bundle;
import org.json.JSONObject;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import O1.v;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import x1.K;
import x1.F;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;

public final class n
{
    public static final n a;
    public static final String b;
    public static final int c;
    public static volatile f d;
    public static final ScheduledExecutorService e;
    public static ScheduledFuture f;
    public static final Runnable g;
    
    static {
        a = new n();
        b = n.class.getName();
        c = 100;
        n.d = new f();
        e = Executors.newSingleThreadScheduledExecutor();
        g = new h();
    }
    
    public static final void g(final a a, final e e) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(e, "appEvent");
            n.e.execute(new i(a, e));
        }
        finally {
            final Throwable t;
            T1.a.b(t, n.class);
        }
    }
    
    public static final void h(final a a, final e e) {
        if (T1.a.d(n.class)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(a, "$accessTokenAppId");
                Intrinsics.checkNotNullParameter(e, "$appEvent");
                n.d.a(a, e);
                if (p.b.e() != p.b.p && n.d.d() > n.c) {
                    n(C.s);
                    return;
                }
                if (n.f == null) {
                    n.f = n.e.schedule(n.g, 15L, TimeUnit.SECONDS);
                }
                return;
                final Throwable t;
                T1.a.b(t, n.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final F i(final a a, final H h, final boolean b, final E e) {
        boolean n = false;
        if (T1.a.d(n.class)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(a, "accessTokenAppId");
                Intrinsics.checkNotNullParameter(h, "appEvents");
                Intrinsics.checkNotNullParameter(e, "flushState");
                final String b2 = a.b();
                final r q = v.q(b2, false);
                final F.c n2 = F.n;
                final x a2 = x.a;
                final String format = String.format("%s/activities", Arrays.copyOf(new Object[] { b2 }, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                final F a3 = n2.A(null, format, null, null);
                a3.D(true);
                Bundle u;
                if ((u = a3.u()) == null) {
                    u = new Bundle();
                }
                ((BaseBundle)u).putString("access_token", a.a());
                final String d = y1.F.b.d();
                if (d != null) {
                    ((BaseBundle)u).putString("device_token", d);
                }
                final String k = s.c.k();
                if (k != null) {
                    ((BaseBundle)u).putString("install_referrer", k);
                }
                a3.G(u);
                if (q != null) {
                    n = q.n();
                }
                final int e2 = h.e(a3, B.l(), n, b);
                if (e2 == 0) {
                    return null;
                }
                e.c(e.a() + e2);
                a3.C((F.b)new k(a, a3, h, e));
                return a3;
                final Throwable t;
                T1.a.b(t, n.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final void j(final a a, final F f, final H h, final E e, final K k) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(f, "$postRequest");
            Intrinsics.checkNotNullParameter(h, "$appEvents");
            Intrinsics.checkNotNullParameter(e, "$flushState");
            Intrinsics.checkNotNullParameter(k, "response");
            q(a, f, k, h, e);
        }
        finally {
            final Throwable t;
            T1.a.b(t, n.class);
        }
    }
    
    public static final List k(final f f, final E e) {
        if (T1.a.d(n.class)) {
            return null;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(f, "appEventCollection");
                Intrinsics.checkNotNullParameter(e, "flushResults");
                final boolean z = B.z(B.l());
                final ArrayList<F> list = new ArrayList<F>();
                for (final a a : f.f()) {
                    final H c = f.c(a);
                    if (c == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    final F i = i(a, c, z, e);
                    if (i == null) {
                        continue;
                    }
                    list.add(i);
                    if (!A1.d.a.f()) {
                        continue;
                    }
                    A1.g.l(i);
                }
                return list;
                final Throwable t;
                T1.a.b(t, n.class);
                return null;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final void l(final C c) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(c, "reason");
            n.e.execute(new j(c));
        }
        finally {
            final Throwable t;
            T1.a.b(t, n.class);
        }
    }
    
    public static final void m(final C c) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(c, "$reason");
            n(c);
        }
        finally {
            final Throwable t;
            T1.a.b(t, n.class);
        }
    }
    
    public static final void n(final C c) {
        if (T1.a.d(n.class)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(c, "reason");
                n.d.b(y1.g.a());
                try {
                    final E u = u(c, n.d);
                    if (u != null) {
                        final Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                        intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", u.a());
                        intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", (Serializable)u.b());
                        Z.a.b(B.l()).d(intent);
                    }
                    return;
                }
                catch (Exception ex) {
                    Log.w(n.b, "Caught unexpected exception while flushing app events: ", (Throwable)ex);
                    return;
                }
                final Throwable t;
                T1.a.b(t, n.class);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static final void o() {
        if (T1.a.d(n.class)) {
            return;
        }
        Label_0037: {
            try {
                n.f = null;
                if (p.b.e() != p.b.p) {
                    n(C.p);
                    return;
                }
            }
            finally {
                break Label_0037;
            }
            return;
        }
        final Throwable t;
        T1.a.b(t, n.class);
    }
    
    public static final Set p() {
        if (T1.a.d(n.class)) {
            return null;
        }
        try {
            return n.d.f();
        }
        finally {
            final Throwable t;
            T1.a.b(t, n.class);
            return null;
        }
    }
    
    public static final void q(final a a, F q, final K k, final H h, final E e) {
        if (T1.a.d(n.class)) {
            return;
        }
        x1.r b = null;
        Object o;
        D d;
        boolean b2;
        B a2;
        String s;
        String string;
        O1.C.a e2;
        N s2;
        String b3;
        a a3;
        final Throwable t;
        Label_0303_Outer:Label_0245_Outer:
        while (true) {
            while (true) {
                Label_0318: {
                    while (true) {
                        try {
                            Intrinsics.checkNotNullParameter(a, "accessTokenAppId");
                            Intrinsics.checkNotNullParameter(q, "request");
                            Intrinsics.checkNotNullParameter(k, "response");
                            Intrinsics.checkNotNullParameter(h, "appEvents");
                            Intrinsics.checkNotNullParameter(e, "flushState");
                            b = k.b();
                            o = "Success";
                            d = D.o;
                            b2 = true;
                            if (b != null) {
                                if (b.b() == -1) {
                                    o = "Failed: No Connectivity";
                                    d = D.q;
                                }
                                else {
                                    o = x.a;
                                    o = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[] { k.toString(), b.toString() }, 2));
                                    Intrinsics.checkNotNullExpressionValue(o, "java.lang.String.format(format, *args)");
                                    d = D.p;
                                }
                            }
                            a2 = B.a;
                            if (B.H(N.s)) {
                                s = (String)q.w();
                            Block_9_Outer:
                                while (true) {
                                    try {
                                        string = new JSONArray(s).toString(2);
                                        Intrinsics.checkNotNullExpressionValue(string, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                                        while (true) {
                                            e2 = O1.C.e;
                                            s2 = N.s;
                                            b3 = n.b;
                                            Intrinsics.checkNotNullExpressionValue(b3, "TAG");
                                            e2.c(s2, b3, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(q.q()), o, string);
                                            break Label_0318;
                                            T1.a.b((Throwable)a3, n.class);
                                            return;
                                            string = "<Can't encode events for debug logging>";
                                            continue Label_0303_Outer;
                                        }
                                        // iftrue(Label_0302:, d == D.o || e.b() == q)
                                        // iftrue(Label_0278:, d != q)
                                        Block_11: {
                                            while (true) {
                                                while (true) {
                                                    break Block_11;
                                                    Label_0302: {
                                                        return;
                                                    }
                                                    B.t().execute(new m(a3, h));
                                                    continue Block_9_Outer;
                                                }
                                                h.b(b2);
                                                q = (F)D.q;
                                                continue Label_0245_Outer;
                                            }
                                        }
                                        e.d(d);
                                        return;
                                    }
                                    catch (JSONException ex) {}
                                    continue Label_0245_Outer;
                                }
                            }
                            break Label_0318;
                        }
                        finally {}
                        a3 = (a)t;
                        continue Label_0245_Outer;
                    }
                }
                if (b != null) {
                    continue;
                }
                b2 = false;
                continue;
            }
        }
    }
    
    public static final void r(final a a, final H h) {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(a, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(h, "$appEvents");
            o.a(a, h);
        }
        finally {
            final Throwable t;
            T1.a.b(t, n.class);
        }
    }
    
    public static final void s() {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            n.e.execute(new l());
        }
        finally {
            final Throwable t;
            T1.a.b(t, n.class);
        }
    }
    
    public static final void t() {
        if (T1.a.d(n.class)) {
            return;
        }
        try {
            final o a = o.a;
            o.b(n.d);
            n.d = new f();
        }
        finally {
            final Throwable t;
            T1.a.b(t, n.class);
        }
    }
    
    public static final E u(final C c, final f f) {
        if (T1.a.d(n.class)) {
            return null;
        }
        Label_0146: {
            E e;
            try {
                Intrinsics.checkNotNullParameter(c, "reason");
                Intrinsics.checkNotNullParameter(f, "appEventCollection");
                e = new E();
                final List k = k(f, e);
                if (!(((List<F>)k).isEmpty() ^ true)) {
                    return null;
                }
                final O1.C.a e2 = O1.C.e;
                final N s = N.s;
                final String b = n.b;
                Intrinsics.checkNotNullExpressionValue(b, "TAG");
                e2.c(s, b, "Flushing %d events due to %s.", e.a(), c.toString());
                final Iterator<F> iterator = k.iterator();
                while (iterator.hasNext()) {
                    iterator.next().k();
                }
            }
            finally {
                break Label_0146;
            }
            return e;
        }
        final Throwable t;
        T1.a.b(t, n.class);
        return null;
    }
}
