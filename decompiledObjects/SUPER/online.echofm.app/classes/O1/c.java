package O1;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  public static final c a = new c();
  public static final Map b;
  
  static
  {
    HashMap localHashMap = new HashMap();
    b = localHashMap;
    localHashMap.put(Boolean.class, new a());
    localHashMap.put(Integer.class, new b());
    localHashMap.put(Long.class, new c());
    localHashMap.put(Double.class, new d());
    localHashMap.put(String.class, new e());
    localHashMap.put(String[].class, new f());
    localHashMap.put(JSONArray.class, new g());
  }
  
  public static final Bundle a(JSONObject paramJSONObject)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "jsonObject");
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramJSONObject.get(str);
      if (localObject != JSONObject.NULL) {
        if ((localObject instanceof JSONObject))
        {
          localBundle.putBundle(str, a((JSONObject)localObject));
        }
        else
        {
          h localh = (h)b.get(localObject.getClass());
          if (localh != null)
          {
            Intrinsics.checkNotNullExpressionValue(str, "key");
            Intrinsics.checkNotNullExpressionValue(localObject, "value");
            localh.a(localBundle, str, localObject);
          }
          else
          {
            throw new IllegalArgumentException(Intrinsics.i("Unsupported type: ", localObject.getClass()));
          }
        }
      }
    }
    return localBundle;
  }
  
  public static final class a
    implements c.h
  {
    public void a(Bundle paramBundle, String paramString, Object paramObject)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      Intrinsics.checkNotNullParameter(paramString, "key");
      Intrinsics.checkNotNullParameter(paramObject, "value");
      paramBundle.putBoolean(paramString, ((Boolean)paramObject).booleanValue());
    }
  }
  
  public static final class b
    implements c.h
  {
    public void a(Bundle paramBundle, String paramString, Object paramObject)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      Intrinsics.checkNotNullParameter(paramString, "key");
      Intrinsics.checkNotNullParameter(paramObject, "value");
      paramBundle.putInt(paramString, ((Integer)paramObject).intValue());
    }
  }
  
  public static final class c
    implements c.h
  {
    public void a(Bundle paramBundle, String paramString, Object paramObject)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      Intrinsics.checkNotNullParameter(paramString, "key");
      Intrinsics.checkNotNullParameter(paramObject, "value");
      paramBundle.putLong(paramString, ((Long)paramObject).longValue());
    }
  }
  
  public static final class d
    implements c.h
  {
    public void a(Bundle paramBundle, String paramString, Object paramObject)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      Intrinsics.checkNotNullParameter(paramString, "key");
      Intrinsics.checkNotNullParameter(paramObject, "value");
      paramBundle.putDouble(paramString, ((Double)paramObject).doubleValue());
    }
  }
  
  public static final class e
    implements c.h
  {
    public void a(Bundle paramBundle, String paramString, Object paramObject)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      Intrinsics.checkNotNullParameter(paramString, "key");
      Intrinsics.checkNotNullParameter(paramObject, "value");
      paramBundle.putString(paramString, (String)paramObject);
    }
  }
  
  public static final class f
    implements c.h
  {
    public void a(Bundle paramBundle, String paramString, Object paramObject)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      Intrinsics.checkNotNullParameter(paramString, "key");
      Intrinsics.checkNotNullParameter(paramObject, "value");
      throw new IllegalArgumentException("Unexpected type from JSON");
    }
  }
  
  public static final class g
    implements c.h
  {
    public void a(Bundle paramBundle, String paramString, Object paramObject)
    {
      Intrinsics.checkNotNullParameter(paramBundle, "bundle");
      Intrinsics.checkNotNullParameter(paramString, "key");
      Intrinsics.checkNotNullParameter(paramObject, "value");
      JSONArray localJSONArray = (JSONArray)paramObject;
      ArrayList localArrayList = new ArrayList();
      if (localJSONArray.length() == 0)
      {
        paramBundle.putStringArrayList(paramString, localArrayList);
        return;
      }
      int i = localJSONArray.length();
      if (i > 0)
      {
        int k;
        for (int j = 0;; j = k)
        {
          k = j + 1;
          paramObject = localJSONArray.get(j);
          if (!(paramObject instanceof String)) {
            break;
          }
          localArrayList.add(paramObject);
          if (k >= i) {
            break label126;
          }
        }
        throw new IllegalArgumentException(Intrinsics.i("Unexpected type in an array: ", paramObject.getClass()));
      }
      label126:
      paramBundle.putStringArrayList(paramString, localArrayList);
    }
  }
  
  public static abstract interface h
  {
    public abstract void a(Bundle paramBundle, String paramString, Object paramObject);
  }
}

/* Location:
 * Qualified Name:     O1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */