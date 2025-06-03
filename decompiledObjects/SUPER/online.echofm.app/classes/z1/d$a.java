package z1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONException;
import org.json.JSONObject;

public final class d$a
{
  public final void a(JSONObject paramJSONObject)
  {
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject1 = paramJSONObject.optJSONObject(str);
      if (localObject1 != null)
      {
        Object localObject2 = ((JSONObject)localObject1).optString("k");
        localObject1 = ((JSONObject)localObject1).optString("v");
        Intrinsics.checkNotNullExpressionValue(localObject2, "k");
        if (((CharSequence)localObject2).length() != 0)
        {
          Set localSet = d.a();
          Intrinsics.checkNotNullExpressionValue(str, "key");
          localObject2 = i.V((CharSequence)localObject2, new String[] { "," }, false, 0, 6, null);
          Intrinsics.checkNotNullExpressionValue(localObject1, "v");
          localSet.add(new d(str, (List)localObject2, (String)localObject1, null));
        }
      }
    }
  }
  
  public final Set b()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = d.a().iterator();
    while (localIterator.hasNext()) {
      localHashSet.add(((d)localIterator.next()).c());
    }
    return localHashSet;
  }
  
  public final Set c()
  {
    return new HashSet(d.a());
  }
  
  public final void d(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "rulesFromServer");
    try
    {
      d.a().clear();
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      a(localJSONObject);
      return;
    }
    catch (JSONException paramString)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     z1.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */