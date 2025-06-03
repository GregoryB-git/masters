// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package U1;

import java.util.Iterator;
import org.json.JSONObject;
import org.json.JSONException;
import x1.F;
import org.json.JSONArray;
import java.util.Comparator;
import java.util.List;
import W5.m;
import O1.P;
import kotlin.text.Regex;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import kotlin.jvm.internal.Intrinsics;
import java.io.FilenameFilter;
import Q1.k;
import x1.B;
import java.io.File;
import x1.K;
import java.util.ArrayList;

public final class e
{
    public static final e a;
    
    static {
        a = new e();
    }
    
    public static final void d() {
        if (B.p()) {
            h();
        }
    }
    
    public static final File[] e() {
        final File f = k.f();
        if (f == null) {
            return new File[0];
        }
        final File[] listFiles = f.listFiles(new d());
        Intrinsics.checkNotNullExpressionValue(listFiles, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
        return listFiles;
    }
    
    public static final boolean f(final File file, final String s) {
        Intrinsics.checkNotNullExpressionValue(s, "name");
        final x a = x.a;
        final String format = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[] { "error_log_" }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return new Regex(format).b(s);
    }
    
    public static final void g(final String s) {
        try {
            new a(s).e();
        }
        catch (Exception ex) {}
    }
    
    public static final void h() {
        if (P.Z()) {
            return;
        }
        final File[] e = e();
        final ArrayList<a> list = new ArrayList<a>();
        final int length = e.length;
        final int n = 0;
        int n2;
        for (int i = 0; i < length; i = n2) {
            final File file = e[i];
            n2 = i + 1;
            final a e2 = new a(file);
            i = n2;
            if (e2.d()) {
                list.add(e2);
            }
        }
        m.m(list, new b());
        final JSONArray jsonArray = new JSONArray();
        for (int index = n; index < list.size() && index < 1000; ++index) {
            jsonArray.put((Object)list.get(index));
        }
        final k a = k.a;
        k.s("error_reports", jsonArray, new c(list));
    }
    
    public static final int i(final a a, final a a2) {
        Intrinsics.checkNotNullExpressionValue(a2, "o2");
        return a.b(a2);
    }
    
    public static final void j(final ArrayList list, final K k) {
        Intrinsics.checkNotNullParameter(list, "$validReports");
        Intrinsics.checkNotNullParameter(k, "response");
        try {
            if (k.b() == null) {
                final JSONObject d = k.d();
                Object value;
                if (d == null) {
                    value = null;
                }
                else {
                    value = d.getBoolean("success");
                }
                if (Intrinsics.a(value, Boolean.TRUE)) {
                    final Iterator<a> iterator = (Iterator<a>)list.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().a();
                    }
                }
            }
        }
        catch (JSONException ex) {}
    }
}
