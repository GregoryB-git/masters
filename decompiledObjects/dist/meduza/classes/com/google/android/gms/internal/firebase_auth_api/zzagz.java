package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import android.util.Log;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import m6.j;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzagz
{
  private final String zza;
  private final String zzb;
  private final String zzc;
  private final long zzd;
  private final com.google.android.gms.internal.firebase-auth-api.zzaia zze;
  
  private zzagz(String paramString1, String paramString2, String paramString3, long paramLong, com.google.android.gms.internal.firebase-auth-api.zzaia paramzzaia)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (paramzzaia != null))
    {
      Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
      throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
    }
    zza = paramString1;
    j.e(paramString2);
    zzb = paramString2;
    zzc = paramString3;
    zzd = paramLong;
    zze = paramzzaia;
  }
  
  private static long zza(String paramString)
  {
    long l;
    try
    {
      l = zzanp.zza(zzanp.zza(paramString));
    }
    catch (ParseException localParseException)
    {
      StringBuilder localStringBuilder = new StringBuilder("Could not parse timestamp as ISOString. Invalid ISOString \"");
      localStringBuilder.append(paramString);
      localStringBuilder.append("\"");
      Log.w("MfaInfo", localStringBuilder.toString(), localParseException);
      l = 0L;
    }
    return l;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzagz zza(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("phoneInfo", null);
    String str2 = paramJSONObject.optString("mfaEnrollmentId", null);
    String str3 = paramJSONObject.optString("displayName", null);
    long l = zza(paramJSONObject.optString("enrolledAt", ""));
    if (paramJSONObject.opt("totpInfo") != null) {
      localObject = new zzaia();
    } else {
      localObject = null;
    }
    Object localObject = new zzagz(str1, str2, str3, l, (com.google.android.gms.internal.firebase-auth-api.zzaia)localObject);
    paramJSONObject.optString("unobfuscatedPhoneInfo");
    return (com.google.android.gms.internal.firebase-auth-api.zzagz)localObject;
  }
  
  public static List<zzagz> zza(JSONArray paramJSONArray)
  {
    if ((paramJSONArray != null) && (paramJSONArray.length() != 0))
    {
      ArrayList localArrayList = new ArrayList();
      for (int i = 0; i < paramJSONArray.length(); i++) {
        localArrayList.add(zza(paramJSONArray.getJSONObject(i)));
      }
      return localArrayList;
    }
    return new ArrayList();
  }
  
  public final long zza()
  {
    return zzd;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaia zzb()
  {
    return zze;
  }
  
  public final String zzc()
  {
    return zzc;
  }
  
  public final String zzd()
  {
    return zzb;
  }
  
  public final String zze()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */