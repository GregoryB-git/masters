package com.google.android.gms.internal.firebase_auth_api;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import m6.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzagt
  implements zzaea<zzagt>
{
  private static final String zza = "zzagt";
  private String zzb;
  private zzaj<zzahe> zzc;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzagt zzd(String paramString)
  {
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      zzb = g.a(((JSONObject)localObject).optString("recaptchaKey"));
      if (((JSONObject)localObject).has("recaptchaEnforcementState"))
      {
        JSONArray localJSONArray = ((JSONObject)localObject).optJSONArray("recaptchaEnforcementState");
        if ((localJSONArray != null) && (localJSONArray.length() != 0))
        {
          com.google.android.gms.internal.firebase-auth-api.zzam localzzam = zzaj.zzg();
          for (int i = 0; i < localJSONArray.length(); i++)
          {
            localObject = localJSONArray.getJSONObject(i);
            if (localObject == null) {
              localObject = zzahe.zza(null, null);
            } else {
              localObject = zzahe.zza(g.a(((JSONObject)localObject).optString("provider")), g.a(((JSONObject)localObject).optString("enforcementState")));
            }
            localzzam.zza(localObject);
          }
          localObject = localzzam.zza();
        }
        else
        {
          localObject = new java/util/ArrayList;
          ((ArrayList)localObject).<init>();
          localObject = zzaj.zza((Collection)localObject);
        }
        zzc = ((com.google.android.gms.internal.firebase-auth-api.zzaj)localObject);
      }
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public final String zza()
  {
    return zzb;
  }
  
  public final String zzb(String paramString)
  {
    j.e(paramString);
    com.google.android.gms.internal.firebase-auth-api.zzaj localzzaj = zzc;
    if ((localzzaj != null) && (!localzzaj.isEmpty()))
    {
      localzzaj = zzc;
      int i = localzzaj.size();
      int j = 0;
      while (j < i)
      {
        Object localObject = localzzaj.get(j);
        int k = j + 1;
        zzahe localzzahe = (zzahe)localObject;
        localObject = localzzahe.zza();
        String str = localzzahe.zzb();
        j = k;
        if (localObject != null)
        {
          j = k;
          if (str != null)
          {
            j = k;
            if (str.equals(paramString)) {
              return localzzahe.zza();
            }
          }
        }
      }
    }
    return null;
  }
  
  public final boolean zzc(String paramString)
  {
    paramString = zzb(paramString);
    if (paramString == null) {
      return false;
    }
    return (paramString.equals("ENFORCE")) || (paramString.equals("AUDIT"));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */