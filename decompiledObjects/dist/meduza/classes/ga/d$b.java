package ga;

import android.util.Log;
import dc.p;
import ec.s;
import org.json.JSONException;
import org.json.JSONObject;
import rb.f;
import rb.h;
import vb.a;

@wb.e(c="com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f="RemoteSettings.kt", l={125, 128, 131, 133, 134, 136}, m="invokeSuspend")
public final class d$b
  extends wb.i
  implements p<JSONObject, ub.e<? super h>, Object>
{
  public s a;
  public s b;
  public int c;
  
  public d$b(d paramd, ub.e<? super b> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new b(e, parame);
    d = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((b)create((JSONObject)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    Object localObject1;
    Object localObject5;
    switch (c)
    {
    default: 
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    case 6: 
      f.b(paramObject);
      break;
    case 5: 
      f.b(paramObject);
      break;
    case 4: 
      f.b(paramObject);
      break;
    case 3: 
      localObject1 = (s)d;
      f.b(paramObject);
      break;
    case 2: 
      localObject1 = a;
      localObject3 = (s)d;
      f.b(paramObject);
      paramObject = localObject1;
      break;
    case 1: 
      localObject3 = b;
      localObject1 = a;
      localObject4 = (s)d;
      f.b(paramObject);
      paramObject = localObject4;
      break;
    case 0: 
      f.b(paramObject);
      paramObject = (JSONObject)d;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Fetched settings: ");
      ((StringBuilder)localObject1).append(paramObject);
      Log.d("SessionConfigFetcher", ((StringBuilder)localObject1).toString());
      localObject5 = new s();
      localObject4 = new s();
      localObject3 = new s();
      if (((JSONObject)paramObject).has("app_quality"))
      {
        paramObject = ((JSONObject)paramObject).get("app_quality");
        ec.i.c(paramObject, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject localJSONObject = (JSONObject)paramObject;
        try
        {
          if (localJSONObject.has("sessions_enabled")) {
            paramObject = (Boolean)localJSONObject.get("sessions_enabled");
          } else {
            paramObject = null;
          }
          try
          {
            if (localJSONObject.has("sampling_rate")) {
              a = ((Double)localJSONObject.get("sampling_rate"));
            }
            if (localJSONObject.has("session_timeout_seconds")) {
              a = ((Integer)localJSONObject.get("session_timeout_seconds"));
            }
            localObject1 = paramObject;
            if (!localJSONObject.has("cache_duration")) {
              break label380;
            }
            a = ((Integer)localJSONObject.get("cache_duration"));
            localObject1 = paramObject;
          }
          catch (JSONException localJSONException1) {}
          Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", localJSONException2);
        }
        catch (JSONException localJSONException2)
        {
          paramObject = null;
        }
        localObject2 = paramObject;
      }
      else
      {
        localObject2 = null;
      }
      label380:
      if (localObject2 == null) {
        break label468;
      }
      paramObject = e;
      ((Boolean)localObject2).booleanValue();
      paramObject = ((d)paramObject).e();
      d = localObject5;
      a = ((s)localObject4);
      b = ((s)localObject3);
      c = 1;
      paramObject = ((i)paramObject).c(i.c, localObject2, this);
      if (paramObject != a.a) {
        paramObject = h.a;
      }
      if (paramObject == locala) {
        return locala;
      }
      paramObject = localObject5;
      localObject2 = localObject4;
    }
    Object localObject4 = localObject2;
    Object localObject2 = localObject3;
    break label474;
    label468:
    paramObject = localObject5;
    localObject2 = localObject3;
    label474:
    Object localObject3 = (Integer)a;
    if (localObject3 != null)
    {
      localObject5 = e;
      ((Number)localObject3).intValue();
      localObject3 = ((d)localObject5).e();
      localObject4 = (Integer)a;
      d = paramObject;
      a = ((s)localObject2);
      b = null;
      c = 2;
      localObject3 = ((i)localObject3).c(i.e, localObject4, this);
      if (localObject3 != a.a) {
        localObject3 = h.a;
      }
      if (localObject3 == locala) {
        return locala;
      }
    }
    localObject3 = paramObject;
    paramObject = localObject2;
    localObject4 = (Double)a;
    localObject2 = paramObject;
    if (localObject4 != null)
    {
      localObject2 = e;
      ((Number)localObject4).doubleValue();
      localObject2 = ((d)localObject2).e();
      localObject3 = (Double)a;
      d = paramObject;
      a = null;
      b = null;
      c = 3;
      localObject3 = ((i)localObject2).c(i.d, localObject3, this);
      if (localObject3 != a.a) {
        localObject3 = h.a;
      }
      localObject2 = paramObject;
      if (localObject3 == locala) {
        return locala;
      }
    }
    paramObject = (Integer)a;
    if (paramObject != null)
    {
      localObject3 = e;
      ((Number)paramObject).intValue();
      paramObject = ((d)localObject3).e();
      localObject2 = (Integer)a;
      d = null;
      a = null;
      b = null;
      c = 4;
      paramObject = ((i)paramObject).c(i.f, localObject2, this);
      if (paramObject != a.a) {
        paramObject = h.a;
      }
      if (paramObject == locala) {
        return locala;
      }
      paramObject = h.a;
    }
    else
    {
      paramObject = null;
    }
    if (paramObject == null)
    {
      paramObject = e.e();
      localObject2 = new Integer(86400);
      d = null;
      a = null;
      b = null;
      c = 5;
      paramObject = ((i)paramObject).c(i.f, localObject2, this);
      if (paramObject != a.a) {
        paramObject = h.a;
      }
      if (paramObject == locala) {
        return locala;
      }
    }
    localObject2 = e.e();
    paramObject = new Long(System.currentTimeMillis());
    d = null;
    a = null;
    b = null;
    c = 6;
    paramObject = ((i)localObject2).c(i.g, paramObject, this);
    if (paramObject != a.a) {
      paramObject = h.a;
    }
    if (paramObject == locala) {
      return locala;
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     ga.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */