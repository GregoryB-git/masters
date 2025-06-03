package com.google.android.gms.internal.firebase_auth_api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import b.z;
import m6.j;
import n6.a;
import org.json.JSONException;
import org.json.JSONObject;
import v6.g;

public class zzagw
  extends a
  implements zzaea<zzagw>
{
  public static final Parcelable.Creator<zzagw> CREATOR = new zzagv();
  private static final String zza = "zzagw";
  private String zzb;
  private String zzc;
  private Long zzd;
  private String zze;
  private Long zzf;
  
  public zzagw()
  {
    zzf = Long.valueOf(System.currentTimeMillis());
  }
  
  public zzagw(String paramString1, String paramString2, Long paramLong, String paramString3)
  {
    this(paramString1, paramString2, paramLong, paramString3, Long.valueOf(System.currentTimeMillis()));
  }
  
  public zzagw(String paramString1, String paramString2, Long paramLong1, String paramString3, Long paramLong2)
  {
    zzb = paramString1;
    zzc = paramString2;
    zzd = paramLong1;
    zze = paramString3;
    zzf = paramLong2;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzagw zzb(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = new com/google/android/gms/internal/firebase_auth_api/zzagw;
      paramString.<init>();
      zzb = localJSONObject.optString("refresh_token", null);
      zzc = localJSONObject.optString("access_token", null);
      zzd = Long.valueOf(localJSONObject.optLong("expires_in"));
      zze = localJSONObject.optString("token_type", null);
      zzf = Long.valueOf(localJSONObject.optLong("issued_at"));
      return paramString;
    }
    catch (JSONException paramString)
    {
      Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
      throw new zzzp(paramString);
    }
  }
  
  private final com.google.android.gms.internal.firebase-auth-api.zzagw zzd(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      zzb = g.a(localJSONObject.optString("refresh_token"));
      zzc = g.a(localJSONObject.optString("access_token"));
      zzd = Long.valueOf(localJSONObject.optLong("expires_in", 0L));
      zze = g.a(localJSONObject.optString("token_type"));
      zzf = Long.valueOf(System.currentTimeMillis());
      return this;
    }
    catch (NullPointerException localNullPointerException) {}catch (JSONException localJSONException) {}
    throw zzail.zza(localJSONException, zza, paramString);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 2, zzb, false);
    z.F(paramParcel, 3, zzc, false);
    z.D(paramParcel, 4, Long.valueOf(zza()));
    z.F(paramParcel, 5, zze, false);
    z.D(paramParcel, 6, Long.valueOf(zzf.longValue()));
    z.L(paramInt, paramParcel);
  }
  
  public final long zza()
  {
    Long localLong = zzd;
    if (localLong == null) {
      return 0L;
    }
    return localLong.longValue();
  }
  
  public final long zzb()
  {
    return zzf.longValue();
  }
  
  public final String zzc()
  {
    return zzc;
  }
  
  public final void zzc(String paramString)
  {
    j.e(paramString);
    zzb = paramString;
  }
  
  public final String zzd()
  {
    return zzb;
  }
  
  public final String zze()
  {
    return zze;
  }
  
  public final String zzf()
  {
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("refresh_token", zzb);
      ((JSONObject)localObject).put("access_token", zzc);
      ((JSONObject)localObject).put("expires_in", zzd);
      ((JSONObject)localObject).put("token_type", zze);
      ((JSONObject)localObject).put("issued_at", zzf);
      localObject = ((JSONObject)localObject).toString();
      return (String)localObject;
    }
    catch (JSONException localJSONException)
    {
      Log.d(zza, "Failed to convert GetTokenResponse to JSON");
      throw new zzzp(localJSONException);
    }
  }
  
  public final boolean zzg()
  {
    long l1 = zzf.longValue();
    long l2 = zzd.longValue();
    return System.currentTimeMillis() + 300000L < l2 * 1000L + l1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzagw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */