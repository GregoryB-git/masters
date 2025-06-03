package b8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import com.google.android.gms.internal.firebase_auth_api.zzaj;
import java.util.ArrayList;
import n6.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class t0
  extends a
{
  public static final Parcelable.Creator<t0> CREATOR = new u0();
  public final String a;
  public final String b;
  public final String c;
  
  public t0(String paramString1, String paramString2, String paramString3)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
  }
  
  public static final t0 D(JSONObject paramJSONObject)
  {
    return new t0(paramJSONObject.getString("credentialId"), paramJSONObject.getString("name"), paramJSONObject.getString("displayName"));
  }
  
  public static zzaj<t0> E(JSONArray paramJSONArray)
  {
    if ((paramJSONArray != null) && (paramJSONArray.length() != 0))
    {
      com.google.android.gms.internal.firebase-auth-api.zzam localzzam = zzaj.zzg();
      for (int i = 0; i < paramJSONArray.length(); i++)
      {
        JSONObject localJSONObject = paramJSONArray.getJSONObject(i);
        localzzam.zza(new t0(localJSONObject.getString("credentialId"), localJSONObject.getString("name"), localJSONObject.getString("displayName")));
      }
      return localzzam.zza();
    }
    return zzaj.zza(new ArrayList());
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.F(paramParcel, 1, a, false);
    z.F(paramParcel, 2, b, false);
    z.F(paramParcel, 3, c, false);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     b8.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */