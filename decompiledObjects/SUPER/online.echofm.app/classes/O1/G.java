package O1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class G
{
  public static final G a = new G();
  public static final ConcurrentHashMap b = new ConcurrentHashMap();
  
  public static final JSONObject a(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "accessToken");
    return (JSONObject)b.get(paramString);
  }
  
  public static final void b(String paramString, JSONObject paramJSONObject)
  {
    Intrinsics.checkNotNullParameter(paramString, "key");
    Intrinsics.checkNotNullParameter(paramJSONObject, "value");
    b.put(paramString, paramJSONObject);
  }
}

/* Location:
 * Qualified Name:     O1.G
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */