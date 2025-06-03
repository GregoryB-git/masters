package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import b.z;
import com.google.android.gms.internal.firebase_auth_api.zzzp;
import m6.j;
import org.json.JSONException;
import org.json.JSONObject;

public final class h0
  extends x
{
  public static final Parcelable.Creator<h0> CREATOR = new w0();
  public final String a;
  public final String b;
  public final long c;
  public final String d;
  
  public h0(long paramLong, String paramString1, String paramString2, String paramString3)
  {
    j.e(paramString1);
    a = paramString1;
    b = paramString2;
    c = paramLong;
    j.e(paramString3);
    d = paramString3;
  }
  
  public static h0 G(JSONObject paramJSONObject)
  {
    if (paramJSONObject.has("enrollmentTimestamp"))
    {
      String str1 = paramJSONObject.optString("uid");
      String str2 = paramJSONObject.optString("displayName");
      return new h0(paramJSONObject.optLong("enrollmentTimestamp"), str1, str2, paramJSONObject.optString("phoneNumber"));
    }
    throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
  }
  
  public final long D()
  {
    return c;
  }
  
  public final String E()
  {
    return "phone";
  }
  
  public final JSONObject F()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.putOpt("factorIdKey", "phone");
      localJSONObject.putOpt("uid", a);
      localJSONObject.putOpt("displayName", b);
      localJSONObject.putOpt("enrollmentTimestamp", Long.valueOf(c));
      localJSONObject.putOpt("phoneNumber", d);
      return localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
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
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.C(paramParcel, 3, c);
    z.F(paramParcel, 4, d, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */