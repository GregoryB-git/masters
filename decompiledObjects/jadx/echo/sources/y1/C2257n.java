package y1;

import O1.C;
import O1.C0458v;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import x1.C2146B;
import x1.F;
import x1.N;
import y1.C2259p;

/* renamed from: y1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2257n {

    /* renamed from: f, reason: collision with root package name */
    public static ScheduledFuture f21389f;

    /* renamed from: a, reason: collision with root package name */
    public static final C2257n f21384a = new C2257n();

    /* renamed from: b, reason: collision with root package name */
    public static final String f21385b = C2257n.class.getName();

    /* renamed from: c, reason: collision with root package name */
    public static final int f21386c = 100;

    /* renamed from: d, reason: collision with root package name */
    public static volatile C2249f f21387d = new C2249f();

    /* renamed from: e, reason: collision with root package name */
    public static final ScheduledExecutorService f21388e = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: g, reason: collision with root package name */
    public static final Runnable f21390g = new Runnable() { // from class: y1.h
        @Override // java.lang.Runnable
        public final void run() {
            C2257n.o();
        }
    };

    public static final void g(final C2244a accessTokenAppId, final C2248e appEvent) {
        if (T1.a.d(C2257n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "appEvent");
            f21388e.execute(new Runnable() { // from class: y1.i
                @Override // java.lang.Runnable
                public final void run() {
                    C2257n.h(C2244a.this, appEvent);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
        }
    }

    public static final void h(C2244a accessTokenAppId, C2248e appEvent) {
        if (T1.a.d(C2257n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "$appEvent");
            f21387d.a(accessTokenAppId, appEvent);
            if (C2259p.f21393b.e() != C2259p.b.EXPLICIT_ONLY && f21387d.d() > f21386c) {
                n(EnumC2234C.EVENT_THRESHOLD);
            } else if (f21389f == null) {
                f21389f = f21388e.schedule(f21390g, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
        }
    }

    public static final x1.F i(final C2244a accessTokenAppId, final C2239H appEvents, boolean z7, final C2236E flushState) {
        if (T1.a.d(C2257n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            String b7 = accessTokenAppId.b();
            O1.r q7 = C0458v.q(b7, false);
            F.c cVar = x1.F.f20890n;
            kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{b7}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            final x1.F A7 = cVar.A(null, format, null, null);
            A7.D(true);
            Bundle u7 = A7.u();
            if (u7 == null) {
                u7 = new Bundle();
            }
            u7.putString("access_token", accessTokenAppId.a());
            String d7 = C2237F.f21324b.d();
            if (d7 != null) {
                u7.putString("device_token", d7);
            }
            String k7 = C2262s.f21401c.k();
            if (k7 != null) {
                u7.putString("install_referrer", k7);
            }
            A7.G(u7);
            int e7 = appEvents.e(A7, C2146B.l(), q7 != null ? q7.n() : false, z7);
            if (e7 == 0) {
                return null;
            }
            flushState.c(flushState.a() + e7);
            A7.C(new F.b() { // from class: y1.k
                @Override // x1.F.b
                public final void a(x1.K k8) {
                    C2257n.j(C2244a.this, A7, appEvents, flushState, k8);
                }
            });
            return A7;
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
            return null;
        }
    }

    public static final void j(C2244a accessTokenAppId, x1.F postRequest, C2239H appEvents, C2236E flushState, x1.K response) {
        if (T1.a.d(C2257n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(postRequest, "$postRequest");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            Intrinsics.checkNotNullParameter(flushState, "$flushState");
            Intrinsics.checkNotNullParameter(response, "response");
            q(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
        }
    }

    public static final List k(C2249f appEventCollection, C2236E flushResults) {
        if (T1.a.d(C2257n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            boolean z7 = C2146B.z(C2146B.l());
            ArrayList arrayList = new ArrayList();
            for (C2244a c2244a : appEventCollection.f()) {
                C2239H c7 = appEventCollection.c(c2244a);
                if (c7 == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                x1.F i7 = i(c2244a, c7, z7, flushResults);
                if (i7 != null) {
                    arrayList.add(i7);
                    if (A1.d.f239a.f()) {
                        A1.g.l(i7);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
            return null;
        }
    }

    public static final void l(final EnumC2234C reason) {
        if (T1.a.d(C2257n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f21388e.execute(new Runnable() { // from class: y1.j
                @Override // java.lang.Runnable
                public final void run() {
                    C2257n.m(EnumC2234C.this);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
        }
    }

    public static final void m(EnumC2234C reason) {
        if (T1.a.d(C2257n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "$reason");
            n(reason);
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
        }
    }

    public static final void n(EnumC2234C reason) {
        if (T1.a.d(C2257n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f21387d.b(C2250g.a());
            try {
                C2236E u7 = u(reason, f21387d);
                if (u7 != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", u7.a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", u7.b());
                    Z.a.b(C2146B.l()).d(intent);
                }
            } catch (Exception e7) {
                Log.w(f21385b, "Caught unexpected exception while flushing app events: ", e7);
            }
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
        }
    }

    public static final void o() {
        if (T1.a.d(C2257n.class)) {
            return;
        }
        try {
            f21389f = null;
            if (C2259p.f21393b.e() != C2259p.b.EXPLICIT_ONLY) {
                n(EnumC2234C.TIMER);
            }
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
        }
    }

    public static final Set p() {
        if (T1.a.d(C2257n.class)) {
            return null;
        }
        try {
            return f21387d.f();
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
            return null;
        }
    }

    public static final void q(final C2244a accessTokenAppId, x1.F request, x1.K response, final C2239H appEvents, C2236E flushState) {
        String str;
        if (T1.a.d(C2257n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            x1.r b7 = response.b();
            String str2 = "Success";
            EnumC2235D enumC2235D = EnumC2235D.SUCCESS;
            boolean z7 = true;
            if (b7 != null) {
                if (b7.b() == -1) {
                    str2 = "Failed: No Connectivity";
                    enumC2235D = EnumC2235D.NO_CONNECTIVITY;
                } else {
                    kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
                    str2 = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), b7.toString()}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
                    enumC2235D = EnumC2235D.SERVER_ERROR;
                }
            }
            C2146B c2146b = C2146B.f20862a;
            if (C2146B.H(N.APP_EVENTS)) {
                try {
                    str = new JSONArray((String) request.w()).toString(2);
                    Intrinsics.checkNotNullExpressionValue(str, "{\n            val jsonArray = JSONArray(eventsJsonString)\n            jsonArray.toString(2)\n          }");
                } catch (JSONException unused) {
                    str = "<Can't encode events for debug logging>";
                }
                C.a aVar = O1.C.f3715e;
                N n7 = N.APP_EVENTS;
                String TAG = f21385b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                aVar.c(n7, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.q()), str2, str);
            }
            if (b7 == null) {
                z7 = false;
            }
            appEvents.b(z7);
            EnumC2235D enumC2235D2 = EnumC2235D.NO_CONNECTIVITY;
            if (enumC2235D == enumC2235D2) {
                C2146B.t().execute(new Runnable() { // from class: y1.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2257n.r(C2244a.this, appEvents);
                    }
                });
            }
            if (enumC2235D == EnumC2235D.SUCCESS || flushState.b() == enumC2235D2) {
                return;
            }
            flushState.d(enumC2235D);
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
        }
    }

    public static final void r(C2244a accessTokenAppId, C2239H appEvents) {
        if (T1.a.d(C2257n.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            C2258o.a(accessTokenAppId, appEvents);
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
        }
    }

    public static final void s() {
        if (T1.a.d(C2257n.class)) {
            return;
        }
        try {
            f21388e.execute(new Runnable() { // from class: y1.l
                @Override // java.lang.Runnable
                public final void run() {
                    C2257n.t();
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
        }
    }

    public static final void t() {
        if (T1.a.d(C2257n.class)) {
            return;
        }
        try {
            C2258o c2258o = C2258o.f21391a;
            C2258o.b(f21387d);
            f21387d = new C2249f();
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
        }
    }

    public static final C2236E u(EnumC2234C reason, C2249f appEventCollection) {
        if (T1.a.d(C2257n.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            C2236E c2236e = new C2236E();
            List k7 = k(appEventCollection, c2236e);
            if (!(!k7.isEmpty())) {
                return null;
            }
            C.a aVar = O1.C.f3715e;
            N n7 = N.APP_EVENTS;
            String TAG = f21385b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            aVar.c(n7, TAG, "Flushing %d events due to %s.", Integer.valueOf(c2236e.a()), reason.toString());
            Iterator it = k7.iterator();
            while (it.hasNext()) {
                ((x1.F) it.next()).k();
            }
            return c2236e;
        } catch (Throwable th) {
            T1.a.b(th, C2257n.class);
            return null;
        }
    }
}
