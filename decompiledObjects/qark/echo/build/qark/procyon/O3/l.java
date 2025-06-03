// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O3;

import H3.x;
import org.json.JSONObject;

public class l implements h
{
    public static d.a b(final JSONObject jsonObject) {
        return new d.a(jsonObject.optBoolean("collect_reports", true), jsonObject.optBoolean("collect_anrs", false), jsonObject.optBoolean("collect_build_ids", false));
    }
    
    public static d.b c(final JSONObject jsonObject) {
        return new d.b(jsonObject.optInt("max_custom_exception_events", 8), 4);
    }
    
    public static long d(final x x, final long n, final JSONObject jsonObject) {
        if (jsonObject.has("expires_at")) {
            return jsonObject.optLong("expires_at");
        }
        return x.a() + n * 1000L;
    }
    
    @Override
    public d a(final x x, final JSONObject jsonObject) {
        final int optInt = jsonObject.optInt("settings_version", 0);
        final int optInt2 = jsonObject.optInt("cache_duration", 3600);
        final double optDouble = jsonObject.optDouble("on_demand_upload_rate_per_minute", 10.0);
        final double optDouble2 = jsonObject.optDouble("on_demand_backoff_base", 1.2);
        final int optInt3 = jsonObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        JSONObject jsonObject2;
        if (jsonObject.has("session")) {
            jsonObject2 = jsonObject.getJSONObject("session");
        }
        else {
            jsonObject2 = new JSONObject();
        }
        return new d(d(x, optInt2, jsonObject), c(jsonObject2), b(jsonObject.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
