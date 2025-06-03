/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package O3;

import H3.x;
import O3.d;
import O3.h;
import org.json.JSONObject;

public class l
implements h {
    public static d.a b(JSONObject jSONObject) {
        return new d.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    public static d.b c(JSONObject jSONObject) {
        return new d.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    public static long d(x x8, long l8, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return x8.a() + l8 * 1000L;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public d a(x x8, JSONObject jSONObject) {
        int n8 = jSONObject.optInt("settings_version", 0);
        int n9 = jSONObject.optInt("cache_duration", 3600);
        double d8 = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0);
        double d9 = jSONObject.optDouble("on_demand_backoff_base", 1.2);
        int n10 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        Object object = jSONObject.has("session") ? jSONObject.getJSONObject("session") : new JSONObject();
        object = l.c((JSONObject)object);
        d.a a8 = l.b(jSONObject.getJSONObject("features"));
        return new d(l.d(x8, n9, jSONObject), (d.b)object, a8, n8, n9, d8, d9, n10);
    }
}

