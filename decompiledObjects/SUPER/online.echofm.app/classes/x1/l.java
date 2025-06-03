package x1;

import O1.Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

public final class l
  implements Parcelable
{
  @NotNull
  public static final Parcelable.Creator<l> CREATOR = new a();
  public static final b r = new b(null);
  public final String o;
  public final String p;
  public final String q;
  
  public l(Parcel paramParcel)
  {
    o = Q.k(paramParcel.readString(), "alg");
    p = Q.k(paramParcel.readString(), "typ");
    q = Q.k(paramParcel.readString(), "kid");
  }
  
  public l(String paramString)
  {
    if (b(paramString))
    {
      paramString = Base64.decode(paramString, 0);
      Intrinsics.checkNotNullExpressionValue(paramString, "decodedBytes");
      paramString = new JSONObject(new String(paramString, b.b));
      String str = paramString.getString("alg");
      Intrinsics.checkNotNullExpressionValue(str, "jsonObj.getString(\"alg\")");
      o = str;
      str = paramString.getString("typ");
      Intrinsics.checkNotNullExpressionValue(str, "jsonObj.getString(\"typ\")");
      p = str;
      paramString = paramString.getString("kid");
      Intrinsics.checkNotNullExpressionValue(paramString, "jsonObj.getString(\"kid\")");
      q = paramString;
      return;
    }
    throw new IllegalArgumentException("Invalid Header".toString());
  }
  
  public final String a()
  {
    return q;
  }
  
  public final boolean b(String paramString)
  {
    Q.g(paramString, "encodedHeaderString");
    bool1 = false;
    paramString = Base64.decode(paramString, 0);
    Intrinsics.checkNotNullExpressionValue(paramString, "decodedBytes");
    String str = new String(paramString, b.b);
    try
    {
      paramString = new org/json/JSONObject;
      paramString.<init>(str);
      str = paramString.optString("alg");
      Intrinsics.checkNotNullExpressionValue(str, "alg");
      int i;
      if ((str.length() > 0) && (Intrinsics.a(str, "RS256"))) {
        i = 1;
      } else {
        i = 0;
      }
      str = paramString.optString("kid");
      Intrinsics.checkNotNullExpressionValue(str, "jsonObj.optString(\"kid\")");
      int j;
      if (str.length() > 0) {
        j = 1;
      } else {
        j = 0;
      }
      paramString = paramString.optString("typ");
      Intrinsics.checkNotNullExpressionValue(paramString, "jsonObj.optString(\"typ\")");
      int k = paramString.length();
      if (k > 0) {
        k = 1;
      } else {
        k = 0;
      }
      bool2 = bool1;
      if (i != 0)
      {
        bool2 = bool1;
        if (j != 0)
        {
          bool2 = bool1;
          if (k != 0) {
            bool2 = true;
          }
        }
      }
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        boolean bool2 = bool1;
      }
    }
    return bool2;
  }
  
  public final JSONObject c()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("alg", o);
    localJSONObject.put("typ", p);
    localJSONObject.put("kid", q);
    return localJSONObject;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof l)) {
      return false;
    }
    String str = o;
    paramObject = (l)paramObject;
    if ((!Intrinsics.a(str, o)) || (!Intrinsics.a(p, p)) || (!Intrinsics.a(q, q))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return ((527 + o.hashCode()) * 31 + p.hashCode()) * 31 + q.hashCode();
  }
  
  public String toString()
  {
    String str = c().toString();
    Intrinsics.checkNotNullExpressionValue(str, "headerJsonObject.toString()");
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramParcel, "dest");
    paramParcel.writeString(o);
    paramParcel.writeString(p);
    paramParcel.writeString(q);
  }
  
  public static final class a
    implements Parcelable.Creator
  {
    public l a(Parcel paramParcel)
    {
      Intrinsics.checkNotNullParameter(paramParcel, "source");
      return new l(paramParcel);
    }
    
    public l[] b(int paramInt)
    {
      return new l[paramInt];
    }
  }
  
  public static final class b {}
}

/* Location:
 * Qualified Name:     x1.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */