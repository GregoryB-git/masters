/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package U1;

import O1.P;
import Q1.k;
import U1.a;
import U1.b;
import U1.c;
import U1.d;
import W5.m;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.K;
import x1.r;

public final class e {
    public static final e a = new e();

    public static /* synthetic */ void a(ArrayList arrayList, K k8) {
        e.j(arrayList, k8);
    }

    public static /* synthetic */ boolean b(File file, String string2) {
        return e.f(file, string2);
    }

    public static /* synthetic */ int c(a a8, a a9) {
        return e.i(a8, a9);
    }

    public static final void d() {
        if (B.p()) {
            e.h();
        }
    }

    public static final File[] e() {
        File[] arrfile = k.f();
        if (arrfile == null) {
            return new File[0];
        }
        arrfile = arrfile.listFiles((FilenameFilter)new d());
        Intrinsics.checkNotNullExpressionValue(arrfile, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return arrfile;
    }

    public static final boolean f(File object, String string2) {
        Intrinsics.checkNotNullExpressionValue(string2, "name");
        object = x.a;
        object = String.format((String)"^%s[0-9]+.json$", (Object[])Arrays.copyOf((Object[])new Object[]{"error_log_"}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return new Regex((String)object).b(string2);
    }

    public static final void g(String string2) {
        try {
            new a(string2).e();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final void h() {
        Object object;
        if (P.Z()) {
            return;
        }
        JSONArray jSONArray = e.e();
        ArrayList arrayList = new ArrayList();
        int n8 = jSONArray.length;
        int n9 = 0;
        int n10 = 0;
        while (n10 < n8) {
            object = jSONArray[n10];
            int n11 = n10 + 1;
            object = new a((File)object);
            n10 = n11;
            if (!object.d()) continue;
            arrayList.add(object);
            n10 = n11;
        }
        m.m((List)arrayList, new b());
        jSONArray = new JSONArray();
        for (n10 = n9; n10 < arrayList.size() && n10 < 1000; ++n10) {
            jSONArray.put(arrayList.get(n10));
        }
        object = k.a;
        k.s("error_reports", jSONArray, new c(arrayList));
    }

    public static final int i(a a8, a a9) {
        Intrinsics.checkNotNullExpressionValue(a9, "o2");
        return a8.b(a9);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void j(ArrayList arrayList, K k8) {
        Intrinsics.checkNotNullParameter((Object)arrayList, "$validReports");
        Intrinsics.checkNotNullParameter(k8, "response");
        try {
            if (k8.b() == null) {
                k8 = (k8 = k8.d()) == null ? null : Boolean.valueOf((boolean)k8.getBoolean("success"));
                if (!Intrinsics.a(k8, (Object)Boolean.TRUE)) return;
                arrayList = arrayList.iterator();
                while (arrayList.hasNext()) {
                    ((a)arrayList.next()).a();
                }
            }
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }
}

