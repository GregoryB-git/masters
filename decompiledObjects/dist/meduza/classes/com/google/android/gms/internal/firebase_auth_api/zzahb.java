package com.google.android.gms.internal.firebase_auth_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import v6.g;

public final class zzahb
{
  private List<zzahc> zza;
  
  public zzahb()
  {
    zza = new ArrayList();
  }
  
  private zzahb(List<zzahc> paramList)
  {
    if (!paramList.isEmpty()) {}
    for (paramList = Collections.unmodifiableList(paramList);; paramList = Collections.emptyList())
    {
      zza = paramList;
      return;
    }
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzahb zza(JSONArray paramJSONArray)
  {
    if ((paramJSONArray != null) && (paramJSONArray.length() != 0))
    {
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        Object localObject = paramJSONArray.getJSONObject(i);
        if (localObject == null) {
          localObject = new zzahc();
        } else {
          localObject = new zzahc(g.a(((JSONObject)localObject).optString("federatedId", null)), g.a(((JSONObject)localObject).optString("displayName", null)), g.a(((JSONObject)localObject).optString("photoUrl", null)), g.a(((JSONObject)localObject).optString("providerId", null)), null, g.a(((JSONObject)localObject).optString("phoneNumber", null)), g.a(((JSONObject)localObject).optString("email", null)));
        }
        localArrayList.add(localObject);
      }
      return new zzahb(localArrayList);
    }
    return new zzahb(new ArrayList());
  }
  
  public final List<zzahc> zza()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */