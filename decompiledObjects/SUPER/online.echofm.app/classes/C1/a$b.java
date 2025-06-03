package C1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a$b
{
  public final a a(JSONObject paramJSONObject)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "mapping");
    String str1 = paramJSONObject.getString("event_name");
    Object localObject1 = paramJSONObject.getString("method");
    Intrinsics.checkNotNullExpressionValue(localObject1, "mapping.getString(\"method\")");
    Object localObject2 = Locale.ENGLISH;
    Intrinsics.checkNotNullExpressionValue(localObject2, "ENGLISH");
    localObject1 = ((String)localObject1).toUpperCase((Locale)localObject2);
    Intrinsics.checkNotNullExpressionValue(localObject1, "(this as java.lang.String).toUpperCase(locale)");
    localObject1 = a.c.valueOf((String)localObject1);
    String str2 = paramJSONObject.getString("event_type");
    Intrinsics.checkNotNullExpressionValue(str2, "mapping.getString(\"event_type\")");
    Intrinsics.checkNotNullExpressionValue(localObject2, "ENGLISH");
    localObject2 = str2.toUpperCase((Locale)localObject2);
    Intrinsics.checkNotNullExpressionValue(localObject2, "(this as java.lang.String).toUpperCase(locale)");
    a.a locala = a.a.valueOf((String)localObject2);
    str2 = paramJSONObject.getString("app_version");
    Object localObject3 = paramJSONObject.getJSONArray("path");
    localObject2 = new ArrayList();
    int i = ((JSONArray)localObject3).length();
    int j = 0;
    int k;
    int m;
    if (i > 0) {
      for (k = 0;; k = m)
      {
        m = k + 1;
        localObject4 = ((JSONArray)localObject3).getJSONObject(k);
        Intrinsics.checkNotNullExpressionValue(localObject4, "jsonPath");
        ((ArrayList)localObject2).add(new c((JSONObject)localObject4));
        if (m >= i) {
          break;
        }
      }
    }
    Object localObject4 = paramJSONObject.optString("path_type", "absolute");
    JSONArray localJSONArray = paramJSONObject.optJSONArray("parameters");
    localObject3 = new ArrayList();
    if (localJSONArray != null)
    {
      m = localJSONArray.length();
      if (m > 0) {
        for (k = j;; k = j)
        {
          j = k + 1;
          localObject5 = localJSONArray.getJSONObject(k);
          Intrinsics.checkNotNullExpressionValue(localObject5, "jsonParameter");
          ((ArrayList)localObject3).add(new b((JSONObject)localObject5));
          if (j >= m) {
            break;
          }
        }
      }
    }
    Object localObject5 = paramJSONObject.optString("component_id");
    paramJSONObject = paramJSONObject.optString("activity_name");
    Intrinsics.checkNotNullExpressionValue(str1, "eventName");
    Intrinsics.checkNotNullExpressionValue(str2, "appVersion");
    Intrinsics.checkNotNullExpressionValue(localObject5, "componentId");
    Intrinsics.checkNotNullExpressionValue(localObject4, "pathType");
    Intrinsics.checkNotNullExpressionValue(paramJSONObject, "activityName");
    return new a(str1, (a.c)localObject1, locala, str2, (List)localObject2, (List)localObject3, (String)localObject5, (String)localObject4, paramJSONObject);
  }
  
  public final List b(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramJSONArray != null) {}
    try
    {
      int i = paramJSONArray.length();
      if (i > 0)
      {
        int k;
        for (int j = 0;; j = k)
        {
          k = j + 1;
          JSONObject localJSONObject = paramJSONArray.getJSONObject(j);
          Intrinsics.checkNotNullExpressionValue(localJSONObject, "array.getJSONObject(i)");
          localArrayList.add(a(localJSONObject));
          if (k >= i) {
            break;
          }
        }
      }
    }
    catch (JSONException|IllegalArgumentException paramJSONArray)
    {
      for (;;) {}
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     C1.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */