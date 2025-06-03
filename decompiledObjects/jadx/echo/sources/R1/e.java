package R1;

import O1.P;
import Q1.c;
import Q1.k;
import W5.B;
import W5.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import l6.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.F;
import x1.K;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f4533a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f4534b = new AtomicBoolean(false);

    public static final synchronized void c() {
        synchronized (e.class) {
            if (T1.a.d(e.class)) {
                return;
            }
            try {
                if (f4534b.getAndSet(true)) {
                    return;
                }
                if (C2146B.p()) {
                    d();
                }
                b.d();
            } catch (Throwable th) {
                T1.a.b(th, e.class);
            }
        }
    }

    public static final void d() {
        final List E6;
        l6.c g7;
        if (T1.a.d(e.class)) {
            return;
        }
        try {
            if (P.Z()) {
                return;
            }
            File[] l7 = k.l();
            ArrayList arrayList = new ArrayList(l7.length);
            for (File file : l7) {
                arrayList.add(c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Q1.c) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            E6 = w.E(arrayList2, new Comparator() { // from class: R1.c
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int e7;
                    e7 = e.e((Q1.c) obj2, (Q1.c) obj3);
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
            k.s("anr_reports", jSONArray, new F.b() { // from class: R1.d
                @Override // x1.F.b
                public final void a(K k7) {
                    e.f(E6, k7);
                }
            });
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }

    public static final int e(Q1.c cVar, Q1.c o22) {
        if (T1.a.d(e.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullExpressionValue(o22, "o2");
            return cVar.b(o22);
        } catch (Throwable th) {
            T1.a.b(th, e.class);
            return 0;
        }
    }

    public static final void f(List validReports, K response) {
        if (T1.a.d(e.class)) {
            return;
        }
        try {
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
        } catch (Throwable th) {
            T1.a.b(th, e.class);
        }
    }
}
