package com.google.android.gms.internal.firebase_auth_api;

import android.util.Log;
import java.text.ParseException;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzahy
  extends zzahs
{
  private static final String zza = "zzahy";
  private String zzb;
  private String zzc;
  private int zzd;
  private String zze;
  private int zzf;
  private long zzg;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzahy zzc(String paramString)
  {
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(paramString);
      localObject = ((JSONObject)localObject).optJSONObject("totpSessionInfo");
      if (localObject != null)
      {
        zzc = zzae.zza(((JSONObject)localObject).optString("sharedSecretKey"));
        zzd = ((JSONObject)localObject).optInt("verificationCodeLength");
        zze = zzae.zza(((JSONObject)localObject).optString("hashingAlgorithm"));
        zzf = ((JSONObject)localObject).optInt("periodSec");
        zzb = zzae.zza(((JSONObject)localObject).optString("sessionInfo"));
        localObject = ((JSONObject)localObject).optString("finalizeEnrollmentTime");
        try
        {
          zzg = zzanp.zza(zzanp.zza((String)localObject));
        }
        catch (ParseException localParseException)
        {
          String str = zza;
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>("Failed to parse timestamp: ");
          localStringBuilder.append((String)localObject);
          Log.e(str, localStringBuilder.toString());
        }
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
  
  public final int zzb()
  {
    return zzf;
  }
  
  public final int zzc()
  {
    return zzd;
  }
  
  public final long zzd()
  {
    return zzg;
  }
  
  public final String zze()
  {
    return zze;
  }
  
  public final String zzf()
  {
    return zzc;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzahy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */