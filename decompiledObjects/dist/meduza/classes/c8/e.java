package c8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import b.z;
import b8.o0;
import com.google.android.gms.internal.firebase_auth_api.zzzp;
import m6.j;
import n6.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
  extends a
  implements o0
{
  public static final Parcelable.Creator<e> CREATOR = new d();
  public String a;
  public String b;
  public String c;
  public String d;
  public Uri e;
  public String f;
  public String o;
  public boolean p;
  public String q;
  
  public e(com.google.android.gms.internal.firebase-auth-api.zzagl paramzzagl)
  {
    j.i(paramzzagl);
    j.e("firebase");
    Object localObject = paramzzagl.zzi();
    j.e((String)localObject);
    a = ((String)localObject);
    b = "firebase";
    f = paramzzagl.zzh();
    c = paramzzagl.zzg();
    localObject = paramzzagl.zzc();
    if (localObject != null)
    {
      d = ((Uri)localObject).toString();
      e = ((Uri)localObject);
    }
    p = paramzzagl.zzm();
    q = null;
    o = paramzzagl.zzj();
  }
  
  public e(com.google.android.gms.internal.firebase-auth-api.zzahc paramzzahc)
  {
    j.i(paramzzahc);
    a = paramzzahc.zzd();
    Object localObject = paramzzahc.zzf();
    j.e((String)localObject);
    b = ((String)localObject);
    c = paramzzahc.zzb();
    localObject = paramzzahc.zza();
    if (localObject != null)
    {
      d = ((Uri)localObject).toString();
      e = ((Uri)localObject);
    }
    f = paramzzahc.zzc();
    o = paramzzahc.zze();
    p = false;
    q = paramzzahc.zzg();
  }
  
  public e(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean, String paramString7)
  {
    a = paramString1;
    b = paramString2;
    f = paramString3;
    o = paramString4;
    c = paramString5;
    d = paramString6;
    if (!TextUtils.isEmpty(paramString6)) {
      e = Uri.parse(d);
    }
    p = paramBoolean;
    q = paramString7;
  }
  
  public static e D(String paramString)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>(paramString);
      paramString = new e(localJSONObject.optString("userId"), localJSONObject.optString("providerId"), localJSONObject.optString("email"), localJSONObject.optString("phoneNumber"), localJSONObject.optString("displayName"), localJSONObject.optString("photoUrl"), localJSONObject.optBoolean("isEmailVerified"), localJSONObject.optString("rawUserInfo"));
      return paramString;
    }
    catch (JSONException paramString)
    {
      Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
      throw new zzzp(paramString);
    }
  }
  
  public final String A()
  {
    return f;
  }
  
  public final String E()
  {
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).putOpt("userId", a);
      ((JSONObject)localObject).putOpt("providerId", b);
      ((JSONObject)localObject).putOpt("displayName", c);
      ((JSONObject)localObject).putOpt("photoUrl", d);
      ((JSONObject)localObject).putOpt("email", f);
      ((JSONObject)localObject).putOpt("phoneNumber", o);
      ((JSONObject)localObject).putOpt("isEmailVerified", Boolean.valueOf(p));
      ((JSONObject)localObject).putOpt("rawUserInfo", q);
      localObject = ((JSONObject)localObject).toString();
      return (String)localObject;
    }
    catch (JSONException localJSONException)
    {
      Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
      throw new zzzp(localJSONException);
    }
  }
  
  public final String a()
  {
    return a;
  }
  
  public final Uri h()
  {
    if ((!TextUtils.isEmpty(d)) && (e == null)) {
      e = Uri.parse(d);
    }
    return e;
  }
  
  public final boolean k()
  {
    return p;
  }
  
  public final String m()
  {
    return o;
  }
  
  public final String o()
  {
    return c;
  }
  
  public final String q()
  {
    return b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.F(paramParcel, 4, d, false);
    z.F(paramParcel, 5, f, false);
    z.F(paramParcel, 6, o, false);
    z.t(paramParcel, 7, p);
    z.F(paramParcel, 8, q, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c8.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */