package c7;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import b.z;
import m6.j;
import n6.a;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public final class e
  extends a
{
  public static final Parcelable.Creator<e> CREATOR = new l();
  public final b a;
  public final String b;
  public String c;
  
  public e(b paramb, String paramString1, String paramString2)
  {
    j.i(paramb);
    a = paramb;
    c = paramString1;
    b = paramString2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    String str = c;
    if (str == null)
    {
      if (c != null) {
        return false;
      }
    }
    else if (!str.equals(c)) {
      return false;
    }
    if (!a.equals(a)) {
      return false;
    }
    str = b;
    paramObject = b;
    if (str == null)
    {
      if (paramObject != null) {
        return false;
      }
    }
    else if (!str.equals(paramObject)) {
      return false;
    }
    return true;
  }
  
  public final int hashCode()
  {
    String str = c;
    int i = 0;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    int k = a.hashCode();
    str = b;
    if (str != null) {
      i = str.hashCode();
    }
    return (k + (j + 31) * 31) * 31 + i;
  }
  
  public final String toString()
  {
    try
    {
      Object localObject1 = new org/json/JSONObject;
      ((JSONObject)localObject1).<init>();
      ((JSONObject)localObject1).put("keyHandle", Base64.encodeToString(a.b, 11));
      Object localObject2 = a.c;
      if (localObject2 != c.b) {
        ((JSONObject)localObject1).put("version", a);
      }
      localObject2 = a.d;
      if (localObject2 != null) {
        ((JSONObject)localObject1).put("transports", localObject2.toString());
      }
      localObject2 = c;
      if (localObject2 != null) {
        ((JSONObject)localObject1).put("challenge", localObject2);
      }
      localObject2 = b;
      if (localObject2 != null) {
        ((JSONObject)localObject1).put("appId", localObject2);
      }
      localObject1 = ((JSONObject)localObject1).toString();
      return (String)localObject1;
    }
    catch (JSONException localJSONException)
    {
      throw new RuntimeException(localJSONException);
    }
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = z.J(20293, paramParcel);
    z.E(paramParcel, 2, a, paramInt, false);
    z.F(paramParcel, 3, c, false);
    z.F(paramParcel, 4, b, false);
    z.L(i, paramParcel);
  }
}

/* Location:
 * Qualified Name:     c7.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */