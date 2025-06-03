package C1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
{
  public static final a e = new a(null);
  public final String a;
  public final String b;
  public final List c;
  public final String d;
  
  public b(JSONObject paramJSONObject)
  {
    Object localObject = paramJSONObject.getString("name");
    Intrinsics.checkNotNullExpressionValue(localObject, "component.getString(PARAMETER_NAME_KEY)");
    a = ((String)localObject);
    localObject = paramJSONObject.optString("value");
    Intrinsics.checkNotNullExpressionValue(localObject, "component.optString(PARAMETER_VALUE_KEY)");
    b = ((String)localObject);
    localObject = paramJSONObject.optString("path_type", "absolute");
    Intrinsics.checkNotNullExpressionValue(localObject, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
    d = ((String)localObject);
    localObject = new ArrayList();
    JSONArray localJSONArray = paramJSONObject.optJSONArray("path");
    if (localJSONArray != null)
    {
      int i = localJSONArray.length();
      if (i > 0)
      {
        int k;
        for (int j = 0;; j = k)
        {
          k = j + 1;
          paramJSONObject = localJSONArray.getJSONObject(j);
          Intrinsics.checkNotNullExpressionValue(paramJSONObject, "jsonPathArray.getJSONObject(i)");
          ((ArrayList)localObject).add(new c(paramJSONObject));
          if (k >= i) {
            break;
          }
        }
      }
    }
    c = ((List)localObject);
  }
  
  public final String a()
  {
    return a;
  }
  
  public final List b()
  {
    return c;
  }
  
  public final String c()
  {
    return d;
  }
  
  public final String d()
  {
    return b;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     C1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */