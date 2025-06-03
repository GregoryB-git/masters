package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import b8.c1;
import java.util.List;
import m6.j;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzaie
  implements zzaea<zzaie>
{
  private static final String zza = "zzaie";
  private boolean zzb;
  private String zzc;
  private String zzd;
  private long zze;
  private String zzf;
  private String zzg;
  private String zzh;
  private boolean zzi;
  private String zzj;
  private String zzk;
  private String zzl;
  private String zzm;
  private String zzn;
  private String zzo;
  private List<zzagz> zzp;
  private String zzq;
  
  private final com.google.android.gms.internal.firebase-auth-api.zzaie zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      zzb = localJSONObject.optBoolean("needConfirmation", false);
      localJSONObject.optBoolean("needEmail", false);
      zzc = g.a(localJSONObject.optString("idToken", null));
      zzd = g.a(localJSONObject.optString("refreshToken", null));
      zze = localJSONObject.optLong("expiresIn", 0L);
      g.a(localJSONObject.optString("localId", null));
      zzf = g.a(localJSONObject.optString("email", null));
      g.a(localJSONObject.optString("displayName", null));
      g.a(localJSONObject.optString("photoUrl", null));
      zzg = g.a(localJSONObject.optString("providerId", null));
      zzh = g.a(localJSONObject.optString("rawUserInfo", null));
      zzi = localJSONObject.optBoolean("isNewUser", false);
      zzj = localJSONObject.optString("oauthAccessToken", null);
      zzk = localJSONObject.optString("oauthIdToken", null);
      zzm = g.a(localJSONObject.optString("errorMessage", null));
      zzn = g.a(localJSONObject.optString("pendingToken", null));
      zzo = g.a(localJSONObject.optString("tenantId", null));
      zzp = zzagz.zza(localJSONObject.optJSONArray("mfaInfo"));
      zzq = g.a(localJSONObject.optString("mfaPendingCredential", null));
      zzl = g.a(localJSONObject.optString("oauthTokenSecret", null));
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public final long zza()
  {
    return zze;
  }
  
  public final c1 zzb()
  {
    if ((TextUtils.isEmpty(zzj)) && (TextUtils.isEmpty(zzk))) {
      return null;
    }
    String str1 = zzg;
    String str2 = zzk;
    String str3 = zzj;
    String str4 = zzn;
    String str5 = zzl;
    j.f("Must specify a non-empty providerId", str1);
    if ((TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3))) {
      throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }
    return new c1(str1, str2, str3, null, str4, str5, null);
  }
  
  public final String zzc()
  {
    return zzf;
  }
  
  public final String zzd()
  {
    return zzm;
  }
  
  public final String zze()
  {
    return zzc;
  }
  
  public final String zzf()
  {
    return zzq;
  }
  
  public final String zzg()
  {
    return zzg;
  }
  
  public final String zzh()
  {
    return zzh;
  }
  
  public final String zzi()
  {
    return zzd;
  }
  
  public final String zzj()
  {
    return zzo;
  }
  
  public final List<zzagz> zzk()
  {
    return zzp;
  }
  
  public final boolean zzl()
  {
    return !TextUtils.isEmpty(zzq);
  }
  
  public final boolean zzm()
  {
    return zzb;
  }
  
  public final boolean zzn()
  {
    return zzi;
  }
  
  public final boolean zzo()
  {
    return (zzb) || (!TextUtils.isEmpty(zzm));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaie
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */