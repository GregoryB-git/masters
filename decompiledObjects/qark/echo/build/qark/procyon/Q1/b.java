// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q1;

import java.io.File;
import x1.J;
import java.util.Arrays;
import kotlin.jvm.internal.x;
import x1.F;
import java.util.ArrayList;
import O1.P;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.Collection;
import org.json.JSONArray;
import O1.n;
import kotlin.jvm.internal.Intrinsics;
import java.util.HashSet;
import x1.B;
import x1.K;

public final class b
{
    public static final b a;
    public static boolean b;
    
    static {
        a = new b();
    }
    
    public static final void b() {
        Q1.b.b = true;
        if (B.p()) {
            Q1.b.a.e();
        }
    }
    
    public static final void c(final Throwable t) {
        if (Q1.b.b && !d()) {
            if (t == null) {
                return;
            }
            final HashSet<String> set = new HashSet<String>();
            final StackTraceElement[] stackTrace = t.getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
            for (int length = stackTrace.length, i = 0; i < length; ++i) {
                final StackTraceElement stackTraceElement = stackTrace[i];
                final n a = n.a;
                final String className = stackTraceElement.getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "it.className");
                final n.b d = n.d(className);
                if (d != n.b.q) {
                    n.c(d);
                    set.add(d.toString());
                }
            }
            if (B.p() && (set.isEmpty() ^ true)) {
                final c.a a2 = c.a.a;
                c.a.c(new JSONArray((Collection)set)).g();
            }
        }
    }
    
    public static final boolean d() {
        return false;
    }
    
    public static final void f(final c c, final K k) {
        Intrinsics.checkNotNullParameter(c, "$instrumentData");
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
                    c.a();
                }
            }
        }
        catch (JSONException ex) {}
    }
    
    public final void e() {
        if (P.Z()) {
            return;
        }
        final File[] n = k.n();
        final ArrayList<F> list = new ArrayList<F>();
        final int length = n.length;
        int n2 = 0;
        while (true) {
            Label_0151: {
                if (n2 >= length) {
                    break Label_0151;
                }
                final File file = n[n2];
                final int n3 = n2 + 1;
                final c d = c.a.d(file);
                n2 = n3;
                if (!d.f()) {
                    continue;
                }
                final JSONObject jsonObject = new JSONObject();
                try {
                    jsonObject.put("crash_shield", (Object)d.toString());
                    final F.c n4 = F.n;
                    final x a = x.a;
                    final String format = String.format("%s/instruments", Arrays.copyOf(new Object[] { B.m() }, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    list.add(n4.A(null, format, jsonObject, new a(d)));
                    n2 = n3;
                    continue;
                    Label_0162: {
                        new J(list).q();
                    }
                    return;
                }
                // iftrue(Label_0162:, !list.isEmpty())
                catch (JSONException ex) {
                    n2 = n3;
                }
            }
        }
    }
}
