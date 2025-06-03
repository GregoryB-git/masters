package com.google.android.gms.internal.firebase_auth_api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import b.z;
import c8.d1;
import com.google.android.gms.internal.firebase-auth-api.zzaeb;
import f;
import m6.j;
import n6.a;
import org.json.JSONObject;

public final class zzaic
  extends a
  implements zzaeb
{
  public static final Parcelable.Creator<zzaic> CREATOR = new zzaib();
  private String zza;
  private String zzb;
  private String zzc;
  private String zzd;
  private String zze;
  private String zzf;
  private String zzg;
  private String zzh;
  private boolean zzi;
  private boolean zzj;
  private String zzk;
  private String zzl;
  private String zzm;
  private String zzn;
  private boolean zzo;
  private String zzp;
  
  public zzaic()
  {
    zzi = true;
    zzj = true;
  }
  
  public zzaic(d1 paramd1, String paramString)
  {
    j.i(paramd1);
    String str = a;
    j.e(str);
    zzl = str;
    j.e(paramString);
    zzm = paramString;
    paramd1 = c;
    j.e(paramd1);
    zze = paramd1;
    zzi = true;
    paramd1 = f.l("providerId=");
    paramd1.append(zze);
    zzg = paramd1.toString();
  }
  
  public zzaic(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9)
  {
    zza = "http://localhost";
    zzc = paramString1;
    zzd = paramString2;
    zzh = paramString5;
    zzk = paramString6;
    zzn = paramString7;
    zzp = paramString8;
    zzi = true;
    if ((TextUtils.isEmpty(paramString1)) && (TextUtils.isEmpty(zzd)) && (TextUtils.isEmpty(zzk))) {
      throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }
    j.e(paramString3);
    zze = paramString3;
    zzf = null;
    paramString1 = new StringBuilder();
    if (!TextUtils.isEmpty(zzc))
    {
      paramString1.append("id_token=");
      paramString1.append(zzc);
      paramString1.append("&");
    }
    if (!TextUtils.isEmpty(zzd))
    {
      paramString1.append("access_token=");
      paramString1.append(zzd);
      paramString1.append("&");
    }
    if (!TextUtils.isEmpty(zzf))
    {
      paramString1.append("identifier=");
      paramString1.append(zzf);
      paramString1.append("&");
    }
    if (!TextUtils.isEmpty(zzh))
    {
      paramString1.append("oauth_token_secret=");
      paramString1.append(zzh);
      paramString1.append("&");
    }
    if (!TextUtils.isEmpty(zzk))
    {
      paramString1.append("code=");
      paramString1.append(zzk);
      paramString1.append("&");
    }
    if (!TextUtils.isEmpty(paramString9))
    {
      paramString1.append("nonce=");
      paramString1.append(paramString9);
      paramString1.append("&");
    }
    paramString1.append("providerId=");
    paramString1.append(zze);
    zzg = paramString1.toString();
    zzj = true;
  }
  
  public zzaic(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, boolean paramBoolean1, boolean paramBoolean2, String paramString9, String paramString10, String paramString11, String paramString12, boolean paramBoolean3, String paramString13)
  {
    zza = paramString1;
    zzb = paramString2;
    zzc = paramString3;
    zzd = paramString4;
    zze = paramString5;
    zzf = paramString6;
    zzg = paramString7;
    zzh = paramString8;
    zzi = paramBoolean1;
    zzj = paramBoolean2;
    zzk = paramString9;
    zzl = paramString10;
    zzm = paramString11;
    zzn = paramString12;
    zzo = paramBoolean3;
    zzp = paramString13;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 2, zza, false);
    z.F(paramParcel, 3, zzb, false);
    z.F(paramParcel, 4, zzc, false);
    z.F(paramParcel, 5, zzd, false);
    z.F(paramParcel, 6, zze, false);
    z.F(paramParcel, 7, zzf, false);
    z.F(paramParcel, 8, zzg, false);
    z.F(paramParcel, 9, zzh, false);
    z.t(paramParcel, 10, zzi);
    z.t(paramParcel, 11, zzj);
    z.F(paramParcel, 12, zzk, false);
    z.F(paramParcel, 13, zzl, false);
    z.F(paramParcel, 14, zzm, false);
    z.F(paramParcel, 15, zzn, false);
    z.t(paramParcel, 16, zzo);
    z.F(paramParcel, 17, zzp, false);
    z.L(paramInt, paramParcel);
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaic zza(String paramString)
  {
    j.e(paramString);
    zzb = paramString;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaic zza(boolean paramBoolean)
  {
    zzj = false;
    return this;
  }
  
  public final String zza()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("autoCreate", zzj);
    localJSONObject.put("returnSecureToken", zzi);
    String str = zzb;
    if (str != null) {
      localJSONObject.put("idToken", str);
    }
    str = zzg;
    if (str != null) {
      localJSONObject.put("postBody", str);
    }
    str = zzn;
    if (str != null) {
      localJSONObject.put("tenantId", str);
    }
    str = zzp;
    if (str != null) {
      localJSONObject.put("pendingToken", str);
    }
    if (!TextUtils.isEmpty(zzl)) {
      localJSONObject.put("sessionId", zzl);
    }
    if (!TextUtils.isEmpty(zzm)) {
      str = zzm;
    }
    do
    {
      localJSONObject.put("requestUri", str);
      break;
      str = zza;
    } while (str != null);
    localJSONObject.put("returnIdpCredential", zzo);
    return localJSONObject.toString();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaic zzb(String paramString)
  {
    zzn = paramString;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaic zzb(boolean paramBoolean)
  {
    zzo = true;
    return this;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzaic zzc(boolean paramBoolean)
  {
    zzi = true;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaic
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */