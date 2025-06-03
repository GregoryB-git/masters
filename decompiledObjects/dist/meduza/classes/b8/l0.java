package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import b.z;
import com.google.android.gms.internal.firebase_auth_api.zzzp;
import m6.j;
import org.json.JSONException;
import org.json.JSONObject;

public final class l0
  extends x
{
  public static final Parcelable.Creator<l0> CREATOR = new y0();
  public final String a;
  public final String b;
  public final long c;
  public final com.google.android.gms.internal.firebase-auth-api.zzaia d;
  
  public l0(String paramString1, String paramString2, long paramLong, com.google.android.gms.internal.firebase-auth-api.zzaia paramzzaia)
  {
    j.e(paramString1);
    a = paramString1;
    b = paramString2;
    c = paramLong;
    if (paramzzaia != null)
    {
      d = paramzzaia;
      return;
    }
    throw new NullPointerException("totpInfo cannot be null.");
  }
  
  public static l0 G(JSONObject paramJSONObject)
  {
    if (paramJSONObject.has("enrollmentTimestamp"))
    {
      long l = paramJSONObject.optLong("enrollmentTimestamp");
      if (paramJSONObject.opt("totpInfo") != null)
      {
        com.google.android.gms.internal.firebase_auth_api.zzaia localzzaia = new com.google.android.gms.internal.firebase_auth_api.zzaia();
        return new l0(paramJSONObject.optString("uid"), paramJSONObject.optString("displayName"), l, localzzaia);
      }
      throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
    }
    throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
  }
  
  public final long D()
  {
    return c;
  }
  
  public final String E()
  {
    return "totp";
  }
  
  public final JSONObject F()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.putOpt("factorIdKey", "totp");
      localJSONObject.putOpt("uid", a);
      localJSONObject.putOpt("displayName", b);
      localJSONObject.putOpt("enrollmentTimestamp", Long.valueOf(c));
      localJSONObject.putOpt("totpInfo", d);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
      throw new zzzp(localJSONException);
    }
  }
  
  public final String a()
  {
    return a;
  }
  
  public final String o()
  {
    return b;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.C(paramParcel, 3, c);
    z.E(paramParcel, 4, d, paramInt, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */