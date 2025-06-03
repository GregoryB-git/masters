package T4;

import V5.o;
import V5.t;
import X5.d;
import Z5.k;
import android.util.Log;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.json.JSONException;
import org.json.JSONObject;

public final class c$c
  extends k
  implements p
{
  public Object o;
  public Object p;
  public int q;
  
  public c$c(c paramc, d paramd)
  {
    super(2, paramd);
  }
  
  public final Object a(JSONObject paramJSONObject, d paramd)
  {
    return ((c)create(paramJSONObject, paramd)).invokeSuspend(t.a);
  }
  
  public final d create(Object paramObject, d paramd)
  {
    paramd = new c(s, paramd);
    r = paramObject;
    return paramd;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = Y5.b.c();
    u localu;
    Object localObject6;
    switch (q)
    {
    default: 
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    case 6: 
      o.b(paramObject);
      break;
    case 5: 
      o.b(paramObject);
      break;
    case 4: 
      o.b(paramObject);
      break;
    case 3: 
      localu = (u)r;
      o.b(paramObject);
      break;
    case 2: 
      localu = (u)o;
      localObject3 = (u)r;
      o.b(paramObject);
      paramObject = localu;
      break;
    case 1: 
      localObject4 = (u)p;
      localu = (u)o;
      localObject3 = (u)r;
      o.b(paramObject);
      paramObject = localObject3;
      break;
    case 0: 
      o.b(paramObject);
      paramObject = (JSONObject)r;
      localObject5 = new u();
      localObject4 = new u();
      localObject3 = new u();
      if (((JSONObject)paramObject).has("app_quality"))
      {
        paramObject = ((JSONObject)paramObject).get("app_quality");
        Intrinsics.c(paramObject, "null cannot be cast to non-null type org.json.JSONObject");
        localObject6 = (JSONObject)paramObject;
        try
        {
          if (((JSONObject)localObject6).has("sessions_enabled")) {
            paramObject = (Boolean)((JSONObject)localObject6).get("sessions_enabled");
          }
        }
        catch (JSONException localJSONException1)
        {
          paramObject = null;
          break label348;
        }
        paramObject = null;
        try
        {
          if (((JSONObject)localObject6).has("sampling_rate")) {
            o = ((Double)((JSONObject)localObject6).get("sampling_rate"));
          }
        }
        catch (JSONException localJSONException2)
        {
          break label348;
        }
        if (((JSONObject)localObject6).has("session_timeout_seconds")) {
          o = ((Integer)((JSONObject)localObject6).get("session_timeout_seconds"));
        }
        localObject2 = paramObject;
        if (((JSONObject)localObject6).has("cache_duration"))
        {
          o = ((Integer)((JSONObject)localObject6).get("cache_duration"));
          localObject2 = paramObject;
          break label364;
          label348:
          Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", (Throwable)localObject2);
          localObject2 = paramObject;
        }
      }
      else
      {
        localObject2 = null;
      }
      label364:
      if (localObject2 == null) {
        break label429;
      }
      paramObject = c.e(s);
      r = localObject5;
      o = localObject4;
      p = localObject3;
      q = 1;
      if (((g)paramObject).n((Boolean)localObject2, this) == localObject1) {
        return localObject1;
      }
      paramObject = localObject5;
      localObject2 = localObject4;
      localObject4 = localObject3;
    }
    Object localObject5 = localObject2;
    Object localObject2 = paramObject;
    break label440;
    label429:
    localObject2 = localObject5;
    localObject5 = localObject4;
    Object localObject4 = localObject3;
    label440:
    paramObject = localObject4;
    Object localObject3 = localObject2;
    if ((Integer)o != null)
    {
      localObject6 = c.e(s);
      localObject5 = (Integer)o;
      r = localObject2;
      o = localObject4;
      p = null;
      q = 2;
      paramObject = localObject4;
      localObject3 = localObject2;
      if (((g)localObject6).m((Integer)localObject5, this) == localObject1) {
        return localObject1;
      }
    }
    localObject2 = paramObject;
    if ((Double)o != null)
    {
      localObject4 = c.e(s);
      localObject3 = (Double)o;
      r = paramObject;
      o = null;
      p = null;
      q = 3;
      localObject2 = paramObject;
      if (((g)localObject4).i((Double)localObject3, this) == localObject1) {
        return localObject1;
      }
    }
    if ((Integer)o != null)
    {
      paramObject = c.e(s);
      localObject2 = (Integer)o;
      r = null;
      o = null;
      p = null;
      q = 4;
      if (((g)paramObject).j((Integer)localObject2, this) == localObject1) {
        return localObject1;
      }
      paramObject = t.a;
    }
    else
    {
      paramObject = null;
    }
    if (paramObject == null)
    {
      localObject2 = c.e(s);
      paramObject = Z5.b.b(86400);
      r = null;
      o = null;
      p = null;
      q = 5;
      if (((g)localObject2).j((Integer)paramObject, this) == localObject1) {
        return localObject1;
      }
    }
    paramObject = c.e(s);
    localObject2 = Z5.b.c(System.currentTimeMillis());
    r = null;
    o = null;
    p = null;
    q = 6;
    if (((g)paramObject).k((Long)localObject2, this) == localObject1) {
      return localObject1;
    }
    return t.a;
  }
}

/* Location:
 * Qualified Name:     T4.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */