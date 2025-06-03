/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashSet
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package Q1;

import O1.P;
import O1.n;
import Q1.a;
import Q1.c;
import Q1.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.I;
import x1.J;
import x1.K;
import x1.r;

public final class b {
    public static final b a = new b();
    public static boolean b;

    public static /* synthetic */ void a(c c8, K k8) {
        b.f(c8, k8);
    }

    public static final void b() {
        b = true;
        if (B.p()) {
            a.e();
        }
    }

    public static final void c(Throwable object) {
        if (b && !b.d()) {
            if (object == null) {
                return;
            }
            HashSet hashSet = new HashSet();
            object = object.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(object, "e.stackTrace");
            for (Object object2 : object) {
                n n8 = n.a;
                object2 = object2.getClassName();
                Intrinsics.checkNotNullExpressionValue(object2, "it.className");
                object2 = n.d((String)object2);
                if (object2 == n.b.q) continue;
                n.c((n.b)((Object)object2));
                hashSet.add((Object)object2.toString());
            }
            if (B.p() && hashSet.isEmpty() ^ true) {
                object = c.a.a;
                c.a.c(new JSONArray((Collection)hashSet)).g();
            }
        }
    }

    public static final boolean d() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void f(c c8, K k8) {
        Intrinsics.checkNotNullParameter(c8, "$instrumentData");
        Intrinsics.checkNotNullParameter(k8, "response");
        try {
            if (k8.b() == null) {
                k8 = (k8 = k8.d()) == null ? null : Boolean.valueOf((boolean)k8.getBoolean("success"));
                if (!Intrinsics.a(k8, (Object)Boolean.TRUE)) return;
                c8.a();
            }
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void e() {
        if (P.Z()) {
            return;
        }
        File[] arrfile = k.n();
        ArrayList arrayList = new ArrayList();
        int n8 = arrfile.length;
        int n9 = 0;
        do {
            int n10;
            if (n9 < n8) {
                Object object = arrfile[n9];
                n10 = n9 + 1;
                object = c.a.d((File)object);
                n9 = n10;
                if (!object.f()) continue;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("crash_shield", (Object)object.toString());
                F.c c8 = F.n;
                Object object2 = x.a;
                object2 = String.format((String)"%s/instruments", (Object[])Arrays.copyOf((Object[])new Object[]{B.m()}, (int)1));
                Intrinsics.checkNotNullExpressionValue(object2, "java.lang.String.format(format, *args)");
                arrayList.add((Object)c8.A(null, (String)object2, jSONObject, new a((c)object)));
                n9 = n10;
                continue;
            }
            if (arrayList.isEmpty()) {
                return;
            }
            new J((Collection)arrayList).q();
            return;
            catch (JSONException jSONException) {
                n9 = n10;
                continue;
            }
            break;
        } while (true);
    }
}

