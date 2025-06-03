package O1;

import P1.a;
import P1.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import m6.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.F.c;
import x1.K;

public final class q
{
  public static final q a = new q();
  public static final String b = v.b(q.class).a();
  public static final AtomicBoolean c = new AtomicBoolean(false);
  public static final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
  public static final Map e = new ConcurrentHashMap();
  public static Long f;
  public static b g;
  
  public static final boolean d(String paramString1, String paramString2, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramString1, "name");
    paramString2 = a.e(paramString2);
    if (paramString2.containsKey(paramString1))
    {
      paramString1 = (Boolean)paramString2.get(paramString1);
      if (paramString1 == null) {
        return paramBoolean;
      }
      paramBoolean = paramString1.booleanValue();
    }
    return paramBoolean;
  }
  
  public static final void h(a parama)
  {
    if (parama != null) {
      try
      {
        d.add(parama);
      }
      finally
      {
        break label227;
      }
    }
    String str1 = B.m();
    parama = a;
    if ((parama.f(f)) && (e.containsKey(str1)))
    {
      parama.k();
      return;
    }
    Context localContext = B.l();
    parama = x.a;
    String str2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[] { str1 }, 1));
    Intrinsics.checkNotNullExpressionValue(str2, "java.lang.String.format(format, *args)");
    if (localContext == null) {
      return;
    }
    Object localObject = localContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0);
    parama = null;
    String str3 = ((SharedPreferences)localObject).getString(str2, null);
    boolean bool = P.c0(str3);
    if (!bool)
    {
      try
      {
        localObject = new org/json/JSONObject;
        ((JSONObject)localObject).<init>(str3);
        parama = (a)localObject;
      }
      catch (JSONException localJSONException)
      {
        P.i0("FacebookSDK", localJSONException);
      }
      if (parama != null) {
        j(str1, parama);
      }
    }
    parama = B.t();
    if (parama == null) {
      return;
    }
    bool = c.compareAndSet(false, true);
    if (!bool) {
      return;
    }
    o localo = new O1/o;
    localo.<init>(str1, localContext, str2);
    parama.execute(localo);
    return;
    label227:
    throw parama;
  }
  
  public static final void i(String paramString1, Context paramContext, String paramString2)
  {
    Intrinsics.checkNotNullParameter(paramString1, "$applicationId");
    Intrinsics.checkNotNullParameter(paramContext, "$context");
    Intrinsics.checkNotNullParameter(paramString2, "$gateKeepersKey");
    q localq = a;
    JSONObject localJSONObject = localq.c(paramString1);
    if (localJSONObject.length() != 0)
    {
      j(paramString1, localJSONObject);
      paramContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(paramString2, localJSONObject.toString()).apply();
      f = Long.valueOf(System.currentTimeMillis());
    }
    localq.k();
    c.set(false);
  }
  
  public static final JSONObject j(String paramString, JSONObject paramJSONObject)
  {
    Object localObject2;
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "applicationId");
      localObject1 = (JSONObject)e.get(paramString);
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>();
      }
    }
    finally
    {
      break label200;
    }
    int i = 0;
    Object localObject1 = null;
    if (paramJSONObject == null)
    {
      paramJSONObject = (JSONObject)localObject1;
    }
    else
    {
      paramJSONObject = paramJSONObject.optJSONArray("data");
      if (paramJSONObject == null) {
        paramJSONObject = (JSONObject)localObject1;
      } else {
        paramJSONObject = paramJSONObject.optJSONObject(0);
      }
    }
    localObject1 = paramJSONObject;
    if (paramJSONObject == null)
    {
      localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
    }
    localObject1 = ((JSONObject)localObject1).optJSONArray("gatekeepers");
    paramJSONObject = (JSONObject)localObject1;
    if (localObject1 == null)
    {
      paramJSONObject = new org/json/JSONArray;
      paramJSONObject.<init>();
    }
    int j = paramJSONObject.length();
    if (j > 0) {
      for (;;)
      {
        int k = i + 1;
        try
        {
          localObject1 = paramJSONObject.getJSONObject(i);
          ((JSONObject)localObject2).put(((JSONObject)localObject1).getString("key"), ((JSONObject)localObject1).getBoolean("value"));
        }
        catch (JSONException localJSONException)
        {
          P.i0("FacebookSDK", localJSONException);
        }
        if (k >= j) {
          break;
        }
        i = k;
      }
    }
    e.put(paramString, localObject2);
    return (JSONObject)localObject2;
    label200:
    throw paramString;
  }
  
  public static final void l(a parama)
  {
    parama.a();
  }
  
  public static final JSONObject m(String paramString, boolean paramBoolean)
  {
    Intrinsics.checkNotNullParameter(paramString, "applicationId");
    if (!paramBoolean)
    {
      localObject1 = e;
      if (((Map)localObject1).containsKey(paramString))
      {
        localObject1 = (JSONObject)((Map)localObject1).get(paramString);
        paramString = (String)localObject1;
        if (localObject1 == null) {
          paramString = new JSONObject();
        }
        return paramString;
      }
    }
    Object localObject1 = a.c(paramString);
    Context localContext = B.l();
    Object localObject2 = x.a;
    localObject2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[] { paramString }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject2, "java.lang.String.format(format, *args)");
    localContext.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString((String)localObject2, ((JSONObject)localObject1).toString()).apply();
    return j(paramString, (JSONObject)localObject1);
  }
  
  public final JSONObject c(String paramString)
  {
    paramString = new Bundle();
    paramString.putString("platform", "android");
    paramString.putString("sdk_version", B.B());
    paramString.putString("fields", "gatekeepers");
    Object localObject1 = F.n;
    Object localObject2 = x.a;
    localObject2 = String.format("app/%s", Arrays.copyOf(new Object[] { "mobile_sdk_gk" }, 1));
    Intrinsics.checkNotNullExpressionValue(localObject2, "java.lang.String.format(format, *args)");
    localObject1 = ((F.c)localObject1).x(null, (String)localObject2, null);
    ((F)localObject1).G(paramString);
    localObject1 = ((F)localObject1).k().d();
    paramString = (String)localObject1;
    if (localObject1 == null) {
      paramString = new JSONObject();
    }
    return paramString;
  }
  
  public final Map e(String paramString)
  {
    g();
    if (paramString != null)
    {
      Object localObject1 = e;
      if (((Map)localObject1).containsKey(paramString))
      {
        Object localObject2 = g;
        if (localObject2 == null) {
          localObject2 = null;
        } else {
          localObject2 = ((b)localObject2).a(paramString);
        }
        if (localObject2 != null)
        {
          localHashMap = new HashMap();
          localObject2 = ((Iterable)localObject2).iterator();
          for (;;)
          {
            paramString = localHashMap;
            if (!((Iterator)localObject2).hasNext()) {
              break;
            }
            paramString = (a)((Iterator)localObject2).next();
            localHashMap.put(paramString.a(), Boolean.valueOf(paramString.b()));
          }
        }
        HashMap localHashMap = new HashMap();
        localObject1 = (JSONObject)((Map)localObject1).get(paramString);
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new JSONObject();
        }
        Iterator localIterator = ((JSONObject)localObject2).keys();
        while (localIterator.hasNext())
        {
          localObject1 = (String)localIterator.next();
          Intrinsics.checkNotNullExpressionValue(localObject1, "key");
          localHashMap.put(localObject1, Boolean.valueOf(((JSONObject)localObject2).optBoolean((String)localObject1)));
        }
        localObject1 = g;
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new b();
        }
        localObject1 = new ArrayList(localHashMap.size());
        localIterator = localHashMap.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          ((Collection)localObject1).add(new a((String)localEntry.getKey(), ((Boolean)localEntry.getValue()).booleanValue()));
        }
        ((b)localObject2).b(paramString, (List)localObject1);
        g = (b)localObject2;
        paramString = localHashMap;
        return paramString;
      }
    }
    return new HashMap();
  }
  
  public final boolean f(Long paramLong)
  {
    boolean bool = false;
    if ((paramLong != null) && (System.currentTimeMillis() - paramLong.longValue() < 3600000L)) {
      bool = true;
    }
    return bool;
  }
  
  public final void g()
  {
    h(null);
  }
  
  public final void k()
  {
    Handler localHandler = new Handler(Looper.getMainLooper());
    for (;;)
    {
      Object localObject = d;
      if (((ConcurrentLinkedQueue)localObject).isEmpty()) {
        break;
      }
      localObject = (a)((ConcurrentLinkedQueue)localObject).poll();
      if (localObject != null) {
        localHandler.post(new p((a)localObject));
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a();
  }
}

/* Location:
 * Qualified Name:     O1.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */