package O3;

import H3.x;
import org.json.JSONObject;

public class l
  implements h
{
  public static d.a b(JSONObject paramJSONObject)
  {
    return new d.a(paramJSONObject.optBoolean("collect_reports", true), paramJSONObject.optBoolean("collect_anrs", false), paramJSONObject.optBoolean("collect_build_ids", false));
  }
  
  public static d.b c(JSONObject paramJSONObject)
  {
    return new d.b(paramJSONObject.optInt("max_custom_exception_events", 8), 4);
  }
  
  public static long d(x paramx, long paramLong, JSONObject paramJSONObject)
  {
    if (paramJSONObject.has("expires_at")) {
      paramLong = paramJSONObject.optLong("expires_at");
    } else {
      paramLong = paramx.a() + paramLong * 1000L;
    }
    return paramLong;
  }
  
  public d a(x paramx, JSONObject paramJSONObject)
  {
    int i = paramJSONObject.optInt("settings_version", 0);
    int j = paramJSONObject.optInt("cache_duration", 3600);
    double d1 = paramJSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0D);
    double d2 = paramJSONObject.optDouble("on_demand_backoff_base", 1.2D);
    int k = paramJSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
    if (paramJSONObject.has("session")) {}
    d.b localb;
    for (Object localObject = paramJSONObject.getJSONObject("session");; localObject = new JSONObject())
    {
      localb = c((JSONObject)localObject);
      break;
    }
    localObject = b(paramJSONObject.getJSONObject("features"));
    return new d(d(paramx, j, paramJSONObject), localb, (d.a)localObject, i, j, d1, d2, k);
  }
}

/* Location:
 * Qualified Name:     O3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */