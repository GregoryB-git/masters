package U1;

import O1.P;
import Q1.k;
import W5.s;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.C2146B;
import x1.F;
import x1.K;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f6320a = new e();

    public static final void d() {
        if (C2146B.p()) {
            h();
        }
    }

    public static final File[] e() {
        File f7 = k.f();
        if (f7 == null) {
            return new File[0];
        }
        File[] listFiles = f7.listFiles(new FilenameFilter() { // from class: U1.d
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                boolean f8;
                f8 = e.f(file, str);
                return f8;
            }
        });
        Intrinsics.checkNotNullExpressionValue(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }

    public static final boolean f(File file, String name) {
        Intrinsics.checkNotNullExpressionValue(name, "name");
        x xVar = x.f16233a;
        String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).b(name);
    }

    public static final void g(String str) {
        try {
            new a(str).e();
        } catch (Exception unused) {
        }
    }

    public static final void h() {
        if (P.Z()) {
            return;
        }
        File[] e7 = e();
        final ArrayList arrayList = new ArrayList();
        int length = e7.length;
        int i7 = 0;
        while (i7 < length) {
            File file = e7[i7];
            i7++;
            a aVar = new a(file);
            if (aVar.d()) {
                arrayList.add(aVar);
            }
        }
        s.m(arrayList, new Comparator() { // from class: U1.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i8;
                i8 = e.i((a) obj, (a) obj2);
                return i8;
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i8 = 0; i8 < arrayList.size() && i8 < 1000; i8++) {
            jSONArray.put(arrayList.get(i8));
        }
        k kVar = k.f4344a;
        k.s("error_reports", jSONArray, new F.b() { // from class: U1.c
            @Override // x1.F.b
            public final void a(K k7) {
                e.j(arrayList, k7);
            }
        });
    }

    public static final int i(a aVar, a o22) {
        Intrinsics.checkNotNullExpressionValue(o22, "o2");
        return aVar.b(o22);
    }

    public static final void j(ArrayList validReports, K response) {
        Intrinsics.checkNotNullParameter(validReports, "$validReports");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.b() == null) {
                JSONObject d7 = response.d();
                if (Intrinsics.a(d7 == null ? null : Boolean.valueOf(d7.getBoolean("success")), Boolean.TRUE)) {
                    Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
