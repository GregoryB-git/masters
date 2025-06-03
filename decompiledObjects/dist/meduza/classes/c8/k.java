package c8;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import b.z;
import n6.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class k
  implements c
{
  public static final Parcelable.Creator<k> CREATOR = new j();
  public long a;
  public long b;
  
  public k(long paramLong1, long paramLong2)
  {
    a = paramLong1;
    b = paramLong2;
  }
  
  public static k a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {
      return null;
    }
    try
    {
      paramJSONObject = new k(paramJSONObject.getLong("lastSignInTimestamp"), paramJSONObject.getLong("creationTimestamp"));
      return paramJSONObject;
    }
    catch (JSONException paramJSONObject) {}
    return null;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = z.J(20293, paramParcel);
    z.C(paramParcel, 1, a);
    z.C(paramParcel, 2, b);
    z.L(paramInt, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c8.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */