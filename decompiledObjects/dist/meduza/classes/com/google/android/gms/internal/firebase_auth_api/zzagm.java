package com.google.android.gms.internal.firebase_auth_api;

import b8.t0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzagm
  implements zzaea<zzagm>
{
  private static final String zza = "zzagm";
  private com.google.android.gms.internal.firebase-auth-api.zzago zzb;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzagm zzb(String paramString)
  {
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      if (!((JSONObject)localObject).has("users"))
      {
        localObject = new com/google/android/gms/internal/firebase_auth_api/zzago;
        ((zzago)localObject).<init>();
      }
      else
      {
        JSONArray localJSONArray = ((JSONObject)localObject).optJSONArray("users");
        if ((localJSONArray != null) && (localJSONArray.length() != 0))
        {
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>(localJSONArray.length());
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            localObject = localJSONArray.getJSONObject(i);
            if (localObject == null)
            {
              localObject = new com/google/android/gms/internal/firebase_auth_api/zzagl;
              ((zzagl)localObject).<init>();
            }
            else
            {
              localObject = new zzagl(g.a(((JSONObject)localObject).optString("localId", null)), g.a(((JSONObject)localObject).optString("email", null)), ((JSONObject)localObject).optBoolean("emailVerified", false), g.a(((JSONObject)localObject).optString("displayName", null)), g.a(((JSONObject)localObject).optString("photoUrl", null)), zzahb.zza(((JSONObject)localObject).optJSONArray("providerUserInfo")), g.a(((JSONObject)localObject).optString("rawPassword", null)), g.a(((JSONObject)localObject).optString("phoneNumber", null)), ((JSONObject)localObject).optLong("createdAt", 0L), ((JSONObject)localObject).optLong("lastLoginAt", 0L), false, null, zzagz.zza(((JSONObject)localObject).optJSONArray("mfaInfo")), t0.E(((JSONObject)localObject).optJSONArray("passkeyInfo")));
            }
            localArrayList.add(localObject);
          }
          localObject = new zzago(localArrayList);
        }
        else
        {
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          localObject = new zzago((List)localObject);
        }
      }
      zzb = ((com.google.android.gms.internal.firebase-auth-api.zzago)localObject);
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public final List<zzagl> zza()
  {
    return zzb.zza();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */