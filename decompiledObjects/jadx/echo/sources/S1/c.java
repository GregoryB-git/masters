package S1;

import O1.P;
import Q1.c;
import Q1.k;
import S1.c;
import W5.B;
import W5.w;
import android.util.Log;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import l6.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.F;
import x1.K;

/* loaded from: classes.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: b, reason: collision with root package name */
    public static final a f5831b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f5832c = c.class.getCanonicalName();

    /* renamed from: d, reason: collision with root package name */
    public static c f5833d;

    /* renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f5834a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public static final int e(Q1.c cVar, Q1.c o22) {
            Intrinsics.checkNotNullExpressionValue(o22, "o2");
            return cVar.b(o22);
        }

        public static final void f(List validReports, K response) {
            Intrinsics.checkNotNullParameter(validReports, "$validReports");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.b() == null) {
                    JSONObject d7 = response.d();
                    if (Intrinsics.a(d7 == null ? null : Boolean.valueOf(d7.getBoolean("success")), Boolean.TRUE)) {
                        Iterator it = validReports.iterator();
                        while (it.hasNext()) {
                            ((Q1.c) it.next()).a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        public final synchronized void c() {
            try {
                if (C2146B.p()) {
                    d();
                }
                if (c.f5833d != null) {
                    Log.w(c.f5832c, "Already enabled!");
                } else {
                    c.f5833d = new c(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(c.f5833d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public final void d() {
            final List E6;
            l6.c g7;
            if (P.Z()) {
                return;
            }
            File[] p7 = k.p();
            ArrayList arrayList = new ArrayList(p7.length);
            for (File file : p7) {
                arrayList.add(c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Q1.c) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            E6 = w.E(arrayList2, new Comparator() { // from class: S1.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int e7;
                    e7 = c.a.e((Q1.c) obj2, (Q1.c) obj3);
                    return e7;
                }
            });
            JSONArray jSONArray = new JSONArray();
            g7 = f.g(0, Math.min(E6.size(), 5));
            Iterator it = g7.iterator();
            while (it.hasNext()) {
                jSONArray.put(E6.get(((B) it).b()));
            }
            k kVar = k.f4344a;
            k.s("crash_reports", jSONArray, new F.b() { // from class: S1.b
                @Override // x1.F.b
                public final void a(K k7) {
                    c.a.f(E6, k7);
                }
            });
        }
    }

    public c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5834a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t7, Throwable e7) {
        Intrinsics.checkNotNullParameter(t7, "t");
        Intrinsics.checkNotNullParameter(e7, "e");
        if (k.j(e7)) {
            Q1.b.c(e7);
            c.a aVar = c.a.f4333a;
            c.a.b(e7, c.EnumC0081c.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f5834a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(t7, e7);
    }

    public /* synthetic */ c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, g gVar) {
        this(uncaughtExceptionHandler);
    }
}
