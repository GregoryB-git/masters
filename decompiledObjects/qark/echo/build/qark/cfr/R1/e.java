/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package R1;

import O1.P;
import Q1.c;
import Q1.k;
import R1.b;
import R1.c;
import R1.d;
import T1.a;
import W5.B;
import W5.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.K;
import x1.r;

public final class e {
    public static final e a = new e();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static /* synthetic */ int a(Q1.c c8, Q1.c c9) {
        return e.e(c8, c9);
    }

    public static /* synthetic */ void b(List list, K k8) {
        e.f(list, k8);
    }

    public static final void c() {
        synchronized (e.class) {
            Throwable throwable2;
            block12 : {
                block11 : {
                    boolean bl;
                    block10 : {
                        bl = a.d(e.class);
                        if (!bl) break block10;
                        return;
                    }
                    try {
                        bl = b.getAndSet(true);
                        if (!bl) break block11;
                    }
                    catch (Throwable throwable2) {
                        break block12;
                    }
                    return;
                }
                if (x1.B.p()) {
                    e.d();
                }
                b.d();
                return;
            }
            try {
                a.b(throwable2, e.class);
                return;
            }
            catch (Throwable throwable3) {
                throw throwable3;
            }
            finally {
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d() {
        if (a.d(e.class)) {
            return;
        }
        try {
            Object object2;
            if (P.Z()) {
                return;
            }
            ArrayList arrayList = k.l();
            ArrayList arrayList2 = new ArrayList(arrayList.length);
            int n8 = arrayList.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                arrayList2.add((Object)c.a.d(arrayList[i8]));
            }
            arrayList = new ArrayList();
            for (Object object2 : arrayList2) {
                if (!((Q1.c)object2).f()) continue;
                arrayList.add(object2);
            }
            arrayList = m.E((Iterable)arrayList, new c());
            arrayList2 = new JSONArray();
            object2 = l6.d.g(0, Math.min((int)arrayList.size(), (int)5)).iterator();
            do {
                if (!object2.hasNext()) {
                    object2 = k.a;
                    k.s("anr_reports", (JSONArray)arrayList2, new d((List)arrayList));
                    return;
                }
                arrayList2.put(arrayList.get(((B)object2).b()));
            } while (true);
        }
        catch (Throwable throwable) {}
        a.b(throwable, e.class);
    }

    public static final int e(Q1.c c8, Q1.c c9) {
        if (a.d(e.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullExpressionValue(c9, "o2");
            int n8 = c8.b(c9);
            return n8;
        }
        catch (Throwable throwable) {
            a.b(throwable, e.class);
            return 0;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void f(List list, K k8) {
        if (a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)list, "$validReports");
            Intrinsics.checkNotNullParameter(k8, "response");
            if (k8.b() != null) return;
            k8 = (k8 = k8.d()) == null ? null : Boolean.valueOf((boolean)k8.getBoolean("success"));
            if (!Intrinsics.a(k8, (Object)Boolean.TRUE)) return;
            list = ((Iterable)list).iterator();
            while (list.hasNext()) {
                ((Q1.c)list.next()).a();
            }
            return;
        }
        catch (Throwable throwable2) {}
        a.b(throwable2, e.class);
        return;
        catch (JSONException jSONException) {
            return;
        }
    }
}

