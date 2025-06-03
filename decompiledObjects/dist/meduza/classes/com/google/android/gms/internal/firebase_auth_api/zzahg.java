package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzahg
  implements zzaea<zzahg>
{
  private static final String zza = "zzahg";
  private String zzb;
  private String zzc;
  private String zzd;
  private com.google.android.gms.internal.firebase-auth-api.zzagz zze;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzahg zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      zzb = g.a(localJSONObject.optString("email"));
      zzc = g.a(localJSONObject.optString("newEmail"));
      int i = localJSONObject.optInt("reqType");
      String str;
      if (i != 1) {
        switch (i)
        {
        default: 
          str = null;
          break;
        case 8: 
          str = "REVERT_SECOND_FACTOR_ADDITION";
          break;
        case 7: 
          str = "VERIFY_AND_CHANGE_EMAIL";
          break;
        case 6: 
          str = "EMAIL_SIGNIN";
          break;
        case 5: 
          str = "RECOVER_EMAIL";
          break;
        case 4: 
          str = "VERIFY_EMAIL";
          break;
        }
      } else {
        str = "PASSWORD_RESET";
      }
      zzd = str;
      if (TextUtils.isEmpty(str))
      {
        str = localJSONObject.optString("requestType");
        switch (str.hashCode())
        {
        default: 
          break;
        case 970484929: 
          if (str.equals("RECOVER_EMAIL")) {
            i = 4;
          }
          break;
        case 870738373: 
          if (str.equals("EMAIL_SIGNIN")) {
            i = 2;
          }
          break;
        case -1099157829: 
          if (str.equals("VERIFY_AND_CHANGE_EMAIL")) {
            i = 3;
          }
          break;
        case -1341836234: 
          if (str.equals("VERIFY_EMAIL")) {
            i = 0;
          }
          break;
        case -1452371317: 
          if (str.equals("PASSWORD_RESET")) {
            i = 1;
          }
          break;
        case -1874510116: 
          if (str.equals("REVERT_SECOND_FACTOR_ADDITION")) {
            i = 5;
          }
          break;
        }
        i = -1;
        if ((i != 0) && (i != 1) && (i != 2) && (i != 3) && (i != 4) && (i != 5)) {
          str = null;
        }
        zzd = str;
      }
      if (localJSONObject.has("mfaInfo")) {
        zze = zzagz.zza(localJSONObject.optJSONObject("mfaInfo"));
      }
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzagz zza()
  {
    return zze;
  }
  
  public final String zzb()
  {
    return zzb;
  }
  
  public final String zzc()
  {
    return zzc;
  }
  
  public final String zzd()
  {
    return zzd;
  }
  
  public final boolean zze()
  {
    return zzb != null;
  }
  
  public final boolean zzf()
  {
    return zze != null;
  }
  
  public final boolean zzg()
  {
    return zzc != null;
  }
  
  public final boolean zzh()
  {
    return zzd != null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */