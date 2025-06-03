package x1;

import O1.P;
import O1.j;
import O1.j.a;
import O1.v;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class r$c
{
  public final r a(JSONObject paramJSONObject, Object paramObject, HttpURLConnection paramHttpURLConnection)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "singleResult");
    try
    {
      if (paramJSONObject.has("code"))
      {
        int i = paramJSONObject.getInt("code");
        Object localObject1 = P.O(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
        Object localObject3;
        if ((localObject1 != null) && ((localObject1 instanceof JSONObject)))
        {
          boolean bool1 = ((JSONObject)localObject1).has("error");
          int j = 0;
          boolean bool2 = false;
          int k = -1;
          Object localObject2;
          Object localObject4;
          int m;
          Object localObject5;
          Object localObject6;
          if (bool1)
          {
            localObject2 = (JSONObject)P.O((JSONObject)localObject1, "error", null);
            if (localObject2 == null) {
              localObject3 = null;
            } else {
              localObject3 = ((JSONObject)localObject2).optString("type", null);
            }
            if (localObject2 == null) {
              localObject4 = null;
            } else {
              localObject4 = ((JSONObject)localObject2).optString("message", null);
            }
            if (localObject2 == null) {
              m = -1;
            } else {
              m = ((JSONObject)localObject2).optInt("code", -1);
            }
            if (localObject2 != null) {
              k = ((JSONObject)localObject2).optInt("error_subcode", -1);
            }
            if (localObject2 == null) {
              localObject5 = null;
            } else {
              localObject5 = ((JSONObject)localObject2).optString("error_user_msg", null);
            }
            if (localObject2 == null) {
              localObject6 = null;
            } else {
              localObject6 = ((JSONObject)localObject2).optString("error_user_title", null);
            }
            if (localObject2 != null) {
              bool2 = ((JSONObject)localObject2).optBoolean("is_transient", false);
            }
            localObject2 = localObject4;
            localObject4 = localObject6;
            localObject6 = localObject2;
          }
          int n;
          for (;;)
          {
            j = 1;
            localObject2 = localObject3;
            n = k;
            localObject3 = localObject5;
            break;
            bool2 = ((JSONObject)localObject1).has("error_code");
            if ((!bool2) && (!((JSONObject)localObject1).has("error_msg")) && (!((JSONObject)localObject1).has("error_reason")))
            {
              bool2 = false;
              n = -1;
              localObject2 = null;
              localObject4 = localObject2;
              localObject3 = localObject4;
              localObject5 = localObject3;
              localObject6 = localObject4;
              m = k;
              localObject4 = localObject5;
              break;
            }
            localObject3 = ((JSONObject)localObject1).optString("error_reason", null);
            localObject6 = ((JSONObject)localObject1).optString("error_msg", null);
            m = ((JSONObject)localObject1).optInt("error_code", -1);
            k = ((JSONObject)localObject1).optInt("error_subcode", -1);
            bool2 = false;
            localObject5 = null;
            localObject4 = localObject5;
          }
          if (j != 0) {
            return new r(i, m, n, (String)localObject2, (String)localObject6, (String)localObject4, (String)localObject3, (JSONObject)localObject1, paramJSONObject, paramObject, paramHttpURLConnection, null, bool2, null);
          }
        }
        if (!c().a(i))
        {
          if (paramJSONObject.has("body")) {
            localObject3 = (JSONObject)P.O(paramJSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
          } else {
            localObject3 = null;
          }
          paramJSONObject = new r(i, -1, -1, null, null, null, null, (JSONObject)localObject3, paramJSONObject, paramObject, paramHttpURLConnection, null, false, null);
          return paramJSONObject;
        }
      }
    }
    catch (JSONException paramJSONObject)
    {
      for (;;) {}
    }
    return null;
  }
  
  public final j b()
  {
    j localj;
    label41:
    try
    {
      Object localObject1 = v.a;
      localObject1 = v.f(B.m());
      if (localObject1 == null)
      {
        localObject1 = j.g.b();
        return (j)localObject1;
      }
    }
    finally
    {
      break label41;
      localj = ((O1.r)localObject2).c();
      return localj;
    }
  }
  
  public final r.d c()
  {
    return r.a();
  }
}

/* Location:
 * Qualified Name:     x1.r.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */