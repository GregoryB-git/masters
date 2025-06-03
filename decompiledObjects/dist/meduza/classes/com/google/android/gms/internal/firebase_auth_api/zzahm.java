package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import java.util.List;
import m6.j;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzahm
  implements zzaeb
{
  private String zza;
  private String zzb;
  private String zzc;
  private String zzd;
  private String zze;
  private String zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzahx zzg = new zzahx();
  private boolean zzh = true;
  private com.google.android.gms.internal.firebase-auth-api.zzahx zzi = new zzahx();
  private String zzj;
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahm zza(String paramString)
  {
    j.e(paramString);
    zzi.zzb().add(paramString);
    return this;
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("returnSecureToken", zzh);
    boolean bool = zzi.zzb().isEmpty();
    int i = 0;
    int j;
    if (!bool)
    {
      localObject1 = zzi.zzb();
      localObject2 = new JSONArray();
      for (j = 0; j < ((List)localObject1).size(); j++) {
        ((JSONArray)localObject2).put(((List)localObject1).get(j));
      }
      localJSONObject.put("deleteProvider", localObject2);
    }
    Object localObject2 = zzg.zzb();
    int k = ((List)localObject2).size();
    Object localObject1 = new int[k];
    for (int m = 0; m < ((List)localObject2).size(); m++)
    {
      String str = (String)((List)localObject2).get(m);
      str.getClass();
      j = -1;
      int n = str.hashCode();
      int i1 = 2;
      switch (n)
      {
      default: 
        break;
      case 1999612571: 
        if (str.equals("PASSWORD")) {
          j = 3;
        }
        break;
      case 1939891618: 
        if (str.equals("PHOTO_URL")) {
          j = 2;
        }
        break;
      case 66081660: 
        if (str.equals("EMAIL")) {
          j = 1;
        }
        break;
      case -333046776: 
        if (str.equals("DISPLAY_NAME")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        i1 = 0;
        break;
      case 3: 
        i1 = 5;
        break;
      case 2: 
        i1 = 4;
        break;
      case 1: 
        i1 = 1;
      }
      localObject1[m] = i1;
    }
    if (k > 0)
    {
      localObject2 = new JSONArray();
      for (j = i; j < k; j++) {
        ((JSONArray)localObject2).put(localObject1[j]);
      }
      localJSONObject.put("deleteAttribute", localObject2);
    }
    localObject1 = zza;
    if (localObject1 != null) {
      localJSONObject.put("idToken", localObject1);
    }
    localObject1 = zzc;
    if (localObject1 != null) {
      localJSONObject.put("email", localObject1);
    }
    localObject1 = zzd;
    if (localObject1 != null) {
      localJSONObject.put("password", localObject1);
    }
    localObject1 = zzb;
    if (localObject1 != null) {
      localJSONObject.put("displayName", localObject1);
    }
    localObject1 = zzf;
    if (localObject1 != null) {
      localJSONObject.put("photoUrl", localObject1);
    }
    localObject1 = zze;
    if (localObject1 != null) {
      localJSONObject.put("oobCode", localObject1);
    }
    localObject1 = zzj;
    if (localObject1 != null) {
      localJSONObject.put("tenantId", localObject1);
    }
    return localJSONObject.toString();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahm zzb(String paramString)
  {
    if (paramString == null) {
      zzg.zzb().add("DISPLAY_NAME");
    } else {
      zzb = paramString;
    }
    return this;
  }
  
  public final String zzb()
  {
    return zzb;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahm zzc(String paramString)
  {
    if (paramString == null) {
      zzg.zzb().add("EMAIL");
    } else {
      zzc = paramString;
    }
    return this;
  }
  
  public final String zzc()
  {
    return zzc;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahm zzd(String paramString)
  {
    j.e(paramString);
    zza = paramString;
    return this;
  }
  
  public final String zzd()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahm zze(String paramString)
  {
    j.e(paramString);
    zze = paramString;
    return this;
  }
  
  public final String zze()
  {
    return zzf;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahm zzf(String paramString)
  {
    if (paramString == null) {
      zzg.zzb().add("PASSWORD");
    } else {
      zzd = paramString;
    }
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahm zzg(String paramString)
  {
    if (paramString == null) {
      zzg.zzb().add("PHOTO_URL");
    } else {
      zzf = paramString;
    }
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzahm zzh(String paramString)
  {
    zzj = paramString;
    return this;
  }
  
  public final boolean zzi(String paramString)
  {
    j.e(paramString);
    return zzg.zzb().contains(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */