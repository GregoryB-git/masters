package c8;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import b8.h0;
import b8.l0;
import b8.t0;
import com.google.android.gms.internal.firebase_auth_api.zzagw;
import com.google.android.gms.internal.firebase_auth_api.zzzp;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m6.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.a;
import u7.f;

public final class n0
{
  public Context a;
  public String b;
  public SharedPreferences c;
  public a d;
  
  public n0(Context paramContext, String paramString)
  {
    j.i(paramContext);
    j.e(paramString);
    b = paramString;
    a = paramContext.getApplicationContext();
    paramContext = String.format("com.google.firebase.auth.api.Store.%s", new Object[] { b });
    c = a.getSharedPreferences(paramContext, 0);
    d = new a("StorageHelpers", new String[0]);
  }
  
  public final i a(JSONObject paramJSONObject)
  {
    try
    {
      Object localObject1 = paramJSONObject.getString("cachedTokenState");
      Object localObject2 = paramJSONObject.getString("applicationName");
      boolean bool = paramJSONObject.getBoolean("anonymous");
      Object localObject3 = "2";
      Object localObject4 = paramJSONObject.getString("version");
      if (localObject4 != null) {
        localObject3 = localObject4;
      }
      localObject4 = paramJSONObject.getJSONArray("userInfos");
      int i = ((JSONArray)localObject4).length();
      if (i == 0) {
        return null;
      }
      Object localObject5 = new java/util/ArrayList;
      ((ArrayList)localObject5).<init>(i);
      int j = 0;
      for (int k = 0; k < i; k++) {
        ((ArrayList)localObject5).add(e.D(((JSONArray)localObject4).getString(k)));
      }
      localObject2 = f.f((String)localObject2);
      localObject4 = new c8/i;
      ((i)localObject4).<init>((f)localObject2, (ArrayList)localObject5);
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        ((i)localObject4).L(zzagw.zzb((String)localObject1));
      }
      if (!bool) {
        p = Boolean.FALSE;
      }
      o = ((String)localObject3);
      if (paramJSONObject.has("userMetadata"))
      {
        localObject3 = k.a(paramJSONObject.getJSONObject("userMetadata"));
        if (localObject3 != null) {
          q = ((k)localObject3);
        }
      }
      if (paramJSONObject.has("userMultiFactorInfo"))
      {
        localObject2 = paramJSONObject.getJSONArray("userMultiFactorInfo");
        if (localObject2 != null)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          for (k = 0; k < ((JSONArray)localObject2).length(); k++)
          {
            localObject5 = ((JSONArray)localObject2).getString(k);
            localObject3 = new org/json/JSONObject;
            ((JSONObject)localObject3).<init>((String)localObject5);
            localObject5 = ((JSONObject)localObject3).optString("factorIdKey");
            if ("phone".equals(localObject5)) {
              localObject3 = h0.G((JSONObject)localObject3);
            } else if (Objects.equals(localObject5, "totp")) {
              localObject3 = l0.G((JSONObject)localObject3);
            } else {
              localObject3 = null;
            }
            ((ArrayList)localObject1).add(localObject3);
          }
          ((i)localObject4).P((List)localObject1);
        }
      }
      if (paramJSONObject.has("passkeyInfo"))
      {
        localObject2 = paramJSONObject.getJSONArray("passkeyInfo");
        if (localObject2 != null)
        {
          localObject3 = new java/util/ArrayList;
          ((ArrayList)localObject3).<init>();
          for (k = j; k < ((JSONArray)localObject2).length(); k++)
          {
            paramJSONObject = ((JSONArray)localObject2).getString(k);
            localObject1 = new org/json/JSONObject;
            ((JSONObject)localObject1).<init>(paramJSONObject);
            ((ArrayList)localObject3).add(t0.D((JSONObject)localObject1));
          }
          ((i)localObject4).N((List)localObject3);
        }
      }
      return (i)localObject4;
    }
    catch (zzzp paramJSONObject) {}catch (IllegalArgumentException paramJSONObject) {}catch (ArrayIndexOutOfBoundsException paramJSONObject) {}catch (JSONException paramJSONObject) {}
    Log.wtf(d.a, paramJSONObject);
    return null;
  }
}

/* Location:
 * Qualified Name:     c8.n0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */