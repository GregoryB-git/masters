package F1;

import H1.f;
import O1.C0454q;
import W5.w;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1961a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1962b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1963c;

    public static final void a() {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            f1962b = true;
            C0454q c0454q = C0454q.f3908a;
            f1963c = C0454q.d("FBSDKFeatureIntegritySample", C2146B.m(), false);
        } catch (Throwable th) {
            T1.a.b(th, a.class);
        }
    }

    public static final void c(Map parameters) {
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            if (!f1962b || parameters.isEmpty()) {
                return;
            }
            try {
                List<String> G6 = w.G(parameters.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : G6) {
                    Object obj = parameters.get(str);
                    if (obj == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    String str2 = (String) obj;
                    a aVar = f1961a;
                    if (!aVar.d(str) && !aVar.d(str2)) {
                    }
                    parameters.remove(str);
                    if (!f1963c) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                }
                if (jSONObject.length() != 0) {
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "restrictiveParamJson.toString()");
                    parameters.put("_onDeviceParams", jSONObject2);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            T1.a.b(th, a.class);
        }
    }

    public final String b(String str) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i7 = 0; i7 < 30; i7++) {
                fArr[i7] = 0.0f;
            }
            f fVar = f.f2181a;
            String[] q7 = f.q(f.a.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{str});
            if (q7 == null) {
                return "none";
            }
            String str2 = q7[0];
            return str2 == null ? "none" : str2;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final boolean d(String str) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return !Intrinsics.a("none", b(str));
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }
}
