/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package S1;

import O1.P;
import Q1.c;
import Q1.k;
import S1.b;
import W5.B;
import W5.m;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import l6.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.K;
import x1.r;

public final class c
implements Thread.UncaughtExceptionHandler {
    public static final a b = new a(null);
    public static final String c = c.class.getCanonicalName();
    public static c d;
    public final Thread.UncaughtExceptionHandler a;

    public c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    public /* synthetic */ c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, g g8) {
        this(uncaughtExceptionHandler);
    }

    public static final /* synthetic */ void c(c c8) {
        d = c8;
    }

    public void uncaughtException(Thread thread, Throwable throwable) {
        Object object;
        Intrinsics.checkNotNullParameter((Object)thread, "t");
        Intrinsics.checkNotNullParameter((Object)throwable, "e");
        if (k.j(throwable)) {
            Q1.b.c(throwable);
            object = c.a.a;
            c.a.b(throwable, c.c.r).g();
        }
        if ((object = this.a) == null) {
            return;
        }
        object.uncaughtException(thread, throwable);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public static /* synthetic */ void a(List list, K k8) {
            a.f(list, k8);
        }

        public static /* synthetic */ int b(Q1.c c8, Q1.c c9) {
            return a.e(c8, c9);
        }

        public static final int e(Q1.c c8, Q1.c c9) {
            Intrinsics.checkNotNullExpressionValue(c9, "o2");
            return c8.b(c9);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static final void f(List list, K k8) {
            Intrinsics.checkNotNullParameter((Object)list, "$validReports");
            Intrinsics.checkNotNullParameter(k8, "response");
            try {
                if (k8.b() == null) {
                    k8 = (k8 = k8.d()) == null ? null : Boolean.valueOf((boolean)k8.getBoolean("success"));
                    if (!Intrinsics.a(k8, (Object)Boolean.TRUE)) return;
                    list = ((Iterable)list).iterator();
                    while (list.hasNext()) {
                        ((Q1.c)list.next()).a();
                    }
                }
                return;
            }
            catch (JSONException jSONException) {
                return;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void c() {
            synchronized (this) {
                try {
                    if (x1.B.p()) {
                        this.d();
                    }
                    if (d != null) {
                        Log.w((String)c, (String)"Already enabled!");
                        return;
                    }
                    c.c(new c(Thread.getDefaultUncaughtExceptionHandler(), null));
                    Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)d);
                    return;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }

        public final void d() {
            Object object2;
            if (P.Z()) {
                return;
            }
            ArrayList arrayList = k.p();
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
            arrayList = m.E((Iterable)arrayList, new S1.a());
            arrayList2 = new JSONArray();
            object2 = d.g(0, Math.min((int)arrayList.size(), (int)5)).iterator();
            while (object2.hasNext()) {
                arrayList2.put(arrayList.get(((B)object2).b()));
            }
            object2 = k.a;
            k.s("crash_reports", (JSONArray)arrayList2, new b((List)arrayList));
        }
    }

}

