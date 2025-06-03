package Q1;

import O1.C0451n;
import O1.P;
import Q1.c;
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
import x1.C2146B;
import x1.F;
import x1.J;
import x1.K;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4323a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f4324b;

    public static final void b() {
        f4324b = true;
        if (C2146B.p()) {
            f4323a.e();
        }
    }

    public static final void c(Throwable th) {
        if (!f4324b || d() || th == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            C0451n c0451n = C0451n.f3862a;
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "it.className");
            C0451n.b d7 = C0451n.d(className);
            if (d7 != C0451n.b.Unknown) {
                C0451n.c(d7);
                hashSet.add(d7.toString());
            }
        }
        if (C2146B.p() && (!hashSet.isEmpty())) {
            c.a aVar = c.a.f4333a;
            c.a.c(new JSONArray((Collection) hashSet)).g();
        }
    }

    public static final boolean d() {
        return false;
    }

    public static final void f(c instrumentData, K response) {
        Intrinsics.checkNotNullParameter(instrumentData, "$instrumentData");
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            if (response.b() == null) {
                JSONObject d7 = response.d();
                if (Intrinsics.a(d7 == null ? null : Boolean.valueOf(d7.getBoolean("success")), Boolean.TRUE)) {
                    instrumentData.a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    public final void e() {
        if (P.Z()) {
            return;
        }
        File[] n7 = k.n();
        ArrayList arrayList = new ArrayList();
        int length = n7.length;
        int i7 = 0;
        while (i7 < length) {
            File file = n7[i7];
            i7++;
            final c d7 = c.a.d(file);
            if (d7.f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", d7.toString());
                    F.c cVar = F.f20890n;
                    x xVar = x.f16233a;
                    String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C2146B.m()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                    arrayList.add(cVar.A(null, format, jSONObject, new F.b() { // from class: Q1.a
                        @Override // x1.F.b
                        public final void a(K k7) {
                            b.f(c.this, k7);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new J(arrayList).q();
    }
}
