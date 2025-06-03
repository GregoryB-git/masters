/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONObject
 */
package G1;

import O1.C;
import O1.P;
import V5.q;
import android.content.Context;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import x1.N;
import y1.p;

public final class h {
    public static final h a = new h();
    public static final Map b = W5.C.e(q.a((Object)a.o, "MOBILE_APP_INSTALL"), q.a((Object)a.p, "CUSTOM_APP_EVENTS"));

    public static final JSONObject a(a object, O1.a a8, String string2, boolean bl, Context context) {
        Intrinsics.checkNotNullParameter(object, "activityType");
        Intrinsics.checkNotNullParameter((Object)context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", b.get(object));
        object = p.b.f();
        if (object != null) {
            jSONObject.put("app_user_id", object);
        }
        P.C0(jSONObject, a8, string2, bl, context);
        try {
            P.D0(jSONObject, context);
        }
        catch (Exception exception) {
            C.e.c(N.s, "AppEvents", "Fetching extended device info parameters failed: '%s'", exception.toString());
        }
        object = P.C();
        if (object != null) {
            a8 = object.keys();
            while (a8.hasNext()) {
                string2 = (String)a8.next();
                jSONObject.put(string2, object.get(string2));
            }
        }
        jSONObject.put("application_package_name", (Object)context.getPackageName());
        return jSONObject;
    }

    public static final class a
    extends Enum {
        public static final /* enum */ a o = new a();
        public static final /* enum */ a p = new a();
        public static final /* synthetic */ a[] q;

        static {
            q = a.c();
        }

        public static final /* synthetic */ a[] c() {
            return new a[]{o, p};
        }

        public static a valueOf(String string2) {
            Intrinsics.checkNotNullParameter(string2, "value");
            return (a)Enum.valueOf(a.class, (String)string2);
        }

        public static a[] values() {
            a[] arra = q;
            return (a[])Arrays.copyOf((Object[])arra, (int)arra.length);
        }
    }

}

