package G1;

import O1.C;
import O1.C0438a;
import O1.P;
import V5.q;
import W5.F;
import android.content.Context;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import x1.N;
import y1.C2259p;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2042a = new h();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2043b;

    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    static {
        HashMap e7;
        e7 = F.e(q.a(a.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), q.a(a.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));
        f2043b = e7;
    }

    public static final JSONObject a(a activityType, C0438a c0438a, String str, boolean z7, Context context) {
        Intrinsics.checkNotNullParameter(activityType, "activityType");
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", f2043b.get(activityType));
        String f7 = C2259p.f21393b.f();
        if (f7 != null) {
            jSONObject.put("app_user_id", f7);
        }
        P.C0(jSONObject, c0438a, str, z7, context);
        try {
            P.D0(jSONObject, context);
        } catch (Exception e7) {
            C.f3715e.c(N.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e7.toString());
        }
        JSONObject C7 = P.C();
        if (C7 != null) {
            Iterator<String> keys = C7.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, C7.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
