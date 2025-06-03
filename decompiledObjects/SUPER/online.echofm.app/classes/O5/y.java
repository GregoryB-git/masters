package O5;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.google.firebase.messaging.T;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class y
{
  public static y c;
  public final String a = ",";
  public SharedPreferences b;
  
  public static y b()
  {
    if (c == null) {
      c = new y();
    }
    return c;
  }
  
  public Map a(String paramString)
  {
    String str = d(paramString, null);
    if (str != null) {
      try
      {
        HashMap localHashMap = new java/util/HashMap;
        localHashMap.<init>(1);
        Object localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str);
        localObject = f((JSONObject)localObject);
        ((Map)localObject).put("to", paramString);
        localHashMap.put("message", localObject);
        return localHashMap;
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
      }
    }
    return null;
  }
  
  public final SharedPreferences c()
  {
    if (b == null) {
      b = a.a().getSharedPreferences("io.flutter.plugins.firebase.messaging", 0);
    }
    return b;
  }
  
  public String d(String paramString1, String paramString2)
  {
    return c().getString(paramString1, paramString2);
  }
  
  public List e(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramJSONArray.length(); i++)
    {
      Object localObject1 = paramJSONArray.get(i);
      Object localObject2;
      if ((localObject1 instanceof JSONArray))
      {
        localObject2 = e((JSONArray)localObject1);
      }
      else
      {
        localObject2 = localObject1;
        if ((localObject1 instanceof JSONObject)) {
          localObject2 = f((JSONObject)localObject1);
        }
      }
      localArrayList.add(localObject2);
    }
    return localArrayList;
  }
  
  public final Map f(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramJSONObject.get(str);
      Object localObject2;
      if ((localObject1 instanceof JSONArray))
      {
        localObject2 = e((JSONArray)localObject1);
      }
      else
      {
        localObject2 = localObject1;
        if ((localObject1 instanceof JSONObject)) {
          localObject2 = f((JSONObject)localObject1);
        }
      }
      localHashMap.put(str, localObject2);
    }
    return localHashMap;
  }
  
  public void g(String paramString)
  {
    c().edit().remove(paramString).apply();
    String str = d("notification_ids", "");
    if (!str.isEmpty())
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramString);
      localStringBuilder.append(",");
      h("notification_ids", str.replace(localStringBuilder.toString(), ""));
    }
  }
  
  public void h(String paramString1, String paramString2)
  {
    c().edit().putString(paramString1, paramString2).apply();
  }
  
  public void i(T paramT)
  {
    Object localObject1 = new JSONObject(z.f(paramT)).toString();
    h(paramT.g(), (String)localObject1);
    Object localObject2 = d("notification_ids", "");
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append(paramT.g());
    ((StringBuilder)localObject1).append(",");
    localObject1 = ((StringBuilder)localObject1).toString();
    localObject2 = new ArrayList(Arrays.asList(((String)localObject1).split(",")));
    paramT = (T)localObject1;
    if (((List)localObject2).size() > 20)
    {
      localObject2 = (String)((List)localObject2).get(0);
      c().edit().remove((String)localObject2).apply();
      paramT = new StringBuilder();
      paramT.append((String)localObject2);
      paramT.append(",");
      paramT = ((String)localObject1).replace(paramT.toString(), "");
    }
    h("notification_ids", paramT);
  }
}

/* Location:
 * Qualified Name:     O5.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */