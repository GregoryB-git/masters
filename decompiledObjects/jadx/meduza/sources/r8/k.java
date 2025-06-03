package r8;

import nc.g0;
import org.json.JSONObject;
import r8.c;

/* loaded from: classes.dex */
public final class k implements g {
    public static c.b b(JSONObject jSONObject) {
        return new c.b(jSONObject.optInt("max_custom_exception_events", 8));
    }

    @Override // r8.g
    public final c a(g0 g0Var, JSONObject jSONObject) {
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        c.b b10 = b(jSONObject.has("session") ? jSONObject.getJSONObject("session") : new JSONObject());
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        c.a aVar = new c.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            g0Var.getClass();
            currentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new c(currentTimeMillis, b10, aVar, optDouble, optDouble2, optInt2);
    }
}
