// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G1;

import java.util.Arrays;
import java.util.Iterator;
import x1.N;
import O1.P;
import y1.p;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import android.content.Context;
import O1.a;
import W5.C;
import V5.q;
import V5.m;
import java.util.Map;

public final class h
{
    public static final h a;
    public static final Map b;
    
    static {
        a = new h();
        b = C.e(q.a(h.a.o, "MOBILE_APP_INSTALL"), q.a(h.a.p, "CUSTOM_APP_EVENTS"));
    }
    
    public static final JSONObject a(final a a, final O1.a a2, String s, final boolean b, final Context context) {
        Intrinsics.checkNotNullParameter(a, "activityType");
        Intrinsics.checkNotNullParameter(context, "context");
        final JSONObject jsonObject = new JSONObject();
        jsonObject.put("event", h.b.get(a));
        final String f = p.b.f();
        if (f != null) {
            jsonObject.put("app_user_id", (Object)f);
        }
        P.C0(jsonObject, a2, s, b, context);
        try {
            P.D0(jsonObject, context);
        }
        catch (Exception ex) {
            O1.C.e.c(N.s, "AppEvents", "Fetching extended device info parameters failed: '%s'", ex.toString());
        }
        final JSONObject c = P.C();
        if (c != null) {
            final Iterator keys = c.keys();
            while (keys.hasNext()) {
                s = keys.next();
                jsonObject.put(s, c.get(s));
            }
        }
        jsonObject.put("application_package_name", (Object)context.getPackageName());
        return jsonObject;
    }
    
    public enum a
    {
        o("MOBILE_INSTALL_EVENT", 0), 
        p("CUSTOM_APP_EVENTS", 1);
        
        static {
            q = c();
        }
        
        public a(final String name, final int ordinal) {
        }
        
        public static final /* synthetic */ a[] c() {
            return new a[] { a.o, a.p };
        }
    }
}
