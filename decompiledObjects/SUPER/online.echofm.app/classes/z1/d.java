package z1;

import T1.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  public static final a d = new a(null);
  public static final Set e = new CopyOnWriteArraySet();
  public final String a;
  public final String b;
  public final List c;
  
  public d(String paramString1, List paramList, String paramString2)
  {
    a = paramString1;
    b = paramString2;
    c = paramList;
  }
  
  public final List b()
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new ArrayList((Collection)c);
      return localArrayList;
    }
    finally
    {
      a.b(localThrowable, this);
    }
    return null;
  }
  
  public final String c()
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      String str = a;
      return str;
    }
    finally
    {
      a.b(localThrowable, this);
    }
    return null;
  }
  
  public final String d()
  {
    if (a.d(this)) {
      return null;
    }
    try
    {
      String str = b;
      return str;
    }
    finally
    {
      a.b(localThrowable, this);
    }
    return null;
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     z1.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */