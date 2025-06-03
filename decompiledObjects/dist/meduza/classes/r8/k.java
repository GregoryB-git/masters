package r8;

import nc.g0;
import org.json.JSONObject;

public final class k
  implements g
{
  public static c.b b(JSONObject paramJSONObject)
  {
    return new c.b(paramJSONObject.optInt("max_custom_exception_events", 8));
  }
  
  public final c a(g0 paramg0, JSONObject paramJSONObject)
  {
    paramJSONObject.optInt("settings_version", 0);
    int i = paramJSONObject.optInt("cache_duration", 3600);
    double d1 = paramJSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0D);
    double d2 = paramJSONObject.optDouble("on_demand_backoff_base", 1.2D);
    int j = paramJSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
    if (paramJSONObject.has("session")) {
      localObject1 = paramJSONObject.getJSONObject("session");
    } else {
      localObject1 = new JSONObject();
    }
    Object localObject1 = b((JSONObject)localObject1);
    Object localObject2 = paramJSONObject.getJSONObject("features");
    localObject2 = new c.a(((JSONObject)localObject2).optBoolean("collect_reports", true), ((JSONObject)localObject2).optBoolean("collect_anrs", false), ((JSONObject)localObject2).optBoolean("collect_build_ids", false));
    long l = i;
    if (paramJSONObject.has("expires_at"))
    {
      l = paramJSONObject.optLong("expires_at");
    }
    else
    {
      paramg0.getClass();
      l = l * 1000L + System.currentTimeMillis();
    }
    return new c(l, (c.b)localObject1, (c.a)localObject2, d1, d2, j);
  }
}

/* Location:
 * Qualified Name:     r8.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */